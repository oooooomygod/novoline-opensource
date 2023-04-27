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
 * Renamed from net.io
 */
public abstract class io_2
extends ii_1 {
    protected IBlockState e;
    protected IBlockState b;
    protected int d;
    protected int c;

    private boolean c(World world, BlockPos blockPos, int n) {
        boolean bl = true;
        if (amv_2.h(blockPos) >= 1 && amv_2.h(blockPos) + n + 1 <= 256) {
            int n2 = 0;
            if (n2 <= 1 + n) {
                int n3 = 2;
                n3 = 1;
                int n4 = -n3;
                int n5 = -n3;
                while (true) {
                    if (amv_2.h(blockPos) + n2 < 0 || amv_2.h(blockPos) + n2 >= 256 || !this.a(BlockStateInvoker.getBlock(aV8.q(world, amv_2.a(blockPos, n4, n2, n5))))) {
                        bl = false;
                    }
                    ++n5;
                }
            }
            return bl;
        }
        return false;
    }

    protected void b(World world, BlockPos blockPos, int n) {
        int n2 = n * n;
        for (int i = -n; i <= n; ++i) {
            for (int j = -n; j <= n; ++j) {
                BlockPos blockPos2;
                Material material;
                if (i * i + j * j > n2 || (material = BlocksInvoker.getBlockState(BlockStateInvoker.getBlock(aV8.q(world, blockPos2 = amv_2.a(blockPos, i, 0, j))))) != Material.air && material != Material.z) continue;
                this.a(world, blockPos2, this.e);
            }
        }
    }

    protected boolean a(World world, Random random, BlockPos blockPos, int n) {
        return this.c(world, blockPos, n) && this.a(blockPos, world);
    }

    public io_2(boolean bl, int n, int n2, IBlockState iBlockState, IBlockState iBlockState2) {
        super(bl);
        this.c = n;
        this.d = n2;
        this.b = iBlockState;
        this.e = iBlockState2;
    }

    private boolean a(BlockPos blockPos, World world) {
        BlockPos blockPos2 = amv_2.g(blockPos);
        Block block = BlockStateInvoker.getBlock(aV8.q(world, blockPos2));
        if ((block == Blocks.grass || block == Blocks.dirt) && amv_2.h(blockPos) >= 2) {
            this.a(world, blockPos2);
            this.a(world, amv_2.f(blockPos2));
            this.a(world, amv_2.b(blockPos2));
            this.a(world, amv_2.f(amv_2.b(blockPos2)));
            return true;
        }
        return false;
    }

    protected int a(Random random) {
        int n = a5_0.a(random, 3) + this.c;
        if (this.d > 1) {
            n += a5_0.a(random, this.d);
        }
        return n;
    }

    protected void a(World world, BlockPos blockPos, int n) {
        int n2 = n * n;
        for (int i = -n; i <= n + 1; ++i) {
            for (int j = -n; j <= n + 1; ++j) {
                BlockPos blockPos2;
                Material material;
                int n3 = i - 1;
                int n4 = j - 1;
                if (i * i + j * j > n2 && n3 * n3 + n4 * n4 > n2 && i * i + n4 * n4 > n2 && n3 * n3 + j * j > n2 || (material = BlocksInvoker.getBlockState(BlockStateInvoker.getBlock(aV8.q(world, blockPos2 = amv_2.a(blockPos, i, 0, j))))) != Material.air && material != Material.z) continue;
                this.a(world, blockPos2, this.e);
            }
        }
    }
}

