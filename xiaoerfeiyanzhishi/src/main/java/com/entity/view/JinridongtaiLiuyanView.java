package com.entity.view;

import com.entity.JinridongtaiLiuyanEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 商品评价
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("jinridongtai_liuyan")
public class JinridongtaiLiuyanView extends JinridongtaiLiuyanEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 jinridongtai
			/**
			* 动态标题
			*/
			private String jinridongtaiName;
			/**
			* 动态图片
			*/
			private String jinridongtaiPhoto;
			/**
			* 动态类型
			*/
			private Integer jinridongtaiTypes;
				/**
				* 动态类型的值
				*/
				private String jinridongtaiValue;
			/**
			* 今日动态 的 用户
			*/
			private Integer jinridongtaiYonghuId;
			/**
			* 动态详情
			*/
			private String jinridongtaiContent;

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 用户手机号
			*/
			private String yonghuPhone;
			/**
			* 用户身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 用户头像
			*/
			private String yonghuPhoto;
			/**
			* 电子邮箱
			*/
			private String yonghuEmail;
			/**
			* 余额
			*/
			private Double newMoney;

	public JinridongtaiLiuyanView() {

	}

	public JinridongtaiLiuyanView(JinridongtaiLiuyanEntity jinridongtaiLiuyanEntity) {
		try {
			BeanUtils.copyProperties(this, jinridongtaiLiuyanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}






















				//级联表的get和set jinridongtai
					/**
					* 获取： 动态标题
					*/
					public String getJinridongtaiName() {
						return jinridongtaiName;
					}
					/**
					* 设置： 动态标题
					*/
					public void setJinridongtaiName(String jinridongtaiName) {
						this.jinridongtaiName = jinridongtaiName;
					}
					/**
					* 获取： 动态图片
					*/
					public String getJinridongtaiPhoto() {
						return jinridongtaiPhoto;
					}
					/**
					* 设置： 动态图片
					*/
					public void setJinridongtaiPhoto(String jinridongtaiPhoto) {
						this.jinridongtaiPhoto = jinridongtaiPhoto;
					}
					/**
					* 获取： 动态类型
					*/
					public Integer getJinridongtaiTypes() {
						return jinridongtaiTypes;
					}
					/**
					* 设置： 动态类型
					*/
					public void setJinridongtaiTypes(Integer jinridongtaiTypes) {
						this.jinridongtaiTypes = jinridongtaiTypes;
					}


						/**
						* 获取： 动态类型的值
						*/
						public String getJinridongtaiValue() {
							return jinridongtaiValue;
						}
						/**
						* 设置： 动态类型的值
						*/
						public void setJinridongtaiValue(String jinridongtaiValue) {
							this.jinridongtaiValue = jinridongtaiValue;
						}
					/**
					* 获取：今日动态 的 用户
					*/
					public Integer getJinridongtaiYonghuId() {
						return jinridongtaiYonghuId;
					}
					/**
					* 设置：今日动态 的 用户
					*/
					public void setJinridongtaiYonghuId(Integer jinridongtaiYonghuId) {
						this.jinridongtaiYonghuId = jinridongtaiYonghuId;
					}

					/**
					* 获取： 动态详情
					*/
					public String getJinridongtaiContent() {
						return jinridongtaiContent;
					}
					/**
					* 设置： 动态详情
					*/
					public void setJinridongtaiContent(String jinridongtaiContent) {
						this.jinridongtaiContent = jinridongtaiContent;
					}



















				//级联表的get和set yonghu
					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}
					/**
					* 获取： 用户手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 用户手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}
					/**
					* 获取： 用户身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 用户身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}
					/**
					* 获取： 用户头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 用户头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}
					/**
					* 获取： 电子邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 电子邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}
					/**
					* 获取： 余额
					*/
					public Double getNewMoney() {
						return newMoney;
					}
					/**
					* 设置： 余额
					*/
					public void setNewMoney(Double newMoney) {
						this.newMoney = newMoney;
					}



}
