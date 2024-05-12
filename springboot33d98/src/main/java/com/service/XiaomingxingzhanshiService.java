package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiaomingxingzhanshiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiaomingxingzhanshiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiaomingxingzhanshiView;


/**
 * 小明星展示
 *
 * @author 
 * @email 
 * @date 2023-03-08 19:31:00
 */
public interface XiaomingxingzhanshiService extends IService<XiaomingxingzhanshiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiaomingxingzhanshiVO> selectListVO(Wrapper<XiaomingxingzhanshiEntity> wrapper);
   	
   	XiaomingxingzhanshiVO selectVO(@Param("ew") Wrapper<XiaomingxingzhanshiEntity> wrapper);
   	
   	List<XiaomingxingzhanshiView> selectListView(Wrapper<XiaomingxingzhanshiEntity> wrapper);
   	
   	XiaomingxingzhanshiView selectView(@Param("ew") Wrapper<XiaomingxingzhanshiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiaomingxingzhanshiEntity> wrapper);
   	

}

