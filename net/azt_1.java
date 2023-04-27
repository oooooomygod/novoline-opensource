/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import net.minecraft.item.ItemStack;
import java.util.ArrayList;

/*
 * Renamed from net.azt
 */
public class azt_1
implements aiy_2 {
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

    @Override
    public boolean a(adb_1 adb_12, World world) {
        ArrayList arrayList = my_0.c();
        for (int i = 0; i < aVF.c(adb_12); ++i) {
            ItemStack itemStack = aVF.b(adb_12, i);
            ListInvoker.add(arrayList, itemStack);
            if (ListInvoker.size(arrayList) <= 1) continue;
            ItemStack itemStack2 = (ItemStack)ListInvoker.get(arrayList, 0);
            if (act_2.k(itemStack) == act_2.k(itemStack2) && itemStack2.a == 1 && itemStack.a == 1 && px_0.i(act_2.k(itemStack2))) continue;
            return false;
        }
        return ListInvoker.size(arrayList) == 2;
    }

    @Override
    public ItemStack b(adb_1 adb_12) {
        Object object;
        ItemStack itemStack;
        ArrayList arrayList = my_0.c();
        for (int i = 0; i < aVF.c(adb_12); ++i) {
            itemStack = aVF.b(adb_12, i);
            ListInvoker.add(arrayList, itemStack);
            if (ListInvoker.size(arrayList) <= 1) continue;
            object = (ItemStack)ListInvoker.get(arrayList, 0);
            if (act_2.k(itemStack) == act_2.k((ItemStack)object) && ((ItemStack)object).a == 1 && itemStack.a == 1 && px_0.i(act_2.k((ItemStack)object))) continue;
            return null;
        }
        if (ListInvoker.size(arrayList) == 2) {
            ItemStack itemStack2 = (ItemStack)ListInvoker.get(arrayList, 0);
            itemStack = (ItemStack)ListInvoker.get(arrayList, 1);
            if (act_2.k(itemStack2) == act_2.k(itemStack) && itemStack2.a == 1 && itemStack.a == 1 && px_0.i(act_2.k(itemStack2))) {
                object = act_2.k(itemStack2);
                int n = px_0.k((Item)object) - act_2.s(itemStack2);
                int n2 = px_0.k((Item)object) - act_2.s(itemStack);
                int n3 = n + n2 + px_0.k((Item)object) * 5 / 100;
                int n4 = px_0.k((Item)object) - n3;
                n4 = 0;
                return new ItemStack(act_2.k(itemStack2), 1, n4);
            }
        }
        return null;
    }

    @Override
    public int a() {
        return 4;
    }

    @Override
    public ItemStack b() {
        return null;
    }
}

