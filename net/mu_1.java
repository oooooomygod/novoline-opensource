/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.EnumFacing;
import deobf.IBlockAccess;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net.mU
 */
public class mu_1 {
    public static Material a(BlockLiquid go_12) {
        return go_12.w();
    }

    public static int b(BlockLiquid go_12, IBlockAccess iBlockAccess, BlockPos blockPos) {
        return go_12.b(iBlockAccess, blockPos);
    }

    public static boolean c(BlockLiquid go_12, IBlockAccess iBlockAccess, BlockPos blockPos) {
        return go_12.b(iBlockAccess, blockPos);
    }

    public static void a(BlockLiquid go_12, IBlockAccess iBlockAccess, BlockPos blockPos) {
        go_12.a(iBlockAccess, blockPos);
    }

    public static double a(IBlockAccess iBlockAccess, BlockPos blockPos, Material material) {
        return BlockLiquid.a(iBlockAccess, blockPos, material);
    }

    public static float a(int n) {
        return BlockLiquid.a(n);
    }

    public static boolean a(BlockLiquid go_12, IBlockAccess iBlockAccess, BlockPos blockPos, EnumFacing enumFacing) {
        return go_12.b(iBlockAccess, blockPos, enumFacing);
    }
}

