package com.dao;

import com.entity.BaomingzhuangtaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BaomingzhuangtaiVO;
import com.entity.view.BaomingzhuangtaiView;


/**
 * 报名状态
 * 
 * @author 
 * @email 
 * @date 2023-03-08 19:31:00
 */
public interface BaomingzhuangtaiDao extends BaseMapper<BaomingzhuangtaiEntity> {
	
	List<BaomingzhuangtaiVO> selectListVO(@Param("ew") Wrapper<BaomingzhuangtaiEntity> wrapper);
	
	BaomingzhuangtaiVO selectVO(@Param("ew") Wrapper<BaomingzhuangtaiEntity> wrapper);
	
	List<BaomingzhuangtaiView> selectListView(@Param("ew") Wrapper<BaomingzhuangtaiEntity> wrapper);

	List<BaomingzhuangtaiView> selectListView(Pagination page,@Param("ew") Wrapper<BaomingzhuangtaiEntity> wrapper);
	
	BaomingzhuangtaiView selectView(@Param("ew") Wrapper<BaomingzhuangtaiEntity> wrapper);
	

}
