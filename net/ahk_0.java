/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.SettingType;
import net.CU;

/*
 * Renamed from net.aHk
 */
class ahk_0 {
    static int[] a;
    static int[] b;

    static {
        b = new int[SettingType.values().length];
        try {
            ahk_0.b[SettingType.BINDABLE.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            ahk_0.b[SettingType.COMBOBOX.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            ahk_0.b[SettingType.SELECTBOX.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            ahk_0.b[SettingType.CHECKBOX.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            ahk_0.b[SettingType.SLIDER.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            ahk_0.b[SettingType.TEXTBOX.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            ahk_0.b[SettingType.COLOR_PICKER.ordinal()] = 7;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        a = new int[CU.values().length];
        try {
            ahk_0.a[CU.HUE.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            ahk_0.a[CU.SATURATION.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            ahk_0.a[CU.BRIGHTNESS.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}

