package pers.zhiwen.bean.demo;

public class BeanDefinition {
    private Object bean;

    public Object getBean() {
        return bean;
    }

    public void setBean(Object bean) {
        this.bean = bean;
    }

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }
}
