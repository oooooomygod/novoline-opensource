/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 */
package net;

import com.google.common.base.Function;
import net.minecraft.item.ItemStack;

class WP
implements Function<ItemStack, String> {
    String[] a;

    public String a(ItemStack itemStack) {
        int n = act_2.c(itemStack);
        if (n >= this.a.length) {
            n = 0;
        }
        return this.a[n];
    }

    WP(String[] stringArray) {
        this.a = stringArray;
    }
}

