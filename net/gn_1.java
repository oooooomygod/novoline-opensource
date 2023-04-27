/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.ListInvoker;
import net.minecraft.block.BlockPos;
import net.minecraft.item.ItemStack;
import java.util.List;

/*
 * Renamed from net.gN
 */
public class gn_1
extends gd_2 {
    public static JC<YZ> U = xu_0.a(E9.a, YZ.class);

    public gn_1() {
        super(Material.w, false);
        this.f(BlockStateInvoker.a(BlockStateInvoker.a(BlockStateInvoker.a(BlockStateInvoker.a(BlockStateInvoker.a(aXF.c(this.D), T, Boolean.FALSE), R, Boolean.FALSE), P, Boolean.FALSE), S, Boolean.FALSE), U, (Comparable)((Object)YZ.WHITE)));
        this.a(CreativeTabs.l);
    }

    @Override
    public a5w_0 K() {
        return a5w_0.TRANSLUCENT;
    }

    @Override
    public void a(Item item, CreativeTabs creativeTabs, List<ItemStack> list) {
        for (int i = 0; i < YZ.values().length; ++i) {
            ListInvoker.add(list, new ItemStack(item, 1, i));
        }
    }

    @Override
    public int h(IBlockState iBlockState) {
        return my_2.a((YZ)((Object)BlockStateInvoker.b(iBlockState, U)));
    }

    @Override
    public int d(IBlockState iBlockState) {
        return my_2.a((YZ)((Object)BlockStateInvoker.b(iBlockState, U)));
    }

    @Override
    public MapColor g(IBlockState iBlockState) {
        return my_2.b((YZ)((Object)BlockStateInvoker.b(iBlockState, U)));
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState) {
        if (!world.isRemote) {
            DO.a(world, blockPos);
        }
    }

    @Override
    public IBlockState c(int n) {
        return BlockStateInvoker.a(this.m(), U, (Comparable)((Object)my_2.a(n)));
    }

    @Override
    public void c(World world, BlockPos blockPos, IBlockState iBlockState) {
        if (!world.isRemote) {
            DO.a(world, blockPos);
        }
    }

    @Override
    protected a42 s() {
        return new a42(this, T, R, S, P, U);
    }
}

