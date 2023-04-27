/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
package cc.novoline.invoke;

import com.google.common.collect.ImmutableMap;
import java.util.Collection;
import net.minecraft.block.Block;
import net.IBlockState;
import net.a4_0;

public class BlockStateInvoker {
    private static int b;

    static {
        if (BlockStateInvoker.a() != 0) {
            BlockStateInvoker.b(35);
        }
    }

    public static IBlockState a(IBlockState iBlockState, a4_0 a4_02) {
        return iBlockState.b(a4_02);
    }

    public static IBlockState a(IBlockState iBlockState, a4_0 a4_02, Comparable comparable) {
        return iBlockState.a(a4_02, comparable);
    }

    public static Block getBlock(IBlockState iBlockState) {
        return iBlockState.b();
    }

    public static Comparable b(IBlockState iBlockState, a4_0 a4_02) {
        return iBlockState.a(a4_02);
    }

    public static ImmutableMap b(IBlockState iBlockState) {
        return iBlockState.c();
    }

    public static Collection a(IBlockState iBlockState) {
        return iBlockState.a();
    }

    public static int b() {
        return b;
    }

    public static int a() {
        BlockStateInvoker.b();
        return 71;
    }

    public static void b(int n) {
        b = n;
    }
}

