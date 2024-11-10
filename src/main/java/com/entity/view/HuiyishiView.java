package com.entity.view;

import com.entity.HuiyishiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 会议室
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-21 23:05:48
 */
@TableName("huiyishi")
public class HuiyishiView  extends HuiyishiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public HuiyishiView(){
	}
 
 	public HuiyishiView(HuiyishiEntity huiyishiEntity){
 	try {
			BeanUtils.copyProperties(this, huiyishiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
