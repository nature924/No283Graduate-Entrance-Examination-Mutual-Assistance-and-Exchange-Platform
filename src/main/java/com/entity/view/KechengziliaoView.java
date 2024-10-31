package com.entity.view;

import com.entity.KechengziliaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 课程资料
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-02-15 18:24:55
 */
@TableName("kechengziliao")
public class KechengziliaoView  extends KechengziliaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public KechengziliaoView(){
	}
 
 	public KechengziliaoView(KechengziliaoEntity kechengziliaoEntity){
 	try {
			BeanUtils.copyProperties(this, kechengziliaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
