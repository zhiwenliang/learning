package com.example.concurrent.learning.aqs;

import com.google.common.util.concurrent.ThreadFactoryBuilder;

import java.util.concurrent.*;
import java.util.concurrent.locks.ReentrantLock;

public class LockDemo {

    private static final ThreadFactory threadFactory = new ThreadFactoryBuilder().setNameFormat("pool-%d").build();

    private static final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
            8, 8, 30, TimeUnit.SECONDS,
            new LinkedBlockingQueue<>(), threadFactory, new ThreadPoolExecutor.AbortPolicy());

    private static final ReentrantLock reentrantLock = new ReentrantLock();

    private static final Semaphore semaphore = new Semaphore(10);

    private String resource = "resource";

    public void reentrantLockDemo() {
        for (int i = 0; i < 9; i++) {
            System.out.printf("execute thread-%d\n", i);
            try {
                reentrantLock.lock();
                System.out.println("1st lock");
                System.out.println("2nd lock");
                reentrantLock.lock();
                System.out.println("execute...");
                resource = "get resource";
                System.out.println(resource);
            } finally {
                reentrantLock.unlock();
                System.out.println("release 1st lock");
                reentrantLock.unlock();
                System.out.println("release 2nd lock");
            }
        }
    }

    public void semaphoreDemo() {
        try {
            for (int i = 0; i < 100; i++) {
                if(semaphore.availablePermits() == 0){
                    System.out.println("waiting...");
                }
                semaphore.acquire();
                synchronized (this) {
                    resource = "get resource - " + i;
                    System.out.println(resource);
                }
                semaphore.release();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
