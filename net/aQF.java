/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.gui.screen.ClickGUI;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MouseInvoker;
import cc.novoline.invoke.NovolineInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.invoke.StringPropertyInvoker;
import cc.novoline.modules.visual.ClickGui;
import cc.novoline.modules.EnumModuleType;
import java.awt.Color;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class aQF {
    private double h;
    private ClickGUI u;
    private List<aya_1> i = new CopyOnWriteArrayList<aya_1>();
    private boolean c;
    private aqx_2 e;
    private boolean s;
    private double l;
    private double q;
    private boolean v;
    private wr_2 a;
    private avp_2 k;
    private double d;
    private avp_2 n;
    private double o;
    private avp_2 m;
    private boolean w;
    private avp_2 f;
    private avp_2 b;
    private on_0 p;
    private boolean g;
    private double j;
    private wr_2 t;
    private avp_2 r;

    public ClickGUI b() {
        return this.u;
    }

    private EnumModuleType[] d() {
        return new EnumModuleType[]{a0u.a(this.b) ? EnumModuleType.COMBAT : null, a0u.a(this.m) ? EnumModuleType.MOVEMENT : null, a0u.a(this.f) ? EnumModuleType.VISUALS : null, a0u.a(this.n) ? EnumModuleType.MISC : null, a0u.a(this.k) ? EnumModuleType.PLAYER : null, a0u.a(this.r) ? EnumModuleType.EXPLOITS : null};
    }

    private void lambda$new$1(String string) {
        aq7_0.d();
        if (this.e() != null) {
            a4_.b(aen_2.b(NovolineInvoker.l(NovolineInvoker.getInstance())), awk_2.a(this.e()));
        }
        if (!StringInvoker.g(akq_1.a(this.p))) {
            a4_.b(aen_2.b(NovolineInvoker.l(NovolineInvoker.getInstance())), akq_1.a(this.p));
        }
        this.a();
    }

    public List<aya_1> c() {
        return this.i;
    }

    public void b(int n, int n2, int n3) {
        Iterator iterator;
        aq7_0.d();
        if ((double)n2 > this.h && (double)n2 < this.h + I_.d(this.e) && (double)n < this.q + 125.0 && dz_0.c(iterator = ListInvoker.iterator(this.i))) {
            aya_1 aya_12 = (aya_1)dz_0.b(iterator);
            aya_12.a(n, n2, n3);
        }
        this.t.a(n, n2, n3);
        this.a.a(n, n2, n3);
        this.b.a(n, n2, n3);
        this.m.a(n, n2, n3);
        this.k.a(n, n2, n3);
        this.r.a(n, n2, n3);
        this.n.a(n, n2, n3);
        this.f.a(n, n2, n3);
        akq_1.a(this.p, n3, n, n2);
        if ((double)n >= this.q + 130.0 - 8.0 && (double)n <= this.q + 130.0 && (double)n2 >= this.h && (double)n2 <= this.h + I_.d(this.e)) {
            this.w = true;
            this.o = n2;
        }
    }

    public void a(char c, int n) {
        akq_1.a(this.p, c, n);
    }

    private void lambda$refreshConfigs$2(String string) {
        ListInvoker.add(this.i, new aya_1(string, this));
    }

    private void lambda$new$0(String string) {
        if (this.e() != null) {
            a4_.a(aen_2.b(NovolineInvoker.l(NovolineInvoker.getInstance())), awk_2.a(this.e()), this.d());
        }
    }

    public aQF(ClickGUI clickGUI, aqx_2 aqx_22) {
        this.e = aqx_22;
        this.u = clickGUI;
        this.a = new wr_2(aE2.h, this::lambda$new$0, 59.5, 18.0);
        this.t = new wr_2(aE2.j, this::lambda$new$1, 59.5, 18.0);
        this.b = new avp_2(aE2.n, 19.0, 18.0, true);
        this.m = new avp_2(aE2.m, 19.0, 18.0, true);
        this.n = new avp_2(aE2.l, 19.0, 18.0, true);
        this.k = new avp_2(aE2.e, 19.0, 18.0, true);
        this.f = new avp_2(aE2.f, 19.0, 18.0, true);
        this.r = new avp_2(aE2.d, 19.0, 18.0, true);
        this.p = new on_0();
        this.a();
    }

    public void a() {
        ListInvoker.clear(this.i);
        ListInvoker.forEach(aHE.c(aen_2.b(NovolineInvoker.l(NovolineInvoker.getInstance()))), this::lambda$refreshConfigs$2);
    }

    public void a(int n, int n2, int n3) {
        this.w = false;
    }

    public aya_1 e() {
        return (aya_1)oc_1.a(aMF.b(aMF.b(ListInvoker.stream(this.i), aya_1::b)), null);
    }

    public void a(ClickGui clickGui, int n, int n2, double d, double d2, int n3) {
        this.q = d;
        this.h = d2;
        adp_0.b(false);
        a1V.b(d, d2, d + 130.0, d2 + I_.d(this.e), -1);
        aq7_0.d();
        adp_0.a(true);
        double d3 = z4_0.l(clickGui);
        StringProperty stringProperty = z4_0.o(clickGui);
        if (StringPropertyInvoker.isMode(stringProperty, aE2.c)) {
            a1V.b(d, d2, d + 130.0, d2 + I_.d(this.e), aol_1.b(new Color(55, 55, 55)));
            ListInvoker.b(new ListInvoker[1]);
        }
        a1V.b(d, d2, d + 125.0, d2 + I_.d(this.e), aol_1.b(new Color(0, 0, 0, (int)(180.0 * d3))));
        double d4 = I_.d(this.e);
        double d5 = I_.d(this.e);
        double d6 = ListInvoker.size(this.i) * 20;
        double d7 = d5 / d6 * d4;
        double d8 = d4 - d7;
        double d9 = d6 - d4;
        double d10 = d9 / d8;
        this.d = (int)(this.j * d10);
        this.l += (this.d - this.l) * 0.1;
        double d11 = d2;
        Object object = ListInvoker.iterator(this.i);
        if (dz_0.c((Iterator)object)) {
            aya_1 aya_12 = (aya_1)dz_0.b((Iterator)object);
            awk_2.a(aya_12, n, n2, d, d11 - this.l, new Color(n3));
            d11 += 20.0;
            var29_20 -= 120;
        }
        adp_0.a();
        if (StringPropertyInvoker.isMode(stringProperty, aE2.a)) {
            a1V.b(d, d2 + I_.d(this.e), d + 130.0, d2 + I_.d(this.e) + 60.0, aol_1.b(new Color(45, 45, 45)));
        }
        a1V.b(d, d2 + I_.d(this.e), d + 125.0, d2 + I_.d(this.e) + 60.0, aol_1.b(new Color(0, 0, 0, (int)(170.0 * d3))));
        if (StringPropertyInvoker.isMode(stringProperty, aE2.g)) {
            aRD.a(this.a, this.u, n, n2, d + 2.0, d2 + I_.d(this.e) + 20.0);
            aRD.a(this.t, this.u, n, n2, d + 64.0, d2 + I_.d(this.e) + 20.0);
        }
        aRD.a(this.a, this.u, n, n2, d + 2.0, d2 + I_.d(this.e) + 20.0, aol_1.b(new Color(0, 0, 0, 50)), aol_1.b(new Color(0, 0, 0, 70)));
        aRD.a(this.t, this.u, n, n2, d + 64.0, d2 + I_.d(this.e) + 20.0, aol_1.b(new Color(0, 0, 0, 50)), aol_1.b(new Color(0, 0, 0, 70)));
        object = my_0.a(new avp_2[]{this.b, this.m, this.n, this.k, this.f, this.r});
        double d12 = d + 2.0;
        Iterator iterator = ListInvoker.iterator((List)object);
        if (dz_0.c(iterator)) {
            avp_2 avp_22 = (avp_2)dz_0.b(iterator);
            if (StringPropertyInvoker.isMode(stringProperty, aE2.b)) {
                a0u.a(avp_22, al1_0.a, n, n2, d12, d2 + I_.d(this.e) + 40.0);
            }
            a0u.a(avp_22, al1_0.a, n, n2, d12, d2 + I_.d(this.e) + 40.0, aol_1.b(new Color(0, 0, 0, 50)), aol_1.b(new Color(0, 0, 0, 70)));
            d12 += a0u.b(avp_22) + 1.5;
        }
        if (StringPropertyInvoker.isMode(stringProperty, aE2.i)) {
            akq_1.a(this.p, d + 2.0, d2 + I_.d(this.e) + 2.5, 15.0, 121.5, akq_1.a(this.p, n, n2) ? aol_1.b(new Color(60, 60, 60)) : aol_1.b(new Color(54, 54, 54)), aol_1.b(new Color(50, 50, 50)), n, n);
        }
        akq_1.a(this.p, d + 2.0, d2 + I_.d(this.e) + 2.5, 15.0, 121.5, akq_1.a(this.p, n, n2) ? aol_1.b(new Color(0, 0, 0, 70)) : aol_1.b(new Color(0, 0, 0, 50)), aol_1.b(new Color(0, 0, 0, 50)), n, n);
        if (StringPropertyInvoker.isMode(stringProperty, aE2.k)) {
            a1V.a((float)d + 130.0f - 5.0f, (float)d2, 5.0f, (float)I_.d(this.e), 0.0f, aol_1.b(new Color(45, 45, 45)));
        }
        a1V.a((float)d + 125.0f, (float)d2, 5.0f, (float)I_.d(this.e) + 60.0f, 0.0f, aol_1.b(new Color(0, 0, 0, (int)(200.0 * d3))));
        if (d6 > d5) {
            if (StringPropertyInvoker.isMode(stringProperty, aE2.o)) {
                a1V.a((float)(d + 130.0 - 4.0), (float)(d2 + this.j), 3.0f, (float)d7 - 1.0f, 0.0f, aol_1.b(new Color(50, 50, 50, 255)));
            }
            a1V.a((float)(d + 130.0 - 4.0), (float)(d2 + this.j), 3.0f, (float)d7 - 1.0f, 0.0f, aol_1.b(new Color(0, 0, 0, (int)(100.0 * d3))));
            if ((double)n >= d && (double)n <= d + 130.0 && (double)n2 >= d2 && (double)n2 <= d2 + I_.d(this.e)) {
                int n4 = MouseInvoker.m();
                this.j += 10.0;
                this.j -= 10.0;
                this.j = (int)MathHelper.b(this.j, 0.0, d4 - d7);
            }
        } else {
            this.d = 0.0;
            this.j = 0.0;
        }
        if (this.w && (double)n2 - this.o != 0.0) {
            this.j += (double)n2 - this.o;
            this.j = (int)MathHelper.b(this.j, 0.0, d4 - d7);
            this.o = n2;
        }
    }
}

