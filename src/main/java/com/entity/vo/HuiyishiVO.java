package com.entity.vo;

import com.entity.HuiyishiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 会议室
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-04-21 23:05:48
 */
public class HuiyishiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 会议室名称
	 */
	
	private String huiyishimingcheng;
		
	/**
	 * 会议室图片
	 */
	
	private String huiyishitupian;
		
	/**
	 * 会议室规模
	 */
	
	private String huiyishiguimo;
		
	/**
	 * 会议室位置
	 */
	
	private String huiyishiweizhi;
		
	/**
	 * 可约时间
	 */
	
	private String keyueshijian;
		
	/**
	 * 容纳人数
	 */
	
	private String rongnarenshu;
		
	/**
	 * 设备详情
	 */
	
	private String shebeixiangqing;
		
	/**
	 * 会议室详情
	 */
	
	private String huiyishixiangqing;
				
	
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
	 * 设置：会议室图片
	 */
	 
	public void setHuiyishitupian(String huiyishitupian) {
		this.huiyishitupian = huiyishitupian;
	}
	
	/**
	 * 获取：会议室图片
	 */
	public String getHuiyishitupian() {
		return huiyishitupian;
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
	 * 设置：可约时间
	 */
	 
	public void setKeyueshijian(String keyueshijian) {
		this.keyueshijian = keyueshijian;
	}
	
	/**
	 * 获取：可约时间
	 */
	public String getKeyueshijian() {
		return keyueshijian;
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
	 * 设置：设备详情
	 */
	 
	public void setShebeixiangqing(String shebeixiangqing) {
		this.shebeixiangqing = shebeixiangqing;
	}
	
	/**
	 * 获取：设备详情
	 */
	public String getShebeixiangqing() {
		return shebeixiangqing;
	}
				
	
	/**
	 * 设置：会议室详情
	 */
	 
	public void setHuiyishixiangqing(String huiyishixiangqing) {
		this.huiyishixiangqing = huiyishixiangqing;
	}
	
	/**
	 * 获取：会议室详情
	 */
	public String getHuiyishixiangqing() {
		return huiyishixiangqing;
	}
			
}
