/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.utils.fonts.api.FontRenderer;
import deobf.GuiLogin;
import deobf.TimerUtil;
import java.awt.Color;
import net.a7l_0;
import net.aL0;
import net.aMz;
import net.aV3;
import net.adj_1;
import net.aw__0;
import net.az1;
import net.qh_1;

/*
 * Renamed from net.Mf
 */
public class mf_0 {
    private double g;
    private TimerUtil d;
    private static String[] c;
    private boolean i;
    private double a;
    private double f;
    GuiLogin b;
    private double e;
    private String h;

    static {
        if (mf_0.b() == null) {
            mf_0.b(new String[3]);
        }
    }

    static String b(mf_0 mf_02) {
        return mf_02.h;
    }

    public mf_0(GuiLogin guiLogin, double d, double d2, double d3, double d4) {
        this.b = guiLogin;
        this.f = d;
        this.a = d2;
        this.e = d3;
        this.g = d4;
        this.d = new TimerUtil();
        this.i = false;
        this.h = az1.c;
    }

    public void b(int n, int n2) {
        mf_0.b();
        this.i = !this.i;
    }

    static boolean a(mf_0 mf_02, boolean bl) {
        mf_02.i = bl;
        return mf_02.i;
    }

    static String a(mf_0 mf_02, String string) {
        mf_02.h = string;
        return mf_02.h;
    }

    public static String[] b() {
        return c;
    }

    public void a(char c, int n) {
        mf_0.b();
        if (this.i) {
            if (n == 1) {
                this.i = false;
            }
            if (n == 14 && !StringInvoker.g(this.h)) {
                this.h = StringInvoker.b(this.h, 0, StringInvoker.c(this.h) - 1);
            }
            if (aw__0.c((CharSequence)StringInvoker.a(c)) && StringInvoker.c(this.h) < 4) {
                this.h = aL0.a(aL0.a(new StringBuilder(), this.h), c).toString();
            }
        }
    }

    public void a(float f, float f2) {
        this.f = f;
        this.a = f2;
    }

    public void c() {
        mf_0.b();
        aV3.a(aV3.a(), this.f, this.a, this.e, this.g, 12.0, 3.0, new Color(18, 18, 18), false);
        FontRenderer fontRenderer = adj_1.a(aMz.a, 16);
        a7l_0.b(fontRenderer, az1.b, this.f + 4.0, this.a + 2.0, 0xFFFFFF, true);
        FontRenderer fontRenderer2 = adj_1.a(aMz.a, 20);
        a7l_0.b(fontRenderer2, this.h, this.f + 4.0, this.a + this.g / 2.0, 0xFFFFFF, true);
        if (this.i) {
            if (!qh_1.c(this.d, 400L)) {
                a7l_0.b(fontRenderer2, az1.a, this.f + 4.0 + (double)a7l_0.a(fontRenderer2, this.h), this.a + this.g / 2.0, 0xFFFFFF, true);
            }
            if (qh_1.c(this.d, 800L)) {
                qh_1.b(this.d);
            }
        }
        if (ListInvoker.b() != null) {
            mf_0.b(new String[3]);
        }
    }

    public static void b(String[] stringArray) {
        c = stringArray;
    }

    static boolean a(mf_0 mf_02) {
        return mf_02.i;
    }

    public boolean a(int n, int n2) {
        mf_0.b();
        return (double)n >= this.f && (double)n <= this.f + this.e && (double)n2 >= this.a && (double)n2 <= this.a + this.g;
    }
}

