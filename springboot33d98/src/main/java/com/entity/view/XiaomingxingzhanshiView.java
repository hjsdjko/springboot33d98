package com.entity.view;

import com.entity.XiaomingxingzhanshiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 小明星展示
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-03-08 19:31:00
 */
@TableName("xiaomingxingzhanshi")
public class XiaomingxingzhanshiView  extends XiaomingxingzhanshiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XiaomingxingzhanshiView(){
	}
 
 	public XiaomingxingzhanshiView(XiaomingxingzhanshiEntity xiaomingxingzhanshiEntity){
 	try {
			BeanUtils.copyProperties(this, xiaomingxingzhanshiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
