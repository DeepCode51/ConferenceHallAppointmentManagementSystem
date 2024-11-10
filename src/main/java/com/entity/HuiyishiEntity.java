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
 * 会议室
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-21 23:05:48
 */
@TableName("huiyishi")
public class HuiyishiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public HuiyishiEntity() {
		
	}
	
	public HuiyishiEntity(T t) {
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
	 * 会议室编号
	 */
					
	private String huiyishibianhao;
	
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
