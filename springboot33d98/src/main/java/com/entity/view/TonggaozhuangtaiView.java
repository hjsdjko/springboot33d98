package com.entity.view;

import com.entity.TonggaozhuangtaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 通告状态
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-03-08 19:31:00
 */
@TableName("tonggaozhuangtai")
public class TonggaozhuangtaiView  extends TonggaozhuangtaiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public TonggaozhuangtaiView(){
	}
 
 	public TonggaozhuangtaiView(TonggaozhuangtaiEntity tonggaozhuangtaiEntity){
 	try {
			BeanUtils.copyProperties(this, tonggaozhuangtaiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
