/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.IProjectile;
import net.minecraft.item.ItemStack;

/*
 * Renamed from net.abp
 */
class abp_2
extends aKJ {
    ItemStack c;
    aa3_0 b;

    @Override
    protected float a() {
        return super.a() * 1.25f;
    }

    @Override
    protected float b() {
        return super.b() * 0.5f;
    }

    abp_2(aa3_0 aa3_02, ItemStack itemStack) {
        this.b = aa3_02;
        this.c = itemStack;
    }

    @Override
    protected IProjectile a(World world, vt_0 vt_02) {
        return new of_2(world, z7_0.b(vt_02), z7_0.a(vt_02), z7_0.c(vt_02), act_2.C(this.c));
    }
}

