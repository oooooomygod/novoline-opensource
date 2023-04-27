/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.EnumFacing;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net.a2n
 */
public class a2n_0 {
    private static String b = "ouNvy";

    public static void b(String string) {
        b = string;
    }

    public static int a(x__0 x__02) {
        return x__02.d();
    }

    public static BlockPos c(x__0 x__02) {
        return x__02.c();
    }

    public static String b() {
        return b;
    }

    static {
        if (a2n_0.b() == null) {
            a2n_0.b("ouNvy");
        }
    }

    public static int b(x__0 x__02) {
        return x__02.a();
    }

    public static auo_0 a(x__0 x__02, int n, int n2, int n3) {
        return x__02.a(n, n2, n3);
    }

    public static EnumFacing d(x__0 x__02) {
        return x__02.b();
    }
}

