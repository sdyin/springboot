package com.sdyin.boot.service.impl;

import com.sdyin.boot.model.Customer;
import com.sdyin.boot.mapper.CustomerMapper;
import com.sdyin.boot.service.ICustomerService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author liuye
 * @since 2020-07-02
 */
@Service
public class CustomerServiceImpl extends ServiceImpl<CustomerMapper, Customer> implements ICustomerService {

}
