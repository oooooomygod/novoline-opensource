/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ItemStackInvoker;
import cc.novoline.invoke.ListInvoker;
import net.minecraft.inventory.Container;
import deobf.EntityPlayer;
import net.minecraft.item.ItemStack;
import java.util.List;

/*
 * Renamed from net.aaP
 */
class aap_1
extends Container {
    public List<ItemStack> j = my_0.c();

    @Override
    public boolean b(Slot slot) {
        return slot.e instanceof aSK || slot.d > 90 && slot.a <= 162;
    }

    @Override
    public ItemStack b(EntityPlayer entityPlayer, int n) {
        Slot slot;
        if (n >= ListInvoker.size(this.b) - 9 && n < ListInvoker.size(this.b) && ItemStackInvoker.e(slot = (Slot)ListInvoker.get(this.b, n))) {
            ItemStackInvoker.a(slot, null);
        }
        return null;
    }

    public boolean a() {
        return ListInvoker.size(this.j) > 45;
    }

    @Override
    protected void a(int n, int n2, boolean bl, EntityPlayer entityPlayer) {
    }

    public aap_1(EntityPlayer entityPlayer) {
        aSK cfr_ignored_0 = entityPlayer.inventory;
        int n = 0;
        int n2 = 0;
        while (true) {
            this.a(new Slot(rb_0.m(), n * 9 + n2, 9 + n2 * 18, 18 + n * 18));
            ++n2;
        }
    }

    public void a(float f) {
        int n = (ListInvoker.size(this.j) + 9 - 1) / 9 - 5;
        int n2 = (int)((double)(f * (float)n) + 0.5);
        n2 = 0;
        int n3 = 0;
        int n4 = 0;
        while (true) {
            int n5;
            if ((n5 = n4 + (n3 + n2) * 9) < ListInvoker.size(this.j)) {
                ajs_0.a(rb_0.m(), n4 + n3 * 9, (ItemStack)ListInvoker.get(this.j, n5));
            } else {
                ajs_0.a(rb_0.m(), n4 + n3 * 9, null);
            }
            ++n4;
        }
    }

    @Override
    public boolean a(EntityPlayer entityPlayer) {
        return true;
    }

    @Override
    public boolean a(ItemStack itemStack, Slot slot) {
        return slot.d > 90;
    }
}

