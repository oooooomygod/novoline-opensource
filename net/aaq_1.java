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
 * Renamed from net.aaq
 */
public class aaq_1
extends Container {
    private a75 j;
    private rs_1 k;

    public aaq_1(rs_1 rs_12, rs_1 rs_13) {
        this.k = rs_13;
        this.j = new a75(this, rs_13, 0, 136, 110);
        this.a(this.j);
        int n = 36;
        int n2 = 137;
        int n3 = 0;
        int n4 = 0;
        while (true) {
            this.a(new Slot(rs_12, n4 + n3 * 9 + 9, n + n4 * 18, n2 + n3 * 18));
            ++n4;
        }
    }

    @Override
    public void c(EntityPlayer entityPlayer) {
        super.c(entityPlayer);
        if (!entityPlayer.worldObj.isRemote) {
            ItemStack itemStack = this.j.a(this.j.a());
            a6w_0.a(entityPlayer, itemStack, false);
        }
    }

    @Override
    public ItemStack b(EntityPlayer entityPlayer, int n) {
        ItemStack itemStack = null;
        Slot slot = (Slot)ListInvoker.get(this.b, n);
        if (ItemStackInvoker.e(slot)) {
            ItemStack itemStack2 = ItemStackInvoker.a(slot);
            itemStack = act_2.C(itemStack2);
            if (!this.a(itemStack2, 1, 37, true)) {
                return null;
            }
            ItemStackInvoker.a(slot, itemStack2, itemStack);
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

    public rs_1 a() {
        return this.k;
    }

    @Override
    public boolean a(EntityPlayer entityPlayer) {
        return apw_0.b(this.k, entityPlayer);
    }

    @Override
    public void a(int n, int n2) {
        apw_0.a(this.k, n, n2);
    }

    @Override
    public void a(ICrafting iCrafting) {
        super.a(iCrafting);
        JQ.a(iCrafting, (Container)this, this.k);
    }
}

