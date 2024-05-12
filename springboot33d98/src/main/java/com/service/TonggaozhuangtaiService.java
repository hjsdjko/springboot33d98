package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TonggaozhuangtaiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TonggaozhuangtaiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TonggaozhuangtaiView;


/**
 * 通告状态
 *
 * @author 
 * @email 
 * @date 2023-03-08 19:31:00
 */
public interface TonggaozhuangtaiService extends IService<TonggaozhuangtaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TonggaozhuangtaiVO> selectListVO(Wrapper<TonggaozhuangtaiEntity> wrapper);
   	
   	TonggaozhuangtaiVO selectVO(@Param("ew") Wrapper<TonggaozhuangtaiEntity> wrapper);
   	
   	List<TonggaozhuangtaiView> selectListView(Wrapper<TonggaozhuangtaiEntity> wrapper);
   	
   	TonggaozhuangtaiView selectView(@Param("ew") Wrapper<TonggaozhuangtaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TonggaozhuangtaiEntity> wrapper);
   	

}

