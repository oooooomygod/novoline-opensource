/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 */
package net;

import com.google.common.collect.ImmutableList;
import java.util.Collection;
import net.minecraft.block.Block;

public class aXF {
    private static int b;

    public static int c() {
        aXF.b();
        return 78;
    }

    public static void b(int n) {
        b = n;
    }

    public static ImmutableList a(a42 a422) {
        return a422.a();
    }

    public static IBlockState c(a42 a422) {
        return a422.c();
    }

    static {
        if (aXF.b() != 0) {
            aXF.b(12);
        }
    }

    public static Block d(a42 a422) {
        return a422.d();
    }

    public static int b() {
        return b;
    }

    public static Collection b(a42 a422) {
        return a422.b();
    }
}

