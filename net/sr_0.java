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
import net.Y6;
import net.aDY;
import net.aP2;
import net.aW3;
import net.aj2;
import net.awu_1;
import net.qd_0;
import net.qe_0;
import net.qz_0;
import net.ud_0;

/*
 * Renamed from net.Sr
 */
public class sr_0
extends GuiScreen {
    private GameSettings y;
    protected String x;
    private GuiScreen v;
    private static aj2[] w = new aj2[]{aj2.SMOOTH_FPS, aj2.SMOOTH_WORLD, aj2.FAST_MATH, aj2.CHUNK_UPDATES, aj2.CHUNK_UPDATES_DYNAMIC, aj2.LAZY_CHUNK_LOADING};
    private aW3 z = new aW3(this);

    @Override
    public void l() {
        aP2.b();
        this.x = I18n.format(Y6.a, new Object[0]);
        ListInvoker.clear(this.l);
        int n = 0;
        if (n < w.length) {
            aj2 aj22 = w[n];
            int n2 = this.n / 2 - 155 + n % 2 * 160;
            int n3 = this.f / 6 + 21 * (n / 2) - 12;
            if (!aDY.b(aj22)) {
                ListInvoker.add(this.l, new qz_0(aDY.e(aj22), n2, n3, aj22, awu_1.a(this.y, aj22)));
            }
            ListInvoker.add(this.l, new qd_0(aDY.e(aj22), n2, n3, aj22));
            ++n;
        }
        ListInvoker.add(this.l, new QG(200, this.n / 2 - 100, this.f / 6 + 168 + 11, I18n.format(Y6.b, new Object[0])));
    }

    @Override
    public void a(int n, int n2, float f) {
        this.h();
        this.b(this.q, this.x, this.n / 2, 15, 0xFFFFFF);
        super.a(n, n2, f);
        IB.a(this.z, n, n2, this.l);
    }

    public sr_0(GuiScreen guiScreen, GameSettings gameSettings) {
        this.v = guiScreen;
        this.y = gameSettings;
    }

    @Override
    protected void a(QG qG) {
        aP2.b();
        if (qG.g) {
            if (qG.m < 200 && qG instanceof qe_0) {
                awu_1.a(this.y, ud_0.a((qe_0)qG), 1);
                qG.k = awu_1.a(this.y, aDY.a(qG.m));
            }
            if (qG.m == 200) {
                awu_1.c(this.t.gameSettings);
                MCInvoker.displayGuiScreen(this.t, this.v);
            }
        }
    }
}

