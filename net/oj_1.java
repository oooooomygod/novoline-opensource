/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.List;
import java.util.Random;
import net.minecraft.block.BlockPos;
import net.ChunkCoordIntPair;

/*
 * Renamed from net.oJ
 */
public class oj_1 {
    public static boolean a(ajS ajS2, World world, BlockPos blockPos) {
        return ajS2.b(world, blockPos);
    }

    public static void a(ajS ajS2, em_1 em_12, World world, int n, int n2, xb_1 xb_12) {
        ajS2.a(em_12, world, n, n2, xb_12);
    }

    public static List a(ajS ajS2) {
        return ajS2.b();
    }

    public static boolean a(ajS ajS2, World world, Random random, ChunkCoordIntPair chunkCoordIntPair) {
        return ajS2.a(world, random, chunkCoordIntPair);
    }
}

