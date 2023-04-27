/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.item.ItemStack;
import java.util.Random;

class OI
implements axr_0 {
    public Item a;
    public a6C b;

    @Override
    public void a(F8 f8, Random random) {
        int n = 1;
        if (this.b != null) {
            n = this.b.a(random);
        }
        f8.add(new ahh_0(new ItemStack(this.a, n, 0), Items.emerald));
    }

    public OI(Item item, a6C a6C2) {
        this.a = item;
        this.b = a6C2;
    }
}

