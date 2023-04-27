/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.FontRendererInvoker;
import cc.novoline.invoke.IStreamInvoker;
import cc.novoline.invoke.ListInvoker;
import deobf.GameSettings;
import deobf.GuiScreen;
import deobf.MCInvoker;
import java.io.IOException;
import net.I18n;
import net.QG;
import net.RJ;
import net.aDY;
import net.aL0;
import net.aj2;
import net.anw_0;
import net.auf_1;
import net.awu_1;
import net.qe_0;
import net.qt_0;
import net.ud_0;

/*
 * Renamed from net.Sl
 */
public class sl_0
extends GuiScreen {
    private static aj2[] w;
    private GameSettings y;
    private String x;
    private GuiScreen C;
    private String z;
    private boolean B = false;
    private int A;
    private static aj2[] v;

    @Override
    public void l() {
        int n = 0;
        this.z = I18n.format(auf_1.e, new Object[0]);
        this.x = I18n.format(auf_1.a, new Object[0]);
        for (aj2 aj22 : v) {
            if (aDY.b(aj22)) {
                ListInvoker.add(this.l, new qt_0(aDY.e(aj22), this.n / 2 - 155 + n % 2 * 160, this.f / 6 + 24 * (n >> 1), aj22));
            } else {
                ListInvoker.add(this.l, new qe_0(aDY.e(aj22), this.n / 2 - 155 + n % 2 * 160, this.f / 6 + 24 * (n >> 1), aj22, awu_1.a(this.y, aj22)));
            }
            ++n;
        }
        int cfr_ignored_0 = n % 2;
        this.A = this.f / 6 + 24 * (n >> 1) + 6;
        n += 2;
        for (aj2 aj22 : w) {
            if (aDY.b(aj22)) {
                ListInvoker.add(this.l, new qt_0(aDY.e(aj22), this.n / 2 - 155 + n % 2 * 160, this.f / 6 + 24 * (n >> 1), aj22));
            } else {
                ListInvoker.add(this.l, new qe_0(aDY.e(aj22), this.n / 2 - 155 + n % 2 * 160, this.f / 6 + 24 * (n >> 1), aj22, awu_1.a(this.y, aj22)));
            }
            ++n;
        }
        ListInvoker.add(this.l, new QG(200, this.n / 2 - 155, this.f / 6 + 168, 150, 20, I18n.format(auf_1.c, new Object[0])));
        QG qG = new QG(201, this.n / 2 + 5, this.f / 6 + 168, 150, 20, I18n.format(auf_1.d, new Object[0]));
        qG.g = IStreamInvoker.v(MCInvoker.a(this.t)) && IStreamInvoker.c(MCInvoker.a(this.t)).length > 0 || IStreamInvoker.m(MCInvoker.a(this.t));
        ListInvoker.add(this.l, qG);
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    public sl_0(GuiScreen guiScreen, GameSettings gameSettings) {
        this.C = guiScreen;
        this.y = gameSettings;
    }

    static {
        v = new aj2[]{aj2.STREAM_BYTES_PER_PIXEL, aj2.STREAM_FPS, aj2.STREAM_KBPS, aj2.STREAM_SEND_METADATA, aj2.STREAM_VOLUME_MIC, aj2.STREAM_VOLUME_SYSTEM, aj2.STREAM_MIC_TOGGLE_BEHAVIOR, aj2.STREAM_COMPRESSION};
        w = new aj2[]{aj2.STREAM_CHAT_ENABLED, aj2.STREAM_CHAT_USER_FILTER};
    }

    @Override
    protected void a(QG qG) throws IOException {
        if (qG.g) {
            if (qG.m < 100 && qG instanceof qe_0) {
                aj2 aj22 = ud_0.a((qe_0)qG);
                awu_1.a(this.y, aj22, 1);
                qG.k = awu_1.a(this.y, aDY.a(qG.m));
                if (IStreamInvoker.d(MCInvoker.a(this.t)) && aj22 != aj2.STREAM_CHAT_ENABLED && aj22 != aj2.STREAM_CHAT_USER_FILTER) {
                    this.B = true;
                }
            } else if (qG instanceof qt_0) {
                if (qG.m == aDY.e(aj2.STREAM_VOLUME_MIC)) {
                    IStreamInvoker.g(MCInvoker.a(this.t));
                } else if (qG.m == aDY.e(aj2.STREAM_VOLUME_SYSTEM)) {
                    IStreamInvoker.g(MCInvoker.a(this.t));
                } else if (IStreamInvoker.d(MCInvoker.a(this.t))) {
                    this.B = true;
                }
            }
            if (qG.m == 200) {
                awu_1.c(this.t.gameSettings);
                MCInvoker.displayGuiScreen(this.t, this.C);
            } else if (qG.m == 201) {
                awu_1.c(this.t.gameSettings);
                MCInvoker.displayGuiScreen(this.t, new RJ(this));
            }
        }
    }

    @Override
    public void a(int n, int n2, float f) {
        this.h();
        this.b(this.q, this.z, this.n / 2, 20, 0xFFFFFF);
        this.b(this.q, this.x, this.n / 2, this.A, 0xFFFFFF);
        if (this.B) {
            this.b(this.q, aL0.a(aL0.a(new StringBuilder(), (Object)anw_0.RED), I18n.format(auf_1.b, new Object[0])).toString(), this.n / 2, 20 + FontRendererInvoker.d(this.q), 0xFFFFFF);
        }
        super.a(n, n2, f);
    }
}

