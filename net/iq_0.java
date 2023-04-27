/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.Random;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net.iQ
 */
public class iq_0
extends i7_0 {
    private fc_2 b;

    @Override
    public boolean a(World world, Random random, BlockPos blockPos) {
        int n = 0;
        while (true) {
            BlockPos blockPos2;
            if (aV8.k(world, blockPos2 = amv_2.a(blockPos, a5_0.a(random, 8) - a5_0.a(random, 8), a5_0.a(random, 4) - a5_0.a(random, 4), a5_0.a(random, 8) - a5_0.a(random, 8))) && (!qq_2.e(world.d) || amv_2.h(blockPos2) < 255) && a6_0.a(this.b, world, blockPos2, a6_0.a(this.b))) {
                aV8.a(world, blockPos2, a6_0.a(this.b), 2);
            }
            ++n;
        }
    }

    public iq_0(fc_2 fc_22) {
        this.b = fc_22;
    }
}

