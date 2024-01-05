package com.vm.pojo;

import org.springframework.context.Lifecycle;
import org.springframework.stereotype.Component;

/**
 * @author Vida
 * @date 2024年01月05日 13:36
 * @description
 */
//@Component
public class LifecycleImpl implements Lifecycle {
    private boolean isRunning = false;
    @Override
    public void start() {
        System.out.println("LifecycleImpl.start...");
        isRunning = true;
    }

    @Override
    public void stop() {
        System.out.println("LifecycleImpl.stop...");
        isRunning = false;
    }

    @Override
    public boolean isRunning() {
        return isRunning;
    }
}
