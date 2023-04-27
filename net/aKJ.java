/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.Entity;
import deobf.EnumFacing;
import deobf.IProjectile;
import net.minecraft.item.ItemStack;

public abstract class aKJ
extends aKT {
    @Override
    public ItemStack b(aYE aYE2, ItemStack itemStack) {
        World world = tb_2.a(aYE2);
        vt_0 vt_02 = hy_0.a(aYE2);
        EnumFacing enumFacing = hy_0.a(tb_2.e(aYE2));
        IProjectile iProjectile = this.a(world, vt_02);
        aVT.a(iProjectile, SJ.k(enumFacing), (float)SJ.f(enumFacing) + 0.1f, SJ.a(enumFacing), this.a(), this.b());
        aV8.b(world, (Entity)((Object)iProjectile));
        act_2.b(itemStack, 1);
        return itemStack;
    }

    protected abstract IProjectile a(World var1, vt_0 var2);

    protected float a() {
        return 1.1f;
    }

    protected float b() {
        return 6.0f;
    }

    @Override
    protected void a(aYE aYE2) {
        aV8.c(tb_2.a(aYE2), 1002, tb_2.f(aYE2), 0);
    }
}

