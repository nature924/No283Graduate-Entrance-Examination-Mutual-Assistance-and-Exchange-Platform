package com.entity.model;

import com.entity.CepingxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 测评信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-02-15 18:24:55
 */
public class CepingxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 测评题目
	 */
	
	private String cepingtimu;
		
	/**
	 * 测评简介
	 */
	
	private String cepingjianjie;
		
	/**
	 * 发布日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date faburiqi;
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：测评题目
	 */
	 
	public void setCepingtimu(String cepingtimu) {
		this.cepingtimu = cepingtimu;
	}
	
	/**
	 * 获取：测评题目
	 */
	public String getCepingtimu() {
		return cepingtimu;
	}
				
	
	/**
	 * 设置：测评简介
	 */
	 
	public void setCepingjianjie(String cepingjianjie) {
		this.cepingjianjie = cepingjianjie;
	}
	
	/**
	 * 获取：测评简介
	 */
	public String getCepingjianjie() {
		return cepingjianjie;
	}
				
	
	/**
	 * 设置：发布日期
	 */
	 
	public void setFaburiqi(Date faburiqi) {
		this.faburiqi = faburiqi;
	}
	
	/**
	 * 获取：发布日期
	 */
	public Date getFaburiqi() {
		return faburiqi;
	}
			
}
