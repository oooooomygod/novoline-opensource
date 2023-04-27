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
import net.aL0;
import net.anw_0;
import net.avg_0;
import net.ayy_0;

public class SQ
extends GuiScreen {
    private GuiScreen v;

    @Override
    public void a(int n, int n2, float f) {
        this.h();
        GlStateManagerInvoker.pushMatrix();
        GlStateManagerInvoker.b(2.0, 2.0, 2.0);
        String string = aL0.a(aL0.a(new StringBuilder(), (Object)anw_0.BOLD), avg_0.m).toString();
        this.a(this.q, string, (this.n - FontRendererInvoker.a(this.q, string) * 2) / 4, 5, -1);
        GlStateManagerInvoker.popMatrix();
        int n3 = (5 + this.q.r) * 2 + 2;
        String string2 = aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), (Object)anw_0.GRAY), avg_0.I), (Object)anw_0.BOLD), avg_0.L).toString();
        String string3 = aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), (Object)anw_0.GRAY), avg_0.e), (Object)anw_0.BOLD), avg_0.j).toString();
        String string4 = aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), (Object)anw_0.GRAY), avg_0.d), (Object)anw_0.BOLD), avg_0.a).toString();
        String string5 = aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), (Object)anw_0.GRAY), avg_0.w), (Object)anw_0.BOLD), avg_0.F).toString();
        String string6 = aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), (Object)anw_0.GRAY), avg_0.J), (Object)anw_0.BOLD), avg_0.h).toString();
        this.a(this.q, string2, (this.n - FontRendererInvoker.a(this.q, string2)) / 2, n3, -1);
        this.a(this.q, avg_0.u, (this.n - FontRendererInvoker.a(this.q, avg_0.z)) / 2, n3 + this.q.r, -1);
        this.a(this.q, avg_0.v, (this.n - FontRendererInvoker.a(this.q, avg_0.i)) / 2, n3 + this.q.r * 2, -1);
        this.a(this.q, avg_0.l, (this.n - FontRendererInvoker.a(this.q, avg_0.C)) / 2, n3 + this.q.r * 3, -1);
        this.a(this.q, string3, (this.n - FontRendererInvoker.a(this.q, string3)) / 2, n3 + this.q.r * 5, -1);
        this.a(this.q, avg_0.E, (this.n - FontRendererInvoker.a(this.q, avg_0.t)) / 2, n3 + this.q.r * 6, -1);
        this.a(this.q, string4, (this.n - FontRendererInvoker.a(this.q, string4)) / 2, n3 + this.q.r * 8, -1);
        this.a(this.q, avg_0.c, (this.n - FontRendererInvoker.a(this.q, avg_0.x)) / 2, n3 + this.q.r * 9, -1);
        ayy_0.b();
        this.a(this.q, string5, (this.n - FontRendererInvoker.a(this.q, string5)) / 2, n3 + this.q.r * 11, -1);
        this.a(this.q, avg_0.n, (this.n - FontRendererInvoker.a(this.q, avg_0.r)) / 2, n3 + this.q.r * 12, -1);
        this.a(this.q, string6, (this.n - FontRendererInvoker.a(this.q, string6)) / 2, n3 + this.q.r * 14, -1);
        this.a(this.q, avg_0.p, (this.n - FontRendererInvoker.a(this.q, avg_0.s)) / 2, n3 + this.q.r * 15, -1);
        GlStateManagerInvoker.pushMatrix();
        GlStateManagerInvoker.b(0.5, 0.5, 0.5);
        this.a(this.q, aL0.a(aL0.a(new StringBuilder(), (Object)anw_0.GRAY), avg_0.o).toString(), this.n + FontRendererInvoker.a(this.q, avg_0.G), (n3 + this.q.r) * 2 + this.q.r / 2, -1);
        this.a(this.q, aL0.a(aL0.a(new StringBuilder(), (Object)anw_0.GRAY), avg_0.H).toString(), this.n + FontRendererInvoker.a(this.q, avg_0.g), (n3 + this.q.r * 2) * 2 + this.q.r / 2, -1);
        this.a(this.q, aL0.a(aL0.a(new StringBuilder(), (Object)anw_0.GRAY), avg_0.K).toString(), this.n + FontRendererInvoker.a(this.q, avg_0.D), (n3 + this.q.r * 3) * 2 + this.q.r / 2, -1);
        this.a(this.q, aL0.a(aL0.a(new StringBuilder(), (Object)anw_0.GRAY), avg_0.f).toString(), this.n + FontRendererInvoker.a(this.q, avg_0.q), (n3 + this.q.r * 6) * 2 + this.q.r / 2, -1);
        this.a(this.q, aL0.a(aL0.a(new StringBuilder(), (Object)anw_0.GRAY), avg_0.k).toString(), this.n + FontRendererInvoker.a(this.q, avg_0.y), (n3 + this.q.r * 9) * 2 + this.q.r / 2, -1);
        this.a(this.q, aL0.a(aL0.a(new StringBuilder(), (Object)anw_0.GRAY), avg_0.B).toString(), this.n + FontRendererInvoker.a(this.q, avg_0.A), (n3 + this.q.r * 12) * 2 + this.q.r / 2, -1);
        GlStateManagerInvoker.popMatrix();
        super.a(n, n2, f);
        ListInvoker.b(new ListInvoker[2]);
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    @Override
    protected void a(QG qG) throws IOException {
        if (qG.m == 1) {
            MCInvoker.displayGuiScreen(this.t, this.v);
        }
    }

    public SQ(GuiScreen guiScreen) {
        this.v = guiScreen;
    }

    @Override
    public void l() {
        super.l();
        ListInvoker.add(this.l, new QG(1, this.n / 2 - 100, this.f - 25, 200, 20, avg_0.b));
    }

    @Override
    public void c() throws IOException {
        super.c();
    }
}

