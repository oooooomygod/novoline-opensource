/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.item.ItemStack;

public class aH9 {
    private String[][] a = new String[][]{{J1.b, J1.e}, {J1.h, J1.i, J1.d}, {J1.j, J1.g, J1.a}, {J1.f, J1.c}};
    private Item[][] b = new Item[][]{{Items.leather, Items.iron_ingot, Items.diamond, Items.gold_ingot}, {Items.leather_helmet, Items.iron_helmet, Items.diamond_helmet, Items.golden_helmet}, {Items.leather_chestplate, Items.iron_chestplate, Items.diamond_chestplate, Items.golden_chestplate}, {Items.leather_leggings, Items.iron_leggings, Items.diamond_leggings, Items.golden_leggings}, {Items.leather_boots, Items.iron_boots, Items.diamond_boots, Items.golden_boots}};

    public void a(av_1 av_12) {
        for (int i = 0; i < this.b[0].length; ++i) {
            Item item = this.b[0][i];
            for (int j = 0; j < this.b.length - 1; ++j) {
                Item item2 = this.b[j + 1][i];
                am5_0.b(av_12, new ItemStack(item2), new Object[]{this.a[j], aze_0.c('X'), item});
            }
        }
    }
}

