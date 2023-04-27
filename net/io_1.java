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
 * Renamed from net.iO
 */
public class io_1
extends i7_0 {
    private IBlockState e = BlockStateInvoker.a(BlockStateInvoker.a(abv_0.a(Blocks.bA), hp_2.Q, (Comparable)((Object)aAB.SAND)), hj_2.P, (Comparable)((Object)wj_2.BOTTOM));
    private IBlockState c = BlocksInvoker.t(Blocks.bG);
    private static k2_0 b = E6.a(E6.a(Blocks.sand), BlockSand.Q, an7_0.a(aSQ.SAND));
    private IBlockState d = db_2.a(Blocks.flowing_water);

    @Override
    public boolean a(World world, Random random, BlockPos blockPos) {
        while (aV8.k(world, blockPos) && amv_2.h(blockPos) > 2) {
            blockPos = amv_2.g(blockPos);
        }
        if (!E6.a(b, aV8.q(world, blockPos))) {
            return false;
        }
        int n = -2;
        int n2 = -2;
        while (!aV8.k(world, amv_2.a(blockPos, n, -1, n2)) || !aV8.k(world, amv_2.a(blockPos, n, -2, n2))) {
            ++n2;
        }
        return false;
    }
}

