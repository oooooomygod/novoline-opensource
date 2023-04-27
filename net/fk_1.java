/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import deobf.EntityPlayer;
import deobf.EnumFacing;
import net.minecraft.block.BlockPos;
import net.minecraft.item.ItemStack;
import deobf.TileEntity;

/*
 * Renamed from net.fK
 */
public class fk_1
extends ft_2 {
    public static J_ P = aWq.a(amz_0.a);

    @Override
    public int d(IBlockState iBlockState) {
        return auk_2.a((Boolean)BlockStateInvoker.b(iBlockState, P)) ? 1 : 0;
    }

    @Override
    public boolean i() {
        return true;
    }

    public void a(World world, BlockPos blockPos, IBlockState iBlockState, ItemStack itemStack) {
        TileEntity tileEntity;
        if (!world.isRemote && (tileEntity = aV8.z(world, blockPos)) instanceof a62) {
            NK.a((a62)tileEntity, new ItemStack(act_2.k(itemStack), 1, act_2.c(itemStack)));
            aV8.a(world, blockPos, BlockStateInvoker.a(iBlockState, P, Boolean.TRUE), 2);
        }
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState) {
        this.b(world, blockPos, iBlockState);
        super.a(world, blockPos, iBlockState);
    }

    @Override
    public IBlockState c(int n) {
        return BlockStateInvoker.a(this.m(), P, auk_2.b(true));
    }

    private void b(World world, BlockPos blockPos, IBlockState iBlockState) {
        TileEntity tileEntity;
        if (!world.isRemote && (tileEntity = aV8.z(world, blockPos)) instanceof a62) {
            a62 a622 = (a62)tileEntity;
            ItemStack itemStack = NK.a(a622);
            aV8.c(world, 1005, blockPos, 0);
            aV8.a(world, blockPos, null);
            NK.a(a622, null);
            double d = (double)(a5_0.e(world.o) * 0.7f) + (double)0.15f;
            double d2 = (double)(a5_0.e(world.o) * 0.7f) + 0.06000000238418579 + 0.6;
            double d3 = (double)(a5_0.e(world.o) * 0.7f) + (double)0.15f;
            ItemStack itemStack2 = act_2.C(itemStack);
            og_0 og_02 = new og_0(world, (double)amv_2.j(blockPos) + d, (double)amv_2.h(blockPos) + d2, (double)amv_2.i(blockPos) + d3, itemStack2);
            aec_0.b(og_02);
            aV8.b(world, og_02);
        }
    }

    protected fk_1() {
        super(Material.wood, MapColor.d);
        this.f(BlockStateInvoker.a(aXF.c(this.D), P, Boolean.FALSE));
        this.a(CreativeTabs.l);
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, float f, int n) {
        if (!world.isRemote) {
            super.a(world, blockPos, iBlockState, f, 0);
        }
    }

    @Override
    public boolean a(World world, BlockPos blockPos, IBlockState iBlockState, EntityPlayer entityPlayer, EnumFacing enumFacing, float f, float f2, float f3) {
        if (auk_2.a((Boolean)BlockStateInvoker.b(iBlockState, P))) {
            this.b(world, blockPos, iBlockState);
            iBlockState = BlockStateInvoker.a(iBlockState, P, Boolean.FALSE);
            aV8.a(world, blockPos, iBlockState, 2);
            return true;
        }
        return false;
    }

    @Override
    public int q() {
        return 3;
    }

    @Override
    protected a42 s() {
        return new a42(this, P);
    }

    @Override
    public TileEntity a(World world, int n) {
        return new a62();
    }

    @Override
    public int a(World world, BlockPos blockPos) {
        TileEntity tileEntity = aV8.z(world, blockPos);
        if (tileEntity instanceof a62) {
            ItemStack itemStack = NK.a((a62)tileEntity);
            return px_0.a(act_2.k(itemStack)) + 1 - px_0.a(Items.record_13);
        }
        return 0;
    }
}

