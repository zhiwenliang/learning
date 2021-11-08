package com.example.beandemo;

import org.junit.jupiter.api.Test;
public class ApiTest {
    @Test
    public void testBeanFactory() {
        // 初始化 BeanFactory
        BeanFactory beanFactory = new BeanFactory();

        // 注册 Bean
        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 获取 Bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
    }
}
