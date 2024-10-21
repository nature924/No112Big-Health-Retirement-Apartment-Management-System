package com.entity.model;

import com.entity.ShoufeibiaozhunEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 收费标准
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-02-16 14:36:03
 */
public class ShoufeibiaozhunModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 收费价格
	 */
	
	private Float shoufeijiage;
		
	/**
	 * 收费说明
	 */
	
	private String shoufeishuoming;
		
	/**
	 * 发布日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date faburiqi;
				
	
	/**
	 * 设置：收费价格
	 */
	 
	public void setShoufeijiage(Float shoufeijiage) {
		this.shoufeijiage = shoufeijiage;
	}
	
	/**
	 * 获取：收费价格
	 */
	public Float getShoufeijiage() {
		return shoufeijiage;
	}
				
	
	/**
	 * 设置：收费说明
	 */
	 
	public void setShoufeishuoming(String shoufeishuoming) {
		this.shoufeishuoming = shoufeishuoming;
	}
	
	/**
	 * 获取：收费说明
	 */
	public String getShoufeishuoming() {
		return shoufeishuoming;
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
