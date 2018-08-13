package com.sdyin.boot.service.impl;

import com.sdyin.boot.mapper.UserMapper;
import com.sdyin.boot.model.User;
import com.sdyin.boot.service.IUserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author liuye
 * @since 2018-08-13
 */
@Service
@Slf4j
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

  /**
   * 根据id查询用户
   * @param id
   * @return
   */
  @Override
  public User queryUser(Long id) {
    log.info("【根据id查询用户】id:{}",id);
    User user = baseMapper.selectById(id);
    return user;
  }
}
