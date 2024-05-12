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
 * 通告
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-03-08 19:31:00
 */
@TableName("tonggao")
public class TonggaoEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public TonggaoEntity() {
		
	}
	
	public TonggaoEntity(T t) {
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
	 * 通告标题
	 */
					
	private String tonggaobiaoti;
	
	/**
	 * 通告类型
	 */
					
	private String tonggaoleixing;
	
	/**
	 * 通告状态
	 */
					
	private String tonggaozhuangtai;
	
	/**
	 * 招募人数
	 */
					
	private String zhaomurenshu;
	
	/**
	 * 截止日期
	 */
					
	private String jiezhiriqi;
	
	/**
	 * 拍摄时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date paisheshijian;
	
	/**
	 * 拍摄地点
	 */
					
	private String paishedidian;
	
	/**
	 * 佣金
	 */
					
	private String yongjin;
	
	/**
	 * 通告内容
	 */
					
	private String tonggaoneirong;
	
	/**
	 * 通告封面
	 */
					
	private String tonggaofengmian;
	
	/**
	 * 发布时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date fabushijian;
	
	/**
	 * 商家账号
	 */
					
	private String shangjiazhanghao;
	
	/**
	 * 商家昵称
	 */
					
	private String shangjianicheng;
	
	/**
	 * 商家姓名
	 */
					
	private String shangjiaxingming;
	
	/**
	 * 联系方式
	 */
					
	private String lianxifangshi;
	
	
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
	 * 设置：通告标题
	 */
	public void setTonggaobiaoti(String tonggaobiaoti) {
		this.tonggaobiaoti = tonggaobiaoti;
	}
	/**
	 * 获取：通告标题
	 */
	public String getTonggaobiaoti() {
		return tonggaobiaoti;
	}
	/**
	 * 设置：通告类型
	 */
	public void setTonggaoleixing(String tonggaoleixing) {
		this.tonggaoleixing = tonggaoleixing;
	}
	/**
	 * 获取：通告类型
	 */
	public String getTonggaoleixing() {
		return tonggaoleixing;
	}
	/**
	 * 设置：通告状态
	 */
	public void setTonggaozhuangtai(String tonggaozhuangtai) {
		this.tonggaozhuangtai = tonggaozhuangtai;
	}
	/**
	 * 获取：通告状态
	 */
	public String getTonggaozhuangtai() {
		return tonggaozhuangtai;
	}
	/**
	 * 设置：招募人数
	 */
	public void setZhaomurenshu(String zhaomurenshu) {
		this.zhaomurenshu = zhaomurenshu;
	}
	/**
	 * 获取：招募人数
	 */
	public String getZhaomurenshu() {
		return zhaomurenshu;
	}
	/**
	 * 设置：截止日期
	 */
	public void setJiezhiriqi(String jiezhiriqi) {
		this.jiezhiriqi = jiezhiriqi;
	}
	/**
	 * 获取：截止日期
	 */
	public String getJiezhiriqi() {
		return jiezhiriqi;
	}
	/**
	 * 设置：拍摄时间
	 */
	public void setPaisheshijian(Date paisheshijian) {
		this.paisheshijian = paisheshijian;
	}
	/**
	 * 获取：拍摄时间
	 */
	public Date getPaisheshijian() {
		return paisheshijian;
	}
	/**
	 * 设置：拍摄地点
	 */
	public void setPaishedidian(String paishedidian) {
		this.paishedidian = paishedidian;
	}
	/**
	 * 获取：拍摄地点
	 */
	public String getPaishedidian() {
		return paishedidian;
	}
	/**
	 * 设置：佣金
	 */
	public void setYongjin(String yongjin) {
		this.yongjin = yongjin;
	}
	/**
	 * 获取：佣金
	 */
	public String getYongjin() {
		return yongjin;
	}
	/**
	 * 设置：通告内容
	 */
	public void setTonggaoneirong(String tonggaoneirong) {
		this.tonggaoneirong = tonggaoneirong;
	}
	/**
	 * 获取：通告内容
	 */
	public String getTonggaoneirong() {
		return tonggaoneirong;
	}
	/**
	 * 设置：通告封面
	 */
	public void setTonggaofengmian(String tonggaofengmian) {
		this.tonggaofengmian = tonggaofengmian;
	}
	/**
	 * 获取：通告封面
	 */
	public String getTonggaofengmian() {
		return tonggaofengmian;
	}
	/**
	 * 设置：发布时间
	 */
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
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

}
