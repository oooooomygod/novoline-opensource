/*
 * Decompiled with CFR 0.152.
 */
package net;

import javax.sound.sampled.FloatControl;

public class aFH {
    private static String[] b;

    static {
        if (aFH.b() == null) {
            aFH.b(new String[2]);
        }
    }

    public static void a(FloatControl floatControl, float f) {
        floatControl.setValue(f);
    }

    public static String[] b() {
        return b;
    }

    public static void b(String[] stringArray) {
        b = stringArray;
    }
}

