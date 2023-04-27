/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.gui.alt.AltList;
import java.awt.Color;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.ahg
 */
public class ahg_2
extends ahp_2<ahu_2> {
    private float a;

    @Override
    public void b(int n, int n2) {
    }

    @Override
    public double e() {
        return ((ahu_2)this.c()).e();
    }

    @Override
    public void a(int n, int n2, int n3) {
    }

    public boolean e(int n, int n2) {
        ah2_0.d();
        return (double)n > this.e() && (double)n < this.e() + 210.0 && (double)n2 > this.a() && (double)n2 < this.a() + 57.0;
    }

    @Override
    public void a(char c, int n) {
    }

    public void a(float f) {
        this.a = f;
    }

    @Override
    public double a() {
        return super.a();
    }

    @Override
    public void c(int n, int n2) {
    }

    public void d(int n, int n2) {
        int n3 = ah2_0.d();
        if (this.e(n, n2) || this.b()) {
            this.a += (1.0f - this.a) * 0.04f;
        }
        this.a -= this.a * 0.04f;
        aV3.a(aV3.a(), this.e(), this.a(), 210.0, 57.0, 12.0, 2.0, new Color(a1V.a(new Color(26, 26, 26), new Color(20, 20, 20), (double)this.a)), avf_2.e((AltList)((ahv_2)((ahu_2)this.c()).c()).c()), true);
        if (ListInvoker.b() != null) {
            ah2_0.b(++n3);
        }
    }

    @Override
    public void a(int n, int n2) {
    }

    public float a() {
        return this.a;
    }

    public ahg_2(ahu_2 ahu_22) {
        super(ahu_22);
    }
}

