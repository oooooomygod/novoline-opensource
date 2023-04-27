/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.item.ItemStack;

class a75
extends Slot {
    aaq_1 f;

    public a75(aaq_1 aaq_12, rs_1 rs_12, int n, int n2, int n3) {
        this.f = aaq_12;
        super(rs_12, n, n2, n3);
    }

    @Override
    public boolean a(ItemStack itemStack) {
        return act_2.k(itemStack) == Items.emerald || act_2.k(itemStack) == Items.diamond || act_2.k(itemStack) == Items.gold_ingot || act_2.k(itemStack) == Items.iron_ingot;
    }

    @Override
    public int a() {
        return 1;
    }
}

