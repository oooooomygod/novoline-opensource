/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MathInvoker;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/*
 * Renamed from net.ig
 */
public class ig_2
extends ii_1 {
    int i = 4;
    int l = 12;
    private BlockPos c = BlockPos.m;
    int e;
    double f = 0.618;
    double g = 1.0;
    private World d;
    private Random k;
    double h = 0.381;
    int j;
    int m = 1;
    List<zp_2> n;
    double b = 1.0;

    float a(int n) {
        return n < this.i ? (n != this.i - 1 ? 3.0f : 2.0f) : -1.0f;
    }

    private boolean f() {
        Block block = BlockStateInvoker.getBlock(aV8.q(this.d, amv_2.g(this.c)));
        if (block != Blocks.dirt && block != Blocks.grass && block != Blocks.al) {
            return false;
        }
        int n = this.b(this.c, amv_2.c(this.c, this.e - 1));
        if (n == -1) {
            return true;
        }
        if (n < 6) {
            return false;
        }
        this.e = n;
        return true;
    }

    void b() {
        Iterator iterator = ListInvoker.iterator(this.n);
        while (dz_0.c(iterator)) {
            zp_2 zp_22 = (zp_2)dz_0.b(iterator);
            this.b(zp_22);
        }
    }

    void b(BlockPos blockPos) {
        for (int i = 0; i < this.i; ++i) {
            this.a(amv_2.c(blockPos, i), this.a(i), BlockStateInvoker.a(aa1_0.a(Blocks.bP), BlockLeaves.V, Boolean.FALSE));
        }
    }

    private cs_2 a(BlockPos blockPos, BlockPos blockPos2) {
        int n;
        int n2;
        cs_2 cs_22 = cs_2.Y;
        int n3 = MathInvoker.a(amv_2.j(blockPos2) - amv_2.j(blockPos));
        cs_22 = n3 == (n2 = MathInvoker.max(n3, n = MathInvoker.a(amv_2.i(blockPos2) - amv_2.i(blockPos)))) ? cs_2.X : cs_2.Z;
        return cs_22;
    }

    @Override
    public boolean a(World world, Random random, BlockPos blockPos) {
        this.d = world;
        this.c = blockPos;
        this.k = new Random(a5_0.b(random));
        if (this.e == 0) {
            this.e = 5 + a5_0.a(this.k, this.l);
        }
        if (!this.f()) {
            return false;
        }
        this.c();
        this.b();
        this.d();
        this.e();
        return true;
    }

    @Override
    public void a() {
        this.i = 5;
    }

    float b(int n) {
        if ((float)n < (float)this.e * 0.3f) {
            return -1.0f;
        }
        float f = (float)this.e / 2.0f;
        float f2 = f - (float)n;
        float f3 = MathHelper.g(f * f - f2 * f2);
        if (f2 == 0.0f) {
            f3 = f;
        } else if (MathInvoker.b(f2) >= f) {
            return 0.0f;
        }
        return f3 * 0.5f;
    }

    private int a(BlockPos blockPos) {
        int n = MathHelper.a(amv_2.j(blockPos));
        int n2 = MathHelper.a(amv_2.h(blockPos));
        int n3 = MathHelper.a(amv_2.i(blockPos));
        return n3 > n && n3 > n2 ? n3 : MathInvoker.max(n2, n);
    }

    void d() {
        BlockPos blockPos = this.c;
        BlockPos blockPos2 = amv_2.c(this.c, this.j);
        Block block = Blocks.b2;
        this.a(blockPos, blockPos2, block);
        if (this.m == 2) {
            this.a(amv_2.f(blockPos), amv_2.f(blockPos2), block);
            this.a(amv_2.b(amv_2.f(blockPos)), amv_2.b(amv_2.f(blockPos2)), block);
            this.a(amv_2.b(blockPos), amv_2.b(blockPos2), block);
        }
    }

    void e() {
        Iterator iterator = ListInvoker.iterator(this.n);
        while (dz_0.c(iterator)) {
            zp_2 zp_22 = (zp_2)dz_0.b(iterator);
            int n = zp_22.d();
            BlockPos blockPos = new BlockPos(amv_2.j(this.c), n, amv_2.i(this.c));
            if (blockPos.equals(zp_22) || !this.c(n - amv_2.h(this.c))) continue;
            this.a(blockPos, (BlockPos)zp_22, Blocks.b2);
        }
    }

    void c() {
        int n;
        this.j = (int)((double)this.e * this.f);
        if (this.j >= this.e) {
            this.j = this.e - 1;
        }
        if ((n = (int)(1.382 + MathInvoker.b(this.b * (double)this.e / 13.0, 2.0))) < 1) {
            n = 1;
        }
        int n2 = amv_2.h(this.c) + this.j;
        int n3 = this.e - this.i;
        this.n = my_0.c();
        ListInvoker.add(this.n, new zp_2(amv_2.c(this.c, n3), n2));
        while (true) {
            float f;
            if ((f = this.b(n3)) >= 0.0f) {
                for (int i = 0; i < n; ++i) {
                    BlockPos blockPos;
                    double d;
                    double d2;
                    double d3 = this.g * (double)f * ((double)a5_0.e(this.k) + 0.328);
                    double d4 = d3 * (double)MathHelper.h(d2 = (double)(a5_0.e(this.k) * 2.0f) * Math.PI) + 0.5;
                    BlockPos blockPos2 = amv_2.a(this.c, d4, (double)(n3 - 1), d = d3 * (double)MathHelper.b(d2) + 0.5);
                    if (this.b(blockPos2, blockPos = amv_2.c(blockPos2, this.i)) != -1) continue;
                    int n4 = amv_2.j(this.c) - amv_2.j(blockPos2);
                    int n5 = amv_2.i(this.c) - amv_2.i(blockPos2);
                    double d5 = (double)amv_2.h(blockPos2) - MathInvoker.d(n4 * n4 + n5 * n5) * this.h;
                    int n6 = d5 > (double)n2 ? n2 : (int)d5;
                    BlockPos blockPos3 = new BlockPos(amv_2.j(this.c), n6, amv_2.i(this.c));
                    if (this.b(blockPos3, blockPos2) != -1) continue;
                    ListInvoker.add(this.n, new zp_2(blockPos2, amv_2.h(blockPos3)));
                }
            }
            --n3;
        }
    }

    public ig_2(boolean bl) {
        super(bl);
    }

    int b(BlockPos blockPos, BlockPos blockPos2) {
        BlockPos blockPos3 = amv_2.a(blockPos2, -amv_2.j(blockPos), -amv_2.h(blockPos), -amv_2.i(blockPos));
        int n = this.a(blockPos3);
        float f = (float)amv_2.j(blockPos3) / (float)n;
        float f2 = (float)amv_2.h(blockPos3) / (float)n;
        float f3 = (float)amv_2.i(blockPos3) / (float)n;
        for (int i = 0; i <= n; ++i) {
            BlockPos blockPos4 = amv_2.a(blockPos, 0.5f + (float)i * f, 0.5f + (float)i * f2, 0.5f + (float)i * f3);
            if (this.a(BlockStateInvoker.getBlock(aV8.q(this.d, blockPos4)))) continue;
            return i;
        }
        return -1;
    }

    void a(BlockPos blockPos, float f, IBlockState iBlockState) {
        int n = (int)((double)f + 0.618);
        for (int i = -n; i <= n; ++i) {
            for (int j = -n; j <= n; ++j) {
                BlockPos blockPos2;
                Material material;
                if (!(MathInvoker.b((double)MathInvoker.a(i) + 0.5, 2.0) + MathInvoker.b((double)MathInvoker.a(j) + 0.5, 2.0) <= (double)(f * f)) || (material = BlocksInvoker.getBlockState(BlockStateInvoker.getBlock(aV8.q(this.d, blockPos2 = amv_2.a(blockPos, i, 0, j))))) != Material.air && material != Material.z) continue;
                this.a(this.d, blockPos2, iBlockState);
            }
        }
    }

    boolean c(int n) {
        return (double)n >= (double)this.e * 0.2;
    }

    void a(BlockPos blockPos, BlockPos blockPos2, Block block) {
        BlockPos blockPos3 = amv_2.a(blockPos2, -amv_2.j(blockPos), -amv_2.h(blockPos), -amv_2.i(blockPos));
        int n = this.a(blockPos3);
        float f = (float)amv_2.j(blockPos3) / (float)n;
        float f2 = (float)amv_2.h(blockPos3) / (float)n;
        float f3 = (float)amv_2.i(blockPos3) / (float)n;
        for (int i = 0; i <= n; ++i) {
            BlockPos blockPos4 = amv_2.a(blockPos, 0.5f + (float)i * f, 0.5f + (float)i * f2, 0.5f + (float)i * f3);
            cs_2 cs_22 = this.a(blockPos, blockPos4);
            this.a(this.d, blockPos4, BlockStateInvoker.a(BlocksInvoker.t(block), g1_0.Q, (Comparable)((Object)cs_22)));
        }
    }
}

