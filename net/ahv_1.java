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
 * Renamed from net.ahV
 */
public class ahv_1
extends ahp_2<ahu_2> {
    private aha_2 a;
    private ah2_0 h;
    private ah2_0 g = new ahl_1(this, (ahu_2)this.c(), apk_0.b);

    @Override
    public void a(char c, int n) {
        this.a.a(c, n);
    }

    @Override
    public double e() {
        return ((ahv_2)((ahu_2)this.c()).c()).e() + 10.0 + (double)ListInvoker.indexOf(avf_2.b((AltList)((ahv_2)((ahu_2)this.c()).c()).c()), this) * avf_2.d((AltList)((ahv_2)((ahu_2)this.c()).c()).c()) - avf_2.h((AltList)((ahv_2)((ahu_2)this.c()).c()).c());
    }

    public ahv_1(ahu_2 ahu_22) {
        super(ahu_22);
        this.h = new ahu_1(this, (ahu_2)this.c(), apk_0.a);
        this.a = new aha_2(this, apk_0.c, 1);
    }

    public aha_2 a() {
        return this.a;
    }

    @Override
    public void a(int n, int n2) {
    }

    @Override
    public double a() {
        return ((ahu_2)this.c()).a();
    }

    @Override
    public void b(int n, int n2) {
        aeo_0.b(this.a, new Vec2d(this.e(), this.a() + 10.0));
        aeo_0.a(this.a, new Vec2d(150.0, 15.0));
        this.g.b(n, n2);
        this.h.b(n, n2);
        this.a.b(n, n2);
    }

    @Override
    public void c(int n, int n2) {
        adp_0.b(false);
        double[] dArray = avf_2.e((AltList)((ahv_2)((ahu_2)this.c()).c()).c());
        a1V.a(dArray[0], dArray[1], dArray[2], dArray[3], -1);
        adp_0.a(true);
        this.g.c(n, n2);
        this.h.c(n, n2);
        this.a.c(n, n2);
        adp_0.a();
    }

    @Override
    public void a(int n, int n2, int n3) {
        this.g.a(n, n2, n3);
        this.h.a(n, n2, n3);
        this.a.a(n, n2, n3);
    }
}

