package com.entity.view;

import com.entity.XiaoyanyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 小演员
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-03-08 19:31:00
 */
@TableName("xiaoyanyuan")
public class XiaoyanyuanView  extends XiaoyanyuanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XiaoyanyuanView(){
	}
 
 	public XiaoyanyuanView(XiaoyanyuanEntity xiaoyanyuanEntity){
 	try {
			BeanUtils.copyProperties(this, xiaoyanyuanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
