package com.entity.view;

import com.entity.HuiyishiyuyueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 会议室预约
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-21 23:05:48
 */
@TableName("huiyishiyuyue")
public class HuiyishiyuyueView  extends HuiyishiyuyueEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public HuiyishiyuyueView(){
	}
 
 	public HuiyishiyuyueView(HuiyishiyuyueEntity huiyishiyuyueEntity){
 	try {
			BeanUtils.copyProperties(this, huiyishiyuyueEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
