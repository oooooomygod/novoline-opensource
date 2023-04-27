/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.StringInvoker;

/*
 * Renamed from net.Xz
 */
public enum xz_0 {
    TITLE,
    SUBTITLE,
    TIMES,
    CLEAR,
    RESET;


    public static String[] a() {
        String[] stringArray = new String[xz_0.values().length];
        int n = 0;
        for (xz_0 xz_02 : xz_0.values()) {
            stringArray[n++] = StringInvoker.i(xz_02.name());
        }
        return stringArray;
    }

    public static xz_0 a(String string) {
        for (xz_0 xz_02 : xz_0.values()) {
            if (!StringInvoker.d(xz_02.name(), string)) continue;
            return xz_02;
        }
        return TITLE;
    }
}

