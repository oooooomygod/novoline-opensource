/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.oz_2;

/*
 * Renamed from net.av8
 */
public class av8_0 {
    private static boolean b;

    public static void b(boolean bl) {
        b = bl;
    }

    public static void a(oz_2 oz_22) {
        oz_22.b();
    }

    static {
        if (!av8_0.a()) {
            av8_0.b(true);
        }
    }

    public static boolean b() {
        return b;
    }

    public static boolean a() {
        av8_0.b();
        return true;
    }
}

