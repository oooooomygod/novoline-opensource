/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.FontRendererInvoker;
import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.ListInvoker;
import deobf.GuiScreen;
import deobf.MCInvoker;
import java.io.IOException;
import net.QG;
import net.SQ;
import net.a8k_0;
import net.aHZ;
import net.aL0;
import net.acu_0;
import net.anw_0;
import net.awc_2;
import net.ayy_0;
import net.fo_0;
import net.ju_0;

public class SI
extends GuiScreen {
    public a8k_0 v;
    private GuiScreen w;

    public SI(GuiScreen guiScreen) {
        this.w = guiScreen;
    }

    @Override
    protected void a(QG qG) throws IOException {
        ayy_0.b();
        this.v.a(qG);
        if (qG.m == 1) {
            MCInvoker.displayGuiScreen(this.t, this.w);
        }
        if (qG.m == 2) {
            MCInvoker.displayGuiScreen(this.t, new SQ(this));
        }
    }

    @Override
    public void c() throws IOException {
        this.v.g();
        super.c();
    }

    @Override
    public void l() {
        super.l();
        ListInvoker.add(this.l, new QG(1, this.n / 2 - 100, this.f - 25, 200, 20, ju_0.e));
        ListInvoker.add(this.l, new QG(2, this.n / 2 - 180, this.f - 25, 75, 20, ju_0.i));
        this.v = new a8k_0(this, this.t, this.n, this.f, 32, this.f - 32, 10);
    }

    @Override
    public void a(int n, int n2, float f) {
        this.v.a(n, n2, f);
        GlStateManagerInvoker.pushMatrix();
        GlStateManagerInvoker.b(2.0, 2.0, 2.0);
        ayy_0.b();
        String string = aL0.a(aL0.a(new StringBuilder(), (Object)anw_0.BOLD), ju_0.h).toString();
        this.a(this.q, string, (this.n - FontRendererInvoker.a(this.q, string) * 2) / 4, 5, -1);
        GlStateManagerInvoker.popMatrix();
        String string2 = awc_2.a(acu_0.a(fo_0.a(fo_0.a())));
        String string3 = aHZ.a(acu_0.b(fo_0.a(fo_0.a())));
        String string4 = aHZ.b(acu_0.b(fo_0.a(fo_0.a())));
        String string5 = aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), ju_0.b), string2), ju_0.g), string3).toString();
        String string6 = aL0.a(aL0.a(new StringBuilder(), ju_0.c), string4).toString();
        int n3 = (5 + this.q.r) * 2 + 2;
        this.a(this.q, aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), (Object)anw_0.GRAY), ju_0.a), (Object)anw_0.BOLD), ju_0.d).toString(), (this.n - FontRendererInvoker.a(this.q, ju_0.f)) / 2, n3, -1);
        this.a(this.q, string5, (this.n - FontRendererInvoker.a(this.q, string5)) / 2, n3 + this.q.r, -1);
        this.a(this.q, string6, (this.n - FontRendererInvoker.a(this.q, string6)) / 2, n3 + this.q.r * 2, -1);
        super.a(n, n2, f);
        if (ListInvoker.b() != null) {
            ayy_0.b(new String[1]);
        }
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }
}

