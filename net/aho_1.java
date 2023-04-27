/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.KeyboardInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.utils.fonts.api.FontRenderer;
import cc.novoline.gui.alt.AltList;
import deobf.MCInvoker;
import java.awt.Color;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.ahO
 */
public class aho_1
extends ahp_2<ahv_2> {
    private double h;
    private int a = 0;
    private boolean j;
    private double i;
    private String g = aa4_0.a;

    public aho_1(ahv_2 ahv_22) {
        super(ahv_22);
    }

    @Override
    public void a(int n, int n2, int n3) {
        ahr_1.a();
        if (this.a(n, n2) && n3 == 0 && !this.j) {
            this.j = true;
        }
        if (this.j && n3 == 0) {
            this.j = false;
        }
    }

    @Override
    public void a(int n, int n2) {
    }

    @Override
    public void b(int n, int n2) {
        double d = this.e() - 5.0;
        ahr_1.a();
        double d2 = this.a() + 5.0;
        if (this.a(n, n2) || this.j) {
            this.h += (1.0 - this.h) * (double)0.01f;
        }
        this.h -= this.h * (double)0.01f;
        aV3.a(aV3.a(), d, d2, 135.0, 15.0, 10.0, 4.0, new Color(26, 26, 26), avf_2.e((AltList)((ahv_2)this.c()).c()), true);
        if (ListInvoker.b() != null) {
            ahr_1.c(false);
        }
    }

    @Override
    public void c(int n, int n2) {
        FontRenderer fontRenderer;
        double d;
        double d2;
        block4: {
            block5: {
                ahr_1.e();
                d2 = this.e() - 5.0;
                d = this.a() + 5.0;
                float f = 1.0f - MathHelper.d(MathHelper.h((double)((float)MCInvoker.a() % 6000.0f / 6000.0f) * Math.PI * 10.0));
                a7l_0.b(adj_1.a(cf_0.a, 30), aa4_0.d, d2 + 4.0, d + 3.5, a1V.a(new Color(150, 150, 150), new Color(255, 255, 255), this.h), true);
                fontRenderer = adj_1.a(ob_0.a, 20);
                if (!this.j && StringInvoker.g(this.g)) break block4;
                String string = a7l_0.a(fontRenderer, this.g, 90, true);
                a7l_0.b(fontRenderer, string, d2 + 20.0, d + 1.0, -1, true);
                double d3 = d2 + 20.0 + (double)a7l_0.a(fontRenderer, string) + 1.0;
                this.i += (d3 - this.i) * (double)0.1f;
                if (this.j) {
                    a7l_0.b(fontRenderer, aa4_0.c, this.i, d + 2.0, a1V.a(new Color(150, 150, 150, 255), new Color(150, 150, 150, 10), (double)f), true);
                }
                if (!KeyboardInvoker.a(14)) break block5;
                ++this.a;
                if (this.a % 30 != 0 || StringInvoker.g(this.g)) break block4;
                this.g = StringInvoker.b(this.g, 0, StringInvoker.c(this.g) - 1);
                ListInvoker.b(new ListInvoker[3]);
            }
            this.a = 0;
        }
        a7l_0.a(fontRenderer, (CharSequence)aa4_0.b, d2 + 20.0, d + 2.0, a1V.a(new Color(150, 150, 150, 255), new Color(150, 150, 150, 10), this.h));
        this.h = this.a(n, n2) ? this.h + (1.0 - this.h) * (double)0.01f : this.h - this.h * (double)0.01f;
    }

    public boolean a(int n, int n2) {
        ahr_1.a();
        return (double)n > this.e() - 5.0 && (double)n < this.e() - 5.0 + 135.0 && (double)n2 > this.a() + 5.0 && (double)n2 < this.a() + 5.0 + 15.0;
    }

    public String a() {
        return this.g;
    }

    @Override
    public double e() {
        return ((AltList)((ahv_2)this.c()).c()).k() - 200.0 - avf_2.h((AltList)((ahv_2)this.c()).c());
    }

    @Override
    public double a() {
        return ((AltList)((ahv_2)this.c()).c()).q() + 227.0;
    }

    @Override
    public void a(char c, int n) {
        block5: {
            block7: {
                block6: {
                    ahr_1.e();
                    if (!this.j) break block5;
                    if (n != 14) break block6;
                    if (StringInvoker.c(this.g) == 0) break block7;
                    this.g = StringInvoker.b(this.g, 0, StringInvoker.c(this.g) - 1);
                }
                if (n == 1 || n == 28) {
                    this.j = false;
                }
                if (n != 14 && n != 219 && n != 157 && n != 29 && n != 54 && n != 42 && n != 15 && n != 58 && n != 211 && n != 199 && n != 210 && n != 200 && n != 208 && n != 205 && n != 203 && n != 56 && n != 184 && n != 197 && n != 70 && n != 207 && n != 201 && n != 209 && n != 221 && n != 59 && n != 60 && n != 61 && n != 62 && n != 63 && n != 64 && n != 65 && n != 66 && n != 67 && n != 68 && n != 87 && n != 88) {
                    this.g = aL0.a(aL0.a(new StringBuilder(), this.g), c).toString();
                }
            }
            a0I.b(avf_2.a((AltList)((ahv_2)this.c()).c()));
            abe_2.b(amx_1.a((ahv_2)this.c()));
        }
    }
}

