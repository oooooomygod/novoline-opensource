/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.gui.alt.AltList;
import java.util.Iterator;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.ahv
 */
public class ahv_2
extends ahp_2<AltList> {
    private static int a;
    private ahr_1 k = new aha_1(this, this, adj_1.a(ay7_0.a, 40), a4g_0.c);
    private ahe_1 i;
    private ahr_1 h;
    private aho_1 j;
    private ahr_1 g = new ahh_1(this, this, adj_1.a(ay7_0.a, 45), a4g_0.b);

    static {
        if (ahv_2.e() == 0) {
            ahv_2.b(54);
        }
    }

    @Override
    public void c(int n, int n2) {
        int n3 = ahv_2.e();
        adp_0.b(false);
        double[] dArray = avf_2.e((AltList)this.c());
        int n4 = n3;
        a1V.a(dArray[0], dArray[1], dArray[2], dArray[3], -1);
        adp_0.a(true);
        this.k.c(n, n2);
        this.g.c(n, n2);
        this.h.c(n, n2);
        this.j.c(n, n2);
        this.i.c(n, n2);
        abe_2.a(this.i, (double)n > dArray[0] && (double)n < dArray[2] && (double)n2 > dArray[1] && (double)n2 < dArray[3]);
        adp_0.a();
        adp_0.b(false);
        double[] dArray2 = this.g();
        a1V.a(dArray2[0], dArray2[1], dArray2[2], dArray2[3], -1);
        adp_0.a(true);
        Iterator iterator = ListInvoker.iterator(a0I.e(avf_2.a((AltList)this.c())));
        if (dz_0.c(iterator)) {
            aV9 aV92 = (aV9)dz_0.b(iterator);
            tq_0.a(aV92, this);
        }
        adp_0.a();
        if (ListInvoker.b() != null) {
            ahv_2.b(++n4);
        }
    }

    @Override
    public void a(int n, int n2) {
        this.j.a(n, n2);
        this.i.a(n, n2);
    }

    public static int e() {
        ahv_2.d();
        return 123;
    }

    @Override
    public void b(int n, int n2) {
        ahv_2.e();
        this.j.b(n, n2);
        this.i.b(n, n2);
        Iterator iterator = ListInvoker.iterator(a0I.e(avf_2.a((AltList)this.c())));
        if (dz_0.c(iterator)) {
            aV9 aV92 = (aV9)dz_0.b(iterator);
            tq_0.a(aV92, n, n2, this);
        }
    }

    public aho_1 f() {
        return this.j;
    }

    public ahv_2(AltList altList) {
        super(altList);
        this.h = new ahg_1(this, this, adj_1.a(ay7_0.a, 47), a4g_0.a);
        this.j = new aho_1(this);
        this.i = new ahe_1(this);
    }

    @Override
    public double a() {
        return ((AltList)this.c()).q();
    }

    public static int d() {
        return a;
    }

    public ahe_1 b() {
        return this.i;
    }

    @Override
    public void a(int n, int n2, int n3) {
        Iterator iterator;
        ahv_2.d();
        this.k.a(n, n2, n3);
        this.g.a(n, n2, n3);
        this.h.a(n, n2, n3);
        this.j.a(n, n2, n3);
        this.i.a(n, n2, n3);
        double[] dArray = this.g();
        if ((double)n > dArray[0] && (double)n < dArray[2] && (double)n2 > dArray[1] && (double)n2 < dArray[3] && dz_0.c(iterator = ListInvoker.iterator(a0I.e(avf_2.a((AltList)this.c()))))) {
            aV9 aV92 = (aV9)dz_0.b(iterator);
            tq_0.a(aV92, n, n2, n3, this);
        }
    }

    public double[] g() {
        double[] dArray = avf_2.e((AltList)this.c());
        return new double[]{dArray[0], dArray[1] + 8.0, dArray[2], dArray[3] - 30.0};
    }

    @Override
    public void a(char c, int n) {
        ahv_2.d();
        this.j.a(c, n);
        if (n == 211) {
            aV9 aV92;
            aNW aNW2 = avf_2.j((AltList)this.c());
            Iterator iterator = ListInvoker.iterator(a0I.e(avf_2.a((AltList)this.c())));
            if (dz_0.c(iterator) && !tq_0.a(aV92 = (aV9)dz_0.b(iterator))) {
                a0I.b(aNW2, aV92);
            }
            avf_2.a((AltList)this.c(), aNW2);
            avf_2.c((AltList)this.c());
        }
    }

    @Override
    public double e() {
        return ((AltList)this.c()).k() - 230.0 + 15.0 + (double)ListInvoker.indexOf(avf_2.b((AltList)this.c()), this) * avf_2.d((AltList)this.c());
    }

    public ahr_1 a() {
        return this.k;
    }

    public static void b(int n) {
        a = n;
    }
}

