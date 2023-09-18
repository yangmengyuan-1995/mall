package com.yang.mall.member.dao;

import com.yang.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author yangmengyuan
 * @email yangmengyuan@gmail.com
 * @date 2023-09-08 20:51:15
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
