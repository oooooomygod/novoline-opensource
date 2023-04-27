/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

/*
 * Renamed from net.are
 */
public class are_2 {
    private Object[][] a;
    private String[][] b = new String[][]{{d6_0.g, d6_0.c, d6_0.d}};

    public void a(av_1 av_12) {
        for (int i = 0; i < this.a[0].length; ++i) {
            Object object = this.a[0][i];
            for (int j = 0; j < this.a.length - 1; ++j) {
                Item item = (Item)this.a[j + 1][i];
                am5_0.b(av_12, new ItemStack(item), new Object[]{this.b[j], aze_0.c('#'), Items.stick, aze_0.c('X'), object});
            }
        }
        am5_0.b(av_12, new ItemStack(Items.bow, 1), new Object[]{d6_0.i, d6_0.b, d6_0.a, aze_0.c('X'), Items.string, aze_0.c('#'), Items.stick});
        am5_0.b(av_12, new ItemStack(Items.arrow, 4), new Object[]{d6_0.h, d6_0.f, d6_0.e, aze_0.c('Y'), Items.feather, aze_0.c('X'), Items.flint, aze_0.c('#'), Items.stick});
    }

    public are_2() {
        this.a = new Object[][]{{Blocks.planks, Blocks.cobblestone, Items.iron_ingot, Items.diamond, Items.gold_ingot}, {Items.wooden_sword, Items.stone_sword, Items.iron_sword, Items.diamond_sword, Items.golden_sword}};
    }
}

