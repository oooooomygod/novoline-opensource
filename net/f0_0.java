/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import deobf.EnumFacing;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import deobf.EntityLivingBase;
import deobf.EntityPlayer;
import net.minecraft.item.ItemStack;
import deobf.TileEntity;
import java.util.Random;

/*
 * Renamed from net.f0
 */
public class f0_0
extends ft_2 {
    @Override
    public boolean f() {
        return false;
    }

    @Override
    public int q() {
        return 3;
    }

    protected f0_0() {
        super(Material.y, MapColor.h);
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.75f, 1.0f);
        this.a(0);
        this.a(CreativeTabs.l);
    }

    @Override
    public void b(World world, BlockPos blockPos, IBlockState iBlockState, Random random) {
        super.b(world, blockPos, iBlockState, random);
        int n = -2;
        int n2 = -2;
        while (true) {
            if (a5_0.a(random, 16) == 0) {
                int n3 = 0;
                while (true) {
                    BlockPos blockPos2;
                    if (BlockStateInvoker.getBlock(aV8.q(world, blockPos2 = amv_2.a(blockPos, n, n3, n2))) == Blocks.at) {
                        if (!aV8.k(world, amv_2.a(blockPos, n / 2, 0, n2 / 2))) break;
                        aV8.a(world, B7.ENCHANTMENT_TABLE, (double)amv_2.j(blockPos) + 0.5, (double)amv_2.h(blockPos) + 2.0, (double)amv_2.i(blockPos) + 0.5, (double)((float)n + a5_0.e(random)) - 0.5, (float)n3 - a5_0.e(random) - 1.0f, (double)((float)n2 + a5_0.e(random)) - 0.5, new int[0]);
                    }
                    ++n3;
                }
            }
            ++n2;
        }
    }

    @Override
    public TileEntity a(World world, int n) {
        return new a6D();
    }

    @Override
    public boolean a(World world, BlockPos blockPos, IBlockState iBlockState, EntityPlayer entityPlayer, EnumFacing enumFacing, float f, float f2, float f3) {
        TileEntity tileEntity;
        if (!world.isRemote && (tileEntity = aV8.z(world, blockPos)) instanceof a6D) {
            a6w_0.a(entityPlayer, (a6D)tileEntity);
        }
        return true;
    }

    @Override
    public boolean v() {
        return false;
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, EntityLivingBase entityLivingBase, ItemStack itemStack) {
        TileEntity tileEntity;
        super.a(world, blockPos, iBlockState, entityLivingBase, itemStack);
        if (act_2.g(itemStack) && (tileEntity = aV8.z(world, blockPos)) instanceof a6D) {
            aOS.a((a6D)tileEntity, act_2.w(itemStack));
        }
    }
}

