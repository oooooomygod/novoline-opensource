/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import cc.novoline.invoke.MathInvoker;
import deobf.Entity;
import deobf.Vec3;
import deobf.EnumFacing;
import net.*;

public class BlockPos
extends zl_2 {
    private static int g;
    private static long i;
    private static long l;
    private static long h;
    private static int f;
    private static int e;
    private static int k;
    private static int j;
    public static BlockPos m;

    public BlockPos f() {
        return this.c(1);
    }

    public BlockPos f(int n) {
        return this.a(EnumFacing.UP, n);
    }

    public static BlockPos a(long l4) {
        int n = (int)(l4 << 64 - k - j >> 64 - j);
        int n2 = (int)(l4 << 64 - e - g >> 64 - g);
        int n3 = (int)(l4 << 64 - f >> 64 - f);
        return new BlockPos(n, n2, n3);
    }

    public BlockPos(zl_2 zl_22) {
        this(zl_22.a(), zl_22.c(), zl_22.b());
    }

    public BlockPos b(int n) {
        return this.a(EnumFacing.DOWN, n);
    }

    public BlockPos a(int n) {
        return this.a(EnumFacing.SOUTH, n);
    }

    public static Iterable<z6_0> b(BlockPos blockPos, BlockPos blockPos2) {
        BlockPos blockPos3 = new BlockPos(MathInvoker.b(blockPos.a(), blockPos2.a()), MathInvoker.b(blockPos.c(), blockPos2.c()), MathInvoker.b(blockPos.b(), blockPos2.b()));
        BlockPos blockPos4 = new BlockPos(MathInvoker.max(blockPos.a(), blockPos2.a()), MathInvoker.max(blockPos.c(), blockPos2.c()), MathInvoker.max(blockPos.b(), blockPos2.b()));
        return new ar_2(blockPos3, blockPos4);
    }

    public BlockPos(Vec3 vec3) {
        this(vec3.xCoord, vec3.yCoord, vec3.zCoord);
    }

    public BlockPos(Entity entity) {
        this(entity.posX, entity.posY, entity.posZ);
    }

    public BlockPos a() {
        return this.d(1);
    }

    public BlockPos g() {
        return this.b(1);
    }

    public BlockPos(double d, double d2, double d3) {
        super(d, d2, d3);
    }

    public BlockPos a(EnumFacing enumFacing, int n) {
        return this;
    }

    public long b() {
        return ((long)this.a() & l) << k | ((long)this.c() & i) << e | (long)this.b() & h;
    }

    static {
        m = new BlockPos(0, 0, 0);
        f = j = 1 + MathHelper.b(MathHelper.c(30000000));
        g = 64 - j - f;
        e = f;
        k = e + g;
        l = (1L << j) - 1L;
        i = (1L << g) - 1L;
        h = (1L << f) - 1L;
    }

    public BlockPos e() {
        return this.e(1);
    }

    public BlockPos d(int n) {
        return this.a(EnumFacing.EAST, n);
    }

    public BlockPos a(EnumFacing enumFacing) {
        return this.a(enumFacing, 1);
    }

    public BlockPos c(zl_2 zl_22) {
        return zl_22.a() == 0 && zl_22.c() == 0 && zl_22.b() == 0 ? this : new BlockPos(this.a() + zl_22.a(), this.c() + zl_22.c(), this.b() + zl_22.b());
    }

    @Override
    public BlockPos a(zl_2 zl_22) {
        return zl_22.a() == 0 && zl_22.c() == 0 && zl_22.b() == 0 ? this : new BlockPos(this.a() - zl_22.a(), this.c() - zl_22.c(), this.b() - zl_22.b());
    }

    public BlockPos d() {
        return this.f(1);
    }

    public BlockPos(int n, int n2, int n3) {
        super(n, n2, n3);
    }

    public BlockPos c(int n) {
        return this.a(EnumFacing.NORTH, n);
    }

    public BlockPos e(int n) {
        return this.a(EnumFacing.WEST, n);
    }

    public BlockPos a(double d, double d2, double d3) {
        return d == 0.0 && d2 == 0.0 && d3 == 0.0 ? this : new BlockPos((double)this.a() + d, (double)this.c() + d2, (double)this.b() + d3);
    }

    public static Iterable<BlockPos> a(BlockPos blockPos, BlockPos blockPos2) {
        BlockPos blockPos3 = new BlockPos(MathInvoker.b(blockPos.a(), blockPos2.a()), MathInvoker.b(blockPos.c(), blockPos2.c()), MathInvoker.b(blockPos.b(), blockPos2.b()));
        BlockPos blockPos4 = new BlockPos(MathInvoker.max(blockPos.a(), blockPos2.a()), MathInvoker.max(blockPos.c(), blockPos2.c()), MathInvoker.max(blockPos.b(), blockPos2.b()));
        return new aPQ(blockPos3, blockPos4);
    }

    public BlockPos b(zl_2 zl_22) {
        return new BlockPos(this.c() * zl_22.b() - this.b() * zl_22.c(), this.b() * zl_22.a() - this.a() * zl_22.b(), this.a() * zl_22.c() - this.c() * zl_22.a());
    }

    public BlockPos c() {
        return this.a(1);
    }

    public BlockPos a(int n, int n2, int n3) {
        return this;
    }
}

