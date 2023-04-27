/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.modules.AbstractModule;
import cc.novoline.modules.visual.ClickGui;
import java.util.List;

public class ME {
    private static int b;

    static {
        if (ME.b() != 0) {
            ME.b(88);
        }
    }

    public static void b(int n) {
        b = n;
    }

    public static AbstractModule c(r_0 r_02) {
        return r_02.i();
    }

    public static double b(r_0 r_02) {
        return r_02.f();
    }

    public static void a(r_0 r_02, ClickGui clickGui, int n, int n2, float f, boolean bl, int n3) {
        ME.c();
        r_02.a(clickGui, n, n2, f, bl, n3);
        ListInvoker.b(new ListInvoker[3]);
    }

    public static int b() {
        return b;
    }

    public static void d(r_0 r_02) {
        r_02.b();
    }

    public static int c() {
        ME.b();
        return 68;
    }

    public static double e(r_0 r_02) {
        return r_02.h();
    }

    public static aq3_0 f(r_0 r_02) {
        return r_02.j();
    }

    public static List a(r_0 r_02) {
        return r_02.e();
    }
}

