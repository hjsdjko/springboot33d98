package com.entity.vo;

import com.entity.ShangjiaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 商家
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-03-08 19:31:00
 */
public class ShangjiaVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 商家昵称
	 */
	
	private String shangjianicheng;
		
	/**
	 * 密码
	 */
	
	private String mima;
		
	/**
	 * 商家姓名
	 */
	
	private String shangjiaxingming;
		
	/**
	 * 商家简介
	 */
	
	private String shangjiajianjie;
		
	/**
	 * 联系方式
	 */
	
	private String lianxifangshi;
		
	/**
	 * 商家照片
	 */
	
	private String shangjiazhaopian;
				
	
	/**
	 * 设置：商家昵称
	 */
	 
	public void setShangjianicheng(String shangjianicheng) {
		this.shangjianicheng = shangjianicheng;
	}
	
	/**
	 * 获取：商家昵称
	 */
	public String getShangjianicheng() {
		return shangjianicheng;
	}
				
	
	/**
	 * 设置：密码
	 */
	 
	public void setMima(String mima) {
		this.mima = mima;
	}
	
	/**
	 * 获取：密码
	 */
	public String getMima() {
		return mima;
	}
				
	
	/**
	 * 设置：商家姓名
	 */
	 
	public void setShangjiaxingming(String shangjiaxingming) {
		this.shangjiaxingming = shangjiaxingming;
	}
	
	/**
	 * 获取：商家姓名
	 */
	public String getShangjiaxingming() {
		return shangjiaxingming;
	}
				
	
	/**
	 * 设置：商家简介
	 */
	 
	public void setShangjiajianjie(String shangjiajianjie) {
		this.shangjiajianjie = shangjiajianjie;
	}
	
	/**
	 * 获取：商家简介
	 */
	public String getShangjiajianjie() {
		return shangjiajianjie;
	}
				
	
	/**
	 * 设置：联系方式
	 */
	 
	public void setLianxifangshi(String lianxifangshi) {
		this.lianxifangshi = lianxifangshi;
	}
	
	/**
	 * 获取：联系方式
	 */
	public String getLianxifangshi() {
		return lianxifangshi;
	}
				
	
	/**
	 * 设置：商家照片
	 */
	 
	public void setShangjiazhaopian(String shangjiazhaopian) {
		this.shangjiazhaopian = shangjiazhaopian;
	}
	
	/**
	 * 获取：商家照片
	 */
	public String getShangjiazhaopian() {
		return shangjiazhaopian;
	}
			
}
