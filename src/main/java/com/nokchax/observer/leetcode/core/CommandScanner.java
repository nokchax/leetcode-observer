package com.nokchax.observer.leetcode.core;

import com.nokchax.observer.leetcode.core.annotation.Command;
import org.reflections.Reflections;
import org.reflections.scanners.MethodAnnotationsScanner;
import org.reflections.scanners.SubTypesScanner;
import org.reflections.scanners.TypeAnnotationsScanner;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class CommandScanner {
    // scan commands
    private static final List<Class<? extends Annotation>> TARGET_ANNOTATIONS =
            Collections.singletonList(Command.class);

    public static Set<Class<?>> scan(String... packages) {
        // read Command annotation attached class from package

        // make init class (like BeanDefinition)
        return scan(TARGET_ANNOTATIONS, packages);
    }

    public static Set<Class<?>> scan(List<Class<? extends Annotation>> targetAnnotations, String... packages) {
        Reflections reflections = new Reflections(packages, new TypeAnnotationsScanner(), new SubTypesScanner(), new MethodAnnotationsScanner());

        return null;
    }
}
