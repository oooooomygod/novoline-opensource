/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.WorldRendererInvoker;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import deobf.Entity;
import deobf.IBlockAccess;
import deobf.MCInvoker;
import net.minecraft.renderer.WorldRenderer;

/*
 * Renamed from net.mm
 */
public class mm_2
extends mi_1 {
    private BlockPos aA;
    private IBlockState az;

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

    @Override
    public int f() {
        return 1;
    }

    public mm_2 a(BlockPos blockPos) {
        this.aA = blockPos;
        if (BlockStateInvoker.getBlock(this.az) == Blocks.grass) {
            return this;
        }
        int n = BlocksInvoker.d(BlockStateInvoker.getBlock(this.az), (IBlockAccess)this.worldObj, blockPos);
        this.an *= (float)(n >> 16 & 0xFF) / 255.0f;
        this.ao *= (float)(n >> 8 & 0xFF) / 255.0f;
        this.av *= (float)(n & 0xFF) / 255.0f;
        return this;
    }

    @Override
    public mm_2 a() {
        this.aA = new BlockPos(this.posX, this.posY, this.posZ);
        Block block = BlockStateInvoker.getBlock(this.az);
        if (block != Blocks.grass) {
            int n = BlocksInvoker.e(block, this.az);
            this.an *= (float)(n >> 16 & 0xFF) / 255.0f;
            this.ao *= (float)(n >> 8 & 0xFF) / 255.0f;
            this.av *= (float)(n & 0xFF) / 255.0f;
        }
        return this;
    }

    @Override
    public int d(float f) {
        super.d(f);
        int n = 0;
        if (aV8.isBlockLoaded(this.worldObj, this.aA)) {
            n = aV8.a(this.worldObj, this.aA, 0);
        }
        return n;
    }

    protected mm_2(World world, double d, double d2, double d3, double d4, double d5, double d6, IBlockState iBlockState) {
        super(world, d, d2, d3, d4, d5, d6);
        this.az = iBlockState;
        this.a(ap__0.a(xd_0.a(MCInvoker.Y(MCInvoker.f())), iBlockState));
        this.ar = BlockStateInvoker.getBlock((IBlockState)iBlockState).O;
        this.av = 0.6f;
        this.ao = 0.6f;
        this.an = 0.6f;
        this.au /= 2.0f;
    }
}

