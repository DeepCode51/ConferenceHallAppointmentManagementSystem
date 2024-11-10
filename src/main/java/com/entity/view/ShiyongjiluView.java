package com.entity.view;

import com.entity.ShiyongjiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 使用记录
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-21 23:05:48
 */
@TableName("shiyongjilu")
public class ShiyongjiluView  extends ShiyongjiluEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShiyongjiluView(){
	}
 
 	public ShiyongjiluView(ShiyongjiluEntity shiyongjiluEntity){
 	try {
			BeanUtils.copyProperties(this, shiyongjiluEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
