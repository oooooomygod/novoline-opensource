/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class aS0 {
    private static String b;

    static {
        if (aS0.b() != null) {
            aS0.b("cYhIb");
        }
    }

    public static void e(Set set) {
        set.clear();
    }

    public static int d(Set set) {
        return set.size();
    }

    public static Object[] a(Set set, Object[] objectArray) {
        return set.toArray(objectArray);
    }

    public static boolean b(Set set, Collection collection) {
        return set.removeAll(collection);
    }

    public static boolean c(Set set, Object object) {
        return set.contains(object);
    }

    public static boolean b(Set set) {
        return set.isEmpty();
    }

    public static void b(String string) {
        b = string;
    }

    public static boolean a(Set set, Object object) {
        return set.remove(object);
    }

    public static Stream c(Set set) {
        return set.stream();
    }

    public static boolean c(Set set, Collection collection) {
        return set.retainAll(collection);
    }

    public static Iterator f(Set set) {
        return set.iterator();
    }

    public static boolean a(Set set, Collection collection) {
        return set.addAll(collection);
    }

    public static boolean a(Set set, Predicate predicate) {
        return set.removeIf(predicate);
    }

    public static String b() {
        return b;
    }

    public static Object[] a(Set set) {
        return set.toArray();
    }

    public static boolean b(Set set, Object object) {
        return set.add(object);
    }
}

