/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package cc.novoline.gui.screen.login;

import cc.novoline.invoke.DisplayInvoker;
import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.NovolineInvoker;
import cc.novoline.invoke.ScaledResolutionInvoker;
import cc.novoline.invoke.SoundHandlerInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.invoke.SystemInvoker;
import cc.novoline.invoke.ThreadInvoker;
import cc.novoline.utils.fonts.api.FontRenderer;

import java.awt.Color;
import java.awt.datatransfer.Clipboard;
import java.io.Closeable;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.LinkOption;
import java.nio.file.attribute.FileAttribute;
import java.util.Scanner;
import net.minecraft.client.Minecraft;
import net.GL;
import net.ResourceLocation;
import net.ScaledResolution;
import net.a1V;
import net.a4E;
import net.a7l_0;
import net.aE3;
import net.aL0;
import net.aV3;
import net.aWR;
import net.aYF;
import net.aY_;
import net.aag_2;
import net.abt_2;
import net.adj_1;
import net.aev_1;
import net.aih_1;
import net.aj7;
import net.akn_0;
import net.al1_0;
import net.aol_1;
import net.asm_2;
import net.atz_0;
import net.auk_2;
import net.aup_1;
import net.axu_0;
import net.bj_0;
import net.da_0;
import net.hb_2;
import net.l2;
import net.mf_0;
import net.ob_0;
import net.skidunion.a_0;
import net.vr_0;
import org.lwjgl.opengl.GL11;
import net.skidunion.Protection;

public class GuiLogin
extends GuiScreen
implements a_0 {
    private boolean O;
    private float C;
    private FontRenderer Q;
    private aYF D;
    private boolean B;
    private boolean G;
    private float x;
    private double T;
    private String V;
    private Clipboard I;
    private boolean L;
    private String K;
    private boolean Y;
    private float R;
    private boolean N;
    private long v;
    private Color J;
    private float w;
    public int S;
    private boolean M;
    private Color z;
    private long X;
    private Color W;
    private float U;
    private Color F;
    private mf_0 y;
    private akn_0 E;
    private boolean P;
    private float A;
    private String H;

    private void a(double d, float f, float f2) {
        double d2 = (f + f2) * 2.0f;
        mf_0.b();
        double cfr_ignored_0 = d2 / (double)(f / 2.0f);
        double d3 = d2 * (d / 100.0);
        aV3.a(aV3.a(), (double)this.x, (double)(this.C - 69.5f), (double)((float)MathInvoker.a((double)(f / 2.0f + 1.0f), d3)), 10.0, 15.0, 2.0, this.F, false);
        d3 -= (double)(f / 2.0f + 1.0f);
        if (d > (double)(f / 2.0f) / d2) {
            aV3.a(aV3.a(), (double)(this.x + 70.0f), (double)(this.C - 69.0f + 1.0f), 11.5, (double)((float)MathInvoker.a(111.0, d3)), 15.0, 2.0, this.F, false);
            d3 -= 111.0;
            if (d > (double)(f / 2.0f + 1.0f + 111.0f) / d2) {
                aV3.a(aV3.a(), (double)((float)((double)(this.x + 80.0f) - MathInvoker.a(d3, (double)f + 1.5))), (double)(this.C + 34.0f), (double)((float)MathInvoker.a(d3, (double)f + 1.5)), 10.0, 15.0, 2.0, this.F, false);
                d3 -= (double)f;
                if (d > (double)(f / 2.0f + 1.0f + 111.0f + f) / d2) {
                    aV3.a(aV3.a(), (double)(this.x - 81.5f), (double)((float)((double)this.C + 43.5 - MathInvoker.a(112.0, d3))), 5.0, (double)((float)MathInvoker.a(112.0, d3)), 15.0, 2.0, this.F, false);
                    d3 -= 111.0;
                    if (d > (double)(f / 2.0f + 1.0f + 111.0f + f + 111.0f) / d2) {
                        aV3.a(aV3.a(), (double)(this.x - f / 2.0f), (double)(this.C - 69.5f), (double)((float)MathInvoker.a((double)(f / 2.0f + 1.0f), d3)), 10.0, 15.0, 2.0, this.F, false);
                    }
                }
            }
        }
    }

    public long a() {
        return this.X;
    }

    public GuiLogin(Minecraft minecraft) {
        block12: {
            String string;
            Closeable closeable;
            this.B = true;
            this.Y = false;
            mf_0.b();
            this.G = false;
            this.V = null;
            this.S = 0;
            this.X = SystemInvoker.f();
            this.W = new Color(20, 23, 26);
            this.z = new Color(0, 150, 255, 200);
            this.F = this.J = new Color(0, 100, 200, 255);
            this.H = aL0.a(aL0.a(new StringBuilder(), NovolineInvoker.t(NovolineInvoker.getInstance())), aup_1.x).toString();
            this.C = 540.0f;
            this.x = 960.0f;
            this.w = 0.0f;
            this.A = 1.0f;
            this.R = 0.0f;
            this.T = 0.0;
            this.Q = adj_1.a(bj_0.a, 35);
            this.D = new aYF((int)this.x - 70, (int)(this.C + 5.0f), 140, 25, aup_1.I);
            this.I = aj7.b(aj7.a());
            if (!aev_1.b(da_0.a(NovolineInvoker.t(NovolineInvoker.getInstance()), new String[0]), new LinkOption[0])) {
                try {
                    aev_1.a(da_0.a(NovolineInvoker.t(NovolineInvoker.getInstance()), new String[0]), new FileAttribute[0]);
                }
                catch (IOException iOException) {
                    a4E.b(iOException);
                }
            }
            if (!aev_1.b(da_0.a(this.H, new String[0]), new LinkOption[0])) {
                try {
                    closeable = new FileWriter(this.H);
                    l2.a(closeable, (CharSequence)aup_1.j);
                    l2.a(closeable, (CharSequence)aup_1.J);
                    l2.a(closeable, (CharSequence)aup_1.E);
                    l2.a(closeable, (CharSequence)aup_1.n);
                    l2.a(closeable);
                    this.O = true;
                    break block12;
                }
                catch (IOException iOException) {
                    a4E.b(iOException);
                }
            }
            closeable = null;
            closeable = new Scanner(da_0.a(this.H, new String[0]));
            if (!GL.b((Scanner)closeable) || !StringInvoker.e(string = GL.a((Scanner)closeable), aup_1.u)) break block12;
            try {
                this.O = auk_2.b(StringInvoker.a(StringInvoker.g(string, aup_1.A)[1], (CharSequence)aup_1.p, (CharSequence)aup_1.e));
            }
            catch (IOException iOException) {
                a4E.b(iOException);
            }
        }
        this.K = aup_1.t;
        if (this.O) {
            try {
                this.E = new akn_0(aup_1.m);
            }
            catch (IOException iOException) {
                throw new IllegalStateException(aup_1.C, iOException);
            }
            this.X = SystemInvoker.f();
        }
    }

    @Override
    public void l() {
        DisplayInvoker.a(aup_1.N);
        mf_0.b();
        this.S = 100;
        this.y = new mf_0(this, this.x - 70.0f, this.C - 35.0f, 140.0, 30.0);
        if (!StringInvoker.g(this.t.ar)) {
            mf_0.a(this.y, this.t.ar);
        }
        this.G = true;
        this.T = 0.0;
        super.l();
    }

    private void lambda$mouseClicked$0() {
        mf_0.b();
        try {
            this.K = aup_1.B;
            NovolineInvoker.a(NovolineInvoker.getInstance(), new Protection(this, true, true));
            this.K = aup_1.P;
            aag_2.a(NovolineInvoker.v(NovolineInvoker.getInstance()), mf_0.b(this.y));
            SoundHandlerInvoker.c(MCInvoker.l(this.t), aih_1.a(new ResourceLocation(aup_1.K), 1.0f));
        }
        catch (Throwable throwable) {
            aWR.c(throwable);
            if (StringInvoker.a(aWR.d(throwable), (CharSequence)aup_1.g)) {
                this.P = true;
            }
            this.L = false;
            this.K = aWR.d(throwable);
            SoundHandlerInvoker.c(MCInvoker.l(this.t), aih_1.a(new ResourceLocation(aup_1.q), -1.0f));
        }
    }

    @Override
    protected void a(char c, int n) throws IOException {
        mf_0.b();
        if (mf_0.a(this.y)) {
            this.y.a(c, n);
            this.t.ar = mf_0.b(this.y);
        }
        if (n == 1) {
            this.l();
        }
        if (n == 64) {
            MCInvoker.displayGuiScreen(this.t, this);
        }
    }

    @Override
    protected void b(int n, int n2, int n3) {
        boolean bl;
        mf_0.b();
        boolean bl2 = bl = (float)n >= this.x + 57.0f && (float)n <= this.x + 57.0f + (float)a7l_0.a(this.Q, aup_1.w) && (float)n2 >= this.C - 60.0f && (float)n2 <= this.C - 60.0f + (float)a7l_0.a(this.Q);
        if (vr_0.a(this.D, n, n2) && n3 == 0 && !this.L) {
            mf_0.a(this.y, false);
            vr_0.a(this.D);
            this.L = true;
            ThreadInvoker.e(new Thread(this::lambda$mouseClicked$0, aup_1.H));
        }
        if (abt_2.a(this.y, n, n2)) {
            abt_2.b(this.y, n, n2);
        }
        mf_0.a(this.y, false);
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    private int a(Color color, Color color2, float f) {
        int n = (int)((float)aol_1.c(color) + (float)(aol_1.c(color2) - aol_1.c(color)) * f);
        int n2 = (int)((float)aol_1.g(color) + (float)(aol_1.g(color2) - aol_1.g(color)) * f);
        int n3 = (int)((float)aol_1.f(color) + (float)(aol_1.f(color2) - aol_1.f(color)) * f);
        int n4 = (int)((float)aol_1.e(color) + (float)(aol_1.e(color2) - aol_1.e(color)) * f);
        try {
            return aol_1.b(new Color(n, n2, n3, n4));
        }
        catch (Exception exception) {
            return -1;
        }
    }

    public akn_0 b() {
        return this.E;
    }

    @Override
    public void a(int n, int n2, float f) {
        Object object;
        int n3;
        block28: {
            block27: {
                block26: {
                    block25: {
                        boolean bl;
                        mf_0.b();
                        if (this.O) {
                            GlStateManagerInvoker.A();
                            asm_2.a(this.E, this.n * 2, this.f * 2, n, n2, (float)(SystemInvoker.f() - this.X) / 1000.0f);
                            GL11.glBegin((int)7);
                            GL11.glVertex2f((float)-1.0f, (float)-1.0f);
                            GL11.glVertex2f((float)-1.0f, (float)1.0f);
                            GL11.glVertex2f((float)1.0f, (float)1.0f);
                            GL11.glVertex2f((float)1.0f, (float)-1.0f);
                            GL11.glEnd();
                            aY_.b(0);
                            ListInvoker.b(new ListInvoker[3]);
                        }
                        a1V.c(0.0f, 0.0f, 9999.0f, 9999.0f, aol_1.b(Color.BLACK));
                        if (n <= 20 && n2 <= 20 && this.S < 255) {
                            ++this.S;
                        }
                        if (this.S > 100) {
                            --this.S;
                        }
                        new Color(-723464);
                        new Color(150, 150, 150);
                        vr_0.a(this.D, vr_0.a(this.D, n, n2) ? aol_1.b(aol_1.d(this.J)) : aol_1.b(this.J));
                        ScaledResolution scaledResolution = new ScaledResolution(this.t);
                        vr_0.a(this.D, this.x - 70.0f, this.C + 5.0f);
                        abt_2.a(this.y, this.x - 70.0f, this.C - 34.5f);
                        int n4 = ScaledResolutionInvoker.getScaledWidth(scaledResolution);
                        n3 = ScaledResolutionInvoker.i(scaledResolution);
                        if (NovolineInvoker.b(NovolineInvoker.getInstance())) {
                            this.C += ((float)(n3 / 2) - this.C) * 0.02f;
                        }
                        this.C += ((float)(n3 + 100) - this.C) * 0.02f;
                        if ((float)(n3 + 100) - this.C < 1.0f) {
                            atz_0.b(atz_0.a());
                        }
                        this.x = n4 / 2;
                        if (NovolineInvoker.v(NovolineInvoker.getInstance()) != null) {
                            this.T += ((double)Protection.k - this.T) * 0.05;
                            this.a(this.T, 160.0f, 110.0f);
                        }
                        if (StringInvoker.e(this.K, aup_1.s) || StringInvoker.e(this.K, aup_1.F) || StringInvoker.e(this.K, aup_1.Q)) {
                            this.U = 0.0f;
                        }
                        if (this.U < 1.0f) {
                            this.U = MathInvoker.a(1.0f, (float)((double)this.U + (double)(1.0f - this.U) * 0.015));
                        }
                        if (this.K.equals(aup_1.l)) {
                            this.F = new Color(this.a(this.J, new Color(172, 82, 220), this.U));
                        }
                        this.F = new Color(this.a(this.J, new Color(208, 0, 0), this.U));
                        aV3.a(aV3.a(), (double)(this.x - 80.0f), (double)(this.C - 68.0f), 160.0, 110.0, 15.0, 3.0, new Color(24, 24, 24, 255), false);
                        aV3.a(aV3.a(), (double)(this.x - 15.0f), (double)(this.C - 93.0f), 30.0, 30.0, 30.0, 3.0, new Color(20, 20, 20), false);
                        FontRenderer fontRenderer = adj_1.a(al1_0.a, 40);
                        a7l_0.a(fontRenderer, (CharSequence)aup_1.M, (double)(this.x - (float)(a7l_0.a(fontRenderer, aup_1.y) / 2)), (double)(this.C - 93.0f + 15.0f - (float)(a7l_0.a(fontRenderer) / 2)), aol_1.b(this.F), 3.0f);
                        a7l_0.a(adj_1.a(axu_0.a, 35), (CharSequence)aup_1.c, (double)(this.x - 70.0f), (double)(this.C - 55.0f), aol_1.b(this.z), 3.0f);
                        boolean bl2 = bl = (float)n >= this.x + 57.0f && (float)n <= this.x + 57.0f + (float)a7l_0.a(this.Q, aup_1.G) && (float)n2 >= this.C - 60.0f && (float)n2 <= this.C - 60.0f + (float)a7l_0.a(this.Q);
                        if (!this.N) break block25;
                        if (!((double)this.A > 0.8)) break block26;
                        this.A = (float)MathInvoker.d(0.8, (double)this.A + (0.8 - (double)this.A) * 0.05);
                        if (!((double)this.A - 0.8 < 0.05)) break block26;
                        this.N = false;
                    }
                    if (this.A > 1.0f) {
                        this.A = (float)MathInvoker.d(1.0, (double)this.A + (double)(1.0f - this.A) * 0.05);
                    }
                    if (this.A < 1.0f) {
                        this.A = (float)MathInvoker.a(1.0, (double)this.A + (double)(1.0f - this.A) * 0.05);
                    }
                }
                GlStateManagerInvoker.pushMatrix();
                double d = this.x + 55.0f + (float)(a7l_0.a(this.Q, aup_1.O) / 2);
                double d2 = this.C - 57.0f + (float)(a7l_0.a(this.Q) / 2);
                GlStateManagerInvoker.a(d, d2, 0.0);
                GlStateManagerInvoker.c(this.A, this.A, 1.0f);
                GlStateManagerInvoker.a(-d, -d2, 0.0);
                a7l_0.a(this.Q, (CharSequence)aup_1.i, (double)(this.x + 55.0f), (double)(this.C - 57.0f), aol_1.b(this.J), 3.0f);
                GlStateManagerInvoker.popMatrix();
                if (!this.M) break block27;
                if (!((double)this.R < 1.2)) break block28;
                this.R = (float)MathInvoker.a(1.2, (double)this.R + (1.2 - (double)this.R) * 0.05);
                if (!(1.2 - (double)this.R < 0.05) || !((double)(this.A - 1.0f) < 0.01)) break block28;
                this.M = false;
            }
            if (this.R > 0.0f) {
                this.R = (float)((double)this.R + (double)(-this.R) * 0.1);
            }
        }
        if ((double)this.R > 0.1) {
            object = adj_1.a(ob_0.a, 17);
            aV3.a(aV3.a(), (double)(n - a7l_0.a((FontRenderer)object, aup_1.o) / 2 - 2), (double)(n2 - a7l_0.a(this.Q) - 10), (double)(a7l_0.a((FontRenderer)object, aup_1.f) + 4), (double)a7l_0.a(this.Q), 8.0, 2.0, new Color(25, 25, 25, 255), this.R, false);
            GlStateManagerInvoker.pushMatrix();
            double d = n2 - a7l_0.a(this.Q) - 5 + a7l_0.a(this.Q) / 2;
            GlStateManagerInvoker.a(n, d, 0.0);
            GlStateManagerInvoker.c(this.R, this.R, 0.0f);
            GlStateManagerInvoker.a(-n, -d, 0.0);
            a7l_0.a((FontRenderer)object, (CharSequence)aup_1.h, (double)(n - a7l_0.a((FontRenderer)object, aup_1.k) / 2), (double)(n2 - a7l_0.a(this.Q) - 5), aol_1.b(this.J), 1.0f);
            GlStateManagerInvoker.popMatrix();
        }
        abt_2.a(this.y);
        vr_0.a(this.D, this.t, n, n2, 12.0f);
        if (StringInvoker.e(this.K, aup_1.z) || StringInvoker.e(this.K, aup_1.D) || StringInvoker.e(this.K, aup_1.L)) {
            this.w += (0.0f - this.w) * 0.01f;
        }
        Object object2 = object = this.K.equals(aup_1.a) ? aL0.a(aL0.a(new StringBuilder(), aup_1.v), Protection.I).toString() : this.K;
        if (this.Y) {
            this.w += (10.0f - this.w) * 0.01f;
        }
        if (!NovolineInvoker.b(NovolineInvoker.getInstance())) {
            this.w += (-20.0f - this.w) * 0.1f;
        }
        FontRenderer fontRenderer = adj_1.a(ob_0.a, 18);
        aV3.a(aV3.a(), (double)(this.x - (float)(a7l_0.a(fontRenderer, (CharSequence)object) / 2) - 10.0f), (double)this.w, (double)((a7l_0.a(fontRenderer, (CharSequence)object) / 2 + 10) * 2), 15.0, 7.0, 2.0, new Color(hb_2.a(aol_1.b(this.J), aol_1.b(aol_1.d(aol_1.d(this.J))), MCInvoker.a())), false);
        aV3.a(aV3.a(), (double)(this.x - (float)(a7l_0.a(fontRenderer, (CharSequence)object) / 2) - 10.5f), (double)(this.w + 5.0f), (double)((float)((a7l_0.a(fontRenderer, (CharSequence)object) / 2 + 10) * 2) + 1.0f), 13.0, 5.0, 3.0, new Color(24, 24, 24), false);
        a7l_0.b(fontRenderer, (CharSequence)object, this.x - (float)(a7l_0.a(fontRenderer, (CharSequence)object) / 2), this.w + 11.0f - (float)(a7l_0.a(fontRenderer) / 2), aol_1.b(aol_1.a(aol_1.a(this.J))), true);
        a7l_0.a(aE3.a, (CharSequence)aup_1.r, this.x - (float)(a7l_0.a(aE3.a, aup_1.d) / 2), n3 - a7l_0.a(aE3.a) - 4, aol_1.b(new Color(150, 150, 150)));
        if (this.Y) {
            this.K = aup_1.b;
            if (SystemInvoker.f() - this.v > 250L && this.T > 99.0 && (double)this.U > 0.98) {
                atz_0.a(atz_0.a(), this.V);
                this.Y = false;
            }
        }
        if (this.P) {
            object = new ScaledResolution(this.t);
            this.b(ScaledResolutionInvoker.getScaledWidth((ScaledResolution)object) / 2, ScaledResolutionInvoker.i((ScaledResolution)object) / 2 + 20, 0);
            this.P = false;
        }
        super.a(n, n2, f);
    }

    @Override
    public void d(String string) {
        this.Y = true;
        this.v = SystemInvoker.f();
        this.V = string;
    }
}

