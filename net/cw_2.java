/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.utils.fonts.api.FontRenderer;
import cc.novoline.modules.visual.HUD;
import deobf.IntProperty;
import java.lang.invoke.MethodHandles;

/*
 * Renamed from net.cw
 */
public class cw_2 {
    private static long a = a1c.a(3161596692611902362L, 2603709885287326883L, MethodHandles.lookup().lookupClass()).a(57911171633778L);
    private static ListInvoker[] b;

    static {
        if (cw_2.b() != null) {
            cw_2.b(new ListInvoker[2]);
        }
    }

    public static StringProperty u(HUD hUD) {
        return hUD.D();
    }

    public static eu_0 k(HUD hUD) {
        return hUD.F();
    }

    public static int a(HUD hUD, int n, String string) {
        return hUD.a(n, string);
    }

    public static BooleanProperty l(HUD hUD) {
        return hUD.G();
    }

    public static void a(HUD hUD, double d) {
        hUD.b(d);
    }

    public static int x(HUD hUD) {
        return hUD.w();
    }

    public static FontFamily n(HUD hUD) {
        return hUD.M();
    }

    public static ListInvoker[] b() {
        return b;
    }

    public static eu_0 q(HUD hUD) {
        return hUD.B();
    }

    public static IntProperty r(HUD hUD) {
        return hUD.Q();
    }

    public static void a(HUD hUD, int n, String string, double d, double d2, int n2) {
        hUD.b(n, string, d, d2, n2);
    }

    public static StringProperty g(HUD hUD) {
        return hUD.E();
    }

    public static void a(HUD hUD, int n, String string, double d, double d2, int n2, boolean bl, boolean bl2) {
        cw_2.b();
        hUD.a(n, string, d, d2, n2, bl, bl2);
        if (ListInvoker.b() != null) {
            cw_2.b(new ListInvoker[4]);
        }
    }

    public static StringProperty s(HUD hUD) {
        return hUD.k();
    }

    public static StringProperty j(HUD hUD) {
        return hUD.q();
    }

    public static int a(HUD hUD, int n) {
        return hUD.c(n);
    }

    public static boolean e(HUD hUD) {
        return hUD.x();
    }

    public static IntProperty i(HUD hUD) {
        return hUD.o();
    }

    public static StringProperty b(HUD hUD) {
        return hUD.A();
    }

    public static void m(HUD hUD) {
        long l4 = a ^ 0x336CF3EE74E1L;
        long l5 = l4 ^ 0x64673636657DL;
        int n = (int)(l5 >>> 48);
        int n2 = (int)(l5 << 16 >>> 48);
        int n3 = (int)(l5 << 32 >>> 32);
        hUD.h((short)n, (char)n2, n3);
    }

    public static StringProperty y(HUD hUD) {
        return hUD.T();
    }

    public static IntProperty v(HUD hUD) {
        return hUD.V();
    }

    public static FloatProperty c() {
        return HUD.C();
    }

    public static StringProperty f(HUD hUD) {
        return hUD.I();
    }

    public static String h(HUD hUD) {
        return hUD.v();
    }

    public static void z(HUD hUD) {
        hUD.b();
    }

    public static void a(HUD hUD, String string) {
        hUD.e(string);
    }

    public static StringProperty c(HUD hUD) {
        return hUD.J();
    }

    public static void a(HUD hUD, int n, String string, double d, double d2) {
        hUD.b(n, string, d, d2);
    }

    public static void b(HUD hUD, int n, String string, double d, double d2, int n2) {
        hUD.a(n, string, d, d2, n2);
    }

    public static FontRenderer b(HUD hUD, int n) {
        return hUD.a(n);
    }

    public static ListProperty t(HUD hUD) {
        return hUD.W();
    }

    public static eu_0 p(HUD hUD) {
        return hUD.d();
    }

    public static StringProperty A(HUD hUD) {
        return hUD.i();
    }

    public static void b(ListInvoker[] listInvokerArray) {
        b = listInvokerArray;
    }

    public static StringProperty a(HUD hUD) {
        return hUD.O();
    }

    public static void a(HUD hUD, FontRenderer fontRenderer, String string, double d, double d2, boolean bl, boolean bl2, int n, int n2) {
        cw_2.b();
        hUD.a(fontRenderer, string, d, d2, bl, bl2, n, n2);
        ListInvoker.b(new ListInvoker[1]);
    }

    public static boolean d(HUD hUD) {
        return hUD.l();
    }

    public static double o(HUD hUD) {
        return hUD.f();
    }

    public static int w(HUD hUD) {
        return hUD.z();
    }
}

