/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.item.ItemStack;

/*
 * Renamed from net.azG
 */
public class azg_1
extends azh_2 {
    @Override
    public ItemStack b(adb_1 adb_12) {
        ItemStack itemStack = null;
        for (int i = 0; i < aVF.c(adb_12); ++i) {
            ItemStack itemStack2 = aVF.b(adb_12, i);
            if (act_2.k(itemStack2) != Items.filled_map) continue;
            itemStack = itemStack2;
        }
        itemStack = act_2.C(itemStack);
        itemStack.a = 1;
        if (act_2.a(itemStack) == null) {
            act_2.b(itemStack, new NBTTagCompound());
        }
        tn_0.a(act_2.a(itemStack), akn_1.a, true);
        return itemStack;
    }

    public azg_1() {
        super(3, 3, new ItemStack[]{new ItemStack(Items.paper), new ItemStack(Items.paper), new ItemStack(Items.paper), new ItemStack(Items.paper), new ItemStack(Items.filled_map, 0, Short.MAX_VALUE), new ItemStack(Items.paper), new ItemStack(Items.paper), new ItemStack(Items.paper), new ItemStack(Items.paper)}, new ItemStack(Items.map, 0, 0));
    }

    @Override
    public boolean a(adb_1 adb_12, World world) {
        if (!super.a(adb_12, world)) {
            return false;
        }
        for (int i = 0; i < aVF.c(adb_12); ++i) {
            ItemStack itemStack = aVF.b(adb_12, i);
            if (act_2.k(itemStack) != Items.filled_map) continue;
        }
        return false;
    }
}

