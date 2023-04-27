/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import java.util.Random;

/*
 * Renamed from net.iZ
 */
public class iz_1
extends i7_0 {
    @Override
    public boolean a(World world, Random random, BlockPos blockPos) {
        int n = 0;
        while (true) {
            BlockPos blockPos2;
            if (aV8.k(world, blockPos2 = amv_2.a(blockPos, a5_0.a(random, 8) - a5_0.a(random, 8), a5_0.a(random, 4) - a5_0.a(random, 4), a5_0.a(random, 8) - a5_0.a(random, 8))) && BlockStateInvoker.getBlock(aV8.q(world, amv_2.g(blockPos2))) == Blocks.bu) {
                aV8.a(world, blockPos2, abb_1.a(Blocks.c), 2);
            }
            ++n;
        }
    }
}

