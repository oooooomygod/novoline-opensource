/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import deobf.EnumFacing;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import net.minecraft.util.DamageSource;
import deobf.Entity;
import java.util.Iterator;
import java.util.Random;

/*
 * Renamed from net.fF
 */
public class ff_1
extends Block {
    public static js_0 P = a7X.a(ho_0.a, 0, 15);

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, Entity entity) {
        ayj_0.a(entity, DamageSource.a, 1.0f);
    }

    @Override
    public a5w_0 K() {
        return a5w_0.CUTOUT;
    }

    @Override
    public rm_2 f(World world, BlockPos blockPos) {
        return new rm_2((float)amv_2.j(blockPos) + 0.0625f, amv_2.h(blockPos), (float)amv_2.i(blockPos) + 0.0625f, (float)(amv_2.j(blockPos) + 1) - 0.0625f, amv_2.h(blockPos) + 1, (float)(amv_2.i(blockPos) + 1) - 0.0625f);
    }

    @Override
    public boolean e(World world, BlockPos blockPos) {
        return super.e(world, blockPos) && this.a(world, blockPos);
    }

    @Override
    protected a42 s() {
        return new a42(this, P);
    }

    @Override
    public boolean v() {
        return false;
    }

    public boolean a(World world, BlockPos blockPos) {
        Object object = abw_2.b(cs_1.HORIZONTAL);
        while (dz_0.c((Iterator)object)) {
            Object object2 = dz_0.b((Iterator)object);
            if (!akm_1.i(BlockStateInvoker.getBlock(aV8.q(world, amv_2.a(blockPos, (EnumFacing)object2))).w())) continue;
            return false;
        }
        object = BlockStateInvoker.getBlock(aV8.q(world, amv_2.g(blockPos)));
        return object == Blocks.a9 || object == Blocks.sand;
    }

    protected ff_1() {
        super(Material.A);
        this.f(BlockStateInvoker.a(aXF.c(this.D), P, P8.d(0)));
        this.a(true);
        this.a(CreativeTabs.l);
    }

    @Override
    public IBlockState c(int n) {
        return BlockStateInvoker.a(this.m(), P, P8.d(n));
    }

    @Override
    public rm_2 b(World world, BlockPos blockPos, IBlockState iBlockState) {
        return new rm_2((float)amv_2.j(blockPos) + 0.0625f, amv_2.h(blockPos), (float)amv_2.i(blockPos) + 0.0625f, (float)(amv_2.j(blockPos) + 1) - 0.0625f, (float)(amv_2.h(blockPos) + 1) - 0.0625f, (float)(amv_2.i(blockPos) + 1) - 0.0625f);
    }

    @Override
    public boolean f() {
        return false;
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, Block block) {
        if (!this.a(world, blockPos)) {
            aV8.b(world, blockPos, true);
        }
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, Random random) {
        BlockPos blockPos2 = amv_2.e(blockPos);
        if (aV8.k(world, blockPos2)) {
            int n = 1;
            while (BlockStateInvoker.getBlock(aV8.q(world, amv_2.d(blockPos, n))) == this) {
                ++n;
            }
            int n2 = P8.b((Integer)BlockStateInvoker.b(iBlockState, P));
            if (n2 == 15) {
                aV8.a(world, blockPos2, this.m());
                IBlockState iBlockState2 = BlockStateInvoker.a(iBlockState, P, P8.d(0));
                aV8.a(world, blockPos, iBlockState2, 4);
                this.a(world, blockPos2, iBlockState2, this);
            } else {
                aV8.a(world, blockPos, BlockStateInvoker.a(iBlockState, P, P8.d(n2 + 1)), 4);
            }
        }
    }

    @Override
    public int d(IBlockState iBlockState) {
        return P8.b((Integer)BlockStateInvoker.b(iBlockState, P));
    }
}

