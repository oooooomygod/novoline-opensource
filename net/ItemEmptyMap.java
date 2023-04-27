/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.InventoryInvoker;
import deobf.EntityPlayer;
import net.minecraft.item.ItemStack;

public class ItemEmptyMap
extends lf_0 {
    @Override
    public ItemStack b(ItemStack itemStack, World world, EntityPlayer entityPlayer) {
        ItemStack itemStack2 = new ItemStack(Items.filled_map, 1, aV8.a(world, ais_2.a));
        String string = aL0.c(aL0.a(new StringBuilder(), ais_2.b), act_2.c(itemStack2)).toString();
        wp_1 wp_12 = new wp_1(string);
        aV8.a(world, string, wp_12);
        wp_12.c = 0;
        sl_2.a(wp_12, entityPlayer.posX, entityPlayer.posZ, wp_12.c);
        wp_12.j = (byte)qq_2.j(world.d);
        sl_2.a(wp_12);
        --itemStack.a;
        if (itemStack.a <= 0) {
            return itemStack2;
        }
        if (!InventoryInvoker.b(entityPlayer.inventory, act_2.C(itemStack2))) {
            a6w_0.a(entityPlayer, itemStack2, false);
        }
        a6w_0.a(entityPlayer, aop_1.p[Item.b(this)]);
        return itemStack;
    }

    protected ItemEmptyMap() {
        this.a(CreativeTabs.b);
    }
}

