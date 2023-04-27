/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.ScaledResolutionInvoker;
import deobf.GameSettings;
import deobf.GuiScreen;
import deobf.LanguageManager;
import deobf.MCInvoker;
import java.io.IOException;
import net.I18n;
import net.QG;
import net.ScaledResolution;
import net.aL0;
import net.ait_0;
import net.aj2;
import net.awh_1;
import net.awu_1;
import net.qe_0;
import net.ud_0;

public class RL
extends GuiScreen {
    private GameSettings v;
    private qe_0 x;
    private ait_0 y;
    private LanguageManager z;
    protected GuiScreen w;
    private qe_0 A;

    static GameSettings b(RL rL) {
        return rL.v;
    }

    static qe_0 c(RL rL) {
        return rL.A;
    }

    @Override
    public void a(int n, int n2, float f) {
        this.y.a(n, n2, f);
        this.b(this.q, I18n.format(awh_1.b, new Object[0]), this.n / 2, 16, 0xFFFFFF);
        this.b(this.q, aL0.a(aL0.a(aL0.a(new StringBuilder(), awh_1.e), I18n.format(awh_1.a, new Object[0])), awh_1.d).toString(), this.n / 2, this.f - 56, 0x808080);
        super.a(n, n2, f);
    }

    @Override
    public void c() throws IOException {
        super.c();
        this.y.g();
    }

    @Override
    public void l() {
        this.A = new qe_0(100, this.n / 2 - 155, this.f - 38, aj2.FORCE_UNICODE_FONT, awu_1.a(this.v, aj2.FORCE_UNICODE_FONT));
        ListInvoker.add(this.l, this.A);
        this.x = new qe_0(6, this.n / 2 - 155 + 160, this.f - 38, I18n.format(awh_1.c, new Object[0]));
        ListInvoker.add(this.l, this.x);
        this.y = new ait_0(this, this.t);
        this.y.c(7, 8);
    }

    static qe_0 a(RL rL) {
        return rL.x;
    }

    public RL(GuiScreen guiScreen, GameSettings gameSettings, LanguageManager languageManager) {
        this.w = guiScreen;
        this.v = gameSettings;
        this.z = languageManager;
    }

    static LanguageManager d(RL rL) {
        return rL.z;
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    @Override
    protected void a(QG qG) throws IOException {
        if (qG.g) {
            switch (qG.m) {
                case 5: {
                    break;
                }
                case 6: {
                    MCInvoker.displayGuiScreen(this.t, this.w);
                    break;
                }
                case 100: {
                    if (!(qG instanceof qe_0)) break;
                    awu_1.a(this.v, ud_0.a((qe_0)qG), 1);
                    qG.k = awu_1.a(this.v, aj2.FORCE_UNICODE_FONT);
                    ScaledResolution scaledResolution = new ScaledResolution(this.t);
                    int n = ScaledResolutionInvoker.getScaledWidth(scaledResolution);
                    int n2 = ScaledResolutionInvoker.i(scaledResolution);
                    this.a(this.t, n, n2);
                    break;
                }
                default: {
                    this.y.a(qG);
                }
            }
        }
    }
}

