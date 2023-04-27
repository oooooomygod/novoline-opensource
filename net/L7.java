/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.EntityPlayer;
import net.minecraft.item.ItemStack;

public class L7
extends Item {
    @Override
    public int getMaxItemUseDuration(ItemStack itemStack) {
        return 32;
    }

    public L7() {
        this.a(1);
        this.a(CreativeTabs.b);
    }

    @Override
    public ItemStack b(ItemStack itemStack, World world, EntityPlayer entityPlayer) {
        a6w_0.a(entityPlayer, itemStack, this.getMaxItemUseDuration(itemStack));
        return itemStack;
    }

    @Override
    public ItemStack c(ItemStack itemStack, World world, EntityPlayer entityPlayer) {
        if (!aSY.a(entityPlayer.abilities)) {
            --itemStack.a;
        }
        if (!world.isRemote) {
            a6w_0.K(entityPlayer);
        }
        a6w_0.a(entityPlayer, aop_1.p[Item.b(this)]);
        return itemStack.a <= 0 ? new ItemStack(Items.bucket) : itemStack;
    }

    @Override
    public ti_1 c(ItemStack itemStack) {
        return ti_1.DRINK;
    }
}

