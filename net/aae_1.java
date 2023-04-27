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
 * Renamed from net.aae
 */
public class aae_1
extends Container {
    private rs_1 j;
    private int l;
    private Slot k;

    @Override
    public boolean a(EntityPlayer entityPlayer) {
        return apw_0.b(this.j, entityPlayer);
    }

    @Override
    public void a(int n, int n2) {
        apw_0.a(this.j, n, n2);
    }

    public aae_1(aSK aSK2, rs_1 rs_12) {
        this.j = rs_12;
        this.a(new a7a_0(aSK2.f, rs_12, 0, 56, 46));
        this.a(new a7a_0(aSK2.f, rs_12, 1, 79, 53));
        this.a(new a7a_0(aSK2.f, rs_12, 2, 102, 46));
        this.k = this.a(new a7D(this, rs_12, 3, 79, 17));
        int n = 0;
        int n2 = 0;
        while (true) {
            this.a(new Slot(aSK2, n2 + n * 9 + 9, 8 + n2 * 18, 84 + n * 18));
            ++n2;
        }
    }

    @Override
    public void a(ICrafting iCrafting) {
        super.a(iCrafting);
        JQ.a(iCrafting, (Container)this, this.j);
    }

    @Override
    public ItemStack b(EntityPlayer entityPlayer, int n) {
        ItemStack itemStack = null;
        Slot slot = (Slot)ListInvoker.get(this.b, n);
        if (ItemStackInvoker.e(slot)) {
            ItemStack itemStack2 = ItemStackInvoker.a(slot);
            itemStack = act_2.C(itemStack2);
            if (n > 2 && n != 3) {
                if (!ItemStackInvoker.e(this.k) && ItemStackInvoker.b(this.k, itemStack2) ? !this.a(itemStack2, 3, 4, false) : (a7a_0.b(itemStack) ? !this.a(itemStack2, 0, 3, false) : (n >= 4 && n < 31 ? !this.a(itemStack2, 31, 40, false) : (n >= 31 && n < 40 ? !this.a(itemStack2, 4, 31, false) : !this.a(itemStack2, 4, 40, false))))) {
                    return null;
                }
            } else {
                if (!this.a(itemStack2, 4, 40, true)) {
                    return null;
                }
                ItemStackInvoker.a(slot, itemStack2, itemStack);
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

    @Override
    public void c() {
        super.c();
        Iterator iterator = ListInvoker.iterator(this.d);
        while (dz_0.c(iterator)) {
            ICrafting iCrafting;
            ICrafting iCrafting2 = iCrafting = (ICrafting)dz_0.b(iterator);
            if (this.l == apw_0.a(this.j, 0)) continue;
            JQ.a(iCrafting2, (Container)this, 0, apw_0.a(this.j, 0));
        }
        this.l = apw_0.a(this.j, 0);
    }
}

