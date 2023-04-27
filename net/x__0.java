/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.cache.LoadingCache
 */
package net;

import com.google.common.cache.LoadingCache;
import deobf.EnumFacing;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net.x_
 */
public class x__0 {
    private int c;
    private LoadingCache<BlockPos, auo_0> f;
    private int e;
    private BlockPos d;
    private int g;
    private EnumFacing a;
    private EnumFacing b;

    public BlockPos c() {
        return this.d;
    }

    public EnumFacing e() {
        return this.b;
    }

    public auo_0 a(int n, int n2, int n3) {
        return (auo_0)abj_0.b(this.f, ov_0.a(this.d, this.b(), this.e(), n, n2, n3));
    }

    public String toString() {
        return mg_2.a(mg_2.a(mg_2.a(aWU.a(this), qa_2.b, this.b), qa_2.c, this.a), qa_2.a, this.d).toString();
    }

    public x__0(BlockPos blockPos, EnumFacing enumFacing, EnumFacing enumFacing2, LoadingCache<BlockPos, auo_0> loadingCache, int n, int n2, int n3) {
        this.d = blockPos;
        this.a = enumFacing;
        this.b = enumFacing2;
        this.f = loadingCache;
        this.e = n;
        this.g = n2;
        this.c = n3;
    }

    public int a() {
        return this.g;
    }

    public EnumFacing b() {
        return this.a;
    }

    public int d() {
        return this.e;
    }
}

