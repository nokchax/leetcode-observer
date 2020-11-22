package com.nokchax.observer.leetcode.core.annotation;

import com.nokchax.observer.leetcode.core.authority.Authority;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface CommandMapping {
    String[] commands();
    Authority authority() default Authority.GUEST;
    String description() default "";
}
