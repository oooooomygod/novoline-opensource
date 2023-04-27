/*
 * Decompiled with CFR 0.152.
 */
package deobf;

import cc.novoline.invoke.ListInvoker;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import net.apl_1;

public class OpenGlHelper {
    private static ListInvoker[] b;

    public static void b(int n, boolean bl, FloatBuffer floatBuffer) {
        apl_1.c(n, bl, floatBuffer);
    }

    public static boolean f() {
        return apl_1.j();
    }

    public static void b(ListInvoker[] listInvokerArray) {
        b = listInvokerArray;
    }

    public static void a(int n) {
        apl_1.g(n);
    }

    public static String h() {
        return apl_1.d();
    }

    public static void g(int n) {
        apl_1.d(n);
    }

    public static int e() {
        return apl_1.g();
    }

    public static void a(int n, int n2, int n3, int n4, int n5) {
        apl_1.a(n, n2, n3, n4, n5);
    }

    public static void b(int n, int n2, int n3, int n4) {
        apl_1.a(n, n2, n3, n4);
    }

    public static void d(int n) {
        apl_1.j(n);
    }

    public static void b(int n, IntBuffer intBuffer) {
        apl_1.c(n, intBuffer);
    }

    public static void a(int n, int n2) {
        apl_1.d(n, n2);
    }

    public static void a(int n, IntBuffer intBuffer) {
        apl_1.b(n, intBuffer);
    }

    public static void a(int n, ByteBuffer byteBuffer, int n2) {
        apl_1.a(n, byteBuffer, n2);
    }

    public static ListInvoker[] i() {
        return b;
    }

    public static void i(int n) {
        apl_1.f(n);
    }

    public static void initializeTextures() {
        apl_1.h();
    }

    public static void a(int n, float f, float f2) {
        apl_1.a(n, f, f2);
    }

    public static void c(int n, int n2, int n3, int n4) {
        apl_1.b(n, n2, n3, n4);
    }

    public static void a(int n, ByteBuffer byteBuffer) {
        apl_1.a(n, byteBuffer);
    }

    public static String h(int n, int n2) {
        return apl_1.e(n, n2);
    }

    public static int c() {
        return apl_1.e();
    }

    public static void c(int n, FloatBuffer floatBuffer) {
        apl_1.a(n, floatBuffer);
    }

    public static void d(int n, IntBuffer intBuffer) {
        apl_1.a(n, intBuffer);
    }

    public static void b(int n, FloatBuffer floatBuffer) {
        apl_1.d(n, floatBuffer);
    }

    public static int e(int n, int n2) {
        return apl_1.h(n, n2);
    }

    public static void l(int n) {
        apl_1.h(n);
    }

    public static void e(int n) {
        apl_1.l(n);
    }

    public static int a(int n, CharSequence charSequence) {
        return apl_1.a(n, charSequence);
    }

    public static void b(int n, int n2) {
        apl_1.a(n, n2);
    }

    public static void j(int n) {
        apl_1.i(n);
    }

    public static int c(int n) {
        return apl_1.b(n);
    }

    public static void b(int n) {
        apl_1.k(n);
    }

    public static int i(int n, int n2) {
        return apl_1.b(n, n2);
    }

    public static void d(int n, int n2) {
        apl_1.g(n, n2);
    }

    public static void f(int n) {
        apl_1.a(n);
    }

    public static int k(int n) {
        return apl_1.e(n);
    }

    public static void h(int n) {
        apl_1.c(n);
    }

    public static void a(int n, boolean bl, FloatBuffer floatBuffer) {
        apl_1.a(n, bl, floatBuffer);
    }

    public static int a() {
        return apl_1.c();
    }

    public static void f(int n, int n2) {
        apl_1.i(n, n2);
    }

    public static void d(int n, FloatBuffer floatBuffer) {
        apl_1.b(n, floatBuffer);
    }

    public static int b() {
        return apl_1.a();
    }

    public static boolean g() {
        return apl_1.f();
    }

    public static void a(int n, int n2, int n3, int n4) {
        apl_1.c(n, n2, n3, n4);
    }

    public static int b(int n, CharSequence charSequence) {
        return apl_1.b(n, charSequence);
    }

    static {
        if (OpenGlHelper.i() == null) {
            OpenGlHelper.b(new ListInvoker[4]);
        }
    }

    public static void c(int n, int n2) {
        apl_1.f(n, n2);
    }

    public static String g(int n, int n2) {
        return apl_1.c(n, n2);
    }

    public static void c(int n, IntBuffer intBuffer) {
        apl_1.d(n, intBuffer);
    }

    public static void c(int n, boolean bl, FloatBuffer floatBuffer) {
        apl_1.b(n, bl, floatBuffer);
    }

    public static void a(int n, FloatBuffer floatBuffer) {
        apl_1.c(n, floatBuffer);
    }
}

