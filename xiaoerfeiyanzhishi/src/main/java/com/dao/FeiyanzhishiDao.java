package com.dao;

import com.entity.FeiyanzhishiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.FeiyanzhishiView;

/**
 * 肺炎知识 Dao 接口
 *
 * @author 
 */
public interface FeiyanzhishiDao extends BaseMapper<FeiyanzhishiEntity> {

   List<FeiyanzhishiView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
