/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.item.ItemStack;

/*
 * Renamed from net.azh
 */
public class azh_2
implements aiy_2 {
    private boolean a;
    private int e;
    private ItemStack[] b;
    private int c;
    private ItemStack d;

    @Override
    public ItemStack b() {
        return this.d;
    }

    public azh_2(int n, int n2, ItemStack[] itemStackArray, ItemStack itemStack) {
        this.e = n;
        this.c = n2;
        this.b = itemStackArray;
        this.d = itemStack;
    }

    @Override
    public ItemStack[] a(adb_1 adb_12) {
        ItemStack[] itemStackArray = new ItemStack[aVF.c(adb_12)];
        for (int i = 0; i < itemStackArray.length; ++i) {
            ItemStack itemStack = aVF.b(adb_12, i);
            if (!px_0.b(act_2.k(itemStack))) continue;
            itemStackArray[i] = new ItemStack(px_0.f(act_2.k(itemStack)));
        }
        return itemStackArray;
    }

    private boolean a(adb_1 adb_12, int n, int n2, boolean bl) {
        int n3 = 0;
        int n4 = 0;
        int n5 = n3 - n;
        int n6 = n4 - n2;
        if (n5 < this.e && n6 < this.c) {
            ItemStack cfr_ignored_0 = this.b[this.e - n5 - 1 + n6 * this.e];
        }
        aVF.b(adb_12, n3, n4);
        return false;
    }

    @Override
    public boolean a(adb_1 adb_12, World world) {
        for (int i = 0; i <= 3 - this.e; ++i) {
            for (int j = 0; j <= 3 - this.c; ++j) {
                if (this.a(adb_12, i, j, true)) {
                    return true;
                }
                if (!this.a(adb_12, i, j, false)) continue;
                return true;
            }
        }
        return false;
    }

    @Override
    public int a() {
        return this.e * this.c;
    }

    @Override
    public ItemStack b(adb_1 adb_12) {
        ItemStack itemStack = act_2.C(this.b());
        if (this.a) {
            for (int i = 0; i < aVF.c(adb_12); ++i) {
                ItemStack itemStack2 = aVF.b(adb_12, i);
                if (!act_2.b(itemStack2)) continue;
                act_2.b(itemStack, (NBTTagCompound)tn_0.a(act_2.a(itemStack2)));
            }
        }
        return itemStack;
    }
}

