/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlocksInvoker;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import deobf.EntityLivingBase;
import net.minecraft.item.ItemStack;

public class ItemShears
extends Item {
    @Override
    public float a(ItemStack itemStack, Block block) {
        return block != Blocks.bI && BlocksInvoker.getBlockState(block) != Material.z ? (block == Blocks.b_ ? 5.0f : super.a(itemStack, block)) : 15.0f;
    }

    public ItemShears() {
        this.a(1);
        this.setMaxDamage(238);
        this.a(CreativeTabs.c);
    }

    @Override
    public boolean a(ItemStack itemStack, World world, Block block, BlockPos blockPos, EntityLivingBase entityLivingBase) {
        if (BlocksInvoker.getBlockState(block) != Material.z && block != Blocks.bI && block != Blocks.bN && block != Blocks.as && block != Blocks.b7 && block != Blocks.b_) {
            return super.a(itemStack, world, block, blockPos, entityLivingBase);
        }
        act_2.damageItem(itemStack, 1, entityLivingBase);
        return true;
    }

    @Override
    public boolean b(Block block) {
        return block == Blocks.bI || block == Blocks.af || block == Blocks.b7;
    }
}

