/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import java.util.Random;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net.iP
 */
public class ip_1
extends i7_0 {
    private IBlockState b;
    private fu_0 c;

    @Override
    public boolean a(World world, Random random, BlockPos blockPos) {
        int n = 0;
        while (true) {
            BlockPos blockPos2;
            if (aV8.k(world, blockPos2 = amv_2.a(blockPos, a5_0.a(random, 8) - a5_0.a(random, 8), a5_0.a(random, 4) - a5_0.a(random, 4), a5_0.a(random, 8) - a5_0.a(random, 8))) && (!qq_2.e(world.d) || amv_2.h(blockPos2) < 255) && ye_1.a(this.c, world, blockPos2, this.b)) {
                aV8.a(world, blockPos2, this.b, 2);
            }
            ++n;
        }
    }

    public void a(fu_0 fu_02, dq_1 dq_12) {
        this.c = fu_02;
        this.b = BlockStateInvoker.a(ye_1.a(fu_02), ye_1.c(fu_02), (Comparable)((Object)dq_12));
    }

    public ip_1(fu_0 fu_02, dq_1 dq_12) {
        this.a(fu_02, dq_12);
    }
}

