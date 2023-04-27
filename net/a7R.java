/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.item.ItemStack;

class a7R
extends Slot {
    aad_1 f;

    a7R(aad_1 aad_12, rs_1 rs_12, int n, int n2, int n3) {
        this.f = aad_12;
        super(rs_12, n, n2, n3);
    }

    @Override
    public boolean a(ItemStack itemStack) {
        return true;
    }

    @Override
    public int a() {
        return 1;
    }
}

