/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.item.ItemStack;

public class a7F
extends Slot {
    @Override
    public int c(ItemStack itemStack) {
        return a7F.b(itemStack) ? 1 : super.c(itemStack);
    }

    public static boolean b(ItemStack itemStack) {
        return act_2.k(itemStack) != null && act_2.k(itemStack) == Items.bucket;
    }

    public a7F(rs_1 rs_12, int n, int n2, int n3) {
        super(rs_12, n, n2, n3);
    }

    @Override
    public boolean a(ItemStack itemStack) {
        return aRZ.a(itemStack) || a7F.b(itemStack);
    }
}

