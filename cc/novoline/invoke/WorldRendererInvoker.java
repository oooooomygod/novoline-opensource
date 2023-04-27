/*
 * Decompiled with CFR 0.152.
 */
package cc.novoline.invoke;

import net.minecraft.renderer.WorldRenderer;
import java.nio.ByteBuffer;
import net.Cn;
import net.KM;
import net.a5w_0;
import net.VertexFormat;

public class WorldRendererInvoker {
    private static String b;

    public static void b(WorldRenderer worldRenderer, float f, float f2, float f3, int n) {
        worldRenderer.b(f, f2, f3, n);
    }

    public static int e(WorldRenderer worldRenderer) {
        return worldRenderer.a();
    }

    public static WorldRenderer tex(WorldRenderer worldRenderer, int n, int n2, int n3, int n4) {
        return worldRenderer.a(n, n2, n3, n4);
    }

    public static WorldRenderer a(WorldRenderer worldRenderer, float f, float f2, float f3, float f4) {
        return worldRenderer.a(f, f2, f3, f4);
    }

    public static ByteBuffer l(WorldRenderer worldRenderer) {
        return worldRenderer.j();
    }

    public static void begin(WorldRenderer worldRenderer, int n, VertexFormat aqn_02) {
        worldRenderer.a(n, aqn_02);
    }

    public static void b(WorldRenderer worldRenderer, KM kM) {
        worldRenderer.b(kM);
    }

    public static void m(WorldRenderer worldRenderer) {
        worldRenderer.b();
    }

    public static void a(WorldRenderer worldRenderer, float f, float f2, float f3) {
        worldRenderer.a(f, f2, f3);
    }

    public static int c(WorldRenderer worldRenderer) {
        return worldRenderer.o();
    }

    public static WorldRenderer color(WorldRenderer worldRenderer, double d, double d2) {
        return worldRenderer.a(d, d2);
    }

    static {
        if (WorldRendererInvoker.b() != null) {
            WorldRendererInvoker.b("AVnsIb");
        }
    }

    public static void a(WorldRenderer worldRenderer, int n, int n2, int n3, int n4, int n5) {
        worldRenderer.a(n, n2, n3, n4, n5);
    }

    public static void pos(WorldRenderer worldRenderer) {
        worldRenderer.c();
    }

    public static void a(WorldRenderer worldRenderer, a5w_0 a5w_02) {
        worldRenderer.a(a5w_02);
    }

    public static void a(WorldRenderer worldRenderer, float f, float f2, float f3, int n) {
        worldRenderer.a(f, f2, f3, n);
    }

    public static void c(WorldRenderer worldRenderer, float f, float f2, float f3) {
        worldRenderer.b(f, f2, f3);
    }

    public static boolean d(WorldRenderer worldRenderer) {
        return worldRenderer.p();
    }

    public static int i(WorldRenderer worldRenderer) {
        return worldRenderer.i();
    }

    public static void g(WorldRenderer worldRenderer) {
        worldRenderer.l();
    }

    public static Cn k(WorldRenderer worldRenderer) {
        return worldRenderer.f();
    }

    public static void a(WorldRenderer worldRenderer, int[] nArray) {
        worldRenderer.a(nArray);
    }

    public static WorldRenderer d(WorldRenderer worldRenderer, float f, float f2, float f3) {
        return worldRenderer.c(f, f2, f3);
    }

    public static String b() {
        return b;
    }

    public static void j(WorldRenderer worldRenderer) {
        worldRenderer.h();
    }

    public static void a(WorldRenderer worldRenderer, KM kM) {
        worldRenderer.a(kM);
    }

    public static void a(WorldRenderer worldRenderer) {
        worldRenderer.q();
    }

    public static WorldRenderer a(WorldRenderer worldRenderer, int n, int n2) {
        return worldRenderer.a(n, n2);
    }

    public static void b(WorldRenderer worldRenderer) {
        worldRenderer.n();
    }

    public static int b(WorldRenderer worldRenderer, int n) {
        return worldRenderer.c(n);
    }

    public static VertexFormat f(WorldRenderer worldRenderer) {
        return worldRenderer.m();
    }

    public static void b(String string) {
        b = string;
    }

    public static void a(WorldRenderer worldRenderer, int n) {
        worldRenderer.b(n);
    }

    public static void b(WorldRenderer worldRenderer, double d, double d2, double d3) {
        worldRenderer.a(d, d2, d3);
    }

    public static void a(WorldRenderer worldRenderer, Cn cn) {
        worldRenderer.a(cn);
    }

    public static void a(WorldRenderer worldRenderer, int n, int n2, int n3, int n4) {
        worldRenderer.b(n, n2, n3, n4);
    }

    public static void b(WorldRenderer worldRenderer, float f, float f2, float f3) {
        worldRenderer.d(f, f2, f3);
    }

    public static WorldRenderer endVertex(WorldRenderer worldRenderer, double d, double d2, double d3) {
        return worldRenderer.c(d, d2, d3);
    }

    public static void c(WorldRenderer worldRenderer, double d, double d2, double d3) {
        worldRenderer.b(d, d2, d3);
    }
}

