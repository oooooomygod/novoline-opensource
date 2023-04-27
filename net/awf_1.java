/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.F3;
import net.cs_2;

/*
 * Renamed from net.awF
 */
class awf_1 {
    static int[] a = new int[cs_2.values().length];
    static int[] b;

    static {
        try {
            awf_1.a[cs_2.X.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            awf_1.a[cs_2.Z.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            awf_1.a[cs_2.NONE.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            awf_1.a[cs_2.Y.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        b = new int[F3.values().length];
        try {
            awf_1.b[F3.ACACIA.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            awf_1.b[F3.DARK_OAK.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}

