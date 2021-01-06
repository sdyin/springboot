package com.sdyin.boot.proxy;

import java.lang.reflect.Proxy;

/**
 * @Description:
 * @Author: liuye
 * @time: 2021/1/6$ 上午11:15$
 */
public class MyDynamicProxy {

    /**
     * 动态代理测试
     * @param args
     */
    public static void main(String[] args) {
        final Hello hello = new HelloServiceImpl();

        final MyInvocationHandler myInvocationHandler = new MyInvocationHandler(hello);
        //构造代理实例
        final Hello proxy = (Hello) Proxy.newProxyInstance(HelloServiceImpl.class.getClassLoader(), HelloServiceImpl.class.getInterfaces(), myInvocationHandler);
        //调用代理方法
        proxy.sayHello();
    }
}
