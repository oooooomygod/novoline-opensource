/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.OH;

/*
 * Renamed from net.ahq
 */
public class ahq_0 {
    private static int[] b;

    public static long a() {
        return OH.a();
    }

    static {
        if (ahq_0.b() != null) {
            ahq_0.b(new int[2]);
        }
    }

    public static String b(String string) {
        return OH.c(string);
    }

    public static boolean a(String string) {
        return OH.a(string);
    }

    public static String a(String string, Object[] objectArray) {
        return OH.a(string, objectArray);
    }

    public static void b(int[] nArray) {
        b = nArray;
    }

    public static int[] b() {
        return b;
    }

    public static String c(String string) {
        return OH.b(string);
    }
}

