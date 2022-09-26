package org.springframework.beans.factory;

/**
 * @since 10
 */
public interface DisposableBean {

    void destroy() throws Exception;
}
