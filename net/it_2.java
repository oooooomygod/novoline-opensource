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
 * Renamed from net.it
 */
public class it_2
extends i7_0 {
    private int c;
    private Block b = Blocks.bJ;

    @Override
    public boolean a(World world, Random random, BlockPos blockPos) {
        while (aV8.k(world, blockPos) && amv_2.h(blockPos) > 2) {
            blockPos = amv_2.g(blockPos);
        }
        if (BlockStateInvoker.getBlock(aV8.q(world, blockPos)) != Blocks.bq) {
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
                    if (block != Blocks.dirt && block != Blocks.bq && block != Blocks.I) continue;
                    aV8.a(world, blockPos2, BlocksInvoker.t(this.b), 2);
                }
            }
        }
        return true;
    }

    public it_2(int n) {
        this.c = n;
    }
}

