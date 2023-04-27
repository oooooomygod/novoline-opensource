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

public class LR
extends Item {
    public LR() {
        this.c = 1;
        this.setMaxDamage(64);
        this.a(CreativeTabs.c);
    }

    @Override
    public boolean a(ItemStack itemStack, EntityPlayer entityPlayer, World world, BlockPos blockPos, EnumFacing enumFacing, float f, float f2, float f3) {
        if (!a6w_0.a(entityPlayer, blockPos = amv_2.a(blockPos, enumFacing), enumFacing, itemStack)) {
            return false;
        }
        if (BlocksInvoker.getBlockState(BlockStateInvoker.getBlock(aV8.q(world, blockPos))) == Material.air) {
            aV8.a(world, (double)amv_2.j(blockPos) + 0.5, (double)amv_2.h(blockPos) + 0.5, (double)amv_2.i(blockPos) + 0.5, aya_2.a, 1.0f, a5_0.e(j) * 0.4f + 0.8f);
            aV8.a(world, blockPos, abb_1.a(Blocks.c));
        }
        act_2.damageItem(itemStack, 1, entityPlayer);
        return true;
    }
}

