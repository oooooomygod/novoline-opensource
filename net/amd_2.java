/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

/*
 * Renamed from net.amd
 */
public class amd_2 {
    public void a(av_1 av_12) {
        int n = 0;
        while (true) {
            am5_0.a(av_12, new ItemStack(Blocks.b_, 1, n), new Object[]{new ItemStack(Items.dye, 1, 15 - n), new ItemStack(px_0.a(Blocks.b_), 1, 0)});
            am5_0.b(av_12, new ItemStack(Blocks.cr, 8, 15 - n), new Object[]{aR4.i, aR4.a, aR4.b, aze_0.c('#'), new ItemStack(Blocks.aJ), aze_0.c('X'), new ItemStack(Items.dye, 1, n)});
            am5_0.b(av_12, new ItemStack(Blocks.am, 8, 15 - n), new Object[]{aR4.f, aR4.e, aR4.d, aze_0.c('#'), new ItemStack(Blocks.a8), aze_0.c('X'), new ItemStack(Items.dye, 1, n)});
            am5_0.b(av_12, new ItemStack(Blocks.ad, 16, n), new Object[]{aR4.g, aR4.c, aze_0.c('#'), new ItemStack(Blocks.am, 1, n)});
            ++n;
        }
    }
}

