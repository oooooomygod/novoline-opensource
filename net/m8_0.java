/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.WorldRendererInvoker;
import deobf.Entity;
import deobf.MCInvoker;
import net.minecraft.renderer.WorldRenderer;

/*
 * Renamed from net.m8
 */
public class m8_0
extends mi_1 {
    @Override
    public int f() {
        return 1;
    }

    @Override
    public void a(WorldRenderer worldRenderer, Entity entity, float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = qg_2.a(this.ak);
        float f8 = qg_2.m(this.ak);
        float f9 = qg_2.f(this.ak);
        float f10 = qg_2.k(this.ak);
        float f11 = (float)(this.prevPosX + (this.posX - this.prevPosX) * (double)f - aj);
        float f12 = (float)(this.prevPosY + (this.posY - this.prevPosY) * (double)f - ap);
        float f13 = (float)(this.prevPosZ + (this.posZ - this.prevPosZ) * (double)f - aw);
        int n = this.d(f);
        int n2 = n >> 16 & 0xFFFF;
        int n3 = n & 0xFFFF;
        WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, f11 - f2 * 0.5f - f5 * 0.5f, f12 - f3 * 0.5f, f13 - f4 * 0.5f - f6 * 0.5f), f8, f10), this.an, this.ao, this.av, 1.0f), n2, n3));
        WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, f11 - f2 * 0.5f + f5 * 0.5f, f12 + f3 * 0.5f, f13 - f4 * 0.5f + f6 * 0.5f), f8, f9), this.an, this.ao, this.av, 1.0f), n2, n3));
        WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, f11 + f2 * 0.5f + f5 * 0.5f, f12 + f3 * 0.5f, f13 + f4 * 0.5f + f6 * 0.5f), f7, f9), this.an, this.ao, this.av, 1.0f), n2, n3));
        WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, f11 + f2 * 0.5f - f5 * 0.5f, f12 - f3 * 0.5f, f13 + f4 * 0.5f - f6 * 0.5f), f7, f10), this.an, this.ao, this.av, 1.0f), n2, n3));
    }

    protected m8_0(World world, double d, double d2, double d3, Item item) {
        super(world, d, d2, d3, 0.0, 0.0, 0.0);
        this.a(aPL.a(DU.a(MCInvoker.A(MCInvoker.f())), item));
        this.av = 1.0f;
        this.ao = 1.0f;
        this.an = 1.0f;
        this.motionZ = 0.0;
        this.motionY = 0.0;
        this.motionX = 0.0;
        this.ar = 0.0f;
        this.am = 80;
    }
}

