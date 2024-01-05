package com.vm.config;

import com.vm.pojo.InitAndDestroyBean3;
import com.vm.pojo.InitAndDestroyBean4;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.DefaultLifecycleProcessor;

/**
 * @author Vida
 * @date 2024年01月04日 11:12
 * @description
 */
@Configuration
@ComponentScan("com.vm")
public class SpringConfig {

//    @Bean(initMethod = "initMethod",destroyMethod = "destoryMethod")
    public InitAndDestroyBean3 getInitAndDestroyBean3(){
        return new InitAndDestroyBean3();
    }

//    @Bean(initMethod = "initMethod2",destroyMethod = "destoryMethod2")
    public InitAndDestroyBean4 getInitAndDestroyBean4(){
        return new InitAndDestroyBean4();
    }

//    @Bean("lifecycleProcessor")
    public DefaultLifecycleProcessor getDefaultLifecycleProcessor(){
        DefaultLifecycleProcessor defaultLifecycleProcessor = new DefaultLifecycleProcessor();
        defaultLifecycleProcessor.setTimeoutPerShutdownPhase(10000);
        return defaultLifecycleProcessor;
    }

}
