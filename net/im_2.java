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
 * Renamed from net.im
 */
public class im_2
extends i7_0 {
    private IBlockState b;

    public im_2(a4b a4b2) {
        this.b = BlockStateInvoker.a(KW.a(Blocks.bN), fg_1.P, (Comparable)((Object)a4b2));
    }

    @Override
    public boolean a(World world, Random random, BlockPos blockPos) {
        Block block;
        while ((BlocksInvoker.getBlockState(block = BlockStateInvoker.getBlock(aV8.q(world, blockPos))) == Material.air || BlocksInvoker.getBlockState(block) == Material.z) && amv_2.h(blockPos) > 0) {
            blockPos = amv_2.g(blockPos);
        }
        int n = 0;
        while (true) {
            BlockPos blockPos2;
            if (aV8.k(world, blockPos2 = amv_2.a(blockPos, a5_0.a(random, 8) - a5_0.a(random, 8), a5_0.a(random, 4) - a5_0.a(random, 4), a5_0.a(random, 8) - a5_0.a(random, 8))) && KW.a(Blocks.bN, world, blockPos2, this.b)) {
                aV8.a(world, blockPos2, this.b, 2);
            }
            ++n;
        }
    }
}

