package com.lee.annotation.anli2;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @ClassName:check
 * @Author：Mr.lee
 * @DATE：2019/12/19
 * @TIME： 17:26
 * @Description: TODO
 */
@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface check {
}
