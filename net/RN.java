/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import deobf.GameSettings;
import deobf.GuiScreen;
import deobf.MCInvoker;
import java.io.IOException;
import net.I18n;
import net.QG;
import net.aDY;
import net.aUV;
import net.aj2;
import net.awu_1;
import net.qe_0;
import net.qt_0;
import net.ud_0;

public class RN
extends GuiScreen {
    private String v;
    private GameSettings x;
    private GuiScreen w;
    private static aj2[] y = new aj2[]{aj2.CHAT_VISIBILITY, aj2.CHAT_COLOR, aj2.CHAT_LINKS, aj2.CHAT_OPACITY, aj2.CHAT_LINKS_PROMPT, aj2.CHAT_SCALE, aj2.CHAT_HEIGHT_FOCUSED, aj2.CHAT_HEIGHT_UNFOCUSED, aj2.CHAT_WIDTH, aj2.REDUCED_DEBUG_INFO};

    public RN(GuiScreen guiScreen, GameSettings gameSettings) {
        this.w = guiScreen;
        this.x = gameSettings;
    }

    @Override
    protected void a(QG qG) throws IOException {
        if (qG.g) {
            if (qG.m < 100 && qG instanceof qe_0) {
                awu_1.a(this.x, ud_0.a((qe_0)qG), 1);
                qG.k = awu_1.a(this.x, aDY.a(qG.m));
            }
            if (qG.m == 200) {
                awu_1.c(this.t.gameSettings);
                MCInvoker.displayGuiScreen(this.t, this.w);
            }
        }
    }

    @Override
    public void l() {
        int n = 0;
        this.v = I18n.format(aUV.b, new Object[0]);
        for (aj2 aj22 : y) {
            if (aDY.b(aj22)) {
                ListInvoker.add(this.l, new qt_0(aDY.e(aj22), this.n / 2 - 155 + n % 2 * 160, this.f / 6 + 24 * (n >> 1), aj22));
            } else {
                ListInvoker.add(this.l, new qe_0(aDY.e(aj22), this.n / 2 - 155 + n % 2 * 160, this.f / 6 + 24 * (n >> 1), aj22, awu_1.a(this.x, aj22)));
            }
            ++n;
        }
        ListInvoker.add(this.l, new QG(200, this.n / 2 - 100, this.f / 6 + 120, I18n.format(aUV.a, new Object[0])));
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    @Override
    public void a(int n, int n2, float f) {
        this.h();
        this.b(this.q, this.v, this.n / 2, 20, 0xFFFFFF);
        super.a(n, n2, f);
    }
}

