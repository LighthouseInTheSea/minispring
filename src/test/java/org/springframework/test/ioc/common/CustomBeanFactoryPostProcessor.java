package org.springframework.test.ioc.common;

import org.springframework.beans.PropertyValue;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;

public class CustomBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) {
        BeanDefinition personBeanDefiniton = beanFactory.getBeanDefinition("person");
        PropertyValues propertyValues = personBeanDefiniton.getPropertyValues();
        // 将person的name属性修改为ivy
        propertyValues.addPropertyValue(new PropertyValue("name","ivy"));
    }
}
