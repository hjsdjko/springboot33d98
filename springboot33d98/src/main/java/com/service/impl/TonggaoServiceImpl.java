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


import com.dao.TonggaoDao;
import com.entity.TonggaoEntity;
import com.service.TonggaoService;
import com.entity.vo.TonggaoVO;
import com.entity.view.TonggaoView;

@Service("tonggaoService")
public class TonggaoServiceImpl extends ServiceImpl<TonggaoDao, TonggaoEntity> implements TonggaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TonggaoEntity> page = this.selectPage(
                new Query<TonggaoEntity>(params).getPage(),
                new EntityWrapper<TonggaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TonggaoEntity> wrapper) {
		  Page<TonggaoView> page =new Query<TonggaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TonggaoVO> selectListVO(Wrapper<TonggaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TonggaoVO selectVO(Wrapper<TonggaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TonggaoView> selectListView(Wrapper<TonggaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TonggaoView selectView(Wrapper<TonggaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
