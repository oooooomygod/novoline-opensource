/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.Iterator;
import java.util.Set;
import net.zk_2;

public class a82 {
    private static int[] b;

    public static void a(zk_2 zk_22, int n, Object object, Object object2) {
        zk_22.a(n, object, object2);
    }

    public static Iterator a(zk_2 zk_22) {
        return zk_22.iterator();
    }

    public static int c(zk_2 zk_22, Object object) {
        return (int)zk_22.a(object);
    }

    public static void b(zk_2 zk_22) {
        zk_22.a();
    }

    public static Object b(zk_2 zk_22, Object object) {
        return zk_22.b(object);
    }

    public static int[] b() {
        return b;
    }

    static {
        if (a82.b() != null) {
            a82.b(new int[1]);
        }
    }

    public static boolean d(zk_2 zk_22, Object object) {
        return (boolean)zk_22.a(object);
    }

    public static Set c(zk_2 zk_22) {
        return zk_22.b();
    }

    public static void b(int[] nArray) {
        b = nArray;
    }

    public static Object a(zk_2 zk_22, int n) {
        return zk_22.a(n);
    }

    public static Object a(zk_2 zk_22, Object object) {
        return zk_22.a(object);
    }
}

