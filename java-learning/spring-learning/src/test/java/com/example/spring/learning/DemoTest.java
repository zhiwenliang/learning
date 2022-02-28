package com.example.spring.learning;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DemoTest {

    @Autowired
    DemoService demoService;
    @Test
    public void test() {
        demoService.addUser();
    }
}
