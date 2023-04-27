/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.aS1;

/*
 * Renamed from net.Fd
 */
class fd_0 {
    static int[] a = new int[aS1.values().length];

    static {
        try {
            fd_0.a[aS1.LIST.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            fd_0.a[aS1.SCALAR.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            fd_0.a[aS1.MAP.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}

