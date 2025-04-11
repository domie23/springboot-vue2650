package com.entity.view;

import com.entity.FeiyanzhishiEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 肺炎知识
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("feiyanzhishi")
public class FeiyanzhishiView extends FeiyanzhishiEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 知识类型的值
		*/
		private String feiyanzhishiValue;



	public FeiyanzhishiView() {

	}

	public FeiyanzhishiView(FeiyanzhishiEntity feiyanzhishiEntity) {
		try {
			BeanUtils.copyProperties(this, feiyanzhishiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 知识类型的值
			*/
			public String getFeiyanzhishiValue() {
				return feiyanzhishiValue;
			}
			/**
			* 设置： 知识类型的值
			*/
			public void setFeiyanzhishiValue(String feiyanzhishiValue) {
				this.feiyanzhishiValue = feiyanzhishiValue;
			}















}
