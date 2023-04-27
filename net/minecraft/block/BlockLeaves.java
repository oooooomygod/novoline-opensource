/*
 * Decompiled with CFR 0.152.
 */

package net.minecraft.block;

import cc.novoline.invoke.BlockStateInvoker;
import net.minecraft.init.Blocks;
import deobf.IBlockAccess;
import net.minecraft.item.ItemStack;
import java.util.Random;
import net.B7;
import net.CreativeTabs;
import net.F3;
import net.IBlockState;
import net.Item;
import net.J_;
import net.Material;
import net.World;
import net.a5_0;
import net.a5w_0;
import net.aV8;
import net.aWq;
import net.aY1;
import net.adq_0;
import net.ain_1;
import net.amv_2;
import net.auk_2;
import net.px_0;
import net.z6_0;
import net.zm_1;

public abstract class BlockLeaves
extends BlockLeavesBase {
    protected boolean U;
    public static J_ V;
    public static J_ T;
    protected int R;
    int[] S;

    @Override
    public boolean a() {
        return false;
    }

    public BlockLeaves() {
        super(Material.z, false);
        this.a(true);
        this.a(CreativeTabs.l);
        this.setHardness(0.2f);
        this.a(1);
        this.a(x);
    }

    @Override
    public Item a(IBlockState iBlockState, Random random, int n) {
        return px_0.a(Blocks.sapling);
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, float f, int n) {
        if (!world.isRemote) {
            int n2 = this.a(iBlockState);
            if ((n2 -= 2 << n) < 10) {
                n2 = 10;
            }
            if (a5_0.a(world.o, n2) == 0) {
                Item item = this.a(iBlockState, world.o, n);
                BlockLeaves.a(world, blockPos, new ItemStack(item, 1, this.h(iBlockState)));
            }
            n2 = 200;
            if ((n2 -= 10 << n) < 40) {
                n2 = 40;
            }
            this.b(world, blockPos, iBlockState, n2);
        }
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState) {
        int n;
        int n2;
        int n3 = amv_2.j(blockPos);
        if (aV8.b(world, new BlockPos(n3 - 2, (n2 = amv_2.h(blockPos)) - 2, (n = amv_2.i(blockPos)) - 2), new BlockPos(n3 + 2, n2 + 2, n + 2))) {
            int n4 = -1;
            int n5 = -1;
            int n6 = -1;
            while (true) {
                BlockPos blockPos2;
                IBlockState iBlockState2;
                if (BlockStateInvoker.getBlock(iBlockState2 = aV8.q(world, blockPos2 = amv_2.a(blockPos, n4, n5, n6))).w() == Material.z && !auk_2.a((Boolean)BlockStateInvoker.b(iBlockState2, V))) {
                    aV8.a(world, blockPos2, BlockStateInvoker.a(iBlockState2, V, Boolean.TRUE), 4);
                }
                ++n6;
            }
        }
    }

    @Override
    public void b(World world, BlockPos blockPos, IBlockState iBlockState, Random random) {
        if (aV8.s(world, amv_2.e(blockPos)) && !aV8.a((IBlockAccess)world, amv_2.g(blockPos)) && a5_0.a(random, 15) == 1) {
            double d = (float)amv_2.j(blockPos) + a5_0.e(random);
            double d2 = (double)amv_2.h(blockPos) - 0.05;
            double d3 = (float)amv_2.i(blockPos) + a5_0.e(random);
            aV8.a(world, B7.DRIP_WATER, d, d2, d3, 0.0, 0.0, 0.0, new int[0]);
        }
    }

    @Override
    public int a(IBlockAccess iBlockAccess, BlockPos blockPos, int n) {
        return aY1.b(iBlockAccess, blockPos);
    }

    @Override
    public a5w_0 K() {
        return this.U ? a5w_0.CUTOUT_MIPPED : a5w_0.SOLID;
    }

    @Override
    public int a(Random random) {
        return a5_0.a(random, 20) == 0 ? 1 : 0;
    }

    static {
        T = aWq.a(adq_0.b);
        V = aWq.a(adq_0.a);
    }

    private void a(World world, BlockPos blockPos) {
        this.a(world, blockPos, aV8.q(world, blockPos), 0);
        aV8.j(world, blockPos);
    }

    @Override
    public boolean f() {
        return !this.P;
    }

    @Override
    public int e(IBlockState iBlockState) {
        return zm_1.b();
    }

    protected void b(World world, BlockPos blockPos, IBlockState iBlockState, int n) {
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, Random random) {
        if (!world.isRemote && auk_2.a((Boolean)BlockStateInvoker.b(iBlockState, V)) && auk_2.a((Boolean)BlockStateInvoker.b(iBlockState, T))) {
            int n = amv_2.j(blockPos);
            int n2 = amv_2.h(blockPos);
            int n3 = amv_2.i(blockPos);
            if (this.S == null) {
                this.S = new int[32768];
            }
            if (aV8.b(world, new BlockPos(n - 5, n2 - 5, n3 - 5), new BlockPos(n + 5, n2 + 5, n3 + 5))) {
                z6_0 z6_02 = new z6_0();
                int n4 = -4;
                int n5 = -4;
                int n6 = -4;
                while (true) {
                    Block block;
                    this.S[(n4 + 16) * 1024 + (n5 + 16) * 32 + n6 + 16] = (block = BlockStateInvoker.getBlock(aV8.q(world, ain_1.a(z6_02, n + n4, n2 + n5, n3 + n6)))) != Blocks.b2 && block != Blocks.bO ? (block.w() == Material.z ? -2 : -1) : 0;
                    ++n6;
                }
            }
            int n7 = this.S[16912];
            aV8.a(world, blockPos, BlockStateInvoker.a(iBlockState, V, Boolean.FALSE), 4);
        }
    }

    public abstract F3 a(int var1);

    protected int a(IBlockState iBlockState) {
        return 20;
    }

    @Override
    public int r() {
        return zm_1.a(0.5, 1.0);
    }

    public void a(boolean bl) {
        this.U = bl;
        this.P = bl;
        this.R = 0;
    }
}

