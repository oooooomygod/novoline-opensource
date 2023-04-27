/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.EntityPlayer;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net.Nd
 */
public class nd_0 {
    public static void a(IWorldAccess iWorldAccess, String string, double d, double d2, double d3, float f, float f2) {
        iWorldAccess.a(string, d, d2, d3, f, f2);
    }

    public static void a(IWorldAccess iWorldAccess, EntityPlayer entityPlayer, int n, BlockPos blockPos, int n2) {
        iWorldAccess.a(entityPlayer, n, blockPos, n2);
    }

    public static void a(IWorldAccess iWorldAccess, int n, BlockPos blockPos, int n2) {
        iWorldAccess.a(n, blockPos, n2);
    }

    public static void a(IWorldAccess iWorldAccess, String string, BlockPos blockPos) {
        iWorldAccess.a(string, blockPos);
    }

    public static void a(IWorldAccess iWorldAccess, EntityPlayer entityPlayer, String string, double d, double d2, double d3, float f, float f2) {
        iWorldAccess.a(entityPlayer, string, d, d2, d3, f, f2);
    }
}

