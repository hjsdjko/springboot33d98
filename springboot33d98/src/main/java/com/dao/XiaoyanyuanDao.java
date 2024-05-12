package com.dao;

import com.entity.XiaoyanyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiaoyanyuanVO;
import com.entity.view.XiaoyanyuanView;


/**
 * 小演员
 * 
 * @author 
 * @email 
 * @date 2023-03-08 19:31:00
 */
public interface XiaoyanyuanDao extends BaseMapper<XiaoyanyuanEntity> {
	
	List<XiaoyanyuanVO> selectListVO(@Param("ew") Wrapper<XiaoyanyuanEntity> wrapper);
	
	XiaoyanyuanVO selectVO(@Param("ew") Wrapper<XiaoyanyuanEntity> wrapper);
	
	List<XiaoyanyuanView> selectListView(@Param("ew") Wrapper<XiaoyanyuanEntity> wrapper);

	List<XiaoyanyuanView> selectListView(Pagination page,@Param("ew") Wrapper<XiaoyanyuanEntity> wrapper);
	
	XiaoyanyuanView selectView(@Param("ew") Wrapper<XiaoyanyuanEntity> wrapper);
	

}
