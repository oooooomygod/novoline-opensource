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
import net.N6;
import net.Q8;
import net.QG;
import net.aL0;
import net.awu_1;
import net.eb_0;
import net.wt_0;

public class RE
extends GuiScreen {
    private GameSettings x;
    private String y;
    private GuiScreen v;
    protected String w = eb_0.a;

    public RE(GuiScreen guiScreen, GameSettings gameSettings) {
        this.v = guiScreen;
        this.x = gameSettings;
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    @Override
    public void a(int n, int n2, float f) {
        this.h();
        this.b(this.q, this.w, this.n / 2, 15, 0xFFFFFF);
        super.a(n, n2, f);
    }

    static GameSettings a(RE rE) {
        return rE.x;
    }

    protected String a(N6 n6) {
        float f = awu_1.a(this.x, n6);
        return f == 0.0f ? this.y : aL0.a(aL0.c(new StringBuilder(), (int)(f * 100.0f)), eb_0.d).toString();
    }

    @Override
    protected void a(QG qG) throws IOException {
        if (qG.g && qG.m == 200) {
            awu_1.c(this.t.gameSettings);
            MCInvoker.displayGuiScreen(this.t, this.v);
        }
    }

    @Override
    public void l() {
        int n = 0;
        this.w = I18n.format(eb_0.c, new Object[0]);
        this.y = I18n.format(eb_0.e, new Object[0]);
        ListInvoker.add(this.l, new Q8(this, wt_0.a(N6.MASTER), this.n / 2 - 155 + n % 2 * 160, this.f / 6 - 12 + 24 * (n >> 1), N6.MASTER, true));
        n += 2;
        for (N6 n6 : N6.values()) {
            if (n6 == N6.MASTER) continue;
            ListInvoker.add(this.l, new Q8(this, wt_0.a(n6), this.n / 2 - 155 + n % 2 * 160, this.f / 6 - 12 + 24 * (n >> 1), n6, false));
            ++n;
        }
        ListInvoker.add(this.l, new QG(200, this.n / 2 - 100, this.f / 6 + 168, I18n.format(eb_0.b, new Object[0])));
    }
}

