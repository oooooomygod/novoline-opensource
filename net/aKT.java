/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.EnumFacing;
import net.minecraft.item.ItemStack;

public class aKT
implements IBehaviorDispenseItem {
    @Override
    public ItemStack a(aYE aYE2, ItemStack itemStack) {
        ItemStack itemStack2 = this.b(aYE2, itemStack);
        this.a(aYE2);
        this.a(aYE2, hy_0.a(tb_2.e(aYE2)));
        return itemStack2;
    }

    public static void a(World world, ItemStack itemStack, int n, EnumFacing enumFacing, vt_0 vt_02) {
        double d = z7_0.b(vt_02);
        double d2 = z7_0.a(vt_02);
        double d3 = z7_0.c(vt_02);
        d2 = SJ.h(enumFacing) == kl_1.Y ? (d2 -= 0.125) : (d2 -= 0.15625);
        og_0 og_02 = new og_0(world, d, d2, d3, itemStack);
        double d4 = a5_0.c(world.o) * 0.1 + 0.2;
        og_02.motionX = (double)SJ.k(enumFacing) * d4;
        og_02.motionY = 0.2f;
        og_02.motionZ = (double)SJ.a(enumFacing) * d4;
        og_02.motionX += a5_0.f(world.o) * (double)0.0075f * (double)n;
        og_02.motionY += a5_0.f(world.o) * (double)0.0075f * (double)n;
        og_02.motionZ += a5_0.f(world.o) * (double)0.0075f * (double)n;
        aV8.b(world, og_02);
    }

    private int a(EnumFacing enumFacing) {
        return SJ.k(enumFacing) + 1 + (SJ.a(enumFacing) + 1) * 3;
    }

    protected void a(aYE aYE2, EnumFacing enumFacing) {
        aV8.c(tb_2.a(aYE2), 2000, tb_2.f(aYE2), this.a(enumFacing));
    }

    protected void a(aYE aYE2) {
        aV8.c(tb_2.a(aYE2), 1000, tb_2.f(aYE2), 0);
    }

    protected ItemStack b(aYE aYE2, ItemStack itemStack) {
        EnumFacing enumFacing = hy_0.a(tb_2.e(aYE2));
        vt_0 vt_02 = hy_0.a(aYE2);
        ItemStack itemStack2 = act_2.b(itemStack, 1);
        aKT.a(tb_2.a(aYE2), itemStack2, 6, enumFacing, vt_02);
        return itemStack;
    }
}

