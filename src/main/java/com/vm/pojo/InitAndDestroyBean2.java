package com.vm.pojo;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author Vida
 * @date 2024年01月04日 11:50
 * @description
 */
@Component
public class InitAndDestroyBean2 {
    @PostConstruct
    public void initMethod(){
        System.out.println("InitAndDestroyBean2初始化...");
    }

    @PreDestroy
    public void destoryMethod(){
        System.out.println("InitAndDestroyBean2销毁...");
    }
}
