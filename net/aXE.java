/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.KU;

public class aXE {
    private static String b = "SgGxr";

    static {
        if (aXE.b() == null) {
            aXE.b("SgGxr");
        }
    }

    public static void a(KU kU, int n, int n2) {
        kU.b(n, n2);
    }

    public static void b(String string) {
        b = string;
    }

    public static String b() {
        return b;
    }
}

