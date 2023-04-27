/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.stream.Stream;

/*
 * Renamed from net.Ms
 */
public class ms_0 {
    private static String[] b;

    public static boolean b(Collection collection, Collection collection2) {
        return collection.containsAll(collection2);
    }

    public static boolean b(Collection collection, Object object) {
        return collection.contains(object);
    }

    public static boolean a(Collection collection, Collection collection2) {
        return collection.addAll(collection2);
    }

    public static Object[] a(Collection collection, Object[] objectArray) {
        return collection.toArray(objectArray);
    }

    public static int d(Collection collection) {
        return collection.size();
    }

    public static String[] b() {
        return b;
    }

    static {
        if (ms_0.b() == null) {
            ms_0.b(new String[1]);
        }
    }

    public static void b(String[] stringArray) {
        b = stringArray;
    }

    public static boolean c(Collection collection, Object object) {
        return collection.add(object);
    }

    public static Iterator a(Collection collection) {
        return collection.iterator();
    }

    public static boolean c(Collection collection) {
        return collection.isEmpty();
    }

    public static void f(Collection collection) {
        collection.clear();
    }

    public static Object[] e(Collection collection) {
        return collection.toArray();
    }

    public static void a(Collection collection, Consumer consumer) {
        collection.forEach(consumer);
    }

    public static Stream b(Collection collection) {
        return collection.stream();
    }

    public static boolean a(Collection collection, Object object) {
        return collection.remove(object);
    }
}

