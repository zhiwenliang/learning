package pers.zhiwen.bean.demo;

import org.junit.jupiter.api.Test;

public class ApplicationTest {
    @Test
    public void testUserService() {
        // Initial BeanFactory
        BeanFactory beanFactory = new BeanFactory();

        // Register bean
        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // invoke userService
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
    }

}
