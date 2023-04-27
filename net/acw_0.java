/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.SettingType;
import net.ml_0;

/*
 * Renamed from net.acW
 */
class acw_0 {
    static int[] b;
    static int[] a;

    static {
        a = new int[SettingType.values().length];
        try {
            acw_0.a[SettingType.COMBOBOX.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            acw_0.a[SettingType.SELECTBOX.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            acw_0.a[SettingType.TEXTBOX.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        b = new int[ml_0.values().length];
        try {
            acw_0.b[ml_0.DOWN.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            acw_0.b[ml_0.UP.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}

