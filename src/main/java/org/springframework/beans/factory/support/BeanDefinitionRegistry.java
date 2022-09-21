package org.springframework.beans.factory.support;

import org.springframework.beans.factory.config.BeanDefinition;

/**
 * @since 2 BeanDefinition注册表接口
 */
public interface BeanDefinitionRegistry {
    /**
     * 向注册表中注册BeanDefinition
     * @since 2
     * @param beanName
     * @param beanDefinition
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
