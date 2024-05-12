package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BaomingzhuangtaiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BaomingzhuangtaiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BaomingzhuangtaiView;


/**
 * 报名状态
 *
 * @author 
 * @email 
 * @date 2023-03-08 19:31:00
 */
public interface BaomingzhuangtaiService extends IService<BaomingzhuangtaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BaomingzhuangtaiVO> selectListVO(Wrapper<BaomingzhuangtaiEntity> wrapper);
   	
   	BaomingzhuangtaiVO selectVO(@Param("ew") Wrapper<BaomingzhuangtaiEntity> wrapper);
   	
   	List<BaomingzhuangtaiView> selectListView(Wrapper<BaomingzhuangtaiEntity> wrapper);
   	
   	BaomingzhuangtaiView selectView(@Param("ew") Wrapper<BaomingzhuangtaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BaomingzhuangtaiEntity> wrapper);
   	

}

