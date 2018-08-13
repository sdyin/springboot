package com.sdyin.boot.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: liuye
 * @Date: 2018/8/13 12:20
 */
@Configuration
@MapperScan({"com.sdyin.boot.mapper", "com.sdyin.boot.*.mapper", "com.sdyin.boot.dao", "com.sdyin.boot.*.dao"})
public class MybatisPlusConfig {
}
