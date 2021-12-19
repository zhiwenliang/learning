package per.zhiwen.springframework.bean.factory.support;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.NoOp;
import per.zhiwen.springframework.bean.BeansException;
import per.zhiwen.springframework.bean.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

public class CglibSubclassingInstantiationStrategy implements InstantiationStrategy {
    @Override
    public Object instantiate(BeanDefinition beanDefinition, String name, Constructor constructor, Object[] args) throws BeansException {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(beanDefinition.getBeanClass());
        enhancer.setCallback(new NoOp(){
            @Override
            public int hashCode() {
                return super.hashCode();
            }
        });
        if (null == constructor) {
            return enhancer.create();
        }
        return enhancer.create(constructor.getParameterTypes(), args);
    }
}
