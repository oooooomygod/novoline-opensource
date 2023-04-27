/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.item.ItemStack;

class a7D
extends Slot {
    aae_1 f;

    public a7D(aae_1 aae_12, rs_1 rs_12, int n, int n2, int n3) {
        this.f = aae_12;
        super(rs_12, n, n2, n3);
    }

    @Override
    public boolean a(ItemStack itemStack) {
        return px_0.c(act_2.k(itemStack), itemStack);
    }

    @Override
    public int a() {
        return 64;
    }
}

