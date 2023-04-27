/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import java.util.Random;

/*
 * Renamed from net.iB
 */
public class ib_1
extends i7_0 {
    private aPM b;

    @Override
    public boolean a(World world, Random random, BlockPos blockPos) {
        int n = 0;
        while (true) {
            BlockPos blockPos2;
            if (aV8.k(world, blockPos2 = amv_2.a(blockPos, a5_0.a(random, 8) - a5_0.a(random, 8), a5_0.a(random, 4) - a5_0.a(random, 4), a5_0.a(random, 8) - a5_0.a(random, 8))) && (!qq_2.e(world.d) || amv_2.h(blockPos2) < 254) && eq_1.a(Blocks.ai, world, blockPos2)) {
                eq_1.a(Blocks.ai, world, blockPos2, this.b, 2);
            }
            ++n;
        }
    }

    public void a(aPM aPM2) {
        this.b = aPM2;
    }
}

