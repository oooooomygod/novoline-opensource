/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.KeyboardInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.StringInvoker;
import deobf.GuiScreen;
import java.io.IOException;
import java.util.List;
import net.I18n;
import net.QG;
import net.ServerData;
import net.WF;
import net.awu_1;
import net.hc_1;
import net.sc_0;

public class RF
extends GuiScreen {
    private GuiScreen x;
    private ServerData w;
    private sc_0 v;

    @Override
    protected void a(QG qG) throws IOException {
        if (qG.g) {
            if (qG.m == 1) {
                this.x.a(false, 0);
            } else if (qG.m == 0) {
                this.w.k = hc_1.a(this.v);
                this.x.a(true, 0);
            }
        }
    }

    @Override
    public void l() {
        KeyboardInvoker.a(true);
        ListInvoker.clear(this.l);
        ListInvoker.add(this.l, new QG(0, this.n / 2 - 100, this.f / 4 + 96 + 12, I18n.format(WF.a, new Object[0])));
        ListInvoker.add(this.l, new QG(1, this.n / 2 - 100, this.f / 4 + 120 + 12, I18n.format(WF.b, new Object[0])));
        this.v = new sc_0(2, this.q, this.n / 2 - 100, 116, 200, 20);
        hc_1.a(this.v, 128);
        hc_1.c(this.v, true);
        hc_1.b(this.v, this.t.gameSettings.ba);
        ((QG)ListInvoker.get((List)this.l, (int)0)).g = !StringInvoker.g(hc_1.a(this.v)) && StringInvoker.g(hc_1.a(this.v), WF.e).length > 0;
    }

    @Override
    protected void a(char c, int n) throws IOException {
        if (hc_1.a(this.v, c, n)) {
            ((QG)ListInvoker.get((List)this.l, (int)0)).g = !StringInvoker.g(hc_1.a(this.v)) && StringInvoker.g(hc_1.a(this.v), WF.c).length > 0;
        } else if (n == 28 || n == 156) {
            this.a((QG)ListInvoker.get(this.l, 0));
        }
    }

    @Override
    public void a(int n, int n2, float f) {
        this.h();
        this.b(this.q, I18n.format(WF.f, new Object[0]), this.n / 2, 20, 0xFFFFFF);
        this.a(this.q, I18n.format(WF.d, new Object[0]), this.n / 2 - 100, 100, 0xA0A0A0);
        hc_1.d(this.v);
        super.a(n, n2, f);
    }

    public RF(GuiScreen guiScreen, ServerData serverData) {
        this.x = guiScreen;
        this.w = serverData;
    }

    @Override
    public void i() {
        KeyboardInvoker.a(false);
        this.t.gameSettings.ba = hc_1.a(this.v);
        awu_1.c(this.t.gameSettings);
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    @Override
    protected void b(int n, int n2, int n3) throws IOException {
        super.b(n, n2, n3);
        this.v.a(n, n2, n3);
    }

    @Override
    public void g() {
        hc_1.c(this.v);
    }
}

