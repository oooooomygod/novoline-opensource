/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class VT {
    public static boolean a(Method method, Class clazz) {
        return method.isAnnotationPresent(clazz);
    }

    public static void a(Method method, boolean bl) {
        method.setAccessible(bl);
    }

    public static int e(Method method) {
        return method.getModifiers();
    }

    public static Class c(Method method) {
        return method.getDeclaringClass();
    }

    public static Class[] b(Method method) {
        return method.getParameterTypes();
    }

    public static String a(Method method) {
        return method.getName();
    }

    public static Annotation b(Method method, Class clazz) {
        return method.getAnnotation(clazz);
    }

    public static boolean d(Method method) {
        return method.isAccessible();
    }

    public static Object a(Method method, Object object, Object[] objectArray) {
        return method.invoke(object, objectArray);
    }
}

