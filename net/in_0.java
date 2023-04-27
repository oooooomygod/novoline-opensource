/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import java.util.Random;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net.In
 */
public class in_0
extends il_0 {
    private static il_1 aF = new il_1(false);

    @Override
    protected il_0 c(int n) {
        IQ iQ = new IQ(n, this);
        iQ.C = (this.C + 1.0f) * 0.5f;
        iQ.d = this.d * 0.5f + 0.3f;
        iQ.a = this.a * 0.5f + 1.2f;
        return iQ;
    }

    @Override
    public ii_1 b(Random random) {
        return a5_0.a(random, 5) > 0 ? aF : this.p;
    }

    @Override
    public void a(World world, Random random, BlockPos blockPos) {
        apz_0.a(F, aPM.GRASS);
        int n = 0;
        while (true) {
            int n2 = a5_0.a(random, 16) + 8;
            int n3 = a5_0.a(random, 16) + 8;
            int n4 = a5_0.a(random, amv_2.h(aV8.r(world, amv_2.a(blockPos, n2, 0, n3))) + 32);
            apz_0.a(F, world, random, amv_2.a(blockPos, n2, n4, n3));
            ++n;
        }
    }

    protected in_0(int n) {
        super(n);
        ListInvoker.add(this.P, new cp_0(na_1.class, 1, 2, 6));
        this.ai.w = 1;
        this.ai.e = 4;
        this.ai.j = 20;
    }
}

