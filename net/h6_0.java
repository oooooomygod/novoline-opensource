/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.ListInvoker;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.block.BlockStone;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import java.util.List;
import java.util.Random;

/*
 * Renamed from net.h6
 */
public class h6_0
extends Block {
    public static JC<vx_0> P = xu_0.a(e6_0.a, vx_0.class);

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, float f, int n) {
        if (!world.isRemote && J9.c(aV8.k(world), e6_0.b)) {
            ns_1 ns_12 = new ns_1(world);
            aN9.a(ns_12, (double)amv_2.j(blockPos) + 0.5, amv_2.h(blockPos), (double)amv_2.i(blockPos) + 0.5, 0.0f, 0.0f);
            aV8.b(world, ns_12);
            aN9.c(ns_12);
        }
    }

    @Override
    public int g(World world, BlockPos blockPos) {
        IBlockState iBlockState = aV8.q(world, blockPos);
        return BlockStateInvoker.getBlock(iBlockState).d(iBlockState);
    }

    @Override
    public IBlockState c(int n) {
        return BlockStateInvoker.a(this.m(), P, (Comparable)((Object)SL.a(n)));
    }

    @Override
    public void a(Item item, CreativeTabs creativeTabs, List<ItemStack> list) {
        for (vx_0 vx_02 : vx_0.values()) {
            ListInvoker.add(list, new ItemStack(item, 1, SL.a(vx_02)));
        }
    }

    @Override
    public int d(IBlockState iBlockState) {
        return SL.a((vx_0)((Object)BlockStateInvoker.b(iBlockState, P)));
    }

    public h6_0() {
        super(Material.N);
        this.f(BlockStateInvoker.a(aXF.c(this.D), P, (Comparable)((Object)vx_0.STONE)));
        this.setHardness(0.0f);
        this.a(CreativeTabs.l);
    }

    @Override
    protected a42 s() {
        return new a42(this, P);
    }

    @Override
    public int a(Random random) {
        return 0;
    }

    @Override
    protected ItemStack b(IBlockState iBlockState) {
        switch (aot_0.a[((vx_0)((Object)BlockStateInvoker.b(iBlockState, P))).ordinal()]) {
            case 1: {
                return new ItemStack(Blocks.cobblestone);
            }
            case 2: {
                return new ItemStack(Blocks.z);
            }
            case 3: {
                return new ItemStack(Blocks.z, 1, ahu_0.a(aCq.MOSSY));
            }
            case 4: {
                return new ItemStack(Blocks.z, 1, ahu_0.a(aCq.CRACKED));
            }
            case 5: {
                return new ItemStack(Blocks.z, 1, ahu_0.a(aCq.CHISELED));
            }
        }
        return new ItemStack(Blocks.stone);
    }

    public static boolean a(IBlockState iBlockState) {
        Block block = BlockStateInvoker.getBlock(iBlockState);
        return iBlockState == BlockStateInvoker.a(Blocks.stone.m(), BlockStone.P, (Comparable)((Object)UI.STONE)) || block == Blocks.cobblestone || block == Blocks.z;
    }
}

