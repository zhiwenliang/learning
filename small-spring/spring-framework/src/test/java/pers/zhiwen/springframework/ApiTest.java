package pers.zhiwen.springframework;

import org.junit.jupiter.api.Test;
import per.zhiwen.springframework.bean.BeansException;
import per.zhiwen.springframework.bean.UserService;
import per.zhiwen.springframework.bean.factory.config.BeanDefinition;
import per.zhiwen.springframework.bean.factory.support.DefaultListableBeanFactory;

public class ApiTest {

    @Test
    public void testBean() throws BeansException {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("UserService", beanDefinition);

        UserService userService = (UserService) beanFactory.getBean("UserService");
        userService.queryUserInfo();

        UserService userService_singleton = (UserService) beanFactory.getBean("UserService");
        userService_singleton.queryUserInfo();
    }
}
