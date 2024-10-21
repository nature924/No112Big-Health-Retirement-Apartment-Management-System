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
 * 房间信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-02-16 14:36:03
 */
@TableName("fangjianxinxi")
public class FangjianxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public FangjianxinxiEntity() {
		
	}
	
	public FangjianxinxiEntity(T t) {
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
	 * 房间编号
	 */
					
	private String fangjianbianhao;
	
	/**
	 * 房间名称
	 */
					
	private String fangjianmingcheng;
	
	/**
	 * 房间类型
	 */
					
	private String fangjianleixing;
	
	/**
	 * 房间封面
	 */
					
	private String fangjianfengmian;
	
	/**
	 * 房间位置
	 */
					
	private String fangjianweizhi;
	
	/**
	 * 有床位
	 */
					
	private String youchuangwei;
	
	/**
	 * 可住人数
	 */
					
	private String kezhurenshu;
	
	/**
	 * 已住人数
	 */
					
	private String yizhurenshu;
	
	/**
	 * 标题
	 */
					
	private String biaoti;
	
	/**
	 * 收费价格
	 */
					
	private String shoufeijiage;
	
	/**
	 * 发布时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date fabushijian;
	
	/**
	 * 房间简介
	 */
					
	private String fangjianjianjie;
	
	
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
	 * 设置：房间编号
	 */
	public void setFangjianbianhao(String fangjianbianhao) {
		this.fangjianbianhao = fangjianbianhao;
	}
	/**
	 * 获取：房间编号
	 */
	public String getFangjianbianhao() {
		return fangjianbianhao;
	}
	/**
	 * 设置：房间名称
	 */
	public void setFangjianmingcheng(String fangjianmingcheng) {
		this.fangjianmingcheng = fangjianmingcheng;
	}
	/**
	 * 获取：房间名称
	 */
	public String getFangjianmingcheng() {
		return fangjianmingcheng;
	}
	/**
	 * 设置：房间类型
	 */
	public void setFangjianleixing(String fangjianleixing) {
		this.fangjianleixing = fangjianleixing;
	}
	/**
	 * 获取：房间类型
	 */
	public String getFangjianleixing() {
		return fangjianleixing;
	}
	/**
	 * 设置：房间封面
	 */
	public void setFangjianfengmian(String fangjianfengmian) {
		this.fangjianfengmian = fangjianfengmian;
	}
	/**
	 * 获取：房间封面
	 */
	public String getFangjianfengmian() {
		return fangjianfengmian;
	}
	/**
	 * 设置：房间位置
	 */
	public void setFangjianweizhi(String fangjianweizhi) {
		this.fangjianweizhi = fangjianweizhi;
	}
	/**
	 * 获取：房间位置
	 */
	public String getFangjianweizhi() {
		return fangjianweizhi;
	}
	/**
	 * 设置：有床位
	 */
	public void setYouchuangwei(String youchuangwei) {
		this.youchuangwei = youchuangwei;
	}
	/**
	 * 获取：有床位
	 */
	public String getYouchuangwei() {
		return youchuangwei;
	}
	/**
	 * 设置：可住人数
	 */
	public void setKezhurenshu(String kezhurenshu) {
		this.kezhurenshu = kezhurenshu;
	}
	/**
	 * 获取：可住人数
	 */
	public String getKezhurenshu() {
		return kezhurenshu;
	}
	/**
	 * 设置：已住人数
	 */
	public void setYizhurenshu(String yizhurenshu) {
		this.yizhurenshu = yizhurenshu;
	}
	/**
	 * 获取：已住人数
	 */
	public String getYizhurenshu() {
		return yizhurenshu;
	}
	/**
	 * 设置：标题
	 */
	public void setBiaoti(String biaoti) {
		this.biaoti = biaoti;
	}
	/**
	 * 获取：标题
	 */
	public String getBiaoti() {
		return biaoti;
	}
	/**
	 * 设置：收费价格
	 */
	public void setShoufeijiage(String shoufeijiage) {
		this.shoufeijiage = shoufeijiage;
	}
	/**
	 * 获取：收费价格
	 */
	public String getShoufeijiage() {
		return shoufeijiage;
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
	 * 设置：房间简介
	 */
	public void setFangjianjianjie(String fangjianjianjie) {
		this.fangjianjianjie = fangjianjianjie;
	}
	/**
	 * 获取：房间简介
	 */
	public String getFangjianjianjie() {
		return fangjianjianjie;
	}

}
