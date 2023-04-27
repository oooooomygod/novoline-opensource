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
 * Renamed from net.i8
 */
public class i8_0
extends i7_0 {
    @Override
    public boolean a(World world, Random random, BlockPos blockPos) {
        int n = 0;
        while (true) {
            BlockPos blockPos2;
            if (BlocksInvoker.g(Blocks.aQ, world, blockPos2 = amv_2.a(blockPos, a5_0.a(random, 8) - a5_0.a(random, 8), a5_0.a(random, 4) - a5_0.a(random, 4), a5_0.a(random, 8) - a5_0.a(random, 8))) && BlockStateInvoker.getBlock(aV8.q(world, amv_2.g(blockPos2))) == Blocks.grass) {
                aV8.a(world, blockPos2, BlocksInvoker.t(Blocks.aQ), 2);
            }
            ++n;
        }
    }
}

