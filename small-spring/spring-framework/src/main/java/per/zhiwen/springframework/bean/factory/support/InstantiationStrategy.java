package per.zhiwen.springframework.bean.factory.support;

import per.zhiwen.springframework.bean.BeansException;
import per.zhiwen.springframework.bean.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

public interface InstantiationStrategy {
    Object instantiate(BeanDefinition beanDefinition, String name, Constructor constructor, Object[] args) throws BeansException;
}
