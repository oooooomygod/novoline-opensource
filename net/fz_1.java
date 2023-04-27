/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import deobf.EntityPlayer;
import deobf.IBlockAccess;
import java.util.Random;

import deobf.EnumFacing;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.fZ
 */
public class fz_1
extends Block {
    public static js_0 P = a7X.a(tu_1.a, 0, 6);

    @Override
    public IBlockState c(int n) {
        return BlockStateInvoker.a(this.m(), P, P8.d(n));
    }

    @Override
    public rm_2 b(World world, BlockPos blockPos, IBlockState iBlockState) {
        float f = (float)(1 + P8.b((Integer)BlockStateInvoker.b(iBlockState, P)) * 2) / 16.0f;
        return new rm_2((float)amv_2.j(blockPos) + f, amv_2.h(blockPos), (float)amv_2.i(blockPos) + 0.0625f, (float)(amv_2.j(blockPos) + 1) - 0.0625f, (float)amv_2.h(blockPos) + 0.5f, (float)(amv_2.i(blockPos) + 1) - 0.0625f);
    }

    @Override
    public boolean e(World world, BlockPos blockPos) {
        return super.e(world, blockPos) && this.a(world, blockPos);
    }

    @Override
    protected a42 s() {
        return new a42(this, P);
    }

    protected fz_1() {
        super(Material.C);
        this.f(BlockStateInvoker.a(aXF.c(this.D), P, P8.d(0)));
        this.a(true);
    }

    @Override
    public a5w_0 K() {
        return a5w_0.CUTOUT;
    }

    @Override
    public int d(IBlockState iBlockState) {
        return P8.b((Integer)BlockStateInvoker.b(iBlockState, P));
    }

    @Override
    public Item a(IBlockState iBlockState, Random random, int n) {
        return null;
    }

    @Override
    public Item d(World world, BlockPos blockPos) {
        return Items.cake;
    }

    @Override
    public void a(IBlockAccess iBlockAccess, BlockPos blockPos) {
        float f = (float)(1 + P8.b((Integer)BlockStateInvoker.b(aG3.c(iBlockAccess, blockPos), P)) * 2) / 16.0f;
        this.a(f, 0.0f, 0.0625f, 0.9375f, 0.5f, 0.9375f);
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, Block block) {
        if (!this.a(world, blockPos)) {
            aV8.j(world, blockPos);
        }
    }

    private void b(World world, BlockPos blockPos, IBlockState iBlockState, EntityPlayer entityPlayer) {
        if (a6w_0.a(entityPlayer, false)) {
            a6w_0.a(entityPlayer, aop_1.M);
            net.K.a(a6w_0.u(entityPlayer), 2, 0.1f);
            int n = P8.b((Integer)BlockStateInvoker.b(iBlockState, P));
            if (n < 6) {
                aV8.a(world, blockPos, BlockStateInvoker.a(iBlockState, P, P8.d(n + 1)), 3);
            } else {
                aV8.j(world, blockPos);
            }
        }
    }

    @Override
    public int a(World world, BlockPos blockPos) {
        return (7 - P8.b((Integer)BlockStateInvoker.b(aV8.q(world, blockPos), P))) * 2;
    }

    @Override
    public boolean i() {
        return true;
    }

    private boolean a(World world, BlockPos blockPos) {
        return akm_1.i(BlockStateInvoker.getBlock(aV8.q(world, amv_2.g(blockPos))).w());
    }

    @Override
    public boolean a(World world, BlockPos blockPos, IBlockState iBlockState, EntityPlayer entityPlayer, EnumFacing enumFacing, float f, float f2, float f3) {
        this.b(world, blockPos, iBlockState, entityPlayer);
        return true;
    }

    @Override
    public boolean v() {
        return false;
    }

    @Override
    public void o() {
        this.a(0.0625f, 0.0f, 0.0625f, 0.9375f, 0.5f, 0.9375f);
    }

    @Override
    public rm_2 f(World world, BlockPos blockPos) {
        return this.b(world, blockPos, aV8.q(world, blockPos));
    }

    @Override
    public int a(Random random) {
        return 0;
    }

    @Override
    public boolean f() {
        return false;
    }

    @Override
    public void a(World world, BlockPos blockPos, EntityPlayer entityPlayer) {
        this.b(world, blockPos, aV8.q(world, blockPos), entityPlayer);
    }
}

