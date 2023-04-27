/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.item.ItemStack;

/*
 * Renamed from net.yg
 */
public class yg_2
extends yl_2 {
    @Override
    public int c() {
        return 1;
    }

    @Override
    public int d(int n) {
        return super.a(n) + 50;
    }

    @Override
    public boolean a(ItemStack itemStack) {
        return act_2.k(itemStack) == Items.shears || super.a(itemStack);
    }

    @Override
    public boolean a(yl_2 yl_22) {
        return super.a(yl_22) && yl_22.c != yg_2.s.c;
    }

    @Override
    public int a(int n) {
        return 15;
    }

    protected yg_2(int n, ResourceLocation resourceLocation, int n2) {
        super(n, resourceLocation, n2, b_0.DIGGER);
        this.a(dc_1.a);
    }
}

