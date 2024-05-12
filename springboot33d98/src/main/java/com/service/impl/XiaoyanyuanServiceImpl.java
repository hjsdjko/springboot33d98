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


import com.dao.XiaoyanyuanDao;
import com.entity.XiaoyanyuanEntity;
import com.service.XiaoyanyuanService;
import com.entity.vo.XiaoyanyuanVO;
import com.entity.view.XiaoyanyuanView;

@Service("xiaoyanyuanService")
public class XiaoyanyuanServiceImpl extends ServiceImpl<XiaoyanyuanDao, XiaoyanyuanEntity> implements XiaoyanyuanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiaoyanyuanEntity> page = this.selectPage(
                new Query<XiaoyanyuanEntity>(params).getPage(),
                new EntityWrapper<XiaoyanyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiaoyanyuanEntity> wrapper) {
		  Page<XiaoyanyuanView> page =new Query<XiaoyanyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XiaoyanyuanVO> selectListVO(Wrapper<XiaoyanyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XiaoyanyuanVO selectVO(Wrapper<XiaoyanyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XiaoyanyuanView> selectListView(Wrapper<XiaoyanyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiaoyanyuanView selectView(Wrapper<XiaoyanyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
