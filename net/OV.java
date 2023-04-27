/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.Iterator;

public class OV {
    private static int[] b;

    public static void b(int[] nArray) {
        b = nArray;
    }

    public static int[] b() {
        return b;
    }

    public static Iterator a(Iterable iterable) {
        return iterable.iterator();
    }

    static {
        if (OV.b() != null) {
            OV.b(new int[1]);
        }
    }
}

