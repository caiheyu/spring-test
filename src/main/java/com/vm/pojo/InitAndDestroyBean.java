package com.vm.pojo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author Vida
 * @date 2024年01月04日 11:20
 * @description
 */
//@Component
public class InitAndDestroyBean implements InitializingBean, DisposableBean {
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitAndDestroyBean初始化...");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("InitAndDestroyBean销毁...");
    }
}
