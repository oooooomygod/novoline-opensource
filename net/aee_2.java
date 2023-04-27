/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import java.util.ArrayList;
import java.util.List;
import net.CX;
import net.a55;
import net.aWU;
import net.aXT;
import net.aZZ;
import net.adc_1;
import net.anl_2;
import net.atr_0;
import net.dp_1;
import net.my_0;
import net.p7_0;
import net.qe_2;
import net.sr_1;

/*
 * Renamed from net.aee
 */
public class aee_2 {
    private int e = -1;
    private List<sr_1> f = my_0.c();
    public static dp_1 g;
    private static dp_1 j;
    private static dp_1 d;
    private static dp_1 a;
    private anl_2 c = new qe_2();
    private static dp_1 i;
    private p7_0 b;
    private int h;

    public dp_1 b(int n) {
        int n2 = n + this.h * 6;
        return this.h > 0 ? a : (n == 7 ? (n2 < ListInvoker.size(CX.b(this.c)) ? d : i) : (n == 8 ? j : (n2 < ListInvoker.size(CX.b(this.c)) ? (dp_1)aWU.a(ListInvoker.get(CX.b(this.c), n2), g) : g)));
    }

    public dp_1 f() {
        return this.b(this.e);
    }

    public anl_2 b() {
        return this.c;
    }

    public void a(anl_2 anl_22) {
        ListInvoker.add(this.f, this.d());
        this.c = anl_22;
        this.e = -1;
        this.h = 0;
    }

    public void a(int n) {
        dp_1 dp_12 = this.b(n);
        if (dp_12 != g) {
            if (this.e == n && a55.b(dp_12)) {
                a55.a(dp_12, this);
            } else {
                this.e = n;
            }
        }
    }

    public sr_1 d() {
        return new sr_1(this.c, this.a(), this.e);
    }

    static int a(aee_2 aee_22, int n) {
        aee_22.h = n;
        return aee_22.h;
    }

    public int e() {
        return this.e;
    }

    public aee_2(p7_0 p7_02) {
        this.b = p7_02;
    }

    public List<dp_1> a() {
        ArrayList arrayList = my_0.c();
        int n = 0;
        while (true) {
            ListInvoker.add(arrayList, this.b(n));
            ++n;
        }
    }

    static {
        j = new atr_0(null);
        a = new aXT(-1, true);
        d = new aXT(1, true);
        i = new aXT(1, false);
        g = new adc_1();
    }

    public void c() {
        aZZ.a(this.b, this);
    }
}

