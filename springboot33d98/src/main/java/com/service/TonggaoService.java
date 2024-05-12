package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TonggaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TonggaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TonggaoView;


/**
 * 通告
 *
 * @author 
 * @email 
 * @date 2023-03-08 19:31:00
 */
public interface TonggaoService extends IService<TonggaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TonggaoVO> selectListVO(Wrapper<TonggaoEntity> wrapper);
   	
   	TonggaoVO selectVO(@Param("ew") Wrapper<TonggaoEntity> wrapper);
   	
   	List<TonggaoView> selectListView(Wrapper<TonggaoEntity> wrapper);
   	
   	TonggaoView selectView(@Param("ew") Wrapper<TonggaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TonggaoEntity> wrapper);
   	

}

