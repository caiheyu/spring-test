package com.vm;

import com.vm.config.SpringConfig;
import com.vm.pojo.InitAndDestroyBean4;
import com.vm.pojo.LifecycleImpl;
import com.vm.pojo.LifecycleProcessorImpl;
import com.vm.pojo.SmartLifecycleImpl;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

/**
 * @author Vida
 * @date 2024年01月04日 11:32
 * @description
 */
public class LifecycleTest {
    public static ApplicationContext app;
    @BeforeClass
    public static void before(){
        app = new AnnotationConfigApplicationContext(SpringConfig.class);
        if (app instanceof AbstractApplicationContext)
            ((AbstractApplicationContext)app).start();

    }
    @AfterClass
    public static void after(){
        if (app instanceof AbstractApplicationContext)
            ((AbstractApplicationContext)app).stop();
        if (app instanceof AbstractApplicationContext)
            ((AbstractApplicationContext)app).close();
    }

    @Test
    public void test(){
        LifecycleImpl bean = app.getBean(LifecycleImpl.class);
        System.out.println(bean);
    }

    @Test
    public void testLifecycleProcessorImpl(){
        LifecycleProcessorImpl bean = app.getBean(LifecycleProcessorImpl.class);
        System.out.println(bean);
    }

    @Test
    public void testSmartLifecycleImpl(){
        SmartLifecycleImpl bean = app.getBean(SmartLifecycleImpl.class);
        System.out.println(bean);
    }
}
