package com.entity.vo;

import com.entity.ShiyongjiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 使用记录
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-04-21 23:05:48
 */
public class ShiyongjiluVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
	 * 容纳人数
	 */
	
	private String rongnarenshu;
		
	/**
	 * 使用时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date shiyongshijian;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
				
	
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
	 * 设置：容纳人数
	 */
	 
	public void setRongnarenshu(String rongnarenshu) {
		this.rongnarenshu = rongnarenshu;
	}
	
	/**
	 * 获取：容纳人数
	 */
	public String getRongnarenshu() {
		return rongnarenshu;
	}
				
	
	/**
	 * 设置：使用时间
	 */
	 
	public void setShiyongshijian(Date shiyongshijian) {
		this.shiyongshijian = shiyongshijian;
	}
	
	/**
	 * 获取：使用时间
	 */
	public Date getShiyongshijian() {
		return shiyongshijian;
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
			
}
