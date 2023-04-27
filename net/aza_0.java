/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.EnumPlayerType;

/*
 * Renamed from net.aZa
 */
class aza_0 {
    static int[] a = new int[EnumPlayerType.values().length];

    static {
        try {
            aza_0.a[EnumPlayerType.FRIEND.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            aza_0.a[EnumPlayerType.TARGET.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}

