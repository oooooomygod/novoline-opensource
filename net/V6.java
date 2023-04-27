/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.acj_1;

public class V6 {
    private static int b;

    public static int b() {
        return b;
    }

    static {
        if (V6.a() == 0) {
            V6.b(22);
        }
    }

    public static void a(String string) {
        acj_1.c(string);
    }

    public static int a() {
        V6.b();
        return 30;
    }

    public static void b(String string, Object[] objectArray) {
        acj_1.d(string, objectArray);
    }

    public static void b(int n) {
        b = n;
    }

    public static void a(String string, Object[] objectArray) {
        acj_1.a(string, objectArray);
    }

    public static void b(String string) {
        acj_1.b(string);
    }

    public static void c(String string) {
        acj_1.d(string);
    }
}

