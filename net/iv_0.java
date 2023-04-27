/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import java.util.Random;

/*
 * Renamed from net.Iv
 */
public class iv_0
extends il_0 {
    private int aJ = 1;
    private i7_0 aF = new ix_1(BlockStateInvoker.a(BlocksInvoker.t(Blocks.bV), h6_0.P, (Comparable)((Object)vx_0.STONE)), 9);
    private int aG = 2;
    private int aK = 0;
    private i5_0 aI = new i5_0(false);
    private int aH = this.aK;

    @Override
    public void a(World world, Random random, xb_1 xb_12, int n, int n2, double d) {
        this.aB = m7_0.a(Blocks.grass);
        this.J = BlocksInvoker.t(Blocks.dirt);
        if ((d < -1.0 || d > 2.0) && this.aH == this.aG) {
            this.aB = BlocksInvoker.t(Blocks.gravel);
            this.J = BlocksInvoker.t(Blocks.gravel);
        } else if (d > 1.0 && this.aH != this.aJ) {
            this.aB = BlocksInvoker.t(Blocks.stone);
            this.J = BlocksInvoker.t(Blocks.stone);
        }
        this.b(world, random, xb_12, n, n2, d);
    }

    private iv_0 a(il_0 il_02) {
        this.aH = this.aG;
        this.a(il_02.I, true);
        this.a(aL0.a(aL0.a(new StringBuilder(), il_02.Y), o__0.a).toString());
        this.a(new ac_2(il_02.d, il_02.a));
        this.a(il_02.C, il_02.o);
        return this;
    }

    @Override
    public void a(World world, Random random, BlockPos blockPos) {
        int n;
        int n2;
        int n3;
        super.a(world, random, blockPos);
        int n4 = 3 + a5_0.a(random, 6);
        for (n3 = 0; n3 < n4; ++n3) {
            int n5;
            n2 = a5_0.a(random, 16);
            BlockPos blockPos2 = amv_2.a(blockPos, n2, n = a5_0.a(random, 28) + 4, n5 = a5_0.a(random, 16));
            if (BlockStateInvoker.getBlock(aV8.q(world, blockPos2)) != Blocks.stone) continue;
            aV8.a(world, blockPos2, BlocksInvoker.t(Blocks.K), 2);
        }
        n4 = 0;
        while (true) {
            n3 = a5_0.a(random, 16);
            n2 = a5_0.a(random, 64);
            n = a5_0.a(random, 16);
            aFI.a(this.aF, world, random, amv_2.a(blockPos, n3, n2, n));
            ++n4;
        }
    }

    protected iv_0(int n, boolean bl) {
        super(n);
        this.ai.w = 3;
        this.aH = this.aJ;
    }

    @Override
    protected il_0 c(int n) {
        return new iv_0(n, false).a(this);
    }

    @Override
    public ii_1 b(Random random) {
        return a5_0.a(random, 3) > 0 ? this.aI : super.b(random);
    }
}

