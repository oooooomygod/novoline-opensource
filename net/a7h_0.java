/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.item.ItemStack;

/*
 * Renamed from net.a7h
 */
class a7h_0
extends Slot {
    aa8_0 f;

    @Override
    public boolean a(ItemStack itemStack) {
        return super.a(itemStack) && act_2.k(itemStack) == Items.saddle && !this.d();
    }

    a7h_0(aa8_0 aa8_02, rs_1 rs_12, int n, int n2, int n3) {
        this.f = aa8_02;
        super(rs_12, n, n2, n3);
    }
}

