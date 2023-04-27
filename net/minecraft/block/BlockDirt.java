/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.ListInvoker;
import net.*;
import net.minecraft.init.Blocks;
import deobf.IBlockAccess;
import net.minecraft.item.ItemStack;
import java.util.List;

public class BlockDirt
extends Block {
    public static J_ P;
    public static JC<a6s_0> Q;

    @Override
    public MapColor g(IBlockState iBlockState) {
        return av4_0.a((a6s_0)((Object)BlockStateInvoker.b(iBlockState, Q)));
    }

    @Override
    public int g(World world, BlockPos blockPos) {
        IBlockState iBlockState = aV8.q(world, blockPos);
        return BlockStateInvoker.getBlock(iBlockState) != this ? 0 : av4_0.b((a6s_0)((Object)BlockStateInvoker.b(iBlockState, Q)));
    }

    @Override
    public IBlockState a(IBlockState iBlockState, IBlockAccess iBlockAccess, BlockPos blockPos) {
        if (BlockStateInvoker.b(iBlockState, Q) == a6s_0.PODZOL) {
            Block block = BlockStateInvoker.getBlock(aG3.c(iBlockAccess, amv_2.e(blockPos)));
            iBlockState = BlockStateInvoker.a(iBlockState, P, auk_2.b(block == Blocks.bq || block == Blocks.cm));
        }
        return iBlockState;
    }

    static {
        Q = xu_0.a(apd_2.a, a6s_0.class);
        P = aWq.a(apd_2.b);
    }

    @Override
    public void a(Item item, CreativeTabs creativeTabs, List<ItemStack> list) {
        ListInvoker.add(list, new ItemStack(this, 1, av4_0.b(a6s_0.DIRT)));
        ListInvoker.add(list, new ItemStack(this, 1, av4_0.b(a6s_0.COARSE_DIRT)));
        ListInvoker.add(list, new ItemStack(this, 1, av4_0.b(a6s_0.PODZOL)));
    }

    @Override
    public int d(IBlockState iBlockState) {
        return av4_0.b((a6s_0)((Object)BlockStateInvoker.b(iBlockState, Q)));
    }

    @Override
    public int h(IBlockState iBlockState) {
        a6s_0 a6s_02 = (a6s_0)((Object)BlockStateInvoker.b(iBlockState, Q));
        if (a6s_02 == a6s_0.PODZOL) {
            a6s_02 = a6s_0.DIRT;
        }
        return av4_0.b(a6s_02);
    }

    @Override
    protected a42 s() {
        return new a42(this, Q, P);
    }

    @Override
    public IBlockState c(int n) {
        return BlockStateInvoker.a(this.m(), Q, (Comparable)((Object)av4_0.a(n)));
    }

    protected BlockDirt() {
        super(Material.ground);
        this.f(BlockStateInvoker.a(BlockStateInvoker.a(aXF.c(this.D), Q, (Comparable)((Object)a6s_0.DIRT)), P, Boolean.FALSE));
        this.a(CreativeTabs.m);
    }
}

