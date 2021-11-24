package per.zhiwen.springframework.bean.factory.config;

public interface SingletonBeanRegistry {
    Object getSingleton(String beanName);
}
