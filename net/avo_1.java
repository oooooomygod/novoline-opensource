/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.List;
import java.util.Random;
import net.minecraft.block.BlockPos;
import net.ChunkCoordIntPair;

/*
 * Renamed from net.avO
 */
public class avo_1 {
    public static void a(aji_0 aji_02, em_1 em_12, World world, int n, int n2, xb_1 xb_12) {
        aji_02.a(em_12, world, n, n2, xb_12);
    }

    public static boolean a(aji_0 aji_02, World world, Random random, ChunkCoordIntPair chunkCoordIntPair) {
        return aji_02.a(world, random, chunkCoordIntPair);
    }

    public static boolean a(aji_0 aji_02, BlockPos blockPos) {
        return aji_02.b(blockPos);
    }

    public static List a(aji_0 aji_02) {
        return aji_02.b();
    }
}

