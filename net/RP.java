/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.Logger
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.LogManagerInvoker;
import cc.novoline.invoke.LoggerInvoker;
import cc.novoline.invoke.SaveHandlerInvoker;
import cc.novoline.invoke.SaveLoaderInvoker;
import net.minecraft.world.GameType;
import deobf.GuiScreen;
import deobf.GuiYesNoCallback;
import deobf.ISaveHandler;
import deobf.MCInvoker;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

import org.apache.logging.log4j.Logger;

public class RP
extends GuiScreen
implements GuiYesNoCallback {
    protected GuiScreen w;
    private QG I;
    private int v;
    protected String J;
    private List<dr_1> x;
    private DateFormat z = new SimpleDateFormat();
    private String G;
    private QG A;
    private QG y;
    private a8r_0 C;
    private boolean E;
    private String H;
    private String[] K;
    private static Logger D = LogManagerInvoker.c();
    private QG F;
    private boolean B;

    @Override
    protected void a(QG qG) throws IOException {
        if (qG.g) {
            if (qG.m == 2) {
                String string = this.a(this.v);
                this.E = true;
                GuiYesNo guiYesNo = RP.a(this, string, this.v);
                MCInvoker.displayGuiScreen(this.t, guiYesNo);
            } else if (qG.m == 1) {
                this.c(this.v);
            } else if (qG.m == 3) {
                MCInvoker.displayGuiScreen(this.t, new R7(this));
            } else if (qG.m == 6) {
                MCInvoker.displayGuiScreen(this.t, new ra_0(this, this.b(this.v)));
            } else if (qG.m == 0) {
                MCInvoker.displayGuiScreen(this.t, this.w);
            } else if (qG.m == 7) {
                R7 r7 = new R7(this);
                ISaveHandler iSaveHandler = SaveLoaderInvoker.getSaveLoader(MCInvoker.P(this.t), this.b(this.v), false);
                WorldInfo worldInfo = SaveHandlerInvoker.b(iSaveHandler);
                SaveHandlerInvoker.e(iSaveHandler);
                ami_1.a(r7, worldInfo);
                MCInvoker.displayGuiScreen(this.t, r7);
            } else {
                this.C.a(qG);
            }
        }
    }

    static int a(RP rP, int n) {
        rP.v = n;
        return rP.v;
    }

    static String j(RP rP) {
        return rP.H;
    }

    @Override
    public void c() throws IOException {
        super.c();
        this.C.g();
    }

    static QG d(RP rP) {
        return rP.y;
    }

    public void a() {
        this.I = new QG(1, this.n / 2 - 154, this.f - 52, 150, 20, I18n.format(akm_2.i, new Object[0]));
        ListInvoker.add(this.l, this.I);
        ListInvoker.add(this.l, new QG(3, this.n / 2 + 4, this.f - 52, 150, 20, I18n.format(akm_2.l, new Object[0])));
        this.y = new QG(6, this.n / 2 - 154, this.f - 28, 72, 20, I18n.format(akm_2.j, new Object[0]));
        ListInvoker.add(this.l, this.y);
        this.A = new QG(2, this.n / 2 - 76, this.f - 28, 72, 20, I18n.format(akm_2.a, new Object[0]));
        ListInvoker.add(this.l, this.A);
        this.F = new QG(7, this.n / 2 + 4, this.f - 28, 72, 20, I18n.format(akm_2.m, new Object[0]));
        ListInvoker.add(this.l, this.F);
        ListInvoker.add(this.l, new QG(0, this.n / 2 + 82, this.f - 28, 72, 20, I18n.format(akm_2.p, new Object[0])));
        this.I.g = false;
        this.A.g = false;
        this.y.g = false;
        this.F.g = false;
    }

    static QG c(RP rP) {
        return rP.I;
    }

    private void b() throws awe_2 {
        ISaveFormat iSaveFormat = MCInvoker.P(this.t);
        this.x = SaveLoaderInvoker.b(iSaveFormat);
        asg_0.d(this.x);
        this.v = -1;
    }

    static List i(RP rP) {
        return rP.x;
    }

    static QG a(RP rP) {
        return rP.A;
    }

    public void c(int n) {
        MCInvoker.displayGuiScreen(this.t, null);
        if (!this.B) {
            this.B = true;
            String string = this.b(n);
            string = aL0.c(aL0.a(new StringBuilder(), akm_2.n), n).toString();
            String string2 = this.a(n);
            string2 = aL0.c(aL0.a(new StringBuilder(), akm_2.z), n).toString();
            if (SaveLoaderInvoker.e(MCInvoker.P(this.t), string)) {
                MCInvoker.a(this.t, string, string2, null);
            }
        }
    }

    @Override
    public void a(int n, int n2, float f) {
        this.C.a(n, n2, f);
        this.b(this.q, this.J, this.n / 2, 20, 0xFFFFFF);
        super.a(n, n2, f);
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    protected String b(int n) {
        return apn_0.d((dr_1)ListInvoker.get(this.x, n));
    }

    @Override
    public void a(boolean bl, int n) {
        if (this.E) {
            this.E = false;
            ISaveFormat iSaveFormat = MCInvoker.P(this.t);
            SaveLoaderInvoker.a(iSaveFormat);
            SaveLoaderInvoker.d(iSaveFormat, this.b(n));
            try {
                this.b();
            }
            catch (awe_2 awe_22) {
                LoggerInvoker.a(D, akm_2.e, awe_22);
            }
            MCInvoker.displayGuiScreen(this.t, this);
        }
    }

    @Override
    public void l() {
        this.J = I18n.format(akm_2.h, new Object[0]);
        try {
            this.b();
        }
        catch (awe_2 awe_22) {
            LoggerInvoker.a(D, akm_2.g, awe_22);
            MCInvoker.displayGuiScreen(this.t, new rn_0(akm_2.q, awe_22.getMessage()));
            return;
        }
        this.G = I18n.format(akm_2.b, new Object[0]);
        this.H = I18n.format(akm_2.c, new Object[0]);
        this.K[ar3_0.a((GameType)GameType.SURVIVAL)] = I18n.format(akm_2.v, new Object[0]);
        this.K[ar3_0.a((GameType)GameType.CREATIVE)] = I18n.format(akm_2.w, new Object[0]);
        this.K[ar3_0.a((GameType)GameType.ADVENTURE)] = I18n.format(akm_2.f, new Object[0]);
        this.K[ar3_0.a((GameType)GameType.SPECTATOR)] = I18n.format(akm_2.A, new Object[0]);
        this.C = new a8r_0(this, this.t);
        this.C.c(4, 5);
        this.a();
    }

    static QG b(RP rP) {
        return rP.F;
    }

    static DateFormat h(RP rP) {
        return rP.z;
    }

    static String[] f(RP rP) {
        return rP.K;
    }

    static int e(RP rP) {
        return rP.v;
    }

    public RP(GuiScreen guiScreen) {
        this.J = akm_2.t;
        this.K = new String[4];
        this.w = guiScreen;
    }

    protected String a(int n) {
        String string = apn_0.c((dr_1)ListInvoker.get(this.x, n));
        if (aw__0.b((CharSequence)string)) {
            string = aL0.c(aL0.a(aL0.a(new StringBuilder(), I18n.format(akm_2.u, new Object[0])), akm_2.r), n + 1).toString();
        }
        return string;
    }

    public static GuiYesNo a(GuiYesNoCallback guiYesNoCallback, String string, int n) {
        String string2 = I18n.format(akm_2.d, new Object[0]);
        String string3 = aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), akm_2.y), string), akm_2.o), I18n.format(akm_2.s, new Object[0])).toString();
        String string4 = I18n.format(akm_2.k, new Object[0]);
        String string5 = I18n.format(akm_2.x, new Object[0]);
        return new GuiYesNo(guiYesNoCallback, string2, string3, string4, string5, n);
    }

    static String g(RP rP) {
        return rP.G;
    }
}

