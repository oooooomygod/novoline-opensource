/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import deobf.Entity;
import deobf.EntityBoat;
import deobf.IBlockAccess;
import java.util.List;

/*
 * Renamed from net.fD
 */
public class fd_1
extends fc_2 {
    @Override
    public rm_2 b(World world, BlockPos blockPos, IBlockState iBlockState) {
        return new rm_2((double)amv_2.j(blockPos) + this.t, (double)amv_2.h(blockPos) + this.N, (double)amv_2.i(blockPos) + this.w, (double)amv_2.j(blockPos) + this.d, (double)amv_2.h(blockPos) + this.b, (double)amv_2.i(blockPos) + this.n);
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, rm_2 rm_22, List<rm_2> list, Entity entity) {
        if (!(entity instanceof EntityBoat)) {
            super.a(world, blockPos, iBlockState, rm_22, list, entity);
        }
    }

    protected fd_1() {
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.015625f, 1.0f);
        this.a(CreativeTabs.l);
    }

    @Override
    public boolean a(World world, BlockPos blockPos, IBlockState iBlockState) {
        if (amv_2.h(blockPos) >= 0 && amv_2.h(blockPos) < 256) {
            IBlockState iBlockState2 = aV8.q(world, amv_2.g(blockPos));
            return BlockStateInvoker.getBlock(iBlockState2).w() == Material.M && P8.b((Integer)BlockStateInvoker.b(iBlockState2, BlockLiquid.P)) == 0;
        }
        return false;
    }

    @Override
    public int a(IBlockAccess iBlockAccess, BlockPos blockPos, int n) {
        return 2129968;
    }

    @Override
    protected boolean a(Block block) {
        return block == Blocks.water;
    }

    @Override
    public int d(IBlockState iBlockState) {
        return 0;
    }

    @Override
    public int e(IBlockState iBlockState) {
        return 7455580;
    }

    @Override
    public int r() {
        return 7455580;
    }
}

