/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package net;

import cc.novoline.invoke.FramebufferInvoker;
import deobf.MCInvoker;
import deobf.OpenGlHelper;
import java.awt.Color;
import net.T4;
import net.a17;
import net.aGI;
import net.aii_1;
import net.aoh_1;
import net.aol_1;
import net.azw_0;
import net.oa_0;
import org.lwjgl.opengl.GL11;

public class aZY
extends azw_0 {
    private T4 n;
    private T4 m;
    private T4 l;
    private aGI i;
    private T4 p;
    private T4 o = new T4(aii_1.b);
    private T4 h;
    private T4 j = new T4(aii_1.d);
    private T4 k;
    private T4 a;
    private T4 g;

    public static aZY a() {
        return a17.a(a17.INSTANCE);
    }

    private void a(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, Color color, Color color2, double d9, boolean bl) {
        GL11.glAlphaFunc((int)516, (float)0.0f);
        GL11.glEnable((int)3042);
        GL11.glEnable((int)3008);
        OpenGlHelper.c(770, 771, 1, 0);
        oa_0.c(this.i);
        aoh_1.a(this.o, (float)aol_1.c(color) / 255.0f, (float)aol_1.g(color) / 255.0f, (float)aol_1.f(color) / 255.0f, (float)aol_1.e(color) / 255.0f);
        aoh_1.a(this.j, (float)aol_1.c(color2) / 255.0f, (float)aol_1.g(color2) / 255.0f, (float)aol_1.f(color2) / 255.0f, (float)aol_1.e(color2) / 255.0f);
        aoh_1.a(this.n, (float)d8);
        aoh_1.a(this.l, (float)d7);
        aoh_1.a(this.h, this.f.displayWidth, this.f.displayHeight);
        aoh_1.a(this.m, (float)d3, (float)d4);
        aoh_1.a(this.p, (float)(d - d3 / 2.0 * (d9 - 1.0)), (float)(d2 - d4 / 2.0 * (d9 - 1.0)));
        aoh_1.a(this.g, (float)(d5 * d9));
        aoh_1.a(this.k, (float)d9);
        aoh_1.a(this.a, (float)d6);
        FramebufferInvoker.bindFramebuffer(MCInvoker.c(this.f), false);
        oa_0.b(this.i, MCInvoker.c(this.f));
        oa_0.a(this.i);
        GL11.glAlphaFunc((int)516, (float)0.1f);
    }

    public void a(double d, double d2, double d3, double d4, double d5, double d6, double d7, Color color, Color color2, boolean bl) {
        this.a(d, d2, d3, d4, 0.0, d5, d6, d7, color, color2, 1.0, bl);
    }

    public void a(double d, double d2, double d3, double d4, double d5, double d6, Color color, Color color2, double d7, boolean bl) {
        this.a(d - d3 * 0.5, d2 - d3 * 0.5, d3, d3, d3, d4, d5, d6, color, color2, d7, bl);
    }

    public void a(double d, double d2, double d3, double d4, double d5, double d6, double d7, Color color, Color color2, double d8, boolean bl) {
        this.a(d, d2, d3, d4, 0.0, d5, d6, d7, color, color2, d8, bl);
    }

    public aZY() {
        this.n = new T4(aii_1.a);
        this.l = new T4(aii_1.h);
        this.h = new T4(aii_1.f);
        this.m = new T4(aii_1.g);
        this.p = new T4(aii_1.c);
        this.g = new T4(aii_1.j);
        this.k = new T4(aii_1.k);
        this.a = new T4(aii_1.i);
        this.i = oa_0.b(oa_0.a(oa_0.b(oa_0.a(oa_0.a(), aii_1.l), aii_1.e), new T4[]{this.o, this.j, this.n, this.l, this.a, this.h, this.m, this.p, this.g, this.k}));
    }

    public void b(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, Color color, Color color2, double d9, boolean bl) {
        this.a(d, d2, d3, d4, d5, d6, d7, d8, color, color2, d9, bl);
    }

    public void a(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, Color color, Color color2, boolean bl) {
        this.a(d, d2, d3, d4, d5, d6, d7, d8, color, color2, 1.0, bl);
    }

    public void a(double d, double d2, double d3, double d4, double d5, double d6, Color color, Color color2, boolean bl) {
        this.a(d - d3 * 0.5, d2 - d3 * 0.5, d3, d3, d3, d4, d5, d6, color, color2, 1.0, bl);
    }
}

