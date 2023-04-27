/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.FontRendererInvoker;
import cc.novoline.invoke.KeyboardInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.SaveLoaderInvoker;
import cc.novoline.invoke.StringInvoker;
import net.minecraft.world.GameType;
import deobf.GuiScreen;
import deobf.MCInvoker;
import net.minecraft.world.WorldSettings;
import java.io.IOException;
import java.util.List;
import java.util.Random;

public class R7
extends GuiScreen {
    private String C;
    private boolean A;
    private boolean V = true;
    private boolean v;
    private int y;
    private String O = a3O.m;
    private QG D;
    private boolean B;
    private String E;
    private QG L;
    private static String[] w = new String[]{a3O.x, a3O.ar, a3O.aB, a3O.aj, a3O.Z, a3O.al, a3O.o, a3O.aA, a3O.X, a3O.aC, a3O.aF, a3O.aE, a3O.P, a3O.aa, a3O.ac, a3O.aH, a3O.Y, a3O.n, a3O.C, a3O.ah, a3O.G, a3O.u, a3O.av, a3O.q};
    private sc_0 T;
    private String z;
    private boolean N;
    private boolean G;
    private QG M;
    private String U;
    private QG Q;
    private String P;
    private boolean S;
    private sc_0 J;
    private String I;
    public String K = a3O.U;
    private GuiScreen R;
    private QG F;
    private QG H;
    private QG x;

    private void a() {
        this.z = StringInvoker.h(hc_1.a(this.J));
        for (char c : ld_1.a) {
            this.z = StringInvoker.a(this.z, c, '_');
        }
        if (aw__0.b((CharSequence)this.z)) {
            this.z = a3O.p;
        }
        this.z = R7.a(MCInvoker.P(this.t), this.z);
    }

    @Override
    public void l() {
        KeyboardInvoker.a(true);
        ListInvoker.clear(this.l);
        ListInvoker.add(this.l, new QG(0, this.n / 2 - 155, this.f - 28, 150, 20, I18n.format(a3O.l, new Object[0])));
        ListInvoker.add(this.l, new QG(1, this.n / 2 + 5, this.f - 28, 150, 20, I18n.format(a3O.ay, new Object[0])));
        this.F = new QG(2, this.n / 2 - 75, 115, 150, 20, I18n.format(a3O.g, new Object[0]));
        ListInvoker.add(this.l, this.F);
        this.D = new QG(3, this.n / 2 - 75, 187, 150, 20, I18n.format(a3O.ae, new Object[0]));
        ListInvoker.add(this.l, this.D);
        this.L = new QG(4, this.n / 2 - 155, 100, 150, 20, I18n.format(a3O.ak, new Object[0]));
        ListInvoker.add(this.l, this.L);
        this.L.j = false;
        this.Q = new QG(7, this.n / 2 + 5, 151, 150, 20, I18n.format(a3O.D, new Object[0]));
        ListInvoker.add(this.l, this.Q);
        this.Q.j = false;
        this.M = new QG(5, this.n / 2 + 5, 100, 150, 20, I18n.format(a3O.H, new Object[0]));
        ListInvoker.add(this.l, this.M);
        this.M.j = false;
        this.H = new QG(6, this.n / 2 - 155, 151, 150, 20, I18n.format(a3O.s, new Object[0]));
        ListInvoker.add(this.l, this.H);
        this.H.j = false;
        this.x = new QG(8, this.n / 2 + 5, 120, 150, 20, I18n.format(a3O.aq, new Object[0]));
        ListInvoker.add(this.l, this.x);
        this.x.j = false;
        this.J = new sc_0(9, this.q, this.n / 2 - 100, 60, 200, 20);
        hc_1.c(this.J, true);
        hc_1.b(this.J, this.I);
        this.T = new sc_0(10, this.q, this.n / 2 - 100, 60, 200, 20);
        hc_1.b(this.T, this.C);
        this.a(this.S);
        this.a();
        this.b();
    }

    @Override
    protected void b(int n, int n2, int n3) throws IOException {
        super.b(n, n2, n3);
        if (this.S) {
            this.T.a(n, n2, n3);
        } else {
            this.J.a(n, n2, n3);
        }
    }

    @Override
    protected void a(QG qG) throws IOException {
        if (qG.g) {
            if (qG.m == 1) {
                MCInvoker.displayGuiScreen(this.t, this.R);
            } else if (qG.m == 0) {
                MCInvoker.displayGuiScreen(this.t, null);
                if (this.B) {
                    return;
                }
                this.B = true;
                long l4 = a5_0.b(new Random());
                String string = hc_1.a(this.T);
                if (!aw__0.b((CharSequence)string)) {
                    try {
                        long l5 = lx_2.a(string);
                        if (l5 != 0L) {
                            l4 = l5;
                        }
                    }
                    catch (NumberFormatException numberFormatException) {
                        l4 = string.hashCode();
                    }
                }
                GameType gameType = ar3_0.a(this.O);
                WorldSettings worldSettings = new WorldSettings(l4, gameType, this.V, this.A, WorldType.m[this.y]);
                add_1.a(worldSettings, this.K);
                if (this.N && !this.A) {
                    add_1.f(worldSettings);
                }
                if (this.v && !this.A) {
                    add_1.a(worldSettings);
                }
                MCInvoker.a(this.t, this.z, StringInvoker.h(hc_1.a(this.J)), worldSettings);
            } else if (qG.m == 3) {
                this.d();
            } else if (qG.m == 2) {
                if (this.O.equals(a3O.ax)) {
                    if (!this.G) {
                        this.v = false;
                    }
                    this.A = false;
                    this.O = a3O.at;
                    this.A = true;
                    this.H.g = false;
                    this.Q.g = false;
                    this.b();
                } else if (this.O.equals(a3O.z)) {
                    if (!this.G) {
                        this.v = true;
                    }
                    this.A = false;
                    this.O = a3O.B;
                    this.b();
                    this.A = false;
                    this.H.g = true;
                    this.Q.g = true;
                } else {
                    if (!this.G) {
                        this.v = false;
                    }
                    this.O = a3O.K;
                    this.b();
                    this.H.g = true;
                    this.Q.g = true;
                    this.A = false;
                }
                this.b();
            } else if (qG.m == 4) {
                this.V = !this.V;
                this.b();
            } else if (qG.m == 7) {
                this.N = !this.N;
                this.b();
            } else if (qG.m == 5) {
                ++this.y;
                if (this.y >= WorldType.m.length) {
                    this.y = 0;
                }
                while (!this.e()) {
                    ++this.y;
                    if (this.y < WorldType.m.length) continue;
                    this.y = 0;
                }
                this.K = a3O.Q;
                this.b();
                this.a(this.S);
            } else if (qG.m == 6) {
                this.G = true;
                this.v = !this.v;
                this.b();
            } else if (qG.m == 8) {
                if (WorldType.m[this.y] == WorldType.e) {
                    MCInvoker.displayGuiScreen(this.t, new Rx(this, this.K));
                } else {
                    MCInvoker.displayGuiScreen(this.t, new RI(this, this.K));
                }
            }
        }
    }

    @Override
    protected void a(char c, int n) throws IOException {
        if (hc_1.b(this.J) && !this.S) {
            hc_1.a(this.J, c, n);
            this.I = hc_1.a(this.J);
        } else if (hc_1.b(this.T) && this.S) {
            hc_1.a(this.T, c, n);
            this.C = hc_1.a(this.T);
        }
        if (n == 28 || n == 156) {
            this.a((QG)ListInvoker.get(this.l, 0));
        }
        ((QG)ListInvoker.get((List)this.l, (int)0)).g = !StringInvoker.g(hc_1.a(this.J));
        this.a();
    }

    private void d() {
        this.a(!this.S);
    }

    @Override
    public void i() {
        KeyboardInvoker.a(false);
    }

    private boolean e() {
        WorldType worldType = WorldType.m[this.y];
        return fk_0.a(worldType) && (worldType != WorldType.l || R7.j());
    }

    private void b() {
        this.F.k = aL0.a(aL0.a(aL0.a(new StringBuilder(), I18n.format(a3O.a, new Object[0])), a3O.E), I18n.format(aL0.a(aL0.a(new StringBuilder(), a3O.k), this.O).toString(), new Object[0])).toString();
        this.E = I18n.format(aL0.a(aL0.a(aL0.a(new StringBuilder(), a3O.W), this.O), a3O.am).toString(), new Object[0]);
        this.P = I18n.format(aL0.a(aL0.a(aL0.a(new StringBuilder(), a3O.F), this.O), a3O.S).toString(), new Object[0]);
        this.L.k = aL0.a(aL0.a(new StringBuilder(), I18n.format(a3O.az, new Object[0])), a3O.L).toString();
        this.L.k = this.V ? aL0.a(aL0.a(new StringBuilder(), this.L.k), I18n.format(a3O.r, new Object[0])).toString() : aL0.a(aL0.a(new StringBuilder(), this.L.k), I18n.format(a3O.an, new Object[0])).toString();
        this.Q.k = aL0.a(aL0.a(new StringBuilder(), I18n.format(a3O.M, new Object[0])), a3O.V).toString();
        this.Q.k = this.N && !this.A ? aL0.a(aL0.a(new StringBuilder(), this.Q.k), I18n.format(a3O.as, new Object[0])).toString() : aL0.a(aL0.a(new StringBuilder(), this.Q.k), I18n.format(a3O.y, new Object[0])).toString();
        this.M.k = aL0.a(aL0.a(aL0.a(new StringBuilder(), I18n.format(a3O.ao, new Object[0])), a3O.v), I18n.format(fk_0.e(WorldType.m[this.y]), new Object[0])).toString();
        this.H.k = aL0.a(aL0.a(new StringBuilder(), I18n.format(a3O.ai, new Object[0])), a3O.R).toString();
        this.H.k = this.v && !this.A ? aL0.a(aL0.a(new StringBuilder(), this.H.k), I18n.format(a3O.N, new Object[0])).toString() : aL0.a(aL0.a(new StringBuilder(), this.H.k), I18n.format(a3O.b, new Object[0])).toString();
    }

    public static String a(ISaveFormat iSaveFormat, String string) {
        string = StringInvoker.a(string, a3O.aG, a3O.j);
        for (String string2 : w) {
            if (!StringInvoker.d(string, string2)) continue;
            string = aL0.a(aL0.a(aL0.a(new StringBuilder(), a3O.ag), string), a3O.aD).toString();
        }
        while (SaveLoaderInvoker.f(iSaveFormat, string) != null) {
            string = aL0.a(aL0.a(new StringBuilder(), string), a3O.d).toString();
        }
        return string;
    }

    public R7(GuiScreen guiScreen) {
        this.R = guiScreen;
        this.C = a3O.ab;
        this.I = I18n.format(a3O.w, new Object[0]);
    }

    private void a(boolean bl) {
        this.S = bl;
        if (WorldType.m[this.y] == WorldType.l) {
            this.F.j = !this.S;
            this.F.g = false;
            if (this.U == null) {
                this.U = this.O;
            }
            this.O = a3O.ap;
            this.L.j = false;
            this.Q.j = false;
            this.M.j = this.S;
            this.H.j = false;
            this.x.j = false;
        } else {
            this.F.j = !this.S;
            this.F.g = true;
            if (this.U != null) {
                this.O = this.U;
                this.U = null;
            }
            this.L.j = this.S && WorldType.m[this.y] != WorldType.i;
            this.Q.j = this.S;
            this.M.j = this.S;
            this.H.j = this.S;
            this.x.j = this.S && (WorldType.m[this.y] == WorldType.e || WorldType.m[this.y] == WorldType.i);
        }
        this.b();
        this.D.k = this.S ? I18n.format(a3O.t, new Object[0]) : I18n.format(a3O.I, new Object[0]);
    }

    @Override
    public void g() {
        hc_1.c(this.J);
        hc_1.c(this.T);
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public void a(WorldInfo worldInfo) {
        this.I = I18n.format(a3O.f, new Object[]{uv_2.z(worldInfo)});
        this.C = aL0.a(aL0.a(new StringBuilder(), uv_2.j(worldInfo)), a3O.aw).toString();
        this.y = fk_0.b(uv_2.r(worldInfo));
        this.K = uv_2.n(worldInfo);
        this.V = uv_2.w(worldInfo);
        this.v = uv_2.g(worldInfo);
        if (uv_2.t(worldInfo)) {
            this.O = a3O.ad;
        } else if (ar3_0.d(uv_2.C(worldInfo))) {
            this.O = a3O.O;
        } else if (ar3_0.e(uv_2.C(worldInfo))) {
            this.O = a3O.e;
        }
    }

    @Override
    public void a(int n, int n2, float f) {
        this.h();
        this.b(this.q, I18n.format(a3O.J, new Object[0]), this.n / 2, 20, -1);
        if (this.S) {
            this.a(this.q, I18n.format(a3O.i, new Object[0]), this.n / 2 - 100, 47, -6250336);
            this.a(this.q, I18n.format(a3O.au, new Object[0]), this.n / 2 - 100, 85, -6250336);
            if (this.L.j) {
                this.a(this.q, I18n.format(a3O.af, new Object[0]), this.n / 2 - 150, 122, -6250336);
            }
            if (this.H.j) {
                this.a(this.q, I18n.format(a3O.A, new Object[0]), this.n / 2 - 150, 172, -6250336);
            }
            hc_1.d(this.T);
            if (fk_0.c(WorldType.m[this.y])) {
                FontRendererInvoker.a(this.q, I18n.format(fk_0.d(WorldType.m[this.y]), new Object[0]), (int)this.M.n + 2, (int)this.M.h + 22, atB.b(this.M), 0xA0A0A0);
            }
        } else {
            this.a(this.q, I18n.format(a3O.c, new Object[0]), this.n / 2 - 100, 47, -6250336);
            this.a(this.q, aL0.a(aL0.a(aL0.a(new StringBuilder(), I18n.format(a3O.T, new Object[0])), a3O.h), this.z).toString(), this.n / 2 - 100, 85, -6250336);
            hc_1.d(this.J);
            this.a(this.q, this.E, this.n / 2 - 100, 137, -6250336);
            this.a(this.q, this.P, this.n / 2 - 100, 149, -6250336);
        }
        super.a(n, n2, f);
    }
}

