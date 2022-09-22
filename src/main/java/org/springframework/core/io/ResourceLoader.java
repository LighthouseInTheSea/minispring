package org.springframework.core.io;
/**
 * @since 6
 * 资源加载接口
 */
public interface ResourceLoader {

    Resource getResource(String location);
}
