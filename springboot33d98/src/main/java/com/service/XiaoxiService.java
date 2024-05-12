package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiaoxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiaoxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiaoxiView;


/**
 * 消息
 *
 * @author 
 * @email 
 * @date 2023-03-08 19:31:00
 */
public interface XiaoxiService extends IService<XiaoxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiaoxiVO> selectListVO(Wrapper<XiaoxiEntity> wrapper);
   	
   	XiaoxiVO selectVO(@Param("ew") Wrapper<XiaoxiEntity> wrapper);
   	
   	List<XiaoxiView> selectListView(Wrapper<XiaoxiEntity> wrapper);
   	
   	XiaoxiView selectView(@Param("ew") Wrapper<XiaoxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiaoxiEntity> wrapper);
   	

}

