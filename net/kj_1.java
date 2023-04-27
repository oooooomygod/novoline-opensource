/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.F3;
import net.cs_2;

/*
 * Renamed from net.kJ
 */
class kj_1 {
    static int[] a;
    static int[] b;

    static {
        b = new int[cs_2.values().length];
        try {
            kj_1.b[cs_2.X.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            kj_1.b[cs_2.Z.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            kj_1.b[cs_2.NONE.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            kj_1.b[cs_2.Y.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        a = new int[F3.values().length];
        try {
            kj_1.a[F3.OAK.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            kj_1.a[F3.SPRUCE.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            kj_1.a[F3.BIRCH.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            kj_1.a[F3.JUNGLE.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}

