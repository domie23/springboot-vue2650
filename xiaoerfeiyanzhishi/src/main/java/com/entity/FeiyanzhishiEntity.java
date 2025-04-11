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
 * 肺炎知识
 *
 * @author 
 * @email
 */
@TableName("feiyanzhishi")
public class FeiyanzhishiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public FeiyanzhishiEntity() {

	}

	public FeiyanzhishiEntity(T t) {
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
     * 标题
     */
    @TableField(value = "feiyanzhishi_name")

    private String feiyanzhishiName;


    /**
     * 图片
     */
    @TableField(value = "feiyanzhishi_photo")

    private String feiyanzhishiPhoto;


    /**
     * 知识类型
     */
    @TableField(value = "feiyanzhishi_types")

    private Integer feiyanzhishiTypes;


    /**
     * 肺炎知识情
     */
    @TableField(value = "feiyanzhishi_content")

    private String feiyanzhishiContent;


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
	 * 设置：标题
	 */
    public String getFeiyanzhishiName() {
        return feiyanzhishiName;
    }


    /**
	 * 获取：标题
	 */

    public void setFeiyanzhishiName(String feiyanzhishiName) {
        this.feiyanzhishiName = feiyanzhishiName;
    }
    /**
	 * 设置：图片
	 */
    public String getFeiyanzhishiPhoto() {
        return feiyanzhishiPhoto;
    }


    /**
	 * 获取：图片
	 */

    public void setFeiyanzhishiPhoto(String feiyanzhishiPhoto) {
        this.feiyanzhishiPhoto = feiyanzhishiPhoto;
    }
    /**
	 * 设置：知识类型
	 */
    public Integer getFeiyanzhishiTypes() {
        return feiyanzhishiTypes;
    }


    /**
	 * 获取：知识类型
	 */

    public void setFeiyanzhishiTypes(Integer feiyanzhishiTypes) {
        this.feiyanzhishiTypes = feiyanzhishiTypes;
    }
    /**
	 * 设置：肺炎知识情
	 */
    public String getFeiyanzhishiContent() {
        return feiyanzhishiContent;
    }


    /**
	 * 获取：肺炎知识情
	 */

    public void setFeiyanzhishiContent(String feiyanzhishiContent) {
        this.feiyanzhishiContent = feiyanzhishiContent;
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
        return "Feiyanzhishi{" +
            "id=" + id +
            ", feiyanzhishiName=" + feiyanzhishiName +
            ", feiyanzhishiPhoto=" + feiyanzhishiPhoto +
            ", feiyanzhishiTypes=" + feiyanzhishiTypes +
            ", feiyanzhishiContent=" + feiyanzhishiContent +
            ", createTime=" + createTime +
        "}";
    }
}
