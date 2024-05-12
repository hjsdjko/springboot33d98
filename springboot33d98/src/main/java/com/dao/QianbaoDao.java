package com.dao;

import com.entity.QianbaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QianbaoVO;
import com.entity.view.QianbaoView;


/**
 * 钱包
 * 
 * @author 
 * @email 
 * @date 2023-03-08 19:31:00
 */
public interface QianbaoDao extends BaseMapper<QianbaoEntity> {
	
	List<QianbaoVO> selectListVO(@Param("ew") Wrapper<QianbaoEntity> wrapper);
	
	QianbaoVO selectVO(@Param("ew") Wrapper<QianbaoEntity> wrapper);
	
	List<QianbaoView> selectListView(@Param("ew") Wrapper<QianbaoEntity> wrapper);

	List<QianbaoView> selectListView(Pagination page,@Param("ew") Wrapper<QianbaoEntity> wrapper);
	
	QianbaoView selectView(@Param("ew") Wrapper<QianbaoEntity> wrapper);
	

}
