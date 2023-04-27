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
 * Renamed from net.iM
 */
public class im_1
extends i7_0 {
    @Override
    public boolean a(World world, Random random, BlockPos blockPos) {
        int n = 0;
        while (true) {
            BlockPos blockPos2;
            BlockPos blockPos3;
            if (aV8.k(world, blockPos3 = amv_2.a(blockPos, a5_0.a(random, 4) - a5_0.a(random, 4), 0, a5_0.a(random, 4) - a5_0.a(random, 4))) && (BlocksInvoker.getBlockState(BlockStateInvoker.getBlock(aV8.q(world, amv_2.d(blockPos2 = amv_2.g(blockPos3))))) == Material.M || BlocksInvoker.getBlockState(BlockStateInvoker.getBlock(aV8.q(world, amv_2.f(blockPos2)))) == Material.M || BlocksInvoker.getBlockState(BlockStateInvoker.getBlock(aV8.q(world, amv_2.a(blockPos2)))) == Material.M || BlocksInvoker.getBlockState(BlockStateInvoker.getBlock(aV8.q(world, amv_2.b(blockPos2)))) == Material.M)) {
                int n2 = 2 + a5_0.a(random, a5_0.a(random, 3) + 1);
                for (int i = 0; i < n2; ++i) {
                    if (!azs_1.a(Blocks.P, world, blockPos3)) continue;
                    aV8.a(world, amv_2.c(blockPos3, i), azs_1.a(Blocks.P), 2);
                }
            }
            ++n;
        }
    }
}

