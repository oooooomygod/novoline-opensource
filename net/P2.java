/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.block.BlockPos;
import net.minecraft.item.ItemStack;

public class P2 {
    public static IBlockState a(g6_0 g6_02) {
        return g6_02.m();
    }

    public static void a(g6_0 g6_02, World world, BlockPos blockPos, a6t_0 a6t_02) {
        g6_02.a(world, blockPos, a6t_02);
    }

    public static boolean a(g6_0 g6_02, World world, BlockPos blockPos) {
        return g6_02.e(world, blockPos);
    }

    public static boolean a(g6_0 g6_02, World world, BlockPos blockPos, ItemStack itemStack) {
        return g6_02.a(world, blockPos, itemStack);
    }
}

