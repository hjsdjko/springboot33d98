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


import com.dao.XiaoxiDao;
import com.entity.XiaoxiEntity;
import com.service.XiaoxiService;
import com.entity.vo.XiaoxiVO;
import com.entity.view.XiaoxiView;

@Service("xiaoxiService")
public class XiaoxiServiceImpl extends ServiceImpl<XiaoxiDao, XiaoxiEntity> implements XiaoxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiaoxiEntity> page = this.selectPage(
                new Query<XiaoxiEntity>(params).getPage(),
                new EntityWrapper<XiaoxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiaoxiEntity> wrapper) {
		  Page<XiaoxiView> page =new Query<XiaoxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XiaoxiVO> selectListVO(Wrapper<XiaoxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XiaoxiVO selectVO(Wrapper<XiaoxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XiaoxiView> selectListView(Wrapper<XiaoxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiaoxiView selectView(Wrapper<XiaoxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
