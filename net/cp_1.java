/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import net.minecraft.block.BlockPos;
import net.minecraft.block.BlockStone;
import net.minecraft.init.Blocks;
import java.util.Random;

/*
 * Renamed from net.cP
 */
public class cp_1 {
    protected cd_0 v;
    protected int h = 1;
    protected i7_0 l;
    protected i7_0 o;
    protected i7_0 s;
    protected ip_1 f;
    protected int n;
    protected int q;
    protected int y;
    protected int j = 1;
    protected i7_0 K = new ig_1(4);
    protected int A = 3;
    protected int u = 1;
    protected int k;
    protected i7_0 D;
    protected i7_0 G;
    protected i7_0 d;
    protected i7_0 p;
    protected i7_0 J;
    protected i7_0 L;
    protected i7_0 c;
    protected i7_0 t;
    protected i7_0 I;
    protected i7_0 F;
    protected int e = 2;
    protected i7_0 r;
    protected int E;
    protected i7_0 C;
    public boolean a = true;
    protected Random g;
    protected BlockPos m;
    protected i7_0 H;
    protected i7_0 B;
    protected i7_0 x;
    protected World z;
    protected i7_0 i;
    protected int w;
    protected int b;

    public void a(World world, Random random, il_0 il_02, BlockPos blockPos) {
        if (this.z != null) {
            throw new RuntimeException(ara_0.b);
        }
        this.z = world;
        String string = uv_2.n(aV8.s(world));
        this.v = fl_2.a(fl_2.a(string));
        this.g = random;
        this.m = blockPos;
        this.d = new ix_1(BlocksInvoker.t(Blocks.dirt), this.v.au);
        this.J = new ix_1(BlocksInvoker.t(Blocks.gravel), this.v.ah);
        this.D = new ix_1(BlockStateInvoker.a(BlocksInvoker.t(Blocks.stone), BlockStone.P, (Comparable)((Object)UI.GRANITE)), this.v.at);
        this.F = new ix_1(BlockStateInvoker.a(BlocksInvoker.t(Blocks.stone), BlockStone.P, (Comparable)((Object)UI.DIORITE)), this.v.av);
        this.r = new ix_1(BlockStateInvoker.a(BlocksInvoker.t(Blocks.stone), BlockStone.P, (Comparable)((Object)UI.ANDESITE)), this.v.aj);
        this.t = new ix_1(BlocksInvoker.t(Blocks.coal_ore), this.v.e);
        this.p = new ix_1(BlocksInvoker.t(Blocks.iron_ore), this.v.aa);
        this.x = new ix_1(BlocksInvoker.t(Blocks.gold_ore), this.v.q);
        this.L = new ix_1(BlocksInvoker.t(Blocks.b5), this.v.ac);
        this.G = new ix_1(BlocksInvoker.t(Blocks.C), this.v.C);
        this.I = new ix_1(BlocksInvoker.t(Blocks.bH), this.v.Z);
        this.a(il_02);
        this.z = null;
        this.g = null;
    }

    protected void a(il_0 il_02) {
        Object object;
        Object object2;
        int n;
        int n2;
        int n3;
        int n4;
        this.a();
        for (n4 = 0; n4 < this.A; ++n4) {
            n3 = a5_0.a(this.g, 16) + 8;
            n2 = a5_0.a(this.g, 16) + 8;
            aFI.a(this.s, this.z, this.g, aV8.a(this.z, amv_2.a(this.m, n3, 0, n2)));
        }
        for (n4 = 0; n4 < this.h; ++n4) {
            n3 = a5_0.a(this.g, 16) + 8;
            n2 = a5_0.a(this.g, 16) + 8;
            aFI.a(this.K, this.z, this.g, aV8.a(this.z, amv_2.a(this.m, n3, 0, n2)));
        }
        for (n4 = 0; n4 < this.u; ++n4) {
            n3 = a5_0.a(this.g, 16) + 8;
            n2 = a5_0.a(this.g, 16) + 8;
            aFI.a(this.B, this.z, this.g, aV8.a(this.z, amv_2.a(this.m, n3, 0, n2)));
        }
        n4 = this.w;
        if (a5_0.a(this.g, 10) == 0) {
            ++n4;
        }
        for (n3 = 0; n3 < n4; ++n3) {
            n2 = a5_0.a(this.g, 16) + 8;
            n = a5_0.a(this.g, 16) + 8;
            ii_1 ii_12 = hw_0.a(il_02, this.g);
            xt_0.a(ii_12);
            BlockPos blockPos = aV8.r(this.z, amv_2.a(this.m, n2, 0, n));
            if (!xt_0.a(ii_12, this.z, this.g, blockPos)) continue;
            xt_0.b(ii_12, this.z, this.g, blockPos);
        }
        for (n3 = 0; n3 < this.n; ++n3) {
            n2 = a5_0.a(this.g, 16) + 8;
            n = a5_0.a(this.g, 16) + 8;
            aFI.a(this.l, this.z, this.g, aV8.r(this.z, amv_2.a(this.m, n2, 0, n)));
        }
        for (n3 = 0; n3 < this.e; ++n3) {
            int n5;
            int n6;
            n2 = a5_0.a(this.g, 16) + 8;
            object2 = amv_2.a(this.m, n2, n6 = a5_0.a(this.g, n5 = amv_2.h(aV8.r(this.z, amv_2.a(this.m, n2, 0, n = a5_0.a(this.g, 16) + 8))) + 32), n);
            object = hw_0.a(il_02, this.g, (BlockPos)object2);
            fu_0 fu_02 = aQS.a(aj4.b((dq_1)object));
            if (ye_1.b(fu_02) == Material.air) continue;
            MX.a(this.f, fu_02, (dq_1)object);
            MX.a(this.f, this.z, this.g, (BlockPos)object2);
        }
        for (n3 = 0; n3 < this.j; ++n3) {
            n2 = a5_0.a(this.g, 16) + 8;
            n = a5_0.a(this.g, 16) + 8;
            int n7 = amv_2.h(aV8.r(this.z, amv_2.a(this.m, n2, 0, n))) * 2;
            int n8 = a5_0.a(this.g, n7);
            aFI.a(hw_0.b(il_02, this.g), this.z, this.g, amv_2.a(this.m, n2, n8, n));
        }
        for (n3 = 0; n3 < this.E; ++n3) {
            n2 = a5_0.a(this.g, 16) + 8;
            n = a5_0.a(this.g, 16) + 8;
            int n9 = amv_2.h(aV8.r(this.z, amv_2.a(this.m, n2, 0, n))) * 2;
            int n10 = a5_0.a(this.g, n9);
            K7.a(new ie_1(), this.z, this.g, amv_2.a(this.m, n2, n10, n));
        }
        for (n3 = 0; n3 < this.q; ++n3) {
            n2 = a5_0.a(this.g, 16) + 8;
            n = a5_0.a(this.g, 16) + 8;
            int n11 = amv_2.h(aV8.r(this.z, amv_2.a(this.m, n2, 0, n))) * 2;
            int n12 = a5_0.a(this.g, n11);
            object2 = amv_2.a(this.m, n2, n12, n);
            while (amv_2.h((BlockPos)object2) > 0 && aV8.k(this.z, (BlockPos)(object = amv_2.g((BlockPos)object2)))) {
                object2 = object;
            }
            aFI.a(this.c, this.z, this.g, (BlockPos)object2);
        }
        for (n3 = 0; n3 < this.b; ++n3) {
            if (a5_0.a(this.g, 4) == 0) {
                n2 = a5_0.a(this.g, 16) + 8;
                n = a5_0.a(this.g, 16) + 8;
                BlockPos blockPos = aV8.r(this.z, amv_2.a(this.m, n2, 0, n));
                aFI.a(this.i, this.z, this.g, blockPos);
            }
            if (a5_0.a(this.g, 8) != 0) continue;
            n2 = a5_0.a(this.g, 16) + 8;
            n = a5_0.a(this.g, 16) + 8;
            int n13 = amv_2.h(aV8.r(this.z, amv_2.a(this.m, n2, 0, n))) * 2;
            int n14 = a5_0.a(this.g, n13);
            object2 = amv_2.a(this.m, n2, n14, n);
            aFI.a(this.H, this.z, this.g, (BlockPos)object2);
        }
        if (a5_0.a(this.g, 4) == 0) {
            n3 = a5_0.a(this.g, 16) + 8;
            n2 = a5_0.a(this.g, 16) + 8;
            n = amv_2.h(aV8.r(this.z, amv_2.a(this.m, n3, 0, n2))) * 2;
            int n15 = a5_0.a(this.g, n);
            aFI.a(this.i, this.z, this.g, amv_2.a(this.m, n3, n15, n2));
        }
        if (a5_0.a(this.g, 8) == 0) {
            n3 = a5_0.a(this.g, 16) + 8;
            n2 = a5_0.a(this.g, 16) + 8;
            n = amv_2.h(aV8.r(this.z, amv_2.a(this.m, n3, 0, n2))) * 2;
            int n16 = a5_0.a(this.g, n);
            aFI.a(this.H, this.z, this.g, amv_2.a(this.m, n3, n16, n2));
        }
        for (n3 = 0; n3 < this.k; ++n3) {
            n2 = a5_0.a(this.g, 16) + 8;
            n = a5_0.a(this.g, 16) + 8;
            int n17 = amv_2.h(aV8.r(this.z, amv_2.a(this.m, n2, 0, n))) * 2;
            int n18 = a5_0.a(this.g, n17);
            aFI.a(this.o, this.z, this.g, amv_2.a(this.m, n2, n18, n));
        }
        n3 = 0;
        while (true) {
            n2 = a5_0.a(this.g, 16) + 8;
            n = a5_0.a(this.g, 16) + 8;
            int n19 = amv_2.h(aV8.r(this.z, amv_2.a(this.m, n2, 0, n))) * 2;
            int n20 = a5_0.a(this.g, n19);
            aFI.a(this.o, this.z, this.g, amv_2.a(this.m, n2, n20, n));
            ++n3;
        }
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }

    protected void a() {
        this.b(this.v.c, this.d, this.v.p, this.v.u);
        this.b(this.v.o, this.J, this.v.l, this.v.al);
        this.b(this.v.X, this.F, this.v.ae, this.v.a);
        this.b(this.v.aw, this.D, this.v.J, this.v.an);
        this.b(this.v.M, this.r, this.v.f, this.v.m);
        this.b(this.v.ar, this.t, this.v.N, this.v.S);
        this.b(this.v.U, this.p, this.v.R, this.v.F);
        this.b(this.v.E, this.x, this.v.h, this.v.ab);
        this.b(this.v.L, this.L, this.v.ad, this.v.W);
        this.b(this.v.af, this.G, this.v.Y, this.v.i);
        this.a(this.v.s, this.I, this.v.Q, this.v.P);
    }

    public cp_1() {
        this.s = new i9_0(Blocks.sand, 7);
        this.B = new i9_0(Blocks.gravel, 6);
        this.f = new ip_1(Blocks.G, dq_1.DANDELION);
        this.i = new iq_0(Blocks.A);
        this.H = new iq_0(Blocks.bn);
        this.l = new ir_1();
        this.o = new im_1();
        this.C = new ih_2();
        this.c = new i__0();
    }

    protected void b(int n, i7_0 i7_02, int n2, int n3) {
        int n4;
        if (n3 < n2) {
            n4 = n2;
            n2 = n3;
            n3 = n4;
        } else if (n3 == n2) {
            if (n2 < 255) {
                ++n3;
            } else {
                --n2;
            }
        }
        for (n4 = 0; n4 < n; ++n4) {
            BlockPos blockPos = amv_2.a(this.m, a5_0.a(this.g, 16), a5_0.a(this.g, n3 - n2) + n2, a5_0.a(this.g, 16));
            aFI.a(i7_02, this.z, this.g, blockPos);
        }
    }

    protected void a(int n, i7_0 i7_02, int n2, int n3) {
        for (int i = 0; i < n; ++i) {
            BlockPos blockPos = amv_2.a(this.m, a5_0.a(this.g, 16), a5_0.a(this.g, n3) + a5_0.a(this.g, n3) + n2 - n3, a5_0.a(this.g, 16));
            aFI.a(i7_02, this.z, this.g, blockPos);
        }
    }
}

