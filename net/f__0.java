/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.Entity;
import deobf.IBlockAccess;
import deobf.TileEntity;
import java.util.List;
import java.util.Random;

import deobf.EnumFacing;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net.f_
 */
public class f__0
extends ft_2 {
    protected f__0(Material material) {
        super(material);
        this.c(1.0f);
    }

    @Override
    public Item d(World world, BlockPos blockPos) {
        return null;
    }

    @Override
    public boolean b(IBlockAccess iBlockAccess, BlockPos blockPos, EnumFacing enumFacing) {
        return enumFacing == EnumFacing.DOWN && super.b(iBlockAccess, blockPos, enumFacing);
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, Entity entity) {
        if (entity.r == null && entity.h == null && !world.isRemote) {
            ayj_0.b(entity, 1);
        }
    }

    @Override
    public void a(IBlockAccess iBlockAccess, BlockPos blockPos) {
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.0625f, 1.0f);
    }

    @Override
    public MapColor g(IBlockState iBlockState) {
        return MapColor.o;
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, rm_2 rm_22, List<rm_2> list, Entity entity) {
    }

    @Override
    public boolean v() {
        return false;
    }

    @Override
    public void b(World world, BlockPos blockPos, IBlockState iBlockState, Random random) {
        double d = (float)amv_2.j(blockPos) + a5_0.e(random);
        double d2 = (float)amv_2.h(blockPos) + 0.8f;
        double d3 = (float)amv_2.i(blockPos) + a5_0.e(random);
        aV8.a(world, B7.SMOKE_NORMAL, d, d2, d3, 0.0, 0.0, 0.0, new int[0]);
    }

    @Override
    public TileEntity a(World world, int n) {
        return new a6a_0();
    }

    @Override
    public boolean f() {
        return false;
    }

    @Override
    public int a(Random random) {
        return 0;
    }
}

