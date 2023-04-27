/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.aPX;

/*
 * Renamed from net.a2s
 */
class a2s_0 {
    static int[] a = new int[aPX.values().length];

    static {
        try {
            a2s_0.a[aPX.NORMAL.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            a2s_0.a[aPX.COLOR.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            a2s_0.a[aPX.UV.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}

