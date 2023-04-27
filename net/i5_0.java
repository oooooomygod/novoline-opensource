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
 * Renamed from net.i5
 */
public class i5_0
extends ii_1 {
    private static IBlockState b = BlockStateInvoker.a(BlocksInvoker.t(Blocks.b2), gj_0.R, (Comparable)((Object)F3.SPRUCE));
    private static IBlockState c = BlockStateInvoker.a(BlockStateInvoker.a(aa1_0.a(Blocks.bP), gg_1.W, (Comparable)((Object)F3.SPRUCE)), BlockLeaves.V, Boolean.FALSE);

    public i5_0(boolean bl) {
        super(bl);
    }

    @Override
    public boolean a(World world, Random random, BlockPos blockPos) {
        int n = a5_0.a(random, 4) + 6;
        int n2 = 1 + a5_0.a(random, 2);
        int cfr_ignored_0 = n - n2;
        int n3 = 2 + a5_0.a(random, 2);
        if (amv_2.h(blockPos) >= 1 && amv_2.h(blockPos) + n + 1 <= 256) {
            for (int i = amv_2.h(blockPos); i <= amv_2.h(blockPos) + 1 + n; ++i) {
                int n4 = 1;
                n4 = i - amv_2.h(blockPos) < n2 ? 0 : n3;
                z6_0 z6_02 = new z6_0();
                for (int j = amv_2.j(blockPos) - n4; j <= amv_2.j(blockPos) + n4; ++j) {
                    for (int k = amv_2.i(blockPos) - n4; k <= amv_2.i(blockPos) + n4; ++k) {
                        Block block;
                        if (i < 256 && BlocksInvoker.getBlockState(block = BlockStateInvoker.getBlock(aV8.q(world, ain_1.a(z6_02, j, i, k)))) != Material.air && BlocksInvoker.getBlockState(block) == Material.z) continue;
                    }
                }
            }
            return false;
        }
        return false;
    }
}

