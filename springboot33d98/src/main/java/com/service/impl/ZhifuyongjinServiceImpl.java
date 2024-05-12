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


import com.dao.ZhifuyongjinDao;
import com.entity.ZhifuyongjinEntity;
import com.service.ZhifuyongjinService;
import com.entity.vo.ZhifuyongjinVO;
import com.entity.view.ZhifuyongjinView;

@Service("zhifuyongjinService")
public class ZhifuyongjinServiceImpl extends ServiceImpl<ZhifuyongjinDao, ZhifuyongjinEntity> implements ZhifuyongjinService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhifuyongjinEntity> page = this.selectPage(
                new Query<ZhifuyongjinEntity>(params).getPage(),
                new EntityWrapper<ZhifuyongjinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhifuyongjinEntity> wrapper) {
		  Page<ZhifuyongjinView> page =new Query<ZhifuyongjinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhifuyongjinVO> selectListVO(Wrapper<ZhifuyongjinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhifuyongjinVO selectVO(Wrapper<ZhifuyongjinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhifuyongjinView> selectListView(Wrapper<ZhifuyongjinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhifuyongjinView selectView(Wrapper<ZhifuyongjinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
