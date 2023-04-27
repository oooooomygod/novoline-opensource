/*
 * Decompiled with CFR 0.152.
 */
package deobf;

import cc.novoline.invoke.GameSettingsInvoker;
import cc.novoline.invoke.ListInvoker;
import deobf.GameSettings;
import deobf.GuiScreen;
import deobf.MCInvoker;
import java.io.IOException;
import net.I18n;
import net.NG;
import net.QG;
import net.a8l_0;
import net.aDY;
import net.aII;
import net.aj2;
import net.awu_1;
import net.qe_0;
import net.qt_0;
import net.u8_0;
import net.ud_0;

public class GuiControls
extends GuiScreen {
    private GameSettings A;
    private GuiScreen w;
    private a8l_0 z;
    public long v;
    protected String y = NG.d;
    private QG C;
    private static aj2[] B = new aj2[]{aj2.INVERT_MOUSE, aj2.SENSITIVITY, aj2.TOUCHSCREEN};
    public aII x = null;

    @Override
    public void a(int n, int n2, float f) {
        this.h();
        this.z.a(n, n2, f);
        this.b(this.q, this.y, this.n / 2, 8, 0xFFFFFF);
        for (aII aII2 : this.A.aP) {
            if (GameSettingsInvoker.getKeyCode(aII2) != GameSettingsInvoker.a(aII2)) break;
        }
        this.C.g = true;
        super.a(n, n2, f);
    }

    public GuiControls(GuiScreen guiScreen, GameSettings gameSettings) {
        this.w = guiScreen;
        this.A = gameSettings;
    }

    @Override
    public void c() throws IOException {
        super.c();
        this.z.g();
    }

    @Override
    protected void a(char c, int n) throws IOException {
        if (this.x != null) {
            if (n == 1) {
                awu_1.a(this.A, this.x, 0);
            } else {
                awu_1.a(this.A, this.x, n);
            }
            this.x = null;
            this.v = MCInvoker.a();
            GameSettingsInvoker.a();
        } else {
            super.a(c, n);
        }
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    @Override
    public void l() {
        this.z = new a8l_0(this, this.t);
        ListInvoker.add(this.l, new QG(200, this.n / 2 - 155, this.f - 29, 150, 20, I18n.format(NG.c, new Object[0])));
        this.C = new QG(201, this.n / 2 - 155 + 160, this.f - 29, 150, 20, I18n.format(NG.a, new Object[0]));
        ListInvoker.add(this.l, this.C);
        this.y = I18n.format(NG.b, new Object[0]);
        int n = 0;
        for (aj2 aj22 : B) {
            if (aDY.b(aj22)) {
                ListInvoker.add(this.l, new qt_0(aDY.e(aj22), this.n / 2 - 155 + n % 2 * 160, 18 + 24 * (n >> 1), aj22));
            } else {
                ListInvoker.add(this.l, new qe_0(aDY.e(aj22), this.n / 2 - 155 + n % 2 * 160, 18 + 24 * (n >> 1), aj22, awu_1.a(this.A, aj22)));
            }
            ++n;
        }
    }

    @Override
    protected void a(QG qG) throws IOException {
        if (qG.m == 200) {
            MCInvoker.displayGuiScreen(this.t, this.w);
        } else if (qG.m == 201) {
            for (aII aII2 : this.t.gameSettings.aP) {
                GameSettingsInvoker.a(aII2, GameSettingsInvoker.a(aII2));
            }
            GameSettingsInvoker.a();
        } else if (qG.m < 100 && qG instanceof qe_0) {
            awu_1.a(this.A, ud_0.a((qe_0)qG), 1);
            qG.k = awu_1.a(this.A, aDY.a(qG.m));
        }
    }

    @Override
    protected void b(int n, int n2, int n3) throws IOException {
        if (this.x != null) {
            awu_1.a(this.A, this.x, -100 + n3);
            this.x = null;
            GameSettingsInvoker.a();
        } else if (!u8_0.a(this.z, n, n2, n3)) {
            super.b(n, n2, n3);
        }
    }

    @Override
    protected void a(int n, int n2, int n3) {
        if (!u8_0.b(this.z, n, n2, n3)) {
            super.a(n, n2, n3);
        }
    }
}

