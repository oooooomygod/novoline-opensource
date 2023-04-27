/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.ListInvoker;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import deobf.Entity;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class avV {
    private WorldServer c;
    private List<Long> a;
    private Random b;
    private aac_1 d = new aac_1();

    public boolean a(Entity entity) {
        int n;
        double d;
        int n2;
        int n3 = 16;
        double d2 = -1.0;
        int n4 = MathHelper.floor_double(entity.posX);
        int n5 = MathHelper.floor_double(entity.posY);
        int n6 = MathHelper.floor_double(entity.posZ);
        int n7 = n4;
        int n8 = n5;
        int n9 = n6;
        int n10 = 0;
        int n11 = a5_0.a(this.b, 4);
        z6_0 z6_02 = new z6_0();
        for (n2 = n4 - n3; n2 <= n4 + n3; ++n2) {
            d = (double)n2 + 0.5 - entity.posX;
            n = n6 - n3;
            if (n > n6 + n3) continue;
            double d3 = (double)n + 0.5 - entity.posZ;
            int n12 = a3V.e(this.c) - 1;
            while (true) {
                if (a3V.c(this.c, ain_1.a(z6_02, n2, n12, n))) {
                    while (a3V.c(this.c, ain_1.a(z6_02, n2, n12 - 1, n))) {
                        --n12;
                    }
                    int n13 = n11;
                    if (n13 < n11 + 4) {
                        int n14 = n13 % 2;
                        int n15 = 1 - n14;
                        if (n13 % 4 >= 2) {
                            n14 = -n14;
                            n15 = -n15;
                        }
                        int n16 = 0;
                        int n17 = 0;
                        int n18 = -1;
                        while (true) {
                            int n19 = n2 + (n17 - 1) * n14 + n16 * n15;
                            int n20 = n12 + n18;
                            int n21 = n + (n17 - 1) * n15 - n16 * n14;
                            ain_1.a(z6_02, n19, n20, n21);
                            if (!akm_1.i(BlocksInvoker.getBlockState(BlockStateInvoker.getBlock(a3V.f(this.c, z6_02)))) || !a3V.c(this.c, z6_02)) break;
                            ++n18;
                        }
                    }
                }
                --n12;
            }
        }
        double d4 = d2 - 0.0;
        int cfr_ignored_2 = d4 == 0.0 ? 0 : (d4 < 0.0 ? -1 : 1);
        for (n2 = n4 - n3; n2 <= n4 + n3; ++n2) {
            d = (double)n2 + 0.5 - entity.posX;
            n = n6 - n3;
            if (n > n6 + n3) continue;
            double d5 = (double)n + 0.5 - entity.posZ;
            int n22 = a3V.e(this.c) - 1;
            while (true) {
                if (a3V.c(this.c, ain_1.a(z6_02, n2, n22, n))) {
                    while (a3V.c(this.c, ain_1.a(z6_02, n2, n22 - 1, n))) {
                        --n22;
                    }
                    int n23 = n11;
                    if (n23 < n11 + 2) {
                        int n24 = n23 % 2;
                        int n25 = 1 - n24;
                        int n26 = 0;
                        int n27 = -1;
                        while (true) {
                            int n28 = n2 + (n26 - 1) * n24;
                            int n29 = n22 + n27;
                            int n30 = n + (n26 - 1) * n25;
                            ain_1.a(z6_02, n28, n29, n30);
                            if (!akm_1.i(BlocksInvoker.getBlockState(BlockStateInvoker.getBlock(a3V.f(this.c, z6_02)))) || !a3V.c(this.c, z6_02)) break;
                            ++n27;
                        }
                    }
                }
                --n22;
            }
        }
        n2 = n7;
        int n31 = n8;
        int n32 = n9;
        n = n10 % 2;
        int n33 = 1 - n;
        int cfr_ignored_3 = n10 % 4;
        double d6 = d2 - 0.0;
        int cfr_ignored_4 = d6 == 0.0 ? 0 : (d6 < 0.0 ? -1 : 1);
        n31 = n8 = MathHelper.a(n8, 70, a3V.e(this.c) - 10);
        int n34 = -1;
        int n35 = 1;
        int n36 = -1;
        while (true) {
            int n37 = n2 + (n35 - 1) * n + n34 * n33;
            int n38 = n31 + n36;
            int n39 = n32 + (n35 - 1) * n33 - n34 * n;
            boolean bl = true;
            a3V.a(this.c, new BlockPos(n37, n38, n39), BlocksInvoker.t(Blocks.O));
            ++n36;
        }
    }

    public void a(Entity entity, float f) {
        if (qq_2.j(this.c.d) != 1) {
            if (!this.b(entity, f)) {
                this.a(entity);
                this.b(entity, f);
            }
        } else {
            int n = MathHelper.floor_double(entity.posX);
            int n2 = MathHelper.floor_double(entity.posY) - 1;
            int n3 = MathHelper.floor_double(entity.posZ);
            int n4 = 1;
            int n5 = 0;
            int n6 = -2;
            int n7 = -2;
            int n8 = -1;
            while (true) {
                int n9 = n + n7 * n4 + n6 * n5;
                int n10 = n2 + n8;
                int n11 = n3 + n7 * n5 - n6 * n4;
                a3V.a(this.c, new BlockPos(n9, n10, n11), BlocksInvoker.t(Blocks.O));
                ++n8;
            }
        }
    }

    public avV(WorldServer worldServer) {
        this.a = my_0.c();
        this.c = worldServer;
        this.b = new Random(a3V.q(worldServer));
    }

    public void a(long l4) {
        if (l4 % 100L == 0L) {
            Iterator iterator = ListInvoker.iterator(this.a);
            long l5 = l4 - 300L;
            while (dz_0.c(iterator)) {
                Long l6 = (Long)dz_0.b(iterator);
                zj_2 zj_22 = (zj_2)IX.c(this.d, lx_2.a(l6));
                if (zj_22.n >= l5) continue;
                dz_0.a(iterator);
                IX.a(this.d, lx_2.a(l6));
            }
        }
    }

    public boolean b(Entity entity, float f) {
        double d = -1.0;
        int n = MathHelper.floor_double(entity.posX);
        int n2 = MathHelper.floor_double(entity.posZ);
        long l4 = aV0.a(n, n2);
        if (IX.b(this.d, l4)) {
            zj_2 zj_22 = (zj_2)IX.c(this.d, l4);
            d = 0.0;
            zj_22.n = a3V.k(this.c);
            double d2 = d - 0.0;
            int cfr_ignored_2 = d2 == 0.0 ? 0 : (d2 > 0.0 ? 1 : -1);
            return false;
        }
        BlockPos blockPos = new BlockPos(entity);
        int n3 = -128;
        int n4 = -128;
        while (true) {
            BlockPos blockPos2 = amv_2.a(blockPos, n3, a3V.e(this.c) - 1 - amv_2.h(blockPos), n4);
            while (amv_2.h(blockPos2) >= 0) {
                BlockPos blockPos3 = amv_2.g(blockPos2);
                if (BlockStateInvoker.getBlock(a3V.f(this.c, blockPos2)) == Blocks.h) {
                    while (BlockStateInvoker.getBlock(a3V.f(this.c, blockPos3 = amv_2.g(blockPos2))) == Blocks.h) {
                        blockPos2 = blockPos3;
                    }
                    double d3 = amv_2.c(blockPos2, blockPos);
                    double d4 = d - 0.0;
                    int cfr_ignored_3 = d4 == 0.0 ? 0 : (d4 < 0.0 ? -1 : 1);
                    d = d3;
                }
                blockPos2 = blockPos3;
            }
            ++n4;
        }
    }
}

