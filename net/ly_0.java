/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

/*
 * Renamed from net.Ly
 */
public class ly_0
extends ItemBlock {
    private BlockLeaves n;

    @Override
    public int c(int n) {
        return n | 4;
    }

    @Override
    public String a(ItemStack itemStack) {
        return aL0.a(aL0.a(aL0.a(new StringBuilder(), super.d()), eo_2.a), aa1_0.b(this.n, act_2.c(itemStack)).b()).toString();
    }

    @Override
    public int a(ItemStack itemStack, int n) {
        return aa1_0.a(this.n, aa1_0.a(this.n, act_2.c(itemStack)));
    }

    public ly_0(BlockLeaves blockLeaves) {
        super(blockLeaves);
        this.n = blockLeaves;
        this.setMaxDamage(0);
        this.a(true);
    }
}

