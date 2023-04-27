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
import net.minecraft.item.ItemStack;

public class L8
extends Item {
    @Override
    public boolean a(ItemStack itemStack, EntityPlayer entityPlayer, World world, BlockPos blockPos, EnumFacing enumFacing, float f, float f2, float f3) {
        BlocksInvoker.d(BlockStateInvoker.getBlock(aV8.q(world, blockPos)), world, blockPos);
        BlockPos blockPos2 = blockPos;
        if (!a6w_0.a(entityPlayer, blockPos2, enumFacing, itemStack)) {
            return false;
        }
        Block block = BlockStateInvoker.getBlock(aV8.q(world, blockPos2));
        if (!aV8.a(world, block, blockPos2, false, enumFacing, null, itemStack)) {
            return false;
        }
        if (agn_1.a(Blocks.af, world, blockPos2)) {
            --itemStack.a;
            aV8.a(world, blockPos2, agn_1.a(Blocks.af));
            return true;
        }
        return false;
    }

    public L8() {
        this.a(CreativeTabs.j);
    }
}

