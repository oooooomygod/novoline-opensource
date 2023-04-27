/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.List;
import deobf.EnumFacing;

public class aND {
    private static int b;

    public static boolean b(JE jE) {
        return jE.a();
    }

    public static KM f(JE jE) {
        return jE.e();
    }

    static {
        if (aND.a() != 0) {
            aND.b(119);
        }
    }

    public static void b(int n) {
        b = n;
    }

    public static int b() {
        return b;
    }

    public static int a() {
        aND.b();
        return 109;
    }

    public static HL a(JE jE) {
        return jE.b();
    }

    public static List a(JE jE, EnumFacing enumFacing) {
        return jE.a(enumFacing);
    }

    public static boolean e(JE jE) {
        return jE.d();
    }

    public static boolean c(JE jE) {
        return jE.f();
    }

    public static List d(JE jE) {
        return jE.c();
    }
}

