/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import java.util.List;
import java.util.Random;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net.aQo
 */
public class aqo_0 {
    public static BlockPos a(ct_2 ct_22, int n, int n2, int n3, List list, Random random) {
        return ct_22.a(n, n2, n3, list, random);
    }

    public static il_0[] a(ct_2 ct_22, il_0[] il_0Array, int n, int n2, int n3, int n4) {
        return ct_22.b(il_0Array, n, n2, n3, n4);
    }

    public static boolean a(ct_2 ct_22, int n, int n2, int n3, List list) {
        return ct_22.a(n, n2, n3, list);
    }

    public static float[] a(ct_2 ct_22, float[] fArray, int n, int n2, int n3, int n4) {
        return ct_22.a(fArray, n, n2, n3, n4);
    }

    public static il_0 a(ct_2 ct_22, BlockPos blockPos) {
        return ct_22.a(blockPos);
    }

    public static il_0[] b(ct_2 ct_22, il_0[] il_0Array, int n, int n2, int n3, int n4) {
        return ct_22.a(il_0Array, n, n2, n3, n4);
    }

    public static void b(ct_2 ct_22) {
        ct_22.b();
    }

    public static float a(ct_2 ct_22, float f, int n) {
        return ct_22.a(f, n);
    }

    public static il_0[] a(ct_2 ct_22, il_0[] il_0Array, int n, int n2, int n3, int n4, boolean bl) {
        hw_0.b();
        il_0[] il_0Array2 = ct_22.a(il_0Array, n, n2, n3, n4, bl);
        if (ListInvoker.b() != null) {
            hw_0.b(false);
        }
        return il_0Array2;
    }

    public static List a(ct_2 ct_22) {
        return ct_22.a();
    }

    public static il_0 a(ct_2 ct_22, BlockPos blockPos, il_0 il_02) {
        return ct_22.a(blockPos, il_02);
    }
}

