/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.ajH;

/*
 * Renamed from net.avi
 */
class avi_2 {
    static int[] a = new int[ajH.values().length];

    static {
        try {
            avi_2.a[ajH.S.ordinal()] = 1;
            avi_2.a[ajH.T.ordinal()] = 2;
            avi_2.a[ajH.R.ordinal()] = 3;
            avi_2.a[ajH.Q.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }

    avi_2() {
    }
}

