package com.entity.view;

import com.entity.HuowuqingkuangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 货物情况
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-22 19:23:57
 */
@TableName("huowuqingkuang")
public class HuowuqingkuangView  extends HuowuqingkuangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public HuowuqingkuangView(){
	}
 
 	public HuowuqingkuangView(HuowuqingkuangEntity huowuqingkuangEntity){
 	try {
			BeanUtils.copyProperties(this, huowuqingkuangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
