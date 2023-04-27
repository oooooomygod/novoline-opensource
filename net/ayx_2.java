/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import deobf.Entity;
import net.EffectRenderer;
import deobf.EnumFacing;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net.ayx
 */
public class ayx_2 {
    private static String b = "t69af";

    public static void a(EffectRenderer effectRenderer, BlockPos blockPos, EnumFacing enumFacing) {
        effectRenderer.a(blockPos, enumFacing);
    }

    public static void a(EffectRenderer effectRenderer, BlockPos blockPos, IBlockState iBlockState) {
        effectRenderer.a(blockPos, iBlockState);
    }

    public static void a(EffectRenderer effectRenderer, mi_1 mi_12) {
        effectRenderer.b(mi_12);
    }

    public static void c(EffectRenderer effectRenderer, mi_1 mi_12) {
        effectRenderer.a(mi_12);
    }

    public static void a(EffectRenderer effectRenderer) {
        effectRenderer.b();
    }

    public static void a(EffectRenderer effectRenderer, Entity entity, B7 b7) {
        effectRenderer.a(entity, b7);
    }

    public static String b() {
        return b;
    }

    public static void b(String string) {
        b = string;
    }

    public static String b(EffectRenderer effectRenderer) {
        return effectRenderer.c();
    }

    public static void a(EffectRenderer effectRenderer, World world) {
        effectRenderer.a(world);
    }

    public static void a(EffectRenderer effectRenderer, Entity entity, float f) {
        effectRenderer.a(entity, f);
    }

    public static mi_1 a(EffectRenderer effectRenderer, int n, double d, double d2, double d3, double d4, double d5, double d6, int[] nArray) {
        ayx_2.b();
        mi_1 mi_12 = effectRenderer.a(n, d, d2, d3, d4, d5, d6, nArray);
        if (ListInvoker.b() != null) {
            ayx_2.b("gCAKWb");
        }
        return mi_12;
    }

    public static void b(EffectRenderer effectRenderer, Entity entity, float f) {
        effectRenderer.b(entity, f);
    }

    static {
        if (ayx_2.b() == null) {
            ayx_2.b("t69af");
        }
    }

    public static void b(EffectRenderer effectRenderer, mi_1 mi_12) {
        effectRenderer.d(mi_12);
    }
}

