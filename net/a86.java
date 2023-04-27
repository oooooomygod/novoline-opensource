/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.StringInvoker;
import java.util.Iterator;
import java.util.List;
import net.minecraft.client.Minecraft;


public class a86
extends aij_1 {
    private Gui C;
    private e2[][] x;
    private List<anx_2> z = my_0.c();
    private int y;
    private List<sc_0> B;
    private aYM D;
    private IntHashMap<Gui> A = new IntHashMap();

    public Gui d(int n) {
        return (Gui)a8a_0.c(this.A, n);
    }

    private QP a(int n, int n2, eu_1 eu_12) {
        QP qP = new QP(this.D, afu_1.d(eu_12), n, n2, afu_1.a(eu_12), afu_1.c(eu_12));
        qP.j = afu_1.b(eu_12);
        return qP;
    }

    private sc_0 a(int n, int n2, el_1 el_12) {
        sc_0 sc_02 = new sc_0(aca_2.b(el_12), this.n.fontRendererObj, n, n2, 150, 20);
        hc_1.b(sc_02, aca_2.a(el_12));
        hc_1.a(sc_02, this.D);
        hc_1.b(sc_02, aca_2.c(el_12));
        hc_1.a(sc_02, aca_2.d(el_12));
        return sc_02;
    }

    private Gui a(e2 e22, int n, boolean bl) {
        return e22 instanceof e5_0 ? this.a(this.r / 2 - 155 + n, 0, (e5_0)e22) : (e22 instanceof eu_1 ? this.a(this.r / 2 - 155 + n, 0, (eu_1)e22) : (e22 instanceof el_1 ? this.a(this.r / 2 - 155 + n, 0, (el_1)e22) : (e22 instanceof e4_0 ? this.a(this.r / 2 - 155 + n, 0, (e4_0)e22, bl) : null)));
    }

    private void a(Gui gui, boolean bl) {
        if (gui instanceof QG) {
            ((QG)gui).j = bl;
        } else if (gui instanceof sc_0) {
            hc_1.b((sc_0)gui, bl);
        } else if (gui instanceof Qw) {
            ((Qw)gui).j = bl;
        }
    }

    @Override
    protected int h() {
        return super.h() + 32;
    }

    public void i() {
        if (this.y < this.x.length - 1) {
            this.c(this.y + 1);
        }
    }

    private QX a(int n, int n2, e5_0 e5_02) {
        QX qX = new QX(this.D, gt_0.f(e5_02), n, n2, gt_0.a(e5_02), gt_0.b(e5_02), gt_0.c(e5_02), gt_0.e(e5_02), gt_0.g(e5_02));
        qX.j = gt_0.d(e5_02);
        return qX;
    }

    public a86(Minecraft minecraft, int n, int n2, int n3, int n4, int n5, aYM aYM2, e2[] ... e2Array) {
        super(minecraft, n, n2, n3, n4, n5);
        this.B = my_0.c();
        this.D = aYM2;
        this.x = e2Array;
        this.f = false;
        this.m();
        this.h();
    }

    private void d(int n, int n2) {
        for (e2 e22 : this.x[n]) {
            this.a((Gui)a8a_0.c(this.A, akj_1.a(e22)), false);
        }
        for (e2 e22 : this.x[n2]) {
            this.a((Gui)a8a_0.c(this.A, akj_1.a(e22)), true);
        }
    }

    private void m() {
        for (e2[] e2Array : this.x) {
            for (int i = 0; i < e2Array.length; i += 2) {
                e2 e22 = e2Array[i];
                e2 e23 = i < e2Array.length - 1 ? e2Array[i + 1] : null;
                Gui gui = this.a(e22, 0, true);
                Gui gui2 = this.a(e23, 160, true);
                anx_2 anx_22 = new anx_2(gui, gui2);
                ListInvoker.add(this.z, anx_22);
                a8a_0.a(this.A, akj_1.a(e22), gui);
                if (gui instanceof sc_0) {
                    ListInvoker.add(this.B, (sc_0)gui);
                }
                a8a_0.a(this.A, akj_1.a(e23), gui2);
                if (!(gui2 instanceof sc_0)) continue;
                ListInvoker.add(this.B, (sc_0)gui2);
            }
        }
    }

    public void c() {
        if (this.y > 0) {
            this.c(this.y - 1);
        }
    }

    public int g() {
        return this.y;
    }

    @Override
    public int d() {
        return 400;
    }

    public Gui a() {
        return this.C;
    }

    @Override
    public anx_2 a(int n) {
        return (anx_2)ListInvoker.get(this.z, n);
    }

    public void a(char c, int n) {
        block1: {
            int n2;
            block2: {
                sc_0 sc_02;
                block3: {
                    int n3;
                    block4: {
                        if (!(this.C instanceof sc_0)) break block1;
                        sc_02 = (sc_0)this.C;
                        if (aLW.b(n)) break block2;
                        if (n != 15) break block3;
                        hc_1.c(sc_02, false);
                        int n4 = ListInvoker.indexOf(this.B, this.C);
                        n4 = aLW.b() ? ListInvoker.size(this.B) - 1 : (n4 == ListInvoker.size(this.B) - 1 ? 0 : ++n4);
                        this.C = (Gui)ListInvoker.get(this.B, n4);
                        sc_02 = (sc_0)this.C;
                        hc_1.c(sc_02, true);
                        int n5 = (int)sc_02.m + this.m;
                        n3 = (int)sc_02.m;
                        if (n5 <= this.t) break block4;
                        this.p += (float)(n5 - this.t);
                        break block1;
                    }
                    if (n3 >= this.l) break block1;
                    this.p = n3;
                    break block1;
                }
                hc_1.a(sc_02, c, n);
                break block1;
            }
            String string = aLW.c();
            String[] stringArray = StringInvoker.g(string, aZ_.a);
            int n6 = n2 = ListInvoker.indexOf(this.B, this.C);
            for (String string2 : stringArray) {
                hc_1.b((sc_0)ListInvoker.get(this.B, n6), string2);
                n6 = n6 == ListInvoker.size(this.B) - 1 ? 0 : ++n6;
                if (n6 == n2) break;
            }
        }
    }

    @Override
    public int f() {
        return ListInvoker.size(this.z);
    }

    public void c(int n) {
        if (n != this.y) {
            int n2 = this.y;
            this.y = n;
            this.h();
            this.d(n2, n);
            this.p = 0.0f;
        }
    }

    public int l() {
        return this.x.length;
    }

    @Override
    public boolean a(int n, int n2, int n3) {
        boolean bl = super.a(n, n2, n3);
        int n4 = this.d(n, n2);
        avh_2 avh_22 = this.a(n4);
        if (this.C != anx_2.b((anx_2)avh_22) && this.C != null && this.C instanceof sc_0) {
            hc_1.c((sc_0)this.C, false);
        }
        this.C = anx_2.b((anx_2)avh_22);
        return bl;
    }

    public void c(boolean bl) {
        Iterator iterator = ListInvoker.iterator(this.z);
        while (dz_0.c(iterator)) {
            anx_2 anx_22 = (anx_2)dz_0.b(iterator);
            if (anx_2.c(anx_22) instanceof QG) {
                ((QG)anx_2.c((anx_2)anx_22)).g = bl;
            }
            if (!(anx_2.a(anx_22) instanceof QG)) continue;
            ((QG)anx_2.a((anx_2)anx_22)).g = bl;
        }
    }

    private void h() {
        ListInvoker.clear(this.z);
        for (int i = 0; i < this.x[this.y].length; i += 2) {
            e2 e22 = this.x[this.y][i];
            e2 e23 = i < this.x[this.y].length - 1 ? this.x[this.y][i + 1] : null;
            Gui gui = (Gui)a8a_0.c(this.A, akj_1.a(e22));
            Gui gui2 = (Gui)a8a_0.c(this.A, akj_1.a(e23));
            anx_2 anx_22 = new anx_2(gui, gui2);
            ListInvoker.add(this.z, anx_22);
        }
    }

    private Qw a(int n, int n2, e4_0 e4_02, boolean bl) {
        Qw qw = new Qw(this.n.fontRendererObj, ub_0.c(e4_02), n, n2, this.r - n * 2, 20, -1);
        qw.j = ub_0.a(e4_02);
        qt_2.a(qw, ub_0.b(e4_02));
        qt_2.a(qw);
        return qw;
    }
}

