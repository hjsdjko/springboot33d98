package com.entity.view;

import com.entity.ZhifuyongjinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 支付佣金
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-03-08 19:31:00
 */
@TableName("zhifuyongjin")
public class ZhifuyongjinView  extends ZhifuyongjinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZhifuyongjinView(){
	}
 
 	public ZhifuyongjinView(ZhifuyongjinEntity zhifuyongjinEntity){
 	try {
			BeanUtils.copyProperties(this, zhifuyongjinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
