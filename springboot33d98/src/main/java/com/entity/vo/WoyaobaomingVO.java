package com.entity.vo;

import com.entity.WoyaobaomingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 我要报名
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-03-08 19:31:00
 */
public class WoyaobaomingVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 通告类型
	 */
	
	private String tonggaoleixing;
		
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
	
	private String paisheshijian;
		
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
		
	/**
	 * 报名申请
	 */
	
	private String baomingshenqing;
		
	/**
	 * 报名时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date baomingshijian;
		
	/**
	 * 报名状态
	 */
	
	private String baomingzhuangtai;
		
	/**
	 * 演员账号
	 */
	
	private String yanyuanzhanghao;
		
	/**
	 * 昵称
	 */
	
	private String nicheng;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 联系电话
	 */
	
	private String lianxidianhua;
		
	/**
	 * 头像
	 */
	
	private String touxiang;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
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
	 
	public void setPaisheshijian(String paisheshijian) {
		this.paisheshijian = paisheshijian;
	}
	
	/**
	 * 获取：拍摄时间
	 */
	public String getPaisheshijian() {
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
				
	
	/**
	 * 设置：报名申请
	 */
	 
	public void setBaomingshenqing(String baomingshenqing) {
		this.baomingshenqing = baomingshenqing;
	}
	
	/**
	 * 获取：报名申请
	 */
	public String getBaomingshenqing() {
		return baomingshenqing;
	}
				
	
	/**
	 * 设置：报名时间
	 */
	 
	public void setBaomingshijian(Date baomingshijian) {
		this.baomingshijian = baomingshijian;
	}
	
	/**
	 * 获取：报名时间
	 */
	public Date getBaomingshijian() {
		return baomingshijian;
	}
				
	
	/**
	 * 设置：报名状态
	 */
	 
	public void setBaomingzhuangtai(String baomingzhuangtai) {
		this.baomingzhuangtai = baomingzhuangtai;
	}
	
	/**
	 * 获取：报名状态
	 */
	public String getBaomingzhuangtai() {
		return baomingzhuangtai;
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
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：联系电话
	 */
	 
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
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
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
			
}
