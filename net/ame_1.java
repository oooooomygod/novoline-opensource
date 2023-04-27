/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.P8;

/*
 * Renamed from net.amE
 */
public class ame_1 {
    private static Integer[] a = new Integer[65535];

    static {
        int n = a.length;
        for (int i = 0; i < n; ++i) {
            ame_1.a[i] = P8.d(i);
        }
    }

    public static Integer a(int n) {
        return n < a.length ? a[n] : P8.d(n);
    }
}

