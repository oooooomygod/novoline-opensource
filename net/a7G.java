/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.item.ItemStack;

class a7G
extends Slot {
    na_1 f;
    aa8_0 g;

    a7G(aa8_0 aa8_02, rs_1 rs_12, int n, int n2, int n3, na_1 na_12) {
        this.g = aa8_02;
        this.f = na_12;
        super(rs_12, n, n2, n3);
    }

    @Override
    public boolean a(ItemStack itemStack) {
        return super.a(itemStack) && avq_0.e(this.f) && avq_0.a(act_2.k(itemStack));
    }

    @Override
    public boolean c() {
        return avq_0.e(this.f);
    }
}

