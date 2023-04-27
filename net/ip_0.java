/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import java.util.Random;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net.Ip
 */
public class ip_0
extends il_0 {
    protected static in_2 aH = new in_2(false, true);
    protected static ic_2 aF;
    private int aI;
    protected static in_2 aG;

    @Override
    public void a(World world, Random random, BlockPos blockPos) {
        if (this.aI == 3) {
            int n = 0;
            int n2 = 0;
            while (true) {
                i7_0 i7_02;
                int n3 = n * 4 + 1 + 8 + a5_0.a(random, 3);
                int n4 = n2 * 4 + 1 + 8 + a5_0.a(random, 3);
                BlockPos blockPos2 = aV8.r(world, amv_2.a(blockPos, n3, 0, n4));
                if (a5_0.a(random, 20) == 0) {
                    i7_02 = new ir_1();
                    ji_0.a(i7_02, world, random, blockPos2);
                } else {
                    i7_02 = this.b(random);
                    xt_0.a((ii_1)i7_02);
                    if (xt_0.a((ii_1)i7_02, world, random, blockPos2)) {
                        xt_0.b((ii_1)i7_02, world, random, blockPos2);
                    }
                }
                ++n2;
            }
        }
        int n = a5_0.a(random, 5) - 3;
        if (this.aI == 1) {
            n += 2;
        }
        block1: for (int i = 0; i < n; ++i) {
            int n5 = a5_0.a(random, 3);
            apz_0.a(F, aPM.SYRINGA);
            int n6 = 0;
            while (true) {
                int n7 = a5_0.a(random, 16) + 8;
                int n8 = a5_0.a(random, 16) + 8;
                int n9 = a5_0.a(random, amv_2.h(aV8.r(world, amv_2.a(blockPos, n7, 0, n8))) + 32);
                if (apz_0.a(F, world, random, new BlockPos(amv_2.j(blockPos) + n7, n9, amv_2.i(blockPos) + n8))) {
                    continue block1;
                }
                ++n6;
            }
        }
        super.a(world, random, blockPos);
    }

    @Override
    public int c(BlockPos blockPos) {
        int n = super.c(blockPos);
        return this.aI == 3 ? (n & 0xFEFEFE) + 2634762 >> 1 : n;
    }

    static {
        aG = new in_2(false, false);
        aF = new ic_2(false);
    }

    @Override
    public ii_1 b(Random random) {
        return this.aI == 3 && a5_0.a(random, 3) > 0 ? aF : (this.aI != 2 && a5_0.a(random, 5) != 0 ? this.p : aG);
    }

    @Override
    protected il_0 a(int n, boolean bl) {
        if (this.aI == 2) {
            this.w = 353825;
            this.I = n;
            this.w = (this.w & 0xFEFEFE) >> 1;
            return this;
        }
        return super.a(n, bl);
    }

    @Override
    protected il_0 c(int n) {
        if (this.s == il_0.H.s) {
            ip_0 ip_02 = new ip_0(n, 1);
            ip_02.a(new ac_2(this.d, this.a + 0.2f));
            ip_02.a(awj_2.a);
            ip_02.a(6976549, true);
            ip_02.a(8233509);
            return ip_02;
        }
        return this.s != il_0.b.s && this.s != il_0.ao.s ? new ix_0(this, n, this) : new I7(this, n, this);
    }

    @Override
    public dq_1 a(Random random, BlockPos blockPos) {
        if (this.aI == 1) {
            double d = MathHelper.b((1.0 + t8_0.a(v, (double)amv_2.j(blockPos) / 48.0, (double)amv_2.i(blockPos) / 48.0)) / 2.0, 0.0, 0.9999);
            dq_1 dq_12 = dq_1.values()[(int)(d * (double)dq_1.values().length)];
            return dq_12 == dq_1.BLUE_ORCHID ? dq_1.POPPY : dq_12;
        }
        return super.a(random, blockPos);
    }

    public ip_0(int n, int n2) {
        super(n);
        this.aI = n2;
        this.ai.w = 10;
        this.ai.j = 2;
        if (this.aI == 1) {
            this.ai.w = 6;
            this.ai.e = 100;
            this.ai.j = 1;
        }
        this.a(5159473);
        this.a(0.7f, 0.8f);
        if (this.aI == 2) {
            this.w = 353825;
            this.I = 3175492;
            this.a(0.6f, 0.6f);
        }
        if (this.aI == 0) {
            ListInvoker.add(this.P, new cp_0(nf_1.class, 5, 4, 4));
        }
        if (this.aI == 3) {
            this.ai.w = -999;
        }
    }
}

