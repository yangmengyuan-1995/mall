package com.yang.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yang.common.utils.PageUtils;
import com.yang.mall.ware.entity.PurchaseEntity;

import java.util.Map;

/**
 * 采购单
 *
 * @author yangmengyuan
 * @email yangmengyuan@gmail.com
 * @date 2023-09-08 21:07:25
 */
public interface PurchaseService extends IService<PurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

