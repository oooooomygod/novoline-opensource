/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import deobf.EnumFacing;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import java.util.Random;

/*
 * Renamed from net.iD
 */
public class id_1
extends ii_1 {
    private static IBlockState d;
    private int g;
    private IBlockState c;
    private IBlockState f;
    private boolean b;
    private static IBlockState e;

    public id_1(boolean bl) {
        this(bl, 4, e, d, false);
    }

    static {
        e = BlockStateInvoker.a(BlocksInvoker.t(Blocks.b2), gj_0.R, (Comparable)((Object)F3.OAK));
        d = BlockStateInvoker.a(BlockStateInvoker.a(aa1_0.a(Blocks.bP), gg_1.W, (Comparable)((Object)F3.OAK)), BlockLeaves.V, Boolean.FALSE);
    }

    private void a(World world, int n, BlockPos blockPos, EnumFacing enumFacing) {
        this.a(world, blockPos, BlockStateInvoker.a(BlockStateInvoker.a(BlocksInvoker.t(Blocks.aN), gw_1.Q, P8.d(n)), gw_1.P, (Comparable)((Object)enumFacing)));
    }

    private void b(World world, BlockPos blockPos, J_ j_) {
        this.a(world, blockPos, BlockStateInvoker.a(BlocksInvoker.t(Blocks.as), j_, Boolean.TRUE));
    }

    /*
     * WARNING - void declaration
     */
    private void a(World world, BlockPos blockPos, J_ j_) {
        this.b(world, blockPos, j_);
        blockPos = amv_2.g(blockPos);
        while (BlocksInvoker.getBlockState(BlockStateInvoker.getBlock(aV8.q(world, blockPos))) == Material.air) {
            void var4_4;
            this.b(world, blockPos, j_);
            blockPos = amv_2.g(blockPos);
            --var4_4;
        }
    }

    public id_1(boolean bl, int n, IBlockState iBlockState, IBlockState iBlockState2, boolean bl2) {
        super(bl);
        this.g = n;
        this.f = iBlockState;
        this.c = iBlockState2;
        this.b = bl2;
    }

    @Override
    public boolean a(World world, Random random, BlockPos blockPos) {
        int n = a5_0.a(random, 3) + this.g;
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
}

