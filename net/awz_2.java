/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import net.minecraft.item.ItemStack;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * Renamed from net.awz
 */
public class awz_2
implements aiy_2 {
    private ItemStack b;
    private List<ItemStack> a;

    @Override
    public ItemStack b(adb_1 adb_12) {
        return act_2.C(this.b);
    }

    @Override
    public ItemStack b() {
        return this.b;
    }

    public awz_2(ItemStack itemStack, List<ItemStack> list) {
        this.b = itemStack;
        this.a = list;
    }

    @Override
    public boolean a(adb_1 adb_12, World world) {
        ArrayList arrayList = my_0.a(this.a);
        for (int i = 0; i < aVF.a(adb_12); ++i) {
            int n = 0;
            if (n >= aVF.b(adb_12)) continue;
            ItemStack itemStack = aVF.b(adb_12, n, i);
            Iterator iterator = ListInvoker.iterator(arrayList);
            while (dz_0.c(iterator)) {
                ItemStack itemStack2 = (ItemStack)dz_0.b(iterator);
                if (act_2.k(itemStack) != act_2.k(itemStack2) || act_2.c(itemStack2) != Short.MAX_VALUE && act_2.c(itemStack) != act_2.c(itemStack2)) continue;
                ListInvoker.remove((List)arrayList, itemStack2);
                break;
            }
            return false;
        }
        return ListInvoker.isEmpty(arrayList);
    }

    @Override
    public int a() {
        return ListInvoker.size(this.a);
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
}

