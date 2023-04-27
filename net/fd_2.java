/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.NBTInvoker;
import deobf.EntityPlayer;
import deobf.IBlockAccess;
import net.minecraft.block.BlockPos;
import net.minecraft.item.ItemStack;
import deobf.TileEntity;
import java.util.Random;

/*
 * Renamed from net.fd
 */
public class fd_2
extends ft_2 {
    public static js_0 P;
    public static jw_0 Q;

    @Override
    public Item a(IBlockState iBlockState, Random random, int n) {
        return Items.banner;
    }

    @Override
    public String C() {
        return ahq_0.b(sz_1.a);
    }

    @Override
    public boolean y() {
        return true;
    }

    @Override
    public boolean f() {
        return false;
    }

    protected fd_2() {
        super(Material.wood);
        this.a(0.25f, 0.0f, 0.25f, 0.75f, 1.0f, 0.75f);
    }

    @Override
    public Item d(World world, BlockPos blockPos) {
        return Items.banner;
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, float f, int n) {
        TileEntity tileEntity = aV8.z(world, blockPos);
        if (tileEntity instanceof a6L) {
            ItemStack itemStack = new ItemStack(Items.banner, 1, aez_2.h((a6L)tileEntity));
            NBTTagCompound nBTTagCompound = new NBTTagCompound();
            NBTInvoker.a(tileEntity, nBTTagCompound);
            tn_0.a(nBTTagCompound, sz_1.i);
            tn_0.a(nBTTagCompound, sz_1.e);
            tn_0.a(nBTTagCompound, sz_1.f);
            tn_0.a(nBTTagCompound, sz_1.c);
            act_2.a(itemStack, sz_1.b, nBTTagCompound);
            fd_2.a(world, blockPos, itemStack);
        } else {
            super.a(world, blockPos, iBlockState, f, n);
        }
    }

    @Override
    public rm_2 b(World world, BlockPos blockPos, IBlockState iBlockState) {
        return null;
    }

    @Override
    public TileEntity a(World world, int n) {
        return new a6L();
    }

    static {
        Q = au_2.a(sz_1.g, cs_1.HORIZONTAL);
        P = a7X.a(sz_1.d, 0, 15);
    }

    @Override
    public rm_2 f(World world, BlockPos blockPos) {
        this.a((IBlockAccess)world, blockPos);
        return super.f(world, blockPos);
    }

    @Override
    public boolean e(World world, BlockPos blockPos) {
        return !this.a(world, blockPos) && super.e(world, blockPos);
    }

    @Override
    public boolean c(IBlockAccess iBlockAccess, BlockPos blockPos) {
        return true;
    }

    @Override
    public void a(World world, EntityPlayer entityPlayer, BlockPos blockPos, IBlockState iBlockState, TileEntity tileEntity) {
        if (tileEntity instanceof a6L) {
            a6L a6L2 = (a6L)tileEntity;
            ItemStack itemStack = new ItemStack(Items.banner, 1, aez_2.h((a6L)tileEntity));
            NBTTagCompound nBTTagCompound = new NBTTagCompound();
            aez_2.a(nBTTagCompound, aez_2.h(a6L2), aez_2.f(a6L2));
            act_2.a(itemStack, sz_1.h, nBTTagCompound);
            fd_2.a(world, blockPos, itemStack);
        } else {
            super.a(world, entityPlayer, blockPos, iBlockState, null);
        }
    }

    @Override
    public boolean v() {
        return false;
    }
}

