package com.entity.model;

import com.entity.FeiyanzhishiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 肺炎知识
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class FeiyanzhishiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 标题
     */
    private String feiyanzhishiName;


    /**
     * 图片
     */
    private String feiyanzhishiPhoto;


    /**
     * 知识类型
     */
    private Integer feiyanzhishiTypes;


    /**
     * 肺炎知识情
     */
    private String feiyanzhishiContent;


    /**
     * 创建时间 show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：标题
	 */
    public String getFeiyanzhishiName() {
        return feiyanzhishiName;
    }


    /**
	 * 设置：标题
	 */
    public void setFeiyanzhishiName(String feiyanzhishiName) {
        this.feiyanzhishiName = feiyanzhishiName;
    }
    /**
	 * 获取：图片
	 */
    public String getFeiyanzhishiPhoto() {
        return feiyanzhishiPhoto;
    }


    /**
	 * 设置：图片
	 */
    public void setFeiyanzhishiPhoto(String feiyanzhishiPhoto) {
        this.feiyanzhishiPhoto = feiyanzhishiPhoto;
    }
    /**
	 * 获取：知识类型
	 */
    public Integer getFeiyanzhishiTypes() {
        return feiyanzhishiTypes;
    }


    /**
	 * 设置：知识类型
	 */
    public void setFeiyanzhishiTypes(Integer feiyanzhishiTypes) {
        this.feiyanzhishiTypes = feiyanzhishiTypes;
    }
    /**
	 * 获取：肺炎知识情
	 */
    public String getFeiyanzhishiContent() {
        return feiyanzhishiContent;
    }


    /**
	 * 设置：肺炎知识情
	 */
    public void setFeiyanzhishiContent(String feiyanzhishiContent) {
        this.feiyanzhishiContent = feiyanzhishiContent;
    }
    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
