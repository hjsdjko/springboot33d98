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


import com.dao.WoyaobaomingDao;
import com.entity.WoyaobaomingEntity;
import com.service.WoyaobaomingService;
import com.entity.vo.WoyaobaomingVO;
import com.entity.view.WoyaobaomingView;

@Service("woyaobaomingService")
public class WoyaobaomingServiceImpl extends ServiceImpl<WoyaobaomingDao, WoyaobaomingEntity> implements WoyaobaomingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WoyaobaomingEntity> page = this.selectPage(
                new Query<WoyaobaomingEntity>(params).getPage(),
                new EntityWrapper<WoyaobaomingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WoyaobaomingEntity> wrapper) {
		  Page<WoyaobaomingView> page =new Query<WoyaobaomingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WoyaobaomingVO> selectListVO(Wrapper<WoyaobaomingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WoyaobaomingVO selectVO(Wrapper<WoyaobaomingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WoyaobaomingView> selectListView(Wrapper<WoyaobaomingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WoyaobaomingView selectView(Wrapper<WoyaobaomingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
