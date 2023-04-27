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
 * Renamed from net.in
 */
public class in_2
extends ii_1 {
    private static IBlockState d;
    private static IBlockState c;
    private boolean b;

    public in_2(boolean bl, boolean bl2) {
        super(bl);
        this.b = bl2;
    }

    @Override
    public boolean a(World world, Random random, BlockPos blockPos) {
        int n = a5_0.a(random, 3) + 5;
        if (this.b) {
            n += a5_0.a(random, 7);
        }
        if (amv_2.h(blockPos) >= 1 && amv_2.h(blockPos) + n + 1 <= 256) {
            for (int i = amv_2.h(blockPos); i <= amv_2.h(blockPos) + 1 + n; ++i) {
                int n2 = 1;
                if (i == amv_2.h(blockPos)) {
                    n2 = 0;
                }
                if (i >= amv_2.h(blockPos) + 1 + n - 2) {
                    n2 = 2;
                }
                z6_0 z6_02 = new z6_0();
                for (int j = amv_2.j(blockPos) - n2; j <= amv_2.j(blockPos) + n2; ++j) {
                    for (int k = amv_2.i(blockPos) - n2; k <= amv_2.i(blockPos) + n2; ++k) {
                        if (i < 256 && this.a(BlockStateInvoker.getBlock(aV8.q(world, ain_1.a(z6_02, j, i, k))))) continue;
                    }
                }
            }
            return false;
        }
        return false;
    }

    static {
        c = BlockStateInvoker.a(BlocksInvoker.t(Blocks.b2), gj_0.R, (Comparable)((Object)F3.BIRCH));
        d = BlockStateInvoker.a(BlockStateInvoker.a(aa1_0.a(Blocks.bP), gg_1.W, (Comparable)((Object)F3.BIRCH)), gg_1.V, Boolean.FALSE);
    }
}

