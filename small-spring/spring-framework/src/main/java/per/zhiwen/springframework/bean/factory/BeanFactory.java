package per.zhiwen.springframework.bean.factory;


import per.zhiwen.springframework.bean.BeansException;

public interface BeanFactory {
    Object getBean(String name) throws BeansException;
}
