/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import java.util.Iterator;
import java.util.Random;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.fa
 */
public class fa_1
extends fc_2
implements ale_1 {
    @Override
    public boolean b(World world, Random random, BlockPos blockPos, IBlockState iBlockState) {
        return (double)a5_0.e(random) < 0.4;
    }

    @Override
    public boolean a(World world, BlockPos blockPos, IBlockState iBlockState) {
        if (amv_2.h(blockPos) >= 0 && amv_2.h(blockPos) < 256) {
            IBlockState iBlockState2 = aV8.q(world, amv_2.g(blockPos));
            return BlockStateInvoker.getBlock(iBlockState2) == Blocks.aE || BlockStateInvoker.getBlock(iBlockState2) == Blocks.dirt && BlockStateInvoker.b(iBlockState2, BlockDirt.Q) == a6s_0.PODZOL || aV8.g(world, blockPos) < 13 && this.a(BlockStateInvoker.getBlock(iBlockState2));
        }
        return false;
    }

    @Override
    public boolean a(World world, BlockPos blockPos, IBlockState iBlockState, boolean bl) {
        return true;
    }

    @Override
    protected boolean a(Block block) {
        return block.z();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void a(World world, BlockPos object, IBlockState iBlockState, Random random) {
        if (a5_0.a(random, 25) == 0) {
            Object object2 = OV.a(amv_2.a(amv_2.a((BlockPos)object, -4, -1, -4), amv_2.a((BlockPos)object, 4, 1, 4)));
            while (dz_0.c((Iterator)object2)) {
                void var5_8;
                BlockPos blockPos = (BlockPos)dz_0.b((Iterator)object2);
                if (BlockStateInvoker.getBlock(aV8.q(world, blockPos)) != this) continue;
                --var5_8;
                return;
            }
            object2 = amv_2.a((BlockPos)object, a5_0.a(random, 3) - 1, a5_0.a(random, 2) - a5_0.a(random, 2), a5_0.a(random, 3) - 1);
            int n = 0;
            while (true) {
                if (aV8.k(world, (BlockPos)object2) && this.a(world, (BlockPos)object2, this.m())) {
                    object = object2;
                }
                object2 = amv_2.a((BlockPos)object, a5_0.a(random, 3) - 1, a5_0.a(random, 2) - a5_0.a(random, 2), a5_0.a(random, 3) - 1);
                ++n;
            }
        }
    }

    @Override
    public boolean e(World world, BlockPos blockPos) {
        return super.e(world, blockPos) && this.a(world, blockPos, this.m());
    }

    @Override
    public void a(World world, Random random, BlockPos blockPos, IBlockState iBlockState) {
        this.a(world, blockPos, iBlockState, random);
    }

    public boolean a(World world, BlockPos blockPos, IBlockState iBlockState, Random random) {
        aV8.j(world, blockPos);
        ir_1 ir_12 = null;
        if (this == Blocks.A) {
            ir_12 = new ir_1(Blocks.aj);
        } else if (this == Blocks.bn) {
            ir_12 = new ir_1(Blocks.Q);
        }
        if (aFI.a(ir_12, world, random, blockPos)) {
            return true;
        }
        aV8.a(world, blockPos, iBlockState, 3);
        return false;
    }

    protected fa_1() {
        this.a(0.3f, 0.0f, 0.3f, 0.7f, 0.4f, 0.7f);
        this.a(true);
    }
}

