/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.WorldRendererInvoker;
import net.minecraft.renderer.WorldRenderer;
import java.nio.ByteBuffer;

/*
 * Renamed from net.co
 */
public class co_2 {
    private WorldRenderer a;

    public void a(int[] nArray) {
        WorldRendererInvoker.a(this.a, nArray);
    }

    public ByteBuffer c() {
        return WorldRendererInvoker.l(this.a);
    }

    public int b() {
        return this.a.o();
    }

    public AB f() {
        return new AB(WorldRendererInvoker.f(this.a));
    }

    public co_2 a(double d, double d2) {
        return this.a(WorldRendererInvoker.color(this.a, d, d2));
    }

    public void a(float f, float f2, float f3) {
        WorldRendererInvoker.a(this.a, f, f2, f3);
    }

    public co_2 b(double d, double d2, double d3) {
        return this.a(WorldRendererInvoker.endVertex(this.a, d, d2, d3));
    }

    public void e() {
        WorldRendererInvoker.a(this.a);
    }

    public void a(double d, double d2, double d3) {
        WorldRendererInvoker.b(this.a, d, d2, d3);
    }

    public void a(float f, float f2, float f3, int n) {
        WorldRendererInvoker.a(this.a, f, f2, f3, n);
    }

    public co_2 b(int n, int n2, int n3, int n4) {
        return this.a(WorldRendererInvoker.tex(this.a, n, n2, n3, n4));
    }

    public void a(int n, VertexFormat aqn_02) {
        this.a.a(n, aqn_02);
    }

    public co_2 a(float f, float f2, float f3, float f4) {
        return this.a(WorldRendererInvoker.a(this.a, f, f2, f3, f4));
    }

    public void a(int n, int n2, int n3, int n4) {
        WorldRendererInvoker.a(this.a, n, n2, n3, n4);
    }

    public void a() {
        WorldRendererInvoker.j(this.a);
    }

    public void d(float f, float f2, float f3) {
        WorldRendererInvoker.b(this.a, f, f2, f3);
    }

    public void g() {
        this.a.c();
    }

    public co_2 c(float f, float f2, float f3) {
        return this.a(WorldRendererInvoker.d(this.a, f, f2, f3));
    }

    public void b(float f, float f2, float f3, int n) {
        WorldRendererInvoker.b(this.a, f, f2, f3, n);
    }

    public co_2 a(int n, int n2) {
        return this.a(WorldRendererInvoker.a(this.a, n, n2));
    }

    public void d() {
        WorldRendererInvoker.b(this.a);
    }

    public int h() {
        return this.a.i();
    }

    public void c(double d, double d2, double d3) {
        WorldRendererInvoker.c(this.a, d, d2, d3);
    }

    public co_2 a(WorldRenderer worldRenderer) {
        this.a = worldRenderer;
        return this;
    }

    public void b(float f, float f2, float f3) {
        WorldRendererInvoker.c(this.a, f, f2, f3);
    }

    public co_2(WorldRenderer worldRenderer) {
        this.a = worldRenderer;
    }

    public void a(int n) {
        WorldRendererInvoker.a(this.a, n);
    }

    public void a(Cn cn) {
        WorldRendererInvoker.a(this.a, cn);
    }
}

