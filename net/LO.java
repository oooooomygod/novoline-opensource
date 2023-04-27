/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.EntityPlayer;
import net.minecraft.item.ItemStack;

public class LO
extends LA {
    @Override
    public ItemStack c(ItemStack itemStack, World world, EntityPlayer entityPlayer) {
        super.c(itemStack, world, entityPlayer);
        return new ItemStack(Items.bowl);
    }

    public LO(int n) {
        super(n, false);
        this.a(1);
    }
}

