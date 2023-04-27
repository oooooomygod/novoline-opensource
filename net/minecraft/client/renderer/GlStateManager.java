/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package net.minecraft.client.renderer;

import deobf.MCInvoker;
import deobf.OpenGlHelper;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import net.DC;
import net.HD;
import net.a4I;
import net.aL0;
import net.aN6;
import net.aaq_0;
import net.ad7_0;
import net.ajH;
import net.ak3_0;
import net.apl_1;
import net.avi_2;
import net.axb_2;
import net.azp_1;
import net.cf_1;
import net.cz_1;
import net.i3_0;
import net.iu_2;
import net.ls_1;
import net.or_0;
import net.qd_1;
import net.sb_2;
import net.sv_2;
import net.ys_2;
import org.lwjgl.opengl.GL11;

public class GlStateManager {
    private static ls_1 g;
    private static sb_2 k;
    private static ad7_0 o;
    private static qd_1 u;
    private static sv_2[] i;
    private static aaq_0 e;
    private static sb_2 j;
    private static sb_2 t;
    private static sb_2[] a;
    private static int s;
    private static i3_0 n;
    public static boolean d;
    private static or_0 m;
    private static int c;
    private static iu_2 q;
    private static ak3_0 h;
    private static cf_1 f;
    private static cz_1 r;
    private static axb_2 b;
    private static azp_1 p;
    private static DC l;

    public static void b(float f, float f2, float f3, float f4) {
        if (f != GlStateManager.g.a || f2 != GlStateManager.g.d || f3 != GlStateManager.g.b || f4 != GlStateManager.g.c) {
            GlStateManager.g.a = f;
            GlStateManager.g.d = f2;
            GlStateManager.g.b = f3;
            GlStateManager.g.c = f4;
            GL11.glColor4f((float)f, (float)f2, (float)f3, (float)f4);
        }
    }

    public static void A() {
        GlStateManager.l.d.b();
    }

    public static void a(IntBuffer intBuffer) {
        HD.d(intBuffer);
        while (HD.b(intBuffer) < HD.f(intBuffer)) {
            int n = HD.g(intBuffer);
            GlStateManager.l(n);
        }
        HD.d(intBuffer);
    }

    public static void a(float f, float f2, float f3, float f4) {
        GL11.glRotatef((float)f, (float)f2, (float)f3, (float)f4);
    }

    public static void c(float f) {
        if (f != GlStateManager.l.b) {
            GlStateManager.l.b = f;
            GL11.glFogf((int)2915, (float)f);
        }
    }

    public static void m(int n) {
        if (n != GlStateManager.f.b) {
            GlStateManager.f.b = n;
            GL11.glLogicOp((int)n);
        }
    }

    public static void a(float f, float f2, float f3) {
        GL11.glTranslatef((float)f, (float)f2, (float)f3);
    }

    public static void C() {
        GL11.glPopAttrib();
    }

    public static void a(double d, double d2, double d3, double d4, double d5, double d6) {
        GL11.glOrtho((double)d, (double)d2, (double)d3, (double)d4, (double)d5, (double)d6);
    }

    public static void a(double d) {
        if (d != GlStateManager.e.e) {
            if (MCInvoker.W(MCInvoker.f()) == null && d != (double)GlStateManager.e.b && MCInvoker.f().player != null || d == (double)GlStateManager.e.b) {
                return;
            }
            GlStateManager.e.e = d;
            GL11.glClearDepth((double)d);
        }
    }

    public static void j(int n) {
        GL11.glCallList((int)n);
    }

    public static int F() {
        return apl_1.S + c;
    }

    public static void n(int n) {
        a[n].b();
    }

    public static void a(float f, float f2) {
        if (f != GlStateManager.u.a || f2 != GlStateManager.u.e) {
            GlStateManager.u.a = f;
            GlStateManager.u.e = f2;
            GL11.glPolygonOffset((float)f, (float)f2);
        }
    }

    public static void a(int n, float f) {
        if (n != GlStateManager.o.d || f != GlStateManager.o.b) {
            GlStateManager.o.d = n;
            GlStateManager.o.b = f;
            GL11.glAlphaFunc((int)n, (float)f);
        }
    }

    public static void s() {
        GL11.glPopMatrix();
    }

    public static void f(int n) {
        if (n != GlStateManager.r.d) {
            GlStateManager.r.d = n;
            GL11.glDepthFunc((int)n);
        }
    }

    public static void k(int n) {
        if (n != GlStateManager.i[GlStateManager.c].c) {
            GlStateManager.i[GlStateManager.c].c = n;
            GL11.glBindTexture((int)3553, (int)n);
        }
    }

    public static void B() {
        GL11.glLoadIdentity();
    }

    public static void a(ajH ajH2, int n) {
        a4I a4I2 = GlStateManager.a(ajH2);
        if (n != a4I2.c) {
            a4I2.c = n;
            GL11.glTexGeni((int)a4I2.b, (int)9472, (int)n);
        }
    }

    public static void g() {
        j.a();
    }

    public static void c(ajH ajH2) {
        GlStateManager.a((ajH)ajH2).a.b();
    }

    public static void u() {
        if (ys_2.s()) {
            int n = GL11.glGetInteger((int)34016);
            int n2 = GL11.glGetInteger((int)32873);
            int n3 = GlStateManager.F();
            int n4 = GlStateManager.q();
            if (n != n3 || n2 != n4) {
                ys_2.a(aL0.c(aL0.a(aL0.c(aL0.a(aL0.c(aL0.a(aL0.c(aL0.a(new StringBuilder(), aN6.d), n3), aN6.a), n), aN6.c), n4), aN6.b), n2).toString());
            }
        }
    }

    public static void i() {
        GlStateManager.h.d.b();
    }

    public static void a(double d, double d2, double d3) {
        GL11.glTranslated((double)d, (double)d2, (double)d3);
    }

    public static void i(int n) {
        if (n != GlStateManager.n.c) {
            GlStateManager.n.c = n;
            GL11.glCullFace((int)n);
        }
    }

    public static void G() {
        t.b();
    }

    public static void c(boolean bl) {
        if (bl != GlStateManager.r.c) {
            GlStateManager.r.c = bl;
            GL11.glDepthMask((boolean)bl);
        }
    }

    public static void d(int n) {
        a[n].b();
    }

    public static void y() {
        k.a();
    }

    public static void k() {
        GlStateManager.f.c.b();
    }

    public static void b(double d, double d2, double d3) {
        GL11.glScaled((double)d, (double)d2, (double)d3);
    }

    public static void b(float f, float f2, float f3) {
        GlStateManager.b(f, f2, f3, 1.0f);
    }

    public static void a(int n, int n2, int n3, int n4) {
        GL11.glViewport((int)n, (int)n2, (int)n3, (int)n4);
    }

    public static void b(float f) {
        if (f != GlStateManager.l.e) {
            GlStateManager.l.e = f;
            GL11.glFogf((int)2914, (float)f);
        }
    }

    public static void o() {
        GlStateManager.i[GlStateManager.c].a.a();
    }

    public static void h() {
        GlStateManager.n.a.a();
    }

    public static void D() {
        GlStateManager.i[GlStateManager.c].a.b();
    }

    public static void b() {
        GlStateManager.u.d.a();
    }

    public static void c(float f, float f2, float f3) {
        GL11.glScalef((float)f, (float)f2, (float)f3);
    }

    public static void E() {
        j.b();
    }

    public static void b(boolean bl) {
        j.a();
    }

    public static void a(FloatBuffer floatBuffer) {
        GL11.glMultMatrix((FloatBuffer)floatBuffer);
    }

    public static void c() {
        GL11.glPushMatrix();
    }

    public static void v() {
        t.a();
    }

    public static void l(int n) {
        GL11.glDeleteTextures((int)n);
        for (sv_2 sv_22 : i) {
            if (sv_22.c != n) continue;
            sv_22.c = 0;
        }
    }

    public static void h(int n) {
        GL11.glMatrixMode((int)n);
    }

    public static int q() {
        return GlStateManager.i[GlStateManager.c].c;
    }

    public static void m() {
        GlStateManager.i[GlStateManager.c].a.b();
    }

    public static void a(int n, FloatBuffer floatBuffer) {
        GL11.glGetFloat((int)n, (FloatBuffer)floatBuffer);
    }

    public static void e(int n) {
        a[n].a();
    }

    static {
        o = new ad7_0(null);
        j = new sb_2(2896);
        a = new sb_2[8];
        q = new iu_2(null);
        h = new ak3_0(null);
        r = new cz_1(null);
        l = new DC(null);
        n = new i3_0(null);
        u = new qd_1(null);
        f = new cf_1(null);
        b = new axb_2(null);
        e = new aaq_0(null);
        m = new or_0(null);
        t = new sb_2(2977);
        c = 0;
        i = new sv_2[32];
        s = 7425;
        k = new sb_2(32826);
        p = new azp_1(null);
        g = new ls_1();
        d = true;
        int n = 0;
        while (true) {
            GlStateManager.a[n] = new sb_2(16384 + n);
            ++n;
        }
    }

    public static void a() {
        GlStateManager.q.b.b();
    }

    public static void z() {
        GlStateManager.g.c = -1.0f;
        GlStateManager.g.b = -1.0f;
        GlStateManager.g.d = -1.0f;
        GlStateManager.g.a = -1.0f;
    }

    public static void a(int n, int n2) {
        if (n != GlStateManager.h.c || n2 != GlStateManager.h.f) {
            GlStateManager.h.c = n;
            GlStateManager.h.f = n2;
            GL11.glBlendFunc((int)n, (int)n2);
        }
    }

    public static void b(int n) {
        if (c != n - apl_1.S) {
            c = n - apl_1.S;
            apl_1.g(n);
        }
    }

    public static void I() {
        GL11.glBindTexture((int)3553, (int)GlStateManager.i[GlStateManager.c].c);
    }

    public static void b(int n, int n2) {
        if (n != GlStateManager.q.d || n2 != GlStateManager.q.c) {
            GlStateManager.q.d = n;
            GlStateManager.q.c = n2;
            GL11.glColorMaterial((int)n, (int)n2);
        }
    }

    public static void w() {
        GlStateManager.r.a.a();
    }

    public static void a(boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        if (bl != GlStateManager.p.a || bl2 != GlStateManager.p.e || bl3 != GlStateManager.p.d || bl4 != GlStateManager.p.c) {
            GlStateManager.p.a = bl;
            GlStateManager.p.e = bl2;
            GlStateManager.p.d = bl3;
            GlStateManager.p.c = bl4;
            GL11.glColorMask((boolean)bl, (boolean)bl2, (boolean)bl3, (boolean)bl4);
        }
    }

    public static void a(boolean bl) {
        j.b();
    }

    public static void a(float f) {
        if (f != GlStateManager.l.c) {
            GlStateManager.l.c = f;
            GL11.glFogf((int)2916, (float)f);
        }
    }

    public static void j() {
        GlStateManager.r.a.b();
    }

    private static a4I a(ajH ajH2) {
        switch (avi_2.a[ajH2.ordinal()]) {
            case 1: {
                return GlStateManager.b.e;
            }
            case 2: {
                return GlStateManager.b.a;
            }
            case 3: {
                return GlStateManager.b.b;
            }
            case 4: {
                return GlStateManager.b.d;
            }
        }
        return GlStateManager.b.e;
    }

    public static void l() {
        k.b();
    }

    public static void g(int n) {
        if (n != s) {
            s = n;
            GL11.glShadeModel((int)n);
        }
    }

    public static void c(float f, float f2, float f3, float f4) {
        if (f != GlStateManager.e.a.a || f2 != GlStateManager.e.a.d || f3 != GlStateManager.e.a.b || f4 != GlStateManager.e.a.c) {
            GlStateManager.e.a.a = f;
            GlStateManager.e.a.d = f2;
            GlStateManager.e.a.b = f3;
            GlStateManager.e.a.c = f4;
            GL11.glClearColor((float)f, (float)f2, (float)f3, (float)f4);
        }
    }

    public static void c(int n) {
        if (n != GlStateManager.l.a) {
            GlStateManager.l.a = n;
            GL11.glFogi((int)2917, (int)n);
        }
    }

    public static void p() {
        GlStateManager.o.a.b();
    }

    public static void b(ajH ajH2) {
        GlStateManager.a((ajH)ajH2).a.a();
    }

    public static void H() {
        GL11.glPushAttrib((int)8256);
    }

    public static void b(int n, int n2, int n3, int n4) {
        if (n != GlStateManager.h.c || n2 != GlStateManager.h.f || n3 != GlStateManager.h.e || n4 != GlStateManager.h.a) {
            GlStateManager.h.c = n;
            GlStateManager.h.f = n2;
            GlStateManager.h.e = n3;
            GlStateManager.h.a = n4;
            OpenGlHelper.c(n, n2, n3, n4);
        }
    }

    public static void e() {
        GlStateManager.u.d.b();
    }

    public static void K() {
        GlStateManager.f.c.a();
    }

    public static void a(int n) {
        a[n].a();
    }

    public static void J() {
        GlStateManager.h.d.a();
    }

    public static void n() {
        GlStateManager.o.a.a();
    }

    public static void x() {
        GlStateManager.l.d.a();
    }

    public static int t() {
        return GL11.glGenTextures();
    }

    public static void r() {
        GlStateManager.n.a.b();
    }

    public static void d() {
        GlStateManager.q.b.a();
    }

    public static void a(ajH ajH2, int n, FloatBuffer floatBuffer) {
        GL11.glTexGen((int)GlStateManager.a((ajH)ajH2).b, (int)n, (FloatBuffer)floatBuffer);
    }

    public static void f() {
        GlStateManager.i[GlStateManager.c].a.a();
    }

    public static void o(int n) {
        if (d) {
            GL11.glClear((int)n);
        }
    }
}

