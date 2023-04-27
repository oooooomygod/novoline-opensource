/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.primitives.Floats
 */
package net;

import com.google.common.primitives.Floats;

public class aNS {
    private static boolean b;

    static {
        if (!aNS.b()) {
            aNS.b(true);
        }
    }

    public static boolean a() {
        aNS.b();
        return true;
    }

    public static boolean a(float f) {
        return Floats.isFinite((float)f);
    }

    public static int a(float f, float f2) {
        return Floats.compare((float)f, (float)f2);
    }

    public static void b(boolean bl) {
        b = bl;
    }

    public static boolean b() {
        return b;
    }

    public static Float a(String string) {
        return Floats.tryParse((String)string);
    }
}

