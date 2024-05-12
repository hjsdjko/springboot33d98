package com.entity.view;

import com.entity.XiaoxihuifuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 消息回复
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-03-08 19:31:00
 */
@TableName("xiaoxihuifu")
public class XiaoxihuifuView  extends XiaoxihuifuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XiaoxihuifuView(){
	}
 
 	public XiaoxihuifuView(XiaoxihuifuEntity xiaoxihuifuEntity){
 	try {
			BeanUtils.copyProperties(this, xiaoxihuifuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
