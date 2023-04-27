/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockInvoker;
import cc.novoline.invoke.IntegratedServerInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.PlayerInvoker;
import deobf.GuiConnecting;
import deobf.GuiScreen;
import deobf.MCInvoker;
import java.util.List;
import net.GuiMainMenu;
import net.I18n;
import net.PO;
import net.QG;
import net.R8;
import net.RD;
import net.rf_0;
import net.ri_0;

public class R2
extends GuiScreen {
    private int v;
    private int w;

    @Override
    protected void a(QG qG) {
        switch (qG.m) {
            case 0: {
                MCInvoker.displayGuiScreen(this.t, new RD(this, this.t.gameSettings));
                break;
            }
            case 1: {
                if (this.t.world != null) {
                    BlockInvoker.h(this.t.world);
                    this.t.world = null;
                }
                MCInvoker.displayGuiScreen(this.t, new GuiMainMenu());
                qG.g = false;
            }
            default: {
                break;
            }
            case 4: {
                MCInvoker.displayGuiScreen(this.t, null);
                MCInvoker.r(this.t);
                break;
            }
            case 5: {
                MCInvoker.displayGuiScreen(this.t, new ri_0(this, PlayerInvoker.s(this.t.player)));
                break;
            }
            case 6: {
                MCInvoker.displayGuiScreen(this.t, new R8(this, PlayerInvoker.s(this.t.player)));
                break;
            }
            case 7: {
                MCInvoker.displayGuiScreen(this.t, new rf_0(this));
                break;
            }
            case 8: {
                BlockInvoker.h(this.t.world);
                MCInvoker.displayGuiScreen(this.t, new GuiConnecting(this.t.al, this.t, MCInvoker.W(this.t)));
            }
        }
    }

    @Override
    public void g() {
        super.g();
        ++this.w;
    }

    @Override
    public void a(int n, int n2, float f) {
        this.h();
        this.b(this.q, I18n.format(PO.e, new Object[0]), this.n / 2, 40, 0xFFFFFF);
        super.a(n, n2, f);
    }

    @Override
    public void l() {
        this.v = 0;
        ListInvoker.clear(this.l);
        int n = -16;
        ListInvoker.add(this.l, new QG(1, this.n / 2 - 100, this.f / 4 + 120 + n, I18n.format(PO.a, new Object[0])));
        if (!MCInvoker.B(this.t)) {
            ((QG)ListInvoker.get((List)this.l, (int)0)).k = I18n.format(PO.f, new Object[0]);
        }
        ListInvoker.add(this.l, new QG(4, this.n / 2 - 100, this.f / 4 + 24 + n, I18n.format(PO.c, new Object[0])));
        ListInvoker.add(this.l, new QG(0, this.n / 2 - 100, this.f / 4 + 96 + n, 98, 20, I18n.format(PO.b, new Object[0])));
        QG qG = new QG(7, this.n / 2 + 2, this.f / 4 + 96 + n, 98, 20, I18n.format(PO.d, new Object[0]));
        ListInvoker.add(this.l, qG);
        ListInvoker.add(this.l, new QG(5, this.n / 2 - 100, this.f / 4 + 48 + n, 98, 20, I18n.format(PO.i, new Object[0])));
        ListInvoker.add(this.l, new QG(6, this.n / 2 + 2, this.f / 4 + 48 + n, 98, 20, I18n.format(PO.h, new Object[0])));
        QG qG2 = new QG(8, this.n / 2 - 100, this.f / 4 + 73 + n, PO.g);
        ListInvoker.add(this.l, qG2);
        boolean bl = MCInvoker.k(this.t) && !IntegratedServerInvoker.m(MCInvoker.q(this.t));
        qG2.g = true;
        qG.g = bl;
    }
}

