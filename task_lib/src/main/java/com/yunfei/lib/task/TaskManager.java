package com.yunfei.lib.task;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class TaskManager {
    static final int MAX_PART_COUNT = 2;
    /**
     * 线程控制器
     */
    private ExecutorService executor;

    public TaskManager() {
        executor = Executors.newCachedThreadPool(new ThreadFactory() {
            private AtomicInteger count = new AtomicInteger();

            @Override
            public Thread newThread(final Runnable r) {
                final int number = count.incrementAndGet();
                return new Thread(new Runnable() {
                    @Override
                    public void run() {
                        r.run();
                    }
                }, "Task   " + number);
            }
        });
    }
}
