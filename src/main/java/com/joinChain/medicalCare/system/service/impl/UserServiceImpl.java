package com.joinChain.medicalCare.system.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.joinChain.medicalCare.system.entity.User;
import com.joinChain.medicalCare.system.mapper.UserMapper;
import com.joinChain.medicalCare.system.service.IUserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户 服务实现类
 * </p>
 *
 * @author chair
 * @since 2018-07-09
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public User getUser() {
		// TODO Auto-generated method stub
		return userMapper.getUser();
	}

}
