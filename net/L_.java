/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.Entity;
import deobf.EntityPlayer;
import net.minecraft.item.ItemStack;

public class L_
extends Item {
    @Override
    public ItemStack b(ItemStack itemStack, World world, EntityPlayer entityPlayer) {
        if (!aSY.a(entityPlayer.abilities)) {
            --itemStack.a;
        }
        aV8.a(world, (Entity)entityPlayer, os_0.a, 0.5f, 0.4f / (a5_0.e(j) * 0.4f + 0.8f));
        if (!world.isRemote) {
            aV8.b(world, new oq_2(world, entityPlayer));
        }
        a6w_0.a(entityPlayer, aop_1.p[Item.b(this)]);
        return itemStack;
    }

    public L_() {
        this.c = 16;
        this.a(CreativeTabs.b);
    }
}

