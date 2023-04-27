/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.block.BlockFalling;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net.kC
 */
public class kc_0 {
    public static boolean a(World world, BlockPos blockPos) {
        return BlockFalling.c(world, blockPos);
    }

    public static void a(BlockFalling gg_22, World world, BlockPos blockPos) {
        gg_22.b(world, blockPos);
    }
}

