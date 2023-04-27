/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.invoke.StringPropertyInvoker;
import deobf.MCInvoker;
import java.awt.Color;
import java.text.DecimalFormat;
import java.util.Iterator;
import net.MathHelper;
import net.a1V;
import net.a3u_0;
import net.aBC;
import net.aGZ;
import net.aL0;
import net.agh_1;
import net.ahg_0;
import net.ahk_1;
import net.aiy_0;
import net.aol_1;
import net.ava_0;
import net.axq_1;
import net.dz_0;
import net.hb_2;
import net.lx_1;

public class aS4 {
    private static ListInvoker[] b;
    private float d = 0.0f;
    private aiy_0 c;
    private String e;

    public static void b(ListInvoker[] listInvokerArray) {
        b = listInvokerArray;
    }

    public String f() {
        return this.e;
    }

    public aS4(aiy_0 aiy_02, String string) {
        this.e = string;
        this.c = aiy_02;
    }

    public void e() {
        int n;
        float f;
        float f2;
        block15: {
            double d;
            block14: {
                f2 = axq_1.e(lx_1.b(agh_1.c(a3u_0.a(this.c)))) + ListInvoker.indexOf(a3u_0.c(this.c), this) * axq_1.h(lx_1.b(agh_1.c(a3u_0.a(this.c))));
                f = f2 + (float)axq_1.h(lx_1.b(agh_1.c(a3u_0.a(this.c))));
                aS4.b();
                d = MCInvoker.O(MCInvoker.f()) / 13;
                n = axq_1.i(lx_1.b(agh_1.c(a3u_0.a(this.a())))) + agh_1.f(a3u_0.a(this.a()));
                if (!this.d()) break block14;
                if (!(this.d < 3.0f)) break block15;
                this.d = (float)MathHelper.b((double)this.d + 3.0 / d, 0.0, 3.0);
            }
            if (this.d > 0.0f) {
                this.d = (float)MathHelper.b((double)this.d - 3.0 / d, 0.0, 3.0);
            }
        }
        switch (aGZ.a[ahg_0.v(a3u_0.b(this.c)).ordinal()]) {
            case 1: {
                String string;
                double d = ahg_0.x(a3u_0.b(this.c));
                double d2 = (double)((int)(d * 100.0)) / 100.0;
                if (d2 % 1.0 == 0.0) {
                    string = aBC.a(new DecimalFormat(ahk_1.c), d2);
                }
                string = aL0.a(aL0.a(new StringBuilder(), d2), ahk_1.b).toString();
                axq_1.a(lx_1.b(agh_1.c(a3u_0.a(this.a()))), string, (double)(n + a3u_0.f(this.c)) + 29.5, (double)f2 + (double)axq_1.a(lx_1.b(agh_1.c(a3u_0.a(this.c))), 20) * 0.3, -1);
            }
            case 2: {
                if (this.d()) {
                    long l4 = 0L;
                    int n2 = (int)f2 + 1;
                    if ((float)n2 < f - 2.0f) {
                        a1V.b((double)(n + a3u_0.f(this.c) + 28), (double)n2, (double)(n + a3u_0.f(this.c)) + 29.5, (double)(n2 + 1), hb_2.a(l4));
                        l4 -= 120L;
                        ++n2;
                    }
                }
                axq_1.a(lx_1.b(agh_1.c(a3u_0.a(this.a()))), this.e, (double)(n + a3u_0.f(this.c) + 31), (double)f2 + (double)axq_1.a(lx_1.b(agh_1.c(a3u_0.a(this.c))), 20) * 0.3, StringInvoker.d(ahg_0.u(a3u_0.b(this.c)), this.e) ? -1 : aol_1.b(new Color(163, 163, 163, 255)));
            }
            case 3: {
                if (this.d()) {
                    long l5 = 0L;
                    int n3 = (int)f2 + 1;
                    if ((float)n3 < f - 2.0f) {
                        a1V.b((double)(n + a3u_0.f(this.c) + 28), (double)n3, (double)(n + a3u_0.f(this.c)) + 29.5, (double)(n3 + 1), hb_2.a(l5));
                        l5 -= 120L;
                        ++n3;
                    }
                }
                axq_1.a(lx_1.b(agh_1.c(a3u_0.a(this.a()))), this.e, (double)(n + a3u_0.f(this.c) + 31), (double)f2 + (double)axq_1.a(lx_1.b(agh_1.c(a3u_0.a(this.c))), 20) * 0.3, ava_0.b(ahg_0.k(a3u_0.b(this.c)), this.e) ? -1 : aol_1.b(new Color(163, 163, 163, 255)));
            }
        }
    }

    public aS4(aiy_0 aiy_02) {
        this.c = aiy_02;
    }

    public int c() {
        aS4.b();
        int n = 0;
        switch (aGZ.a[ahg_0.v(a3u_0.b(this.c)).ordinal()]) {
            case 1: {
                String string;
                double d = ahg_0.x(a3u_0.b(this.c));
                double d2 = (double)((int)(d * 100.0)) / 100.0;
                if (d2 % 1.0 == 0.0) {
                    string = aBC.a(new DecimalFormat(ahk_1.d), d2);
                }
                string = aL0.a(aL0.a(new StringBuilder(), d2), ahk_1.a).toString();
                return axq_1.a(lx_1.b(agh_1.c(a3u_0.a(this.c))), string);
            }
            case 2: {
                String string;
                Iterator iterator = ListInvoker.iterator(StringPropertyInvoker.a(ahg_0.z(a3u_0.b(this.c))));
                if (dz_0.c(iterator)) {
                    string = (String)dz_0.b(iterator);
                    if (axq_1.a(lx_1.b(agh_1.c(a3u_0.a(this.c))), string) > n) {
                        n = axq_1.a(lx_1.b(agh_1.c(a3u_0.a(this.c))), string);
                    }
                }
            }
            case 3: {
                Iterator iterator = ListInvoker.iterator(ava_0.b(ahg_0.k(a3u_0.b(this.c))));
                if (!dz_0.c(iterator)) break;
                String string = (String)dz_0.b(iterator);
                if (axq_1.a(lx_1.b(agh_1.c(a3u_0.a(this.c))), string) <= n) break;
                n = axq_1.a(lx_1.b(agh_1.c(a3u_0.a(this.c))), string);
            }
        }
        return n;
    }

    static {
        if (aS4.b() != null) {
            aS4.b(new ListInvoker[3]);
        }
    }

    public aiy_0 a() {
        return this.c;
    }

    public boolean d() {
        aS4.b();
        return ListInvoker.indexOf(a3u_0.c(this.c), this) == axq_1.f(lx_1.b(agh_1.c(a3u_0.a(this.c))));
    }

    public static ListInvoker[] b() {
        return b;
    }
}

