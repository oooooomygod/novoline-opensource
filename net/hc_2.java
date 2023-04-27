/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.FutureTaskInvoker;
import cc.novoline.invoke.ListInvoker;
import deobf.EnumFacing;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import deobf.IBlockAccess;
import net.minecraft.item.ItemStack;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/*
 * Renamed from net.hc
 */
public class hc_2
extends Block {
    public static J_ P = aWq.a(gz_0.a);

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, Block block) {
        this.b(world, blockPos, iBlockState);
        super.a(world, blockPos, iBlockState, block);
    }

    @Override
    public int d(IBlockState iBlockState) {
        return auk_2.a((Boolean)BlockStateInvoker.b(iBlockState, P)) ? 1 : 0;
    }

    protected void b(World world, BlockPos blockPos, IBlockState iBlockState) {
        if (!auk_2.a((Boolean)BlockStateInvoker.b(iBlockState, P)) && this.a(world, blockPos)) {
            aV8.a(world, blockPos, BlockStateInvoker.a(iBlockState, P, Boolean.TRUE), 2);
            aV8.c(world, 2001, blockPos, Block.a(Blocks.water));
        }
    }

    @Override
    public void a(Item item, CreativeTabs creativeTabs, List<ItemStack> list) {
        ListInvoker.add(list, new ItemStack(item, 1, 0));
        ListInvoker.add(list, new ItemStack(item, 1, 1));
    }

    @Override
    public void c(World world, BlockPos blockPos, IBlockState iBlockState) {
        this.b(world, blockPos, iBlockState);
    }

    @Override
    public void b(World world, BlockPos blockPos, IBlockState iBlockState, Random random) {
        EnumFacing enumFacing;
        if (auk_2.a((Boolean)BlockStateInvoker.b(iBlockState, P)) && (enumFacing = SJ.a(random)) != EnumFacing.UP && !aV8.a((IBlockAccess)world, amv_2.a(blockPos, enumFacing))) {
            double d = amv_2.j(blockPos);
            double d2 = amv_2.h(blockPos);
            double d3 = amv_2.i(blockPos);
            if (enumFacing == EnumFacing.DOWN) {
                d2 -= 0.05;
                d += a5_0.c(random);
                d3 += a5_0.c(random);
            } else {
                d2 += a5_0.c(random) * 0.8;
                if (SJ.h(enumFacing) == kl_1.X) {
                    d3 += a5_0.c(random);
                    d = enumFacing == EnumFacing.EAST ? (d += 1.0) : (d += 0.05);
                } else {
                    d += a5_0.c(random);
                    d3 = enumFacing == EnumFacing.SOUTH ? (d3 += 1.0) : (d3 += 0.05);
                }
            }
            aV8.a(world, B7.DRIP_WATER, d, d2, d3, 0.0, 0.0, 0.0, new int[0]);
        }
    }

    protected hc_2() {
        super(Material.r);
        this.f(BlockStateInvoker.a(aXF.c(this.D), P, Boolean.FALSE));
        this.a(CreativeTabs.m);
    }

    @Override
    public int h(IBlockState iBlockState) {
        return auk_2.a((Boolean)BlockStateInvoker.b(iBlockState, P)) ? 1 : 0;
    }

    private boolean a(World world, BlockPos blockPos) {
        BlockPos blockPos2;
        Object object;
        LinkedList linkedList = my_0.b();
        ArrayList arrayList = my_0.c();
        FutureTaskInvoker.a(linkedList, new a6_<BlockPos, Integer>(blockPos, P8.d(0)));
        int n = 0;
        while (!FutureTaskInvoker.c(linkedList)) {
            object = (a6_)FutureTaskInvoker.d(linkedList);
            blockPos2 = (BlockPos)jw_1.b((a6_)object);
            int n2 = P8.b((Integer)jw_1.a((a6_)object));
            for (EnumFacing enumFacing : EnumFacing.values()) {
                BlockPos blockPos3 = amv_2.a(blockPos2, enumFacing);
                if (BlockStateInvoker.getBlock(aV8.q(world, blockPos3)).w() != Material.M) continue;
                aV8.a(world, blockPos3, Blocks.air.m(), 2);
                akr_1.a(arrayList, blockPos3);
                ++n;
                if (n2 >= 6) continue;
                FutureTaskInvoker.a(linkedList, new a6_<BlockPos, Integer>(blockPos3, P8.d(n2 + 1)));
            }
        }
        object = akr_1.a(arrayList);
        while (dz_0.c((Iterator)object)) {
            blockPos2 = (BlockPos)dz_0.b((Iterator)object);
            aV8.c(world, blockPos2, Blocks.air);
        }
        return true;
    }

    @Override
    public IBlockState c(int n) {
        return BlockStateInvoker.a(this.m(), P, auk_2.b((n & 1) == 1));
    }

    @Override
    protected a42 s() {
        return new a42(this, P);
    }

    @Override
    public String C() {
        return ahq_0.b(aL0.a(aL0.a(new StringBuilder(), this.J()), gz_0.b).toString());
    }
}

