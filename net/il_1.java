/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import java.util.Random;

/*
 * Renamed from net.iL
 */
public class il_1
extends ii_1 {
    private static IBlockState c = BlockStateInvoker.a(BlocksInvoker.t(Blocks.bO), gt_1.R, (Comparable)((Object)F3.ACACIA));
    private static IBlockState b = BlockStateInvoker.a(BlockStateInvoker.a(aa1_0.a(Blocks.bM), gh_2.W, (Comparable)((Object)F3.ACACIA)), BlockLeaves.V, Boolean.FALSE);

    @Override
    public boolean a(World world, Random random, BlockPos blockPos) {
        int n = a5_0.a(random, 3) + a5_0.a(random, 3) + 5;
        if (amv_2.h(blockPos) >= 1 && amv_2.h(blockPos) + n + 1 <= 256) {
            for (int i = amv_2.h(blockPos); i <= amv_2.h(blockPos) + 1 + n; ++i) {
                int n2 = 1;
                if (i == amv_2.h(blockPos)) {
                    n2 = 0;
                }
                if (i >= amv_2.h(blockPos) + 1 + n - 2) {
                    n2 = 2;
                }
                z6_0 z6_02 = new z6_0();
                for (int j = amv_2.j(blockPos) - n2; j <= amv_2.j(blockPos) + n2; ++j) {
                    for (int k = amv_2.i(blockPos) - n2; k <= amv_2.i(blockPos) + n2; ++k) {
                        if (i < 256 && this.a(BlockStateInvoker.getBlock(aV8.q(world, ain_1.a(z6_02, j, i, k))))) continue;
                    }
                }
            }
            return false;
        }
        return false;
    }

    private void c(World world, BlockPos blockPos) {
        this.a(world, blockPos, c);
    }

    public il_1(boolean bl) {
        super(bl);
    }

    private void b(World world, BlockPos blockPos) {
        Material material = BlocksInvoker.getBlockState(BlockStateInvoker.getBlock(aV8.q(world, blockPos)));
        if (material == Material.air || material == Material.z) {
            this.a(world, blockPos, b);
        }
    }
}

