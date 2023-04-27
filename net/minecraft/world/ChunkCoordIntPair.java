/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.world;

import net.minecraft.block.BlockPos;
import net.aL0;
import net.aW6;

public class ChunkCoordIntPair {
    public int b;
    private int c = 0;
    public int a;

    public int c() {
        return this.b << 4;
    }

    public static long a(int n, int n2) {
        return (long)n & 0xFFFFFFFFL | ((long)n2 & 0xFFFFFFFFL) << 32;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof ChunkCoordIntPair)) {
            return false;
        }
        ChunkCoordIntPair chunkCoordIntPair = (ChunkCoordIntPair)object;
        return this.b == chunkCoordIntPair.b && this.a == chunkCoordIntPair.a;
    }

    public BlockPos a(int n) {
        return new BlockPos(this.f(), n, this.d());
    }

    public int a() {
        return (this.b << 4) + 15;
    }

    public int e() {
        return this.a << 4;
    }

    public int hashCode() {
        if (this.c == 0) {
            int n = 1664525 * this.b + 1013904223;
            int n2 = 1664525 * (this.a ^ 0xDEADBEEF) + 1013904223;
            this.c = n ^ n2;
        }
        return this.c;
    }

    public int d() {
        return (this.a << 4) + 8;
    }

    public String toString() {
        return aL0.a(aL0.c(aL0.a(aL0.c(aL0.a(new StringBuilder(), aW6.a), this.b), aW6.b), this.a), aW6.c).toString();
    }

    public ChunkCoordIntPair(int n, int n2) {
        this.b = n;
        this.a = n2;
    }

    public int f() {
        return (this.b << 4) + 8;
    }

    public BlockPos a(int n, int n2, int n3) {
        return new BlockPos((this.b << 4) + n, n2, (this.a << 4) + n3);
    }

    public int b() {
        return (this.a << 4) + 15;
    }
}

