/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import net.minecraft.item.ItemStack;
import java.util.List;

public class LI
extends Item {
    @Override
    public String a(ItemStack itemStack) {
        return act_2.c(itemStack) == 1 ? awx_0.a : awx_0.b;
    }

    public LI() {
        this.a(true);
        this.setMaxDamage(0);
        this.a(CreativeTabs.i);
    }

    @Override
    public void a(Item item, CreativeTabs creativeTabs, List<ItemStack> list) {
        ListInvoker.add(list, new ItemStack(item, 1, 0));
        ListInvoker.add(list, new ItemStack(item, 1, 1));
    }
}

