/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.EnumFacing;
import net.minecraft.item.ItemStack;

/*
 * Renamed from net.abQ
 */
class abq_1
extends aKT {
    @Override
    protected void a(aYE aYE2) {
        aV8.c(tb_2.a(aYE2), 1002, tb_2.f(aYE2), 0);
    }

    @Override
    public ItemStack b(aYE aYE2, ItemStack itemStack) {
        EnumFacing enumFacing = hy_0.a(tb_2.e(aYE2));
        double d = tb_2.d(aYE2) + (double)SJ.k(enumFacing);
        double d2 = (float)amv_2.h(tb_2.f(aYE2)) + 0.2f;
        double d3 = tb_2.c(aYE2) + (double)SJ.a(enumFacing);
        oi_1 oi_12 = new oi_1(tb_2.a(aYE2), d, d2, d3, itemStack);
        aV8.b(tb_2.a(aYE2), oi_12);
        act_2.b(itemStack, 1);
        return itemStack;
    }

    abq_1() {
    }
}

