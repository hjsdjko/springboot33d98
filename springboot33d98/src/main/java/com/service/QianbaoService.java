package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QianbaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QianbaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QianbaoView;


/**
 * 钱包
 *
 * @author 
 * @email 
 * @date 2023-03-08 19:31:00
 */
public interface QianbaoService extends IService<QianbaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QianbaoVO> selectListVO(Wrapper<QianbaoEntity> wrapper);
   	
   	QianbaoVO selectVO(@Param("ew") Wrapper<QianbaoEntity> wrapper);
   	
   	List<QianbaoView> selectListView(Wrapper<QianbaoEntity> wrapper);
   	
   	QianbaoView selectView(@Param("ew") Wrapper<QianbaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QianbaoEntity> wrapper);
   	

}

