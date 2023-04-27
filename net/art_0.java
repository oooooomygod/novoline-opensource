/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.item.ItemStack;

/*
 * Renamed from net.arT
 */
public class art_0
implements aiy_2 {
    private ItemStack a;

    @Override
    public ItemStack b(adb_1 adb_12) {
        return act_2.C(this.a);
    }

    @Override
    public boolean a(adb_1 adb_12, World world) {
        this.a = null;
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        for (int i = 0; i < aVF.c(adb_12); ++i) {
            ItemStack itemStack = aVF.b(adb_12, i);
            if (act_2.k(itemStack) == Items.gunpowder) {
                ++n2;
                continue;
            }
            if (act_2.k(itemStack) == Items.firework_charge) {
                ++n4;
                continue;
            }
            if (act_2.k(itemStack) == Items.dye) {
                ++n3;
                continue;
            }
            if (act_2.k(itemStack) == Items.paper) {
                ++n;
                continue;
            }
            if (act_2.k(itemStack) == Items.glowstone_dust) {
                ++n5;
                continue;
            }
            if (act_2.k(itemStack) == Items.diamond) {
                ++n5;
                continue;
            }
            if (act_2.k(itemStack) == Items.fire_charge) {
                ++n6;
                continue;
            }
            if (act_2.k(itemStack) == Items.feather) {
                ++n6;
                continue;
            }
            if (act_2.k(itemStack) == Items.gold_nugget) {
                ++n6;
                continue;
            }
            if (act_2.k(itemStack) != Items.skull) {
                return false;
            }
            ++n6;
        }
        n5 = n5 + n3 + n6;
        return false;
    }

    @Override
    public int a() {
        return 10;
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
        return this.a;
    }
}

