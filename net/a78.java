/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.SettingType;

class a78 {
    static int[] a = new int[SettingType.values().length];

    static {
        try {
            a78.a[SettingType.SLIDER.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            a78.a[SettingType.COMBOBOX.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            a78.a[SettingType.SELECTBOX.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            a78.a[SettingType.TEXTBOX.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}

