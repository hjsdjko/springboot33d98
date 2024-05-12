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


import com.dao.BaomingzhuangtaiDao;
import com.entity.BaomingzhuangtaiEntity;
import com.service.BaomingzhuangtaiService;
import com.entity.vo.BaomingzhuangtaiVO;
import com.entity.view.BaomingzhuangtaiView;

@Service("baomingzhuangtaiService")
public class BaomingzhuangtaiServiceImpl extends ServiceImpl<BaomingzhuangtaiDao, BaomingzhuangtaiEntity> implements BaomingzhuangtaiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BaomingzhuangtaiEntity> page = this.selectPage(
                new Query<BaomingzhuangtaiEntity>(params).getPage(),
                new EntityWrapper<BaomingzhuangtaiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BaomingzhuangtaiEntity> wrapper) {
		  Page<BaomingzhuangtaiView> page =new Query<BaomingzhuangtaiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BaomingzhuangtaiVO> selectListVO(Wrapper<BaomingzhuangtaiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BaomingzhuangtaiVO selectVO(Wrapper<BaomingzhuangtaiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BaomingzhuangtaiView> selectListView(Wrapper<BaomingzhuangtaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BaomingzhuangtaiView selectView(Wrapper<BaomingzhuangtaiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
