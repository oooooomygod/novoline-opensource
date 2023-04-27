/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.ModuleInvoker;
import net.minecraft.init.Blocks;
import deobf.IBlockAccess;
import deobf.ModuleRegistry;
import java.util.Random;

import net.CreativeTabs;
import net.IBlockState;
import net.Item;
import net.J_;
import net.KW;
import net.Material;
import net.World;
import net.a42;
import net.a4b;
import net.a5_0;
import net.a5w_0;
import net.a6s_0;
import net.aG3;
import net.aQS;
import net.aV8;
import net.aWq;
import net.aXF;
import net.aY1;
import net.aj4;
import net.ale_1;
import net.amv_2;
import net.auk_2;
import net.avm_1;
import net.dq_1;
import net.fg_1;
import net.fu_0;
import net.hw_0;
import net.wc_1;
import net.ye_1;
import net.zl_1;

public class BlockGrass
extends Block
implements ale_1 {
    public static J_ P = aWq.a(avm_1.a);

    @Override
    public int r() {
        return zl_1.a(0.5, 1.0);
    }

    @Override
    public boolean a(World world, BlockPos blockPos, IBlockState iBlockState, boolean bl) {
        return true;
    }

    @Override
    public int e(IBlockState iBlockState) {
        return this.r();
    }

    @Override
    public int d(IBlockState iBlockState) {
        return 0;
    }

    @Override
    protected a42 s() {
        return new a42(this, P);
    }

    @Override
    public a5w_0 K() {
        return wc_1.g(ModuleInvoker.isEnable(ModuleRegistry.XRAY)) ? super.K() : a5w_0.CUTOUT_MIPPED;
    }

    @Override
    public void a(World world, Random random, BlockPos blockPos, IBlockState iBlockState) {
        BlockPos blockPos2 = amv_2.e(blockPos);
        int n = 0;
        while (true) {
            BlockPos blockPos3 = blockPos2;
            boolean bl = false;
            int cfr_ignored_0 = n / 16;
            if (BlockStateInvoker.getBlock((IBlockState)aV8.q((World)world, (BlockPos)blockPos3)).o == Material.air) {
                Object object;
                if (a5_0.a(random, 8) == 0) {
                    IBlockState iBlockState2;
                    object = hw_0.a(aV8.o(world, blockPos3), random, blockPos3);
                    fu_0 fu_02 = aQS.a(aj4.b((dq_1)object));
                    if (ye_1.a(fu_02, world, blockPos3, iBlockState2 = BlockStateInvoker.a(fu_02.m(), ye_1.c(fu_02), (Comparable)object))) {
                        aV8.a(world, blockPos3, iBlockState2, 3);
                    }
                } else {
                    object = BlockStateInvoker.a(Blocks.bN.m(), fg_1.P, (Comparable)((Object)a4b.GRASS));
                    if (KW.a(Blocks.bN, world, blockPos3, (IBlockState)object)) {
                        aV8.a(world, blockPos3, (IBlockState)object, 3);
                    }
                }
            }
            ++n;
        }
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, Random random) {
        if (!world.isRemote) {
            if (aV8.l(world, amv_2.e(blockPos)) < 4 && BlockStateInvoker.getBlock(aV8.q(world, amv_2.e(blockPos))).H() > 2) {
                aV8.a(world, blockPos, Blocks.dirt.m());
            } else if (aV8.l(world, amv_2.e(blockPos)) >= 9) {
                int n = 0;
                while (true) {
                    BlockPos blockPos2 = amv_2.a(blockPos, a5_0.a(random, 3) - 1, a5_0.a(random, 5) - 3, a5_0.a(random, 3) - 1);
                    Block block = BlockStateInvoker.getBlock(aV8.q(world, amv_2.e(blockPos2)));
                    IBlockState iBlockState2 = aV8.q(world, blockPos2);
                    if (BlockStateInvoker.getBlock(iBlockState2) == Blocks.dirt && BlockStateInvoker.b(iBlockState2, BlockDirt.Q) == a6s_0.DIRT && aV8.l(world, amv_2.e(blockPos2)) >= 4 && block.H() <= 2) {
                        aV8.a(world, blockPos2, Blocks.grass.m());
                    }
                    ++n;
                }
            }
        }
    }

    @Override
    public boolean b(World world, Random random, BlockPos blockPos, IBlockState iBlockState) {
        return true;
    }

    @Override
    public int a(IBlockAccess iBlockAccess, BlockPos blockPos, int n) {
        return aY1.c(iBlockAccess, blockPos);
    }

    @Override
    public IBlockState a(IBlockState iBlockState, IBlockAccess iBlockAccess, BlockPos blockPos) {
        Block block = BlockStateInvoker.getBlock(aG3.c(iBlockAccess, amv_2.e(blockPos)));
        return BlockStateInvoker.a(iBlockState, P, auk_2.b(block == Blocks.bq || block == Blocks.cm));
    }

    @Override
    public Item a(IBlockState iBlockState, Random random, int n) {
        return Blocks.dirt.a(BlockStateInvoker.a(Blocks.dirt.m(), BlockDirt.Q, (Comparable)((Object)a6s_0.DIRT)), random, n);
    }

    protected BlockGrass() {
        super(Material.grass);
        this.f(BlockStateInvoker.a(aXF.c(this.D), P, Boolean.FALSE));
        this.a(true);
        this.a(CreativeTabs.m);
    }
}

