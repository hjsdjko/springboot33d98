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
 * 钱包
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-03-08 19:31:00
 */
@TableName("qianbao")
public class QianbaoEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public QianbaoEntity() {
		
	}
	
	public QianbaoEntity(T t) {
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
