/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.SettingType;

class aG2 {
    static int[] a = new int[SettingType.values().length];

    static {
        try {
            aG2.a[SettingType.COMBOBOX.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            aG2.a[SettingType.SELECTBOX.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}

