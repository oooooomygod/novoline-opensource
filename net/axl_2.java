/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.item.ItemStack;
import java.util.Random;

/*
 * Renamed from net.axl
 */
class axl_2
implements axr_0 {
    public a6C b;
    public ItemStack a;

    @Override
    public void a(F8 f8, Random random) {
        int n = 1;
        if (this.b != null) {
            n = this.b.a(random);
        }
        ItemStack itemStack = new ItemStack(Items.emerald, n, 0);
        ItemStack itemStack2 = new ItemStack(act_2.k(this.a), 1, act_2.c(this.a));
        itemStack2 = alf_0.b(random, itemStack2, 5 + a5_0.a(random, 15));
        f8.add(new ahh_0(itemStack, itemStack2));
    }

    public axl_2(Item item, a6C a6C2) {
        this.a = new ItemStack(item);
        this.b = a6C2;
    }
}

