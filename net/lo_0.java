/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.Entity;
import deobf.EntityPlayer;
import net.minecraft.item.ItemStack;

/*
 * Renamed from net.Lo
 */
public class lo_0
extends Item {
    public lo_0() {
        this.c = 16;
        this.a(CreativeTabs.i);
    }

    @Override
    public ItemStack b(ItemStack itemStack, World world, EntityPlayer entityPlayer) {
        if (!aSY.a(entityPlayer.abilities)) {
            --itemStack.a;
        }
        aV8.a(world, (Entity)entityPlayer, ap_0.a, 0.5f, 0.4f / (a5_0.e(j) * 0.4f + 0.8f));
        if (!world.isRemote) {
            aV8.b(world, new op_1(world, entityPlayer));
        }
        a6w_0.a(entityPlayer, aop_1.p[Item.b(this)]);
        return itemStack;
    }
}

