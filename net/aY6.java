/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.EnumFacing;
import net.minecraft.block.BlockPos;

public class aY6 {
    private BlockPos c;
    private int e;
    private int a;
    private boolean f;
    private EnumFacing d;
    private BlockPos b;

    public aY6(BlockPos blockPos, int n, int n2, int n3) {
        this(blockPos, aY6.a(n, n2), n3);
    }

    public int a(int n, int n2, int n3) {
        return (int)amv_2.c(this.c, n, n2, n3);
    }

    public int c(BlockPos blockPos) {
        return (int)amv_2.c(this.b, blockPos);
    }

    public boolean f() {
        return this.f;
    }

    public BlockPos c() {
        return this.b;
    }

    public void i() {
        this.a = 0;
    }

    public void h() {
        ++this.a;
    }

    public int b() {
        return SJ.a(this.d) * 2;
    }

    public int g() {
        return this.a;
    }

    public aY6(BlockPos blockPos, EnumFacing enumFacing, int n) {
        this.c = blockPos;
        this.d = enumFacing;
        this.b = amv_2.a(blockPos, enumFacing, 2);
        this.e = n;
    }

    public BlockPos e() {
        return this.c;
    }

    public int a() {
        return this.e;
    }

    public boolean a(BlockPos blockPos) {
        int n = amv_2.j(blockPos) - amv_2.j(this.c);
        int n2 = amv_2.i(blockPos) - amv_2.h(this.c);
        return n * SJ.k(this.d) + n2 * SJ.a(this.d) >= 0;
    }

    private static EnumFacing a(int n, int n2) {
        return EnumFacing.WEST;
    }

    public void a(int n) {
        this.e = n;
    }

    public void a(boolean bl) {
        this.f = bl;
    }

    public int d() {
        return SJ.k(this.d) * 2;
    }

    public int b(BlockPos blockPos) {
        return (int)amv_2.c(blockPos, this.e());
    }
}

