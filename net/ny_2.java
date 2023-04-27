/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.TessellatorInvoker;
import cc.novoline.invoke.TextureManagerInvoker;
import cc.novoline.invoke.WorldRendererInvoker;
import deobf.DefaultVertexFormats;
import deobf.Entity;
import net.minecraft.renderer.WorldRenderer;

/*
 * Renamed from net.ny
 */
public class ny_2
extends mi_1 {
    private static VertexFormat aA;
    private int aC;
    private float aB;
    private int az;
    private TextureManager aD;
    private static ResourceLocation aE;

    static {
        aE = new ResourceLocation(fb_0.a);
        aA = zv_2.a(zv_2.a(zv_2.a(zv_2.a(zv_2.a(zv_2.a(new VertexFormat(), DefaultVertexFormats.j), DefaultVertexFormats.t), DefaultVertexFormats.q), DefaultVertexFormats.p), DefaultVertexFormats.m), DefaultVertexFormats.e);
    }

    protected ny_2(TextureManager textureManager, World world, double d, double d2, double d3, double d4, double d5, double d6) {
        super(world, d, d2, d3, 0.0, 0.0, 0.0);
        this.aD = textureManager;
        this.az = 6 + a5_0.a(this.Q, 4);
        this.ao = this.av = a5_0.e(this.Q) * 0.6f + 0.4f;
        this.an = this.av;
        this.aB = 1.0f - (float)d4 * 0.5f;
    }

    @Override
    public void onUpdate() {
        this.prevPosX = this.posX;
        this.prevPosY = this.posY;
        this.prevPosZ = this.posZ;
        ++this.aC;
        if (this.aC == this.az) {
            this.E();
        }
    }

    @Override
    public int f() {
        return 3;
    }

    @Override
    public void a(WorldRenderer worldRenderer, Entity entity, float f, float f2, float f3, float f4, float f5, float f6) {
        int n = (int)(((float)this.aC + f) * 15.0f / (float)this.az);
        if (n <= 15) {
            TextureManagerInvoker.bindTexture(this.aD, aE);
            float f7 = (float)(n % 4) / 4.0f;
            float f8 = f7 + 0.24975f;
            float f9 = (float)(n / 4) / 4.0f;
            float f10 = f9 + 0.24975f;
            float f11 = 2.0f * this.aB;
            float f12 = (float)(this.prevPosX + (this.posX - this.prevPosX) * (double)f - aj);
            float f13 = (float)(this.prevPosY + (this.posY - this.prevPosY) * (double)f - ap);
            float f14 = (float)(this.prevPosZ + (this.posZ - this.prevPosZ) * (double)f - aw);
            GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
            GlStateManagerInvoker.disableLighting();
            ne_0.e();
            WorldRendererInvoker.begin(worldRenderer, 7, aA);
            WorldRendererInvoker.pos(WorldRendererInvoker.d(WorldRendererInvoker.a(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, f12 - f2 * f11 - f5 * f11, f13 - f3 * f11, f14 - f4 * f11 - f6 * f11), f8, f10), this.an, this.ao, this.av, 1.0f), 0, 240), 0.0f, 1.0f, 0.0f));
            WorldRendererInvoker.pos(WorldRendererInvoker.d(WorldRendererInvoker.a(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, f12 - f2 * f11 + f5 * f11, f13 + f3 * f11, f14 - f4 * f11 + f6 * f11), f8, f9), this.an, this.ao, this.av, 1.0f), 0, 240), 0.0f, 1.0f, 0.0f));
            WorldRendererInvoker.pos(WorldRendererInvoker.d(WorldRendererInvoker.a(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, f12 + f2 * f11 + f5 * f11, f13 + f3 * f11, f14 + f4 * f11 + f6 * f11), f7, f9), this.an, this.ao, this.av, 1.0f), 0, 240), 0.0f, 1.0f, 0.0f));
            WorldRendererInvoker.pos(WorldRendererInvoker.d(WorldRendererInvoker.a(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, f12 + f2 * f11 - f5 * f11, f13 - f3 * f11, f14 + f4 * f11 - f6 * f11), f7, f10), this.an, this.ao, this.av, 1.0f), 0, 240), 0.0f, 1.0f, 0.0f));
            TessellatorInvoker.draw(TessellatorInvoker.getInstance());
            GlStateManagerInvoker.D();
        }
    }

    @Override
    public int d(float f) {
        return 61680;
    }
}

