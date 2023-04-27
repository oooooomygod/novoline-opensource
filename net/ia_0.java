/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import java.util.Iterator;
import java.util.Random;

/*
 * Renamed from net.iA
 */
public class ia_0
extends i7_0 {
    private Block b;
    private int c;

    @Override
    public boolean a(World world, Random random, BlockPos blockPos) {
        while (true) {
            Block block;
            if (amv_2.h(blockPos) <= 3 || !aV8.k(world, amv_2.g(blockPos)) && ((block = BlockStateInvoker.getBlock(aV8.q(world, amv_2.g(blockPos)))) == Blocks.grass || block == Blocks.dirt || block == Blocks.stone)) {
                if (amv_2.h(blockPos) <= 3) {
                    return false;
                }
                int n = this.c;
                int n2 = 0;
                while (true) {
                    int n3 = n + a5_0.a(random, 2);
                    int n4 = n + a5_0.a(random, 2);
                    int n5 = n + a5_0.a(random, 2);
                    float f = (float)(n3 + n4 + n5) * 0.333f + 0.5f;
                    Iterator iterator = OV.a(amv_2.b(amv_2.a(blockPos, -n3, -n4, -n5), amv_2.a(blockPos, n3, n4, n5)));
                    while (dz_0.c(iterator)) {
                        BlockPos blockPos2 = (BlockPos)dz_0.b(iterator);
                        if (!(amv_2.c(blockPos2, blockPos) <= (double)(f * f))) continue;
                        aV8.a(world, blockPos2, BlocksInvoker.t(this.b), 4);
                    }
                    blockPos = amv_2.a(blockPos, -(n + 1) + a5_0.a(random, 2 + n * 2), 0 - a5_0.a(random, 2), -(n + 1) + a5_0.a(random, 2 + n * 2));
                    ++n2;
                }
            }
            blockPos = amv_2.g(blockPos);
        }
    }

    public ia_0(Block block, int n) {
        super(false);
        this.b = block;
        this.c = n;
    }
}

