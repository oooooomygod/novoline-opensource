/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.InventoryInvoker;
import cc.novoline.invoke.ObjectMouseOverInvoker;
import deobf.EntityPlayer;
import net.minecraft.block.BlockPos;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MovingObjectPosition;

public class LB
extends Item {
    public LB() {
        this.a(CreativeTabs.h);
    }

    @Override
    public ItemStack b(ItemStack itemStack, World world, EntityPlayer entityPlayer) {
        MovingObjectPosition movingObjectPosition = this.a(world, entityPlayer, true);
        if (movingObjectPosition.typeOfHit == I.BLOCK) {
            BlockPos blockPos = ObjectMouseOverInvoker.getBlockPos(movingObjectPosition);
            if (!aV8.a(world, entityPlayer, blockPos)) {
                return itemStack;
            }
            if (!a6w_0.a(entityPlayer, amv_2.a(blockPos, movingObjectPosition.facing), movingObjectPosition.facing, itemStack)) {
                return itemStack;
            }
            if (BlocksInvoker.getBlockState(BlockStateInvoker.getBlock(aV8.q(world, blockPos))) == Material.M) {
                --itemStack.a;
                a6w_0.a(entityPlayer, aop_1.p[Item.b(this)]);
                if (itemStack.a <= 0) {
                    return new ItemStack(Items.potionitem);
                }
                if (!InventoryInvoker.b(entityPlayer.inventory, new ItemStack(Items.potionitem))) {
                    a6w_0.a(entityPlayer, new ItemStack(Items.potionitem, 1, 0), false);
                }
            }
        }
        return itemStack;
    }
}

