/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import deobf.IBlockAccess;
import java.util.Random;

/*
 * Renamed from net.gP
 */
public class gp_1
extends Block {
    public static J_ P = aWq.a(abf_1.a);

    @Override
    protected a42 s() {
        return new a42(this, P);
    }

    @Override
    public IBlockState a(IBlockState iBlockState, IBlockAccess iBlockAccess, BlockPos blockPos) {
        Block block = BlockStateInvoker.getBlock(aG3.c(iBlockAccess, amv_2.e(blockPos)));
        return BlockStateInvoker.a(iBlockState, P, auk_2.b(block == Blocks.bq || block == Blocks.cm));
    }

    @Override
    public int d(IBlockState iBlockState) {
        return 0;
    }

    @Override
    public void b(World world, BlockPos blockPos, IBlockState iBlockState, Random random) {
        super.b(world, blockPos, iBlockState, random);
        if (a5_0.a(random, 10) == 0) {
            aV8.a(world, B7.TOWN_AURA, (float)amv_2.j(blockPos) + a5_0.e(random), (float)amv_2.h(blockPos) + 1.1f, (float)amv_2.i(blockPos) + a5_0.e(random), 0.0, 0.0, 0.0, new int[0]);
        }
    }

    protected gp_1() {
        super(Material.grass, MapColor.k);
        this.f(BlockStateInvoker.a(aXF.c(this.D), P, Boolean.FALSE));
        this.a(true);
        this.a(CreativeTabs.m);
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, Random random) {
        if (!world.isRemote) {
            if (aV8.l(world, amv_2.e(blockPos)) < 4 && BlockStateInvoker.getBlock(aV8.q(world, amv_2.e(blockPos))).H() > 2) {
                aV8.a(world, blockPos, BlockStateInvoker.a(Blocks.dirt.m(), BlockDirt.Q, (Comparable)((Object)a6s_0.DIRT)));
            } else if (aV8.l(world, amv_2.e(blockPos)) >= 9) {
                int n = 0;
                while (true) {
                    BlockPos blockPos2 = amv_2.a(blockPos, a5_0.a(random, 3) - 1, a5_0.a(random, 5) - 3, a5_0.a(random, 3) - 1);
                    IBlockState iBlockState2 = aV8.q(world, blockPos2);
                    Block block = BlockStateInvoker.getBlock(aV8.q(world, amv_2.e(blockPos2)));
                    if (BlockStateInvoker.getBlock(iBlockState2) == Blocks.dirt && BlockStateInvoker.b(iBlockState2, BlockDirt.Q) == a6s_0.DIRT && aV8.l(world, amv_2.e(blockPos2)) >= 4 && block.H() <= 2) {
                        aV8.a(world, blockPos2, this.m());
                    }
                    ++n;
                }
            }
        }
    }

    @Override
    public Item a(IBlockState iBlockState, Random random, int n) {
        return Blocks.dirt.a(BlockStateInvoker.a(Blocks.dirt.m(), BlockDirt.Q, (Comparable)((Object)a6s_0.DIRT)), random, n);
    }
}

