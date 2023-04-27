/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import deobf.EnumFacing;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net.amv
 */
public class amv_2 {
    private static ListInvoker[] b;

    public static BlockPos g(BlockPos blockPos) {
        return blockPos.g();
    }

    public static BlockPos f(BlockPos blockPos) {
        return blockPos.a();
    }

    public static BlockPos a(BlockPos blockPos, int n, int n2, int n3) {
        return blockPos.a(n, n2, n3);
    }

    public static ListInvoker[] b() {
        return b;
    }

    public static BlockPos a(BlockPos blockPos, double d, double d2, double d3) {
        return blockPos.a(d, d2, d3);
    }

    public static int i(BlockPos blockPos) {
        return blockPos.b();
    }

    public static int j(BlockPos blockPos) {
        return blockPos.a();
    }

    public static BlockPos b(BlockPos blockPos, zl_2 zl_22) {
        return blockPos.a(zl_22);
    }

    public static BlockPos a(BlockPos blockPos, zl_2 zl_22) {
        return blockPos.c(zl_22);
    }

    public static BlockPos e(BlockPos blockPos) {
        return blockPos.d();
    }

    public static BlockPos b(BlockPos blockPos, int n) {
        return blockPos.c(n);
    }

    public static BlockPos c(BlockPos blockPos, int n) {
        return blockPos.f(n);
    }

    public static double c(BlockPos blockPos, zl_2 zl_22) {
        return blockPos.c(zl_22);
    }

    public static BlockPos b(BlockPos blockPos) {
        return blockPos.c();
    }

    public static int h(BlockPos blockPos) {
        return blockPos.c();
    }

    public static double c(BlockPos blockPos, double d, double d2, double d3) {
        return blockPos.b(d, d2, d3);
    }

    public static BlockPos d(BlockPos blockPos, int n) {
        return blockPos.b(n);
    }

    public static BlockPos a(BlockPos blockPos, int n) {
        return blockPos.a(n);
    }

    public static BlockPos f(BlockPos blockPos, int n) {
        return blockPos.e(n);
    }

    public static Iterable a(BlockPos blockPos, BlockPos blockPos2) {
        return BlockPos.b(blockPos, blockPos2);
    }

    public static BlockPos a(BlockPos blockPos) {
        return blockPos.f();
    }

    public static BlockPos a(BlockPos blockPos, EnumFacing enumFacing, int n) {
        return blockPos.a(enumFacing, n);
    }

    static {
        if (amv_2.b() != null) {
            amv_2.b(new ListInvoker[1]);
        }
    }

    public static long c(BlockPos blockPos) {
        return blockPos.b();
    }

    public static BlockPos a(BlockPos blockPos, EnumFacing enumFacing) {
        return blockPos.a(enumFacing);
    }

    public static double b(BlockPos blockPos, double d, double d2, double d3) {
        return blockPos.a(d, d2, d3);
    }

    public static BlockPos e(BlockPos blockPos, int n) {
        return blockPos.d(n);
    }

    public static BlockPos a(long l4) {
        return BlockPos.a(l4);
    }

    public static Iterable b(BlockPos blockPos, BlockPos blockPos2) {
        return BlockPos.a(blockPos, blockPos2);
    }

    public static void b(ListInvoker[] listInvokerArray) {
        b = listInvokerArray;
    }

    public static BlockPos d(BlockPos blockPos) {
        return blockPos.e();
    }
}

