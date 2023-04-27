/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.EnumConnectionState;

/*
 * Renamed from net.aix
 */
class aix_2 {
    static int[] a = new int[EnumConnectionState.values().length];

    static {
        try {
            aix_2.a[EnumConnectionState.LOGIN.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            aix_2.a[EnumConnectionState.STATUS.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}

