/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import java.util.Random;

/*
 * Renamed from net.iU
 */
public class iu_1
extends ii_1 {
    private static IBlockState b;
    private static IBlockState c;

    static {
        c = BlockStateInvoker.a(BlocksInvoker.t(Blocks.b2), gj_0.R, (Comparable)((Object)F3.OAK));
        b = BlockStateInvoker.a(BlockStateInvoker.a(aa1_0.a(Blocks.bP), gg_1.W, (Comparable)((Object)F3.OAK)), gg_1.V, Boolean.FALSE);
    }

    /*
     * WARNING - void declaration
     */
    private void a(World world, BlockPos blockPos, J_ j_) {
        IBlockState iBlockState = BlockStateInvoker.a(BlocksInvoker.t(Blocks.as), j_, Boolean.TRUE);
        this.a(world, blockPos, iBlockState);
        blockPos = amv_2.g(blockPos);
        while (BlocksInvoker.getBlockState(BlockStateInvoker.getBlock(aV8.q(world, blockPos))) == Material.air) {
            void var5_5;
            this.a(world, blockPos, iBlockState);
            blockPos = amv_2.g(blockPos);
            --var5_5;
        }
    }

    public iu_1() {
        super(false);
    }

    @Override
    public boolean a(World world, Random random, BlockPos blockPos) {
        int n = a5_0.a(random, 4) + 5;
        while (BlocksInvoker.getBlockState(BlockStateInvoker.getBlock(aV8.q(world, amv_2.g(blockPos)))) == Material.M) {
            blockPos = amv_2.g(blockPos);
        }
        if (amv_2.h(blockPos) >= 1 && amv_2.h(blockPos) + n + 1 <= 256) {
            for (int i = amv_2.h(blockPos); i <= amv_2.h(blockPos) + 1 + n; ++i) {
                int n2 = 1;
                if (i == amv_2.h(blockPos)) {
                    n2 = 0;
                }
                if (i >= amv_2.h(blockPos) + 1 + n - 2) {
                    n2 = 3;
                }
                z6_0 z6_02 = new z6_0();
                for (int j = amv_2.j(blockPos) - n2; j <= amv_2.j(blockPos) + n2; ++j) {
                    for (int k = amv_2.i(blockPos) - n2; k <= amv_2.i(blockPos) + n2; ++k) {
                        Block block;
                        if (i < 256 && BlocksInvoker.getBlockState(block = BlockStateInvoker.getBlock(aV8.q(world, ain_1.a(z6_02, j, i, k)))) != Material.air && BlocksInvoker.getBlockState(block) != Material.z && (block == Blocks.water || block == Blocks.flowing_water) && i <= amv_2.h(blockPos)) continue;
                    }
                }
            }
            return false;
        }
        return false;
    }
}

