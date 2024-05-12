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


import com.dao.TonggaozhuangtaiDao;
import com.entity.TonggaozhuangtaiEntity;
import com.service.TonggaozhuangtaiService;
import com.entity.vo.TonggaozhuangtaiVO;
import com.entity.view.TonggaozhuangtaiView;

@Service("tonggaozhuangtaiService")
public class TonggaozhuangtaiServiceImpl extends ServiceImpl<TonggaozhuangtaiDao, TonggaozhuangtaiEntity> implements TonggaozhuangtaiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TonggaozhuangtaiEntity> page = this.selectPage(
                new Query<TonggaozhuangtaiEntity>(params).getPage(),
                new EntityWrapper<TonggaozhuangtaiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TonggaozhuangtaiEntity> wrapper) {
		  Page<TonggaozhuangtaiView> page =new Query<TonggaozhuangtaiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TonggaozhuangtaiVO> selectListVO(Wrapper<TonggaozhuangtaiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TonggaozhuangtaiVO selectVO(Wrapper<TonggaozhuangtaiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TonggaozhuangtaiView> selectListView(Wrapper<TonggaozhuangtaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TonggaozhuangtaiView selectView(Wrapper<TonggaozhuangtaiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
