package com.joinChain.medicalCare.system.mapper;


import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.joinChain.medicalCare.system.entity.User;

/**
 * <p>
  * 用户 Mapper 接口
 * </p>
 *
 * @author chair
 * @since 2018-07-09
 */
public interface UserMapper extends BaseMapper<User> {

	User getUser();
}