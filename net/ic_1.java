/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import deobf.IBlockAccess;
import deobf.TileEntity;
import java.util.List;
import java.util.Random;

/*
 * Renamed from net.iC
 */
public class ic_1
extends i7_0 {
    private List<C6> b;
    private int c;

    public ic_1(List<C6> list, int n) {
        this.b = list;
        this.c = n;
    }

    @Override
    public boolean a(World world, Random random, BlockPos blockPos) {
        Block block;
        while ((BlocksInvoker.getBlockState(block = BlockStateInvoker.getBlock(aV8.q(world, blockPos))) == Material.air || BlocksInvoker.getBlockState(block) == Material.z) && amv_2.h(blockPos) > 1) {
            blockPos = amv_2.g(blockPos);
        }
        if (amv_2.h(blockPos) >= 1) {
            blockPos = amv_2.e(blockPos);
            int n = 0;
            while (true) {
                BlockPos blockPos2;
                if (aV8.k(world, blockPos2 = amv_2.a(blockPos, a5_0.a(random, 4) - a5_0.a(random, 4), a5_0.a(random, 3) - a5_0.a(random, 3), a5_0.a(random, 4) - a5_0.a(random, 4))) && aV8.a((IBlockAccess)world, amv_2.g(blockPos2))) {
                    aV8.a(world, blockPos2, vz_1.a(Blocks.R), 2);
                    TileEntity tileEntity = aV8.z(world, blockPos2);
                    if (tileEntity instanceof a6O) {
                        aiq_2.a(random, this.b, (a6O)tileEntity, this.c);
                    }
                    BlockPos blockPos3 = amv_2.f(blockPos2);
                    BlockPos blockPos4 = amv_2.d(blockPos2);
                    BlockPos blockPos5 = amv_2.a(blockPos2);
                    BlockPos blockPos6 = amv_2.b(blockPos2);
                    if (aV8.k(world, blockPos4) && aV8.a((IBlockAccess)world, amv_2.g(blockPos4))) {
                        aV8.a(world, blockPos4, BlocksInvoker.t(Blocks.bD), 2);
                    }
                    if (aV8.k(world, blockPos3) && aV8.a((IBlockAccess)world, amv_2.g(blockPos3))) {
                        aV8.a(world, blockPos3, BlocksInvoker.t(Blocks.bD), 2);
                    }
                    if (aV8.k(world, blockPos5) && aV8.a((IBlockAccess)world, amv_2.g(blockPos5))) {
                        aV8.a(world, blockPos5, BlocksInvoker.t(Blocks.bD), 2);
                    }
                    if (aV8.k(world, blockPos6) && aV8.a((IBlockAccess)world, amv_2.g(blockPos6))) {
                        aV8.a(world, blockPos6, BlocksInvoker.t(Blocks.bD), 2);
                    }
                    return true;
                }
                ++n;
            }
        }
        return false;
    }
}

