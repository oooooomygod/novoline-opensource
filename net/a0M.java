/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.item.ItemStack;

class a0M
implements aiy_2 {
    @Override
    public int a() {
        return 2;
    }

    @Override
    public boolean a(adb_1 adb_12, World world) {
        int n = 0;
        if (n < aVF.c(adb_12)) {
            ItemStack itemStack = aVF.b(adb_12, n);
            if (act_2.k(itemStack) != Items.banner) {
                return false;
            }
            return false;
        }
        return true;
    }

    private a0M() {
    }

    @Override
    public ItemStack b() {
        return null;
    }

    @Override
    public ItemStack[] a(adb_1 adb_12) {
        ItemStack[] itemStackArray = new ItemStack[aVF.c(adb_12)];
        for (int i = 0; i < itemStackArray.length; ++i) {
            ItemStack itemStack = aVF.b(adb_12, i);
            if (px_0.b(act_2.k(itemStack))) {
                itemStackArray[i] = new ItemStack(px_0.f(act_2.k(itemStack)));
                continue;
            }
            if (!act_2.b(itemStack) || aez_2.c(itemStack) <= 0) continue;
            itemStackArray[i] = act_2.C(itemStack);
            itemStackArray[i].a = 1;
        }
        return itemStackArray;
    }

    @Override
    public ItemStack b(adb_1 adb_12) {
        for (int i = 0; i < aVF.c(adb_12); ++i) {
            ItemStack itemStack = aVF.b(adb_12, i);
            if (aez_2.c(itemStack) <= 0) continue;
            ItemStack itemStack2 = act_2.C(itemStack);
            itemStack2.a = 1;
            return itemStack2;
        }
        return null;
    }

    a0M(xm_0 xm_02) {
        this();
    }
}

