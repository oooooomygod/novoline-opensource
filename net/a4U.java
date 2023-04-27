/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.List;
import java.util.Random;
import net.minecraft.block.BlockPos;
import net.ChunkCoordIntPair;

public class a4U {
    public static boolean a(ajN ajN2, BlockPos blockPos) {
        return ajN2.a(blockPos);
    }

    public static List a(ajN ajN2) {
        return ajN2.b();
    }

    public static boolean a(ajN ajN2, World world, Random random, ChunkCoordIntPair chunkCoordIntPair) {
        return ajN2.a(world, random, chunkCoordIntPair);
    }

    public static boolean a(ajN ajN2, World world, BlockPos blockPos) {
        return ajN2.b(world, blockPos);
    }

    public static void a(ajN ajN2, em_1 em_12, World world, int n, int n2, xb_1 xb_12) {
        ajN2.a(em_12, world, n, n2, xb_12);
    }
}

