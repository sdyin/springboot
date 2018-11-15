package com.sdyin.boot.controller;


import com.sdyin.boot.common.RedisDao;
import com.sdyin.boot.model.User;
import com.sdyin.boot.service.IUserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author liuye
 * @since 2018-08-13
 */
@RestController
@RequestMapping("/user")
public class UserController {
   @Autowired
   private IUserService userService;
   @Autowired
   private RedisDao redisDao;

  @GetMapping(value = "/v1/query_user")
  @ApiOperation(value = "根据id查询用户",notes = "根据id查询用户")
   public User queryUser(@RequestParam("id") Long id){
     //测试redis
     redisDao.setEx("sdyin","sdyin",3, TimeUnit.MINUTES);
     return userService.queryUser(id);
   }

   @GetMapping(value = "/test")
   public void test(){
     userService.insertUser();
   }
}

