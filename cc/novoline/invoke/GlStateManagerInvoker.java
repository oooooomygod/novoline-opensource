/*
 * Decompiled with CFR 0.152.
 */
package cc.novoline.invoke;

import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import net.GlStateManager;
import net.ajH;

public class GlStateManagerInvoker {
    private static String[] b;

    public static void I() {
        GlStateManager.I();
    }

    public static void c(float f, float f2, float f3, float f4) {
        GlStateManager.c(f, f2, f3, f4);
    }

    public static void disableLighting() {
        GlStateManager.g();
    }

    public static void a(float f) {
        GlStateManager.a(f);
    }

    public static void C() {
        GlStateManager.n();
    }

    public static void j(int n) {
        GlStateManager.d(n);
    }

    public static void d() {
        GlStateManager.K();
    }

    public static void y() {
        GlStateManager.y();
    }

    public static void matrixMode(int n) {
        GlStateManager.h(n);
    }

    public static void D() {
        GlStateManager.E();
    }

    public static void c(float f) {
        GlStateManager.c(f);
    }

    public static void popMatrix() {
        GlStateManager.s();
    }

    public static void v() {
        GlStateManager.C();
    }

    public static void color(float f, float f2, float f3, float f4) {
        GlStateManager.b(f, f2, f3, f4);
    }

    public static void u() {
        GlStateManager.e();
    }

    public static int E() {
        return GlStateManager.q();
    }

    public static void translate(float f, float f2, float f3) {
        GlStateManager.a(f, f2, f3);
    }

    public static String[] s() {
        return b;
    }

    public static void enableDepth() {
        GlStateManager.j();
    }

    public static void t() {
        GlStateManager.v();
    }

    public static void a(float f, float f2) {
        GlStateManager.a(f, f2);
    }

    public static void b() {
        GlStateManager.r();
    }

    public static void b(int n) {
        GlStateManager.c(n);
    }

    public static void n() {
        GlStateManager.G();
    }

    public static void enableColorMaterial() {
        GlStateManager.a();
    }

    public static void c() {
        GlStateManager.l();
    }

    public static void m() {
        GlStateManager.d();
    }

    public static void b(int n, int n2) {
        GlStateManager.a(n, n2);
    }

    public static void g(int n) {
        GlStateManager.l(n);
    }

    public static void l(int n) {
        GlStateManager.m(n);
    }

    public static void G() {
        GlStateManager.H();
    }

    public static void b(int n, int n2, int n3, int n4) {
        GlStateManager.b(n, n2, n3, n4);
    }

    public static void i(int n) {
        GlStateManager.j(n);
    }

    public static void a(ajH ajH2) {
        GlStateManager.b(ajH2);
    }

    public static void disableFog() {
        GlStateManager.x();
    }

    public static void b(double d, double d2, double d3) {
        GlStateManager.b(d, d2, d3);
    }

    public static void a(FloatBuffer floatBuffer) {
        GlStateManager.a(floatBuffer);
    }

    public static void b(String[] stringArray) {
        b = stringArray;
    }

    public static void A() {
        GlStateManager.h();
    }

    public static void depthFunc(int n) {
        GlStateManager.f(n);
    }

    public static void alphaFunc(int n, float f) {
        GlStateManager.a(n, f);
    }

    public static void B() {
        GlStateManager.k();
    }

    public static void cullFace(int n) {
        GlStateManager.i(n);
    }

    public static void disableTexture2D() {
        GlStateManager.f();
    }

    public static int q() {
        return GlStateManager.t();
    }

    public static void c(float f, float f2, float f3) {
        GlStateManager.c(f, f2, f3);
    }

    public static void clear(int n) {
        GlStateManager.o(n);
    }

    public static void enableTexture2D() {
        GlStateManager.m();
    }

    public static void a(ajH ajH2, int n) {
        GlStateManager.a(ajH2, n);
    }

    public static int H() {
        return GlStateManager.F();
    }

    public static void enableAlpha() {
        GlStateManager.p();
    }

    public static void d(int n) {
        GlStateManager.b(n);
    }

    public static void a(int n, FloatBuffer floatBuffer) {
        GlStateManager.a(n, floatBuffer);
    }

    public static void a(ajH ajH2, int n, FloatBuffer floatBuffer) {
        GlStateManager.a(ajH2, n, floatBuffer);
    }

    public static void a(boolean bl) {
        GlStateManager.b(bl);
    }

    public static void z() {
        GlStateManager.A();
    }

    public static void b(float f, float f2, float f3) {
        GlStateManager.b(f, f2, f3);
    }

    public static void a(double d, double d2, double d3) {
        GlStateManager.a(d, d2, d3);
    }

    public static void disableDepth() {
        GlStateManager.w();
    }

    public static void r() {
        GlStateManager.b();
    }

    public static void a(boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        GlStateManager.a(bl, bl2, bl3, bl4);
    }

    public static void e() {
        GlStateManager.z();
    }

    public static void shadeModel(int n) {
        GlStateManager.g(n);
    }

    public static void a(IntBuffer intBuffer) {
        GlStateManager.a(intBuffer);
    }

    public static void pushMatrix() {
        GlStateManager.c();
    }

    public static void k(int n) {
        GlStateManager.k(n);
    }

    public static void clearDepth(double d) {
        GlStateManager.a(d);
    }

    public static void h(int n) {
        GlStateManager.a(n);
    }

    public static void enableBlend() {
        GlStateManager.i();
    }

    public static void disableBlend() {
        GlStateManager.J();
    }

    static {
        if (GlStateManagerInvoker.s() == null) {
            GlStateManagerInvoker.b(new String[5]);
        }
    }

    public static void a(int n, int n2) {
        GlStateManager.b(n, n2);
    }

    public static void b(float f) {
        GlStateManager.b(f);
    }

    public static void ortho(double d, double d2, double d3, double d4, double d5, double d6) {
        GlStateManager.a(d, d2, d3, d4, d5, d6);
    }

    public static void loadIdentity() {
        GlStateManager.B();
    }

    public static void b(float f, float f2, float f3, float f4) {
        GlStateManager.a(f, f2, f3, f4);
    }

    public static void c(boolean bl) {
        GlStateManager.c(bl);
    }

    public static void b(boolean bl) {
        GlStateManager.a(bl);
    }

    public static void viewport(int n, int n2, int n3, int n4) {
        GlStateManager.a(n, n2, n3, n4);
    }

    public static void b(ajH ajH2) {
        GlStateManager.c(ajH2);
    }
}

