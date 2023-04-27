/*
 * Decompiled with CFR 0.152.
 */
package cc.novoline.invoke;

import deobf.Framebuffer;

public class FramebufferInvoker {
    private static String[] b;

    public static void setFramebufferColor(Framebuffer framebuffer, float f, float f2, float f3, float f4) {
        framebuffer.a(f, f2, f3, f4);
    }

    public static void a(Framebuffer framebuffer, int n, int n2, boolean bl) {
        framebuffer.a(n, n2, bl);
    }

    public static void e(Framebuffer framebuffer) {
        framebuffer.f();
    }

    public static void a(Framebuffer framebuffer) {
        framebuffer.e();
    }

    public static void unbindFramebuffer(Framebuffer framebuffer) {
        framebuffer.h();
    }

    static {
        if (FramebufferInvoker.b() == null) {
            FramebufferInvoker.b(new String[4]);
        }
    }

    public static void c(Framebuffer framebuffer) {
        framebuffer.d();
    }

    public static void a(Framebuffer framebuffer, int n) {
        framebuffer.a(n);
    }

    public static void b(String[] stringArray) {
        b = stringArray;
    }

    public static String[] b() {
        return b;
    }

    public static void b(Framebuffer framebuffer) {
        framebuffer.g();
    }

    public static void f(Framebuffer framebuffer) {
        framebuffer.c();
    }

    public static void bindFramebuffer(Framebuffer framebuffer, boolean bl) {
        framebuffer.a(bl);
    }

    public static void framebufferRender(Framebuffer framebuffer, int n, int n2) {
        framebuffer.c(n, n2);
    }

    public static void a(Framebuffer framebuffer, int n, int n2) {
        framebuffer.b(n, n2);
    }
}

