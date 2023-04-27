/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.KeyboardInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.SaveLoaderInvoker;
import cc.novoline.invoke.StringInvoker;
import deobf.GuiScreen;
import deobf.MCInvoker;
import java.io.IOException;
import java.util.List;
import net.I18n;
import net.ISaveFormat;
import net.QG;
import net.WorldInfo;
import net.hc_1;
import net.kj_0;
import net.sc_0;
import net.uv_2;

/*
 * Renamed from net.Ra
 */
public class ra_0
extends GuiScreen {
    private GuiScreen w;
    private sc_0 v;
    private String x;

    @Override
    public void a(int n, int n2, float f) {
        this.h();
        this.b(this.q, I18n.format(kj_0.b, new Object[0]), this.n / 2, 20, 0xFFFFFF);
        this.a(this.q, I18n.format(kj_0.a, new Object[0]), this.n / 2 - 100, 47, 0xA0A0A0);
        hc_1.d(this.v);
        super.a(n, n2, f);
    }

    @Override
    protected void a(QG qG) throws IOException {
        if (qG.g) {
            if (qG.m == 1) {
                MCInvoker.displayGuiScreen(this.t, this.w);
            } else if (qG.m == 0) {
                ISaveFormat iSaveFormat = MCInvoker.P(this.t);
                SaveLoaderInvoker.a(iSaveFormat, this.x, StringInvoker.h(hc_1.a(this.v)));
                MCInvoker.displayGuiScreen(this.t, this.w);
            }
        }
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
    public void l() {
        KeyboardInvoker.a(true);
        ListInvoker.clear(this.l);
        ListInvoker.add(this.l, new QG(0, this.n / 2 - 100, this.f / 4 + 96 + 12, I18n.format(kj_0.c, new Object[0])));
        ListInvoker.add(this.l, new QG(1, this.n / 2 - 100, this.f / 4 + 120 + 12, I18n.format(kj_0.d, new Object[0])));
        ISaveFormat iSaveFormat = MCInvoker.P(this.t);
        WorldInfo worldInfo = SaveLoaderInvoker.f(iSaveFormat, this.x);
        String string = uv_2.z(worldInfo);
        this.v = new sc_0(2, this.q, this.n / 2 - 100, 60, 200, 20);
        hc_1.c(this.v, true);
        hc_1.b(this.v, string);
    }

    @Override
    public void g() {
        hc_1.c(this.v);
    }

    @Override
    protected void a(char c, int n) throws IOException {
        hc_1.a(this.v, c, n);
        boolean bl = ((QG)ListInvoker.get((List)this.l, (int)0)).g = !StringInvoker.g(StringInvoker.h(hc_1.a(this.v)));
        if (n == 28 || n == 156) {
            this.a((QG)ListInvoker.get(this.l, 0));
        }
    }

    public ra_0(GuiScreen guiScreen, String string) {
        this.w = guiScreen;
        this.x = string;
    }

    @Override
    public void i() {
        KeyboardInvoker.a(false);
    }
}

