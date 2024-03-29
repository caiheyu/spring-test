package com.vm;

import com.vm.config.SpringConfig;
import com.vm.pojo.InitAndDestroyBean2;
import com.vm.pojo.InitAndDestroyBean3;
import com.vm.pojo.InitAndDestroyBean4;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Vida
 * @date 2024年01月04日 11:32
 * @description
 */
public class InitAndDestroyBeanTest {
    public static ApplicationContext app;
    @BeforeClass
    public static void before(){
        app = new AnnotationConfigApplicationContext(SpringConfig.class);
    }
    @AfterClass
    public static void after(){
        if (app instanceof AbstractApplicationContext)
            ((AbstractApplicationContext)app).close();
    }

    @Test
    public void test(){
        InitAndDestroyBean4 bean = app.getBean(InitAndDestroyBean4.class);
        System.out.println(bean);
    }
}
