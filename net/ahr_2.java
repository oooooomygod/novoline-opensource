/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.sun.javafx.geom.Vec2d
 */
package net;

import cc.novoline.invoke.ListInvoker;
import com.sun.javafx.geom.Vec2d;
import cc.novoline.gui.alt.AltList;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.ahr
 */
public class ahr_2
extends ahv_1 {
    private ah2_0 k = new ah4(this, (ahu_2)this.c(), akz_1.c);
    private ah2_0 i = new ah5_0(this, (ahu_2)this.c(), akz_1.b);
    private aha_2 j = new aha_2(this, akz_1.a, 1);

    @Override
    public void a(int n, int n2) {
    }

    @Override
    public double a() {
        return ((ahu_2)this.c()).a();
    }

    static aha_2 a(ahr_2 ahr_22) {
        return ahr_22.j;
    }

    @Override
    public void a(char c, int n) {
        this.j.a(c, n);
    }

    public ahr_2(ahu_2 ahu_22) {
        super(ahu_22);
    }

    @Override
    public aha_2 a() {
        return this.j;
    }

    @Override
    public void b(int n, int n2) {
        aeo_0.b(this.j, new Vec2d(this.e(), this.a() + 10.0));
        aeo_0.a(this.j, new Vec2d(150.0, 15.0));
        this.k.b(n, n2);
        this.i.b(n, n2);
        this.j.b(n, n2);
    }

    @Override
    public double e() {
        return ((ahv_2)((ahu_2)this.c()).c()).e() + 10.0 + (double)ListInvoker.indexOf(avf_2.b((AltList)((ahv_2)((ahu_2)this.c()).c()).c()), this) * avf_2.d((AltList)((ahv_2)((ahu_2)this.c()).c()).c()) - avf_2.h((AltList)((ahv_2)((ahu_2)this.c()).c()).c());
    }

    @Override
    public void a(int n, int n2, int n3) {
        this.k.a(n, n2, n3);
        this.i.a(n, n2, n3);
        this.j.a(n, n2, n3);
    }

    @Override
    public void c(int n, int n2) {
        adp_0.b(false);
        double[] dArray = avf_2.e((AltList)((ahv_2)((ahu_2)this.c()).c()).c());
        a1V.a(dArray[0], dArray[1], dArray[2], dArray[3], -1);
        adp_0.a(true);
        this.k.c(n, n2);
        this.i.c(n, n2);
        this.j.c(n, n2);
        adp_0.a();
    }
}

