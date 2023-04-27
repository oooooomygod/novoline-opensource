/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.aET;

class U2 {
    static int[] a = new int[aET.values().length];

    static {
        try {
            U2.a[aET.FILE.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            U2.a[aET.SOUND_EVENT.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}

