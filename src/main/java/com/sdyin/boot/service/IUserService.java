package com.sdyin.boot.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sdyin.boot.model.User;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author liuye
 * @since 2018-08-13
 */
public interface IUserService extends IService<User> {

  /**
   * 根据id查询用户
   * @param id
   * @return
   */
  User queryUser(Long id);

  void insertUser();
}
