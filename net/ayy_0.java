/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.lang.reflect.Method;
import net.aVJ;

/*
 * Renamed from net.aYy
 */
public class ayy_0 {
    private static String[] b;

    static {
        if (ayy_0.b() == null) {
            ayy_0.b(new String[1]);
        }
    }

    public static boolean d(aVJ aVJ2) {
        return aVJ2.b();
    }

    public static Class c(aVJ aVJ2) {
        return aVJ2.d();
    }

    public static Method a(aVJ aVJ2) {
        return aVJ2.a();
    }

    public static void b(String[] stringArray) {
        b = stringArray;
    }

    public static String[] b() {
        return b;
    }

    public static void b(aVJ aVJ2) {
        aVJ2.c();
    }
}

