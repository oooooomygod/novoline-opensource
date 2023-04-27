/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.EntityPlayer;
import deobf.IBlockAccess;
import deobf.TileEntity;
import java.util.Random;

import deobf.EnumFacing;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net.fJ
 */
public class fj_1
extends ft_2 {
    @Override
    public TileEntity a(World world, int n) {
        return new a6z_0();
    }

    @Override
    public boolean f() {
        return false;
    }

    @Override
    public boolean a(World world, BlockPos blockPos, IBlockState iBlockState, EntityPlayer entityPlayer, EnumFacing enumFacing, float f, float f2, float f3) {
        if (world.isRemote) {
            return true;
        }
        TileEntity tileEntity = aV8.z(world, blockPos);
        return tileEntity instanceof a6z_0 && aIE.a((a6z_0)tileEntity, entityPlayer);
    }

    @Override
    public rm_2 f(World world, BlockPos blockPos) {
        this.a((IBlockAccess)world, blockPos);
        return super.f(world, blockPos);
    }

    @Override
    public boolean y() {
        return true;
    }

    @Override
    public boolean e(World world, BlockPos blockPos) {
        return !this.a(world, blockPos) && super.e(world, blockPos);
    }

    @Override
    public rm_2 b(World world, BlockPos blockPos, IBlockState iBlockState) {
        return null;
    }

    @Override
    public boolean v() {
        return false;
    }

    @Override
    public Item a(IBlockState iBlockState, Random random, int n) {
        return Items.sign;
    }

    protected fj_1() {
        super(Material.wood);
        this.a(0.25f, 0.0f, 0.25f, 0.75f, 1.0f, 0.75f);
    }

    @Override
    public Item d(World world, BlockPos blockPos) {
        return Items.sign;
    }

    @Override
    public boolean c(IBlockAccess iBlockAccess, BlockPos blockPos) {
        return true;
    }
}

