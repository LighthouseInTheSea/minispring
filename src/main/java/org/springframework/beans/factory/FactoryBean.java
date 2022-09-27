package org.springframework.beans.factory;

/**
 * @since 13
 */
public interface FactoryBean<T> {

    T getObject() throws Exception;

    boolean isSingleton();
}
