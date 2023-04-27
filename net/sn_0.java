/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.FontRendererInvoker;
import cc.novoline.invoke.StringInvoker;
import deobf.FontRenderer;
import java.awt.Color;
import net.GO;
import net.MathHelper;
import net.P8;
import net.a7l_0;
import net.aol_1;
import net.sc_0;

/*
 * Renamed from net.Sn
 */
public class sn_0
extends sc_0 {
    private String A;

    @Override
    public void a(int n, int n2, int n3) {
        boolean bl;
        P8.b();
        boolean bl2 = bl = (float)n >= this.x && (float)n < this.x + (float)this.s && (float)n2 >= this.m && (float)n2 < this.m + (float)this.j;
        if (this.l) {
            this.b(bl);
        }
        if (this.u) {
            // empty if block
        }
    }

    public sn_0(int n, FontRenderer fontRenderer, int n2, int n3, int n4, int n5, String string) {
        super(n, fontRenderer, n2, n3, n4, n5);
        this.A = string;
    }

    @Override
    public void k() {
        P8.b();
        if (this.f()) {
            boolean bl;
            a7l_0.a(GO.a, (CharSequence)this.A, this.x - (float)a7l_0.a(GO.a, this.A) - 5.0f, this.m + 5.0f, aol_1.b(new Color(198, 198, 198)));
            this.a(this.x, this.m + 15.0f, this.x + (float)this.s, this.m + 16.0f, aol_1.b(new Color(198, 198, 198)));
            int n = this.o ? this.n : this.t;
            int n2 = this.f - this.r;
            int n3 = this.w - this.r;
            String string = a7l_0.a(GO.a, StringInvoker.a(this.k, this.r), this.l());
            boolean bl2 = bl = n2 >= 0 && n2 <= StringInvoker.c(string);
            if (!this.u || this.v / 6 % 2 == 0) {
                // empty if block
            }
            boolean bl3 = false;
            int n4 = this.q ? (int)this.x + 4 : (int)this.x;
            int n5 = this.q ? (int)this.m + (this.j - 8) / 2 : (int)this.m;
            int n6 = n4;
            if (n3 > StringInvoker.c(string)) {
                n3 = StringInvoker.c(string);
            }
            if (!StringInvoker.g(string)) {
                String string2 = StringInvoker.b(string, 0, n2);
                a7l_0.b(GO.a, string2, n4, n5, n, true);
            }
            boolean bl4 = this.f < StringInvoker.c(this.k) || StringInvoker.c(this.k) >= this.i();
            int n7 = n6;
            n7 = n2 > 0 ? n4 + this.s : n4;
            n7 = n6 - 1;
            --n6;
            if (!StringInvoker.g(string)) {
                // empty if block
            }
            if (n3 != n2) {
                int n8 = n4 + a7l_0.a(GO.a, StringInvoker.b(string, 0, n3));
                this.c(n7, n5 - 1, n8 - 1, n5 + 1 + FontRendererInvoker.d(this.g));
            }
        }
    }

    @Override
    public void g(int n) {
        P8.b();
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
        String string = a7l_0.a(GO.a, StringInvoker.a(this.k, this.r), n3);
        int n4 = StringInvoker.c(string) + this.r;
        if (n == this.r) {
            this.r -= StringInvoker.c(a7l_0.a(GO.a, this.k, n3, true));
        }
        if (n > n4) {
            this.r += n - n4;
        }
        if (n <= this.r) {
            this.r -= this.r - n;
        }
        this.r = MathHelper.a(this.r, 0, n2);
    }
}

