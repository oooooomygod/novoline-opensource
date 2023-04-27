/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.item.ItemStack;
import java.util.Random;

/*
 * Renamed from net.lO
 */
class lo_1
implements axr_0 {
    lo_1() {
    }

    @Override
    public void a(F8 f8, Random random) {
        yl_2 yl_22 = yl_2.m[a5_0.a(random, yl_2.m.length)];
        int n = MathHelper.a(random, xr_1.b(yl_22), xr_1.c(yl_22));
        ItemStack itemStack = arw_2.a(Items.enchanted_book, new cl_0(yl_22, n));
        int n2 = 2 + a5_0.a(random, 5 + n * 10) + 3 * n;
        if (n2 > 64) {
            n2 = 64;
        }
        f8.add(new ahh_0(new ItemStack(Items.book), new ItemStack(Items.emerald, n2), itemStack));
    }
}

