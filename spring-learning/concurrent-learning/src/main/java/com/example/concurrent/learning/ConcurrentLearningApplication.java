package com.example.concurrent.learning;

import com.example.concurrent.learning.aqs.LockDemo;

public class ConcurrentLearningApplication {
    public static void main(String[] args) {
        LockDemo lockDemo = new LockDemo();
//        lockDemo.reentrantLockDemo();
        lockDemo.semaphoreDemo();
    }
}
