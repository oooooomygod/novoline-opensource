/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.IBlockAccess;
import deobf.TileEntity;
import deobf.EnumFacing;
import net.minecraft.block.BlockPos;

public class aG3 {
    private static boolean b;

    public static boolean b(IBlockAccess iBlockAccess, BlockPos blockPos) {
        return iBlockAccess.a(blockPos);
    }

    public static boolean c() {
        aG3.b();
        return true;
    }

    public static int a(IBlockAccess iBlockAccess, BlockPos blockPos, EnumFacing enumFacing) {
        return iBlockAccess.a(blockPos, enumFacing);
    }

    public static IBlockState c(IBlockAccess iBlockAccess, BlockPos blockPos) {
        return iBlockAccess.b(blockPos);
    }

    public static void b(boolean bl) {
        b = bl;
    }

    public static il_0 d(IBlockAccess iBlockAccess, BlockPos blockPos) {
        return iBlockAccess.d(blockPos);
    }

    public static WorldType a(IBlockAccess iBlockAccess) {
        return iBlockAccess.e();
    }

    static {
        if (!aG3.b()) {
            aG3.b(true);
        }
    }

    public static TileEntity a(IBlockAccess iBlockAccess, BlockPos blockPos) {
        return iBlockAccess.c(blockPos);
    }

    public static int a(IBlockAccess iBlockAccess, BlockPos blockPos, int n) {
        return iBlockAccess.a(blockPos, n);
    }

    public static boolean b() {
        return b;
    }
}

