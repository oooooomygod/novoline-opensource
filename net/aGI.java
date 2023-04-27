/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package net;

import cc.novoline.invoke.FramebufferInvoker;
import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.ScaledResolutionInvoker;
import deobf.Framebuffer;
import deobf.MCInvoker;
import deobf.OpenGlHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.ScaledResolution;
import net.T4;
import net.a7r_0;
import net.aY_;
import net.adk_2;
import net.aoh_1;
import net.azw_0;
import net.dz_0;
import org.lwjgl.opengl.GL11;

public class aGI {
    private int b;
    private int c;
    private int d = adk_2.a();
    private List<T4> a = new ArrayList<T4>();

    public aGI b(String string) {
        this.b = this.a(string, 35632);
        return this;
    }

    public void a(Framebuffer framebuffer) {
        ScaledResolution scaledResolution = new ScaledResolution(MCInvoker.f());
        double d = ScaledResolutionInvoker.e(scaledResolution);
        azw_0.b();
        double d2 = ScaledResolutionInvoker.d(scaledResolution);
        GlStateManagerInvoker.enableTexture2D();
        GlStateManagerInvoker.enableAlpha();
        GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
        FramebufferInvoker.e(framebuffer);
        double d3 = (double)framebuffer.g / (double)framebuffer.i;
        double d4 = (double)framebuffer.d / (double)framebuffer.c;
        GL11.glBegin((int)7);
        GL11.glTexCoord2d((double)0.0, (double)0.0);
        GL11.glVertex2d((double)0.0, (double)d2);
        GL11.glTexCoord2d((double)d3, (double)0.0);
        GL11.glVertex2d((double)d, (double)d2);
        GL11.glTexCoord2d((double)d3, (double)d4);
        GL11.glVertex2d((double)d, (double)0.0);
        GL11.glTexCoord2d((double)0.0, (double)d4);
        GL11.glVertex2d((double)0.0, (double)0.0);
        GL11.glEnd();
        FramebufferInvoker.b(framebuffer);
        if (ListInvoker.b() != null) {
            azw_0.b(new ListInvoker[4]);
        }
    }

    private int a(String string, int n) {
        int n2 = adk_2.d(n);
        adk_2.a(n2, string);
        adk_2.c(n2);
        return n2;
    }

    public void b() {
        aY_.b(this.d);
    }

    public void b(Framebuffer framebuffer) {
        ScaledResolution scaledResolution = new ScaledResolution(MCInvoker.f());
        double d = ScaledResolutionInvoker.f(scaledResolution);
        double d2 = ScaledResolutionInvoker.c(scaledResolution);
        GlStateManagerInvoker.enableTexture2D();
        GlStateManagerInvoker.enableAlpha();
        GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
        FramebufferInvoker.e(framebuffer);
        double d3 = (double)framebuffer.g / (double)framebuffer.i;
        double d4 = (double)framebuffer.d / (double)framebuffer.c;
        azw_0.b();
        GL11.glBegin((int)7);
        GL11.glTexCoord2d((double)0.0, (double)0.0);
        GL11.glVertex2d((double)0.0, (double)d2);
        GL11.glTexCoord2d((double)d3, (double)0.0);
        GL11.glVertex2d((double)d, (double)d2);
        GL11.glTexCoord2d((double)d3, (double)d4);
        GL11.glVertex2d((double)d, (double)0.0);
        GL11.glTexCoord2d((double)0.0, (double)d4);
        GL11.glVertex2d((double)0.0, (double)0.0);
        GL11.glEnd();
        FramebufferInvoker.b(framebuffer);
        ListInvoker.b(new ListInvoker[5]);
    }

    public aGI a(String string) {
        this.c = this.a(string, 35633);
        return this;
    }

    public aGI a(T4 ... t4Array) {
        ListInvoker.addAll(this.a, a7r_0.a(t4Array));
        return this;
    }

    public static aGI e() {
        return new aGI();
    }

    public aGI d() {
        OpenGlHelper.c(this.d, this.c);
        OpenGlHelper.c(this.d, this.b);
        OpenGlHelper.d(this.d);
        Iterator iterator = ListInvoker.iterator(this.a);
        while (dz_0.c(iterator)) {
            T4 t4 = (T4)dz_0.b(iterator);
            aoh_1.b(t4, aY_.a(this.d, t4.a));
        }
        return this;
    }

    public void c() {
        aY_.b(0);
    }

    public int a() {
        return this.d;
    }
}

