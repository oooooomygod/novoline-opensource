/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a3t_0;

class FV {
    static int[] a = new int[a3t_0.values().length];

    static {
        try {
            FV.a[a3t_0.WINDOWS.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            FV.a[a3t_0.OSX.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            FV.a[a3t_0.LINUX.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}

