/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.Map;
import net.R;

public class I18n {
    private static boolean b;

    public static Map b() {
        return R.a();
    }

    public static String format(String string, Object[] objectArray) {
        return R.a(string, objectArray);
    }

    public static boolean a() {
        I18n.c();
        return true;
    }

    public static boolean c() {
        return b;
    }

    public static void b(boolean bl) {
        b = bl;
    }

    static {
        if (!I18n.c()) {
            I18n.b(true);
        }
    }
}

