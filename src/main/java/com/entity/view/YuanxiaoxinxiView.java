package com.entity.view;

import com.entity.YuanxiaoxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 院校信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-02-15 18:24:55
 */
@TableName("yuanxiaoxinxi")
public class YuanxiaoxinxiView  extends YuanxiaoxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YuanxiaoxinxiView(){
	}
 
 	public YuanxiaoxinxiView(YuanxiaoxinxiEntity yuanxiaoxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, yuanxiaoxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
