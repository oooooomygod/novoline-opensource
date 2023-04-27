/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.IBlockAccess;
import java.util.Iterator;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net.Yh
 */
public class yh_0 {
    private static ags_1 a;
    private static ags_1 b;
    private static ags_1 c;

    private static int a(IBlockAccess iBlockAccess, BlockPos blockPos, ags_1 ags_12) {
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        Iterator iterator = OV.a(amv_2.a(amv_2.a(blockPos, -1, 0, -1), amv_2.a(blockPos, 1, 0, 1)));
        while (dz_0.c(iterator)) {
            z6_0 z6_02 = (z6_0)dz_0.b(iterator);
            int n4 = ags_12.a(aG3.d(iBlockAccess, z6_02), z6_02);
            n += (n4 & 0xFF0000) >> 16;
            n2 += (n4 & 0xFF00) >> 8;
            n3 += n4 & 0xFF;
        }
        return (n / 9 & 0xFF) << 16 | (n2 / 9 & 0xFF) << 8 | n3 / 9 & 0xFF;
    }

    public static int b(IBlockAccess iBlockAccess, BlockPos blockPos) {
        return yh_0.a(iBlockAccess, blockPos, c);
    }

    public static int a(IBlockAccess iBlockAccess, BlockPos blockPos) {
        return yh_0.a(iBlockAccess, blockPos, b);
    }

    public static int c(IBlockAccess iBlockAccess, BlockPos blockPos) {
        return yh_0.a(iBlockAccess, blockPos, a);
    }

    static {
        b = new ww_0();
        a = new s8_0();
        c = new y_0();
    }
}

