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
import java.awt.Color;
import net.MG;
import net.T4;
import net.a1V;
import net.aCO;
import net.aGI;
import net.aoh_1;
import net.aol_1;
import net.aqg_0;
import net.azw_0;
import net.oa_0;
import org.lwjgl.opengl.GL11;

public class aZK
extends azw_0 {
    private T4 l;
    private T4 q;
    private double k;
    private double p;
    private T4 h;
    private aGI a;
    private T4 t;
    private T4 j = new T4(MG.d);
    private int m;
    private T4 s;
    private static boolean o;
    private T4 n;
    private Framebuffer i;
    private aGI r;
    private T4 g = new T4(MG.c);

    public void a(double d, double d2, double d3, double d4, double d5, double d6, Color color, boolean bl) {
        this.a(d, d2, d3, d4, d5, d6, color, 1.0, bl);
    }

    public static void b(boolean bl) {
        o = bl;
    }

    public static boolean c() {
        return o;
    }

    static {
        if (aZK.c()) {
            aZK.b(true);
        }
    }

    public void b(double d, double d2, double d3, double d4, double d5, double d6, Color color, double d7, boolean bl) {
        this.a(d, d2, d3, d4, d5, d6, color, d7, bl);
    }

    private void a(double d, double d2, double d3, double d4, double d5, double d6, Color color, double d7, double[] dArray, boolean bl) {
        aZK.c();
        if (this.p != (double)this.f.displayWidth || this.k != (double)this.f.displayHeight || this.m != this.f.gameSettings.z) {
            this.d();
        }
        GL11.glEnable((int)3042);
        GL11.glEnable((int)3008);
        OpenGlHelper.c(770, 771, 1, 0);
        FramebufferInvoker.a(this.i);
        FramebufferInvoker.bindFramebuffer(this.i, false);
        a1V.a(dArray[0], dArray[1], dArray[2], dArray[3], -1);
        FramebufferInvoker.unbindFramebuffer(this.i);
        aqg_0.b(34004);
        GL11.glBindTexture((int)3553, (int)this.i.e);
        aqg_0.b(33984);
        oa_0.c(this.a);
        aoh_1.a(this.j, (float)aol_1.c(color) / 255.0f, (float)aol_1.g(color) / 255.0f, (float)aol_1.f(color) / 255.0f, (float)aol_1.e(color) / 255.0f);
        aoh_1.a(this.g, this.f.displayWidth, this.f.displayHeight);
        aoh_1.a(this.q, (float)d3, (float)d4);
        aoh_1.a(this.n, (float)(d - d3 / 2.0 * (d7 - 1.0)), (float)(d2 - d4 / 2.0 * (d7 - 1.0)));
        aoh_1.a(this.s, (float)(d5 * d7));
        aoh_1.a(this.l, (float)d7);
        aoh_1.a(this.h, (float)d6);
        aoh_1.a(this.t, 20);
        FramebufferInvoker.bindFramebuffer(MCInvoker.c(this.f), false);
        oa_0.a(this.a, MCInvoker.c(this.f));
        oa_0.b(this.a, MCInvoker.c(this.f));
        oa_0.a(this.a);
        this.p = this.f.displayWidth;
        this.k = this.f.displayHeight;
        this.m = this.f.gameSettings.z;
    }

    public void d() {
        aZK.a();
        this.i = new Framebuffer(this.f.displayWidth, this.f.displayHeight, false);
        this.a = oa_0.b(oa_0.a(oa_0.b(oa_0.a(oa_0.a(), MG.n), MG.h), new T4[]{this.j, this.g, this.q, this.n, this.s, this.l, this.h, this.t}));
        if (ListInvoker.b() != null) {
            aZK.b(false);
        }
    }

    public void a(double d, double d2, double d3, double d4, double d5, Color color, boolean bl) {
        this.a(d, d2, d3, d4, 0.0, d5, color, 1.0, bl);
    }

    public void a(double d, double d2, double d3, double d4, double d5, Color color, double d6, boolean bl) {
        this.a(d, d2, d3, d4, 0.0, d5, color, d6, bl);
    }

    public void a(double d, double d2, double d3, double d4, double d5, double d6, Color color, double[] dArray, boolean bl) {
        this.a(d, d2, d3, d4, d5, d6, color, 1.0, dArray, bl);
    }

    public void a(double d, double d2, double d3, double d4, Color color, boolean bl) {
        aZK.e().a(d - d3 * 0.5, d2 - d3 * 0.5, d3, d3, d3, d4, color, bl);
    }

    public void a(double d, double d2, double d3, double d4, double d5, double d6, Color color, float f) {
        GL11.glAlphaFunc((int)516, (float)0.0f);
        aZK.a();
        GL11.glEnable((int)3042);
        GL11.glEnable((int)3008);
        OpenGlHelper.c(770, 771, 1, 0);
        oa_0.c(this.r);
        aoh_1.a(this.j, (float)aol_1.c(color) / 255.0f, (float)aol_1.g(color) / 255.0f, (float)aol_1.f(color) / 255.0f, (float)aol_1.e(color) / 255.0f);
        aoh_1.a(this.g, (float)this.f.displayWidth * (float)(this.f.gameSettings.z == 1 ? 2 : 1), (float)this.f.displayHeight * (float)(this.f.gameSettings.z == 1 ? 2 : 1));
        aoh_1.a(this.q, (float)d3, (float)d4);
        aoh_1.a(this.n, (float)(d - d3 / 2.0 * (double)(f - 1.0f)), (float)(d2 - d4 / 2.0 * (double)(f - 1.0f)));
        aoh_1.a(this.s, (float)(d5 * (double)f));
        aoh_1.a(this.l, f);
        aoh_1.a(this.h, (float)d6);
        FramebufferInvoker.bindFramebuffer(MCInvoker.c(this.f), false);
        oa_0.b(this.r, MCInvoker.c(this.f));
        oa_0.a(this.r);
        GL11.glAlphaFunc((int)516, (float)0.1f);
        ListInvoker.b(new ListInvoker[2]);
    }

    public static aZK e() {
        return aCO.a(aCO.INSTANCE);
    }

    public void a(double d, double d2, double d3, double d4, Color color, double d5, boolean bl) {
        aZK.e().b(d - d3 * 0.5, d2 - d3 * 0.5, d3, d3, d3, d4, color, d5, bl);
    }

    private void a(double d, double d2, double d3, double d4, double d5, double d6, Color color, double d7, boolean bl) {
        GL11.glAlphaFunc((int)516, (float)0.0f);
        GL11.glEnable((int)3042);
        GL11.glEnable((int)3008);
        OpenGlHelper.c(770, 771, 1, 0);
        oa_0.c(this.r);
        aZK.c();
        aoh_1.a(this.j, (float)aol_1.c(color) / 255.0f, (float)aol_1.g(color) / 255.0f, (float)aol_1.f(color) / 255.0f, (float)aol_1.e(color) / 255.0f);
        aoh_1.a(this.g, this.f.displayWidth, this.f.displayHeight);
        aoh_1.a(this.q, (float)d3, (float)d4);
        aoh_1.a(this.n, (float)(d - d3 / 2.0 * (d7 - 1.0)), (float)(d2 - d4 / 2.0 * (d7 - 1.0)));
        aoh_1.a(this.s, (float)(d5 * d7));
        aoh_1.a(this.l, (float)d7);
        aoh_1.a(this.h, (float)d6);
        FramebufferInvoker.bindFramebuffer(MCInvoker.c(this.f), false);
        oa_0.a(this.r, MCInvoker.c(this.f));
        oa_0.b(this.r, MCInvoker.c(this.f));
        oa_0.a(this.r);
        GL11.glAlphaFunc((int)516, (float)0.1f);
    }

    public aZK() {
        this.q = new T4(MG.e);
        this.n = new T4(MG.a);
        this.s = new T4(MG.g);
        this.l = new T4(MG.j);
        this.h = new T4(MG.b);
        this.t = new T4(MG.m);
        this.r = oa_0.b(oa_0.a(oa_0.b(oa_0.a(oa_0.a(), MG.f), MG.i), new T4[]{this.j, this.g, this.q, this.n, this.s, this.l, this.h}));
        this.a = oa_0.b(oa_0.a(oa_0.b(oa_0.a(oa_0.a(), MG.k), MG.l), new T4[]{this.j, this.g, this.q, this.n, this.s, this.l, this.h, this.t}));
    }

    public void a(double d, double d2, double d3, double d4, double d5, double d6, Color color, double[] dArray, double d7, boolean bl) {
        this.a(d, d2, d3, d4, d5, d6, color, d7, dArray, bl);
    }

    public static boolean a() {
        aZK.c();
        return true;
    }
}

