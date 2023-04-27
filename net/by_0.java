/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.item.ItemStack;

/*
 * Renamed from net.By
 */
public class by_0
implements aiy_2 {
    @Override
    public int a() {
        return 9;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean a(adb_1 adb_12, World world) {
        for (int i = 0; i < aVF.c(adb_12); ++i) {
            void var3_4;
            ItemStack itemStack = aVF.b(adb_12, i);
            if (act_2.k(itemStack) == Items.written_book) {
                return false;
            }
            if (act_2.k(itemStack) != Items.writable_book) {
                return false;
            }
            ++var3_4;
        }
        return true;
    }

    @Override
    public ItemStack[] a(adb_1 adb_12) {
        ItemStack[] itemStackArray = new ItemStack[aVF.c(adb_12)];
        for (int i = 0; i < itemStackArray.length; ++i) {
            ItemStack itemStack = aVF.b(adb_12, i);
            if (!(act_2.k(itemStack) instanceof Ln)) continue;
            itemStackArray[i] = itemStack;
            break;
        }
        return itemStackArray;
    }

    @Override
    public ItemStack b(adb_1 adb_12) {
        int n = 0;
        for (int i = 0; i < aVF.c(adb_12); ++i) {
            ItemStack itemStack = aVF.b(adb_12, i);
            if (act_2.k(itemStack) == Items.written_book) {
                return null;
            }
            if (act_2.k(itemStack) != Items.writable_book) {
                return null;
            }
            ++n;
        }
        return null;
    }

    @Override
    public ItemStack b() {
        return null;
    }
}

