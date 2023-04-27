/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

/*
 * Renamed from net.afV
 */
public class afv_1 {
    void a(av_1 av_12) {
        for (YZ yZ : YZ.values()) {
            am5_0.b(av_12, new ItemStack(Items.banner, 1, my_2.c(yZ)), new Object[]{xy_1.c, xy_1.a, xy_1.b, aze_0.c('#'), new ItemStack(Blocks.b_, 1, my_2.a(yZ)), aze_0.c('|'), Items.stick});
        }
        am5_0.a(av_12, new a0M(null));
        am5_0.a(av_12, new afc_0(null));
    }
}

