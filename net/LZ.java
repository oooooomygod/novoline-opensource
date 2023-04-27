/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import deobf.EnumFacing;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import deobf.EntityPlayer;
import net.minecraft.item.ItemStack;

public class LZ
extends Item {
    protected anh_2 m;

    public String a() {
        return this.m.toString();
    }

    protected boolean a(ItemStack itemStack, EntityPlayer entityPlayer, World world, BlockPos blockPos, IBlockState iBlockState) {
        aV8.a(world, (float)amv_2.j(blockPos) + 0.5f, (double)((float)amv_2.h(blockPos) + 0.5f), (double)((float)amv_2.i(blockPos) + 0.5f), an6_0.c(BlockStateInvoker.getBlock((IBlockState)iBlockState).l), (an6_0.d(BlockStateInvoker.getBlock((IBlockState)iBlockState).l) + 1.0f) / 2.0f, an6_0.b(BlockStateInvoker.getBlock((IBlockState)iBlockState).l) * 0.8f);
        if (!world.isRemote) {
            aV8.a(world, blockPos, iBlockState);
            act_2.damageItem(itemStack, 1, entityPlayer);
        }
        return true;
    }

    @Override
    public boolean l() {
        return true;
    }

    @Override
    public boolean a(ItemStack itemStack, EntityPlayer entityPlayer, World world, BlockPos blockPos, EnumFacing enumFacing, float f, float f2, float f3) {
        if (!a6w_0.a(entityPlayer, amv_2.a(blockPos, enumFacing), enumFacing, itemStack)) {
            return false;
        }
        IBlockState iBlockState = aV8.q(world, blockPos);
        Block block = BlockStateInvoker.getBlock(iBlockState);
        if (enumFacing != EnumFacing.DOWN && BlocksInvoker.getBlockState(BlockStateInvoker.getBlock(aV8.q(world, amv_2.e(blockPos)))) == Material.air) {
            if (block == Blocks.grass) {
                return this.a(itemStack, entityPlayer, world, blockPos, BlocksInvoker.t(Blocks.al));
            }
            if (block == Blocks.dirt) {
                switch ((a6s_0)((Object)BlockStateInvoker.b(iBlockState, BlockDirt.Q))) {
                    case DIRT: {
                        return this.a(itemStack, entityPlayer, world, blockPos, BlocksInvoker.t(Blocks.al));
                    }
                    case COARSE_DIRT: {
                        return this.a(itemStack, entityPlayer, world, blockPos, BlockStateInvoker.a(BlocksInvoker.t(Blocks.dirt), BlockDirt.Q, (Comparable)((Object)a6s_0.DIRT)));
                    }
                }
            }
        }
        return false;
    }

    public LZ(anh_2 anh_22) {
        this.m = anh_22;
        this.c = 1;
        this.setMaxDamage(agv_2.e(anh_22));
        this.a(CreativeTabs.c);
    }
}

