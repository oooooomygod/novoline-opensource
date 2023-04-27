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
 * Renamed from net.aat
 */
public class aat_1
extends Container {
    private rs_1 j;

    @Override
    public ItemStack b(EntityPlayer entityPlayer, int n) {
        ItemStack itemStack = null;
        Slot slot = (Slot)ListInvoker.get(this.b, n);
        if (ItemStackInvoker.e(slot)) {
            ItemStack itemStack2 = ItemStackInvoker.a(slot);
            itemStack = act_2.C(itemStack2);
            if (n < 9 ? !this.a(itemStack2, 9, 45, true) : !this.a(itemStack2, 0, 9, false)) {
                return null;
            }
            if (itemStack2.a == 0) {
                ItemStackInvoker.a(slot, (ItemStack)null);
            } else {
                ItemStackInvoker.b(slot);
            }
            if (itemStack2.a == itemStack.a) {
                return null;
            }
            ItemStackInvoker.a(slot, entityPlayer, itemStack2);
        }
        return itemStack;
    }

    public aat_1(rs_1 rs_12, rs_1 rs_13) {
        this.j = rs_13;
        int n = 0;
        int n2 = 0;
        while (true) {
            this.a(new Slot(rs_13, n2 + n * 3, 62 + n2 * 18, 17 + n * 18));
            ++n2;
        }
    }

    @Override
    public boolean a(EntityPlayer entityPlayer) {
        return apw_0.b(this.j, entityPlayer);
    }
}

