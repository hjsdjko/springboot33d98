package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhifuyongjinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhifuyongjinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhifuyongjinView;


/**
 * 支付佣金
 *
 * @author 
 * @email 
 * @date 2023-03-08 19:31:00
 */
public interface ZhifuyongjinService extends IService<ZhifuyongjinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhifuyongjinVO> selectListVO(Wrapper<ZhifuyongjinEntity> wrapper);
   	
   	ZhifuyongjinVO selectVO(@Param("ew") Wrapper<ZhifuyongjinEntity> wrapper);
   	
   	List<ZhifuyongjinView> selectListView(Wrapper<ZhifuyongjinEntity> wrapper);
   	
   	ZhifuyongjinView selectView(@Param("ew") Wrapper<ZhifuyongjinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhifuyongjinEntity> wrapper);
   	

}

