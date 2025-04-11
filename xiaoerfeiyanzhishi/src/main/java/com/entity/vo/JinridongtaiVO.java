package com.entity.vo;

import com.entity.JinridongtaiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 今日动态
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("jinridongtai")
public class JinridongtaiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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
     * 创建时间 show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
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
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
