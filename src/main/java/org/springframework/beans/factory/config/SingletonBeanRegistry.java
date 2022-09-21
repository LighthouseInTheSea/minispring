package org.springframework.beans.factory.config;

/**
 * @since 2 单例注册表
 */
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);
}
