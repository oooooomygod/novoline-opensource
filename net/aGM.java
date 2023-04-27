/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.util.concurrent.ListenableFuture
 */
package net;

import com.google.common.util.concurrent.ListenableFuture;
import net.minecraft.renderer.chunk.RenderChunk;
import net.minecraft.renderer.WorldRenderer;

public class aGM {
    public static void a(l l4, uj_1 uj_12) {
        l4.a(uj_12);
    }

    public static lp_2 d(l l4) {
        return l4.c();
    }

    public static boolean a(l l4, RenderChunk renderChunk) {
        return l4.b(renderChunk);
    }

    public static ListenableFuture a(l l4, a5w_0 a5w_02, WorldRenderer worldRenderer, RenderChunk renderChunk, amx_0 amx_02) {
        return l4.a(a5w_02, worldRenderer, renderChunk, amx_02);
    }

    public static void c(l l4) {
        l4.e();
    }

    public static boolean b(l l4, RenderChunk renderChunk) {
        return l4.a(renderChunk);
    }

    public static boolean c(l l4, RenderChunk renderChunk) {
        return l4.c(renderChunk);
    }

    public static boolean a(l l4, long l5) {
        return l4.a(l5);
    }

    public static String a(l l4) {
        return l4.d();
    }

    public static uj_1 b(l l4) {
        return l4.a();
    }
}

