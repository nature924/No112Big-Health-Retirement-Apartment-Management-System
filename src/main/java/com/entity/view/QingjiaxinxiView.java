package com.entity.view;

import com.entity.QingjiaxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 请假信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-02-16 14:36:03
 */
@TableName("qingjiaxinxi")
public class QingjiaxinxiView  extends QingjiaxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public QingjiaxinxiView(){
	}
 
 	public QingjiaxinxiView(QingjiaxinxiEntity qingjiaxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, qingjiaxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
