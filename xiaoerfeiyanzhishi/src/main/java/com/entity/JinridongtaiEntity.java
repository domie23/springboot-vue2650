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
 * 今日动态
 *
 * @author 
 * @email
 */
@TableName("jinridongtai")
public class JinridongtaiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public JinridongtaiEntity() {

	}

	public JinridongtaiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 动态标题
     */
    @TableField(value = "jinridongtai_name")

    private String jinridongtaiName;


    /**
     * 动态图片
     */
    @TableField(value = "jinridongtai_photo")

    private String jinridongtaiPhoto;


    /**
     * 动态类型
     */
    @TableField(value = "jinridongtai_types")

    private Integer jinridongtaiTypes;


    /**
     * 用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 动态详情
     */
    @TableField(value = "jinridongtai_content")

    private String jinridongtaiContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：动态标题
	 */
    public String getJinridongtaiName() {
        return jinridongtaiName;
    }


    /**
	 * 获取：动态标题
	 */

    public void setJinridongtaiName(String jinridongtaiName) {
        this.jinridongtaiName = jinridongtaiName;
    }
    /**
	 * 设置：动态图片
	 */
    public String getJinridongtaiPhoto() {
        return jinridongtaiPhoto;
    }


    /**
	 * 获取：动态图片
	 */

    public void setJinridongtaiPhoto(String jinridongtaiPhoto) {
        this.jinridongtaiPhoto = jinridongtaiPhoto;
    }
    /**
	 * 设置：动态类型
	 */
    public Integer getJinridongtaiTypes() {
        return jinridongtaiTypes;
    }


    /**
	 * 获取：动态类型
	 */

    public void setJinridongtaiTypes(Integer jinridongtaiTypes) {
        this.jinridongtaiTypes = jinridongtaiTypes;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：动态详情
	 */
    public String getJinridongtaiContent() {
        return jinridongtaiContent;
    }


    /**
	 * 获取：动态详情
	 */

    public void setJinridongtaiContent(String jinridongtaiContent) {
        this.jinridongtaiContent = jinridongtaiContent;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Jinridongtai{" +
            "id=" + id +
            ", jinridongtaiName=" + jinridongtaiName +
            ", jinridongtaiPhoto=" + jinridongtaiPhoto +
            ", jinridongtaiTypes=" + jinridongtaiTypes +
            ", yonghuId=" + yonghuId +
            ", jinridongtaiContent=" + jinridongtaiContent +
            ", createTime=" + createTime +
        "}";
    }
}
