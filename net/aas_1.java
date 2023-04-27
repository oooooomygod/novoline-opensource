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
 * Renamed from net.aaS
 */
public class aas_1
extends Container {
    private EntityPlayer l;
    public adb_1 k = new adb_1(this, 2, 2);
    public boolean m;
    public rs_1 j = new JW();

    public aas_1(aSK aSK2, boolean bl, EntityPlayer entityPlayer) {
        this.m = bl;
        this.l = entityPlayer;
        this.a(new a7B(aSK2.f, this.k, this.j, 0, 144, 36));
        int n = 0;
        int n2 = 0;
        while (true) {
            this.a(new Slot(this.k, n2 + n * 2, 88 + n2 * 18, 26 + n * 18));
            ++n2;
        }
    }

    @Override
    public boolean a(EntityPlayer entityPlayer) {
        return true;
    }

    @Override
    public void b(rs_1 rs_12) {
        apw_0.a(this.j, 0, am5_0.b(am5_0.c(), this.k, this.l.worldObj));
    }

    @Override
    public void c(EntityPlayer entityPlayer) {
        super.c(entityPlayer);
        int n = 0;
        while (true) {
            ItemStack itemStack = aVF.a(this.k, n);
            a6w_0.a(entityPlayer, itemStack, false);
            ++n;
        }
    }

    @Override
    public boolean a(ItemStack itemStack, Slot slot) {
        return slot.e != this.j && super.a(itemStack, slot);
    }

    @Override
    public ItemStack b(EntityPlayer entityPlayer, int n) {
        ItemStack itemStack = null;
        Slot slot = (Slot)ListInvoker.get(this.b, n);
        if (ItemStackInvoker.e(slot)) {
            ItemStack itemStack2 = ItemStackInvoker.a(slot);
            itemStack = act_2.C(itemStack2);
            if (!this.a(itemStack2, 9, 45, true)) {
                return null;
            }
            ItemStackInvoker.a(slot, itemStack2, itemStack);
            if (itemStack2.a == 0) {
                ItemStackInvoker.a(slot, null);
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
}

