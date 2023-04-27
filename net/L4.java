/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import deobf.EnumFacing;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import deobf.EntityPlayer;
import net.minecraft.item.ItemStack;

public class L4
extends Item {
    @Override
    public boolean a(ItemStack itemStack, EntityPlayer entityPlayer, World world, BlockPos blockPos, EnumFacing enumFacing, float f, float f2, float f3) {
        if (world.isRemote) {
            return true;
        }
        if (!a6w_0.a(entityPlayer, blockPos = amv_2.a(blockPos, enumFacing), enumFacing, itemStack)) {
            return false;
        }
        if (BlocksInvoker.getBlockState(BlockStateInvoker.getBlock(aV8.q(world, blockPos))) == Material.air) {
            aV8.a(world, (double)amv_2.j(blockPos) + 0.5, (double)amv_2.h(blockPos) + 0.5, (double)amv_2.i(blockPos) + 0.5, aj3.a, 1.0f, (a5_0.e(j) - a5_0.e(j)) * 0.2f + 1.0f);
            aV8.a(world, blockPos, abb_1.a(Blocks.c));
        }
        if (!aSY.a(entityPlayer.abilities)) {
            --itemStack.a;
        }
        return true;
    }

    public L4() {
        this.a(CreativeTabs.b);
    }
}

