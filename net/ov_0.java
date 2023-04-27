/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  com.google.common.cache.LoadingCache
 */
package net;

import cc.novoline.invoke.MathInvoker;
import com.google.common.base.Predicate;
import com.google.common.cache.LoadingCache;
import java.util.Iterator;

import deobf.EnumFacing;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net.Ov
 */
public class ov_0 {
    private int c;
    private Predicate<auo_0>[][][] b;
    private int a;
    private int d;

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    public int a() {
        return this.a;
    }

    public x__0 a(World world, BlockPos blockPos) {
        LoadingCache<BlockPos, auo_0> loadingCache = ov_0.a(world, false);
        int n = MathInvoker.max(MathInvoker.max(this.d, this.a), this.c);
        Iterator iterator = OV.a(amv_2.b(blockPos, amv_2.a(blockPos, n - 1, n - 1, n - 1)));
        while (dz_0.c(iterator)) {
            BlockPos blockPos2 = (BlockPos)dz_0.b(iterator);
            for (EnumFacing enumFacing : EnumFacing.values()) {
                for (EnumFacing enumFacing2 : EnumFacing.values()) {
                    if (enumFacing2 == enumFacing || enumFacing2 == SJ.b(enumFacing)) continue;
                    x__0 x__02 = this.a(blockPos2, enumFacing, enumFacing2, loadingCache);
                    return x__02;
                }
            }
        }
        return null;
    }

    protected static BlockPos a(BlockPos blockPos, EnumFacing enumFacing, EnumFacing enumFacing2, int n, int n2, int n3) {
        if (enumFacing != enumFacing2 && enumFacing != SJ.b(enumFacing2)) {
            zl_2 zl_22 = new zl_2(SJ.k(enumFacing), SJ.f(enumFacing), SJ.a(enumFacing));
            zl_2 zl_23 = new zl_2(SJ.k(enumFacing2), SJ.f(enumFacing2), SJ.a(enumFacing2));
            zl_2 zl_24 = FJ.a(zl_22, zl_23);
            return amv_2.a(blockPos, FJ.a(zl_23) * -n2 + FJ.a(zl_24) * n + FJ.a(zl_22) * n3, FJ.b(zl_23) * -n2 + FJ.b(zl_24) * n + FJ.b(zl_22) * n3, FJ.c(zl_23) * -n2 + FJ.c(zl_24) * n + FJ.c(zl_22) * n3);
        }
        throw new IllegalArgumentException(ah0_0.a);
    }

    public ov_0(Predicate<auo_0>[][][] predicateArray) {
        this.b = predicateArray;
        this.c = predicateArray.length;
        if (this.c > 0) {
            this.a = predicateArray[0].length;
            this.d = this.a > 0 ? predicateArray[0][0].length : 0;
        } else {
            this.a = 0;
            this.d = 0;
        }
    }

    public static LoadingCache<BlockPos, auo_0> a(World world, boolean bl) {
        return aM4.a(aM4.c(), new ed_0(world, bl));
    }

    public int b() {
        return this.d;
    }

    private x__0 a(BlockPos blockPos, EnumFacing enumFacing, EnumFacing enumFacing2, LoadingCache<BlockPos, auo_0> loadingCache) {
        for (int i = 0; i < this.d; ++i) {
            for (int j = 0; j < this.a; ++j) {
                for (int k = 0; k < this.c; ++k) {
                    if (aqv_2.a(this.b[k][j][i], abj_0.b(loadingCache, ov_0.a(blockPos, enumFacing, enumFacing2, i, j, k)))) continue;
                    return null;
                }
            }
        }
        return new x__0(blockPos, enumFacing, enumFacing2, loadingCache, this.d, this.a, this.c);
    }
}

