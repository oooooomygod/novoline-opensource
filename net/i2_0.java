/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.MathInvoker;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import java.util.Random;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.i2
 */
public class i2_0
extends io_2 {
    private static IBlockState i;
    private static IBlockState f;
    private boolean h;
    private static IBlockState g;

    @Override
    public boolean a(World world, Random random, BlockPos blockPos) {
        int n = this.a(random);
        if (!this.a(world, random, blockPos, n)) {
            return false;
        }
        this.a(world, amv_2.j(blockPos), amv_2.i(blockPos), amv_2.h(blockPos) + n, 0, random);
        for (int i = 0; i < n; ++i) {
            Block block = BlockStateInvoker.getBlock(aV8.q(world, amv_2.c(blockPos, i)));
            if (BlocksInvoker.getBlockState(block) == Material.air || BlocksInvoker.getBlockState(block) == Material.z) {
                this.a(world, amv_2.c(blockPos, i), this.b);
            }
            if (i >= n - 1) continue;
            block = BlockStateInvoker.getBlock(aV8.q(world, amv_2.a(blockPos, 1, i, 0)));
            if (BlocksInvoker.getBlockState(block) == Material.air || BlocksInvoker.getBlockState(block) == Material.z) {
                this.a(world, amv_2.a(blockPos, 1, i, 0), this.b);
            }
            if (BlocksInvoker.getBlockState(block = BlockStateInvoker.getBlock(aV8.q(world, amv_2.a(blockPos, 1, i, 1)))) == Material.air || BlocksInvoker.getBlockState(block) == Material.z) {
                this.a(world, amv_2.a(blockPos, 1, i, 1), this.b);
            }
            if (BlocksInvoker.getBlockState(block = BlockStateInvoker.getBlock(aV8.q(world, amv_2.a(blockPos, 0, i, 1)))) != Material.air && BlocksInvoker.getBlockState(block) != Material.z) continue;
            this.a(world, amv_2.a(blockPos, 0, i, 1), this.b);
        }
        return true;
    }

    static {
        f = BlockStateInvoker.a(BlocksInvoker.t(Blocks.b2), gj_0.R, (Comparable)((Object)F3.SPRUCE));
        g = BlockStateInvoker.a(BlockStateInvoker.a(aa1_0.a(Blocks.bP), gg_1.W, (Comparable)((Object)F3.SPRUCE)), BlockLeaves.V, Boolean.FALSE);
        i = BlockStateInvoker.a(BlocksInvoker.t(Blocks.dirt), BlockDirt.Q, (Comparable)((Object)a6s_0.PODZOL));
    }

    public i2_0(boolean bl, boolean bl2) {
        super(bl, 13, 15, f, g);
        this.h = bl2;
    }

    private void b(World world, BlockPos blockPos) {
        int n = -2;
        int n2 = -2;
        while (true) {
            if (MathInvoker.a(n) != 2 || MathInvoker.a(n2) != 2) {
                this.c(world, amv_2.a(blockPos, n, 0, n2));
            }
            ++n2;
        }
    }

    private void a(World world, int n, int n2, int n3, int n4, Random random) {
        int n5 = a5_0.a(random, 5) + (this.h ? this.c : 3);
        int n6 = 0;
        for (int i = n3 - n5; i <= n3; ++i) {
            int n7 = n3 - i;
            int n8 = n4 + MathHelper.f((float)n7 / (float)n5 * 3.5f);
            this.a(world, new BlockPos(n, i, n2), n8 + (n8 == n6 && (i & 1) == 0 ? 1 : 0));
            n6 = n8;
        }
    }

    private void c(World world, BlockPos blockPos) {
        int n = 2;
        while (true) {
            BlockPos blockPos2;
            Block block;
            if ((block = BlockStateInvoker.getBlock(aV8.q(world, blockPos2 = amv_2.c(blockPos, n)))) == Blocks.grass || block == Blocks.dirt) {
                this.a(world, blockPos2, i);
                break;
            }
            if (BlocksInvoker.getBlockState(block) != Material.air) break;
            --n;
        }
    }

    @Override
    public void a(World world, Random random, BlockPos blockPos) {
        this.b(world, amv_2.a(amv_2.d(blockPos)));
        this.b(world, amv_2.a(amv_2.e(blockPos, 2)));
        this.b(world, amv_2.a(amv_2.d(blockPos), 2));
        this.b(world, amv_2.a(amv_2.e(blockPos, 2), 2));
        int n = 0;
        while (true) {
            int n2 = a5_0.a(random, 64);
            int n3 = n2 % 8;
            int n4 = n2 / 8;
            if (n3 == 7 || n4 == 7) {
                this.b(world, amv_2.a(blockPos, -3 + n3, 0, -3 + n4));
            }
            ++n;
        }
    }
}

