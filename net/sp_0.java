/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.ScaledResolutionInvoker;
import deobf.GameSettings;
import deobf.GuiScreen;
import deobf.MCInvoker;
import net.I18n;
import net.IN;
import net.QG;
import net.ScaledResolution;
import net.aDY;
import net.aP2;
import net.aj2;
import net.awu_1;
import net.awy_1;
import net.qd_0;
import net.qe_0;
import net.qz_0;
import net.ud_0;

/*
 * Renamed from net.Sp
 */
public class sp_0
extends GuiScreen {
    private GameSettings y;
    private GuiScreen x;
    protected String v;
    private static aj2[] w = new aj2[]{aj2.ANIMATED_WATER, aj2.ANIMATED_LAVA, aj2.ANIMATED_FIRE, aj2.ANIMATED_PORTAL, aj2.ANIMATED_REDSTONE, aj2.ANIMATED_EXPLOSION, aj2.ANIMATED_FLAME, aj2.ANIMATED_SMOKE, aj2.VOID_PARTICLES, aj2.WATER_PARTICLES, aj2.RAIN_SPLASH, aj2.PORTAL_PARTICLES, aj2.POTION_PARTICLES, aj2.DRIPPING_WATER_LAVA, aj2.ANIMATED_TERRAIN, aj2.ANIMATED_TEXTURES, aj2.FIREWORK_PARTICLES, aj2.PARTICLES};

    public sp_0(GuiScreen guiScreen, GameSettings gameSettings) {
        this.x = guiScreen;
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
                MCInvoker.displayGuiScreen(this.t, this.x);
            }
            if (qG.m == 210) {
                awu_1.a(this.t.gameSettings, true);
            }
            if (qG.m == 211) {
                awu_1.a(this.t.gameSettings, false);
            }
            ScaledResolution scaledResolution = new ScaledResolution(this.t);
            this.a(this.t, ScaledResolutionInvoker.getScaledWidth(scaledResolution), ScaledResolutionInvoker.i(scaledResolution));
        }
    }

    @Override
    public void a(int n, int n2, float f) {
        this.h();
        this.b(this.q, this.v, this.n / 2, 15, 0xFFFFFF);
        super.a(n, n2, f);
    }

    @Override
    public void l() {
        this.v = I18n.format(awy_1.c, new Object[0]);
        aP2.b();
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
        ListInvoker.add(this.l, new QG(210, this.n / 2 - 155, this.f / 6 + 168 + 11, 70, 20, IN.a(awy_1.b)));
        ListInvoker.add(this.l, new QG(211, this.n / 2 - 155 + 80, this.f / 6 + 168 + 11, 70, 20, IN.a(awy_1.a)));
        ListInvoker.add(this.l, new qe_0(200, this.n / 2 + 5, this.f / 6 + 168 + 11, I18n.format(awy_1.d, new Object[0])));
    }
}

