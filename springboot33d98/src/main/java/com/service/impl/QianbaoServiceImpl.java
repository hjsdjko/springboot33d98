package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.QianbaoDao;
import com.entity.QianbaoEntity;
import com.service.QianbaoService;
import com.entity.vo.QianbaoVO;
import com.entity.view.QianbaoView;

@Service("qianbaoService")
public class QianbaoServiceImpl extends ServiceImpl<QianbaoDao, QianbaoEntity> implements QianbaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QianbaoEntity> page = this.selectPage(
                new Query<QianbaoEntity>(params).getPage(),
                new EntityWrapper<QianbaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QianbaoEntity> wrapper) {
		  Page<QianbaoView> page =new Query<QianbaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<QianbaoVO> selectListVO(Wrapper<QianbaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QianbaoVO selectVO(Wrapper<QianbaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QianbaoView> selectListView(Wrapper<QianbaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QianbaoView selectView(Wrapper<QianbaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
