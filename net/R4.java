/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import deobf.GuiScreen;
import deobf.MCInvoker;
import java.io.IOException;
import net.GuiMainMenu;
import net.I18n;
import net.QG;
import net.a4v_0;
import net.qe_0;

public class R4
extends GuiScreen {
    @Override
    public void a(int n, int n2, float f) {
        this.h();
        this.b(this.q, a4v_0.h, this.n / 2, this.f / 4 - 60 + 20, 0xFFFFFF);
        this.a(this.q, a4v_0.f, this.n / 2 - 140, this.f / 4 - 60 + 60, 0xA0A0A0);
        this.a(this.q, a4v_0.j, this.n / 2 - 140, this.f / 4 - 60 + 60 + 18, 0xA0A0A0);
        this.a(this.q, a4v_0.b, this.n / 2 - 140, this.f / 4 - 60 + 60 + 27, 0xA0A0A0);
        this.a(this.q, a4v_0.e, this.n / 2 - 140, this.f / 4 - 60 + 60 + 36, 0xA0A0A0);
        this.a(this.q, a4v_0.i, this.n / 2 - 140, this.f / 4 - 60 + 60 + 54, 0xA0A0A0);
        this.a(this.q, a4v_0.c, this.n / 2 - 140, this.f / 4 - 60 + 60 + 63, 0xA0A0A0);
        this.a(this.q, a4v_0.g, this.n / 2 - 140, this.f / 4 - 60 + 60 + 72, 0xA0A0A0);
        this.a(this.q, a4v_0.d, this.n / 2 - 140, this.f / 4 - 60 + 60 + 81, 0xA0A0A0);
        super.a(n, n2, f);
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    @Override
    protected void a(QG qG) throws IOException {
        if (qG.m == 0) {
            MCInvoker.displayGuiScreen(this.t, new GuiMainMenu());
        } else if (qG.m == 1) {
            MCInvoker.e(this.t);
        }
    }

    @Override
    public void l() {
        ListInvoker.clear(this.l);
        ListInvoker.add(this.l, new qe_0(0, this.n / 2 - 155, this.f / 4 + 120 + 12, I18n.format(a4v_0.k, new Object[0])));
        ListInvoker.add(this.l, new qe_0(1, this.n / 2 - 155 + 160, this.f / 4 + 120 + 12, I18n.format(a4v_0.a, new Object[0])));
    }

    @Override
    protected void a(char c, int n) throws IOException {
    }
}

