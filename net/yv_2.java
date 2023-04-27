/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.item.ItemStack;

/*
 * Renamed from net.yv
 */
public class yv_2
extends yl_2 {
    @Override
    public boolean a(ItemStack itemStack) {
        return act_2.k(itemStack) == Items.shears || super.a(itemStack);
    }

    @Override
    public int a(int n) {
        return 1 + 10 * (n - 1);
    }

    @Override
    public int c() {
        return 5;
    }

    protected yv_2(int n, ResourceLocation resourceLocation, int n2) {
        super(n, resourceLocation, n2, b_0.DIGGER);
        this.a(apu_1.a);
    }

    @Override
    public int d(int n) {
        return super.a(n) + 50;
    }
}

