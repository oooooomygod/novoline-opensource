/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.WorldRendererInvoker;
import deobf.Entity;
import net.minecraft.renderer.WorldRenderer;

/*
 * Renamed from net.ms
 */
public class ms_2
extends mi_1 {
    protected ms_2(World world, double d, double d2, double d3) {
        super(world, d, d2, d3);
        this.am = 4;
    }

    @Override
    public void a(WorldRenderer worldRenderer, Entity entity, float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = 7.1f * MathHelper.sin(((float)this.ay + f - 1.0f) * 0.25f * (float)Math.PI);
        this.aq = 0.6f - ((float)this.ay + f - 1.0f) * 0.25f * 0.5f;
        float f8 = (float)(this.prevPosX + (this.posX - this.prevPosX) * (double)f - aj);
        float f9 = (float)(this.prevPosY + (this.posY - this.prevPosY) * (double)f - ap);
        float f10 = (float)(this.prevPosZ + (this.posZ - this.prevPosZ) * (double)f - aw);
        int n = this.d(f);
        int n2 = n >> 16 & 0xFFFF;
        int n3 = n & 0xFFFF;
        WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, f8 - f2 * f7 - f5 * f7, f9 - f3 * f7, f10 - f4 * f7 - f6 * f7), 0.5, 0.375), this.an, this.ao, this.av, this.aq), n2, n3));
        WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, f8 - f2 * f7 + f5 * f7, f9 + f3 * f7, f10 - f4 * f7 + f6 * f7), 0.5, 0.125), this.an, this.ao, this.av, this.aq), n2, n3));
        WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, f8 + f2 * f7 + f5 * f7, f9 + f3 * f7, f10 + f4 * f7 + f6 * f7), 0.25, 0.125), this.an, this.ao, this.av, this.aq), n2, n3));
        WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, f8 + f2 * f7 - f5 * f7, f9 - f3 * f7, f10 + f4 * f7 - f6 * f7), 0.25, 0.375), this.an, this.ao, this.av, this.aq), n2, n3));
    }
}

