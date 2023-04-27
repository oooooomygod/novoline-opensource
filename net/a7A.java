/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.item.ItemStack;

class a7A
extends Slot {
    aad_1 f;

    @Override
    public boolean a(ItemStack itemStack) {
        return act_2.k(itemStack) == Items.dye && my_2.b(act_2.c(itemStack)) == YZ.BLUE;
    }

    a7A(aad_1 aad_12, rs_1 rs_12, int n, int n2, int n3) {
        this.f = aad_12;
        super(rs_12, n, n2, n3);
    }
}

