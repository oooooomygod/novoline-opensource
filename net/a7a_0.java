/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.EntityPlayer;
import net.minecraft.item.ItemStack;

/*
 * Renamed from net.a7a
 */
class a7a_0
extends Slot {
    private EntityPlayer f;

    @Override
    public void a(EntityPlayer entityPlayer, ItemStack itemStack) {
        if (act_2.k(itemStack) == Items.potionitem && act_2.c(itemStack) > 0) {
            a6w_0.a(this.f, apf_0.s);
        }
        super.a(entityPlayer, itemStack);
    }

    public a7a_0(EntityPlayer entityPlayer, rs_1 rs_12, int n, int n2, int n3) {
        super(rs_12, n, n2, n3);
        this.f = entityPlayer;
    }

    @Override
    public boolean a(ItemStack itemStack) {
        return a7a_0.b(itemStack);
    }

    @Override
    public int a() {
        return 1;
    }

    public static boolean b(ItemStack itemStack) {
        return act_2.k(itemStack) == Items.potionitem || act_2.k(itemStack) == Items.glass_bottle;
    }
}

