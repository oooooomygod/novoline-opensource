/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.inventory;

import cc.novoline.invoke.InventoryInvoker;
import cc.novoline.invoke.ItemStackInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MathInvoker;
import deobf.EntityPlayer;
import deobf.ICrafting;
import deobf.TileEntity;
import net.minecraft.item.ItemStack;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import net.JQ;
import net.MathHelper;
import net.Slot;
import net.a6w_0;
import net.aS0;
import net.aSK;
import net.aSY;
import net.ac3;
import net.act_2;
import net.axe_2;
import net.dz_0;
import net.my_0;
import net.px_0;
import net.rs_1;

public abstract class Container {
    public List<ItemStack> a = my_0.c();
    private Set<Slot> h;
    private short i;
    protected List<ICrafting> d;
    private int c = -1;
    public int f;
    private Set<EntityPlayer> g;
    private static int e;
    public List<Slot> b = my_0.c();

    public boolean b(Slot slot) {
        return true;
    }

    public static int b(int n, int n2) {
        return n & 3 | (n2 & 3) << 2;
    }

    protected boolean a(ItemStack itemStack, int n, int n2, boolean bl) {
        ItemStack itemStack2;
        Slot slot;
        boolean bl2 = false;
        int n3 = n;
        if (act_2.q(itemStack)) {
            for (n3 = n2 - 1; itemStack.a > 0 && (n3 < n2 || n3 >= n); --n3) {
                slot = (Slot)ListInvoker.get(this.b, n3);
                itemStack2 = ItemStackInvoker.a(slot);
                if (act_2.k(itemStack2) != act_2.k(itemStack) || act_2.t(itemStack) && act_2.c(itemStack) != act_2.c(itemStack2) || !act_2.c(itemStack, itemStack2)) continue;
                int n4 = itemStack2.a + itemStack.a;
                if (n4 <= act_2.f(itemStack)) {
                    itemStack.a = 0;
                    itemStack2.a = n4;
                    ItemStackInvoker.b(slot);
                    bl2 = true;
                    continue;
                }
                if (itemStack2.a >= act_2.f(itemStack)) continue;
                itemStack.a -= act_2.f(itemStack) - itemStack2.a;
                itemStack2.a = act_2.f(itemStack);
                ItemStackInvoker.b(slot);
                bl2 = true;
            }
        }
        if (itemStack.a > 0 && ((n3 = n2 - 1) < n2 || n3 >= n)) {
            slot = (Slot)ListInvoker.get(this.b, n3);
            itemStack2 = ItemStackInvoker.a(slot);
            ItemStackInvoker.a(slot, act_2.C(itemStack));
            ItemStackInvoker.b(slot);
            itemStack.a = 0;
            bl2 = true;
        }
        return bl2;
    }

    protected void a(int n, int n2, boolean bl, EntityPlayer entityPlayer) {
        this.a(n, n2, 1, entityPlayer);
    }

    public void a(EntityPlayer entityPlayer, boolean bl) {
        aS0.a(this.g, entityPlayer);
    }

    public static void a(Set<Slot> set, int n, ItemStack itemStack, int n2) {
        switch (n) {
            case 0: {
                itemStack.a = MathHelper.f((float)itemStack.a / (float)aS0.d(set));
                break;
            }
            case 1: {
                itemStack.a = 1;
                break;
            }
            case 2: {
                itemStack.a = px_0.m(act_2.k(itemStack));
            }
        }
        itemStack.a += n2;
    }

    public static int a(TileEntity tileEntity) {
        return tileEntity instanceof rs_1 ? Container.a((rs_1)((Object)tileEntity)) : 0;
    }

    public Container() {
        this.h = axe_2.a();
        this.d = my_0.c();
        this.g = axe_2.a();
    }

    public ItemStack b(EntityPlayer entityPlayer, int n) {
        Slot slot = (Slot)ListInvoker.get(this.b, n);
        return ItemStackInvoker.a(slot);
    }

    public static int a(int n) {
        return n >> 2 & 3;
    }

    public void a(int n, ItemStack itemStack) {
        ItemStackInvoker.a(this.c(n), itemStack);
    }

    /*
     * Enabled aggressive block sorting
     */
    public ItemStack a(int n, int n2, int n3, EntityPlayer entityPlayer) {
        ItemStack itemStack;
        block25: {
            ItemStack itemStack2;
            block23: {
                Iterator iterator;
                int n4;
                ItemStack itemStack3;
                aSK aSK2;
                block24: {
                    block22: {
                        itemStack2 = null;
                        aSK2 = entityPlayer.inventory;
                        if (n3 != 5) break block22;
                        int n5 = e;
                        e = Container.b(n2);
                        if ((n5 != 1 || e != 2) && n5 != e) {
                            this.b();
                            return itemStack2;
                        }
                        if (InventoryInvoker.f(aSK2) == null) {
                            this.b();
                            return itemStack2;
                        }
                        if (e == 0) {
                            this.c = Container.a(n2);
                            if (Container.a(this.c, entityPlayer)) {
                                e = 1;
                                aS0.e(this.h);
                                return itemStack2;
                            }
                            this.b();
                            return itemStack2;
                        }
                        if (e == 1) {
                            Slot slot = (Slot)ListInvoker.get(this.b, n);
                            if (!Container.a(slot, InventoryInvoker.f(aSK2), true)) return itemStack2;
                            if (!ItemStackInvoker.b(slot, InventoryInvoker.f(aSK2))) return itemStack2;
                            if (InventoryInvoker.f((aSK)aSK2).a <= aS0.d(this.h)) return itemStack2;
                            if (!this.b(slot)) return itemStack2;
                            aS0.b(this.h, slot);
                            return itemStack2;
                        }
                        if (e != 2) {
                            this.b();
                            return itemStack2;
                        }
                        if (aS0.b(this.h)) break block23;
                        itemStack3 = act_2.C(InventoryInvoker.f(aSK2));
                        n4 = InventoryInvoker.f((aSK)aSK2).a;
                        iterator = aS0.f(this.h);
                        break block24;
                    }
                    if (e != 0) {
                        this.b();
                        return itemStack2;
                    }
                    if (n3 == 1 && n2 == 1) {
                        if (n == -999) {
                            if (InventoryInvoker.f(aSK2) == null) return itemStack2;
                            a6w_0.a(entityPlayer, InventoryInvoker.f(aSK2), true);
                            InventoryInvoker.c(aSK2, null);
                            if (n2 != 1) return itemStack2;
                            a6w_0.a(entityPlayer, act_2.b(InventoryInvoker.f(aSK2), 1), true);
                            if (InventoryInvoker.f((aSK)aSK2).a != 0) return itemStack2;
                            InventoryInvoker.c(aSK2, null);
                            return itemStack2;
                        }
                        if (n3 != 1) return null;
                        return null;
                    }
                    if (n3 == 2 && n2 < 9) {
                        Slot slot = (Slot)ListInvoker.get(this.b, n);
                        if (!ItemStackInvoker.a(slot, entityPlayer)) return itemStack2;
                        ItemStack itemStack4 = InventoryInvoker.c(aSK2, n2);
                        boolean bl = slot.e == aSK2 && ItemStackInvoker.b(slot, itemStack4);
                        int n6 = -1;
                        n6 = InventoryInvoker.e(aSK2);
                        bl |= n6 > -1;
                        if (!ItemStackInvoker.e(slot)) {
                            if (ItemStackInvoker.e(slot)) return itemStack2;
                            if (!ItemStackInvoker.b(slot, itemStack4)) return itemStack2;
                            InventoryInvoker.a(aSK2, n2, null);
                            ItemStackInvoker.a(slot, itemStack4);
                            return itemStack2;
                        }
                        ItemStack itemStack5 = ItemStackInvoker.a(slot);
                        InventoryInvoker.a(aSK2, n2, act_2.C(itemStack5));
                        if (slot.e == aSK2 && ItemStackInvoker.b(slot, itemStack4)) {
                            ItemStackInvoker.a(slot, itemStack5.a);
                            ItemStackInvoker.a(slot, itemStack4);
                            ItemStackInvoker.a(slot, entityPlayer, itemStack5);
                            return itemStack2;
                        }
                        if (n6 <= -1) return itemStack2;
                        InventoryInvoker.b(aSK2, itemStack4);
                        ItemStackInvoker.a(slot, itemStack5.a);
                        ItemStackInvoker.a(slot, null);
                        ItemStackInvoker.a(slot, entityPlayer, itemStack5);
                        return itemStack2;
                    }
                    if (n3 == 3 && aSY.a(entityPlayer.abilities) && InventoryInvoker.f(aSK2) == null) {
                        Slot slot = (Slot)ListInvoker.get(this.b, n);
                        if (!ItemStackInvoker.e(slot)) return itemStack2;
                        ItemStack itemStack6 = act_2.C(ItemStackInvoker.a(slot));
                        itemStack6.a = act_2.f(itemStack6);
                        InventoryInvoker.c(aSK2, itemStack6);
                        return itemStack2;
                    }
                    if (n3 == 4 && InventoryInvoker.f(aSK2) == null) {
                        Slot slot = (Slot)ListInvoker.get(this.b, n);
                        if (!ItemStackInvoker.e(slot)) return itemStack2;
                        if (!ItemStackInvoker.a(slot, entityPlayer)) return itemStack2;
                        ItemStack itemStack7 = ItemStackInvoker.a(slot, 1);
                        ItemStackInvoker.a(slot, entityPlayer, itemStack7);
                        a6w_0.a(entityPlayer, itemStack7, true);
                        return itemStack2;
                    }
                    if (n3 != 6) return itemStack2;
                    Slot slot = (Slot)ListInvoker.get(this.b, n);
                    itemStack = InventoryInvoker.f(aSK2);
                    if (ItemStackInvoker.e(slot) && ItemStackInvoker.a(slot, entityPlayer)) {
                        this.c();
                        return itemStack2;
                    }
                    break block25;
                }
                while (dz_0.c(iterator)) {
                    Slot slot = (Slot)dz_0.b(iterator);
                    if (!Container.a(slot, InventoryInvoker.f(aSK2), true) || !ItemStackInvoker.b(slot, InventoryInvoker.f(aSK2)) || InventoryInvoker.f((aSK)aSK2).a < aS0.d(this.h) || !this.b(slot)) continue;
                    ItemStack itemStack8 = act_2.C(itemStack3);
                    int n7 = ItemStackInvoker.e(slot) ? ItemStackInvoker.a((Slot)slot).a : 0;
                    Container.a(this.h, this.c, itemStack8, n7);
                    if (itemStack8.a > act_2.f(itemStack8)) {
                        itemStack8.a = act_2.f(itemStack8);
                    }
                    if (itemStack8.a > ItemStackInvoker.c(slot, itemStack8)) {
                        itemStack8.a = ItemStackInvoker.c(slot, itemStack8);
                    }
                    n4 -= itemStack8.a - n7;
                    ItemStackInvoker.a(slot, itemStack8);
                }
                itemStack3.a = n4;
                if (itemStack3.a <= 0) {
                    itemStack3 = null;
                }
                InventoryInvoker.c(aSK2, itemStack3);
            }
            this.b();
            return itemStack2;
        }
        int n8 = 0;
        int n9 = 1;
        int n10 = 0;
        while (true) {
            for (int i = n8; i < ListInvoker.size(this.b) && itemStack.a < act_2.f(itemStack); i += n9) {
                Slot slot = (Slot)ListInvoker.get(this.b, i);
                if (!ItemStackInvoker.e(slot) || !Container.a(slot, itemStack, true) || !ItemStackInvoker.a(slot, entityPlayer) || !this.a(itemStack, slot) || ItemStackInvoker.a((Slot)slot).a == act_2.f(ItemStackInvoker.a(slot))) continue;
                int n11 = MathInvoker.b(act_2.f(itemStack) - itemStack.a, ItemStackInvoker.a((Slot)slot).a);
                ItemStack itemStack9 = ItemStackInvoker.a(slot, n11);
                itemStack.a += n11;
                if (itemStack9.a <= 0) {
                    ItemStackInvoker.a(slot, null);
                }
                ItemStackInvoker.a(slot, entityPlayer, itemStack9);
            }
            ++n10;
        }
    }

    public void c() {
        for (int i = 0; i < ListInvoker.size(this.b); ++i) {
            ItemStack itemStack = ItemStackInvoker.a((Slot)ListInvoker.get(this.b, i));
            ItemStack itemStack2 = (ItemStack)ListInvoker.get(this.a, i);
            if (act_2.e(itemStack2, itemStack)) continue;
            itemStack2 = null;
            ListInvoker.set(this.a, i, itemStack2);
            Iterator iterator = ListInvoker.iterator(this.d);
            while (dz_0.c(iterator)) {
                ICrafting iCrafting = (ICrafting)dz_0.b(iterator);
                JQ.a(iCrafting, this, i, itemStack2);
            }
        }
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    public static int a() {
        return e;
    }

    public List<ItemStack> e() {
        ArrayList arrayList = my_0.c();
        Iterator iterator = ListInvoker.iterator(this.b);
        while (dz_0.c(iterator)) {
            Slot slot = (Slot)dz_0.b(iterator);
            ListInvoker.add(arrayList, ItemStackInvoker.a(slot));
        }
        return arrayList;
    }

    public boolean a(ItemStack itemStack, Slot slot) {
        return true;
    }

    public static int a(rs_1 rs_12) {
        return 0;
    }

    public static boolean a(Slot slot, ItemStack itemStack, boolean bl) {
        boolean bl2;
        boolean bl3 = bl2 = !ItemStackInvoker.e(slot);
        if (ItemStackInvoker.e(slot) && act_2.a(itemStack, ItemStackInvoker.a(slot)) && act_2.c(ItemStackInvoker.a(slot), itemStack)) {
            bl2 |= ItemStackInvoker.a((Slot)slot).a <= act_2.f(itemStack);
        }
        return bl2;
    }

    public static int b(int n) {
        return n & 3;
    }

    public void a(ItemStack[] itemStackArray) {
        for (int i = 0; i < itemStackArray.length; ++i) {
            ItemStackInvoker.a(this.c(i), itemStackArray[i]);
        }
    }

    public Slot a(rs_1 rs_12, int n) {
        Iterator iterator = ListInvoker.iterator(this.b);
        while (dz_0.c(iterator)) {
            Slot slot = (Slot)dz_0.b(iterator);
            if (!ItemStackInvoker.a(slot, rs_12, n)) continue;
            return slot;
        }
        return null;
    }

    public Slot c(int n) {
        return (Slot)ListInvoker.get(this.b, n);
    }

    public void c(EntityPlayer entityPlayer) {
        aSK aSK2 = entityPlayer.inventory;
        if (InventoryInvoker.f(aSK2) != null) {
            a6w_0.a(entityPlayer, InventoryInvoker.f(aSK2), false);
            InventoryInvoker.c(aSK2, null);
        }
    }

    public boolean a(EntityPlayer entityPlayer, int n) {
        return false;
    }

    protected void b() {
        e = 0;
        aS0.e(this.h);
    }

    public void a(int n, int n2) {
    }

    public void b(ICrafting iCrafting) {
        ListInvoker.remove(this.d, iCrafting);
    }

    public static boolean a(int n, EntityPlayer entityPlayer) {
        return n == 1 || n == 2 && aSY.a(entityPlayer.abilities);
    }

    public short d() {
        this.i = (short)(this.i + 1);
        return this.i;
    }

    public void b(rs_1 rs_12) {
        this.c();
    }

    public boolean b(EntityPlayer entityPlayer) {
        return !aS0.c(this.g, entityPlayer);
    }

    public void a(ICrafting iCrafting) {
        if (ListInvoker.contains(this.d, iCrafting)) {
            throw new IllegalArgumentException(ac3.a);
        }
        ListInvoker.add(this.d, iCrafting);
        JQ.a(iCrafting, this, this.e());
        this.c();
    }

    protected Slot a(Slot slot) {
        slot.b = ListInvoker.size(this.b);
        ListInvoker.add(this.b, slot);
        ListInvoker.add(this.a, null);
        return slot;
    }

    public abstract boolean a(EntityPlayer var1);
}

