package com.dao;

import com.entity.WoyaobaomingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WoyaobaomingVO;
import com.entity.view.WoyaobaomingView;


/**
 * 我要报名
 * 
 * @author 
 * @email 
 * @date 2023-03-08 19:31:00
 */
public interface WoyaobaomingDao extends BaseMapper<WoyaobaomingEntity> {
	
	List<WoyaobaomingVO> selectListVO(@Param("ew") Wrapper<WoyaobaomingEntity> wrapper);
	
	WoyaobaomingVO selectVO(@Param("ew") Wrapper<WoyaobaomingEntity> wrapper);
	
	List<WoyaobaomingView> selectListView(@Param("ew") Wrapper<WoyaobaomingEntity> wrapper);

	List<WoyaobaomingView> selectListView(Pagination page,@Param("ew") Wrapper<WoyaobaomingEntity> wrapper);
	
	WoyaobaomingView selectView(@Param("ew") Wrapper<WoyaobaomingEntity> wrapper);
	

}
