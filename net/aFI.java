/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import java.util.Random;
import net.minecraft.block.BlockPos;

public class aFI {
    private static ListInvoker[] b;

    public static void b(ListInvoker[] listInvokerArray) {
        b = listInvokerArray;
    }

    static {
        if (aFI.b() != null) {
            aFI.b(new ListInvoker[1]);
        }
    }

    public static ListInvoker[] b() {
        return b;
    }

    public static boolean a(i7_0 i7_02, World world, Random random, BlockPos blockPos) {
        return i7_02.a(world, random, blockPos);
    }
}

