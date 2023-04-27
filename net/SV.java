/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import deobf.GameSettings;
import deobf.GuiScreen;
import deobf.GuiYesNoCallback;
import deobf.MCInvoker;
import net.GuiYesNo;
import net.I18n;
import net.IB;
import net.QG;
import net.aDY;
import net.aP2;
import net.aW3;
import net.aj2;
import net.awu_1;
import net.qd_0;
import net.qe_0;
import net.qz_0;
import net.ud_0;
import net.zs_1;

public class SV
extends GuiScreen
implements GuiYesNoCallback {
    private static aj2[] v = new aj2[]{aj2.LAGOMETER, aj2.PROFILER, aj2.WEATHER, aj2.TIME, aj2.USE_FULLSCREEN, aj2.FULLSCREEN_MODE, aj2.SHOW_FPS, aj2.AUTOSAVE_TICKS, aj2.ANAGLYPH};
    protected String y;
    private GuiScreen x;
    private GameSettings z;
    private aW3 w = new aW3(this);

    @Override
    public void a(int n, int n2, float f) {
        this.h();
        this.b(this.q, this.y, this.n / 2, 15, 0xFFFFFF);
        super.a(n, n2, f);
        IB.a(this.w, n, n2, this.l);
    }

    public SV(GuiScreen guiScreen, GameSettings gameSettings) {
        this.x = guiScreen;
        this.z = gameSettings;
    }

    @Override
    public void l() {
        aP2.b();
        this.y = I18n.format(zs_1.a, new Object[0]);
        ListInvoker.clear(this.l);
        int n = 0;
        if (n < v.length) {
            aj2 aj22 = v[n];
            int n2 = this.n / 2 - 155 + n % 2 * 160;
            int n3 = this.f / 6 + 21 * (n / 2) - 12;
            if (!aDY.b(aj22)) {
                ListInvoker.add(this.l, new qz_0(aDY.e(aj22), n2, n3, aj22, awu_1.a(this.z, aj22)));
            }
            ListInvoker.add(this.l, new qd_0(aDY.e(aj22), n2, n3, aj22));
            ++n;
        }
        ListInvoker.add(this.l, new QG(210, this.n / 2 - 100, this.f / 6 + 168 + 11 - 44, I18n.format(zs_1.c, new Object[0])));
        ListInvoker.add(this.l, new QG(200, this.n / 2 - 100, this.f / 6 + 168 + 11, I18n.format(zs_1.e, new Object[0])));
    }

    @Override
    public void a(boolean bl, int n) {
        aP2.b();
        awu_1.a(this.t.gameSettings);
        MCInvoker.displayGuiScreen(this.t, this);
    }

    @Override
    protected void a(QG qG) {
        aP2.b();
        if (qG.g) {
            if (qG.m < 200 && qG instanceof qe_0) {
                awu_1.a(this.z, ud_0.a((qe_0)qG), 1);
                qG.k = awu_1.a(this.z, aDY.a(qG.m));
            }
            if (qG.m == 200) {
                awu_1.c(this.t.gameSettings);
                MCInvoker.displayGuiScreen(this.t, this.x);
            }
            if (qG.m == 210) {
                awu_1.c(this.t.gameSettings);
                GuiYesNo guiYesNo = new GuiYesNo(this, I18n.format(zs_1.b, new Object[0]), zs_1.d, 9999);
                MCInvoker.displayGuiScreen(this.t, guiYesNo);
            }
        }
    }
}

