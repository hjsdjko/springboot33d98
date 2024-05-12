package com.entity.vo;

import com.entity.QianbaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 钱包
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-03-08 19:31:00
 */
public class QianbaoVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 佣金
	 */
	
	private Integer yongjin;
		
	/**
	 * 演员账号
	 */
	
	private String yanyuanzhanghao;
		
	/**
	 * 昵称
	 */
	
	private String nicheng;
		
	/**
	 * 头像
	 */
	
	private String touxiang;
				
	
	/**
	 * 设置：佣金
	 */
	 
	public void setYongjin(Integer yongjin) {
		this.yongjin = yongjin;
	}
	
	/**
	 * 获取：佣金
	 */
	public Integer getYongjin() {
		return yongjin;
	}
				
	
	/**
	 * 设置：演员账号
	 */
	 
	public void setYanyuanzhanghao(String yanyuanzhanghao) {
		this.yanyuanzhanghao = yanyuanzhanghao;
	}
	
	/**
	 * 获取：演员账号
	 */
	public String getYanyuanzhanghao() {
		return yanyuanzhanghao;
	}
				
	
	/**
	 * 设置：昵称
	 */
	 
	public void setNicheng(String nicheng) {
		this.nicheng = nicheng;
	}
	
	/**
	 * 获取：昵称
	 */
	public String getNicheng() {
		return nicheng;
	}
				
	
	/**
	 * 设置：头像
	 */
	 
	public void setTouxiang(String touxiang) {
		this.touxiang = touxiang;
	}
	
	/**
	 * 获取：头像
	 */
	public String getTouxiang() {
		return touxiang;
	}
			
}
