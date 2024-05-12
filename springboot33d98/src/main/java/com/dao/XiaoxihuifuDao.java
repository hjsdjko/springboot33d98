package com.dao;

import com.entity.XiaoxihuifuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiaoxihuifuVO;
import com.entity.view.XiaoxihuifuView;


/**
 * 消息回复
 * 
 * @author 
 * @email 
 * @date 2023-03-08 19:31:00
 */
public interface XiaoxihuifuDao extends BaseMapper<XiaoxihuifuEntity> {
	
	List<XiaoxihuifuVO> selectListVO(@Param("ew") Wrapper<XiaoxihuifuEntity> wrapper);
	
	XiaoxihuifuVO selectVO(@Param("ew") Wrapper<XiaoxihuifuEntity> wrapper);
	
	List<XiaoxihuifuView> selectListView(@Param("ew") Wrapper<XiaoxihuifuEntity> wrapper);

	List<XiaoxihuifuView> selectListView(Pagination page,@Param("ew") Wrapper<XiaoxihuifuEntity> wrapper);
	
	XiaoxihuifuView selectView(@Param("ew") Wrapper<XiaoxihuifuEntity> wrapper);
	

}
