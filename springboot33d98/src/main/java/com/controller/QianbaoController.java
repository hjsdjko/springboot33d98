package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.QianbaoEntity;
import com.entity.view.QianbaoView;

import com.service.QianbaoService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 钱包
 * 后端接口
 * @author 
 * @email 
 * @date 2023-03-08 19:31:00
 */
@RestController
@RequestMapping("/qianbao")
public class QianbaoController {
    @Autowired
    private QianbaoService qianbaoService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,QianbaoEntity qianbao,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xiaoyanyuan")) {
			qianbao.setYanyuanzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<QianbaoEntity> ew = new EntityWrapper<QianbaoEntity>();

		PageUtils page = qianbaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, qianbao), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,QianbaoEntity qianbao, 
		HttpServletRequest request){
        EntityWrapper<QianbaoEntity> ew = new EntityWrapper<QianbaoEntity>();

		PageUtils page = qianbaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, qianbao), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( QianbaoEntity qianbao){
       	EntityWrapper<QianbaoEntity> ew = new EntityWrapper<QianbaoEntity>();
      	ew.allEq(MPUtil.allEQMapPre( qianbao, "qianbao")); 
        return R.ok().put("data", qianbaoService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(QianbaoEntity qianbao){
        EntityWrapper< QianbaoEntity> ew = new EntityWrapper< QianbaoEntity>();
 		ew.allEq(MPUtil.allEQMapPre( qianbao, "qianbao")); 
		QianbaoView qianbaoView =  qianbaoService.selectView(ew);
		return R.ok("查询钱包成功").put("data", qianbaoView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        QianbaoEntity qianbao = qianbaoService.selectById(id);
        return R.ok().put("data", qianbao);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        QianbaoEntity qianbao = qianbaoService.selectById(id);
        return R.ok().put("data", qianbao);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody QianbaoEntity qianbao, HttpServletRequest request){
    	qianbao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(qianbao);
        qianbaoService.insert(qianbao);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody QianbaoEntity qianbao, HttpServletRequest request){
    	qianbao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(qianbao);
        qianbaoService.insert(qianbao);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody QianbaoEntity qianbao, HttpServletRequest request){
        //ValidatorUtils.validateEntity(qianbao);
        qianbaoService.updateById(qianbao);//全部更新
        return R.ok();
    }


    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        qianbaoService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<QianbaoEntity> wrapper = new EntityWrapper<QianbaoEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xiaoyanyuan")) {
			wrapper.eq("yanyuanzhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = qianbaoService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	









}
