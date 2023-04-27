/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

/*
 * Renamed from net.aOv
 */
public class aov_0 {
    private Object[][] a = new Object[][]{{Blocks.D, new ItemStack(Items.gold_ingot, 9)}, {Blocks.co, new ItemStack(Items.iron_ingot, 9)}, {Blocks.ar, new ItemStack(Items.diamond, 9)}, {Blocks.av, new ItemStack(Items.emerald, 9)}, {Blocks.ba, new ItemStack(Items.dye, 9, my_2.c(YZ.BLUE))}, {Blocks.bT, new ItemStack(Items.redstone, 9)}, {Blocks.bK, new ItemStack(Items.coal, 9, 0)}, {Blocks.y, new ItemStack(Items.wheat, 9)}, {Blocks.b, new ItemStack(Items.slime_ball, 9)}};

    public void a(av_1 av_12) {
        for (Object[] objectArray : this.a) {
            Block block = (Block)objectArray[0];
            ItemStack itemStack = (ItemStack)objectArray[1];
            am5_0.b(av_12, new ItemStack(block), new Object[]{aOH.c, aOH.e, aOH.h, aze_0.c('#'), itemStack});
            am5_0.b(av_12, itemStack, new Object[]{aOH.d, aze_0.c('#'), block});
        }
        am5_0.b(av_12, new ItemStack(Items.gold_ingot), new Object[]{aOH.f, aOH.g, aOH.a, aze_0.c('#'), Items.gold_nugget});
        am5_0.b(av_12, new ItemStack(Items.gold_nugget, 9), new Object[]{aOH.b, aze_0.c('#'), Items.gold_ingot});
    }
}

