/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

/*
 * Renamed from net.akR
 */
public class akr_1 {
    private static String[] b;

    public static boolean b(ArrayList arrayList, Object object) {
        return arrayList.remove(object);
    }

    public static void c(ArrayList arrayList) {
        arrayList.clear();
    }

    public static Object a(ArrayList arrayList, int n, Object object) {
        return arrayList.set(n, object);
    }

    public static void a(ArrayList arrayList, Consumer consumer) {
        arrayList.forEach(consumer);
    }

    public static Object a(ArrayList arrayList, int n) {
        return arrayList.get(n);
    }

    public static String[] b() {
        return b;
    }

    static {
        if (akr_1.b() == null) {
            akr_1.b(new String[4]);
        }
    }

    public static boolean a(ArrayList arrayList, Collection collection) {
        return arrayList.addAll(collection);
    }

    public static void b(ArrayList arrayList, int n, Object object) {
        arrayList.add(n, object);
    }

    public static boolean b(ArrayList arrayList) {
        return arrayList.isEmpty();
    }

    public static int d(ArrayList arrayList) {
        return arrayList.size();
    }

    public static Object b(ArrayList arrayList, int n) {
        return arrayList.remove(n);
    }

    public static boolean a(ArrayList arrayList, Object object) {
        return arrayList.add(object);
    }

    public static Object[] a(ArrayList arrayList, Object[] objectArray) {
        return arrayList.toArray(objectArray);
    }

    public static void b(String[] stringArray) {
        b = stringArray;
    }

    public static Iterator a(ArrayList arrayList) {
        return arrayList.iterator();
    }
}

