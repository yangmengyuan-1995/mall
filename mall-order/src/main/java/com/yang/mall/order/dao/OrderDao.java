package com.yang.mall.order.dao;

import com.yang.mall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author yangmengyuan
 * @email yangmengyuan@gmail.com
 * @date 2023-09-08 20:59:09
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
