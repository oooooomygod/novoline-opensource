/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ItemStackInvoker;
import cc.novoline.invoke.ListInvoker;
import net.minecraft.inventory.Container;
import deobf.EntityPlayer;
import deobf.ICrafting;
import net.minecraft.item.ItemStack;

/*
 * Renamed from net.aaX
 */
public class aax_1
extends Container {
    private anb_1 j;
    private World l;
    private a7K k;

    public anb_1 a() {
        return this.j;
    }

    @Override
    public void c(EntityPlayer entityPlayer) {
        super.c(entityPlayer);
        ze_1.a(this.k, (EntityPlayer)null);
        super.c(entityPlayer);
        if (!this.l.isRemote) {
            ItemStack itemStack = aoo_2.b(this.j, 0);
            a6w_0.a(entityPlayer, itemStack, false);
            itemStack = aoo_2.b(this.j, 1);
            a6w_0.a(entityPlayer, itemStack, false);
        }
    }

    @Override
    public boolean a(EntityPlayer entityPlayer) {
        return ze_1.a(this.k) == entityPlayer;
    }

    @Override
    public ItemStack b(EntityPlayer entityPlayer, int n) {
        ItemStack itemStack = null;
        Slot slot = (Slot)ListInvoker.get(this.b, n);
        if (ItemStackInvoker.e(slot)) {
            ItemStack itemStack2 = ItemStackInvoker.a(slot);
            itemStack = act_2.C(itemStack2);
            if (n == 2) {
                if (!this.a(itemStack2, 3, 39, true)) {
                    return null;
                }
                ItemStackInvoker.a(slot, itemStack2, itemStack);
            } else if (n != 1 ? (n >= 3 && n < 30 ? !this.a(itemStack2, 30, 39, false) : n >= 30 && n < 39 && !this.a(itemStack2, 3, 30, false)) : !this.a(itemStack2, 3, 39, false)) {
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

    public aax_1(aSK aSK2, a7K a7K2, World world) {
        this.k = a7K2;
        this.l = world;
        this.j = new anb_1(aSK2.f, a7K2);
        this.a(new Slot(this.j, 0, 36, 53));
        this.a(new Slot(this.j, 1, 62, 53));
        this.a(new a7P(aSK2.f, a7K2, this.j, 2, 120, 53));
        int n = 0;
        int n2 = 0;
        while (true) {
            this.a(new Slot(aSK2, n2 + n * 9 + 9, 8 + n2 * 18, 84 + n * 18));
            ++n2;
        }
    }

    @Override
    public void a(int n, int n2) {
    }

    @Override
    public void a(ICrafting iCrafting) {
        super.a(iCrafting);
    }

    public void a(int n) {
        this.j.b(n);
    }

    @Override
    public void b(rs_1 rs_12) {
        aoo_2.a(this.j);
        super.b(rs_12);
    }

    @Override
    public void c() {
        super.c();
    }
}

