/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.TypeVariable;
import java.security.ProtectionDomain;
import net.a1d;

/*
 * Renamed from net.ara
 */
public class ara_2 {
    private static int b;

    public static int c() {
        ara_2.b();
        return 80;
    }

    public static Class a(Class clazz) {
        return clazz.getSuperclass();
    }

    public static boolean r(Class clazz) {
        return clazz.isEnum();
    }

    public static Object a(Class clazz, Object object) {
        return clazz.cast(object);
    }

    public static Field a(Class clazz, String string) {
        Class clazz2 = clazz;
        return clazz2.getDeclaredField(a1d.c(clazz2, string));
    }

    public static void b(int n) {
        b = n;
    }

    public static ClassLoader s(Class clazz) {
        return clazz.getClassLoader();
    }

    public static Constructor a(Class clazz, Class[] classArray) {
        return clazz.getDeclaredConstructor(classArray);
    }

    public static int b() {
        return b;
    }

    public static Field[] e(Class clazz) {
        return clazz.getDeclaredFields();
    }

    public static String k(Class clazz) {
        return clazz.getCanonicalName();
    }

    public static Constructor[] j(Class clazz) {
        return clazz.getDeclaredConstructors();
    }

    public static boolean d(Class clazz) {
        return clazz.isInterface();
    }

    public static boolean c(Class clazz, Class clazz2) {
        return clazz.isAnnotationPresent(clazz2);
    }

    public static Method b(Class clazz, String string, Class[] classArray) {
        Class[] classArray2 = classArray;
        Class clazz2 = clazz;
        return clazz2.getDeclaredMethod(a1d.b(string, clazz2, classArray2), classArray2);
    }

    public static Object[] c(Class clazz) {
        return clazz.getEnumConstants();
    }

    public static ProtectionDomain h(Class clazz) {
        return clazz.getProtectionDomain();
    }

    public static Object q(Class clazz) {
        return clazz.newInstance();
    }

    public static InputStream b(Class clazz, String string) {
        return clazz.getResourceAsStream(string);
    }

    public static Method[] f(Class clazz) {
        return clazz.getDeclaredMethods();
    }

    public static Object[] o(Class clazz) {
        return clazz.getSigners();
    }

    public static boolean n(Class clazz) {
        return clazz.desiredAssertionStatus();
    }

    public static boolean b(Class clazz, Object object) {
        return clazz.isInstance(object);
    }

    public static int m(Class clazz) {
        return clazz.getModifiers();
    }

    public static String p(Class clazz) {
        return clazz.getSimpleName();
    }

    public static boolean a(Class clazz, Class clazz2) {
        return clazz.isAssignableFrom(clazz2);
    }

    public static String b(Class clazz) {
        return clazz.getName();
    }

    public static Method a(Class clazz, String string, Class[] classArray) {
        Class[] classArray2 = classArray;
        Class clazz2 = clazz;
        return clazz2.getMethod(a1d.b(string, clazz2, classArray2), classArray2);
    }

    public static Field[] g(Class clazz) {
        return clazz.getFields();
    }

    public static Class i(Class clazz) {
        return clazz.getComponentType();
    }

    public static Class b(Class clazz, Class clazz2) {
        return clazz.asSubclass(clazz2);
    }

    public static Class a(String string) {
        return Class.forName(a1d.a(string));
    }

    public static Constructor b(Class clazz, Class[] classArray) {
        return clazz.getConstructor(classArray);
    }

    static {
        if (ara_2.b() != 0) {
            ara_2.b(36);
        }
    }

    public static TypeVariable[] l(Class clazz) {
        return clazz.getTypeParameters();
    }
}

