package com.vm.pojo;

import org.springframework.context.LifecycleProcessor;
import org.springframework.stereotype.Component;

/**
 * @author Vida
 * @date 2024年01月05日 14:14
 * @description
 */
//@Component("lifecycleProcessor")
public class LifecycleProcessorImpl implements LifecycleProcessor {
    private boolean isRunning = false;

    @Override
    public void onRefresh() {
        System.out.println("LifecycleProcessorImpl.onRefresh...");
        isRunning = true;
    }

    @Override
    public void onClose() {
        System.out.println("LifecycleProcessorImpl.onClose...");
        isRunning = false;
    }

    @Override
    public void start() {
        System.out.println("LifecycleProcessorImpl.start...");
        isRunning = true;
    }

    @Override
    public void stop() {
        System.out.println("LifecycleProcessorImpl.stop...");
        isRunning = false;
    }

    @Override
    public boolean isRunning() {
        return isRunning;
    }
}
