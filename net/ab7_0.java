/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.Entity;
import deobf.EntityLivingBase;
import deobf.EnumFacing;
import net.minecraft.item.ItemStack;

/*
 * Renamed from net.ab7
 */
class ab7_0
extends aKT {
    @Override
    public ItemStack b(aYE aYE2, ItemStack itemStack) {
        EnumFacing enumFacing = hy_0.a(tb_2.e(aYE2));
        double d = tb_2.d(aYE2) + (double)SJ.k(enumFacing);
        double d2 = (float)amv_2.h(tb_2.f(aYE2)) + 0.2f;
        double d3 = tb_2.c(aYE2) + (double)SJ.a(enumFacing);
        Entity entity = amd_0.a(tb_2.a(aYE2), act_2.c(itemStack), d, d2, d3);
        if (entity instanceof EntityLivingBase && act_2.g(itemStack)) {
            ayj_0.a(entity, act_2.w(itemStack));
        }
        act_2.b(itemStack, 1);
        return itemStack;
    }

    ab7_0() {
    }
}

