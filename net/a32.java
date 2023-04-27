/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.item.ItemStack;
import java.util.Random;

class a32
implements axr_0 {
    public ItemStack b;
    public a6C a;

    public a32(ItemStack itemStack, a6C a6C2) {
        this.b = itemStack;
        this.a = a6C2;
    }

    @Override
    public void a(F8 f8, Random random) {
        int n = 1;
        if (this.a != null) {
            n = this.a.a(random);
        }
        ItemStack itemStack = new ItemStack(Items.emerald, 1, 0);
        ItemStack itemStack2 = new ItemStack(act_2.k(this.b), -n, act_2.c(this.b));
        f8.add(new ahh_0(itemStack, itemStack2));
    }

    public a32(Item item, a6C a6C2) {
        this.b = new ItemStack(item);
        this.a = a6C2;
    }
}

