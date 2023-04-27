/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.EnumPlayerType;

/*
 * Renamed from net.arI
 */
class ari_1 {
    static int[] a = new int[EnumPlayerType.values().length];

    static {
        try {
            ari_1.a[EnumPlayerType.TARGET.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            ari_1.a[EnumPlayerType.FRIEND.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}

