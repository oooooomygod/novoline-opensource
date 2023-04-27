/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import java.util.Random;

/*
 * Renamed from net.fn
 */
public class fn_1
extends fc_2
implements ale_1 {
    public static js_0 P = a7X.a(DK.a, 0, 7);

    @Override
    public void a(World world, Random random, BlockPos blockPos, IBlockState iBlockState) {
        this.e(world, blockPos, iBlockState);
    }

    @Override
    public Item d(World world, BlockPos blockPos) {
        return this.a();
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, float f, int n) {
        int n2;
        super.a(world, blockPos, iBlockState, f, 0);
        if (!world.isRemote && (n2 = P8.b((Integer)BlockStateInvoker.b(iBlockState, P))) >= 7) {
            int n3 = 3 + n;
            for (int i = 0; i < n3; ++i) {
                if (a5_0.a(world.o, 15) > n2) continue;
                fn_1.a(world, blockPos, new ItemStack(this.a(), 1, 0));
            }
        }
    }

    @Override
    protected a42 s() {
        return new a42(this, P);
    }

    @Override
    public boolean a(World world, BlockPos blockPos, IBlockState iBlockState) {
        return (aV8.g(world, blockPos) >= 8 || aV8.w(world, blockPos)) && this.a(BlockStateInvoker.getBlock(aV8.q(world, amv_2.g(blockPos))));
    }

    protected fn_1() {
        this.f(BlockStateInvoker.a(aXF.c(this.D), P, P8.d(0)));
        this.a(true);
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.25f, 1.0f);
        this.a((CreativeTabs)null);
        this.setHardness(0.0f);
        this.a(x);
        this.R();
    }

    public void e(World world, BlockPos blockPos, IBlockState iBlockState) {
        int n = P8.b((Integer)BlockStateInvoker.b(iBlockState, P)) + MathHelper.a(world.o, 2, 5);
        if (n > 7) {
            n = 7;
        }
        aV8.a(world, blockPos, BlockStateInvoker.a(iBlockState, P, P8.d(n)), 2);
    }

    protected Item a() {
        return Items.wheat_seeds;
    }

    @Override
    public Item a(IBlockState iBlockState, Random random, int n) {
        return P8.b((Integer)BlockStateInvoker.b(iBlockState, P)) == 7 ? this.b() : this.a();
    }

    @Override
    public IBlockState c(int n) {
        return BlockStateInvoker.a(this.m(), P, P8.d(n));
    }

    @Override
    public boolean a(World world, BlockPos blockPos, IBlockState iBlockState, boolean bl) {
        return P8.b((Integer)BlockStateInvoker.b(iBlockState, P)) < 7;
    }

    protected static float a(Block block, World world, BlockPos blockPos) {
        float f = 1.0f;
        BlockPos blockPos2 = amv_2.g(blockPos);
        int n = -1;
        int n2 = -1;
        while (true) {
            float f2 = 0.0f;
            IBlockState iBlockState = aV8.q(world, amv_2.a(blockPos2, n, 0, n2));
            if (BlockStateInvoker.getBlock(iBlockState) == Blocks.al) {
                f2 = 1.0f;
                if (P8.b((Integer)BlockStateInvoker.b(iBlockState, gk_2.P)) > 0) {
                    f2 = 3.0f;
                }
            }
            f += (f2 /= 4.0f);
            ++n2;
        }
    }

    @Override
    protected boolean a(Block block) {
        return block == Blocks.al;
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, Random random) {
        float f;
        int n;
        super.a(world, blockPos, iBlockState, random);
        if (aV8.l(world, amv_2.e(blockPos)) >= 9 && (n = P8.b((Integer)BlockStateInvoker.b(iBlockState, P))) < 7 && a5_0.a(random, (int)(25.0f / (f = fn_1.a(this, world, blockPos))) + 1) == 0) {
            aV8.a(world, blockPos, BlockStateInvoker.a(iBlockState, P, P8.d(n + 1)), 2);
        }
    }

    @Override
    public int d(IBlockState iBlockState) {
        return P8.b((Integer)BlockStateInvoker.b(iBlockState, P));
    }

    @Override
    public boolean b(World world, Random random, BlockPos blockPos, IBlockState iBlockState) {
        return true;
    }

    protected Item b() {
        return Items.wheat;
    }
}

