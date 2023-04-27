/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import java.util.Random;

/*
 * Renamed from net.ih
 */
public class ih_2
extends i7_0 {
    @Override
    public boolean a(World world, Random random, BlockPos blockPos) {
        int n = 0;
        while (true) {
            BlockPos blockPos2;
            if (aV8.k(world, blockPos2 = amv_2.a(blockPos, a5_0.a(random, 8) - a5_0.a(random, 8), a5_0.a(random, 4) - a5_0.a(random, 4), a5_0.a(random, 8) - a5_0.a(random, 8)))) {
                int n2 = 1 + a5_0.a(random, a5_0.a(random, 3) + 1);
                for (int i = 0; i < n2; ++i) {
                    if (!CR.a(Blocks.a9, world, blockPos2)) continue;
                    aV8.a(world, amv_2.c(blockPos2, i), CR.a(Blocks.a9), 2);
                }
            }
            ++n;
        }
    }
}

