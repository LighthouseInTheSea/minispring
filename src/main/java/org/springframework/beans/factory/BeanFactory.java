package org.springframework.beans.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * @since 1 定义一个简单的bean容器BeanFactory，内部包含一个map用以保存bean，只有注册bean和获取bean两个方法
 */
public class BeanFactory {

    private Map<String,Object> beanMap = new HashMap<>();

    public void registerBean(String name, Object bean) {
        beanMap.put(name,bean);
    }

    public Object getBean(String name) {
        return beanMap.get(name);
    }
}
