package com.sdyin.boot.proxy;

/**
 * @Description:
 * @Author: liuye
 * @time: 2021/1/6$ 上午11:15$
 */
public class HelloServiceImpl implements Hello{
    @Override
    public void sayHello() {
        System.out.println("hello sdyin");
    }
}
