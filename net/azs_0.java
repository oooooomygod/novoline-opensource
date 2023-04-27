/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package net;

import cc.novoline.invoke.FramebufferInvoker;
import cc.novoline.invoke.ListInvoker;
import deobf.Framebuffer;
import deobf.MCInvoker;
import deobf.OpenGlHelper;
import net.T4;
import net.TE;
import net.a1V;
import net.aGI;
import net.aoh_1;
import net.aqg_0;
import net.ase_0;
import net.asx_1;
import net.azw_0;
import net.hb_2;
import net.oa_0;
import net.sj_1;
import org.lwjgl.opengl.GL11;

/*
 * Renamed from net.aZs
 */
public class azs_0
extends azw_0 {
    private T4 k;
    private aGI o;
    private T4 s;
    private T4 h;
    private int m;
    private double u;
    private T4 v;
    private T4 i;
    private Framebuffer a;
    private aGI p;
    private Framebuffer r;
    private T4 q;
    private double l;
    private T4 t;
    private static boolean g;
    private T4 n = new T4(TE.a);
    private T4 j = new T4(TE.i);

    public static boolean c() {
        return g;
    }

    static {
        if (!azs_0.a()) {
            azs_0.b(true);
        }
    }

    public static void b(boolean bl) {
        g = bl;
    }

    public void a(double d, double d2, double d3, double d4, double d5, double d6, float f, Runnable runnable, float f2) {
        azs_0.c();
        if (this.l != (double)this.f.displayWidth || this.u != (double)this.f.displayHeight || this.m != this.f.gameSettings.z) {
            this.e();
        }
        GL11.glAlphaFunc((int)516, (float)0.0f);
        GL11.glEnable((int)3042);
        GL11.glEnable((int)3008);
        OpenGlHelper.c(770, 771, 1, 0);
        FramebufferInvoker.a(this.r);
        FramebufferInvoker.bindFramebuffer(this.r, false);
        sj_1.a(runnable);
        FramebufferInvoker.unbindFramebuffer(this.r);
        FramebufferInvoker.a(this.a);
        FramebufferInvoker.bindFramebuffer(this.a, false);
        a1V.a(d, d2, d3, d4, hb_2.a(asx_1.WHITE));
        FramebufferInvoker.unbindFramebuffer(this.a);
        aqg_0.b(34004);
        GL11.glBindTexture((int)3553, (int)this.a.e);
        aqg_0.b(33984);
        aqg_0.b(34005);
        GL11.glBindTexture((int)3553, (int)this.r.e);
        aqg_0.b(33984);
        oa_0.c(this.p);
        aoh_1.a(this.n, 1.0f, 1.0f, 1.0f, f2);
        aoh_1.a(this.j, this.f.displayWidth, this.f.displayHeight);
        aoh_1.a(this.i, (float)d3, (float)d4);
        aoh_1.a(this.s, (float)(d - d3 / 2.0 * (double)(f - 1.0f)), (float)(d2 - d4 / 2.0 * (double)(f - 1.0f)));
        aoh_1.a(this.h, (float)(d5 * (double)f));
        aoh_1.a(this.k, f);
        aoh_1.a(this.t, (float)d6);
        aoh_1.a(this.q, 20);
        aoh_1.a(this.v, 21);
        FramebufferInvoker.bindFramebuffer(MCInvoker.c(this.f), false);
        oa_0.a(this.p, MCInvoker.c(this.f));
        oa_0.a(this.p);
        this.l = this.f.displayWidth;
        this.u = this.f.displayHeight;
        this.m = this.f.gameSettings.z;
        if (ListInvoker.b() != null) {
            azs_0.b(false);
        }
    }

    public static azs_0 d() {
        return ase_0.a(ase_0.INSTANCE);
    }

    public void a(double d, double d2, double d3, double d4, double d5, double d6, float f, Runnable runnable) {
        azs_0.c();
        if (this.l != (double)this.f.displayWidth || this.u != (double)this.f.displayHeight || this.m != this.f.gameSettings.z) {
            this.e();
        }
        GL11.glAlphaFunc((int)516, (float)0.0f);
        GL11.glEnable((int)3042);
        GL11.glEnable((int)3008);
        OpenGlHelper.c(770, 771, 1, 0);
        FramebufferInvoker.a(this.r);
        FramebufferInvoker.bindFramebuffer(this.r, false);
        sj_1.a(runnable);
        FramebufferInvoker.unbindFramebuffer(this.r);
        FramebufferInvoker.a(this.a);
        FramebufferInvoker.bindFramebuffer(this.a, false);
        a1V.a(d, d2, d3, d4, hb_2.a(asx_1.WHITE));
        FramebufferInvoker.unbindFramebuffer(this.a);
        aqg_0.b(34004);
        GL11.glBindTexture((int)3553, (int)this.a.e);
        aqg_0.b(33984);
        aqg_0.b(34005);
        GL11.glBindTexture((int)3553, (int)this.r.e);
        aqg_0.b(33984);
        oa_0.c(this.p);
        aoh_1.a(this.n, 1.0f, 1.0f, 1.0f, 1.0f);
        aoh_1.a(this.j, this.f.displayWidth, this.f.displayHeight);
        aoh_1.a(this.i, (float)d3, (float)d4);
        aoh_1.a(this.s, (float)(d - d3 / 2.0 * (double)(f - 1.0f)), (float)(d2 - d4 / 2.0 * (double)(f - 1.0f)));
        aoh_1.a(this.h, (float)(d5 * (double)f));
        aoh_1.a(this.k, f);
        aoh_1.a(this.t, (float)d6);
        aoh_1.a(this.q, 20);
        aoh_1.a(this.v, 21);
        FramebufferInvoker.bindFramebuffer(MCInvoker.c(this.f), false);
        oa_0.a(this.p, MCInvoker.c(this.f));
        oa_0.a(this.p);
        this.l = this.f.displayWidth;
        this.u = this.f.displayHeight;
        this.m = this.f.gameSettings.z;
    }

    public static boolean a() {
        azs_0.c();
        return true;
    }

    public void e() {
        this.a = new Framebuffer(this.f.displayWidth, this.f.displayHeight, false);
        this.r = new Framebuffer(this.f.displayWidth, this.f.displayHeight, false);
        this.p = oa_0.b(oa_0.a(oa_0.b(oa_0.a(oa_0.a(), TE.d), TE.m), new T4[]{this.n, this.j, this.i, this.s, this.h, this.k, this.t, this.q, this.v}));
    }

    public void a(double d, double d2, double d3, double d4, double d5, double d6, float f, float[] fArray, Runnable runnable) {
        azs_0.a();
        if (this.l != (double)this.f.displayWidth || this.u != (double)this.f.displayHeight || this.m != this.f.gameSettings.z) {
            this.e();
        }
        GL11.glEnable((int)3042);
        GL11.glEnable((int)3008);
        OpenGlHelper.c(770, 771, 1, 0);
        FramebufferInvoker.a(this.r);
        FramebufferInvoker.bindFramebuffer(this.r, false);
        sj_1.a(runnable);
        FramebufferInvoker.unbindFramebuffer(this.r);
        FramebufferInvoker.a(this.a);
        FramebufferInvoker.bindFramebuffer(this.a, false);
        a1V.a(fArray[0], fArray[1], fArray[2], fArray[3], -1);
        FramebufferInvoker.unbindFramebuffer(this.a);
        aqg_0.b(34004);
        GL11.glBindTexture((int)3553, (int)this.a.e);
        aqg_0.b(33984);
        aqg_0.b(34005);
        GL11.glBindTexture((int)3553, (int)this.r.e);
        aqg_0.b(33984);
        oa_0.c(this.p);
        aoh_1.a(this.n, 1.0f, 1.0f, 1.0f, 1.0f);
        aoh_1.a(this.j, this.f.displayWidth, this.f.displayHeight);
        aoh_1.a(this.i, (float)d3, (float)d4);
        aoh_1.a(this.s, (float)(d - d3 / 2.0 * (double)(f - 1.0f)), (float)(d2 - d4 / 2.0 * (double)(f - 1.0f)));
        aoh_1.a(this.h, (float)(d5 * (double)f));
        aoh_1.a(this.k, f);
        aoh_1.a(this.t, (float)d6);
        aoh_1.a(this.q, 20);
        aoh_1.a(this.v, 21);
        FramebufferInvoker.bindFramebuffer(MCInvoker.c(this.f), false);
        oa_0.a(this.p, MCInvoker.c(this.f));
        oa_0.a(this.p);
        this.l = this.f.displayWidth;
        this.u = this.f.displayHeight;
        this.m = this.f.gameSettings.z;
        ListInvoker.b(new ListInvoker[3]);
    }

    public azs_0() {
        this.i = new T4(TE.h);
        this.s = new T4(TE.l);
        this.h = new T4(TE.k);
        this.k = new T4(TE.b);
        this.t = new T4(TE.j);
        this.q = new T4(TE.n);
        this.v = new T4(TE.f);
        this.o = oa_0.b(oa_0.a(oa_0.b(oa_0.a(oa_0.a(), TE.c), TE.g), new T4[]{this.n, this.j, this.i, this.s, this.h, this.k, this.t}));
        this.p = oa_0.b(oa_0.a(oa_0.b(oa_0.a(oa_0.a(), TE.o), TE.e), new T4[]{this.n, this.j, this.i, this.s, this.h, this.k, this.t, this.q, this.v}));
    }
}

