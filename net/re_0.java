/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.FontRendererInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.ScaledResolutionInvoker;
import deobf.GameSettings;
import deobf.GuiScreen;
import deobf.MCInvoker;
import java.io.IOException;
import net.A1;
import net.AltRepositoryGUI;
import net.I18n;
import net.IB;
import net.IN;
import net.QG;
import net.S7;
import net.SV;
import net.SW;
import net.ScaledResolution;
import net.aDY;
import net.aW3;
import net.aj2;
import net.awu_1;
import net.qd_0;
import net.qe_0;
import net.qz_0;
import net.sp_0;
import net.sr_0;
import net.su_0;
import net.ud_0;
import net.ys_2;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.Re
 */
public class re_0
extends GuiScreen {
    private static aj2[] x;
    protected String y = A1.m;
    private GameSettings A;
    private aW3 w = new aW3(this);
    private GuiScreen v;
    private static String z;

    @Override
    protected void a(QG qG) throws IOException {
        if (qG.g) {
            Object object;
            int n = this.A.z;
            if (qG.m < 200 && qG instanceof qe_0) {
                awu_1.a(this.A, ud_0.a((qe_0)qG), 1);
                qG.k = awu_1.a(this.A, aDY.a(qG.m));
            }
            if (qG.m == 200) {
                awu_1.c(this.t.gameSettings);
                MCInvoker.displayGuiScreen(this.t, this.v);
            }
            if (this.A.z != n && !(this.t.currentScreen instanceof AltRepositoryGUI)) {
                object = new ScaledResolution(this.t);
                int n2 = ScaledResolutionInvoker.getScaledWidth((ScaledResolution)object);
                int n3 = ScaledResolutionInvoker.i((ScaledResolution)object);
                this.a(this.t, n2, n3);
            }
            if (qG.m == 201) {
                awu_1.c(this.t.gameSettings);
                object = new SW(this, this.A);
                MCInvoker.displayGuiScreen(this.t, (GuiScreen)object);
            }
            if (qG.m == 202) {
                awu_1.c(this.t.gameSettings);
                object = new su_0(this, this.A);
                MCInvoker.displayGuiScreen(this.t, (GuiScreen)object);
            }
            if (qG.m == 211) {
                awu_1.c(this.t.gameSettings);
                object = new sp_0(this, this.A);
                MCInvoker.displayGuiScreen(this.t, (GuiScreen)object);
            }
            if (qG.m == 212) {
                awu_1.c(this.t.gameSettings);
                object = new sr_0(this, this.A);
                MCInvoker.displayGuiScreen(this.t, (GuiScreen)object);
            }
            if (qG.m == 222) {
                awu_1.c(this.t.gameSettings);
                object = new SV(this, this.A);
                MCInvoker.displayGuiScreen(this.t, (GuiScreen)object);
            }
            if (qG.m == 231) {
                if (ys_2.L() || ys_2.w()) {
                    ys_2.b(IN.a(A1.p), IN.a(A1.a));
                    return;
                }
                if (ys_2.r()) {
                    ys_2.b(IN.a(A1.l), IN.a(A1.o));
                    return;
                }
                awu_1.c(this.t.gameSettings);
                object = new S7(this, this.A);
                MCInvoker.displayGuiScreen(this.t, (GuiScreen)object);
            }
        }
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    public re_0(GuiScreen guiScreen, GameSettings gameSettings) {
        this.v = guiScreen;
        this.A = gameSettings;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -1;
        char[] cArray = "<9ygv\u0012\u001eOB\u0017o".toCharArray();
        int n2 = 0;
        int n3 = 75;
        char[] cArray2 = cArray;
        int n4 = cArray.length;
        while (true) {
            n4 = n4;
            cArray2 = cArray2;
            int n5 = ++n2;
            int cfr_ignored_0 = n2 % 7;
            cArray2[n5] = (char)(cArray2[n5] ^ (n3 ^ 0x34));
            n3 = n3;
        }
    }

    public static int b(QG qG) {
        return qG.o;
    }

    public static void a(GuiScreen guiScreen, int n, int n2, int n3, int n4, int n5, int n6) {
        guiScreen.b(n, n2, n3, n4, n5, n6);
    }

    @Override
    public void l() {
        int n;
        this.y = I18n.format(A1.g, new Object[0]);
        ListInvoker.clear(this.l);
        for (n = 0; n < x.length; ++n) {
            aj2 aj22 = x[n];
            int n2 = this.n / 2 - 155 + n % 2 * 160;
            int n3 = this.f / 6 + 21 * (n / 2) - 12;
            if (aDY.b(aj22)) {
                ListInvoker.add(this.l, new qd_0(aDY.e(aj22), n2, n3, aj22));
                continue;
            }
            ListInvoker.add(this.l, new qz_0(aDY.e(aj22), n2, n3, aj22, awu_1.a(this.A, aj22)));
        }
        n = this.f / 6 + 21 * (x.length / 2) - 12;
        int n4 = 0;
        n4 = this.n / 2 - 155;
        ListInvoker.add(this.l, new qe_0(231, n4, n, IN.a(A1.q)));
        n4 = this.n / 2 - 155 + 160;
        ListInvoker.add(this.l, new qe_0(202, n4, n, IN.a(A1.c)));
        n4 = this.n / 2 - 155;
        ListInvoker.add(this.l, new qe_0(201, n4, n += 21, IN.a(A1.k)));
        n4 = this.n / 2 - 155 + 160;
        ListInvoker.add(this.l, new qe_0(212, n4, n, IN.a(A1.j)));
        n4 = this.n / 2 - 155;
        ListInvoker.add(this.l, new qe_0(211, n4, n += 21, IN.a(A1.h)));
        n4 = this.n / 2 - 155 + 160;
        ListInvoker.add(this.l, new qe_0(222, n4, n, IN.a(A1.f)));
        n += 21;
        ListInvoker.add(this.l, new QG(200, this.n / 2 - 100, this.f / 6 + 168 + 11, I18n.format(A1.n, new Object[0])));
    }

    public static int a(QG qG) {
        return qG.i;
    }

    @Override
    public void a(int n, int n2, float f) {
        this.h();
        this.b(this.q, this.y, this.n / 2, 15, 0xFFFFFF);
        String string = ys_2.M();
        String string2 = A1.r;
        if (string2.equals(A1.s)) {
            string = A1.b;
        }
        if (string2.equals(A1.t)) {
            string = A1.d;
        }
        if (string2.equals(A1.u)) {
            string = A1.e;
        }
        this.a(this.q, string, 2, this.f - 10, 0x808080);
        String string3 = A1.i;
        int n3 = FontRendererInvoker.a(this.q, string3);
        this.a(this.q, string3, this.n - n3 - 2, this.f - 10, 0x808080);
        super.a(n, n2, f);
        IB.a(this.w, n, n2, this.l);
    }
}

