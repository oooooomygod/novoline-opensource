/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import deobf.Entity;
import deobf.IBlockAccess;
import java.util.Random;

import net.CreativeTabs;
import deobf.EnumFacing;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net.fv
 */
public abstract class fv_2
extends Block {
    protected fv_2(Material material, MapColor mapColor) {
        super(material, mapColor);
        this.a(CreativeTabs.j);
        this.a(true);
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState) {
        if (this.b(iBlockState) > 0) {
            this.d(world, blockPos);
        }
        super.a(world, blockPos, iBlockState);
    }

    @Override
    public void a(IBlockAccess iBlockAccess, BlockPos blockPos) {
        this.a(aG3.c(iBlockAccess, blockPos));
    }

    protected fv_2(Material material) {
        this(material, akm_1.j(material));
    }

    protected void a(IBlockState iBlockState) {
        boolean bl = this.b(iBlockState) > 0;
        this.a(0.0625f, 0.0f, 0.0625f, 0.9375f, 0.03125f, 0.9375f);
    }

    @Override
    public boolean y() {
        return true;
    }

    protected abstract int b(World var1, BlockPos var2);

    @Override
    public int b(IBlockAccess iBlockAccess, BlockPos blockPos, IBlockState iBlockState, EnumFacing enumFacing) {
        return enumFacing == EnumFacing.UP ? this.b(iBlockState) : 0;
    }

    @Override
    public boolean c(IBlockAccess iBlockAccess, BlockPos blockPos) {
        return true;
    }

    @Override
    public int a(World world) {
        return 20;
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, Entity entity) {
        if (!world.isRemote) {
            int n = this.b(iBlockState);
            this.b(world, blockPos, iBlockState, n);
        }
    }

    @Override
    public int F() {
        return 1;
    }

    @Override
    public rm_2 b(World world, BlockPos blockPos, IBlockState iBlockState) {
        return null;
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, Random random) {
        if (!world.isRemote) {
            int n = this.b(iBlockState);
            this.b(world, blockPos, iBlockState, n);
        }
    }

    @Override
    public boolean v() {
        return false;
    }

    protected rm_2 a(BlockPos blockPos) {
        return new rm_2((float)amv_2.j(blockPos) + 0.125f, amv_2.h(blockPos), (float)amv_2.i(blockPos) + 0.125f, (float)(amv_2.j(blockPos) + 1) - 0.125f, (double)amv_2.h(blockPos) + 0.25, (float)(amv_2.i(blockPos) + 1) - 0.125f);
    }

    @Override
    public boolean b() {
        return true;
    }

    @Override
    public int a(IBlockAccess iBlockAccess, BlockPos blockPos, IBlockState iBlockState, EnumFacing enumFacing) {
        return this.b(iBlockState);
    }

    protected void d(World world, BlockPos blockPos) {
        aV8.c(world, blockPos, this);
        aV8.c(world, amv_2.g(blockPos), this);
    }

    protected abstract IBlockState a(IBlockState var1, int var2);

    @Override
    public boolean f() {
        return false;
    }

    protected abstract int b(IBlockState var1);

    @Override
    public void c(World world, BlockPos blockPos, IBlockState iBlockState, Random random) {
    }

    @Override
    public boolean e(World world, BlockPos blockPos) {
        return this.a(world, amv_2.g(blockPos));
    }

    protected void b(World world, BlockPos blockPos, IBlockState iBlockState, int n) {
        int n2 = this.b(world, blockPos);
        if (n != n2) {
            iBlockState = this.a(iBlockState, n2);
            aV8.a(world, blockPos, iBlockState, 2);
            this.d(world, blockPos);
            aV8.a(world, blockPos, blockPos);
        }
        aV8.a(world, (double)amv_2.j(blockPos) + 0.5, (double)amv_2.h(blockPos) + 0.1, (double)amv_2.i(blockPos) + 0.5, a3a_0.a, 0.3f, 0.5f);
        aV8.a(world, blockPos, (Block)this, this.a(world));
    }

    private boolean a(World world, BlockPos blockPos) {
        return aV8.a((IBlockAccess)world, blockPos) || BlockStateInvoker.getBlock(aV8.q(world, blockPos)) instanceof g2_0;
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, Block block) {
        if (!this.a(world, amv_2.g(blockPos))) {
            this.a(world, blockPos, iBlockState, 0);
            aV8.j(world, blockPos);
        }
    }

    @Override
    public void o() {
        this.a(0.0f, 0.375f, 0.0f, 1.0f, 0.625f, 1.0f);
    }
}

