/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ItemStackInvoker;
import cc.novoline.invoke.ListInvoker;
import net.minecraft.inventory.Container;
import deobf.Entity;
import deobf.EntityPlayer;
import net.minecraft.item.ItemStack;

/*
 * Renamed from net.aa8
 */
public class aa8_0
extends Container {
    private na_1 k;
    private rs_1 j;

    @Override
    public boolean a(EntityPlayer entityPlayer) {
        return apw_0.b(this.j, entityPlayer) && avq_0.m(this.k) && avq_0.a(this.k, (Entity)entityPlayer) < 8.0f;
    }

    @Override
    public ItemStack b(EntityPlayer entityPlayer, int n) {
        ItemStack itemStack = null;
        Slot slot = (Slot)ListInvoker.get(this.b, n);
        if (ItemStackInvoker.e(slot)) {
            ItemStack itemStack2 = ItemStackInvoker.a(slot);
            itemStack = act_2.C(itemStack2);
            if (n < apw_0.c(this.j) ? !this.a(itemStack2, apw_0.c(this.j), ListInvoker.size(this.b), true) : (ItemStackInvoker.b(this.c(1), itemStack2) && !ItemStackInvoker.e(this.c(1)) ? !this.a(itemStack2, 1, 2, false) : (ItemStackInvoker.b(this.c(0), itemStack2) ? !this.a(itemStack2, 0, 1, false) : apw_0.c(this.j) <= 2 || !this.a(itemStack2, 2, apw_0.c(this.j), false)))) {
                return null;
            }
            if (itemStack2.a == 0) {
                ItemStackInvoker.a(slot, (ItemStack)null);
            } else {
                ItemStackInvoker.b(slot);
            }
        }
        return itemStack;
    }

    @Override
    public void c(EntityPlayer entityPlayer) {
        super.c(entityPlayer);
        apw_0.c(this.j, entityPlayer);
    }

    public aa8_0(rs_1 rs_12, rs_1 rs_13, na_1 na_12, EntityPlayer entityPlayer) {
        this.j = rs_13;
        this.k = na_12;
        int n = 3;
        apw_0.a(rs_13, entityPlayer);
        int n2 = (n - 4) * 18;
        this.a(new a7h_0(this, rs_13, 0, 8, 18));
        this.a(new a7G(this, rs_13, 1, 8, 36, na_12));
        if (avq_0.n(na_12)) {
            int n3 = 0;
            int n4 = 0;
            while (true) {
                this.a(new Slot(rs_13, 2 + n4 + n3 * 5, 80 + n4 * 18, 18 + n3 * 18));
                ++n4;
            }
        }
        int n5 = 0;
        int n6 = 0;
        while (true) {
            this.a(new Slot(rs_12, n6 + n5 * 9 + 9, 8 + n6 * 18, 102 + n5 * 18 + n2));
            ++n6;
        }
    }
}

