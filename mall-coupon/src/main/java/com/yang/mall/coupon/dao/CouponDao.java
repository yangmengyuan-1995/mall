package com.yang.mall.coupon.dao;

import com.yang.mall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author yangmengyuan
 * @email yangmengyuan@gmail.com
 * @date 2023-09-08 20:25:12
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
