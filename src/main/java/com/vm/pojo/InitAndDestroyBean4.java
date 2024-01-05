package com.vm.pojo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author Vida
 * @date 2024年01月04日 11:20
 * @description
 */
public class InitAndDestroyBean4 implements InitializingBean, DisposableBean {
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("接口初始化...");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("接口销毁...");
    }
    @PostConstruct
    public void initMethod(){
        System.out.println("注解初始化...");
    }

    @PreDestroy
    public void destoryMethod(){
        System.out.println("注解销毁...");
    }

    public void initMethod2(){
        System.out.println("配置初始化...");
    }

    public void destoryMethod2(){
        System.out.println("配置销毁...");
    }
}
