/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.WorldRendererInvoker;
import net.minecraft.init.Blocks;
import deobf.Entity;
import deobf.MCInvoker;
import net.minecraft.renderer.WorldRenderer;

/*
 * Renamed from net.mS
 */
public class ms_1
extends mi_1 {
    @Override
    public int f() {
        return 1;
    }

    @Override
    public void a(WorldRenderer worldRenderer, Entity entity, float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = ((float)this.ax + this.at / 4.0f) / 16.0f;
        float f8 = f7 + 0.015609375f;
        float f9 = ((float)this.as + this.al / 4.0f) / 16.0f;
        float f10 = f9 + 0.015609375f;
        float f11 = 0.1f * this.au;
        if (this.ak != null) {
            f7 = qg_2.a(this.ak, (double)(this.at / 4.0f * 16.0f));
            f8 = qg_2.a(this.ak, (double)((this.at + 1.0f) / 4.0f * 16.0f));
            f9 = qg_2.b(this.ak, (double)(this.al / 4.0f * 16.0f));
            f10 = qg_2.b(this.ak, (double)((this.al + 1.0f) / 4.0f * 16.0f));
        }
        float f12 = (float)(this.prevPosX + (this.posX - this.prevPosX) * (double)f - aj);
        float f13 = (float)(this.prevPosY + (this.posY - this.prevPosY) * (double)f - ap);
        float f14 = (float)(this.prevPosZ + (this.posZ - this.prevPosZ) * (double)f - aw);
        int n = this.d(f);
        int n2 = n >> 16 & 0xFFFF;
        int n3 = n & 0xFFFF;
        WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, f12 - f2 * f11 - f5 * f11, f13 - f3 * f11, f14 - f4 * f11 - f6 * f11), f7, f10), this.an, this.ao, this.av, 1.0f), n2, n3));
        WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, f12 - f2 * f11 + f5 * f11, f13 + f3 * f11, f14 - f4 * f11 + f6 * f11), f7, f9), this.an, this.ao, this.av, 1.0f), n2, n3));
        WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, f12 + f2 * f11 + f5 * f11, f13 + f3 * f11, f14 + f4 * f11 + f6 * f11), f8, f9), this.an, this.ao, this.av, 1.0f), n2, n3));
        WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, f12 + f2 * f11 - f5 * f11, f13 - f3 * f11, f14 + f4 * f11 - f6 * f11), f8, f10), this.an, this.ao, this.av, 1.0f), n2, n3));
    }

    protected ms_1(World world, double d, double d2, double d3, double d4, double d5, double d6, Item item, int n) {
        this(world, d, d2, d3, item, n);
        this.motionX *= (double)0.1f;
        this.motionY *= (double)0.1f;
        this.motionZ *= (double)0.1f;
        this.motionX += d4;
        this.motionY += d5;
        this.motionZ += d6;
    }

    protected ms_1(World world, double d, double d2, double d3, Item item) {
        this(world, d, d2, d3, item, 0);
    }

    protected ms_1(World world, double d, double d2, double d3, Item item, int n) {
        super(world, d, d2, d3, 0.0, 0.0, 0.0);
        this.a(aPL.a(DU.a(MCInvoker.A(MCInvoker.f())), item, n));
        this.av = 1.0f;
        this.ao = 1.0f;
        this.an = 1.0f;
        this.ar = Blocks.bq.O;
        this.au /= 2.0f;
    }
}

