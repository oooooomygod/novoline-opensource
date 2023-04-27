/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.ListInvoker;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import deobf.EntityPlayer;
import deobf.IBlockAccess;
import net.minecraft.item.ItemStack;
import deobf.TileEntity;
import java.util.List;
import java.util.Random;

/*
 * Renamed from net.fG
 */
public class fg_1
extends fc_2
implements ale_1 {
    public static JC<a4b> P = xu_0.a(ST.a, a4b.class);

    @Override
    public int g(World world, BlockPos blockPos) {
        IBlockState iBlockState = aV8.q(world, blockPos);
        return BlockStateInvoker.getBlock(iBlockState).d(iBlockState);
    }

    @Override
    public void a(World world, EntityPlayer entityPlayer, BlockPos blockPos, IBlockState iBlockState, TileEntity tileEntity) {
        if (!world.isRemote && a6w_0.n(entityPlayer) != null && act_2.k(a6w_0.n(entityPlayer)) == Items.shears) {
            a6w_0.a(entityPlayer, aop_1.v[Block.a(this)]);
            fg_1.a(world, blockPos, new ItemStack(Blocks.bN, 1, aW5.a((a4b)((Object)BlockStateInvoker.b(iBlockState, P)))));
        } else {
            super.a(world, entityPlayer, blockPos, iBlockState, tileEntity);
        }
    }

    @Override
    public boolean b(World world, Random random, BlockPos blockPos, IBlockState iBlockState) {
        return true;
    }

    @Override
    public int e(IBlockState iBlockState) {
        if (BlockStateInvoker.getBlock(iBlockState) != this) {
            return super.e(iBlockState);
        }
        a4b a4b2 = (a4b)((Object)BlockStateInvoker.b(iBlockState, P));
        return a4b2 == a4b.DEAD_BUSH ? 0xFFFFFF : zl_1.a(0.5, 1.0);
    }

    @Override
    public void a(Item item, CreativeTabs creativeTabs, List<ItemStack> list) {
        int n = 1;
        while (true) {
            ListInvoker.add(list, new ItemStack(item, 1, n));
            ++n;
        }
    }

    @Override
    public int d(IBlockState iBlockState) {
        return aW5.a((a4b)((Object)BlockStateInvoker.b(iBlockState, P)));
    }

    @Override
    protected a42 s() {
        return new a42(this, P);
    }

    @Override
    public int a(int n, Random random) {
        return 1 + a5_0.a(random, n * 2 + 1);
    }

    protected fg_1() {
        super(Material.f);
        this.f(BlockStateInvoker.a(aXF.c(this.D), P, (Comparable)((Object)a4b.DEAD_BUSH)));
        this.a(0.099999994f, 0.0f, 0.099999994f, 0.9f, 0.8f, 0.9f);
    }

    @Override
    public void a(World world, Random random, BlockPos blockPos, IBlockState iBlockState) {
        aPM aPM2 = aPM.GRASS;
        if (BlockStateInvoker.b(iBlockState, P) == a4b.FERN) {
            aPM2 = aPM.FERN;
        }
        if (Blocks.ai.e(world, blockPos)) {
            eq_1.a(Blocks.ai, world, blockPos, aPM2, 2);
        }
    }

    @Override
    public int r() {
        return zl_1.a(0.5, 1.0);
    }

    @Override
    public boolean a(World world, BlockPos blockPos, IBlockState iBlockState, boolean bl) {
        return BlockStateInvoker.b(iBlockState, P) != a4b.DEAD_BUSH;
    }

    @Override
    public IBlockState c(int n) {
        return BlockStateInvoker.a(this.m(), P, (Comparable)((Object)aW5.a(n)));
    }

    @Override
    public boolean b(World world, BlockPos blockPos) {
        return true;
    }

    @Override
    public Item a(IBlockState iBlockState, Random random, int n) {
        return a5_0.a(random, 8) == 0 ? Items.wheat_seeds : null;
    }

    @Override
    public boolean a(World world, BlockPos blockPos, IBlockState iBlockState) {
        return this.a(BlockStateInvoker.getBlock(aV8.q(world, amv_2.g(blockPos))));
    }

    @Override
    public int a(IBlockAccess iBlockAccess, BlockPos blockPos, int n) {
        return hw_0.a(aG3.d(iBlockAccess, blockPos), blockPos);
    }

    @Override
    public qn_2 O() {
        return qn_2.XYZ;
    }
}

