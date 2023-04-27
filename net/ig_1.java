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
 * Renamed from net.iG
 */
public class ig_1
extends i7_0 {
    private Block b = Blocks.T;
    private int c;

    public ig_1(int n) {
        this.c = n;
    }

    @Override
    public boolean a(World world, Random random, BlockPos blockPos) {
        if (BlocksInvoker.getBlockState(BlockStateInvoker.getBlock(aV8.q(world, blockPos))) != Material.M) {
            return false;
        }
        int n = a5_0.a(random, this.c - 2) + 2;
        int n2 = 1;
        for (int i = amv_2.j(blockPos) - n; i <= amv_2.j(blockPos) + n; ++i) {
            for (int j = amv_2.i(blockPos) - n; j <= amv_2.i(blockPos) + n; ++j) {
                int n3;
                int n4 = i - amv_2.j(blockPos);
                if (n4 * n4 + (n3 = j - amv_2.i(blockPos)) * n3 > n * n) continue;
                for (int k = amv_2.h(blockPos) - n2; k <= amv_2.h(blockPos) + n2; ++k) {
                    BlockPos blockPos2 = new BlockPos(i, k, j);
                    Block block = BlockStateInvoker.getBlock(aV8.q(world, blockPos2));
                    if (block != Blocks.dirt && block != Blocks.T) continue;
                    aV8.a(world, blockPos2, BlocksInvoker.t(this.b), 2);
                }
            }
        }
        return true;
    }
}

