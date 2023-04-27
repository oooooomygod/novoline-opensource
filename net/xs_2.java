/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

/*
 * Renamed from net.xs
 */
public class xs_2 {
    public static void a(ItemArmor itemArmor, ItemStack itemStack, int n) {
        itemArmor.a(itemStack, n);
    }

    public static ArmorMaterial a(ItemArmor itemArmor) {
        return itemArmor.b();
    }

    public static void a(ItemArmor itemArmor, ItemStack itemStack) {
        itemArmor.d(itemStack);
    }

    public static boolean b(ItemArmor itemArmor, ItemStack itemStack) {
        return itemArmor.c(itemStack);
    }

    public static int c(ItemArmor itemArmor, ItemStack itemStack) {
        return itemArmor.a(itemStack);
    }
}

