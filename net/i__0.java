/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlocksInvoker;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import java.util.Random;

/*
 * Renamed from net.i_
 */
public class i__0
extends i7_0 {
    @Override
    public boolean a(World world, Random random, BlockPos blockPos) {
        int n = 0;
        while (true) {
            int n2;
            int n3;
            int n4;
            if (aV8.k(world, new BlockPos(n4 = amv_2.j(blockPos) + a5_0.a(random, 8) - a5_0.a(random, 8), n3 = amv_2.h(blockPos) + a5_0.a(random, 4) - a5_0.a(random, 4), n2 = amv_2.i(blockPos) + a5_0.a(random, 8) - a5_0.a(random, 8))) && BlocksInvoker.g(Blocks.an, world, new BlockPos(n4, n3, n2))) {
                aV8.a(world, new BlockPos(n4, n3, n2), BlocksInvoker.t(Blocks.an), 2);
            }
            ++n;
        }
    }
}

