/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.ModuleInvoker;
import cc.novoline.invoke.StringPropertyInvoker;
import cc.novoline.invoke.SystemInvoker;
import cc.novoline.modules.visual.HUD;
import deobf.ModuleRegistry;
import deobf.TimerUtil;
import java.awt.Color;

/*
 * Renamed from net.asX
 */
public enum asx_1 {
    BLACK(-16711423),
    BLUE(-12028161),
    DARKBLUE(-12621684),
    GREEN(-9830551),
    DARKGREEN(-9320847),
    WHITE(-65794),
    AQUA(-7820064),
    DARKAQUA(-12621684),
    GREY(-9868951),
    DARKGREY(-14342875),
    RED(-65536),
    DARKRED(-8388608),
    ORANGE(-29696),
    DARKORANGE(-2263808),
    YELLOW(-256),
    DARKYELLOW(-2702025),
    MAGENTA(-18751),
    DARKMAGENTA(-2252579);

    private int b;
    private static double c = 0.7;

    public int b(double d) {
        return asx_1.a(this.b, d);
    }

    public static int a(int n) {
        Color color = new Color(n);
        float[] fArray = aol_1.a(aol_1.c(color), aol_1.g(color), aol_1.f(color), new float[3]);
        Color color2 = aol_1.b(fArray[0], fArray[1], 1.0f);
        Color color3 = aol_1.b(fArray[0], fArray[1], 0.455f);
        return asx_1.a(aol_1.b(color2), aol_1.b(color3), 0L, 2400L, 1200.0);
    }

    public static Color a(long l4) {
        return new Color(asx_1.b(l4));
    }

    public static int b(int n, int n2, double d) {
        TimerUtil.e();
        if (d > 1.0) {
            d = 1.0 - d % 1.0;
        }
        return asx_1.a(n, n2, d);
    }

    public static int a(int n, double d) {
        Color color = new Color(n);
        return aol_1.b(new Color(MathInvoker.max((int)((double)aol_1.c(color) * d), 0), MathInvoker.max((int)((double)aol_1.g(color) * d), 0), MathInvoker.max((int)((double)aol_1.f(color) * d), 0), aol_1.e(color)));
    }

    public static int b(int n, int n2) {
        return asx_1.a(n, n2, 0L);
    }

    public static int a(int n, int n2, long l4, long l5, double d) {
        return asx_1.b(n, n2, (double)((SystemInvoker.f() + l4) % l5) / d);
    }

    public static int a(long l4, float f, float f2) {
        double d = MathInvoker.j((SystemInvoker.f() + l4) / 16L);
        return aol_1.b(aol_1.b((float)(d %= 360.0) / 360.0f, f, f2));
    }

    public static int a(int n, int n2) {
        Color color = new Color(n);
        return asx_1.a(aol_1.c(color), aol_1.g(color), aol_1.f(color), n2);
    }

    public int a() {
        return asx_1.b(this.b);
    }

    public static int b(long l4) {
        HUD hUD = (HUD)ModuleInvoker.isEnable(ModuleRegistry.HUD);
        TimerUtil.e();
        StringProperty stringProperty = cw_2.g(hUD);
        if (StringPropertyInvoker.isMode(stringProperty, aok_2.k)) {
            return P8.b(aUL.f(cw_2.k(hUD)));
        }
        if (StringPropertyInvoker.isMode(stringProperty, aok_2.g)) {
            return asx_1.c(l4);
        }
        if (StringPropertyInvoker.isMode(stringProperty, aok_2.c)) {
            return asx_1.a(0);
        }
        if (StringPropertyInvoker.isMode(stringProperty, aok_2.n)) {
            return asx_1.a(P8.b(aUL.f(cw_2.q(hUD))), P8.b(aUL.f(cw_2.p(hUD))), l4);
        }
        if (StringPropertyInvoker.isMode(stringProperty, aok_2.u)) {
            float[] fArray = aUL.e(cw_2.k(hUD));
            return asx_1.a(l4, fArray[1], fArray[2]);
        }
        return asx_1.WHITE.b;
    }

    public static int c(long l4) {
        float[] fArray = aUL.e(cw_2.k((HUD)ModuleInvoker.isEnable(ModuleRegistry.HUD)));
        Color color = aol_1.b(fArray[0], fArray[1], 1.0f);
        Color color2 = aol_1.b(fArray[0], fArray[1], 0.455f);
        return asx_1.a(aol_1.b(color), aol_1.b(color2), l4, 2400L, 1200.0);
    }

    public static int d(long l4) {
        float[] fArray = aUL.e(cw_2.k((HUD)ModuleInvoker.isEnable(ModuleRegistry.HUD)));
        double d = MathInvoker.j((SystemInvoker.f() + l4) / 11L);
        return aol_1.b(aol_1.b((float)(d %= 360.0) / 360.0f, fArray[1], fArray[2]));
    }

    public static int a(int n, int n2, double d) {
        double d2 = 1.0 - d;
        int n3 = (int)((double)(n >> 16 & 0xFF) * d2 + (double)(n2 >> 16 & 0xFF) * d);
        int n4 = (int)((double)(n >> 8 & 0xFF) * d2 + (double)(n2 >> 8 & 0xFF) * d);
        int n5 = (int)((double)(n & 0xFF) * d2 + (double)(n2 & 0xFF) * d);
        int n6 = (int)((double)(n >> 24 & 0xFF) * d2 + (double)(n2 >> 24 & 0xFF) * d);
        return (n6 & 0xFF) << 24 | (n3 & 0xFF) << 16 | (n4 & 0xFF) << 8 | n5 & 0xFF;
    }

    private asx_1(int n2) {
        this.b = n2;
    }

    public static int a(int n, int n2, long l4) {
        return asx_1.b(n, n2, (double)((SystemInvoker.f() + l4) % 4000L) / 2000.0);
    }

    public static int a(int[] nArray, double d) {
        TimerUtil.e();
        int n = nArray.length;
        if (d == 1.0) {
            return nArray[0];
        }
        if (d == 0.0) {
            return nArray[n - 1];
        }
        double d2 = MathInvoker.d(0.0, (1.0 - d) * (double)(n - 1));
        int n2 = (int)d2;
        return asx_1.b(nArray[n2], nArray[n2 + 1], d2 - (double)n2);
    }

    public int a(double d) {
        return asx_1.b(this.b, d);
    }

    public static int a(int n, int n2, int n3) {
        return asx_1.a(n, n2, n3, 255);
    }

    public int c() {
        return asx_1.c(this.b);
    }

    public static int c(int n) {
        Color color = new Color(n);
        return aol_1.b(new Color(MathInvoker.max((int)((double)aol_1.c(color) * 0.7), 0), MathInvoker.max((int)((double)aol_1.g(color) * 0.7), 0), MathInvoker.max((int)((double)aol_1.f(color) * 0.7), 0), aol_1.e(color)));
    }

    public static int b(int n) {
        Color color = new Color(n);
        return aol_1.b(new Color(MathInvoker.b((int)((double)aol_1.c(color) / 0.7), 255), MathInvoker.b((int)((double)aol_1.g(color) / 0.7), 255), MathInvoker.b((int)((double)aol_1.f(color) / 0.7), 255), aol_1.e(color)));
    }

    public static int b(int n, double d) {
        Color color = new Color(n);
        return aol_1.b(new Color(MathInvoker.b((int)((double)aol_1.c(color) / d), 255), MathInvoker.b((int)((double)aol_1.g(color) / d), 255), MathInvoker.b((int)((double)aol_1.f(color) / d), 255), aol_1.e(color)));
    }

    public static int a(int n, int n2, int n3, int n4) {
        int n5 = MathHelper.a(n4, 0, 255) << 24;
        n5 |= MathHelper.a(n, 0, 255) << 16;
        n5 |= MathHelper.a(n2, 0, 255) << 8;
        return n5 |= MathHelper.a(n3, 0, 255);
    }

    public int b() {
        return this.b;
    }
}

