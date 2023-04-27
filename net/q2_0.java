/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package net;

import cc.novoline.invoke.EntityRendererInvoker;
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
 * Renamed from net.q2
 */
public class q2_0 {
    private int c;
    private int d;
    public int i;
    public int f;
    Framebuffer h;
    public int j;
    Framebuffer k;
    private int e;
    public Color a;
    private HashMap<String, Integer> g;
    private Minecraft b;

    public void a() {
        this.k = this.a(this.k);
        this.h = this.a(this.h);
    }

    private void a(int n, int n2, int n3) {
        aY_.d(P8.b((Integer)ds_2.a(this.g, aeq_1.a)), 0);
        aY_.d(P8.b((Integer)ds_2.a(this.g, aeq_1.B)), 8);
        aY_.a(P8.b((Integer)ds_2.a(this.g, aeq_1.J)), 1.0f / (float)this.b.displayWidth, 1.0f / (float)this.b.displayHeight);
        aY_.a(P8.b((Integer)ds_2.a(this.g, aeq_1.C)), 3.0f);
        aY_.d(P8.b((Integer)ds_2.a(this.g, aeq_1.n)), 15);
        aY_.a(P8.b((Integer)ds_2.a(this.g, aeq_1.A)), (float)n, (float)n2, (float)n3);
    }

    public void a(Color color) {
        this.a = color;
    }

    public void b(Color color, int n, int n2) {
        GlStateManagerInvoker.enableBlend();
        GlStateManagerInvoker.b(770, 771);
        GL11.glDisable((int)3008);
        FramebufferInvoker.bindFramebuffer(this.h, false);
        OpenGlHelper.h(this.d);
        this.a(color, n, n2);
        ScaledResolution scaledResolution = new ScaledResolution(this.b);
        aY_.a(P8.b((Integer)ds_2.a(this.g, aeq_1.G)), 1.0f, 0.0f);
        this.a(this.k, scaledResolution);
        OpenGlHelper.a(apl_1.ab + 7);
        this.a(this.k, scaledResolution);
        OpenGlHelper.a(apl_1.S);
        FramebufferInvoker.bindFramebuffer(MCInvoker.c(this.b), true);
        aY_.a(P8.b((Integer)ds_2.a(this.g, aeq_1.j)), 0.0f, 1.0f);
        this.a(this.h, scaledResolution);
        OpenGlHelper.h(0);
        GlStateManagerInvoker.popMatrix();
        GlStateManagerInvoker.v();
        GL11.glEnable((int)3008);
        this.i = this.b.gameSettings.z;
        this.j = this.b.displayWidth;
        this.f = this.b.displayHeight;
    }

    public void b() {
        TimerUtil.e();
        GlStateManagerInvoker.pushMatrix();
        GlStateManagerInvoker.G();
        if (this.i != this.b.gameSettings.z || this.j != this.b.displayWidth || this.f != this.b.displayHeight) {
            this.a();
        }
        FramebufferInvoker.a(this.h);
        FramebufferInvoker.a(this.k);
        FramebufferInvoker.bindFramebuffer(this.k, false);
        EntityRendererInvoker.a(this.b.entityRenderer, this.b.timer.renderPartialTicks, 0);
        EntityRendererInvoker.b(this.b.entityRenderer);
    }

    public q2_0(boolean bl) {
        TimerUtil.e();
        this.b = MCInvoker.f();
        this.d = adk_2.a();
        this.g = new HashMap();
        this.a = Color.WHITE;
        this.e = this.a(aeq_1.b, 35633);
        this.c = this.a(aeq_1.u, 35632);
        this.c = this.a(aeq_1.c, 35632);
        OpenGlHelper.c(this.d, this.e);
        OpenGlHelper.c(this.d, this.c);
        OpenGlHelper.d(this.d);
        ds_2.a(this.g, aeq_1.F, P8.d(aY_.a(this.d, aeq_1.H)));
        ds_2.a(this.g, aeq_1.v, P8.d(aY_.a(this.d, aeq_1.y)));
        ds_2.a(this.g, aeq_1.l, P8.d(aY_.a(this.d, aeq_1.p)));
        ds_2.a(this.g, aeq_1.x, P8.d(aY_.a(this.d, aeq_1.i)));
        ds_2.a(this.g, aeq_1.L, P8.d(aY_.a(this.d, aeq_1.D)));
        ds_2.a(this.g, aeq_1.r, P8.d(aY_.a(this.d, aeq_1.z)));
        ds_2.a(this.g, aeq_1.o, P8.d(aY_.a(this.d, aeq_1.f)));
    }

    private void a(Framebuffer framebuffer, ScaledResolution scaledResolution) {
        GL11.glBindTexture((int)3553, (int)framebuffer.e);
        GL11.glBegin((int)7);
        GL11.glTexCoord2d((double)0.0, (double)1.0);
        GL11.glVertex2d((double)0.0, (double)0.0);
        GL11.glTexCoord2d((double)0.0, (double)0.0);
        GL11.glVertex2d((double)0.0, (double)ScaledResolutionInvoker.i(scaledResolution));
        GL11.glTexCoord2d((double)1.0, (double)0.0);
        GL11.glVertex2d((double)ScaledResolutionInvoker.getScaledWidth(scaledResolution), (double)ScaledResolutionInvoker.i(scaledResolution));
        GL11.glTexCoord2d((double)1.0, (double)1.0);
        GL11.glVertex2d((double)ScaledResolutionInvoker.getScaledWidth(scaledResolution), (double)0.0);
        GL11.glEnd();
    }

    public void a(Color color, int n, int n2, Consumer consumer, boolean bl) {
        TimerUtil.e();
        GlStateManagerInvoker.pushMatrix();
        GlStateManagerInvoker.G();
        if (this.i != this.b.gameSettings.z || this.j != this.b.displayWidth || this.f != this.b.displayHeight) {
            this.a();
        }
        FramebufferInvoker.a(this.h);
        FramebufferInvoker.a(this.k);
        FramebufferInvoker.bindFramebuffer(this.k, false);
        EntityRendererInvoker.a(this.b.entityRenderer, this.b.timer.renderPartialTicks, 0);
        EntityRendererInvoker.b(this.b.entityRenderer);
        aan_1.a(consumer, aeq_1.g);
        GlStateManagerInvoker.enableBlend();
        GlStateManagerInvoker.b(770, 771);
        GL11.glDisable((int)3008);
        FramebufferInvoker.bindFramebuffer(this.h, false);
        OpenGlHelper.h(this.d);
        this.a(color, n, n2);
        ScaledResolution scaledResolution = new ScaledResolution(this.b);
        aY_.a(P8.b((Integer)ds_2.a(this.g, aeq_1.q)), 1.0f, 0.0f);
        this.b(this.k, scaledResolution);
        OpenGlHelper.a(apl_1.ab + 7);
        this.b(this.k, scaledResolution);
        OpenGlHelper.a(apl_1.S);
        FramebufferInvoker.bindFramebuffer(MCInvoker.c(this.b), true);
        aY_.a(P8.b((Integer)ds_2.a(this.g, aeq_1.k)), 0.0f, 1.0f);
        this.b(this.h, scaledResolution);
        OpenGlHelper.h(0);
        GlStateManagerInvoker.popMatrix();
        GlStateManagerInvoker.v();
        GL11.glEnable((int)3008);
        this.i = this.b.gameSettings.z;
        this.j = this.b.displayWidth;
        this.f = this.b.displayHeight;
        aan_1.a(consumer, aeq_1.e);
    }

    private Framebuffer a(Framebuffer framebuffer) {
        TimerUtil.e();
        if (framebuffer != null) {
            FramebufferInvoker.f(framebuffer);
        }
        framebuffer = new Framebuffer(this.b.displayWidth, this.b.displayHeight, false);
        return framebuffer;
    }

    private int a(String string, int n) {
        int n2 = adk_2.d(n);
        adk_2.a(n2, string);
        adk_2.c(n2);
        return n2;
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

    public void a(Color color, int n, int n2) {
        aY_.d(P8.b((Integer)ds_2.a(this.g, aeq_1.m)), 0);
        aY_.d(P8.b((Integer)ds_2.a(this.g, aeq_1.E)), 8);
        aY_.a(P8.b((Integer)ds_2.a(this.g, aeq_1.w)), 1.0f / (float)this.b.displayWidth, 1.0f / (float)this.b.displayHeight);
        aY_.a(P8.b((Integer)ds_2.a(this.g, aeq_1.s)), 0.011764706f * (float)n);
        aY_.d(P8.b((Integer)ds_2.a(this.g, aeq_1.M)), n2);
        aY_.a(P8.b((Integer)ds_2.a(this.g, aeq_1.d)), (float)aol_1.c(color), (float)aol_1.g(color), (float)aol_1.f(color));
    }

    public void a(int n, int n2, Consumer consumer, boolean bl) {
        GlStateManagerInvoker.pushMatrix();
        TimerUtil.e();
        GlStateManagerInvoker.G();
        if (this.i != this.b.gameSettings.z || this.j != this.b.displayWidth || this.f != this.b.displayHeight) {
            this.a();
        }
        FramebufferInvoker.a(this.h);
        FramebufferInvoker.a(this.k);
        FramebufferInvoker.bindFramebuffer(this.k, false);
        EntityRendererInvoker.a(this.b.entityRenderer, this.b.timer.renderPartialTicks, 0);
        EntityRendererInvoker.b(this.b.entityRenderer);
        aan_1.a(consumer, aeq_1.t);
        GlStateManagerInvoker.enableBlend();
        GlStateManagerInvoker.b(770, 771);
        GL11.glDisable((int)3008);
        FramebufferInvoker.bindFramebuffer(this.h, false);
        OpenGlHelper.h(this.d);
        this.a(this.a, n, n2);
        ScaledResolution scaledResolution = new ScaledResolution(this.b);
        aY_.a(P8.b((Integer)ds_2.a(this.g, aeq_1.K)), 1.0f, 0.0f);
        this.a(this.k, scaledResolution);
        OpenGlHelper.a(apl_1.ab + 7);
        this.a(this.k, scaledResolution);
        OpenGlHelper.a(apl_1.S);
        FramebufferInvoker.bindFramebuffer(MCInvoker.c(this.b), true);
        aY_.a(P8.b((Integer)ds_2.a(this.g, aeq_1.I)), 0.0f, 1.0f);
        this.a(this.h, scaledResolution);
        OpenGlHelper.h(0);
        GlStateManagerInvoker.popMatrix();
        GlStateManagerInvoker.v();
        GL11.glEnable((int)3008);
        this.i = this.b.gameSettings.z;
        this.j = this.b.displayWidth;
        this.f = this.b.displayHeight;
        aan_1.a(consumer, aeq_1.h);
    }
}

