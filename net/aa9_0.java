/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.ItemStackInvoker;
import cc.novoline.invoke.ListInvoker;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.Container;
import deobf.EntityPlayer;
import net.minecraft.item.ItemStack;

/*
 * Renamed from net.aa9
 */
public class aa9_0
extends Container {
    public adb_1 m = new adb_1(this, 3, 3);
    public rs_1 j = new JW();
    private BlockPos k;
    private World l;

    @Override
    public void b(rs_1 rs_12) {
        apw_0.a(this.j, 0, am5_0.b(am5_0.c(), this.m, this.l));
    }

    public aa9_0(aSK aSK2, World world, BlockPos blockPos) {
        this.l = world;
        this.k = blockPos;
        this.a(new a7B(aSK2.f, this.m, this.j, 0, 124, 35));
        int n = 0;
        int n2 = 0;
        while (true) {
            this.a(new Slot(this.m, n2 + n * 3, 30 + n2 * 18, 17 + n * 18));
            ++n2;
        }
    }

    @Override
    public void c(EntityPlayer entityPlayer) {
        super.c(entityPlayer);
        if (!this.l.isRemote) {
            int n = 0;
            while (true) {
                ItemStack itemStack = aVF.a(this.m, n);
                a6w_0.a(entityPlayer, itemStack, false);
                ++n;
            }
        }
    }

    @Override
    public boolean a(ItemStack itemStack, Slot slot) {
        return slot.e != this.j && super.a(itemStack, slot);
    }

    @Override
    public boolean a(EntityPlayer entityPlayer) {
        return BlockStateInvoker.getBlock(aV8.q(this.l, this.k)) == Blocks.aq && a6w_0.b(entityPlayer, (double)amv_2.j(this.k) + 0.5, (double)amv_2.h(this.k) + 0.5, (double)amv_2.i(this.k) + 0.5) <= 64.0;
    }

    @Override
    public ItemStack b(EntityPlayer entityPlayer, int n) {
        ItemStack itemStack = null;
        Slot slot = (Slot)ListInvoker.get(this.b, n);
        if (ItemStackInvoker.e(slot)) {
            ItemStack itemStack2 = ItemStackInvoker.a(slot);
            itemStack = act_2.C(itemStack2);
            if (!this.a(itemStack2, 10, 46, true)) {
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

