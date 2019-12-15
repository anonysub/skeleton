package com.cancer.framework.annotation;

import java.lang.annotation.*;

/**
 * log
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Log {
    String value();
}
