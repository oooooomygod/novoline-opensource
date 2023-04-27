/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.OpenGLException
 */
package net;

import cc.novoline.invoke.FramebufferInvoker;
import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.ModuleInvoker;
import cc.novoline.invoke.ScaledResolutionInvoker;
import cc.novoline.modules.visual.ClickGui;
import deobf.Framebuffer;
import deobf.MCInvoker;
import deobf.ModuleRegistry;
import deobf.OpenGlHelper;
import deobf.TimerUtil;
import java.awt.Color;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.OpenGLException;

/*
 * Renamed from net.aUh
 */
public class auh_0 {
    private static Object f;
    private static boolean a;
    private static int b;
    private static Framebuffer g;
    private static int d;
    private static Minecraft e;
    private static aGC c;

    private auh_0() {
        throw new UnsupportedOperationException(aPT.c);
    }

    public static void b(float f, float f2, float f3, float f4, boolean bl) {
        TimerUtil.e();
        int n = auh_0.e.gameSettings.z;
        if (n == 1) {
            auh_0.a(f * 0.5f, f2 * 0.5f, f3 * 0.5f, f4 * 0.5f, bl);
        }
        if (n == 2) {
            auh_0.a(f, f2, f3, f4, bl);
        }
        if (n == 3) {
            auh_0.a(f * 1.5f, f2 * 1.5f, f3 * 1.5f, f4 * 1.5f, bl);
        }
    }

    public static void b(boolean bl) {
        a = bl;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void a() {
        TimerUtil.e();
        if (c != null && auh_0.e.displayWidth == d && auh_0.e.displayHeight == b) {
            return;
        }
        Object object = f;
        synchronized (object) {
            g = new Framebuffer(auh_0.e.displayWidth, auh_0.e.displayHeight, false);
            FramebufferInvoker.setFramebufferColor(g, 0.0f, 0.0f, 0.0f, 0.0f);
            if (!OpenGlHelper.g()) {
                throw new OpenGLException(aPT.b);
            }
            try {
                c = new aGC(MCInvoker.E(e), MCInvoker.x(e), g, new ResourceLocation(aPT.d));
                ada_2.a(c, auh_0.e.displayWidth, auh_0.e.displayHeight);
                d = auh_0.e.displayWidth;
                b = auh_0.e.displayHeight;
            }
            catch (Exception exception) {
                throw new OpenGLException(aPT.a);
            }
            return;
        }
    }

    public static boolean b() {
        return a;
    }

    static {
        e = MCInvoker.f();
        f = new Object();
    }

    public static int a(Color color, Color color2, float f) {
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

    public static void a(float f, float f2, float f3, float f4) {
        f3 -= f;
        f4 -= f2;
        ClickGui clickGui = (ClickGui)ModuleInvoker.isEnable(ModuleRegistry.CLICKGUI);
        ScaledResolution scaledResolution = new ScaledResolution(e);
        TimerUtil.e();
        double d = z4_0.q(clickGui);
        double d2 = 1.0;
        if (auh_0.e.gameSettings.z == 1) {
            d2 = 2.0;
        }
        if (auh_0.e.gameSettings.z == 3) {
            d2 = 0.6666666666666667;
        }
        f = (float)((double)f * (d2 *= d));
        f2 = (float)((double)f2 * d2);
        f3 = (float)((double)f3 * d2);
        f4 = (float)((double)f4 * d2);
        int n = ScaledResolutionInvoker.getScaleFactor(scaledResolution);
        int n2 = (int)(f * (float)n);
        int n3 = (int)((float)auh_0.e.displayHeight - f2 * (float)n - f4 * (float)n);
        int n4 = (int)(f3 * (float)n);
        int n5 = (int)(f4 * (float)n);
        GL11.glScissor((int)n2, (int)n3, (int)n4, (int)n5);
    }

    public static void a(boolean bl) {
        TimerUtil.e();
        FramebufferInvoker.unbindFramebuffer(MCInvoker.c(e));
        FramebufferInvoker.bindFramebuffer(g, true);
        FramebufferInvoker.a(MCInvoker.c(e), auh_0.e.displayWidth, auh_0.e.displayHeight, true);
        if (apl_1.u && c != null) {
            GlStateManagerInvoker.matrixMode(5890);
            GlStateManagerInvoker.pushMatrix();
            GlStateManagerInvoker.loadIdentity();
            ada_2.a(c, auh_0.e.timer.renderPartialTicks);
            GlStateManagerInvoker.popMatrix();
        }
        FramebufferInvoker.unbindFramebuffer(g);
        FramebufferInvoker.bindFramebuffer(MCInvoker.c(e), true);
        if (bl) {
            ScaledResolution scaledResolution = new ScaledResolution(e);
            GlStateManagerInvoker.clear(256);
            GlStateManagerInvoker.matrixMode(5889);
            GlStateManagerInvoker.loadIdentity();
            GlStateManagerInvoker.ortho(0.0, ScaledResolutionInvoker.e(scaledResolution), ScaledResolutionInvoker.d(scaledResolution), 0.0, 1000.0, 3000.0);
            GlStateManagerInvoker.matrixMode(5888);
            GlStateManagerInvoker.loadIdentity();
            GlStateManagerInvoker.translate(0.0f, 0.0f, -2000.0f);
        }
    }

    public static void a(double d, double d2, double d3, double d4) {
        ScaledResolution scaledResolution = new ScaledResolution(e);
        int n = ScaledResolutionInvoker.getScaleFactor(scaledResolution);
        GL11.glScissor((int)((int)(d *= (double)n)), (int)((int)((double)auh_0.e.displayHeight - (d2 *= (double)n) - (d4 *= (double)n))), (int)((int)(d3 *= (double)n)), (int)((int)d4));
    }

    public static void b(float f, float f2, float f3, float f4) {
        ScaledResolution scaledResolution = new ScaledResolution(e);
        int n = ScaledResolutionInvoker.getScaleFactor(scaledResolution);
        GL11.glScissor((int)((int)(f *= (float)n)), (int)((int)((float)auh_0.e.displayHeight - (f2 *= (float)n) - (f4 *= (float)n))), (int)((int)(f3 *= (float)n)), (int)((int)f4));
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public static void a(float f, float f2, float f3, float f4, double d) {
        f3 -= f;
        TimerUtil.e();
        f4 -= f2;
        ScaledResolution scaledResolution = new ScaledResolution(e);
        double d2 = 1.0;
        if (auh_0.e.gameSettings.z == 1) {
            d2 = 2.0;
        }
        if (auh_0.e.gameSettings.z == 3) {
            d2 = 0.6666666666666667;
        }
        f = (float)((double)f * (d2 *= d));
        f2 = (float)((double)f2 * d2);
        f3 = (float)((double)f3 * d2);
        f4 = (float)((double)f4 * d2);
        int n = ScaledResolutionInvoker.getScaleFactor(scaledResolution);
        int n2 = (int)(f * (float)n);
        int n3 = (int)((float)auh_0.e.displayHeight - f2 * (float)n - f4 * (float)n);
        int n4 = (int)(f3 * (float)n);
        int n5 = (int)(f4 * (float)n);
        GL11.glScissor((int)n2, (int)n3, (int)n4, (int)n5);
    }

    public static void a(float f, float f2, float f3, float f4, boolean bl) {
        TimerUtil.e();
        GL11.glEnable((int)3089);
        auh_0.a(f, f2, f3, f4);
        GL11.glPushMatrix();
        FramebufferInvoker.a(g, MCInvoker.f().displayWidth, MCInvoker.f().displayHeight, true);
        GL11.glPopMatrix();
        if (bl) {
            ScaledResolution scaledResolution = new ScaledResolution(e);
            GlStateManagerInvoker.clear(256);
            GlStateManagerInvoker.matrixMode(5889);
            GlStateManagerInvoker.loadIdentity();
            GlStateManagerInvoker.ortho(0.0, ScaledResolutionInvoker.e(scaledResolution), ScaledResolutionInvoker.d(scaledResolution), 0.0, 1000.0, 3000.0);
            GlStateManagerInvoker.matrixMode(5888);
            GlStateManagerInvoker.loadIdentity();
            GlStateManagerInvoker.translate(0.0f, 0.0f, -2000.0f);
        }
        GlStateManagerInvoker.enableDepth();
        GL11.glDisable((int)3089);
    }
}

