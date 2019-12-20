package com.joinChain.medicalCare.system.service;

import com.baomidou.mybatisplus.service.IService;
import com.joinChain.medicalCare.system.entity.User;

/**
 * <p>
 * 用户 服务类
 * </p>
 *
 * @author chair
 * @since 2018-07-09
 */
public interface IUserService extends IService<User> {
	User getUser();
}
