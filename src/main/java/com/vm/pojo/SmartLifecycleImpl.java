package com.vm.pojo;

import org.springframework.context.SmartLifecycle;
import org.springframework.stereotype.Component;

/**
 * @author Vida
 * @date 2024年01月05日 14:55
 * @description
 */
//@Component
public class SmartLifecycleImpl implements SmartLifecycle {
    private boolean isRunning = false;

    @Override
    public void start() {
        System.out.println("SmartLifecycleImpl.start...");
        isRunning = true;
    }

    @Override
    public void stop() {
        System.out.println("SmartLifecycleImpl.stop...");
        isRunning = false;
    }

    @Override
    public boolean isRunning() {
        return isRunning;
    }

    @Override
    public int getPhase() {
        return 1;
    }

    @Override
    public void stop(Runnable callback) {
        System.out.println("SmartLifecycleImpl.stop(Runnable callback)");
        System.out.println(callback);
        SmartLifecycle.super.stop(callback);
    }
}
