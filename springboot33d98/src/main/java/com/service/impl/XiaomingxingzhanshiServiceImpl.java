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


import com.dao.XiaomingxingzhanshiDao;
import com.entity.XiaomingxingzhanshiEntity;
import com.service.XiaomingxingzhanshiService;
import com.entity.vo.XiaomingxingzhanshiVO;
import com.entity.view.XiaomingxingzhanshiView;

@Service("xiaomingxingzhanshiService")
public class XiaomingxingzhanshiServiceImpl extends ServiceImpl<XiaomingxingzhanshiDao, XiaomingxingzhanshiEntity> implements XiaomingxingzhanshiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiaomingxingzhanshiEntity> page = this.selectPage(
                new Query<XiaomingxingzhanshiEntity>(params).getPage(),
                new EntityWrapper<XiaomingxingzhanshiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiaomingxingzhanshiEntity> wrapper) {
		  Page<XiaomingxingzhanshiView> page =new Query<XiaomingxingzhanshiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XiaomingxingzhanshiVO> selectListVO(Wrapper<XiaomingxingzhanshiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XiaomingxingzhanshiVO selectVO(Wrapper<XiaomingxingzhanshiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XiaomingxingzhanshiView> selectListView(Wrapper<XiaomingxingzhanshiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiaomingxingzhanshiView selectView(Wrapper<XiaomingxingzhanshiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
