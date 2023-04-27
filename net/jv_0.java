/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.Entity;
import deobf.EntityPlayer;
import deobf.EnumFacing;
import net.minecraft.block.BlockPos;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.renderer.chunk.RenderChunk;
import deobf.Tessellator;
import net.minecraft.multiplayer.WorldClient;
import net.minecraft.renderer.WorldRenderer;
import java.util.Collection;

/*
 * Renamed from net.Jv
 */
public class jv_0 {
    public static void a(RenderGlobal renderGlobal, a5w_0 a5w_02, double d, int n, Entity entity) {
        renderGlobal.a(a5w_02, d, n, entity);
    }

    public static int k(RenderGlobal renderGlobal) {
        return renderGlobal.u();
    }

    public static void b(RenderGlobal renderGlobal) {
        renderGlobal.c();
    }

    public static void d(RenderGlobal renderGlobal) {
        renderGlobal.a();
    }

    public static WorldClient j(RenderGlobal renderGlobal) {
        return renderGlobal.o();
    }

    public static void a(rm_2 rm_22, int n, int n2, int n3, int n4) {
        RenderGlobal.a(rm_22, n, n2, n3, n4);
    }

    public static int l(RenderGlobal renderGlobal) {
        return renderGlobal.s();
    }

    public static void g(RenderGlobal renderGlobal) {
        renderGlobal.p();
    }

    public static void a(RenderGlobal renderGlobal, int n, int n2) {
        renderGlobal.a(n, n2);
    }

    public static boolean a(RenderGlobal renderGlobal, double d, double d2, double d3, float f) {
        return renderGlobal.a(d, d2, d3, f);
    }

    public static void a(RenderGlobal renderGlobal, Entity entity, ao7_0 ao7_02, float f) {
        renderGlobal.a(entity, ao7_02, f);
    }

    public static void a(RenderGlobal renderGlobal, WorldClient worldClient) {
        renderGlobal.a(worldClient);
    }

    public static String h(RenderGlobal renderGlobal) {
        return renderGlobal.k();
    }

    public static void a(RenderGlobal renderGlobal, float f, int n) {
        renderGlobal.b(f, n);
    }

    public static void a(RenderGlobal renderGlobal, Tessellator tessellator, WorldRenderer worldRenderer, Entity entity, float f) {
        renderGlobal.a(tessellator, worldRenderer, entity, f);
    }

    public static void a(RenderGlobal renderGlobal) {
        renderGlobal.d();
    }

    public static int e(RenderGlobal renderGlobal) {
        return renderGlobal.b();
    }

    public static RenderChunk a(RenderGlobal renderGlobal, BlockPos blockPos) {
        return renderGlobal.b(blockPos);
    }

    public static void b(RenderGlobal renderGlobal, float f, int n) {
        renderGlobal.c(f, n);
    }

    public static String i(RenderGlobal renderGlobal) {
        return renderGlobal.e();
    }

    public static void a(RenderGlobal renderGlobal, Collection collection, Collection collection2) {
        renderGlobal.a(collection, collection2);
    }

    public static void a(RenderGlobal renderGlobal, long l4) {
        renderGlobal.a(l4);
    }

    public static void a(RenderGlobal renderGlobal, EntityPlayer entityPlayer, MovingObjectPosition movingObjectPosition, int n, float f) {
        renderGlobal.a(entityPlayer, movingObjectPosition, n, f);
    }

    public static void a(RenderGlobal renderGlobal, Entity entity, double d, ao7_0 ao7_02, int n, boolean bl) {
        renderGlobal.a(entity, d, ao7_02, n, bl);
    }

    public static void c(RenderGlobal renderGlobal) {
        renderGlobal.h();
    }

    public static void a(RenderGlobal renderGlobal, Entity entity, float f) {
        renderGlobal.a(entity, f);
    }

    public static void f(RenderGlobal renderGlobal) {
        renderGlobal.i();
    }

    public static RenderChunk a(RenderGlobal renderGlobal, RenderChunk renderChunk, EnumFacing enumFacing) {
        return renderGlobal.a(renderChunk, enumFacing);
    }

    public static void m(RenderGlobal renderGlobal) {
        renderGlobal.n();
    }
}

