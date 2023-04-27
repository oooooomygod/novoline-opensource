/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.MathInvoker;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import java.util.Random;

/*
 * Renamed from net.id
 */
public class id_2
extends i7_0 {
    @Override
    public boolean a(World world, Random random, BlockPos blockPos) {
        int n;
        int n2;
        while (aV8.k(world, blockPos) && amv_2.h(blockPos) > 2) {
            blockPos = amv_2.g(blockPos);
        }
        if (BlockStateInvoker.getBlock(aV8.q(world, blockPos)) != Blocks.bq) {
            return false;
        }
        blockPos = amv_2.c(blockPos, a5_0.a(random, 4));
        int n3 = a5_0.a(random, 4) + 7;
        int n4 = n3 / 4 + a5_0.a(random, 2);
        if (n4 > 1 && a5_0.a(random, 60) == 0) {
            blockPos = amv_2.c(blockPos, 10 + a5_0.a(random, 30));
        }
        for (n2 = 0; n2 < n3; ++n2) {
            float f = (1.0f - (float)n2 / (float)n3) * (float)n4;
            n = MathHelper.c(f);
            for (int i = -n; i <= n; ++i) {
                float f2 = (float)MathHelper.a(i) - 0.25f;
                for (int j = -n; j <= n; ++j) {
                    float f3 = (float)MathHelper.a(j) - 0.25f;
                    if (!(f2 * f2 + f3 * f3 <= f * f) || (i == -n || i == n || j == -n || j == n) && !(a5_0.e(random) <= 0.75f)) continue;
                    Block block = BlockStateInvoker.getBlock(aV8.q(world, amv_2.a(blockPos, i, n2, j)));
                    if (BlocksInvoker.getBlockState(block) == Material.air || block == Blocks.dirt || block == Blocks.bq || block == Blocks.I) {
                        this.a(world, amv_2.a(blockPos, i, n2, j), BlocksInvoker.t(Blocks.bJ));
                    }
                    if (n <= 1 || BlocksInvoker.getBlockState(block = BlockStateInvoker.getBlock(aV8.q(world, amv_2.a(blockPos, i, -n2, j)))) != Material.air && block != Blocks.dirt && block != Blocks.bq && block != Blocks.I) continue;
                    this.a(world, amv_2.a(blockPos, i, -n2, j), BlocksInvoker.t(Blocks.bJ));
                }
            }
        }
        n2 = n4 - 1;
        n2 = 0;
        int n5 = -n2;
        n = -n2;
        while (true) {
            Block block;
            BlockPos blockPos2 = amv_2.a(blockPos, n5, -1, n);
            int n6 = 50;
            if (MathInvoker.a(n5) == 1 && MathInvoker.a(n) == 1) {
                n6 = a5_0.a(random, 5);
            }
            while (amv_2.h(blockPos2) > 50 && (BlocksInvoker.getBlockState(block = BlockStateInvoker.getBlock(aV8.q(world, blockPos2))) == Material.air || block == Blocks.dirt || block == Blocks.bq || block == Blocks.I || block == Blocks.bJ)) {
                this.a(world, blockPos2, BlocksInvoker.t(Blocks.bJ));
                blockPos2 = amv_2.g(blockPos2);
                --n6;
                blockPos2 = amv_2.d(blockPos2, a5_0.a(random, 5) + 1);
                n6 = a5_0.a(random, 5);
            }
            ++n;
        }
    }
}

