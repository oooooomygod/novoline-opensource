/*
 * Decompiled with CFR 0.152.
 */
package net;

import net._v_0;
import net.arv_0;

public class aMS {
    private static String[] b;

    public static void b(String[] stringArray) {
        b = stringArray;
    }

    public static void a(arv_0 arv_02, _v_0 _v_02) {
        arv_02.a(_v_02);
    }

    public static String[] b() {
        return b;
    }

    public static void a(arv_0 arv_02, int n, _v_0 _v_02) {
        arv_02.a(n, _v_02);
    }

    public static void a(arv_0 arv_02) {
        arv_02.a();
    }

    static {
        if (aMS.b() != null) {
            aMS.b(new String[5]);
        }
    }
}

