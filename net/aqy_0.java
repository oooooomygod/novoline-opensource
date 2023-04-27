/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.aP2;

/*
 * Renamed from net.aqy
 */
public class aqy_0 {
    private static Integer[] a = aqy_0.b(4096);
    private static int b = 4096;

    public static Integer a(int n) {
        aP2.b();
        return n >= 0 && n < 4096 ? a[n] : new Integer(n);
    }

    private static Integer[] b(int n) {
        Integer[] integerArray = new Integer[n];
        for (int i = 0; i < n; ++i) {
            integerArray[i] = new Integer(i);
        }
        return integerArray;
    }
}

