/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import deobf.EnumFacing;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import deobf.EntityPlayer;
import deobf.IBlockAccess;
import net.minecraft.item.ItemStack;

public class KK
extends Item {
    @Override
    public boolean a(ItemStack itemStack, EntityPlayer entityPlayer, World world, BlockPos blockPos, EnumFacing enumFacing, float f, float f2, float f3) {
        if (world.isRemote) {
            return true;
        }
        if (enumFacing != EnumFacing.UP) {
            return false;
        }
        IBlockState iBlockState = aV8.q(world, blockPos);
        Block block = BlockStateInvoker.getBlock(iBlockState);
        BlocksInvoker.d(block, world, blockPos);
        blockPos = amv_2.e(blockPos);
        int n = MathHelper.floor_double((double)(entityPlayer.rotationYaw * 4.0f / 360.0f) + 0.5) & 3;
        EnumFacing enumFacing2 = SJ.b(n);
        BlockPos blockPos2 = amv_2.a(blockPos, enumFacing2);
        if (a6w_0.a(entityPlayer, blockPos, enumFacing, itemStack) && a6w_0.a(entityPlayer, blockPos2, enumFacing, itemStack)) {
            BlocksInvoker.d(BlockStateInvoker.getBlock(aV8.q(world, blockPos2)), world, blockPos2);
            boolean bl = aV8.k(world, blockPos);
            boolean bl2 = aV8.k(world, blockPos2);
            if (aV8.a((IBlockAccess)world, amv_2.g(blockPos)) && aV8.a((IBlockAccess)world, amv_2.g(blockPos2))) {
                IBlockState iBlockState2 = BlockStateInvoker.a(BlockStateInvoker.a(BlockStateInvoker.a(BlocksInvoker.t(Blocks.aw), gp_2.Q, Boolean.FALSE), gp_2.P, (Comparable)((Object)enumFacing2)), gp_2.R, (Comparable)((Object)a5E.FOOT));
                if (aV8.a(world, blockPos, iBlockState2, 3)) {
                    IBlockState iBlockState3 = BlockStateInvoker.a(iBlockState2, gp_2.R, (Comparable)((Object)a5E.HEAD));
                    aV8.a(world, blockPos2, iBlockState3, 3);
                }
                --itemStack.a;
                return true;
            }
            return false;
        }
        return false;
    }

    public KK() {
        this.a(CreativeTabs.l);
    }
}

