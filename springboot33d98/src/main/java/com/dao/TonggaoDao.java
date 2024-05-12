package com.dao;

import com.entity.TonggaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TonggaoVO;
import com.entity.view.TonggaoView;


/**
 * 通告
 * 
 * @author 
 * @email 
 * @date 2023-03-08 19:31:00
 */
public interface TonggaoDao extends BaseMapper<TonggaoEntity> {
	
	List<TonggaoVO> selectListVO(@Param("ew") Wrapper<TonggaoEntity> wrapper);
	
	TonggaoVO selectVO(@Param("ew") Wrapper<TonggaoEntity> wrapper);
	
	List<TonggaoView> selectListView(@Param("ew") Wrapper<TonggaoEntity> wrapper);

	List<TonggaoView> selectListView(Pagination page,@Param("ew") Wrapper<TonggaoEntity> wrapper);
	
	TonggaoView selectView(@Param("ew") Wrapper<TonggaoEntity> wrapper);
	

}
