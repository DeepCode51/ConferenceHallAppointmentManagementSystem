package com.entity.model;

import com.entity.HuiyishiyuyueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 会议室预约
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-04-21 23:05:48
 */
public class HuiyishiyuyueModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 会议室编号
	 */
	
	private String huiyishibianhao;
		
	/**
	 * 会议室名称
	 */
	
	private String huiyishimingcheng;
		
	/**
	 * 会议室规模
	 */
	
	private String huiyishiguimo;
		
	/**
	 * 会议室位置
	 */
	
	private String huiyishiweizhi;
		
	/**
	 * 预计人数
	 */
	
	private String yujirenshu;
		
	/**
	 * 开始时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date kaishishijian;
		
	/**
	 * 结束时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date jieshushijian;
		
	/**
	 * 会议说明
	 */
	
	private String huiyishuoming;
		
	/**
	 * 申请时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date shenqingshijian;
		
	/**
	 * 用户账号
	 */
	
	private String yonghuzhanghao;
		
	/**
	 * 用户姓名
	 */
	
	private String yonghuxingming;
		
	/**
	 * 手机号码
	 */
	
	private String shoujihaoma;
		
	/**
	 * 部门
	 */
	
	private String bumen;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
	/**
	 * 设置：会议室编号
	 */
	 
	public void setHuiyishibianhao(String huiyishibianhao) {
		this.huiyishibianhao = huiyishibianhao;
	}
	
	/**
	 * 获取：会议室编号
	 */
	public String getHuiyishibianhao() {
		return huiyishibianhao;
	}
				
	
	/**
	 * 设置：会议室名称
	 */
	 
	public void setHuiyishimingcheng(String huiyishimingcheng) {
		this.huiyishimingcheng = huiyishimingcheng;
	}
	
	/**
	 * 获取：会议室名称
	 */
	public String getHuiyishimingcheng() {
		return huiyishimingcheng;
	}
				
	
	/**
	 * 设置：会议室规模
	 */
	 
	public void setHuiyishiguimo(String huiyishiguimo) {
		this.huiyishiguimo = huiyishiguimo;
	}
	
	/**
	 * 获取：会议室规模
	 */
	public String getHuiyishiguimo() {
		return huiyishiguimo;
	}
				
	
	/**
	 * 设置：会议室位置
	 */
	 
	public void setHuiyishiweizhi(String huiyishiweizhi) {
		this.huiyishiweizhi = huiyishiweizhi;
	}
	
	/**
	 * 获取：会议室位置
	 */
	public String getHuiyishiweizhi() {
		return huiyishiweizhi;
	}
				
	
	/**
	 * 设置：预计人数
	 */
	 
	public void setYujirenshu(String yujirenshu) {
		this.yujirenshu = yujirenshu;
	}
	
	/**
	 * 获取：预计人数
	 */
	public String getYujirenshu() {
		return yujirenshu;
	}
				
	
	/**
	 * 设置：开始时间
	 */
	 
	public void setKaishishijian(Date kaishishijian) {
		this.kaishishijian = kaishishijian;
	}
	
	/**
	 * 获取：开始时间
	 */
	public Date getKaishishijian() {
		return kaishishijian;
	}
				
	
	/**
	 * 设置：结束时间
	 */
	 
	public void setJieshushijian(Date jieshushijian) {
		this.jieshushijian = jieshushijian;
	}
	
	/**
	 * 获取：结束时间
	 */
	public Date getJieshushijian() {
		return jieshushijian;
	}
				
	
	/**
	 * 设置：会议说明
	 */
	 
	public void setHuiyishuoming(String huiyishuoming) {
		this.huiyishuoming = huiyishuoming;
	}
	
	/**
	 * 获取：会议说明
	 */
	public String getHuiyishuoming() {
		return huiyishuoming;
	}
				
	
	/**
	 * 设置：申请时间
	 */
	 
	public void setShenqingshijian(Date shenqingshijian) {
		this.shenqingshijian = shenqingshijian;
	}
	
	/**
	 * 获取：申请时间
	 */
	public Date getShenqingshijian() {
		return shenqingshijian;
	}
				
	
	/**
	 * 设置：用户账号
	 */
	 
	public void setYonghuzhanghao(String yonghuzhanghao) {
		this.yonghuzhanghao = yonghuzhanghao;
	}
	
	/**
	 * 获取：用户账号
	 */
	public String getYonghuzhanghao() {
		return yonghuzhanghao;
	}
				
	
	/**
	 * 设置：用户姓名
	 */
	 
	public void setYonghuxingming(String yonghuxingming) {
		this.yonghuxingming = yonghuxingming;
	}
	
	/**
	 * 获取：用户姓名
	 */
	public String getYonghuxingming() {
		return yonghuxingming;
	}
				
	
	/**
	 * 设置：手机号码
	 */
	 
	public void setShoujihaoma(String shoujihaoma) {
		this.shoujihaoma = shoujihaoma;
	}
	
	/**
	 * 获取：手机号码
	 */
	public String getShoujihaoma() {
		return shoujihaoma;
	}
				
	
	/**
	 * 设置：部门
	 */
	 
	public void setBumen(String bumen) {
		this.bumen = bumen;
	}
	
	/**
	 * 获取：部门
	 */
	public String getBumen() {
		return bumen;
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
