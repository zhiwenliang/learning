package com.example.concurrent.learning;

import java.util.concurrent.Callable;

public class Thread3 implements Callable<String> {
    @Override
    public String call() throws Exception {
        System.out.println("Thread3 is running.");
        return "result";
    }
}
