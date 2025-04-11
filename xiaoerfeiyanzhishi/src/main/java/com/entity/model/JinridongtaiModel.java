package com.entity.model;

import com.entity.JinridongtaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 今日动态
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class JinridongtaiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


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
     * 用户
     */
    private Integer yonghuId;


    /**
     * 动态详情
     */
    private String jinridongtaiContent;


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
	 * 获取：动态标题
	 */
    public String getJinridongtaiName() {
        return jinridongtaiName;
    }


    /**
	 * 设置：动态标题
	 */
    public void setJinridongtaiName(String jinridongtaiName) {
        this.jinridongtaiName = jinridongtaiName;
    }
    /**
	 * 获取：动态图片
	 */
    public String getJinridongtaiPhoto() {
        return jinridongtaiPhoto;
    }


    /**
	 * 设置：动态图片
	 */
    public void setJinridongtaiPhoto(String jinridongtaiPhoto) {
        this.jinridongtaiPhoto = jinridongtaiPhoto;
    }
    /**
	 * 获取：动态类型
	 */
    public Integer getJinridongtaiTypes() {
        return jinridongtaiTypes;
    }


    /**
	 * 设置：动态类型
	 */
    public void setJinridongtaiTypes(Integer jinridongtaiTypes) {
        this.jinridongtaiTypes = jinridongtaiTypes;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：动态详情
	 */
    public String getJinridongtaiContent() {
        return jinridongtaiContent;
    }


    /**
	 * 设置：动态详情
	 */
    public void setJinridongtaiContent(String jinridongtaiContent) {
        this.jinridongtaiContent = jinridongtaiContent;
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
