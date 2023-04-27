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
 * Renamed from net.i4
 */
public class i4_0
extends ii_1 {
    private static IBlockState b;
    private static IBlockState c;

    @Override
    public boolean a(World world, Random random, BlockPos blockPos) {
        int n = a5_0.a(random, 5) + 7;
        int n2 = n - a5_0.a(random, 2) - 3;
        int n3 = n - n2;
        int n4 = 1 + a5_0.a(random, n3 + 1);
        if (amv_2.h(blockPos) >= 1 && amv_2.h(blockPos) + n + 1 <= 256) {
            for (int i = amv_2.h(blockPos); i <= amv_2.h(blockPos) + 1 + n; ++i) {
                int n5 = 1;
                n5 = i - amv_2.h(blockPos) < n2 ? 0 : n4;
                z6_0 z6_02 = new z6_0();
                for (int j = amv_2.j(blockPos) - n5; j <= amv_2.j(blockPos) + n5; ++j) {
                    for (int k = amv_2.i(blockPos) - n5; k <= amv_2.i(blockPos) + n5; ++k) {
                        if (i < 256 && this.a(BlockStateInvoker.getBlock(aV8.q(world, ain_1.a(z6_02, j, i, k))))) continue;
                    }
                }
            }
            return false;
        }
        return false;
    }

    public i4_0() {
        super(false);
    }

    static {
        c = BlockStateInvoker.a(BlocksInvoker.t(Blocks.b2), gj_0.R, (Comparable)((Object)F3.SPRUCE));
        b = BlockStateInvoker.a(BlockStateInvoker.a(aa1_0.a(Blocks.bP), gg_1.W, (Comparable)((Object)F3.SPRUCE)), BlockLeaves.V, Boolean.FALSE);
    }
}

