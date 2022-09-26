package org.springframework.beans.factory;

/**
 * @since 10
 */
public interface InitializingBean {

    void afterPropertiesSet() throws Exception;
}
