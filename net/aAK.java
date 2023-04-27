/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.modules.exploits.Disabler;

public class aAK {
    private static String b = "xTjHgb";

    static {
        if (aAK.b() == null) {
            aAK.b("xTjHgb");
        }
    }

    public static boolean a(Disabler disabler, boolean bl) {
        return disabler.a(bl);
    }

    public static boolean a(Disabler disabler) {
        return disabler.g();
    }

    public static void b(Disabler disabler) {
        disabler.b();
    }

    public static boolean c(Disabler disabler) {
        return disabler.a();
    }

    public static void b(String string) {
        b = string;
    }

    public static String b() {
        return b;
    }
}

