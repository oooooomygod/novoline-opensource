/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import deobf.EnumFacing;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import java.util.Random;

/*
 * Renamed from net.ic
 */
public class ic_2
extends ii_1 {
    private static IBlockState b;
    private static IBlockState c;

    public ic_2(boolean bl) {
        super(bl);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean a(World world, Random random, BlockPos blockPos) {
        int n = a5_0.a(random, 3) + a5_0.a(random, 2) + 6;
        int n2 = amv_2.j(blockPos);
        int n3 = amv_2.h(blockPos);
        int n4 = amv_2.i(blockPos);
        if (n3 >= 1 && n3 + n + 1 < 256) {
            int n5;
            int n6;
            BlockPos blockPos2 = amv_2.g(blockPos);
            Block block = BlockStateInvoker.getBlock(aV8.q(world, blockPos2));
            if (block != Blocks.grass && block != Blocks.dirt) {
                return false;
            }
            if (!this.a(world, blockPos, n)) {
                return false;
            }
            this.a(world, blockPos2);
            this.a(world, amv_2.f(blockPos2));
            this.a(world, amv_2.b(blockPos2));
            this.a(world, amv_2.f(amv_2.b(blockPos2)));
            EnumFacing enumFacing = abw_2.a(cs_1.HORIZONTAL, random);
            int n7 = n - a5_0.a(random, 4);
            int cfr_ignored_0 = 2 - a5_0.a(random, 3);
            int n8 = n2;
            int n9 = n4;
            int n10 = n3 + n - 1;
            for (n6 = 0; n6 < n; ++n6) {
                BlockPos blockPos3;
                Material material;
                if (n6 >= n7) {
                    void var12_16;
                    n8 += SJ.k(enumFacing);
                    n9 += SJ.a(enumFacing);
                    --var12_16;
                }
                if ((material = BlocksInvoker.getBlockState(BlockStateInvoker.getBlock(aV8.q(world, blockPos3 = new BlockPos(n8, n5 = n3 + n6, n9))))) != Material.air && material != Material.z) continue;
                this.b(world, blockPos3);
                this.b(world, amv_2.f(blockPos3));
                this.b(world, amv_2.b(blockPos3));
                this.b(world, amv_2.b(amv_2.f(blockPos3)));
            }
            n6 = -2;
            n5 = -2;
            while (true) {
                int n11 = -1;
                this.a(world, n8 + n6, n10 + n11, n9 + n5);
                this.a(world, 1 + n8 - n6, n10 + n11, n9 + n5);
                this.a(world, n8 + n6, n10 + n11, 1 + n9 - n5);
                this.a(world, 1 + n8 - n6, n10 + n11, 1 + n9 - n5);
                ++n5;
            }
        }
        return false;
    }

    private boolean a(World world, BlockPos blockPos, int n) {
        int n2 = amv_2.j(blockPos);
        int n3 = amv_2.h(blockPos);
        int n4 = amv_2.i(blockPos);
        z6_0 z6_02 = new z6_0();
        int n5 = 0;
        if (n5 <= n + 1) {
            int n6 = 1;
            n6 = 0;
            if (n5 >= n - 1) {
                n6 = 2;
            }
            int n7 = -n6;
            int n8 = -n6;
            while (true) {
                if (!this.a(BlockStateInvoker.getBlock(aV8.q(world, ain_1.a(z6_02, n2 + n7, n3 + n5, n4 + n8))))) {
                    return false;
                }
                ++n8;
            }
        }
        return true;
    }

    private void b(World world, BlockPos blockPos) {
        if (this.a(BlockStateInvoker.getBlock(aV8.q(world, blockPos)))) {
            this.a(world, blockPos, c);
        }
    }

    static {
        c = BlockStateInvoker.a(BlocksInvoker.t(Blocks.bO), gt_1.R, (Comparable)((Object)F3.DARK_OAK));
        b = BlockStateInvoker.a(BlockStateInvoker.a(aa1_0.a(Blocks.bM), gh_2.W, (Comparable)((Object)F3.DARK_OAK)), BlockLeaves.V, Boolean.FALSE);
    }

    private void a(World world, int n, int n2, int n3) {
        BlockPos blockPos = new BlockPos(n, n2, n3);
        Block block = BlockStateInvoker.getBlock(aV8.q(world, blockPos));
        if (BlocksInvoker.getBlockState(block) == Material.air) {
            this.a(world, blockPos, b);
        }
    }
}

