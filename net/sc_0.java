/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.FontRendererInvoker;
import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.invoke.TessellatorInvoker;
import cc.novoline.invoke.WorldRendererInvoker;
import deobf.DefaultVertexFormats;
import deobf.FontRenderer;
import deobf.Tessellator;
import net.minecraft.renderer.WorldRenderer;
import java.util.function.Predicate;

/*
 * Renamed from net.Sc
 */
public class sc_0
extends Gui {
    public float m;
    protected int j;
    protected int f;
    protected boolean u;
    protected int v;
    protected Predicate<String> y;
    public float x;
    protected int r;
    protected String k = mi_0.f;
    protected boolean p = true;
    protected int n = 0xE0E0E0;
    protected aYM i;
    protected boolean o = true;
    protected boolean l = true;
    protected int z;
    private int h = 64;
    protected int w;
    protected FontRenderer g;
    protected boolean q = true;
    protected int s;
    protected int t = 0x707070;

    public void k() {
        if (this.f()) {
            if (this.d()) {
                this.a(this.x - 1.0f, this.m - 1.0f, this.x + (float)this.s + 1.0f, this.m + (float)this.j + 1.0f, -6250336);
                this.a(this.x, this.m, this.x + (float)this.s, this.m + (float)this.j, -16777216);
            }
            int n = this.o ? this.n : this.t;
            int n2 = this.f - this.r;
            int n3 = this.w - this.r;
            String string = FontRendererInvoker.a(this.g, StringInvoker.a(this.k, this.r), this.l());
            boolean bl = n2 <= StringInvoker.c(string);
            boolean bl2 = this.u && this.v / 6 % 2 == 0;
            int n4 = (int)(this.q ? this.x + 4.0f : this.x);
            int n5 = (int)(this.q ? this.m + (float)((this.j - 8) / 2) : this.m);
            int n6 = n4;
            if (n3 > StringInvoker.c(string)) {
                n3 = StringInvoker.c(string);
            }
            if (!StringInvoker.g(string)) {
                String string2 = StringInvoker.b(string, 0, n2);
                n6 = FontRendererInvoker.drawStringWithShadow(this.g, string2, n4, n5, n);
            }
            boolean bl3 = this.f < StringInvoker.c(this.k) || StringInvoker.c(this.k) >= this.i();
            int n7 = n6;
            n7 = n4 + this.s;
            if (!StringInvoker.g(string) && n2 < StringInvoker.c(string)) {
                FontRendererInvoker.drawStringWithShadow(this.g, StringInvoker.a(string, n2), n6, n5, n);
            }
            this.a(n7, n5 - 1, n7 + 1, n5 + 1 + FontRendererInvoker.d(this.g), -3092272);
            if (n3 != n2) {
                int n8 = n4 + FontRendererInvoker.a(this.g, StringInvoker.b(string, 0, n3));
                this.c(n7, n5 - 1, n8 - 1, n5 + 1 + FontRendererInvoker.d(this.g));
            }
        }
    }

    public void o() {
        this.d(0);
    }

    public String h() {
        return this.k;
    }

    public sc_0(int n, FontRenderer fontRenderer, int n2, int n3, int n4, int n5) {
        this.y = sc_0::lambda$new$0;
        this.z = n;
        this.g = fontRenderer;
        this.x = n2;
        this.m = n3;
        this.s = n4;
        this.j = n5;
    }

    public void h(int n) {
        this.d(this.w + n);
    }

    public void a(int n) {
        if (!StringInvoker.g(this.k)) {
            if (this.w != this.f) {
                this.b(mi_0.c);
            } else {
                int n2 = this.f + n;
                int n3 = this.f;
                String string = mi_0.g;
                string = StringInvoker.b(this.k, 0, n2);
                if (n3 < StringInvoker.c(this.k)) {
                    string = aL0.a(aL0.a(new StringBuilder(), string), StringInvoker.a(this.k, n3)).toString();
                }
                if (wl_2.a(this.y, string)) {
                    this.k = string;
                    this.h(n);
                    if (this.i != null) {
                        UQ.a(this.i, this.z, this.k);
                    }
                }
            }
        }
    }

    public String m() {
        int n = MathInvoker.b(this.f, this.w);
        int n2 = MathInvoker.max(this.f, this.w);
        return StringInvoker.b(this.k, n, n2);
    }

    public void b(String string) {
        int n;
        String string2 = mi_0.a;
        String string3 = KF.a(string);
        int n2 = MathInvoker.b(this.f, this.w);
        int n3 = MathInvoker.max(this.f, this.w);
        int n4 = this.h - StringInvoker.c(this.k) - (n2 - n3);
        if (!StringInvoker.g(this.k)) {
            string2 = aL0.a(aL0.a(new StringBuilder(), string2), StringInvoker.b(this.k, 0, n2)).toString();
        }
        if (n4 < StringInvoker.c(string3)) {
            string2 = aL0.a(aL0.a(new StringBuilder(), string2), StringInvoker.b(string3, 0, n4)).toString();
            n = n4;
        } else {
            string2 = aL0.a(aL0.a(new StringBuilder(), string2), string3).toString();
            n = StringInvoker.c(string3);
        }
        if (!StringInvoker.g(this.k) && n3 < StringInvoker.c(this.k)) {
            string2 = aL0.a(aL0.a(new StringBuilder(), string2), StringInvoker.a(this.k, n3)).toString();
        }
        if (wl_2.a(this.y, string2)) {
            this.k = string2;
            this.h(n2 - this.w + n);
            if (this.i != null) {
                UQ.a(this.i, this.z, this.k);
            }
        }
    }

    public void a(int n, int n2, int n3) {
        boolean bl;
        boolean bl2 = bl = (float)n >= this.x && (float)n < this.x + (float)this.s && (float)n2 >= this.m && (float)n2 < this.m + (float)this.j;
        if (this.l) {
            this.b(bl);
        }
        if (this.u) {
            int n4 = (int)((float)n - this.x);
            if (this.q) {
                n4 -= 4;
            }
            String string = FontRendererInvoker.a(this.g, StringInvoker.a(this.k, this.r), this.l());
            this.d(StringInvoker.c(FontRendererInvoker.a(this.g, string, n4)) + this.r);
        }
    }

    public boolean f() {
        return this.p;
    }

    public int l() {
        return this.d() ? this.s - 8 : this.s;
    }

    public void c(boolean bl) {
        this.p = bl;
    }

    public void i(int n) {
        this.t = n;
    }

    public void d(int n) {
        this.f = n;
        int n2 = StringInvoker.c(this.k);
        this.f = MathHelper.a(this.f, 0, n2);
        this.g(this.f);
    }

    public void b(boolean bl) {
        if (!this.u) {
            this.v = 0;
        }
        this.u = bl;
    }

    public int a() {
        return this.f;
    }

    public int g() {
        return this.z;
    }

    public int a(int n, int n2) {
        return this.a(n, n2, true);
    }

    public int c(int n) {
        return this.a(n, this.a());
    }

    public void a(boolean bl) {
        this.q = bl;
    }

    public void f(int n) {
        this.h = n;
        if (StringInvoker.c(this.k) > n) {
            this.k = StringInvoker.b(this.k, 0, n);
        }
    }

    public void g(int n) {
        int n2 = StringInvoker.c(this.k);
        if (n > n2) {
            n = n2;
        }
        this.w = n = 0;
        if (this.g != null) {
            if (this.r > n2) {
                this.r = n2;
            }
            int n3 = this.l();
            String string = FontRendererInvoker.a(this.g, StringInvoker.a(this.k, this.r), n3);
            int n4 = StringInvoker.c(string) + this.r;
            if (n == this.r) {
                this.r -= StringInvoker.c(FontRendererInvoker.a(this.g, this.k, n3, true));
            }
            if (n > n4) {
                this.r += n - n4;
            } else if (n <= this.r) {
                this.r -= this.r - n;
            }
            this.r = MathHelper.a(this.r, 0, n2);
        }
    }

    public void a(aYM aYM2) {
        this.i = aYM2;
    }

    public void e(boolean bl) {
        this.o = bl;
    }

    public int c() {
        return this.w;
    }

    public int a(int n, int n2, boolean bl) {
        int n3 = n2;
        int n4 = MathInvoker.a(n);
        for (int i = 0; i < n4; ++i) {
            int n5 = StringInvoker.c(this.k);
            if ((n3 = StringInvoker.a(this.k, 32, n3)) == -1) {
                n3 = n5;
                continue;
            }
            while (n3 < n5 && StringInvoker.b(this.k, n3) == ' ') {
                ++n3;
            }
        }
        return n3;
    }

    public void b() {
        ++this.v;
    }

    public boolean j() {
        return this.o;
    }

    public void b(int n) {
        this.n = n;
    }

    public void a(String string) {
        if (wl_2.a(this.y, string)) {
            this.k = StringInvoker.c(string) > this.h ? StringInvoker.b(string, 0, this.h) : string;
            this.e();
        }
    }

    public boolean n() {
        return this.u;
    }

    public void e(int n) {
        if (!StringInvoker.g(this.k)) {
            if (this.w != this.f) {
                this.b(mi_0.d);
            } else {
                this.a(this.c(n) - this.f);
            }
        }
    }

    private static boolean lambda$new$0(String string) {
        return true;
    }

    public void e() {
        this.d(StringInvoker.c(this.k));
    }

    public void a(Predicate<String> predicate) {
        this.y = predicate;
    }

    public boolean a(char c, int n) {
        if (!this.u) {
            return false;
        }
        if (aLW.a(n)) {
            this.e();
            this.g(0);
            return true;
        }
        if (aLW.c(n)) {
            aLW.a(this.m());
            return true;
        }
        if (aLW.b(n)) {
            if (this.o) {
                this.b(aLW.c());
            }
            return true;
        }
        if (aLW.d(n)) {
            aLW.a(this.m());
            if (this.o) {
                this.b(mi_0.e);
            }
            return true;
        }
        switch (n) {
            case 14: {
                if (aLW.d()) {
                    if (this.o) {
                        this.e(-1);
                    }
                } else if (this.o) {
                    this.a(-1);
                }
                return true;
            }
            case 199: {
                if (aLW.b()) {
                    this.g(0);
                } else {
                    this.o();
                }
                return true;
            }
            case 203: {
                if (aLW.b()) {
                    if (aLW.d()) {
                        this.g(this.a(-1, this.c()));
                    } else {
                        this.g(this.c() - 1);
                    }
                } else if (aLW.d()) {
                    this.d(this.c(-1));
                } else {
                    this.h(-1);
                }
                return true;
            }
            case 205: {
                if (aLW.b()) {
                    if (aLW.d()) {
                        this.g(this.a(1, this.c()));
                    } else {
                        this.g(this.c() + 1);
                    }
                } else if (aLW.d()) {
                    this.d(this.c(1));
                } else {
                    this.h(1);
                }
                return true;
            }
            case 207: {
                if (aLW.b()) {
                    this.g(StringInvoker.c(this.k));
                } else {
                    this.e();
                }
                return true;
            }
            case 211: {
                if (this.o) {
                    this.a(1);
                } else if (aLW.d() && this.o) {
                    this.e(1);
                }
                return true;
            }
        }
        if (KF.a(c)) {
            if (this.o) {
                this.b(aze_0.d(c));
            }
            return true;
        }
        return false;
    }

    public boolean d() {
        return this.q;
    }

    protected void c(int n, int n2, int n3, int n4) {
        int n5;
        if (n < n3) {
            n5 = n;
            n = n3;
            n3 = n5;
        }
        if (n2 < n4) {
            n5 = n2;
            n2 = n4;
            n4 = n5;
        }
        if ((float)n3 > this.x + (float)this.s) {
            n3 = (int)(this.x + (float)this.s);
        }
        if ((float)n > this.x + (float)this.s) {
            n = (int)(this.x + (float)this.s);
        }
        Tessellator tessellator = TessellatorInvoker.getInstance();
        WorldRenderer worldRenderer = TessellatorInvoker.getWorldRenderer(tessellator);
        GlStateManagerInvoker.color(0.0f, 0.0f, 255.0f, 255.0f);
        GlStateManagerInvoker.disableTexture2D();
        GlStateManagerInvoker.B();
        GlStateManagerInvoker.l(5387);
        WorldRendererInvoker.begin(worldRenderer, 7, DefaultVertexFormats.k);
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, n, n4, 0.0));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, n3, n4, 0.0));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, n3, n2, 0.0));
        WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, n, n2, 0.0));
        TessellatorInvoker.draw(tessellator);
        GlStateManagerInvoker.d();
        GlStateManagerInvoker.enableTexture2D();
    }

    public void d(boolean bl) {
        this.l = bl;
    }

    public int i() {
        return this.h;
    }
}

