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
import java.util.Iterator;

/*
 * Renamed from net.aaN
 */
public class aan_0
extends Container {
    private int k;
    private int j;
    private int n;
    private rs_1 l;
    private int m;

    public aan_0(aSK aSK2, rs_1 rs_12) {
        this.l = rs_12;
        this.a(new Slot(rs_12, 0, 56, 17));
        this.a(new a7F(rs_12, 1, 56, 53));
        this.a(new a7Z(aSK2.f, rs_12, 2, 116, 35));
        int n = 0;
        int n2 = 0;
        while (true) {
            this.a(new Slot(aSK2, n2 + n * 9 + 9, 8 + n2 * 18, 84 + n * 18));
            ++n2;
        }
    }

    @Override
    public boolean a(EntityPlayer entityPlayer) {
        return apw_0.b(this.l, entityPlayer);
    }

    @Override
    public void a(int n, int n2) {
        apw_0.a(this.l, n, n2);
    }

    @Override
    public void c() {
        super.c();
        Iterator iterator = ListInvoker.iterator(this.d);
        while (dz_0.c(iterator)) {
            ICrafting iCrafting;
            ICrafting iCrafting2 = iCrafting = (ICrafting)dz_0.b(iterator);
            if (this.m != apw_0.a(this.l, 2)) {
                JQ.a(iCrafting2, (Container)this, 2, apw_0.a(this.l, 2));
            }
            if (this.j != apw_0.a(this.l, 0)) {
                JQ.a(iCrafting2, (Container)this, 0, apw_0.a(this.l, 0));
            }
            if (this.k != apw_0.a(this.l, 1)) {
                JQ.a(iCrafting2, (Container)this, 1, apw_0.a(this.l, 1));
            }
            if (this.n == apw_0.a(this.l, 3)) continue;
            JQ.a(iCrafting2, (Container)this, 3, apw_0.a(this.l, 3));
        }
        this.m = apw_0.a(this.l, 2);
        this.j = apw_0.a(this.l, 0);
        this.k = apw_0.a(this.l, 1);
        this.n = apw_0.a(this.l, 3);
    }

    @Override
    public void a(ICrafting iCrafting) {
        super.a(iCrafting);
        JQ.a(iCrafting, (Container)this, this.l);
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
            } else if (n != 1 ? (a3q_0.a(a3q_0.a(), itemStack2) != null ? !this.a(itemStack2, 0, 1, false) : (aRZ.a(itemStack2) ? !this.a(itemStack2, 1, 2, false) : (n >= 3 && n < 30 ? !this.a(itemStack2, 30, 39, false) : n >= 30 && n < 39 && !this.a(itemStack2, 3, 30, false)))) : !this.a(itemStack2, 3, 39, false)) {
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
}

