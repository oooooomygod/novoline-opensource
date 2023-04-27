/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import java.util.Random;

public class IQ
extends I3 {
    @Override
    public void a(World world, Random random, xb_1 xb_12, int n, int n2, double d) {
        this.aB = m7_0.a(Blocks.grass);
        this.J = BlocksInvoker.t(Blocks.dirt);
        if (d > 1.75) {
            this.aB = BlocksInvoker.t(Blocks.stone);
            this.J = BlocksInvoker.t(Blocks.stone);
        } else if (d > -0.5) {
            this.aB = BlockStateInvoker.a(BlocksInvoker.t(Blocks.dirt), BlockDirt.Q, (Comparable)((Object)a6s_0.COARSE_DIRT));
        }
        this.b(world, random, xb_12, n, n2, d);
    }

    public IQ(int n, il_0 il_02) {
        super(n, il_02);
        this.ai.w = 2;
        this.ai.e = 2;
        this.ai.j = 5;
    }

    @Override
    public void a(World world, Random random, BlockPos blockPos) {
        arn_2.a(this.ai, world, random, this, blockPos);
    }
}

