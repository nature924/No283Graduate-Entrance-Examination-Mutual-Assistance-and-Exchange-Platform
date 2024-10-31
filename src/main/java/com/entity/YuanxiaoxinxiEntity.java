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
 * 院校信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-02-15 18:24:55
 */
@TableName("yuanxiaoxinxi")
public class YuanxiaoxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YuanxiaoxinxiEntity() {
		
	}
	
	public YuanxiaoxinxiEntity(T t) {
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
	 * 院校名称
	 */
					
	private String yuanxiaomingcheng;
	
	/**
	 * 院校图片
	 */
					
	private String yuanxiaotupian;
	
	/**
	 * 院校专业
	 */
					
	private String yuanxiaozhuanye;
	
	/**
	 * 负责人
	 */
					
	private String fuzeren;
	
	/**
	 * 联系电话
	 */
					
	private String lianxidianhua;
	
	/**
	 * 院校地址
	 */
					
	private String yuanxiaodizhi;
	
	/**
	 * 招生人数
	 */
					
	private Integer zhaoshengrenshu;
	
	/**
	 * 分数线
	 */
					
	private String fenshuxian;
	
	/**
	 * 成立日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date chengliriqi;
	
	/**
	 * 招生简介
	 */
					
	private String zhaoshengjianjie;
	
	/**
	 * 院校简介
	 */
					
	private String yuanxiaojianjie;
	
	/**
	 * 最近点击时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date clicktime;
	
	/**
	 * 点击次数
	 */
					
	private Integer clicknum;
	
	
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
	 * 设置：院校名称
	 */
	public void setYuanxiaomingcheng(String yuanxiaomingcheng) {
		this.yuanxiaomingcheng = yuanxiaomingcheng;
	}
	/**
	 * 获取：院校名称
	 */
	public String getYuanxiaomingcheng() {
		return yuanxiaomingcheng;
	}
	/**
	 * 设置：院校图片
	 */
	public void setYuanxiaotupian(String yuanxiaotupian) {
		this.yuanxiaotupian = yuanxiaotupian;
	}
	/**
	 * 获取：院校图片
	 */
	public String getYuanxiaotupian() {
		return yuanxiaotupian;
	}
	/**
	 * 设置：院校专业
	 */
	public void setYuanxiaozhuanye(String yuanxiaozhuanye) {
		this.yuanxiaozhuanye = yuanxiaozhuanye;
	}
	/**
	 * 获取：院校专业
	 */
	public String getYuanxiaozhuanye() {
		return yuanxiaozhuanye;
	}
	/**
	 * 设置：负责人
	 */
	public void setFuzeren(String fuzeren) {
		this.fuzeren = fuzeren;
	}
	/**
	 * 获取：负责人
	 */
	public String getFuzeren() {
		return fuzeren;
	}
	/**
	 * 设置：联系电话
	 */
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
	/**
	 * 设置：院校地址
	 */
	public void setYuanxiaodizhi(String yuanxiaodizhi) {
		this.yuanxiaodizhi = yuanxiaodizhi;
	}
	/**
	 * 获取：院校地址
	 */
	public String getYuanxiaodizhi() {
		return yuanxiaodizhi;
	}
	/**
	 * 设置：招生人数
	 */
	public void setZhaoshengrenshu(Integer zhaoshengrenshu) {
		this.zhaoshengrenshu = zhaoshengrenshu;
	}
	/**
	 * 获取：招生人数
	 */
	public Integer getZhaoshengrenshu() {
		return zhaoshengrenshu;
	}
	/**
	 * 设置：分数线
	 */
	public void setFenshuxian(String fenshuxian) {
		this.fenshuxian = fenshuxian;
	}
	/**
	 * 获取：分数线
	 */
	public String getFenshuxian() {
		return fenshuxian;
	}
	/**
	 * 设置：成立日期
	 */
	public void setChengliriqi(Date chengliriqi) {
		this.chengliriqi = chengliriqi;
	}
	/**
	 * 获取：成立日期
	 */
	public Date getChengliriqi() {
		return chengliriqi;
	}
	/**
	 * 设置：招生简介
	 */
	public void setZhaoshengjianjie(String zhaoshengjianjie) {
		this.zhaoshengjianjie = zhaoshengjianjie;
	}
	/**
	 * 获取：招生简介
	 */
	public String getZhaoshengjianjie() {
		return zhaoshengjianjie;
	}
	/**
	 * 设置：院校简介
	 */
	public void setYuanxiaojianjie(String yuanxiaojianjie) {
		this.yuanxiaojianjie = yuanxiaojianjie;
	}
	/**
	 * 获取：院校简介
	 */
	public String getYuanxiaojianjie() {
		return yuanxiaojianjie;
	}
	/**
	 * 设置：最近点击时间
	 */
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
	/**
	 * 设置：点击次数
	 */
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}

}
