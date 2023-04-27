/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.EnumFacing;
import net.minecraft.block.BlockPos;
import net.minecraft.renderer.chunk.RenderChunk;
import java.util.concurrent.locks.ReentrantLock;

/*
 * Renamed from net.afq
 */
public class afq_2 {
    private static String[] b;

    public static void b(RenderChunk renderChunk, float f, float f2, float f3, lp_2 lp_22) {
        renderChunk.a(f, f2, f3, lp_22);
    }

    public static BlockPos b(RenderChunk renderChunk, EnumFacing enumFacing) {
        return renderChunk.a(enumFacing);
    }

    public static String[] b() {
        return b;
    }

    public static boolean g(RenderChunk renderChunk) {
        return renderChunk.m();
    }

    public static BlockPos a(RenderChunk renderChunk, EnumFacing enumFacing) {
        return renderChunk.b(enumFacing);
    }

    public static void a(RenderChunk renderChunk, amx_0 amx_02) {
        renderChunk.a(amx_02);
    }

    public static void c(RenderChunk renderChunk) {
        renderChunk.d();
    }

    public static void b(String[] stringArray) {
        b = stringArray;
    }

    public static amx_0 e(RenderChunk renderChunk) {
        return renderChunk.l();
    }

    public static void a(RenderChunk renderChunk, BlockPos blockPos) {
        renderChunk.a(blockPos);
    }

    public static void a(RenderChunk renderChunk, boolean bl) {
        renderChunk.a(bl);
    }

    public static ReentrantLock h(RenderChunk renderChunk) {
        return renderChunk.g();
    }

    public static boolean b(RenderChunk renderChunk) {
        return renderChunk.f();
    }

    public static BlockPos d(RenderChunk renderChunk) {
        return renderChunk.b();
    }

    public static boolean a(RenderChunk renderChunk, int n) {
        return renderChunk.b(n);
    }

    public static void a(RenderChunk renderChunk, float f, float f2, float f3, lp_2 lp_22) {
        renderChunk.b(f, f2, f3, lp_22);
    }

    static {
        if (afq_2.b() != null) {
            afq_2.b(new String[3]);
        }
    }

    public static lp_2 a(RenderChunk renderChunk) {
        return renderChunk.c();
    }

    public static aH5 b(RenderChunk renderChunk, int n) {
        return renderChunk.a(n);
    }

    public static lp_2 f(RenderChunk renderChunk) {
        return renderChunk.i();
    }
}

