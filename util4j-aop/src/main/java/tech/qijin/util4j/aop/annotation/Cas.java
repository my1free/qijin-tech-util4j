package tech.qijin.util4j.aop.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 重试注解
 * @author yangshangqiang
 * @date 2018/11/2
 * 开始做眼保健操：←_← ↑_↑ →_→ ↓_↓
 **/
@Target(ElementType.METHOD) //用{}包围，逗号分隔
@Retention(RetentionPolicy.RUNTIME)
public @interface Cas {
    //重试次数，默认为3
    int times() default 3;

    //重复的间隔时间，单位为毫秒
    int interval() default 0;
}
