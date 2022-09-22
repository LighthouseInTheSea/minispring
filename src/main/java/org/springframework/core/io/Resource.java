package org.springframework.core.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * @since 6
 * 资源的抽象金和访问接口
 */
public interface Resource {

    InputStream getInputStream() throws IOException;
}
