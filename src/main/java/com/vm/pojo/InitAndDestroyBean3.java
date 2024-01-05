package com.vm.pojo;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author Vida
 * @date 2024年01月04日 11:50
 * @description
 */
public class InitAndDestroyBean3 {
    public void initMethod(){
        System.out.println("InitAndDestroyBean3初始化...");
    }

    public void destoryMethod(){
        System.out.println("InitAndDestroyBean3销毁...");
    }
}
