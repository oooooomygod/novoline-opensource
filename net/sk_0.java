/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.FontRendererInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MouseInvoker;
import cc.novoline.invoke.ScaledResolutionInvoker;
import cc.novoline.invoke.StringInvoker;
import deobf.FontRenderer;
import deobf.MCInvoker;
import deobf.TimerUtil;
import java.awt.Color;
import net.MathHelper;
import net.ScaledResolution;
import net.a7l_0;
import net.aV3;
import net.adj_1;
import net.afn_2;
import net.ob_0;
import net.sc_0;
import net.we_2;

/*
 * Renamed from net.Sk
 */
public class sk_0
extends sc_0 {
    private TimerUtil A;
    private int C;
    private cc.novoline.utils.fonts.api.FontRenderer E;
    private String D;
    private int B;

    public sk_0(int n, FontRenderer fontRenderer, int n2, int n3, int n4, int n5, String string) {
        super(n, fontRenderer, n2, n3, n4, n5);
        MapInvoker.b();
        this.A = new TimerUtil();
        this.E = we_2.a;
        this.D = string;
        if (ListInvoker.b() != null) {
            MapInvoker.b("NTTwvc");
        }
    }

    public void c(int n) {
        this.C = n;
    }

    @Override
    public void g(int n) {
        MapInvoker.b();
        int n2 = StringInvoker.c(this.k);
        if (n > n2) {
            n = n2;
        }
        if (n < 0) {
            n = 0;
        }
        this.w = n;
        if (this.r > n2) {
            this.r = n2;
        }
        int n3 = this.l();
        String string = a7l_0.a(we_2.a, StringInvoker.a(this.k, this.r), n3);
        int n4 = StringInvoker.c(string) + this.r;
        if (n == this.r) {
            this.r -= StringInvoker.c(a7l_0.a(we_2.a, this.k, n3, true));
        }
        if (n > n4) {
            this.r += n - n4;
            ListInvoker.b(new ListInvoker[2]);
        }
        if (n <= this.r) {
            this.r -= this.r - n;
        }
        this.r = MathHelper.a(this.r, 0, n2);
    }

    public void a(float f, float f2) {
        this.x = f;
        this.m = f2;
    }

    @Override
    public void k() {
        MapInvoker.b();
        if (this.f()) {
            boolean bl;
            ScaledResolution scaledResolution = new ScaledResolution(MCInvoker.f());
            int n = ScaledResolutionInvoker.getScaledWidth(scaledResolution);
            int n2 = ScaledResolutionInvoker.i(scaledResolution);
            int n3 = MouseInvoker.a() * n / MCInvoker.f().displayWidth;
            int n4 = n2 - MouseInvoker.k() * n2 / MCInvoker.f().displayHeight - 1;
            boolean bl2 = (float)n3 >= this.x && (float)n4 >= this.m && (float)n3 < this.x + (float)this.s && (float)n4 < this.m + (float)this.j;
            aV3.a(aV3.a(), (double)this.x, (double)this.m, (double)this.s, (double)this.j, 8.0, 2.0, new Color(18, 18, 18), false);
            a7l_0.a(adj_1.a(ob_0.a, 16), (CharSequence)afn_2.b, this.x + 5.0f, this.m + 5.0f, this.B);
            int n5 = this.o ? this.n : this.t;
            int n6 = this.f - this.r;
            int n7 = this.w - this.r;
            String string = a7l_0.a(we_2.a, StringInvoker.a(this.k, this.r), this.l());
            boolean bl3 = bl = n6 >= 0 && n6 <= StringInvoker.c(string);
            if (!this.u || this.v / 6 % 2 == 0) {
                // empty if block
            }
            boolean bl4 = false;
            int n8 = this.q ? (int)this.x + 4 : (int)this.x;
            int n9 = this.q ? (int)this.m + (this.j - 8) / 2 : (int)this.m;
            int n10 = n8;
            if (n7 > StringInvoker.c(string)) {
                n7 = StringInvoker.c(string);
            }
            if (!StringInvoker.g(string)) {
                String string2 = StringInvoker.b(string, 0, n6);
                a7l_0.a(we_2.a, (CharSequence)string2, (double)(this.x + 5.0f), (double)(this.m + 17.0f), this.B, 1.5f);
            }
            boolean bl5 = this.f < StringInvoker.c(this.k) || StringInvoker.c(this.k) >= this.i();
            int n11 = n10;
            n11 = n6 > 0 ? n8 + this.s : n8;
            n11 = n10 - 1;
            --n10;
            if (!StringInvoker.g(string)) {
                // empty if block
            }
            if (n7 != n6) {
                int n12 = n8 + a7l_0.a(we_2.a, StringInvoker.b(string, 0, n7));
                this.c(n11, n9 - 1, n12 - 1, n9 + 1 + FontRendererInvoker.d(this.g));
            }
        }
    }

    @Override
    public void a(int n, int n2, int n3) {
        boolean bl;
        MapInvoker.b();
        boolean bl2 = bl = (float)n >= this.x && (float)n < this.x + (float)this.s && (float)n2 >= this.m && (float)n2 < this.m + (float)this.j;
        if (this.l) {
            this.b(bl);
        }
        if (this.u) {
            // empty if block
        }
    }

    @Override
    public void b(int n) {
        this.B = n;
    }
}

