/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.PC;
import net.ad__0;
import net.ck_1;

public class aU6 {
    private static String[] b;

    static {
        if (aU6.b() != null) {
            aU6.b(new String[4]);
        }
    }

    public static String[] b() {
        return b;
    }

    public static void b(String[] stringArray) {
        b = stringArray;
    }

    public static Object[] a(PC pC, ck_1 ck_12, ad__0 ad__02) {
        return pC.a(ck_12, ad__02);
    }
}

