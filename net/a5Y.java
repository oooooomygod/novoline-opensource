/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.TessellatorInvoker;
import net.minecraft.renderer.WorldRenderer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.lwjgl.opengl.GL11;

public class a5Y {
    private static String s = "CL_00000874";
    public float d = 32.0f;
    public List a;
    public float g;
    public float f;
    public boolean v;
    public float e;
    public List b;
    public float n;
    private int i;
    public float m;
    public List<aOP> k = new ArrayList<aOP>();
    public boolean p = true;
    public float t;
    public boolean x;
    public String q;
    private int u;
    float l;
    private int y;
    public float r;
    public float z;
    private q1_0 h;
    private boolean w;
    public float o;
    public boolean j = false;
    public float c = 64.0f;

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -1;
        char[] cArray = "'s\rao\u00152T\u0007ee".toCharArray();
        int n2 = 0;
        int n3 = 117;
        char[] cArray2 = cArray;
        int n4 = cArray.length;
        while (true) {
            n4 = n4;
            cArray2 = cArray2;
            int n5 = ++n2;
            int cfr_ignored_0 = n2 % 7;
            cArray2[n5] = (char)(cArray2[n5] ^ (n3 ^ 0x11));
            n3 = n3;
        }
    }

    public void b(float f, float f2, float f3, int n, int n2, int n3, float f4) {
        ListInvoker.add(this.k, new aOP(this, this.y, this.i, f, f2, f3, n, n2, n3, f4));
    }

    private void c() {
        if (this.n != 0.0f) {
            GlStateManagerInvoker.b(this.n * 57.295776f, 0.0f, 0.0f, 1.0f);
        }
        this.b();
    }

    public a5Y a(float f, float f2, float f3, int n, int n2, int n3) {
        ListInvoker.add(this.a, new kf_0(this, this.y, this.i, f, f2, f3, n, n2, n3, 0.0f));
        return this;
    }

    public void e() {
        if (this.w) {
            this.w = false;
            this.c(this.l);
        }
    }

    public a5Y(q1_0 q1_02) {
        this(q1_02, null);
    }

    public void a(float f, float f2, float f3) {
        this.g = f;
        this.o = f2;
        this.z = f3;
    }

    private void b() {
        if (this.m != 0.0f) {
            GlStateManagerInvoker.b(this.m * 57.295776f, 0.0f, 1.0f, 0.0f);
        }
        if (this.t != 0.0f) {
            GlStateManagerInvoker.b(this.t * 57.295776f, 1.0f, 0.0f, 0.0f);
        }
    }

    private void c(float f) {
        Object object;
        if (this.u == 0) {
            this.l = f;
            this.u = N4.b(1);
        }
        GL11.glNewList((int)this.u, (int)4864);
        WorldRenderer worldRenderer = TessellatorInvoker.getWorldRenderer(TessellatorInvoker.getInstance());
        Iterator iterator = ListInvoker.iterator(this.a);
        while (dz_0.c(iterator)) {
            object = dz_0.b(iterator);
            a4Q.a((kf_0)object, worldRenderer, f);
        }
        iterator = ListInvoker.iterator(this.k);
        while (dz_0.c(iterator)) {
            object = dz_0.b(iterator);
            aOP aOP2 = (aOP)object;
            yb_1.a(aOP2, TessellatorInvoker.getInstance(), f);
        }
        GL11.glEndList();
        this.w = true;
    }

    public a5Y a(float f, float f2, float f3, int n, int n2, int n3, boolean bl) {
        ListInvoker.add(this.a, new kf_0(this, this.y, this.i, f, f2, f3, n, n2, n3, 0.0f, bl));
        return this;
    }

    public a5Y a(int n, int n2) {
        this.c = n;
        this.d = n2;
        return this;
    }

    public void d(float f) {
        if (!this.v && this.p) {
            if (!this.w) {
                this.c(f);
            }
            GlStateManagerInvoker.translate(this.e, this.r, this.f);
            if (this.t == 0.0f && this.m == 0.0f && this.n == 0.0f) {
                if (this.g == 0.0f && this.o == 0.0f && this.z == 0.0f) {
                    GlStateManagerInvoker.i(this.u);
                    if (this.b != null) {
                        Iterator iterator = ListInvoker.iterator(this.b);
                        while (dz_0.c(iterator)) {
                            Object object = dz_0.b(iterator);
                            ((a5Y)object).d(f);
                        }
                    }
                } else {
                    GlStateManagerInvoker.translate(this.g * f, this.o * f, this.z * f);
                    GlStateManagerInvoker.i(this.u);
                    if (this.b != null) {
                        Iterator iterator = ListInvoker.iterator(this.b);
                        while (dz_0.c(iterator)) {
                            Object object = dz_0.b(iterator);
                            ((a5Y)object).d(f);
                        }
                    }
                    GlStateManagerInvoker.translate(-this.g * f, -this.o * f, -this.z * f);
                }
            } else {
                GlStateManagerInvoker.pushMatrix();
                GlStateManagerInvoker.translate(this.g * f, this.o * f, this.z * f);
                this.c();
                GlStateManagerInvoker.i(this.u);
                if (this.b != null) {
                    Iterator iterator = ListInvoker.iterator(this.b);
                    while (dz_0.c(iterator)) {
                        Object object = dz_0.b(iterator);
                        ((a5Y)object).d(f);
                    }
                }
                GlStateManagerInvoker.popMatrix();
            }
            GlStateManagerInvoker.translate(-this.e, -this.r, -this.f);
        }
    }

    public void a(float f) {
        if (!this.v && this.p) {
            if (!this.w) {
                this.c(f);
            }
            if (this.t == 0.0f && this.m == 0.0f && this.n == 0.0f) {
                if (this.g != 0.0f || this.o != 0.0f || this.z != 0.0f) {
                    GlStateManagerInvoker.translate(this.g * f, this.o * f, this.z * f);
                }
            } else {
                GlStateManagerInvoker.translate(this.g * f, this.o * f, this.z * f);
                this.c();
            }
        }
    }

    public a5Y(q1_0 q1_02, int n, int n2) {
        this(q1_02);
        this.b(n, n2);
    }

    public boolean a() {
        return this.w;
    }

    public a5Y(q1_0 q1_02, String string) {
        this.a = my_0.c();
        this.h = q1_02;
        ListInvoker.add(q1_02.a, this);
        this.q = string;
        this.a(q1_02.b, q1_02.e);
    }

    public void a(a5Y a5Y2) {
        if (this.b == null) {
            this.b = my_0.c();
        }
        ListInvoker.add(this.b, a5Y2);
    }

    public a5Y a(String string, float f, float f2, float f3, int n, int n2, int n3) {
        string = aL0.a(aL0.a(aL0.a(new StringBuilder(), this.q), agi_2.a), string).toString();
        azn_1 azn_12 = aV7.a(this.h, string);
        this.b(azn_12.b, azn_12.a);
        ListInvoker.add(this.a, a4Q.a(new kf_0(this, this.y, this.i, f, f2, f3, n, n2, n3, 0.0f), string));
        return this;
    }

    public a5Y b(int n, int n2) {
        this.y = n;
        this.i = n2;
        return this;
    }

    public int d() {
        return this.u;
    }

    public void b(float f) {
        if (!this.v && this.p) {
            if (!this.w) {
                this.c(f);
            }
            GlStateManagerInvoker.pushMatrix();
            GlStateManagerInvoker.translate(this.g * f, this.o * f, this.z * f);
            this.b();
            if (this.n != 0.0f) {
                GlStateManagerInvoker.b(this.n * 57.295776f, 0.0f, 0.0f, 1.0f);
            }
            GlStateManagerInvoker.i(this.u);
            GlStateManagerInvoker.popMatrix();
        }
    }

    public void a(float f, float f2, float f3, int n, int n2, int n3, float f4) {
        ListInvoker.add(this.a, new kf_0(this, this.y, this.i, f, f2, f3, n, n2, n3, f4));
    }
}

