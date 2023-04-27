/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.block.BlockPos;
import net.ChunkCoordIntPair;

public class aV0 {
    public static int c(ChunkCoordIntPair chunkCoordIntPair) {
        return chunkCoordIntPair.a();
    }

    public static BlockPos a(ChunkCoordIntPair chunkCoordIntPair, int n, int n2, int n3) {
        return chunkCoordIntPair.a(n, n2, n3);
    }

    public static BlockPos a(ChunkCoordIntPair chunkCoordIntPair, int n) {
        return chunkCoordIntPair.a(n);
    }

    public static long a(int n, int n2) {
        return ChunkCoordIntPair.a(n, n2);
    }

    public static int a(ChunkCoordIntPair chunkCoordIntPair) {
        return chunkCoordIntPair.c();
    }

    public static int b(ChunkCoordIntPair chunkCoordIntPair) {
        return chunkCoordIntPair.e();
    }

    public static int d(ChunkCoordIntPair chunkCoordIntPair) {
        return chunkCoordIntPair.b();
    }
}

