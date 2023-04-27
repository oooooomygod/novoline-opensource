/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Type;

/*
 * Renamed from net.aVx
 */
public class avx_0 {
    private static String b;

    public static String a(Field field) {
        return field.getName();
    }

    static {
        if (avx_0.b() != null) {
            avx_0.b("B8ptM");
        }
    }

    public static Class e(Field field) {
        return field.getType();
    }

    public static String b() {
        return b;
    }

    public static Class c(Field field) {
        return field.getDeclaringClass();
    }

    public static Annotation b(Field field, Class clazz) {
        return field.getAnnotation(clazz);
    }

    public static Object a(Field field, Object object) {
        return field.get(object);
    }

    public static void a(Field field, boolean bl) {
        field.setAccessible(bl);
    }

    public static Type d(Field field) {
        return field.getGenericType();
    }

    public static boolean a(Field field, Class clazz) {
        return field.isAnnotationPresent(clazz);
    }

    public static void b(String string) {
        b = string;
    }

    public static void a(Field field, Object object, Object object2) {
        field.set(object, object2);
    }

    public static void a(Field field, Object object, boolean bl) {
        field.setBoolean(object, bl);
    }

    public static void a(Field field, Object object, int n) {
        field.setInt(object, n);
    }

    public static int b(Field field) {
        return field.getModifiers();
    }

    public static boolean b(Field field, Object object) {
        return field.getBoolean(object);
    }
}

