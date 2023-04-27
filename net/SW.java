/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import deobf.GameSettings;
import deobf.GuiScreen;
import deobf.MCInvoker;
import net.I18n;
import net.IB;
import net.QG;
import net.YS;
import net.aDY;
import net.aP2;
import net.aW3;
import net.aj2;
import net.awu_1;
import net.qd_0;
import net.qe_0;
import net.qz_0;
import net.ud_0;

public class SW
extends GuiScreen {
    private GameSettings w;
    private GuiScreen y;
    private static aj2[] x = new aj2[]{aj2.CLOUDS, aj2.CLOUD_HEIGHT, aj2.TREES, aj2.RAIN, aj2.SKY, aj2.STARS, aj2.SUN_MOON, aj2.SHOW_CAPES, aj2.TRANSLUCENT_BLOCKS, aj2.HELD_ITEM_TOOLTIPS, aj2.DROPPED_ITEMS, aj2.ENTITY_SHADOWS, aj2.VIGNETTE, aj2.DYNAMIC_FOV};
    private aW3 v = new aW3(this);
    protected String z;

    @Override
    protected void a(QG qG) {
        aP2.b();
        if (qG.g) {
            if (qG.m < 200 && qG instanceof qe_0) {
                awu_1.a(this.w, ud_0.a((qe_0)qG), 1);
                qG.k = awu_1.a(this.w, aDY.a(qG.m));
            }
            if (qG.m == 200) {
                awu_1.c(this.t.gameSettings);
                MCInvoker.displayGuiScreen(this.t, this.y);
            }
        }
    }

    public SW(GuiScreen guiScreen, GameSettings gameSettings) {
        this.y = guiScreen;
        this.w = gameSettings;
    }

    @Override
    public void a(int n, int n2, float f) {
        this.h();
        this.b(this.q, this.z, this.n / 2, 15, 0xFFFFFF);
        super.a(n, n2, f);
        IB.a(this.v, n, n2, this.l);
    }

    @Override
    public void l() {
        aP2.b();
        this.z = I18n.format(YS.a, new Object[0]);
        ListInvoker.clear(this.l);
        int n = 0;
        if (n < x.length) {
            aj2 aj22 = x[n];
            int n2 = this.n / 2 - 155 + n % 2 * 160;
            int n3 = this.f / 6 + 21 * (n / 2) - 12;
            if (!aDY.b(aj22)) {
                ListInvoker.add(this.l, new qz_0(aDY.e(aj22), n2, n3, aj22, awu_1.a(this.w, aj22)));
            }
            ListInvoker.add(this.l, new qd_0(aDY.e(aj22), n2, n3, aj22));
            ++n;
        }
        ListInvoker.add(this.l, new QG(200, this.n / 2 - 100, this.f / 6 + 168 + 11, I18n.format(YS.b, new Object[0])));
    }
}

