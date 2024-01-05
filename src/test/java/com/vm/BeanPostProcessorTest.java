package com.vm;

import com.vm.config.SpringConfig;
import com.vm.pojo.BeanPostProcessorImpl;
import com.vm.pojo.InitAndDestroyBean4;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

/**
 * @author Vida
 * @date 2024年01月05日 17:47
 * @description
 */
public class BeanPostProcessorTest {
    public static ApplicationContext app;
    @BeforeClass
    public static void before(){
        app = new AnnotationConfigApplicationContext(SpringConfig.class);
        if (app instanceof AbstractApplicationContext)
            ((AbstractApplicationContext)app).registerShutdownHook();

    }

    @Test
    public void test(){
        SpringConfig bean = app.getBean(SpringConfig.class);
        System.out.println(bean);
    }

}
