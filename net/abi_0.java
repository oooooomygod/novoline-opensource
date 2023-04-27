/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.EnumFacing;
import net.minecraft.item.ItemStack;
import java.util.Random;

/*
 * Renamed from net.abI
 */
class abi_0
extends aKT {
    @Override
    public ItemStack b(aYE aYE2, ItemStack itemStack) {
        EnumFacing enumFacing = hy_0.a(tb_2.e(aYE2));
        vt_0 vt_02 = hy_0.a(aYE2);
        double d = z7_0.b(vt_02) + (double)((float)SJ.k(enumFacing) * 0.3f);
        double d2 = z7_0.a(vt_02) + (double)((float)SJ.f(enumFacing) * 0.3f);
        double d3 = z7_0.c(vt_02) + (double)((float)SJ.a(enumFacing) * 0.3f);
        World world = tb_2.a(aYE2);
        Random random = world.o;
        double d4 = a5_0.f(random) * 0.05 + (double)SJ.k(enumFacing);
        double d5 = a5_0.f(random) * 0.05 + (double)SJ.f(enumFacing);
        double d6 = a5_0.f(random) * 0.05 + (double)SJ.a(enumFacing);
        aV8.b(world, new oG(world, d, d2, d3, d4, d5, d6));
        act_2.b(itemStack, 1);
        return itemStack;
    }

    abi_0() {
    }

    @Override
    protected void a(aYE aYE2) {
        aV8.c(tb_2.a(aYE2), 1009, tb_2.f(aYE2), 0);
    }
}

