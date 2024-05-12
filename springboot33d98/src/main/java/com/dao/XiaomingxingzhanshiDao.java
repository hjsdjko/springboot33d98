package com.dao;

import com.entity.XiaomingxingzhanshiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiaomingxingzhanshiVO;
import com.entity.view.XiaomingxingzhanshiView;


/**
 * 小明星展示
 * 
 * @author 
 * @email 
 * @date 2023-03-08 19:31:00
 */
public interface XiaomingxingzhanshiDao extends BaseMapper<XiaomingxingzhanshiEntity> {
	
	List<XiaomingxingzhanshiVO> selectListVO(@Param("ew") Wrapper<XiaomingxingzhanshiEntity> wrapper);
	
	XiaomingxingzhanshiVO selectVO(@Param("ew") Wrapper<XiaomingxingzhanshiEntity> wrapper);
	
	List<XiaomingxingzhanshiView> selectListView(@Param("ew") Wrapper<XiaomingxingzhanshiEntity> wrapper);

	List<XiaomingxingzhanshiView> selectListView(Pagination page,@Param("ew") Wrapper<XiaomingxingzhanshiEntity> wrapper);
	
	XiaomingxingzhanshiView selectView(@Param("ew") Wrapper<XiaomingxingzhanshiEntity> wrapper);
	

}
