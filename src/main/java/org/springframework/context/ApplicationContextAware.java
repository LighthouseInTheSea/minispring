package org.springframework.context;

/**
 * 实现该接口,能感知所属ApplicationContext
 * @since11
 */
public interface ApplicationContextAware {

    void setApplicationContext(ApplicationContext applicationContext);
}
