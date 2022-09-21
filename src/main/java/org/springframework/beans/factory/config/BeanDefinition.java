package org.springframework.beans.factory.config;

/**
 * @since 2 BeanDefinition实例保存bean的信息,包括class类型,方法构造参数,是否为单例,此处简化为只包含class类型
 */
public class BeanDefinition {

    private Class beanClass;

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }
}
