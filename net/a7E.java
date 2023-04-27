/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

class a7E
extends Slot {
    int g;
    aas_1 f;

    @Override
    public String b() {
        return ItemArmor.m[this.g];
    }

    @Override
    public boolean a(ItemStack itemStack) {
        return act_2.k(itemStack) instanceof ItemArmor ? ((ItemArmor)act_2.k((ItemStack)itemStack)).n == this.g : (act_2.k(itemStack) == px_0.a(Blocks.ap) || act_2.k(itemStack) == Items.skull) && this.g == 0;
    }

    a7E(aas_1 aas_12, rs_1 rs_12, int n, int n2, int n3, int n4) {
        this.f = aas_12;
        this.g = n4;
        super(rs_12, n, n2, n3);
    }

    @Override
    public int a() {
        return 1;
    }
}

