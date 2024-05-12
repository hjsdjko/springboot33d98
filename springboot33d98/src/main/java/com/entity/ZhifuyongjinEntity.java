package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 支付佣金
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-03-08 19:31:00
 */
@TableName("zhifuyongjin")
public class ZhifuyongjinEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ZhifuyongjinEntity() {
		
	}
	
	public ZhifuyongjinEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 钱包编号
	 */
					
	private String qianbaobianhao;
	
	/**
	 * 演员账号
	 */
					
	private String yanyuanzhanghao;
	
	/**
	 * 昵称
	 */
					
	private String nicheng;
	
	/**
	 * 佣金
	 */
					
	private Integer yongjin;
	
	/**
	 * 备注
	 */
					
	private String beizhu;
	
	/**
	 * 付款时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date fukuanshijian;
	
	/**
	 * 商家账号
	 */
					
	private String shangjiazhanghao;
	
	/**
	 * 商家昵称
	 */
					
	private String shangjianicheng;
	
	/**
	 * 联系方式
	 */
					
	private String lianxifangshi;
	
	/**
	 * 商家照片
	 */
					
	private String shangjiazhaopian;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：钱包编号
	 */
	public void setQianbaobianhao(String qianbaobianhao) {
		this.qianbaobianhao = qianbaobianhao;
	}
	/**
	 * 获取：钱包编号
	 */
	public String getQianbaobianhao() {
		return qianbaobianhao;
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
	 * 设置：备注
	 */
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
	/**
	 * 设置：付款时间
	 */
	public void setFukuanshijian(Date fukuanshijian) {
		this.fukuanshijian = fukuanshijian;
	}
	/**
	 * 获取：付款时间
	 */
	public Date getFukuanshijian() {
		return fukuanshijian;
	}
	/**
	 * 设置：商家账号
	 */
	public void setShangjiazhanghao(String shangjiazhanghao) {
		this.shangjiazhanghao = shangjiazhanghao;
	}
	/**
	 * 获取：商家账号
	 */
	public String getShangjiazhanghao() {
		return shangjiazhanghao;
	}
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
