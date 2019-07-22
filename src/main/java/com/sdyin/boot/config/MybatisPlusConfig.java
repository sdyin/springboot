package com.sdyin.boot.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: liuye
 * @Date: 2018/8/13 12:20
 */
@Configuration
@MapperScan({"com.sdyin.boot.mapper", "com.sdyin.boot.*.mapper", "com.sdyin.boot.dao", "com.sdyin.boot.*.dao"})
public class MybatisPlusConfig {

    /**
     * 分页插件，自动识别数据库类型
     * 多租户，请参考官网【插件扩展】
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }
}
