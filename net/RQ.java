/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import deobf.GuiScreen;
import deobf.MCInvoker;
import java.io.IOException;
import net.I18n;
import net.P;
import net.QG;
import net.QZ;
import net.aBO;
import net.aL0;
import net.aMA;
import net.aS0;
import net.aea_1;
import net.awu_1;

public class RQ
extends GuiScreen {
    private String w;
    private GuiScreen v;

    private String a(aea_1 aea_12) {
        String string = aS0.c(awu_1.h(this.t.gameSettings), (Object)aea_12) ? I18n.format(P.b, new Object[0]) : I18n.format(P.c, new Object[0]);
        return aL0.a(aL0.a(aL0.a(new StringBuilder(), aBO.a(aMA.b(aea_12))), P.e), string).toString();
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    static String a(RQ rQ, aea_1 aea_12) {
        return rQ.a(aea_12);
    }

    @Override
    public void a(int n, int n2, float f) {
        this.h();
        this.b(this.q, this.w, this.n / 2, 20, 0xFFFFFF);
        super.a(n, n2, f);
    }

    @Override
    protected void a(QG qG) throws IOException {
        if (qG.g) {
            if (qG.m == 200) {
                awu_1.c(this.t.gameSettings);
                MCInvoker.displayGuiScreen(this.t, this.v);
            } else if (qG instanceof QZ) {
                aea_1 aea_12 = QZ.a((QZ)qG);
                awu_1.a(this.t.gameSettings, aea_12);
                qG.k = this.a(aea_12);
            }
        }
    }

    public RQ(GuiScreen guiScreen) {
        this.v = guiScreen;
    }

    @Override
    public void l() {
        int n = 0;
        this.w = I18n.format(P.d, new Object[0]);
        for (aea_1 aea_12 : aea_1.values()) {
            ListInvoker.add(this.l, new QZ(this, aMA.a(aea_12), this.n / 2 - 155 + n % 2 * 160, this.f / 6 + 24 * (n >> 1), 150, 20, aea_12, null));
            ++n;
        }
        int cfr_ignored_0 = n % 2;
        ListInvoker.add(this.l, new QG(200, this.n / 2 - 100, this.f / 6 + 24 * (n >> 1), I18n.format(P.a, new Object[0])));
    }
}

