/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.TessellatorInvoker;
import cc.novoline.invoke.WorldRendererInvoker;
import deobf.DefaultVertexFormats;
import deobf.Tessellator;
import net.minecraft.renderer.WorldRenderer;
import org.lwjgl.opengl.GL11;

public class aOP {
    private float b = 0.0f;
    private int g = 0;
    private a5Y k = null;
    private int j = 0;
    private float m = 0.0f;
    private int i = 0;
    private float a = 0.0f;
    private float n = 0.0f;
    private int e = 0;
    private float f = 0.0f;
    private float c = 0.0f;
    private float h = 0.0f;
    private float l = 0.0f;
    private int d = 0;

    public static void a(Tessellator tessellator, float f, float f2, float f3, float f4, int n, int n2, float f5, float f6, float f7) {
        float f8;
        float f9;
        float f10;
        aP2.b();
        if (f5 < 6.25E-4f) {
            f5 = 6.25E-4f;
        }
        float f11 = f3 - f;
        float f12 = f4 - f2;
        double d = MathHelper.d(f11) * (f6 / 16.0f);
        double d2 = MathHelper.d(f12) * (f7 / 16.0f);
        WorldRenderer worldRenderer = TessellatorInvoker.getWorldRenderer(tessellator);
        GL11.glNormal3f((float)0.0f, (float)0.0f, (float)-1.0f);
        WorldRendererInvoker.begin(worldRenderer, 7, DefaultVertexFormats.a);
        WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, 0.0, d2, 0.0), f, f4));
        WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, d, d2, 0.0), f3, f4));
        WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, d, 0.0, 0.0), f3, f2));
        WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, 0.0, 0.0, 0.0), f, f2));
        TessellatorInvoker.draw(tessellator);
        GL11.glNormal3f((float)0.0f, (float)0.0f, (float)1.0f);
        WorldRendererInvoker.begin(worldRenderer, 7, DefaultVertexFormats.a);
        WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, 0.0, 0.0, f5), f, f2));
        WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, d, 0.0, f5), f3, f2));
        WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, d, d2, f5), f3, f4));
        WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, 0.0, d2, f5), f, f4));
        TessellatorInvoker.draw(tessellator);
        float f13 = 0.5f * f11 / (float)n;
        float f14 = 0.5f * f12 / (float)n2;
        GL11.glNormal3f((float)-1.0f, (float)0.0f, (float)0.0f);
        WorldRendererInvoker.begin(worldRenderer, 7, DefaultVertexFormats.a);
        int n3 = 0;
        if (n3 < n) {
            f10 = (float)n3 / (float)n;
            f9 = f + f11 * f10 + f13;
            WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, (double)f10 * d, d2, f5), f9, f4));
            WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, (double)f10 * d, d2, 0.0), f9, f4));
            WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, (double)f10 * d, 0.0, 0.0), f9, f2));
            WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, (double)f10 * d, 0.0, f5), f9, f2));
            ++n3;
            ListInvoker.b(new ListInvoker[1]);
        }
        TessellatorInvoker.draw(tessellator);
        GL11.glNormal3f((float)1.0f, (float)0.0f, (float)0.0f);
        WorldRendererInvoker.begin(worldRenderer, 7, DefaultVertexFormats.a);
        n3 = 0;
        if (n3 < n) {
            f10 = (float)n3 / (float)n;
            f9 = f + f11 * f10 + f13;
            f8 = f10 + 1.0f / (float)n;
            WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, (double)f8 * d, 0.0, f5), f9, f2));
            WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, (double)f8 * d, 0.0, 0.0), f9, f2));
            WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, (double)f8 * d, d2, 0.0), f9, f4));
            WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, (double)f8 * d, d2, f5), f9, f4));
            ++n3;
        }
        TessellatorInvoker.draw(tessellator);
        GL11.glNormal3f((float)0.0f, (float)1.0f, (float)0.0f);
        WorldRendererInvoker.begin(worldRenderer, 7, DefaultVertexFormats.a);
        n3 = 0;
        if (n3 < n2) {
            f10 = (float)n3 / (float)n2;
            f9 = f2 + f12 * f10 + f14;
            f8 = f10 + 1.0f / (float)n2;
            WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, 0.0, (double)f8 * d2, f5), f, f9));
            WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, d, (double)f8 * d2, f5), f3, f9));
            WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, d, (double)f8 * d2, 0.0), f3, f9));
            WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, 0.0, (double)f8 * d2, 0.0), f, f9));
            ++n3;
        }
        TessellatorInvoker.draw(tessellator);
        GL11.glNormal3f((float)0.0f, (float)-1.0f, (float)0.0f);
        WorldRendererInvoker.begin(worldRenderer, 7, DefaultVertexFormats.a);
        n3 = 0;
        if (n3 < n2) {
            f10 = (float)n3 / (float)n2;
            f9 = f2 + f12 * f10 + f14;
            WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, d, (double)f10 * d2, f5), f3, f9));
            WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, 0.0, (double)f10 * d2, f5), f, f9));
            WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, 0.0, (double)f10 * d2, 0.0), f, f9));
            WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, d, (double)f10 * d2, 0.0), f3, f9));
            ++n3;
        }
        TessellatorInvoker.draw(tessellator);
    }

    public void a(Tessellator tessellator, float f) {
        aP2.b();
        GlStateManagerInvoker.translate(this.c * f, this.l * f, this.m * f);
        float f2 = this.b;
        float f3 = this.a;
        float f4 = this.f;
        float f5 = this.n;
        if (this.k.x) {
            f2 = this.a;
            f3 = this.b;
        }
        if (this.k.j) {
            f4 = this.n;
            f5 = this.f;
        }
        aOP.a(tessellator, f2, f4, f3, f5, this.d, this.i, f * (float)this.e, this.k.c, this.k.d);
        GlStateManagerInvoker.translate(-this.c * f, -this.l * f, -this.m * f);
    }

    public aOP(a5Y a5Y2, int n, int n2, float f, float f2, float f3, int n3, int n4, int n5, float f4) {
        this.k = a5Y2;
        this.g = n;
        this.j = n2;
        this.c = f;
        this.l = f2;
        this.m = f3;
        this.d = n3;
        this.i = n4;
        this.e = n5;
        this.h = f4;
        this.b = (float)n / a5Y2.c;
        this.f = (float)n2 / a5Y2.d;
        this.a = (float)(n + n3) / a5Y2.c;
        this.n = (float)(n2 + n4) / a5Y2.d;
    }
}

