package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiaoyanyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiaoyanyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiaoyanyuanView;


/**
 * 小演员
 *
 * @author 
 * @email 
 * @date 2023-03-08 19:31:00
 */
public interface XiaoyanyuanService extends IService<XiaoyanyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiaoyanyuanVO> selectListVO(Wrapper<XiaoyanyuanEntity> wrapper);
   	
   	XiaoyanyuanVO selectVO(@Param("ew") Wrapper<XiaoyanyuanEntity> wrapper);
   	
   	List<XiaoyanyuanView> selectListView(Wrapper<XiaoyanyuanEntity> wrapper);
   	
   	XiaoyanyuanView selectView(@Param("ew") Wrapper<XiaoyanyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiaoyanyuanEntity> wrapper);
   	

}

