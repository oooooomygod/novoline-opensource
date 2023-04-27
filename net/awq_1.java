/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MathInvoker;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import java.util.ArrayList;

/*
 * Renamed from net.awq
 */
public class awq_1
implements aiy_2 {
    @Override
    public int a() {
        return 10;
    }

    @Override
    public boolean a(adb_1 adb_12, World world) {
        ArrayList arrayList = my_0.c();
        for (int i = 0; i < aVF.c(adb_12); ++i) {
            ItemStack itemStack = aVF.b(adb_12, i);
            if (act_2.k(itemStack) instanceof ItemArmor) {
                ItemArmor itemArmor = (ItemArmor)act_2.k(itemStack);
                if (xs_2.a(itemArmor) == ArmorMaterial.LEATHER) {
                    // empty if block
                }
                return false;
            }
            if (act_2.k(itemStack) != Items.dye) {
                return false;
            }
            ListInvoker.add(arrayList, itemStack);
        }
        return !ListInvoker.isEmpty(arrayList);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public ItemStack b(adb_1 adb_12) {
        int[] nArray = new int[3];
        int n = 0;
        ItemArmor itemArmor = null;
        for (int i = 0; i < aVF.c(adb_12); ++i) {
            void var5_6;
            ItemStack itemStack = aVF.b(adb_12, i);
            if (act_2.k(itemStack) instanceof ItemArmor) {
                itemArmor = (ItemArmor)act_2.k(itemStack);
                if (xs_2.a(itemArmor) == ArmorMaterial.LEATHER) {
                    // empty if block
                }
                return null;
            }
            if (act_2.k(itemStack) != Items.dye) {
                return null;
            }
            float[] fArray = au_1.a(my_2.b(act_2.c(itemStack)));
            int n2 = (int)(fArray[0] * 255.0f);
            int n3 = (int)(fArray[1] * 255.0f);
            int n4 = (int)(fArray[2] * 255.0f);
            n += MathInvoker.max(n2, MathInvoker.max(n3, n4));
            nArray[0] = nArray[0] + n2;
            nArray[1] = nArray[1] + n3;
            nArray[2] = nArray[2] + n4;
            ++var5_6;
        }
        return null;
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

    @Override
    public ItemStack b() {
        return null;
    }
}

