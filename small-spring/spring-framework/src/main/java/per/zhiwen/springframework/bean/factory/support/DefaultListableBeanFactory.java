package per.zhiwen.springframework.bean.factory.support;


import per.zhiwen.springframework.bean.BeansException;
import per.zhiwen.springframework.bean.factory.config.BeanDefinition;

import java.util.HashMap;
import java.util.Map;

public class DefaultListableBeanFactory extends AbstractAutowiredCapableBeanFactory implements BeanDefinitionRegistry {
    private Map<String, BeanDefinition> beanDefinitionMap = new HashMap<>();

    @Override
    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(beanName, beanDefinition);
    }

    @Override
    public BeanDefinition getBeanDefinition(String beanName) throws BeansException {
        BeanDefinition beanDefinition = beanDefinitionMap.get(beanName);
        if (beanDefinition == null)
            throw new BeansException("No bean named '" + beanName + "' is defined.");
        return beanDefinition;
    }

    @Override
    public Object getBean(String name, Object... args) throws BeansException {
        return null;
    }
}
