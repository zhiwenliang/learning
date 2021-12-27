package com.example.concurrent.learning;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ConcurrentLearningApplication {
    public static void main(String[] args) {
        ThreadPoolExecutor pool = new ThreadPoolExecutor(8, 8, 60 * 60, TimeUnit.SECONDS, new LinkedBlockingQueue<>());
    }
}
