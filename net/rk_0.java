/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockInvoker;
import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.PlayerInvoker;
import deobf.GuiScreen;
import deobf.GuiYesNoCallback;
import deobf.MCInvoker;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import net.GuiMainMenu;
import net.GuiYesNo;
import net.I18n;
import net.QG;
import net.X2;
import net.aL0;
import net.anw_0;
import net.aud_2;
import net.dz_0;
import net.uv_2;

/*
 * Renamed from net.Rk
 */
public class rk_0
extends GuiScreen
implements GuiYesNoCallback {
    private int w;
    private boolean v = false;

    @Override
    public void g() {
        super.g();
        ++this.w;
        if (this.w == 20) {
            Iterator iterator = ListInvoker.iterator(this.l);
            while (dz_0.c(iterator)) {
                QG qG = (QG)dz_0.b(iterator);
                qG.g = true;
            }
        }
    }

    @Override
    protected void a(QG qG) throws IOException {
        switch (qG.m) {
            case 0: {
                PlayerInvoker.ap(this.t.player);
                MCInvoker.displayGuiScreen(this.t, null);
                break;
            }
            case 1: {
                if (uv_2.t(BlockInvoker.q(this.t.world))) {
                    MCInvoker.displayGuiScreen(this.t, new GuiMainMenu());
                    break;
                }
                GuiYesNo guiYesNo = new GuiYesNo(this, I18n.format(X2.c, new Object[0]), X2.d, I18n.format(X2.a, new Object[0]), I18n.format(X2.f, new Object[0]), 0);
                MCInvoker.displayGuiScreen(this.t, guiYesNo);
                aud_2.a(guiYesNo, 20);
            }
        }
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    @Override
    public boolean d() {
        return false;
    }

    @Override
    protected void a(char c, int n) throws IOException {
    }

    @Override
    public void a(boolean bl, int n) {
        BlockInvoker.h(this.t.world);
        MCInvoker.a(this.t, null);
        MCInvoker.displayGuiScreen(this.t, new GuiMainMenu());
    }

    @Override
    public void a(int n, int n2, float f) {
        this.b(0, 0, this.n, this.f, 0x60500000, -1602211792);
        GlStateManagerInvoker.pushMatrix();
        GlStateManagerInvoker.c(2.0f, 2.0f, 2.0f);
        uv_2.t(BlockInvoker.q(this.t.world));
        String string = I18n.format(X2.i, new Object[0]);
        this.b(this.q, string, this.n / 2 / 2, 30, 0xFFFFFF);
        GlStateManagerInvoker.popMatrix();
        this.b(this.q, I18n.format(X2.l, new Object[0]), this.n / 2, 144, 0xFFFFFF);
        this.b(this.q, aL0.c(aL0.a(aL0.a(aL0.a(new StringBuilder(), I18n.format(X2.g, new Object[0])), X2.b), (Object)anw_0.YELLOW), PlayerInvoker.F(this.t.player)).toString(), this.n / 2, 100, 0xFFFFFF);
        super.a(n, n2, f);
    }

    @Override
    public void l() {
        ListInvoker.clear(this.l);
        if (uv_2.t(BlockInvoker.q(this.t.world))) {
            if (MCInvoker.B(this.t)) {
                ListInvoker.add(this.l, new QG(1, this.n / 2 - 100, this.f / 4 + 96, I18n.format(X2.m, new Object[0])));
            } else {
                ListInvoker.add(this.l, new QG(1, this.n / 2 - 100, this.f / 4 + 96, I18n.format(X2.h, new Object[0])));
            }
        } else {
            ListInvoker.add(this.l, new QG(0, this.n / 2 - 100, this.f / 4 + 72, I18n.format(X2.e, new Object[0])));
            ListInvoker.add(this.l, new QG(1, this.n / 2 - 100, this.f / 4 + 96, I18n.format(X2.k, new Object[0])));
            if (MCInvoker.y(this.t) == null) {
                ((QG)ListInvoker.get((List)this.l, (int)1)).g = false;
            }
        }
        Iterator iterator = ListInvoker.iterator(this.l);
        while (dz_0.c(iterator)) {
            QG qG = (QG)dz_0.b(iterator);
            qG.g = false;
        }
    }
}

