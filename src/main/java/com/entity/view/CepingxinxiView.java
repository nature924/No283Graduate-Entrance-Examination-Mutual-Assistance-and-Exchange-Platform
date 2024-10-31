package com.entity.view;

import com.entity.CepingxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 测评信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-02-15 18:24:55
 */
@TableName("cepingxinxi")
public class CepingxinxiView  extends CepingxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public CepingxinxiView(){
	}
 
 	public CepingxinxiView(CepingxinxiEntity cepingxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, cepingxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
