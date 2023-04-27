/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

public class a9O {
    private Object[][] a;
    private String[][] b = new String[][]{{af_1.n, af_1.j, af_1.c}, {af_1.h, af_1.a, af_1.g}, {af_1.k, af_1.e, af_1.m}, {af_1.l, af_1.b, af_1.f}};

    public a9O() {
        this.a = new Object[][]{{Blocks.planks, Blocks.cobblestone, Items.iron_ingot, Items.diamond, Items.gold_ingot}, {Items.wooden_pickaxe, Items.stone_pickaxe, Items.iron_pickaxe, Items.diamond_pickaxe, Items.golden_pickaxe}, {Items.wooden_shovel, Items.stone_shovel, Items.iron_shovel, Items.diamond_shovel, Items.golden_shovel}, {Items.wooden_axe, Items.stone_axe, Items.iron_axe, Items.diamond_axe, Items.golden_axe}, {Items.wooden_hoe, Items.stone_hoe, Items.iron_hoe, Items.diamond_hoe, Items.golden_hoe}};
    }

    public void a(av_1 av_12) {
        for (int i = 0; i < this.a[0].length; ++i) {
            Object object = this.a[0][i];
            for (int j = 0; j < this.a.length - 1; ++j) {
                Item item = (Item)this.a[j + 1][i];
                am5_0.b(av_12, new ItemStack(item), new Object[]{this.b[j], aze_0.c('#'), Items.stick, aze_0.c('X'), object});
            }
        }
        am5_0.b(av_12, new ItemStack(Items.shears), new Object[]{af_1.d, af_1.i, aze_0.c('#'), Items.iron_ingot});
    }
}

