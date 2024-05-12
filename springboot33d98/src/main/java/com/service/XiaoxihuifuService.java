package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiaoxihuifuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiaoxihuifuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiaoxihuifuView;


/**
 * 消息回复
 *
 * @author 
 * @email 
 * @date 2023-03-08 19:31:00
 */
public interface XiaoxihuifuService extends IService<XiaoxihuifuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiaoxihuifuVO> selectListVO(Wrapper<XiaoxihuifuEntity> wrapper);
   	
   	XiaoxihuifuVO selectVO(@Param("ew") Wrapper<XiaoxihuifuEntity> wrapper);
   	
   	List<XiaoxihuifuView> selectListView(Wrapper<XiaoxihuifuEntity> wrapper);
   	
   	XiaoxihuifuView selectView(@Param("ew") Wrapper<XiaoxihuifuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiaoxihuifuEntity> wrapper);
   	

}

