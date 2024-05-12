package com.entity.view;

import com.entity.WoyaobaomingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 我要报名
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-03-08 19:31:00
 */
@TableName("woyaobaoming")
public class WoyaobaomingView  extends WoyaobaomingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WoyaobaomingView(){
	}
 
 	public WoyaobaomingView(WoyaobaomingEntity woyaobaomingEntity){
 	try {
			BeanUtils.copyProperties(this, woyaobaomingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
