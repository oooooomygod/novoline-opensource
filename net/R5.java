/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.Logger
 *  org.checkerframework.checker.nullness.qual.NonNull
 *  org.lwjgl.opengl.GL11
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.KeyboardInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.LogManagerInvoker;
import cc.novoline.invoke.LoggerInvoker;
import cc.novoline.invoke.NovolineInvoker;
import cc.novoline.invoke.ScaledResolutionInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.invoke.SystemInvoker;
import deobf.GuiConnecting;
import deobf.GuiScreen;
import deobf.GuiYesNoCallback;
import deobf.MCInvoker;
import java.awt.Color;
import java.io.Closeable;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.LinkOption;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;
import net.GL;
import net.GuiYesNo;
import net.I18n;
import net.MathHelper;
import net.QG;
import net.RF;
import net.RR;
import net.ScaledResolution;
import net.ServerData;
import net.V8;
import net.Wu;
import net.a1V;
import net.a3A;
import net.a4E;
import net.a8v_0;
import net.aHO;
import net.aKZ;
import net.aL0;
import net.aQV;
import net.aX1;
import net.aYU;
import net.aY_;
import net.acu_0;
import net.adp_0;
import net.aev_1;
import net.aga_2;
import net.ajP;
import net.akn_0;
import net.am3_0;
import net.amx_2;
import net.ane_2;
import net.ant_0;
import net.aol_1;
import net.apj_0;
import net.aqx_0;
import net.arm_1;
import net.asg_0;
import net.asm_2;
import net.ass_1;
import net.auk_2;
import net.avh_2;
import net.awc_2;
import net.ch_2;
import net.da_0;
import net.dt_0;
import net.dt_1;
import net.dz_0;
import net.l2;
import net.lk_1;
import net.my_0;
import org.apache.logging.log4j.Logger;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.lwjgl.opengl.GL11;

public class R5
extends GuiScreen
implements GuiYesNoCallback {
    private String E;
    private QG D;
    private ServerData w;
    private aX1 M;
    private dt_0 G;
    private boolean F;
    private int A = 0;
    private static Logger S = LogManagerInvoker.c();
    private boolean K;
    private boolean L;
    private boolean v;
    private QG N;
    private long H;
    private QG C;
    private GuiScreen y;
    private akn_0 T;
    private boolean I;
    private a8v_0 Q;
    private Wu O;
    private int B = 0;
    private double P = 0.0;
    private boolean J;
    private String z;
    private V8 R;
    private List<ant_0> x = new CopyOnWriteArrayList<ant_0>();

    public void a(String string) {
        this.z = string;
    }

    public void d() {
        avh_2 avh_22;
        avh_2 avh_23 = avh_22 = aqx_0.a(this.Q) < 0 ? null : aqx_0.c(this.Q, aqx_0.a(this.Q));
        if (avh_22 instanceof aYU) {
            this.a(am3_0.a((aYU)avh_22));
        } else if (avh_22 instanceof aga_2) {
            dt_1 dt_12 = ass_1.a((aga_2)avh_22);
            this.a(new ServerData(apj_0.b(dt_12), apj_0.c(dt_12), true));
        }
    }

    public aX1 k() {
        return this.M;
    }

    @Override
    public void l() {
        KeyboardInvoker.a(true);
        ListInvoker.clear(this.l);
        if (!this.L) {
            this.L = true;
            this.R = new V8(this.t);
            a3A.b(this.R);
            this.O = new Wu();
            try {
                this.G = new dt_0(this.O);
                this.G.start();
            }
            catch (Exception exception) {
                LoggerInvoker.warn(S, aL0.a(aL0.a(new StringBuilder(), ane_2.m), ch_2.b(exception)).toString());
            }
            this.Q = new a8v_0(this, this.t, this.n, this.f, 32, this.f - 64, 36);
            aqx_0.a(this.Q, this.R);
        } else {
            aqx_0.a(this.Q, this.n, this.f, 32, this.f - 64);
        }
        ListInvoker.clear(ServerData.g);
        this.b();
        ListInvoker.clear(this.x);
        for (ajP ajP2 : ajP.values()) {
            ListInvoker.add(this.x, new ant_0(awc_2.b(acu_0.a(ajP2))));
        }
        asg_0.e(this.x);
    }

    @Override
    public void a(boolean bl, int n) {
        avh_2 avh_22;
        avh_2 avh_23 = avh_22 = aqx_0.a(this.Q) < 0 ? null : aqx_0.c(this.Q, aqx_0.a(this.Q));
        if (this.J) {
            this.J = false;
            if (avh_22 instanceof aYU) {
                a3A.b(this.R, aqx_0.a(this.Q));
                a3A.a(this.R);
                aqx_0.b(this.Q, -1);
                aqx_0.a(this.Q, this.R);
            }
            MCInvoker.displayGuiScreen(this.t, this);
        } else if (this.F) {
            this.F = false;
            this.a(this.w);
        } else if (this.v) {
            this.v = false;
            a3A.a(this.R, this.w);
            a3A.a(this.R);
            aqx_0.b(this.Q, -1);
            aqx_0.a(this.Q, this.R);
            MCInvoker.displayGuiScreen(this.t, this);
        } else if (this.K) {
            this.K = false;
            if (avh_22 instanceof aYU) {
                ServerData serverData = am3_0.a((aYU)avh_22);
                serverData.h = this.w.h;
                serverData.k = this.w.k;
                aKZ.a(serverData, this.w);
                a3A.a(this.R);
                aqx_0.a(this.Q, this.R);
            }
            MCInvoker.displayGuiScreen(this.t, this);
        }
    }

    public void a(int n) {
        aqx_0.b(this.Q, n);
        Object var2_2 = null;
        this.D.g = false;
        this.N.g = false;
        this.C.g = false;
        if (!(var2_2 instanceof aHO)) {
            this.D.g = true;
            if (var2_2 instanceof aYU) {
                this.N.g = true;
                this.C.g = true;
            }
        }
    }

    @Override
    public void a(int n, int n2, float f) {
        this.z = null;
        this.h();
        if (this.I) {
            GlStateManagerInvoker.A();
            asm_2.a(this.T, this.n * 2, this.f * 2, n, n2, (float)(SystemInvoker.f() - this.H) / 1000.0f);
            GL11.glBegin((int)7);
            GL11.glVertex2f((float)-1.0f, (float)-1.0f);
            GL11.glVertex2f((float)-1.0f, (float)1.0f);
            GL11.glVertex2f((float)1.0f, (float)1.0f);
            GL11.glVertex2f((float)1.0f, (float)-1.0f);
            GL11.glEnd();
            aY_.b(0);
            GlStateManagerInvoker.A();
        }
        adp_0.b(false);
        ScaledResolution scaledResolution = new ScaledResolution(this.t);
        this.a(0, 30, 9999, ScaledResolutionInvoker.i(scaledResolution) - 60, -1);
        adp_0.a(true);
        aqx_0.a(this.Q, n, n2, f);
        adp_0.a();
        this.a(0, 0, 9999, 30, aol_1.b(new Color(0, 0, 0, 100)));
        this.a(0, ScaledResolutionInvoker.i(scaledResolution) - 60, 9999, ScaledResolutionInvoker.i(scaledResolution), aol_1.b(new Color(0, 0, 0, 100)));
        int n3 = 30;
        this.A = (int)((double)this.A + (double)(this.B - this.A) * 0.1);
        this.A = MathHelper.a(this.A, 0, 90 * ListInvoker.size(this.x) - ScaledResolutionInvoker.getScaledWidth(scaledResolution) + 60);
        adp_0.b(false);
        this.a(30, 0, ScaledResolutionInvoker.getScaledWidth(scaledResolution) - 30, 30, -1);
        adp_0.a(true);
        Iterator iterator = ListInvoker.iterator(this.x);
        while (dz_0.c(iterator)) {
            ant_0 ant_02 = (ant_0)dz_0.b(iterator);
            lk_1.a(ant_02, n3 - this.A, 5, n, n2);
            n3 += 90;
        }
        adp_0.a();
        if (n <= 30 && n2 <= 30) {
            this.a(12.0, 14.5, true, new Color(255, 255, 255, 255));
        } else {
            this.a(12.0, 14.5, true, new Color(200, 200, 200, 255));
        }
        if (n >= ScaledResolutionInvoker.getScaledWidth(scaledResolution) - 30 && n <= ScaledResolutionInvoker.getScaledWidth(scaledResolution) && n2 <= 30) {
            this.a((double)(ScaledResolutionInvoker.getScaledWidth(scaledResolution) - 12), 14.5, false, new Color(255, 255, 255, 255));
        } else {
            this.a((double)(ScaledResolutionInvoker.getScaledWidth(scaledResolution) - 12), 14.5, false, new Color(200, 200, 200, 255));
        }
        super.a(n, n2, f);
        if (this.z != null) {
            this.a(my_0.a(amx_2.b(amx_2.a(ane_2.j), this.z)), n, n2);
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    @Override
    protected void b(int n, int n2, int n3) throws IOException {
        ScaledResolution scaledResolution;
        if (n <= 30 && n2 <= 30) {
            this.B -= 100;
        }
        if (n >= ScaledResolutionInvoker.getScaledWidth(scaledResolution = new ScaledResolution(this.t)) - 30 && n <= ScaledResolutionInvoker.getScaledWidth(scaledResolution) && n2 <= 30) {
            this.B += 100;
        }
        this.B = MathHelper.a(this.B, 0, 90 * ListInvoker.size(this.x) - ScaledResolutionInvoker.getScaledWidth(scaledResolution) + 60);
        if (n >= 30 && n <= ScaledResolutionInvoker.getScaledWidth(scaledResolution) - 30) {
            Iterator iterator = ListInvoker.iterator(this.x);
            while (dz_0.c(iterator)) {
                ant_0 ant_02 = (ant_0)dz_0.b(iterator);
                lk_1.a(ant_02, n, n2);
            }
        }
        super.b(n, n2, n3);
        aqx_0.b(this.Q, n, n2, n3);
    }

    private void a(@NonNull ServerData serverData) {
        NovolineInvoker.a(MCInvoker.z(this.t), serverData);
        MCInvoker.displayGuiScreen(this.t, new GuiConnecting(this, this.t, serverData));
    }

    public V8 a() {
        return this.R;
    }

    public boolean a(aYU aYU2, int n) {
        return n < a3A.c(this.R) - 1;
    }

    public void a(double d, double d2, boolean bl, Color color) {
        a1V.d();
        GL11.glLineWidth((float)3.0f);
        a1V.a(color);
        GL11.glBegin((int)3);
        GL11.glVertex2d((double)(d + 5.0), (double)(d2 + 5.0));
        GL11.glVertex2d((double)d, (double)d2);
        GL11.glVertex2d((double)(d + 5.0), (double)(d2 - 5.0));
        GL11.glEnd();
        a1V.a();
    }

    public void b(aYU aYU2, int n, boolean bl) {
        int n2 = 0;
        a3A.a(this.R, n, n2);
        if (aqx_0.a(this.Q) == n) {
            this.a(n2);
        }
        aqx_0.a(this.Q, this.R);
    }

    @Override
    public void c() throws IOException {
        super.c();
        this.Q.g();
    }

    private void j() {
        MCInvoker.displayGuiScreen(this.t, new R5(this.y));
    }

    @Override
    protected void a(QG qG) throws IOException {
        if (qG.g) {
            avh_2 avh_22;
            avh_2 avh_23 = avh_22 = aqx_0.a(this.Q) < 0 ? null : aqx_0.c(this.Q, aqx_0.a(this.Q));
            if (qG.m == 2 && avh_22 instanceof aYU) {
                String string = am3_0.a((aYU)((aYU)avh_22)).h;
                this.J = true;
                String string2 = I18n.format(ane_2.t, new Object[0]);
                String string3 = aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), ane_2.G), string), ane_2.i), I18n.format(ane_2.d, new Object[0])).toString();
                String string4 = I18n.format(ane_2.B, new Object[0]);
                String string5 = I18n.format(ane_2.p, new Object[0]);
                GuiYesNo guiYesNo = new GuiYesNo(this, string2, string3, string4, string5, aqx_0.a(this.Q));
                MCInvoker.displayGuiScreen(this.t, guiYesNo);
            } else if (qG.m == 1) {
                this.d();
            } else if (qG.m == 4) {
                this.F = true;
                this.w = new ServerData(I18n.format(ane_2.f, new Object[0]), ane_2.x, false);
                MCInvoker.displayGuiScreen(this.t, new RF(this, this.w));
            } else if (qG.m == 3) {
                this.v = true;
                this.w = new ServerData(I18n.format(ane_2.o, new Object[0]), ane_2.J, false);
                MCInvoker.displayGuiScreen(this.t, new RR(this, this.w));
            } else if (qG.m == 7 && avh_22 instanceof aYU) {
                this.K = true;
                ServerData serverData = am3_0.a((aYU)avh_22);
                this.w = new ServerData(serverData.h, serverData.k, false);
                aKZ.a(this.w, serverData);
                MCInvoker.displayGuiScreen(this.t, new RR(this, this.w));
            } else if (qG.m == 0) {
                MCInvoker.displayGuiScreen(this.t, this.y);
            } else if (qG.m == 8) {
                ListInvoker.clear(ServerData.g);
                this.j();
            }
        }
    }

    @Override
    protected void a(int n, int n2, int n3) {
        super.a(n, n2, n3);
        aqx_0.a(this.Q, n, n2, n3);
    }

    public void b() {
        this.N = new QG(7, this.n / 2 - 154, this.f - 28, 70, 20, I18n.format(ane_2.D, new Object[0]));
        ListInvoker.add(this.l, this.N);
        this.C = new QG(2, this.n / 2 - 74, this.f - 28, 70, 20, I18n.format(ane_2.h, new Object[0]));
        ListInvoker.add(this.l, this.C);
        this.D = new QG(1, this.n / 2 - 154, this.f - 52, 100, 20, I18n.format(ane_2.v, new Object[0]));
        ListInvoker.add(this.l, this.D);
        ListInvoker.add(this.l, new QG(4, this.n / 2 - 50, this.f - 52, 100, 20, I18n.format(ane_2.z, new Object[0])));
        ListInvoker.add(this.l, new QG(3, this.n / 2 + 4 + 50, this.f - 52, 100, 20, I18n.format(ane_2.e, new Object[0])));
        ListInvoker.add(this.l, new QG(8, this.n / 2 + 4, this.f - 28, 70, 20, I18n.format(ane_2.s, new Object[0])));
        ListInvoker.add(this.l, new QG(0, this.n / 2 + 4 + 76, this.f - 28, 75, 20, I18n.format(ane_2.c, new Object[0])));
        this.a(aqx_0.a(this.Q));
    }

    @Override
    protected void a(char c, int n) throws IOException {
        int n2 = aqx_0.a(this.Q);
        Object var4_4 = null;
        if (n == 211) {
            avh_2 avh_22 = aqx_0.a(this.Q) < 0 ? null : aqx_0.c(this.Q, aqx_0.a(this.Q));
            String string = am3_0.a((aYU)((aYU)avh_22)).h;
            this.J = true;
            String string2 = I18n.format(ane_2.H, new Object[0]);
            String string3 = aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), ane_2.A), string), ane_2.C), I18n.format(ane_2.I, new Object[0])).toString();
            String string4 = I18n.format(ane_2.F, new Object[0]);
            String string5 = I18n.format(ane_2.a, new Object[0]);
            GuiYesNo guiYesNo = new GuiYesNo(this, string2, string3, string4, string5, aqx_0.a(this.Q));
            MCInvoker.displayGuiScreen(this.t, guiYesNo);
        } else if (n == 63) {
            this.j();
        } else if (n == 200) {
            if (R5.j()) {
                if (var4_4 instanceof aYU) {
                    a3A.a(this.R, n2, n2 - 1);
                    this.a(aqx_0.a(this.Q) - 1);
                    aqx_0.a(this.Q, -aqx_0.b(this.Q));
                    aqx_0.a(this.Q, this.R);
                }
            } else {
                this.a(aqx_0.a(this.Q) - 1);
                aqx_0.a(this.Q, -aqx_0.b(this.Q));
                if (aqx_0.c(this.Q, aqx_0.a(this.Q)) instanceof aHO) {
                    if (aqx_0.a(this.Q) > 0) {
                        this.a(this.Q.f() - 1);
                        aqx_0.a(this.Q, -aqx_0.b(this.Q));
                    } else {
                        this.a(-1);
                    }
                }
            }
        } else if (n == 208) {
            if (R5.j()) {
                if (n2 < a3A.c(this.R) - 1) {
                    a3A.a(this.R, n2, n2 + 1);
                    this.a(n2 + 1);
                    aqx_0.a(this.Q, aqx_0.b(this.Q));
                    aqx_0.a(this.Q, this.R);
                }
            } else if (n2 < this.Q.f()) {
                this.a(aqx_0.a(this.Q) + 1);
                aqx_0.a(this.Q, aqx_0.b(this.Q));
                if (aqx_0.c(this.Q, aqx_0.a(this.Q)) instanceof aHO) {
                    if (aqx_0.a(this.Q) < this.Q.f() - 1) {
                        this.a(this.Q.f() + 1);
                        aqx_0.a(this.Q, aqx_0.b(this.Q));
                    } else {
                        this.a(-1);
                    }
                }
            } else {
                this.a(-1);
            }
        } else if (n != 28 && n != 156) {
            super.a(c, n);
        } else {
            this.a((QG)ListInvoker.get(this.l, 2));
        }
    }

    public void a(aYU aYU2, int n, boolean bl) {
        int n2 = a3A.c(this.R) - 1;
        a3A.a(this.R, n, n2);
        if (aqx_0.a(this.Q) == n) {
            this.a(n2);
        }
        aqx_0.a(this.Q, this.R);
    }

    @Override
    public void i() {
        KeyboardInvoker.a(false);
        if (this.G != null) {
            this.G.interrupt();
            this.G = null;
        }
        aQV.b(this.M);
    }

    public boolean b(aYU aYU2, int n) {
        return true;
    }

    public R5(GuiScreen guiScreen) {
        Closeable closeable;
        this.E = aL0.a(aL0.a(new StringBuilder(), NovolineInvoker.t(NovolineInvoker.getInstance())), ane_2.r).toString();
        this.M = new aX1();
        this.H = SystemInvoker.f();
        this.y = guiScreen;
        if (!aev_1.b(da_0.a(this.E, new String[0]), new LinkOption[0])) {
            try {
                closeable = new FileWriter(this.E);
                l2.a(closeable, (CharSequence)ane_2.k);
                l2.a(closeable, (CharSequence)ane_2.l);
                l2.a(closeable, (CharSequence)ane_2.w);
                l2.a(closeable, (CharSequence)ane_2.E);
                l2.a(closeable);
                this.I = true;
            }
            catch (IOException iOException) {
                a4E.b(iOException);
            }
        } else {
            closeable = null;
            try {
                closeable = new Scanner(da_0.a(this.E, new String[0]));
                while (GL.b((Scanner)closeable)) {
                    String string = GL.a((Scanner)closeable);
                    if (!StringInvoker.e(string, ane_2.q)) continue;
                    this.I = auk_2.b(StringInvoker.a(StringInvoker.g(string, ane_2.g)[1], (CharSequence)ane_2.b, (CharSequence)ane_2.y));
                }
            }
            catch (IOException iOException) {
                a4E.b(iOException);
            }
        }
        if (this.I) {
            try {
                this.T = new akn_0(ane_2.u);
            }
            catch (IOException iOException) {
                throw new IllegalStateException(ane_2.n, iOException);
            }
        }
        this.H = SystemInvoker.f();
    }

    @Override
    public void g() {
        super.g();
        if (arm_1.a(this.O)) {
            List list = arm_1.b(this.O);
            arm_1.c(this.O);
            aqx_0.a(this.Q, list);
        }
        aQV.a(this.M);
    }
}

