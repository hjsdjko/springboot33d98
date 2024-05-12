package com.dao;

import com.entity.TonggaozhuangtaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TonggaozhuangtaiVO;
import com.entity.view.TonggaozhuangtaiView;


/**
 * 通告状态
 * 
 * @author 
 * @email 
 * @date 2023-03-08 19:31:00
 */
public interface TonggaozhuangtaiDao extends BaseMapper<TonggaozhuangtaiEntity> {
	
	List<TonggaozhuangtaiVO> selectListVO(@Param("ew") Wrapper<TonggaozhuangtaiEntity> wrapper);
	
	TonggaozhuangtaiVO selectVO(@Param("ew") Wrapper<TonggaozhuangtaiEntity> wrapper);
	
	List<TonggaozhuangtaiView> selectListView(@Param("ew") Wrapper<TonggaozhuangtaiEntity> wrapper);

	List<TonggaozhuangtaiView> selectListView(Pagination page,@Param("ew") Wrapper<TonggaozhuangtaiEntity> wrapper);
	
	TonggaozhuangtaiView selectView(@Param("ew") Wrapper<TonggaozhuangtaiEntity> wrapper);
	

}
