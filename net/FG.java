/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.Map;

public class FG {
    private static int[] b;

    public static Object a(Map.Entry entry) {
        return entry.getValue();
    }

    public static Object b(Map.Entry entry) {
        return entry.getKey();
    }

    static {
        if (FG.b() != null) {
            FG.b(new int[4]);
        }
    }

    public static int[] b() {
        return b;
    }

    public static void b(int[] nArray) {
        b = nArray;
    }
}

