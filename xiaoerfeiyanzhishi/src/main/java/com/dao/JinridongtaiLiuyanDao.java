package com.dao;

import com.entity.JinridongtaiLiuyanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.JinridongtaiLiuyanView;

/**
 * 商品评价 Dao 接口
 *
 * @author 
 */
public interface JinridongtaiLiuyanDao extends BaseMapper<JinridongtaiLiuyanEntity> {

   List<JinridongtaiLiuyanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
