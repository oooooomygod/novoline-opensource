/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.item.ItemStack;

/*
 * Renamed from net.axf
 */
public class axf_2
implements aiy_2 {
    @Override
    public int a() {
        return 9;
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

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean a(adb_1 adb_12, World world) {
        for (int i = 0; i < aVF.c(adb_12); ++i) {
            void var3_4;
            ItemStack itemStack = aVF.b(adb_12, i);
            if (act_2.k(itemStack) == Items.filled_map) {
                return false;
            }
            if (act_2.k(itemStack) != Items.map) {
                return false;
            }
            ++var3_4;
        }
        return true;
    }

    @Override
    public ItemStack b() {
        return null;
    }

    @Override
    public ItemStack b(adb_1 adb_12) {
        int n = 0;
        for (int i = 0; i < aVF.c(adb_12); ++i) {
            ItemStack itemStack = aVF.b(adb_12, i);
            if (act_2.k(itemStack) == Items.filled_map) {
                return null;
            }
            if (act_2.k(itemStack) != Items.map) {
                return null;
            }
            ++n;
        }
        return null;
    }
}

