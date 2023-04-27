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
 * Renamed from net.fR
 */
public class fr_1
extends fc_2 {
    public static js_0 P = a7X.a(p6_0.a, 0, 3);

    @Override
    public int d(IBlockState iBlockState) {
        return P8.b((Integer)BlockStateInvoker.b(iBlockState, P));
    }

    @Override
    public Item a(IBlockState iBlockState, Random random, int n) {
        return null;
    }

    @Override
    protected a42 s() {
        return new a42(this, P);
    }

    @Override
    public IBlockState c(int n) {
        return BlockStateInvoker.a(this.m(), P, P8.d(n));
    }

    @Override
    public boolean a(World world, BlockPos blockPos, IBlockState iBlockState) {
        return this.a(BlockStateInvoker.getBlock(aV8.q(world, amv_2.g(blockPos))));
    }

    protected fr_1() {
        super(Material.F, MapColor.h);
        this.f(BlockStateInvoker.a(aXF.c(this.D), P, P8.d(0)));
        this.a(true);
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.25f, 1.0f);
        this.a((CreativeTabs)null);
    }

    @Override
    public Item d(World world, BlockPos blockPos) {
        return Items.nether_wart;
    }

    @Override
    protected boolean a(Block block) {
        return block == Blocks.s;
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, Random random) {
        int n = P8.b((Integer)BlockStateInvoker.b(iBlockState, P));
        if (n < 3 && a5_0.a(random, 10) == 0) {
            iBlockState = BlockStateInvoker.a(iBlockState, P, P8.d(n + 1));
            aV8.a(world, blockPos, iBlockState, 2);
        }
        super.a(world, blockPos, iBlockState, random);
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, float f, int n) {
        if (!world.isRemote) {
            int n2 = 1;
            if (P8.b((Integer)BlockStateInvoker.b(iBlockState, P)) >= 3) {
                n2 = 2 + a5_0.a(world.o, 3);
                n2 += a5_0.a(world.o, n + 1);
            }
            int n3 = 0;
            while (true) {
                fr_1.a(world, blockPos, new ItemStack(Items.nether_wart));
                ++n3;
            }
        }
    }

    @Override
    public int a(Random random) {
        return 0;
    }
}

