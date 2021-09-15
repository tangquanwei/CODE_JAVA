package lang.annotation;

import org.junit.Test;

/**
 * 注解（Annotation）是Java语言用于工具处理的标注 注解可以配置参数，没有指定配置的参数使用默认值
 * 
 * 框架 = 注解 + 反射 + 设计模式
 * 
 * 过时功能 @Deprecated
 * 
 * 忽略警告 @SuppressWarning
 */

@Deprecated
public class Annotation {
    @Test
    public void testAnnotation() {
        @Report(value="name")
        String string="quanwei";
    }
}


