/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.util.vector.ReadableVector3f
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.TessellatorInvoker;
import net.minecraft.renderer.WorldRenderer;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.vector.ReadableVector3f;

public class a5K
extends a5Y {
    public ay_2 H;
    public float K;
    public boolean F;
    public ay_2 D = new ay_2();
    public int E;
    public boolean J = false;
    private static boolean G;
    private int C;
    public float I;
    public float A;
    public int B;

    public a5K(q1_0 q1_02, String string) {
        super(q1_02, string);
        this.H = new ay_2();
        this.A = 1.0f;
        this.K = 1.0f;
        this.I = 1.0f;
    }

    public a5K f(float f, float f2, float f3) {
        N5.c(this.b(), f, f2, f3);
        return this;
    }

    public a5K d(float f, float f2, float f3) {
        this.I = f;
        this.K = f2;
        this.A = f3;
        return this;
    }

    public void e(float f) {
        this.D.f(f);
        this.H.f(f);
        this.f(f);
    }

    public void a(a5K a5K2) {
        a5K.c();
        if (a5K2 != null) {
            this.t = a5K2.t;
            this.m = a5K2.m;
            this.n = a5K2.n;
            ady_2.a(this.D.f, (ReadableVector3f)a5K2.D.f);
            ady_2.a(this.D.a, (ReadableVector3f)a5K2.D.a);
            ady_2.a(this.D.c, (ReadableVector3f)a5K2.D.c);
            ady_2.a(this.D.e, (ReadableVector3f)a5K2.D.e);
            ady_2.a(this.D.b, (ReadableVector3f)a5K2.D.b);
            ady_2.a(this.H.f, (ReadableVector3f)a5K2.H.f);
            ady_2.a(this.H.a, (ReadableVector3f)a5K2.H.a);
            ady_2.a(this.H.c, (ReadableVector3f)a5K2.H.c);
            ady_2.a(this.H.e, (ReadableVector3f)a5K2.H.e);
            ady_2.a(this.H.b, (ReadableVector3f)a5K2.H.b);
            this.I = a5K2.I;
            this.K = a5K2.K;
            this.A = a5K2.A;
        }
    }

    public static boolean e() {
        return G;
    }

    public a5K b(float f, float f2, float f3) {
        this.e = f;
        this.r = f2;
        this.f = f3;
        return this;
    }

    public a5K(q1_0 q1_02) {
        super(q1_02);
        this.H = new ay_2();
        this.A = 1.0f;
        this.K = 1.0f;
        this.I = 1.0f;
    }

    @Override
    public void a(float f, float f2, float f3, int n, int n2, int n3, float f4) {
        ListInvoker.add(this.a, new kz_1(this, this.B, this.E, f, f2, f3, n, n2, n3, f4));
    }

    @Override
    public void d(float f) {
        block14: {
            int n;
            block12: {
                block13: {
                    a5K.e();
                    this.f(f);
                    if (!this.F) {
                        this.g(f);
                    }
                    GL11.glTranslatef((float)this.e, (float)this.r, (float)this.f);
                    if (this.t != 0.0f || this.m != 0.0f || this.n != 0.0f) break block12;
                    if (this.g != 0.0f || this.o != 0.0f || this.z != 0.0f) break block13;
                    GL11.glRotatef((float)(-asj_0.a(this.H)), (float)0.0f, (float)1.0f, (float)0.0f);
                    GL11.glRotatef((float)asj_0.c(this.H), (float)1.0f, (float)0.0f, (float)0.0f);
                    GL11.glRotatef((float)asj_0.b(this.H), (float)0.0f, (float)0.0f, (float)1.0f);
                    GL11.glScalef((float)this.I, (float)this.K, (float)this.A);
                    if (!this.v & this.p) {
                        GL11.glCallList((int)this.C);
                    }
                    if (!this.J && !(!this.v & this.p) || this.b == null || (n = 0) >= ListInvoker.size(this.b)) break block14;
                    ((a5Y)ListInvoker.get(this.b, n)).d(f);
                    ++n;
                }
                GL11.glTranslatef((float)(this.g * f), (float)(this.o * f), (float)(this.z * f));
                GL11.glRotatef((float)(-asj_0.a(this.H)), (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)asj_0.c(this.H), (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)asj_0.b(this.H), (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScalef((float)this.I, (float)this.K, (float)this.A);
                if (!this.v & this.p) {
                    GL11.glCallList((int)this.C);
                }
                if ((this.J || !this.v & this.p) && this.b != null && (n = 0) < ListInvoker.size(this.b)) {
                    ((a5Y)ListInvoker.get(this.b, n)).d(f);
                    ++n;
                }
                GL11.glTranslatef((float)(-this.g * f), (float)(-this.o * f), (float)(-this.z * f));
            }
            GL11.glPushMatrix();
            GL11.glTranslatef((float)(this.g * f), (float)(this.o * f), (float)(this.z * f));
            GL11.glRotatef((float)(-asj_0.a(this.H)), (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)asj_0.c(this.H), (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)asj_0.b(this.H), (float)0.0f, (float)0.0f, (float)1.0f);
            if (this.n != 0.0f) {
                GL11.glRotatef((float)(this.n * 57.295776f), (float)0.0f, (float)0.0f, (float)1.0f);
            }
            if (this.m != 0.0f) {
                GL11.glRotatef((float)(this.m * 57.295776f), (float)0.0f, (float)1.0f, (float)0.0f);
            }
            if (this.t != 0.0f) {
                GL11.glRotatef((float)(this.t * 57.295776f), (float)1.0f, (float)0.0f, (float)0.0f);
            }
            GL11.glScalef((float)this.I, (float)this.K, (float)this.A);
            if (!this.v & this.p) {
                GL11.glCallList((int)this.C);
            }
            if ((this.J || !this.v & this.p) && this.b != null && (n = 0) < ListInvoker.size(this.b)) {
                ((a5Y)ListInvoker.get(this.b, n)).d(f);
                ++n;
            }
            GL11.glPopMatrix();
        }
        GL11.glTranslatef((float)(-this.e), (float)(-this.r), (float)(-this.f));
    }

    public a5K(q1_0 q1_02, int n, int n2) {
        super(q1_02, n, n2);
        this.H = new ay_2();
        this.B = n;
        this.E = n2;
        this.A = 1.0f;
        this.K = 1.0f;
        this.I = 1.0f;
    }

    static {
        if (a5K.c()) {
            a5K.b(true);
        }
    }

    public a5K e(float f, float f2, float f3) {
        this.g = f;
        this.o = f2;
        this.z = f3;
        return this;
    }

    public a5K a(float f, float f2, float f3) {
        N5.b(this.b(), f, f2, f3);
        return this;
    }

    public a5K d() {
        N5.a(this.b(), this);
        this.F = false;
        return this;
    }

    @Override
    public void b(float f) {
        this.f(f);
        super.b(f);
    }

    public kz_1 b() {
        return (kz_1)ListInvoker.get(this.a, 0);
    }

    public a5K a() {
        this.A = 1.0f;
        this.K = 1.0f;
        this.I = 1.0f;
        return this;
    }

    @Override
    public void a(float f) {
        block7: {
            block6: {
                a5K.e();
                this.f(f);
                if (this.t != 0.0f || this.m != 0.0f || this.n != 0.0f) break block6;
                if (this.g == 0.0f && this.o == 0.0f && this.z == 0.0f) break block7;
                GL11.glTranslatef((float)(this.g * f), (float)(this.o * f), (float)(this.z * f));
                GL11.glRotatef((float)(-asj_0.a(this.H)), (float)0.0f, (float)1.0f, (float)0.0f);
                GL11.glRotatef((float)asj_0.c(this.H), (float)1.0f, (float)0.0f, (float)0.0f);
                GL11.glRotatef((float)asj_0.b(this.H), (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glScalef((float)this.I, (float)this.K, (float)this.A);
            }
            GL11.glTranslatef((float)(this.g * f), (float)(this.o * f), (float)(this.z * f));
            GL11.glRotatef((float)(-asj_0.a(this.H)), (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)asj_0.c(this.H), (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glRotatef((float)asj_0.b(this.H), (float)0.0f, (float)0.0f, (float)1.0f);
            if (this.n != 0.0f) {
                GL11.glRotatef((float)(this.n * 57.295776f), (float)0.0f, (float)0.0f, (float)1.0f);
            }
            if (this.m != 0.0f) {
                GL11.glRotatef((float)(this.m * 57.295776f), (float)0.0f, (float)1.0f, (float)0.0f);
            }
            if (this.t != 0.0f) {
                GL11.glRotatef((float)(this.t * 57.295776f), (float)1.0f, (float)0.0f, (float)0.0f);
            }
            GL11.glScalef((float)this.I, (float)this.K, (float)this.A);
        }
    }

    public void f(float f) {
        this.t = (float)((double)(asj_0.c(this.D) / 180.0f) * Math.PI);
        this.m = (float)((double)(asj_0.a(this.D) / 180.0f) * Math.PI);
        this.n = (float)((double)(asj_0.b(this.D) / 180.0f) * Math.PI);
    }

    public a5K c(float f, float f2, float f3) {
        N5.a(this.b(), f, f2, f3);
        return this;
    }

    public a5K c(boolean bl) {
        this.J = bl;
        return this;
    }

    public static void b(boolean bl) {
        G = bl;
    }

    public void g(float f) {
        a5K.c();
        this.C = N4.b(1);
        GL11.glNewList((int)this.C, (int)4864);
        WorldRenderer worldRenderer = TessellatorInvoker.getWorldRenderer(TessellatorInvoker.getInstance());
        int n = 0;
        if (n < ListInvoker.size(this.a)) {
            a4Q.a((kf_0)ListInvoker.get(this.a, n), worldRenderer, f);
            ++n;
        }
        GL11.glEndList();
        this.F = true;
    }

    public static boolean c() {
        a5K.e();
        return true;
    }
}

