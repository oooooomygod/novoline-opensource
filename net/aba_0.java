/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import deobf.Vec3;
import java.nio.FloatBuffer;
import net.N4;
import net.aHB;
import net.aNE;
import net.rm_2;
import org.lwjgl.opengl.GL11;

/*
 * Renamed from net.aBa
 */
public class aba_0 {
    private static Vec3 b;
    private static Vec3 c;
    private static FloatBuffer a;

    public static void b() {
        GlStateManagerInvoker.D();
        GlStateManagerInvoker.j(0);
        GlStateManagerInvoker.j(1);
        GlStateManagerInvoker.enableColorMaterial();
        GlStateManagerInvoker.a(1032, 5634);
        float f = 0.4f;
        float f2 = 0.6f;
        float f3 = 0.0f;
        float f4 = 1.0f;
        GL11.glLight((int)16384, (int)4611, (FloatBuffer)aba_0.a(aba_0.c.xCoord, aba_0.c.yCoord, aba_0.c.zCoord, 0.0));
        GL11.glLight((int)16384, (int)4609, (FloatBuffer)aba_0.a(f2, f2, f2, f4));
        GL11.glLight((int)16384, (int)4608, (FloatBuffer)aba_0.a(0.0f, 0.0f, 0.0f, f4));
        GL11.glLight((int)16384, (int)4610, (FloatBuffer)aba_0.a(f3, f3, f3, f4));
        GL11.glLight((int)16385, (int)4611, (FloatBuffer)aba_0.a(aba_0.b.xCoord, aba_0.b.yCoord, aba_0.b.zCoord, 0.0));
        GL11.glLight((int)16385, (int)4609, (FloatBuffer)aba_0.a(f2, f2, f2, f4));
        GL11.glLight((int)16385, (int)4608, (FloatBuffer)aba_0.a(0.0f, 0.0f, 0.0f, f4));
        GL11.glLight((int)16385, (int)4610, (FloatBuffer)aba_0.a(f3, f3, f3, f4));
        GlStateManagerInvoker.shadeModel(7424);
        GL11.glLightModel((int)2899, (FloatBuffer)aba_0.a(f, f, f, f4));
    }

    public static void a() {
        GlStateManagerInvoker.disableLighting();
        GlStateManagerInvoker.h(0);
        GlStateManagerInvoker.h(1);
        GlStateManagerInvoker.m();
    }

    private static FloatBuffer a(double d, double d2, double d3, double d4) {
        return aba_0.a((float)d, (float)d2, (float)d3, (float)d4);
    }

    private static FloatBuffer a(float f, float f2, float f3, float f4) {
        aHB.a(a);
        aHB.a(aHB.a(aHB.a(aHB.a(a, f), f2), f3), f4);
        aHB.b(a);
        return a;
    }

    public static void a(rm_2 rm_22) {
    }

    public static void a(rm_2 rm_22, float f, int n) {
        GL11.glLineWidth((float)f);
        GL11.glEnable((int)2848);
        GL11.glEnable((int)2881);
        GL11.glHint((int)3154, (int)4354);
        GL11.glHint((int)3155, (int)4354);
        aba_0.a(n);
        aba_0.b(rm_22);
        GL11.glDisable((int)2848);
        GL11.glDisable((int)2881);
    }

    public static void a(int n) {
        float f = (float)(n >> 24 & 0xFF) / 255.0f;
        float f2 = (float)(n >> 16 & 0xFF) / 255.0f;
        float f3 = (float)(n >> 8 & 0xFF) / 255.0f;
        float f4 = (float)(n & 0xFF) / 255.0f;
        GL11.glColor4f((float)f2, (float)f3, (float)f4, (float)f);
    }

    public static void b(rm_2 rm_22, float f, int n) {
        GL11.glLineWidth((float)f);
        GL11.glEnable((int)2848);
        GL11.glEnable((int)2881);
        GL11.glHint((int)3154, (int)4354);
        GL11.glHint((int)3155, (int)4354);
        aba_0.a(n);
        aba_0.a(rm_22);
        GL11.glDisable((int)2848);
        GL11.glDisable((int)2881);
    }

    public static void c() {
        GlStateManagerInvoker.pushMatrix();
        GlStateManagerInvoker.b(-30.0f, 0.0f, 1.0f, 0.0f);
        GlStateManagerInvoker.b(165.0f, 1.0f, 0.0f, 0.0f);
        aba_0.b();
        GlStateManagerInvoker.popMatrix();
    }

    public static void b(rm_2 rm_22) {
    }

    static {
        a = N4.d(16);
        c = aNE.b(new Vec3(0.2f, 1.0, -0.7f));
        b = aNE.b(new Vec3(-0.2f, 1.0, 0.7f));
    }
}

