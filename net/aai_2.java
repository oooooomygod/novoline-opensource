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
 * Renamed from net.aai
 */
public class aai_2
extends Container {
    private rs_1 j;

    @Override
    public ItemStack b(EntityPlayer entityPlayer, int n) {
        ItemStack itemStack = null;
        Slot slot = (Slot)ListInvoker.get(this.b, n);
        if (ItemStackInvoker.e(slot)) {
            ItemStack itemStack2 = ItemStackInvoker.a(slot);
            itemStack = act_2.C(itemStack2);
            if (n < apw_0.c(this.j) ? !this.a(itemStack2, apw_0.c(this.j), ListInvoker.size(this.b), true) : !this.a(itemStack2, 0, apw_0.c(this.j), false)) {
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

    public aai_2(aSK aSK2, rs_1 rs_12, EntityPlayer entityPlayer) {
        int n;
        this.j = rs_12;
        apw_0.a(rs_12, entityPlayer);
        int n2 = 51;
        for (n = 0; n < apw_0.c(rs_12); ++n) {
            this.a(new Slot(rs_12, n, 44 + n * 18, 20));
        }
        n = 0;
        int n3 = 0;
        while (true) {
            this.a(new Slot(aSK2, n3 + n * 9 + 9, 8 + n3 * 18, n * 18 + n2));
            ++n3;
        }
    }

    @Override
    public boolean a(EntityPlayer entityPlayer) {
        return apw_0.b(this.j, entityPlayer);
    }
}

