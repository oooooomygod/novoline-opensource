/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.InventoryInvoker;
import deobf.Entity;
import deobf.EntityPlayer;
import java.util.List;
import java.util.Random;

import deobf.EnumFacing;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net.ff
 */
public class ff_2
extends Block {
    public static js_0 P = a7X.a(a1v_0.a, 0, 3);

    @Override
    public boolean a(World world, BlockPos blockPos, IBlockState iBlockState, EntityPlayer entityPlayer, EnumFacing enumFacing, float f, float f2, float f3) {
        if (world.isRemote) {
            return true;
        }
        InventoryInvoker.g(entityPlayer.inventory);
        return true;
    }

    @Override
    public void o() {
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
    }

    @Override
    public int d(IBlockState iBlockState) {
        return P8.b((Integer)BlockStateInvoker.b(iBlockState, P));
    }

    @Override
    public IBlockState c(int n) {
        return BlockStateInvoker.a(this.m(), P, P8.d(n));
    }

    @Override
    public Item d(World world, BlockPos blockPos) {
        return Items.cauldron;
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, rm_2 rm_22, List<rm_2> list, Entity entity) {
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.3125f, 1.0f);
        super.a(world, blockPos, iBlockState, rm_22, list, entity);
        this.a(0.0f, 0.0f, 0.0f, 0.125f, 1.0f, 1.0f);
        super.a(world, blockPos, iBlockState, rm_22, list, entity);
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.125f);
        super.a(world, blockPos, iBlockState, rm_22, list, entity);
        this.a(0.875f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
        super.a(world, blockPos, iBlockState, rm_22, list, entity);
        this.a(0.0f, 0.0f, 0.875f, 1.0f, 1.0f, 1.0f);
        super.a(world, blockPos, iBlockState, rm_22, list, entity);
        this.o();
    }

    @Override
    public void c(World world, BlockPos blockPos) {
        IBlockState iBlockState;
        if (a5_0.a(world.o, 20) == 1 && P8.b((Integer)BlockStateInvoker.b(iBlockState = aV8.q(world, blockPos), P)) < 3) {
            aV8.a(world, blockPos, BlockStateInvoker.a(iBlockState, P), 2);
        }
    }

    @Override
    public boolean f() {
        return false;
    }

    public void b(World world, BlockPos blockPos, IBlockState iBlockState, int n) {
        aV8.a(world, blockPos, BlockStateInvoker.a(iBlockState, P, P8.d(MathHelper.a(n, 0, 3))), 2);
        aV8.d(world, blockPos, this);
    }

    public ff_2() {
        super(Material.t, MapColor.e);
        this.f(BlockStateInvoker.a(aXF.c(this.D), P, P8.d(0)));
    }

    @Override
    public boolean i() {
        return true;
    }

    @Override
    protected a42 s() {
        return new a42(this, P);
    }

    @Override
    public Item a(IBlockState iBlockState, Random random, int n) {
        return Items.cauldron;
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, Entity entity) {
        int n = P8.b((Integer)BlockStateInvoker.b(iBlockState, P));
        float f = (float)amv_2.h(blockPos) + (6.0f + (float)(3 * n)) / 16.0f;
        if (!world.isRemote && ayj_0.v(entity) && ayj_0.u((Entity)entity).a <= (double)f) {
            ayj_0.K(entity);
            this.b(world, blockPos, iBlockState, n - 1);
        }
    }

    @Override
    public boolean v() {
        return false;
    }

    @Override
    public int a(World world, BlockPos blockPos) {
        return P8.b((Integer)BlockStateInvoker.b(aV8.q(world, blockPos), P));
    }
}

