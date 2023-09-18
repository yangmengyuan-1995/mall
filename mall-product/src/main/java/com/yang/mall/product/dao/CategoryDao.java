package com.yang.mall.product.dao;

import com.yang.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author yangmengyuan
 * @email yangmengyuan@gmail.com
 * @date 2023-09-05 22:43:10
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
