/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package net.minecraft.client.gui;

import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.NovolineInvoker;
import cc.novoline.invoke.ScaledResolutionInvoker;
import cc.novoline.invoke.SoundHandlerInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.invoke.SystemInvoker;
import cc.novoline.utils.fonts.api.FontRenderer;
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
import net.GL;
import net.QE;
import net.R5;
import net.RD;
import net.RP;
import net.ResourceLocation;
import net.ScaledResolution;
import net.a1V;
import net.a4E;
import net.a7l_0;
import net.a7r_0;
import net.aB0;
import net.aL0;
import net.aMF;
import net.aV3;
import net.aY_;
import net.adj_1;
import net.adk_2;
import net.ae_1;
import net.aev_1;
import net.aih_1;
import net.akn_0;
import net.amn_2;
import net.aol_1;
import net.asm_2;
import net.auk_2;
import net.avf_2;
import net.bj_0;
import net.da_0;
import net.dz_0;
import net.er_1;
import net.hb_2;
import net.hj_0;
import net.l2;
import net.ua_2;
import net.wl_1;
import org.lwjgl.opengl.GL11;

public class GuiMainMenu
extends GuiScreen
implements GuiYesNoCallback {
    private QE E;
    private String z;
    private QE D;
    private QE J;
    private QE w;
    private wl_1 B;
    private QE H;
    private long C;
    private double A = -100.0;
    private akn_0 y;
    private wl_1 v;
    private wl_1 G;
    private boolean x;
    private String I = aL0.a(aL0.a(new StringBuilder(), NovolineInvoker.t(NovolineInvoker.getInstance())), ae_1.A).toString();
    private double F = 960.0;

    @Override
    public void a(int n, int n2, float f) {
        if (this.x) {
            GlStateManagerInvoker.A();
            asm_2.a(er_1.a(NovolineInvoker.g(NovolineInvoker.getInstance())), this.n * 2, this.f * 2, n, n2, (float)(SystemInvoker.f() - er_1.b(NovolineInvoker.g(NovolineInvoker.getInstance()))) / 1000.0f);
            GL11.glBegin((int)7);
            GL11.glVertex2f((float)-1.0f, (float)-1.0f);
            GL11.glVertex2f((float)-1.0f, (float)1.0f);
            GL11.glVertex2f((float)1.0f, (float)1.0f);
            GL11.glVertex2f((float)1.0f, (float)-1.0f);
            GL11.glEnd();
            aY_.b(0);
        } else {
            a1V.c(0.0f, 0.0f, 9999.0f, 9999.0f, aol_1.b(Color.BLACK));
        }
        ScaledResolution scaledResolution = new ScaledResolution(this.t);
        double d = ScaledResolutionInvoker.getScaledWidth(scaledResolution);
        double d2 = ScaledResolutionInvoker.i(scaledResolution);
        this.A = d2 * 0.5;
        this.F = d * 0.5;
        aV3.a(aV3.a(), this.F - 70.0, this.A - 81.0, 140.0, 116.0, 15.0, 3.0, new Color(24, 24, 24, 255), false);
        List list = a7r_0.a(new QE[]{this.E, this.H, this.J, this.w});
        ListInvoker.forEach(list, arg_0 -> this.lambda$drawScreen$0(list, n, n2, arg_0));
        FontRenderer fontRenderer = adj_1.a(bj_0.a, 55);
        double d3 = 2.0;
        GlStateManagerInvoker.b(d3, d3, d3);
        a7l_0.a(fontRenderer, (CharSequence)ae_1.c, this.F * 1.0 / d3 - (double)(a7l_0.a(fontRenderer, ae_1.m) / 2) + 1.0, (this.A - 135.0 + 4.0) * 1.0 / d3, aol_1.b(new Color(24, 24, 24, 255)), false, true);
        a7l_0.a(fontRenderer, (CharSequence)ae_1.a, this.F * 1.0 / d3 - (double)(a7l_0.a(fontRenderer, ae_1.x) / 2), (this.A - 135.0) * 1.0 / d3, aol_1.b(new Color(108, 184, 255, 255)), false, true);
        ua_2.a(d3);
        hj_0.a(this.E, hj_0.a(this.E, n, n2) ? aol_1.b(this.a(0)) : hb_2.a(0xFFFFFF, 180));
        hj_0.a(this.H, hj_0.a(this.H, n, n2) ? aol_1.b(this.a(0)) : hb_2.a(0xFFFFFF, 180));
        hj_0.a(this.D, hj_0.a(this.D, n, n2) ? aol_1.b(this.a(0)) : hb_2.a(0xFFFFFF, 180));
        hj_0.a(this.J, hj_0.a(this.J, n, n2) ? aol_1.b(this.a(0)) : hb_2.a(0xFFFFFF, 180));
        hj_0.a(this.w, hj_0.a(this.w, n, n2) ? aol_1.b(this.a(0)) : hb_2.a(0xFFFFFF, 180));
        if (!NovolineInvoker.b(NovolineInvoker.getInstance())) {
            Iterator iterator = ListInvoker.iterator((List)aMF.a(aMF.a(aMF.a(new wl_1[]{this.G, this.B, this.v}), GuiMainMenu::lambda$drawScreen$1), aB0.a()));
            while (dz_0.c(iterator)) {
                wl_1 wl_12 = (wl_1)dz_0.b(iterator);
                amn_2.a(wl_12, n, n2, new Color(33, 33, 33, 255), new Color(0, 150, 255));
            }
            avf_2.b(NovolineInvoker.f(NovolineInvoker.getInstance()), n, n2);
        }
        super.a(n, n2, f);
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public List<wl_1> a() {
        return a7r_0.a(new wl_1[]{this.G, this.B, this.v});
    }

    @Override
    public boolean d() {
        return false;
    }

    public GuiMainMenu() {
        Closeable closeable;
        this.z = ae_1.f;
        this.C = SystemInvoker.f();
        this.E = new QE(1, 0, 0, 130, 20, ae_1.j);
        this.H = new QE(2, 0, 0, 130, 20, ae_1.e);
        this.D = new QE(3, 0, 0, 130, 20, ae_1.n);
        this.J = new QE(4, 0, 0, 130, 20, ae_1.v);
        this.w = new QE(5, 0, 0, 130, 20, ae_1.t);
        this.G = new wl_1(this, 20.0f, 20.0f, 15.0f, ae_1.u, ae_1.l);
        this.B = new wl_1(this, 58.0f, 20.0f, 15.0f, ae_1.i, ae_1.s);
        this.v = new wl_1(this, 96.0f, 20.0f, 15.0f, ae_1.r, null);
        if (!aev_1.b(da_0.a(this.I, new String[0]), new LinkOption[0])) {
            try {
                closeable = new FileWriter(this.I);
                l2.a(closeable, (CharSequence)ae_1.w);
                l2.a(closeable, (CharSequence)ae_1.z);
                l2.a(closeable, (CharSequence)ae_1.g);
                l2.a(closeable, (CharSequence)ae_1.k);
                l2.a(closeable);
                this.x = true;
            }
            catch (IOException iOException) {
                a4E.b(iOException);
            }
        } else {
            closeable = null;
            try {
                closeable = new Scanner(da_0.a(this.I, new String[0]));
                while (GL.b((Scanner)closeable)) {
                    String string = GL.a((Scanner)closeable);
                    if (!StringInvoker.e(string, ae_1.d)) continue;
                    this.x = auk_2.b(StringInvoker.a(StringInvoker.g(string, ae_1.y)[1], (CharSequence)ae_1.h, (CharSequence)ae_1.b));
                }
            }
            catch (IOException iOException) {
                a4E.b(iOException);
            }
        }
        if (this.x) {
            try {
                this.y = new akn_0(ae_1.o);
            }
            catch (IOException iOException) {
                throw new IllegalStateException(ae_1.q, iOException);
            }
            this.C = SystemInvoker.f();
        }
    }

    @Override
    protected void b(int n, int n2, int n3) throws IOException {
        avf_2.a(NovolineInvoker.f(NovolineInvoker.getInstance()), n, n2, n3);
        this.G.a(n, n2, n3);
        this.B.a(n, n2, n3);
        this.v.a(n, n2, n3);
        if (hj_0.a(this.E, n, n2)) {
            MCInvoker.displayGuiScreen(this.t, new RP(this));
        } else if (hj_0.a(this.H, n, n2)) {
            MCInvoker.displayGuiScreen(this.t, new R5(this));
        } else if (!hj_0.a(this.D, n, n2)) {
            if (hj_0.a(this.J, n, n2)) {
                MCInvoker.displayGuiScreen(this.t, new RD(this, this.t.gameSettings));
            } else if (hj_0.a(this.w, n, n2)) {
                MCInvoker.e(this.t);
            } else {
                return;
            }
        }
        SoundHandlerInvoker.c(MCInvoker.l(this.t), aih_1.a(new ResourceLocation(ae_1.p), 1.0f));
    }

    @Override
    public void l() {
        ListInvoker.clear(this.l);
        ScaledResolution scaledResolution = new ScaledResolution(this.t);
        this.F = ScaledResolutionInvoker.getScaledWidth(scaledResolution) / 2;
        this.A = -100.0;
        if (!NovolineInvoker.b(NovolineInvoker.getInstance())) {
            avf_2.f(NovolineInvoker.f(NovolineInvoker.getInstance()));
        }
        super.l();
    }

    private int a(String string, int n) {
        int n2 = adk_2.d(n);
        adk_2.a(n2, string);
        adk_2.c(n2);
        return n2;
    }

    @Override
    protected void a(char c, int n) throws IOException {
        if (!NovolineInvoker.b(NovolineInvoker.getInstance())) {
            avf_2.a(NovolineInvoker.f(NovolineInvoker.getInstance()), c, n);
        }
    }

    private void lambda$drawScreen$0(List list, int n, int n2, QE qE) {
        hj_0.a(qE, this.F - 65.0, this.A - 75.0 + (double)(ListInvoker.indexOf(list, qE) * 28));
        hj_0.b(qE, aol_1.b(new Color(23, 50, 80)));
        hj_0.a(qE, aol_1.b(new Color(0, 150, 255, 255)));
        hj_0.a(qE, this.t, n, n2, 15.0f);
    }

    private static int lambda$drawScreen$1(wl_1 wl_12, wl_1 wl_13) {
        return auk_2.a(amn_2.b(wl_12), amn_2.b(wl_13));
    }

    @Override
    protected void a(int n, int n2, int n3) {
        amn_2.a(this.G);
        amn_2.a(this.B);
        amn_2.a(this.v);
        if (!NovolineInvoker.b(NovolineInvoker.getInstance())) {
            avf_2.a(NovolineInvoker.f(NovolineInvoker.getInstance()), n, n2);
        }
        super.a(n, n2, n3);
    }

    private Color a(int n) {
        int n2 = hb_2.a(255, 0, 0);
        int n3 = hb_2.a(255, 100, 0);
        return new Color(hb_2.a(n2, n3, (long)n));
    }
}

