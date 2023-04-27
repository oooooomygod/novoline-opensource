/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.FontRendererInvoker;
import cc.novoline.invoke.ListInvoker;
import deobf.GuiScreen;
import deobf.MCInvoker;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import net.I18n;
import net.QG;
import net.aMI;
import net.aP2;
import net.dz_0;
import net.my_0;
import net.qe_0;
import net.ys_2;

/*
 * Renamed from net.Sv
 */
public class sv_0
extends GuiScreen {
    private String z;
    protected String v;
    private int y;
    private String w;
    private List A = my_0.c();
    private GuiScreen x;

    @Override
    public void g() {
        Iterator iterator;
        aP2.b();
        super.g();
        if (--this.y == 0 && dz_0.c(iterator = ListInvoker.iterator(this.l))) {
            QG qG = (QG)dz_0.b(iterator);
            qG.g = true;
        }
    }

    @Override
    public void a(int n, int n2, float f) {
        this.h();
        aP2.b();
        this.b(this.q, this.z, this.n / 2, 70, 0xFFFFFF);
        int n3 = 90;
        Iterator iterator = ListInvoker.iterator(this.A);
        if (dz_0.c(iterator)) {
            Object object = dz_0.b(iterator);
            this.b(this.q, (String)object, this.n / 2, n3, 0xFFFFFF);
            n3 += FontRendererInvoker.d(this.q);
        }
        super.a(n, n2, f);
    }

    public sv_0(GuiScreen guiScreen, String string, String string2) {
        this.x = guiScreen;
        this.z = string;
        this.w = string2;
        this.v = I18n.format(aMI.a, new Object[0]);
    }

    public void a(int n) {
        this.y = n;
        aP2.b();
        Iterator iterator = ListInvoker.iterator(this.l);
        if (dz_0.c(iterator)) {
            QG qG = (QG)dz_0.b(iterator);
            qG.g = false;
        }
    }

    @Override
    public void l() {
        ListInvoker.add(this.l, new qe_0(0, this.n / 2 - 74, this.f / 6 + 96, this.v));
        ListInvoker.clear(this.A);
        ListInvoker.addAll(this.A, FontRendererInvoker.b(this.q, this.w, this.n - 50));
    }

    @Override
    protected void a(QG qG) throws IOException {
        MCInvoker.displayGuiScreen(ys_2.at(), this.x);
    }
}

