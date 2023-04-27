/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import java.util.Random;

public class I6
extends il_0 {
    public I6(int n) {
        super(n);
        ListInvoker.clear(this.P);
        this.aB = aav_1.a(Blocks.sand);
        this.J = aav_1.a(Blocks.sand);
        this.ai.w = -999;
        this.ai.E = 2;
        this.ai.k = 50;
        this.ai.y = 10;
        ListInvoker.clear(this.P);
    }

    @Override
    public void a(World world, Random random, BlockPos blockPos) {
        super.a(world, random, blockPos);
        if (a5_0.a(random, 1000) == 0) {
            int n = a5_0.a(random, 16) + 8;
            int n2 = a5_0.a(random, 16) + 8;
            BlockPos blockPos2 = amv_2.e(aV8.r(world, amv_2.a(blockPos, n, 0, n2)));
            x_0.a(new io_1(), world, random, blockPos2);
        }
    }
}

