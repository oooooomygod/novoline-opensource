/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ItemStackInvoker;
import cc.novoline.invoke.ListInvoker;
import net.minecraft.inventory.Container;
import deobf.EntityPlayer;
import net.minecraft.item.ItemStack;

/*
 * Renamed from net.aaz
 */
public class aaz_0
extends Container {
    private int j;
    private rs_1 k;

    public aaz_0(rs_1 rs_12, rs_1 rs_13, EntityPlayer entityPlayer) {
        this.k = rs_13;
        this.j = apw_0.c(rs_13) / 9;
        apw_0.a(rs_13, entityPlayer);
        int n = (this.j - 4) * 18;
        int n2 = 0;
        if (n2 < this.j) {
            int n3 = 0;
            while (true) {
                this.a(new Slot(rs_13, n3 + n2 * 9, 8 + n3 * 18, 18 + n2 * 18));
                ++n3;
            }
        }
        n2 = 0;
        int n4 = 0;
        while (true) {
            this.a(new Slot(rs_12, n4 + n2 * 9 + 9, 8 + n4 * 18, 103 + n2 * 18 + n));
            ++n4;
        }
    }

    @Override
    public void c(EntityPlayer entityPlayer) {
        super.c(entityPlayer);
        apw_0.c(this.k, entityPlayer);
    }

    @Override
    public boolean a(EntityPlayer entityPlayer) {
        return apw_0.b(this.k, entityPlayer);
    }

    public rs_1 a() {
        return this.k;
    }

    @Override
    public ItemStack b(EntityPlayer entityPlayer, int n) {
        ItemStack itemStack = null;
        Slot slot = (Slot)ListInvoker.get(this.b, n);
        if (ItemStackInvoker.e(slot)) {
            ItemStack itemStack2 = ItemStackInvoker.a(slot);
            itemStack = act_2.C(itemStack2);
            if (n < this.j * 9 ? !this.a(itemStack2, this.j * 9, ListInvoker.size(this.b), true) : !this.a(itemStack2, 0, this.j * 9, false)) {
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
}

