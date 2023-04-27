/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.ListInvoker;
import deobf.EntityPlayer;
import deobf.IBlockAccess;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.item.ItemStack;
import deobf.TileEntity;
import java.util.List;

/*
 * Renamed from net.gG
 */
public class gg_1
extends BlockLeaves {
    public static JC<F3> W = xu_0.a(ou_0.a, F3.class, gg_1::lambda$static$0);

    @Override
    protected ItemStack b(IBlockState iBlockState) {
        return new ItemStack(px_0.a(this), 1, aER.b((F3)((Object)BlockStateInvoker.b(iBlockState, W))));
    }

    @Override
    public int e(IBlockState iBlockState) {
        if (BlockStateInvoker.getBlock(iBlockState) != this) {
            return super.e(iBlockState);
        }
        F3 f3 = (F3)((Object)BlockStateInvoker.b(iBlockState, W));
        return f3 == F3.SPRUCE ? zm_1.a() : (f3 == F3.BIRCH ? zm_1.c() : super.e(iBlockState));
    }

    private static boolean lambda$static$0(F3 f3) {
        return aER.b(f3) < 4;
    }

    @Override
    public F3 a(int n) {
        return aER.a((n & 3) % 4);
    }

    @Override
    public int a(IBlockAccess iBlockAccess, BlockPos blockPos, int n) {
        IBlockState iBlockState = aG3.c(iBlockAccess, blockPos);
        if (BlockStateInvoker.getBlock(iBlockState) == this) {
            F3 f3 = (F3)((Object)BlockStateInvoker.b(iBlockState, W));
            if (f3 == F3.SPRUCE) {
                return zm_1.a();
            }
            if (f3 == F3.BIRCH) {
                return zm_1.c();
            }
        }
        return super.a(iBlockAccess, blockPos, n);
    }

    @Override
    public IBlockState c(int n) {
        return BlockStateInvoker.a(BlockStateInvoker.a(BlockStateInvoker.a(this.m(), W, (Comparable)((Object)this.a(n))), T, auk_2.b((n & 4) == 0)), V, auk_2.b((n & 8) > 0));
    }

    @Override
    public void a(World world, EntityPlayer entityPlayer, BlockPos blockPos, IBlockState iBlockState, TileEntity tileEntity) {
        if (!world.isRemote && a6w_0.n(entityPlayer) != null && act_2.k(a6w_0.n(entityPlayer)) == Items.shears) {
            a6w_0.a(entityPlayer, aop_1.v[Block.a(this)]);
            gg_1.a(world, blockPos, new ItemStack(px_0.a(this), 1, aER.b((F3)((Object)BlockStateInvoker.b(iBlockState, W)))));
        } else {
            super.a(world, entityPlayer, blockPos, iBlockState, tileEntity);
        }
    }

    @Override
    public int d(IBlockState iBlockState) {
        int n = 0;
        n |= aER.b((F3)((Object)BlockStateInvoker.b(iBlockState, W)));
        if (!auk_2.a((Boolean)BlockStateInvoker.b(iBlockState, T))) {
            n |= 4;
        }
        if (auk_2.a((Boolean)BlockStateInvoker.b(iBlockState, V))) {
            n |= 8;
        }
        return n;
    }

    @Override
    public int h(IBlockState iBlockState) {
        return aER.b((F3)((Object)BlockStateInvoker.b(iBlockState, W)));
    }

    @Override
    protected int a(IBlockState iBlockState) {
        return BlockStateInvoker.b(iBlockState, W) == F3.JUNGLE ? 40 : super.a(iBlockState);
    }

    @Override
    protected a42 s() {
        return new a42(this, W, V, T);
    }

    @Override
    public void a(Item item, CreativeTabs creativeTabs, List<ItemStack> list) {
        ListInvoker.add(list, new ItemStack(item, 1, aER.b(F3.OAK)));
        ListInvoker.add(list, new ItemStack(item, 1, aER.b(F3.SPRUCE)));
        ListInvoker.add(list, new ItemStack(item, 1, aER.b(F3.BIRCH)));
        ListInvoker.add(list, new ItemStack(item, 1, aER.b(F3.JUNGLE)));
    }

    public gg_1() {
        this.f(BlockStateInvoker.a(BlockStateInvoker.a(BlockStateInvoker.a(aXF.c(this.D), W, (Comparable)((Object)F3.OAK)), V, Boolean.TRUE), T, Boolean.TRUE));
    }

    @Override
    protected void b(World world, BlockPos blockPos, IBlockState iBlockState, int n) {
        if (BlockStateInvoker.b(iBlockState, W) == F3.OAK && a5_0.a(world.o, n) == 0) {
            gg_1.a(world, blockPos, new ItemStack(Items.apple, 1, 0));
        }
    }
}

