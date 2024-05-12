package com.dao;

import com.entity.ZhifuyongjinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhifuyongjinVO;
import com.entity.view.ZhifuyongjinView;


/**
 * 支付佣金
 * 
 * @author 
 * @email 
 * @date 2023-03-08 19:31:00
 */
public interface ZhifuyongjinDao extends BaseMapper<ZhifuyongjinEntity> {
	
	List<ZhifuyongjinVO> selectListVO(@Param("ew") Wrapper<ZhifuyongjinEntity> wrapper);
	
	ZhifuyongjinVO selectVO(@Param("ew") Wrapper<ZhifuyongjinEntity> wrapper);
	
	List<ZhifuyongjinView> selectListView(@Param("ew") Wrapper<ZhifuyongjinEntity> wrapper);

	List<ZhifuyongjinView> selectListView(Pagination page,@Param("ew") Wrapper<ZhifuyongjinEntity> wrapper);
	
	ZhifuyongjinView selectView(@Param("ew") Wrapper<ZhifuyongjinEntity> wrapper);
	

}
