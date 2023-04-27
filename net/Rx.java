/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.FontRendererInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MathInvoker;
import deobf.GuiScreen;
import deobf.MCInvoker;
import java.io.IOException;
import net.I18n;
import net.KX;
import net.QG;
import net.R7;
import net.aL0;
import net.aib_2;
import net.nv_0;
import net.ro_0;
import net.v_0;

public class Rx
extends GuiScreen {
    private R7 D;
    private nv_0 v = KX.a();
    private String C;
    private String y;
    private aib_2 A;
    private QG B;
    private QG x;
    private String w;
    private QG z;

    public void a(String string) {
        this.v = KX.a(string);
    }

    public String a() {
        return this.v.toString();
    }

    private boolean b() {
        return this.A.y > -1 && this.A.y < ListInvoker.size(KX.a(this.v));
    }

    @Override
    protected void a(QG qG) throws IOException {
        int n = ListInvoker.size(KX.a(this.v)) - this.A.y - 1;
        if (qG.m == 1) {
            MCInvoker.displayGuiScreen(this.t, this.D);
        } else if (qG.m == 0) {
            this.D.K = this.a();
            MCInvoker.displayGuiScreen(this.t, this.D);
        } else if (qG.m == 5) {
            MCInvoker.displayGuiScreen(this.t, new ro_0(this));
        } else if (qG.m == 4 && this.b()) {
            ListInvoker.remove(KX.a(this.v), n);
            this.A.y = MathInvoker.b(this.A.y, ListInvoker.size(KX.a(this.v)) - 1);
        }
        KX.b(this.v);
        this.d();
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    public Rx(R7 r7, String string) {
        this.D = r7;
        this.a(string);
    }

    @Override
    public void a(int n, int n2, float f) {
        this.h();
        this.A.a(n, n2, f);
        this.b(this.q, this.w, this.n / 2, 8, 0xFFFFFF);
        int n3 = this.n / 2 - 92 - 16;
        this.a(this.q, this.C, n3, 32, 0xFFFFFF);
        this.a(this.q, this.y, n3 + 2 + 213 - FontRendererInvoker.a(this.q, this.y), 32, 0xFFFFFF);
        super.a(n, n2, f);
    }

    @Override
    public void l() {
        ListInvoker.clear(this.l);
        this.w = I18n.format(v_0.k, new Object[0]);
        this.C = I18n.format(v_0.h, new Object[0]);
        this.y = I18n.format(v_0.i, new Object[0]);
        this.A = new aib_2(this);
        this.x = new QG(2, this.n / 2 - 154, this.f - 52, 100, 20, aL0.a(aL0.a(new StringBuilder(), I18n.format(v_0.g, new Object[0])), v_0.c).toString());
        ListInvoker.add(this.l, this.x);
        this.z = new QG(3, this.n / 2 - 50, this.f - 52, 100, 20, aL0.a(aL0.a(new StringBuilder(), I18n.format(v_0.d, new Object[0])), v_0.a).toString());
        ListInvoker.add(this.l, this.z);
        this.B = new QG(4, this.n / 2 - 155, this.f - 52, 150, 20, I18n.format(v_0.f, new Object[0]));
        ListInvoker.add(this.l, this.B);
        ListInvoker.add(this.l, new QG(0, this.n / 2 - 155, this.f - 28, 150, 20, I18n.format(v_0.b, new Object[0])));
        ListInvoker.add(this.l, new QG(5, this.n / 2 + 5, this.f - 52, 150, 20, I18n.format(v_0.e, new Object[0])));
        ListInvoker.add(this.l, new QG(1, this.n / 2 + 5, this.f - 28, 150, 20, I18n.format(v_0.j, new Object[0])));
        this.z.j = false;
        this.x.j = false;
        KX.b(this.v);
        this.d();
    }

    public void d() {
        boolean bl;
        this.B.g = bl = this.b();
        this.z.g = bl;
        this.z.g = false;
        this.x.g = false;
    }

    @Override
    public void c() throws IOException {
        super.c();
        this.A.g();
    }

    static nv_0 a(Rx rx) {
        return rx.v;
    }
}

