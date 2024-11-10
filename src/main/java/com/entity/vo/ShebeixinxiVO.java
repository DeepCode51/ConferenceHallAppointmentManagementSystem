package com.entity.vo;

import com.entity.ShebeixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 设备信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-04-21 23:05:48
 */
public class ShebeixinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 设备名称
	 */
	
	private String shebeimingcheng;
		
	/**
	 * 设备位置
	 */
	
	private String shebeiweizhi;
		
	/**
	 * 用途
	 */
	
	private String yongtu;
		
	/**
	 * 设备详情
	 */
	
	private String shebeixiangqing;
		
	/**
	 * 数量
	 */
	
	private Integer shuliang;
				
	
	/**
	 * 设置：设备名称
	 */
	 
	public void setShebeimingcheng(String shebeimingcheng) {
		this.shebeimingcheng = shebeimingcheng;
	}
	
	/**
	 * 获取：设备名称
	 */
	public String getShebeimingcheng() {
		return shebeimingcheng;
	}
				
	
	/**
	 * 设置：设备位置
	 */
	 
	public void setShebeiweizhi(String shebeiweizhi) {
		this.shebeiweizhi = shebeiweizhi;
	}
	
	/**
	 * 获取：设备位置
	 */
	public String getShebeiweizhi() {
		return shebeiweizhi;
	}
				
	
	/**
	 * 设置：用途
	 */
	 
	public void setYongtu(String yongtu) {
		this.yongtu = yongtu;
	}
	
	/**
	 * 获取：用途
	 */
	public String getYongtu() {
		return yongtu;
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
	 * 设置：数量
	 */
	 
	public void setShuliang(Integer shuliang) {
		this.shuliang = shuliang;
	}
	
	/**
	 * 获取：数量
	 */
	public Integer getShuliang() {
		return shuliang;
	}
			
}
