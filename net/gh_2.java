/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.ListInvoker;
import deobf.EntityPlayer;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.item.ItemStack;
import deobf.TileEntity;
import java.util.List;

/*
 * Renamed from net.gh
 */
public class gh_2
extends BlockLeaves {
    public static JC<F3> W = xu_0.a(NA.a, F3.class, new a5G());

    @Override
    public int h(IBlockState iBlockState) {
        return aER.b((F3)((Object)BlockStateInvoker.b(iBlockState, W)));
    }

    @Override
    protected void b(World world, BlockPos blockPos, IBlockState iBlockState, int n) {
        if (BlockStateInvoker.b(iBlockState, W) == F3.DARK_OAK && a5_0.a(world.o, n) == 0) {
            gh_2.a(world, blockPos, new ItemStack(Items.apple, 1, 0));
        }
    }

    @Override
    public F3 a(int n) {
        return aER.a((n & 3) + 4);
    }

    @Override
    protected ItemStack b(IBlockState iBlockState) {
        return new ItemStack(px_0.a(this), 1, aER.b((F3)((Object)BlockStateInvoker.b(iBlockState, W))) - 4);
    }

    @Override
    public void a(World world, EntityPlayer entityPlayer, BlockPos blockPos, IBlockState iBlockState, TileEntity tileEntity) {
        if (!world.isRemote && a6w_0.n(entityPlayer) != null && act_2.k(a6w_0.n(entityPlayer)) == Items.shears) {
            a6w_0.a(entityPlayer, aop_1.v[Block.a(this)]);
            gh_2.a(world, blockPos, new ItemStack(px_0.a(this), 1, aER.b((F3)((Object)BlockStateInvoker.b(iBlockState, W))) - 4));
        } else {
            super.a(world, entityPlayer, blockPos, iBlockState, tileEntity);
        }
    }

    @Override
    protected a42 s() {
        return new a42(this, W, V, T);
    }

    @Override
    public int d(IBlockState iBlockState) {
        int n = 0;
        n |= aER.b((F3)((Object)BlockStateInvoker.b(iBlockState, W))) - 4;
        if (!auk_2.a((Boolean)BlockStateInvoker.b(iBlockState, T))) {
            n |= 4;
        }
        if (auk_2.a((Boolean)BlockStateInvoker.b(iBlockState, V))) {
            n |= 8;
        }
        return n;
    }

    public gh_2() {
        this.f(BlockStateInvoker.a(BlockStateInvoker.a(BlockStateInvoker.a(aXF.c(this.D), W, (Comparable)((Object)F3.ACACIA)), V, Boolean.TRUE), T, Boolean.TRUE));
    }

    @Override
    public void a(Item item, CreativeTabs creativeTabs, List<ItemStack> list) {
        ListInvoker.add(list, new ItemStack(item, 1, 0));
        ListInvoker.add(list, new ItemStack(item, 1, 1));
    }

    @Override
    public IBlockState c(int n) {
        return BlockStateInvoker.a(BlockStateInvoker.a(BlockStateInvoker.a(this.m(), W, (Comparable)((Object)this.a(n))), T, auk_2.b((n & 4) == 0)), V, auk_2.b((n & 8) > 0));
    }

    @Override
    public int g(World world, BlockPos blockPos) {
        IBlockState iBlockState = aV8.q(world, blockPos);
        return BlockStateInvoker.getBlock(iBlockState).d(iBlockState) & 3;
    }
}

