package com.sdyin.boot.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.sdyin.boot.mapper.UserMapper;
import com.sdyin.boot.model.User;
import com.sdyin.boot.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import java.util.ArrayList;
import java.util.List;

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

  @Transactional(rollbackFor = Exception.class)
  @Override
  public void insertUser() {

    User user1 = new User();
    user1.setName("lisa");
    user1.setAge(20);
    User user2 = new User();
    user2.setName("mike");
    user2.setAge(22);
    User user3 = new User();
    user3.setName("sdyin");
    user3.setAge(24);
    List<User> users = new ArrayList<>();
    users.add(user1);
    users.add(user2);
    users.add(user3);

    try {
      users.stream().forEach(
              item-> baseMapper.insert(item)
      );
    } catch (Exception e) {
      System.out.println("exception:"+ e );
      TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
      return;
    }

  }
}
