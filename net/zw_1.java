/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.MathInvoker;
import deobf.EnumFacing;
import net.minecraft.block.BlockPos;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.zW
 */
public class zw_1
extends BlockPos {
    private zw_1[] s;
    private int r;
    private boolean o;
    private int q;
    private int p;
    private int n;

    public zw_1(int n, int n2, int n3, int n4) {
        super(0, 0, 0);
        this.q = n;
        this.r = n2;
        this.p = n3;
        this.n = n4;
    }

    @Override
    public int a() {
        return this.q;
    }

    public void a(int n, int n2, int n3) {
        this.q = n;
        this.r = n2;
        this.p = n3;
        this.o = true;
    }

    private void a() {
        aP2.b();
        int n = 0;
        zw_1 zw_12 = this.s[n];
        if (zw_12 != null) {
            EnumFacing enumFacing = EnumFacing.VALUES[n];
            int n2 = this.q + SJ.k(enumFacing);
            int n3 = this.r + SJ.f(enumFacing);
            int n4 = this.p + SJ.a(enumFacing);
            zw_12.a(n2, n3, n4);
        }
        ++n;
        this.o = false;
    }

    @Override
    public int b() {
        return this.p;
    }

    public zw_1(int n, int n2, int n3) {
        this(n, n2, n3, 0);
    }

    @Override
    public int c() {
        return this.r;
    }

    @Override
    public BlockPos a(EnumFacing enumFacing, int n) {
        return n == 1 ? this.a(enumFacing) : super.a(enumFacing, n);
    }

    public static Iterable c(BlockPos blockPos, BlockPos blockPos2) {
        BlockPos blockPos3 = new BlockPos(MathInvoker.b(blockPos.a(), blockPos2.a()), MathInvoker.b(blockPos.c(), blockPos2.c()), MathInvoker.b(blockPos.b(), blockPos2.b()));
        BlockPos blockPos4 = new BlockPos(MathInvoker.max(blockPos.a(), blockPos2.a()), MathInvoker.max(blockPos.c(), blockPos2.c()), MathInvoker.max(blockPos.b(), blockPos2.b()));
        return new pg_2(blockPos3, blockPos4);
    }

    public BlockPos b() {
        return new BlockPos(this.a(), this.c(), this.b());
    }

    public void a(double d, double d2, double d3) {
        this.a(MathHelper.floor_double(d), MathHelper.floor_double(d2), MathHelper.floor_double(d3));
    }

    public zw_1(double d, double d2, double d3) {
        this(MathHelper.floor_double(d), MathHelper.floor_double(d2), MathHelper.floor_double(d3));
    }

    @Override
    public BlockPos a(EnumFacing enumFacing) {
        int n;
        zw_1 zw_12;
        aP2.b();
        if (this.n <= 0) {
            return super.a(enumFacing, 1);
        }
        if (this.s == null) {
            this.s = new zw_1[EnumFacing.VALUES.length];
        }
        if (this.o) {
            this.a();
        }
        if ((zw_12 = this.s[n = SJ.i(enumFacing)]) == null) {
            int n2 = this.q + SJ.k(enumFacing);
            int n3 = this.r + SJ.f(enumFacing);
            int n4 = this.p + SJ.a(enumFacing);
            this.s[n] = zw_12 = new zw_1(n2, n3, n4, this.n - 1);
        }
        return zw_12;
    }
}

