package com.entity.model;

import com.entity.HuiyiwenjianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 会议文件
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-04-21 23:05:48
 */
public class HuiyiwenjianModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
	 * 会议名称
	 */
	
	private String huiyimingcheng;
		
	/**
	 * 会议室名称
	 */
	
	private String huiyishimingcheng;
		
	/**
	 * 会议文件
	 */
	
	private String huiyiwenjian;
		
	/**
	 * 会议时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date huiyishijian;
		
	/**
	 * 发布时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fabushijian;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
				
	
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
	 * 设置：会议名称
	 */
	 
	public void setHuiyimingcheng(String huiyimingcheng) {
		this.huiyimingcheng = huiyimingcheng;
	}
	
	/**
	 * 获取：会议名称
	 */
	public String getHuiyimingcheng() {
		return huiyimingcheng;
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
	 * 设置：会议文件
	 */
	 
	public void setHuiyiwenjian(String huiyiwenjian) {
		this.huiyiwenjian = huiyiwenjian;
	}
	
	/**
	 * 获取：会议文件
	 */
	public String getHuiyiwenjian() {
		return huiyiwenjian;
	}
				
	
	/**
	 * 设置：会议时间
	 */
	 
	public void setHuiyishijian(Date huiyishijian) {
		this.huiyishijian = huiyishijian;
	}
	
	/**
	 * 获取：会议时间
	 */
	public Date getHuiyishijian() {
		return huiyishijian;
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
