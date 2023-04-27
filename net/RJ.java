/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.IStreamInvoker;
import cc.novoline.invoke.ListInvoker;
import deobf.FontRenderer;
import deobf.GuiScreen;
import deobf.MCInvoker;
import java.io.IOException;
import net.I18n;
import net.QG;
import net.a8P;
import net.a8n_0;
import net.awu_1;
import net.iw_1;

public class RJ
extends GuiScreen {
    private String v;
    private GuiScreen x;
    private a8n_0 w;

    public RJ(GuiScreen guiScreen) {
        this.x = guiScreen;
    }

    static FontRenderer a(RJ rJ) {
        return rJ.q;
    }

    @Override
    protected void a(QG qG) throws IOException {
        if (qG.g) {
            if (qG.m == 1) {
                MCInvoker.displayGuiScreen(this.t, this.x);
            } else {
                this.t.gameSettings.H = a8P.c;
                awu_1.c(this.t.gameSettings);
            }
        }
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    static FontRenderer f(RJ rJ) {
        return rJ.q;
    }

    static FontRenderer c(RJ rJ) {
        return rJ.q;
    }

    static FontRenderer d(RJ rJ) {
        return rJ.q;
    }

    @Override
    public void i() {
        if (IStreamInvoker.m(MCInvoker.a(this.t))) {
            iw_1.g(IStreamInvoker.q(MCInvoker.a(this.t)));
        }
    }

    static FontRenderer h(RJ rJ) {
        return rJ.q;
    }

    static FontRenderer g(RJ rJ) {
        return rJ.q;
    }

    @Override
    public void a(int n, int n2, float f) {
        this.h();
        this.w.a(n, n2, f);
        this.b(this.q, this.v, this.n / 2, 20, 0xFFFFFF);
        super.a(n, n2, f);
    }

    @Override
    public void c() throws IOException {
        super.c();
        this.w.g();
    }

    static FontRenderer e(RJ rJ) {
        return rJ.q;
    }

    @Override
    public void l() {
        this.v = I18n.format(a8P.a, new Object[0]);
        this.w = new a8n_0(this, this.t);
        if (!IStreamInvoker.m(MCInvoker.a(this.t))) {
            IStreamInvoker.j(MCInvoker.a(this.t));
        }
        ListInvoker.add(this.l, new QG(1, this.n / 2 - 155, this.f - 24 - 6, 150, 20, I18n.format(a8P.d, new Object[0])));
        ListInvoker.add(this.l, new QG(2, this.n / 2 + 5, this.f - 24 - 6, 150, 20, I18n.format(a8P.b, new Object[0])));
    }

    static FontRenderer b(RJ rJ) {
        return rJ.q;
    }
}

