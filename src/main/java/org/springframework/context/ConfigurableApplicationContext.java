package org.springframework.context;

import org.springframework.beans.BeansException;

public interface ConfigurableApplicationContext extends ApplicationContext {

    /**
     * 刷新容器
     * @since 9
     * @throws BeansException
     */
    void refresh() throws BeansException;
}
