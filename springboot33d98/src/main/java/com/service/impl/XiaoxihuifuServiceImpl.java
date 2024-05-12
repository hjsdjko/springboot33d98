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


import com.dao.XiaoxihuifuDao;
import com.entity.XiaoxihuifuEntity;
import com.service.XiaoxihuifuService;
import com.entity.vo.XiaoxihuifuVO;
import com.entity.view.XiaoxihuifuView;

@Service("xiaoxihuifuService")
public class XiaoxihuifuServiceImpl extends ServiceImpl<XiaoxihuifuDao, XiaoxihuifuEntity> implements XiaoxihuifuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiaoxihuifuEntity> page = this.selectPage(
                new Query<XiaoxihuifuEntity>(params).getPage(),
                new EntityWrapper<XiaoxihuifuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiaoxihuifuEntity> wrapper) {
		  Page<XiaoxihuifuView> page =new Query<XiaoxihuifuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XiaoxihuifuVO> selectListVO(Wrapper<XiaoxihuifuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XiaoxihuifuVO selectVO(Wrapper<XiaoxihuifuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XiaoxihuifuView> selectListView(Wrapper<XiaoxihuifuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiaoxihuifuView selectView(Wrapper<XiaoxihuifuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
