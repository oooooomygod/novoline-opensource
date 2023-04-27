/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package net;

import cc.novoline.invoke.FramebufferInvoker;
import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.ScaledResolutionInvoker;
import deobf.Framebuffer;
import deobf.MCInvoker;
import deobf.OpenGlHelper;
import deobf.TimerUtil;
import java.awt.Color;
import java.util.HashMap;
import java.util.function.Consumer;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

/*
 * Renamed from net.aSb
 */
public class asb_0 {
    public int c;
    public int g;
    private HashMap<String, Integer> i;
    private Minecraft d;
    private Framebuffer h;
    Framebuffer b;
    private int f;
    Framebuffer e;
    private int j;
    private int k;
    public int a;

    private void a(Framebuffer framebuffer, ScaledResolution scaledResolution) {
        GL11.glBindTexture((int)3553, (int)framebuffer.e);
        GL11.glBegin((int)7);
        GL11.glTexCoord2d((double)0.0, (double)1.0);
        GL11.glVertex2d((double)0.0, (double)0.0);
        GL11.glTexCoord2d((double)0.0, (double)0.0);
        GL11.glVertex2d((double)0.0, (double)ScaledResolutionInvoker.d(scaledResolution));
        GL11.glTexCoord2d((double)1.0, (double)0.0);
        GL11.glVertex2d((double)ScaledResolutionInvoker.e(scaledResolution), (double)ScaledResolutionInvoker.d(scaledResolution));
        GL11.glTexCoord2d((double)1.0, (double)1.0);
        GL11.glVertex2d((double)ScaledResolutionInvoker.e(scaledResolution), (double)0.0);
        GL11.glEnd();
    }

    public void b(Color color, int n, int n2, Consumer consumer, boolean bl) {
        TimerUtil.e();
        GlStateManagerInvoker.pushMatrix();
        GlStateManagerInvoker.G();
        GlStateManagerInvoker.enableAlpha();
        if (this.c != this.d.gameSettings.z || this.g != this.d.displayWidth || this.a != this.d.displayHeight) {
            this.a();
        }
        FramebufferInvoker.a(this.e);
        FramebufferInvoker.a(this.b);
        FramebufferInvoker.bindFramebuffer(this.b, false);
        aan_1.a(consumer, ajA.g);
        GlStateManagerInvoker.enableBlend();
        GlStateManagerInvoker.b(770, 771);
        GL11.glDisable((int)3008);
        FramebufferInvoker.bindFramebuffer(this.e, false);
        ScaledResolution scaledResolution = new ScaledResolution(this.d);
        OpenGlHelper.h(this.j);
        this.a(color, n, n2);
        aY_.a(P8.b((Integer)ds_2.a(this.i, ajA.r)), 1.0f, 0.0f);
        this.b(this.b, scaledResolution);
        OpenGlHelper.a(apl_1.ab + 7);
        this.b(this.b, scaledResolution);
        OpenGlHelper.a(apl_1.S);
        FramebufferInvoker.bindFramebuffer(MCInvoker.c(this.d), true);
        aY_.a(P8.b((Integer)ds_2.a(this.i, ajA.B)), 0.0f, 1.0f);
        this.b(this.e, scaledResolution);
        OpenGlHelper.h(0);
        GlStateManagerInvoker.disableBlend();
        GlStateManagerInvoker.popMatrix();
        GlStateManagerInvoker.v();
        GL11.glEnable((int)3008);
        this.c = this.d.gameSettings.z;
        this.g = this.d.displayWidth;
        this.a = this.d.displayHeight;
        aan_1.a(consumer, ajA.L);
    }

    public asb_0(boolean bl) {
        TimerUtil.e();
        this.d = MCInvoker.f();
        this.j = adk_2.a();
        this.i = new HashMap();
        this.f = this.a(ajA.f, 35633);
        this.k = this.a(ajA.t, 35632);
        this.k = this.a(ajA.w, 35632);
        OpenGlHelper.c(this.j, this.f);
        OpenGlHelper.c(this.j, this.k);
        OpenGlHelper.d(this.j);
        ds_2.a(this.i, ajA.h, P8.d(aY_.a(this.j, ajA.d)));
        ds_2.a(this.i, ajA.p, P8.d(aY_.a(this.j, ajA.C)));
        ds_2.a(this.i, ajA.K, P8.d(aY_.a(this.j, ajA.k)));
        ds_2.a(this.i, ajA.Q, P8.d(aY_.a(this.j, ajA.m)));
        ds_2.a(this.i, ajA.x, P8.d(aY_.a(this.j, ajA.J)));
        ds_2.a(this.i, ajA.v, P8.d(aY_.a(this.j, ajA.D)));
        ds_2.a(this.i, ajA.o, P8.d(aY_.a(this.j, ajA.s)));
    }

    public void a(Color color, int n, int n2) {
        aY_.d(P8.b((Integer)ds_2.a(this.i, ajA.A)), 0);
        aY_.d(P8.b((Integer)ds_2.a(this.i, ajA.M)), 8);
        aY_.a(P8.b((Integer)ds_2.a(this.i, ajA.n)), 1.0f / (float)this.d.displayWidth, 1.0f / (float)this.d.displayHeight);
        aY_.a(P8.b((Integer)ds_2.a(this.i, ajA.H)), 0.011764706f * (float)n);
        aY_.d(P8.b((Integer)ds_2.a(this.i, ajA.q)), n2);
        aY_.a(P8.b((Integer)ds_2.a(this.i, ajA.l)), (float)aol_1.c(color), (float)aol_1.g(color), (float)aol_1.f(color));
    }

    public Framebuffer a(Color color, int n, int n2, Consumer consumer) {
        TimerUtil.e();
        GlStateManagerInvoker.pushMatrix();
        GlStateManagerInvoker.G();
        GlStateManagerInvoker.enableAlpha();
        if (this.c != this.d.gameSettings.z || this.g != this.d.displayWidth || this.a != this.d.displayHeight) {
            this.a();
            this.h = this.a(this.h);
        }
        FramebufferInvoker.a(this.e);
        FramebufferInvoker.a(this.b);
        FramebufferInvoker.bindFramebuffer(this.b, false);
        aan_1.a(consumer, ajA.F);
        GL11.glDisable((int)3008);
        FramebufferInvoker.bindFramebuffer(this.e, false);
        ScaledResolution scaledResolution = new ScaledResolution(this.d);
        OpenGlHelper.h(this.j);
        this.a(color, n, n2);
        aY_.a(P8.b((Integer)ds_2.a(this.i, ajA.G)), 1.0f, 0.0f);
        this.a(this.b, scaledResolution);
        OpenGlHelper.a(apl_1.ab + 7);
        this.a(this.b, scaledResolution);
        OpenGlHelper.a(apl_1.S);
        FramebufferInvoker.a(this.h);
        FramebufferInvoker.bindFramebuffer(this.h, false);
        aY_.a(P8.b((Integer)ds_2.a(this.i, ajA.i)), 0.0f, 1.0f);
        this.a(this.e, scaledResolution);
        OpenGlHelper.h(0);
        GlStateManagerInvoker.popMatrix();
        GlStateManagerInvoker.v();
        GL11.glEnable((int)3008);
        this.c = this.d.gameSettings.z;
        this.g = this.d.displayWidth;
        this.a = this.d.displayHeight;
        return this.h;
    }

    private Framebuffer a(Framebuffer framebuffer) {
        TimerUtil.e();
        if (framebuffer != null) {
            FramebufferInvoker.f(framebuffer);
        }
        framebuffer = new Framebuffer(this.d.displayWidth, this.d.displayHeight, false);
        return framebuffer;
    }

    public void a() {
        this.b = this.a(this.b);
        this.e = this.a(this.e);
    }

    private int a(String string, int n) {
        int n2 = adk_2.d(n);
        adk_2.a(n2, string);
        adk_2.c(n2);
        return n2;
    }

    public void a(Color color, int n, int n2, Consumer consumer, boolean bl) {
        TimerUtil.e();
        GlStateManagerInvoker.pushMatrix();
        GlStateManagerInvoker.G();
        GlStateManagerInvoker.enableAlpha();
        if (this.c != this.d.gameSettings.z || this.g != this.d.displayWidth || this.a != this.d.displayHeight) {
            this.a();
        }
        FramebufferInvoker.a(this.e);
        FramebufferInvoker.a(this.b);
        FramebufferInvoker.bindFramebuffer(this.b, false);
        aan_1.a(consumer, ajA.E);
        GlStateManagerInvoker.enableBlend();
        GlStateManagerInvoker.b(770, 771);
        GL11.glDisable((int)3008);
        FramebufferInvoker.bindFramebuffer(this.e, false);
        ScaledResolution scaledResolution = new ScaledResolution(this.d);
        OpenGlHelper.h(this.j);
        this.a(color, n, n2);
        aY_.a(P8.b((Integer)ds_2.a(this.i, ajA.O)), 1.0f, 0.0f);
        this.a(this.b, scaledResolution);
        OpenGlHelper.a(apl_1.ab + 7);
        this.a(this.b, scaledResolution);
        OpenGlHelper.a(apl_1.S);
        FramebufferInvoker.bindFramebuffer(MCInvoker.c(this.d), true);
        aY_.a(P8.b((Integer)ds_2.a(this.i, ajA.j)), 0.0f, 1.0f);
        this.a(this.e, scaledResolution);
        OpenGlHelper.h(0);
        GlStateManagerInvoker.disableBlend();
        GlStateManagerInvoker.popMatrix();
        GlStateManagerInvoker.v();
        GL11.glEnable((int)3008);
        this.c = this.d.gameSettings.z;
        this.g = this.d.displayWidth;
        this.a = this.d.displayHeight;
        aan_1.a(consumer, ajA.N);
    }

    private void b(Framebuffer framebuffer, ScaledResolution scaledResolution) {
        GL11.glBindTexture((int)3553, (int)framebuffer.e);
        GL11.glBegin((int)7);
        GL11.glTexCoord2d((double)0.0, (double)1.0);
        GL11.glVertex2d((double)0.0, (double)0.0);
        GL11.glTexCoord2d((double)0.0, (double)0.0);
        GL11.glVertex2d((double)0.0, (double)ScaledResolutionInvoker.c(scaledResolution));
        GL11.glTexCoord2d((double)1.0, (double)0.0);
        GL11.glVertex2d((double)ScaledResolutionInvoker.f(scaledResolution), (double)ScaledResolutionInvoker.c(scaledResolution));
        GL11.glTexCoord2d((double)1.0, (double)1.0);
        GL11.glVertex2d((double)ScaledResolutionInvoker.f(scaledResolution), (double)0.0);
        GL11.glEnd();
    }

    private void a(int n, int n2, int n3) {
        aY_.d(P8.b((Integer)ds_2.a(this.i, ajA.I)), 0);
        aY_.d(P8.b((Integer)ds_2.a(this.i, ajA.b)), 8);
        aY_.a(P8.b((Integer)ds_2.a(this.i, ajA.c)), 1.0f / (float)this.d.displayWidth, 1.0f / (float)this.d.displayHeight);
        aY_.a(P8.b((Integer)ds_2.a(this.i, ajA.P)), 3.0f);
        aY_.d(P8.b((Integer)ds_2.a(this.i, ajA.u)), 15);
        aY_.a(P8.b((Integer)ds_2.a(this.i, ajA.y)), (float)n, (float)n2, (float)n3);
    }

    public Framebuffer b(Color color, int n, int n2, Consumer consumer) {
        GlStateManagerInvoker.pushMatrix();
        TimerUtil.e();
        GlStateManagerInvoker.G();
        GlStateManagerInvoker.enableAlpha();
        if (this.c != this.d.gameSettings.z || this.g != this.d.displayWidth || this.a != this.d.displayHeight) {
            this.a();
            this.h = this.a(this.h);
        }
        FramebufferInvoker.a(this.e);
        FramebufferInvoker.a(this.b);
        FramebufferInvoker.bindFramebuffer(this.b, false);
        aan_1.a(consumer, ajA.a);
        GL11.glDisable((int)3008);
        FramebufferInvoker.bindFramebuffer(this.e, false);
        ScaledResolution scaledResolution = new ScaledResolution(this.d);
        OpenGlHelper.h(this.j);
        this.a(color, n, n2);
        aY_.a(P8.b((Integer)ds_2.a(this.i, ajA.z)), 1.0f, 0.0f);
        this.b(this.b, scaledResolution);
        OpenGlHelper.a(apl_1.ab + 7);
        this.b(this.b, scaledResolution);
        OpenGlHelper.a(apl_1.S);
        FramebufferInvoker.a(this.h);
        FramebufferInvoker.bindFramebuffer(this.h, false);
        aY_.a(P8.b((Integer)ds_2.a(this.i, ajA.e)), 0.0f, 1.0f);
        this.b(this.e, scaledResolution);
        OpenGlHelper.h(0);
        GlStateManagerInvoker.popMatrix();
        GlStateManagerInvoker.v();
        GL11.glEnable((int)3008);
        this.c = this.d.gameSettings.z;
        this.g = this.d.displayWidth;
        this.a = this.d.displayHeight;
        return this.h;
    }
}

