/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import deobf.EnumFacing;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import deobf.IBlockAccess;
import java.util.Iterator;
import java.util.Random;

/*
 * Renamed from net.gY
 */
public class gy_1
extends Block {
    public static js_0 P = a7X.a(jy_0.a, 0, 15);

    @Override
    public rm_2 b(World world, BlockPos blockPos, IBlockState iBlockState) {
        return null;
    }

    @Override
    public a5w_0 K() {
        return a5w_0.CUTOUT;
    }

    @Override
    public boolean f() {
        return false;
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, Random random) {
        if ((BlockStateInvoker.getBlock(aV8.q(world, amv_2.g(blockPos))) == Blocks.P || this.a(world, blockPos, iBlockState)) && aV8.k(world, amv_2.e(blockPos))) {
            int n = 1;
            while (BlockStateInvoker.getBlock(aV8.q(world, amv_2.d(blockPos, n))) == this) {
                ++n;
            }
            int n2 = P8.b((Integer)BlockStateInvoker.b(iBlockState, P));
            if (n2 == 15) {
                aV8.a(world, amv_2.e(blockPos), this.m());
                aV8.a(world, blockPos, BlockStateInvoker.a(iBlockState, P, P8.d(0)), 4);
            } else {
                aV8.a(world, blockPos, BlockStateInvoker.a(iBlockState, P, P8.d(n2 + 1)), 4);
            }
        }
    }

    @Override
    public IBlockState c(int n) {
        return BlockStateInvoker.a(this.m(), P, P8.d(n));
    }

    @Override
    public boolean v() {
        return false;
    }

    @Override
    public Item d(World world, BlockPos blockPos) {
        return Items.reeds;
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, Block block) {
        this.a(world, blockPos, iBlockState);
    }

    @Override
    protected a42 s() {
        return new a42(this, P);
    }

    @Override
    public boolean e(World world, BlockPos blockPos) {
        Block block = BlockStateInvoker.getBlock(aV8.q(world, amv_2.g(blockPos)));
        if (block == this) {
            return true;
        }
        if (block != Blocks.grass && block != Blocks.dirt && block != Blocks.sand) {
            return false;
        }
        Iterator iterator = abw_2.b(cs_1.HORIZONTAL);
        while (dz_0.c(iterator)) {
            Object object = dz_0.b(iterator);
            if (BlockStateInvoker.getBlock(aV8.q(world, amv_2.g(amv_2.a(blockPos, (EnumFacing)object)))).w() != Material.M) continue;
            return true;
        }
        return false;
    }

    protected boolean a(World world, BlockPos blockPos, IBlockState iBlockState) {
        if (this.a(world, blockPos)) {
            return true;
        }
        this.a(world, blockPos, iBlockState, 0);
        aV8.j(world, blockPos);
        return false;
    }

    @Override
    public int d(IBlockState iBlockState) {
        return P8.b((Integer)BlockStateInvoker.b(iBlockState, P));
    }

    @Override
    public Item a(IBlockState iBlockState, Random random, int n) {
        return Items.reeds;
    }

    @Override
    public int a(IBlockAccess iBlockAccess, BlockPos blockPos, int n) {
        return hw_0.a(aG3.d(iBlockAccess, blockPos), blockPos);
    }

    protected gy_1() {
        super(Material.F);
        this.f(BlockStateInvoker.a(aXF.c(this.D), P, P8.d(0)));
        this.a(0.125f, 0.0f, 0.125f, 0.875f, 1.0f, 0.875f);
        this.a(true);
    }

    public boolean a(World world, BlockPos blockPos) {
        return this.e(world, blockPos);
    }
}

