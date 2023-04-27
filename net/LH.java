/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.ItemBlockInvoker;
import deobf.EnumFacing;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import deobf.EntityPlayer;
import net.minecraft.item.ItemStack;
import deobf.TileEntity;

public class LH
extends Item {
    @Override
    public boolean a(ItemStack itemStack, EntityPlayer entityPlayer, World world, BlockPos blockPos, EnumFacing enumFacing, float f, float f2, float f3) {
        if (enumFacing == EnumFacing.DOWN) {
            return false;
        }
        if (!akm_1.i(BlocksInvoker.getBlockState(BlockStateInvoker.getBlock(aV8.q(world, blockPos))))) {
            return false;
        }
        if (!a6w_0.a(entityPlayer, blockPos = amv_2.a(blockPos, enumFacing), enumFacing, itemStack)) {
            return false;
        }
        if (!BlocksInvoker.g(Blocks.bp, world, blockPos)) {
            return false;
        }
        if (world.isRemote) {
            return true;
        }
        if (enumFacing == EnumFacing.UP) {
            int n = MathHelper.floor_double((double)((entityPlayer.rotationYaw + 180.0f) * 16.0f / 360.0f) + 0.5) & 0xF;
            aV8.a(world, blockPos, BlockStateInvoker.a(BlocksInvoker.t(Blocks.bp), gl_2.P, P8.d(n)), 3);
        } else {
            aV8.a(world, blockPos, BlockStateInvoker.a(BlocksInvoker.t(Blocks.cj), gy_2.P, (Comparable)((Object)enumFacing)), 3);
        }
        --itemStack.a;
        TileEntity tileEntity = aV8.z(world, blockPos);
        if (tileEntity instanceof a6z_0 && !ItemBlockInvoker.a(world, entityPlayer, blockPos, itemStack)) {
            a6w_0.a(entityPlayer, (a6z_0)tileEntity);
        }
        return true;
    }

    public LH() {
        this.c = 16;
        this.a(CreativeTabs.l);
    }
}

