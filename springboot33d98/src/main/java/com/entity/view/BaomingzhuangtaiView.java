package com.entity.view;

import com.entity.BaomingzhuangtaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 报名状态
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-03-08 19:31:00
 */
@TableName("baomingzhuangtai")
public class BaomingzhuangtaiView  extends BaomingzhuangtaiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public BaomingzhuangtaiView(){
	}
 
 	public BaomingzhuangtaiView(BaomingzhuangtaiEntity baomingzhuangtaiEntity){
 	try {
			BeanUtils.copyProperties(this, baomingzhuangtaiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
