/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.item.ItemStack;

/*
 * Renamed from net.aa3
 */
class aa3_0
implements IBehaviorDispenseItem {
    private aKT b = new aKT();

    @Override
    public ItemStack a(aYE aYE2, ItemStack itemStack) {
        return en_2.b(act_2.c(itemStack)) ? new abp_2(this, itemStack).a(aYE2, itemStack) : this.b.a(aYE2, itemStack);
    }

    aa3_0() {
    }
}

