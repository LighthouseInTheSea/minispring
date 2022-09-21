package org.springframework.beans.factory;

import org.springframework.beans.BeansException;

import java.util.HashMap;
import java.util.Map;

/**
 * @since 1 定义一个简单的bean容器BeanFactory，内部包含一个map用以保存bean，只有注册bean和获取bean两个方法
 * @since 2 bean容器
 */
public interface BeanFactory {
    /**
     * 获取bean
     * @since 2
     * @param name
     * @return
     * @throws BeansException bean不存在时
     */
    Object getBean(String name) throws BeansException;
}
