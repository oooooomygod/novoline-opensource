/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.Random;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net.amV
 */
public class amv_1 {
    public static boolean a(ale_1 ale_12, World world, BlockPos blockPos, IBlockState iBlockState, boolean bl) {
        return ale_12.a(world, blockPos, iBlockState, bl);
    }

    public static boolean a(ale_1 ale_12, World world, Random random, BlockPos blockPos, IBlockState iBlockState) {
        return ale_12.b(world, random, blockPos, iBlockState);
    }

    public static void b(ale_1 ale_12, World world, Random random, BlockPos blockPos, IBlockState iBlockState) {
        ale_12.a(world, random, blockPos, iBlockState);
    }
}

