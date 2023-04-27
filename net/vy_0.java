/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.item.ItemStack;
import java.util.Random;

/*
 * Renamed from net.vY
 */
class vy_0
implements axr_0 {
    public a6C b;
    public ItemStack d;
    public a6C c;
    public ItemStack a;

    public vy_0(Item item, a6C a6C2, Item item2, a6C a6C3) {
        this.d = new ItemStack(item);
        this.c = a6C2;
        this.a = new ItemStack(item2);
        this.b = a6C3;
    }

    @Override
    public void a(F8 f8, Random random) {
        int n = 1;
        if (this.c != null) {
            n = this.c.a(random);
        }
        int n2 = 1;
        if (this.b != null) {
            n2 = this.b.a(random);
        }
        f8.add(new ahh_0(new ItemStack(act_2.k(this.d), n, act_2.c(this.d)), new ItemStack(Items.emerald), new ItemStack(act_2.k(this.a), n2, act_2.c(this.a))));
    }
}

