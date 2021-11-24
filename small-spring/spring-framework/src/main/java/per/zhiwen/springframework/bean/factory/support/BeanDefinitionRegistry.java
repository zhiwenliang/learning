package per.zhiwen.springframework.bean.factory.support;


import per.zhiwen.springframework.bean.BeansException;
import per.zhiwen.springframework.bean.factory.config.BeanDefinition;

public interface BeanDefinitionRegistry {
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);

    BeanDefinition getBeanDefinition(String beanName) throws BeansException;
}
