/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.KeyboardInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.StringInvoker;
import deobf.GuiScreen;
import deobf.MCInvoker;
import java.io.IOException;
import java.util.List;
import net.I18n;
import net.Q7;
import net.QG;
import net.RI;
import net.ResourceLocation;
import net.a8V;
import net.aMJ;
import net.asi_2;
import net.cg_0;
import net.fl_2;
import net.hc_1;
import net.my_0;
import net.sc_0;


public class Rh
extends GuiScreen {
    private String B;
    private QG z;
    protected String C = Q7.d;
    private static List<aMJ> x = my_0.c();
    private a8V y;
    private RI w;
    private String v;
    private sc_0 A;

    @Override
    public void l() {
        ListInvoker.clear(this.l);
        KeyboardInvoker.a(true);
        this.C = I18n.format(Q7.b, new Object[0]);
        this.B = I18n.format(Q7.o, new Object[0]);
        this.v = I18n.format(Q7.a, new Object[0]);
        this.A = new sc_0(2, this.q, 50, 40, this.n - 100, 20);
        this.y = new a8V(this);
        hc_1.a(this.A, 2000);
        hc_1.b(this.A, cg_0.a(this.w));
        this.z = new QG(0, this.n / 2 - 102, this.f - 27, 100, 20, I18n.format(Q7.x, new Object[0]));
        ListInvoker.add(this.l, this.z);
        ListInvoker.add(this.l, new QG(1, this.n / 2 + 3, this.f - 27, 100, 20, I18n.format(Q7.g, new Object[0])));
        this.b();
    }

    static {
        asi_2 asi_22 = fl_2.a(Q7.h);
        ResourceLocation resourceLocation = new ResourceLocation(Q7.u);
        ListInvoker.add(x, new aMJ(I18n.format(Q7.k, new Object[0]), resourceLocation, asi_22));
        asi_22 = fl_2.a(Q7.A);
        resourceLocation = new ResourceLocation(Q7.l);
        ListInvoker.add(x, new aMJ(I18n.format(Q7.y, new Object[0]), resourceLocation, asi_22));
        asi_22 = fl_2.a(Q7.i);
        resourceLocation = new ResourceLocation(Q7.r);
        ListInvoker.add(x, new aMJ(I18n.format(Q7.j, new Object[0]), resourceLocation, asi_22));
        asi_22 = fl_2.a(Q7.p);
        resourceLocation = new ResourceLocation(Q7.z);
        ListInvoker.add(x, new aMJ(I18n.format(Q7.q, new Object[0]), resourceLocation, asi_22));
        asi_22 = fl_2.a(Q7.m);
        resourceLocation = new ResourceLocation(Q7.e);
        ListInvoker.add(x, new aMJ(I18n.format(Q7.v, new Object[0]), resourceLocation, asi_22));
        asi_22 = fl_2.a(Q7.c);
        resourceLocation = new ResourceLocation(Q7.s);
        ListInvoker.add(x, new aMJ(I18n.format(Q7.w, new Object[0]), resourceLocation, asi_22));
        asi_22 = fl_2.a(Q7.t);
        resourceLocation = new ResourceLocation(Q7.f);
        ListInvoker.add(x, new aMJ(I18n.format(Q7.n, new Object[0]), resourceLocation, asi_22));
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    @Override
    protected void a(char c, int n) throws IOException {
        if (!hc_1.a(this.A, c, n)) {
            super.a(c, n);
        }
    }

    @Override
    public void a(int n, int n2, float f) {
        this.h();
        this.y.a(n, n2, f);
        this.b(this.q, this.C, this.n / 2, 8, 0xFFFFFF);
        this.a(this.q, this.B, 50, 30, 0xA0A0A0);
        this.a(this.q, this.v, 50, 70, 0xA0A0A0);
        hc_1.d(this.A);
        super.a(n, n2, f);
    }

    private boolean c() {
        return this.y.x > -1 && this.y.x < ListInvoker.size(x) || StringInvoker.c(hc_1.a(this.A)) > 1;
    }

    static sc_0 b(Rh rh) {
        return rh.A;
    }

    @Override
    public void i() {
        KeyboardInvoker.a(false);
    }

    @Override
    public void g() {
        hc_1.c(this.A);
        super.g();
    }

    static List a() {
        return x;
    }

    @Override
    protected void b(int n, int n2, int n3) throws IOException {
        this.A.a(n, n2, n3);
        super.b(n, n2, n3);
    }

    public Rh(RI rI) {
        this.w = rI;
    }

    @Override
    public void c() throws IOException {
        super.c();
        this.y.g();
    }

    static a8V a(Rh rh) {
        return rh.y;
    }

    public void b() {
        this.z.g = this.c();
    }

    @Override
    protected void a(QG qG) throws IOException {
        switch (qG.m) {
            case 0: {
                cg_0.a(this.w, hc_1.a(this.A));
                MCInvoker.displayGuiScreen(this.t, this.w);
                break;
            }
            case 1: {
                MCInvoker.displayGuiScreen(this.t, this.w);
            }
        }
    }
}

