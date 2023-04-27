/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import deobf.GuiScreen;
import deobf.MCInvoker;
import java.io.IOException;
import net.I18n;
import net.QG;
import net.ayd_2;

/*
 * Renamed from net.Rn
 */
public class rn_0
extends GuiScreen {
    private String w;
    private String v;

    @Override
    protected void a(char c, int n) throws IOException {
    }

    @Override
    protected void a(QG qG) throws IOException {
        MCInvoker.displayGuiScreen(this.t, null);
    }

    @Override
    public void l() {
        super.l();
        ListInvoker.add(this.l, new QG(0, this.n / 2 - 100, 140, I18n.format(ayd_2.a, new Object[0])));
    }

    public rn_0(String string, String string2) {
        this.v = string;
        this.w = string2;
    }

    @Override
    public void a(int n, int n2, float f) {
        this.b(0, 0, this.n, this.f, -12574688, -11530224);
        this.b(this.q, this.v, this.n / 2, 90, 0xFFFFFF);
        this.b(this.q, this.w, this.n / 2, 110, 0xFFFFFF);
        super.a(n, n2, f);
    }
}

