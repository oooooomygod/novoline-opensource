/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.ListInvoker;
import deobf.IBlockAccess;
import net.minecraft.block.BlockPos;
import net.minecraft.renderer.WorldRenderer;

/*
 * Renamed from net.mQ
 */
public class mq_1 {
    public static void a(X6 x6, JE jE, IBlockState iBlockState, float f, boolean bl) {
        x6.a(jE, iBlockState, f, bl);
    }

    public static boolean a(X6 x6, IBlockAccess iBlockAccess, JE jE, IBlockState iBlockState, BlockPos blockPos, WorldRenderer worldRenderer) {
        return x6.a(iBlockAccess, jE, iBlockState, blockPos, worldRenderer);
    }

    public static boolean a(X6 x6, IBlockAccess iBlockAccess, JE jE, IBlockState iBlockState, BlockPos blockPos, WorldRenderer worldRenderer, boolean bl) {
        GlStateManagerInvoker.s();
        boolean bl2 = x6.a(iBlockAccess, jE, iBlockState, blockPos, worldRenderer, bl);
        ListInvoker.b(new ListInvoker[1]);
        return bl2;
    }

    public static float a(float f) {
        return X6.a(f);
    }

    public static void a(X6 x6, JE jE, float f, float f2, float f3, float f4) {
        x6.a(jE, f, f2, f3, f4);
    }

    public static void a() {
        X6.a();
    }
}

