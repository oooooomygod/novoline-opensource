/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package net;

import cc.novoline.invoke.DisplayInvoker;
import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.ModuleInvoker;
import cc.novoline.invoke.ScaledResolutionInvoker;
import cc.novoline.utils.fonts.api.FontRenderer;
import cc.novoline.modules.visual.HUD;
import deobf.MCInvoker;
import deobf.ModuleRegistry;
import java.awt.Color;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

/*
 * Renamed from net.lJ
 */
public class lj_1 {
    private int e;
    private int b;
    private int d;
    private String a;
    private transient double[] c = new double[]{0.0, 0.0, 0.0};

    public static lj_1 a(String string, int n, int n2, int n3) {
        asl_0.a(string, a8z_0.o);
        return new lj_1(string, n, n2, n3);
    }

    public int f() {
        return this.d;
    }

    public int c() {
        return this.e;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean g() {
        Minecraft minecraft = MCInvoker.f();
        HUD.j();
        float f = ae4_0.c(this.e(), this.c(), this.f())[0];
        float f2 = ae4_0.c(this.e(), this.c(), this.f())[1];
        float f3 = (awu_1.f(minecraft.gameSettings) == 0 ? MCInvoker.v((Minecraft)minecraft).rotationYaw : MCInvoker.v((Minecraft)minecraft).ad) + (float)(awu_1.f(minecraft.gameSettings) == 2 ? 180 : 0);
        if (!(ae4_0.b(f, ae4_0.b(f3)) < 90.0f)) return false;
        float f4 = awu_1.f(minecraft.gameSettings) == 0 ? minecraft.player.rotationPitch : minecraft.player.K;
        if (!(ae4_0.b(f2, f4) < 90.0f)) return false;
        return true;
    }

    public void a() {
        ScaledResolution scaledResolution = new ScaledResolution(MCInvoker.f());
        HUD.t();
        FontRenderer fontRenderer = aPc.a;
        if (this.g()) {
            GL11.glPushMatrix();
            GL11.glTranslated((double)(this.c[0] / (double)ScaledResolutionInvoker.getScaleFactor(scaledResolution)), (double)(this.c[1] / (double)ScaledResolutionInvoker.getScaleFactor(scaledResolution)), (double)(this.c[2] / (double)ScaledResolutionInvoker.getScaleFactor(scaledResolution)));
            ua_2.a(true);
            float f = 1.0f;
            switch (MCInvoker.f().gameSettings.z) {
                case 0: {
                    f = 0.5f;
                }
                case 1: {
                    f = 2.0f;
                }
                case 3: {
                    f = 0.6666667f;
                }
            }
            float f2 = (float)ScaledResolutionInvoker.getScaledWidth(scaledResolution) / 2.0f;
            float f3 = (float)ScaledResolutionInvoker.i(scaledResolution) / 2.0f;
            float f4 = (float)a7l_0.a(fontRenderer, aL0.a(aL0.c(aL0.a(aL0.a(new StringBuilder(), this.a), a8z_0.m), this.b()), a8z_0.g).toString()) / 2.0f;
            float f5 = 11.25f;
            float cfr_ignored_0 = f2 / f + f4;
            float cfr_ignored_1 = f2 / f - f4;
            float cfr_ignored_2 = f3 / f - f5;
            float cfr_ignored_3 = f3 / f + f5;
            GlStateManagerInvoker.a(0.0, -2.5, 0.0);
            GlStateManagerInvoker.disableDepth();
            a1V.c(-(a7l_0.a(fontRenderer, aL0.a(aL0.c(aL0.a(aL0.a(new StringBuilder(), this.a), a8z_0.b), this.b()), a8z_0.h).toString()) / 2) - 2, -5.0f, a7l_0.a(fontRenderer, aL0.a(aL0.c(aL0.a(aL0.a(new StringBuilder(), this.a), a8z_0.d), this.b()), a8z_0.i).toString()) / 2 + 2, 10.0f, aol_1.b(new Color(0, 0, 0, 100)));
            HUD hUD = (HUD)ModuleInvoker.isEnable(ModuleRegistry.HUD);
            a1V.c(-(a7l_0.a(fontRenderer, aL0.a(aL0.c(aL0.a(aL0.a(new StringBuilder(), this.a), a8z_0.f), this.b()), a8z_0.a).toString()) / 2) - 2, -6.0f, a7l_0.a(fontRenderer, aL0.a(aL0.c(aL0.a(aL0.a(new StringBuilder(), this.a), a8z_0.n), this.b()), a8z_0.j).toString()) / 2 + 2, -5.0f, P8.b(aUL.f(cw_2.k(hUD))));
            a7l_0.a(fontRenderer, (CharSequence)aL0.a(aL0.c(aL0.a(aL0.a(aL0.a(new StringBuilder(), this.a), a8z_0.e), (Object)anw_0.GRAY), this.b()), a8z_0.k).toString(), -((float)a7l_0.a(fontRenderer, aL0.a(aL0.c(aL0.a(aL0.a(new StringBuilder(), this.a), a8z_0.c), this.b()), a8z_0.l).toString()) / 2.0f), 0.0f, -1);
            GlStateManagerInvoker.enableDepth();
            GL11.glPopMatrix();
        }
    }

    public int b() {
        int n = (int)MathInvoker.a(MCInvoker.f().player.posX - (double)this.e());
        int n2 = (int)MathInvoker.a(MCInvoker.f().player.posY - (double)this.f());
        int n3 = (int)MathInvoker.a(MCInvoker.f().player.posZ - (double)this.c());
        return (int)MathInvoker.d(n * n + n2 * n2 + n3 * n3);
    }

    public lj_1(String string, int n, int n2, int n3) {
        this.a = string;
        this.b = n;
        this.d = n2;
        this.e = n3;
    }

    public String d() {
        return this.a;
    }

    public void a(double[] dArray) {
        this.c = dArray;
    }

    public double[] a(double d, double d2, double d3) {
        double[] dArray;
        FloatBuffer floatBuffer = a9w_0.a(3);
        FloatBuffer floatBuffer2 = a9w_0.a(16);
        HUD.j();
        FloatBuffer floatBuffer3 = a9w_0.a(16);
        IntBuffer intBuffer = a9w_0.b(16);
        GL11.glGetFloat((int)2982, (FloatBuffer)floatBuffer2);
        GL11.glGetFloat((int)2983, (FloatBuffer)floatBuffer3);
        GL11.glGetInteger((int)2978, (IntBuffer)intBuffer);
        boolean bl = afs_2.a((float)d, (float)d2, (float)d3, floatBuffer2, floatBuffer3, intBuffer, floatBuffer);
        if (bl) {
            double[] dArray2 = new double[3];
            dArray2[0] = aHB.b(floatBuffer, 0);
            dArray2[1] = (float)DisplayInvoker.getHeight() - aHB.b(floatBuffer, 1);
            dArray = dArray2;
            dArray2[2] = aHB.b(floatBuffer, 2);
        } else {
            dArray = null;
        }
        return dArray;
    }

    public int e() {
        return this.b;
    }
}

