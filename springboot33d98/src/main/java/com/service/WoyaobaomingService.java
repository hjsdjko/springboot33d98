package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WoyaobaomingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WoyaobaomingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WoyaobaomingView;


/**
 * 我要报名
 *
 * @author 
 * @email 
 * @date 2023-03-08 19:31:00
 */
public interface WoyaobaomingService extends IService<WoyaobaomingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WoyaobaomingVO> selectListVO(Wrapper<WoyaobaomingEntity> wrapper);
   	
   	WoyaobaomingVO selectVO(@Param("ew") Wrapper<WoyaobaomingEntity> wrapper);
   	
   	List<WoyaobaomingView> selectListView(Wrapper<WoyaobaomingEntity> wrapper);
   	
   	WoyaobaomingView selectView(@Param("ew") Wrapper<WoyaobaomingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WoyaobaomingEntity> wrapper);
   	

}

