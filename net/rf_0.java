/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.IntegratedServerInvoker;
import cc.novoline.invoke.ListInvoker;
import deobf.GuiScreen;
import deobf.MCInvoker;
import java.io.IOException;
import net.GW;
import net.I18n;
import net.QG;
import net.aL0;
import net.agu_0;
import net.aoz_1;
import net.ar3_0;
import net.kp_1;

/*
 * Renamed from net.Rf
 */
public class rf_0
extends GuiScreen {
    private String y = agu_0.f;
    private boolean x;
    private QG z;
    private QG w;
    private GuiScreen v;

    private static IOException a(IOException iOException) {
        return iOException;
    }

    @Override
    public void a(int n, int n2, float f) {
        this.h();
        this.b(this.q, I18n.format(agu_0.m, new Object[0]), this.n / 2, 50, 0xFFFFFF);
        this.b(this.q, I18n.format(agu_0.q, new Object[0]), this.n / 2, 82, 0xFFFFFF);
        super.a(n, n2, f);
    }

    private void a() {
        this.w.k = aL0.a(aL0.a(aL0.a(new StringBuilder(), I18n.format(agu_0.e, new Object[0])), agu_0.i), I18n.format(aL0.a(aL0.a(new StringBuilder(), agu_0.p), this.y).toString(), new Object[0])).toString();
        this.z.k = aL0.a(aL0.a(new StringBuilder(), I18n.format(agu_0.o, new Object[0])), agu_0.g).toString();
        this.z.k = this.x ? aL0.a(aL0.a(new StringBuilder(), this.z.k), I18n.format(agu_0.s, new Object[0])).toString() : aL0.a(aL0.a(new StringBuilder(), this.z.k), I18n.format(agu_0.d, new Object[0])).toString();
    }

    @Override
    public void l() {
        ListInvoker.clear(this.l);
        ListInvoker.add(this.l, new QG(101, this.n / 2 - 155, this.f - 28, 150, 20, I18n.format(agu_0.j, new Object[0])));
        ListInvoker.add(this.l, new QG(102, this.n / 2 + 5, this.f - 28, 150, 20, I18n.format(agu_0.b, new Object[0])));
        this.w = new QG(104, this.n / 2 - 155, 100, 150, 20, I18n.format(agu_0.v, new Object[0]));
        ListInvoker.add(this.l, this.w);
        this.z = new QG(103, this.n / 2 + 5, 100, 150, 20, I18n.format(agu_0.u, new Object[0]));
        ListInvoker.add(this.l, this.z);
        this.a();
    }

    public rf_0(GuiScreen guiScreen) {
        this.v = guiScreen;
    }

    @Override
    protected void a(QG qG) throws IOException {
        if (qG.m == 102) {
            MCInvoker.displayGuiScreen(this.t, this.v);
        } else if (qG.m == 104) {
            this.y = this.y.equals(agu_0.c) ? agu_0.k : (this.y.equals(agu_0.r) ? agu_0.n : (this.y.equals(agu_0.w) ? agu_0.h : agu_0.t));
            this.a();
        } else if (qG.m == 103) {
            this.x = !this.x;
            this.a();
        } else if (qG.m == 101) {
            MCInvoker.displayGuiScreen(this.t, null);
            String string = IntegratedServerInvoker.a(MCInvoker.q(this.t), ar3_0.a(this.y), this.x);
            aoz_1 aoz_12 = new aoz_1(agu_0.l, string);
            kp_1.a(GW.f(this.t.ingameGUI), aoz_12);
        }
    }
}

