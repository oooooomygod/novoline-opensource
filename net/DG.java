/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.invoke.TessellatorInvoker;
import cc.novoline.invoke.WorldRendererInvoker;
import deobf.DefaultVertexFormats;
import deobf.Tessellator;
import net.minecraft.renderer.WorldRenderer;
import java.util.Properties;

public class DG {
    private float[] a = g;
    private int b = -1;
    private int f = -1;
    private boolean h = false;
    private int k = -1;
    private a0W m = null;
    private int c = -1;
    private int l = 8;
    public static float[] g = new float[]{1.0f, 0.0f, 0.0f};
    private int e = 1;
    private float i = 1.0f;
    public int j = -1;
    public String d = null;

    private float[] a(String string, float[] fArray) {
        aP2.b();
        if (string == null) {
            return fArray;
        }
        String[] stringArray = ys_2.a(string, aUA.f);
        if (stringArray.length != 3) {
            ys_2.d(aL0.a(aL0.a(new StringBuilder(), aUA.i), string).toString());
            return fArray;
        }
        float[] fArray2 = new float[3];
        int n = 0;
        if (n < stringArray.length) {
            fArray2[n] = tf_0.a(stringArray[n], Float.MIN_VALUE);
            float f = fArray2[n] - Float.MIN_VALUE;
            int cfr_ignored_2 = f == 0.0f ? 0 : (f > 0.0f ? 1 : -1);
            ys_2.d(aL0.a(aL0.a(new StringBuilder(), aUA.a), string).toString());
            return fArray;
        }
        float f = fArray2[0];
        float f2 = fArray2[1];
        float f3 = fArray2[2];
        float f4 = f * f + f2 * f2 + f3 * f3 - 1.0E-5f;
        int cfr_ignored_3 = f4 == 0.0f ? 0 : (f4 < 0.0f ? -1 : 1);
        float[] fArray3 = new float[]{f3, f2, -f};
        return fArray3;
    }

    private boolean a(String string, boolean bl) {
        aP2.b();
        if (string == null) {
            return bl;
        }
        if (StringInvoker.i(string).equals(aUA.r)) {
            return true;
        }
        if (StringInvoker.i(string).equals(aUA.p)) {
            return false;
        }
        ys_2.d(aL0.a(aL0.a(new StringBuilder(), aUA.x), string).toString());
        return bl;
    }

    private float a(int n) {
        aP2.b();
        if (this.a(n, this.f, this.c)) {
            int n2 = this.b(this.c - this.f);
            int n3 = this.b(n - this.f);
            return (float)n3 / (float)n2;
        }
        if (this.a(n, this.c, this.b)) {
            return 1.0f;
        }
        if (this.a(n, this.b, this.k)) {
            int n4 = this.b(this.k - this.b);
            int n5 = this.b(n - this.b);
            return 1.0f - (float)n5 / (float)n4;
        }
        return 0.0f;
    }

    private int b(int n) {
        aP2.b();
        if (n >= 24000) {
            n -= 24000;
        }
        return n += 24000;
    }

    private int a(String string) {
        aP2.b();
        if (string == null) {
            return -1;
        }
        String[] stringArray = ys_2.a(string, aUA.h);
        if (stringArray.length != 2) {
            ys_2.d(aL0.a(aL0.a(new StringBuilder(), aUA.m), string).toString());
            return -1;
        }
        String string2 = stringArray[0];
        String string3 = stringArray[1];
        int n = ys_2.a(string2, -1);
        int n2 = ys_2.a(string3, -1);
        if (n >= 0 && n <= 23 && n2 >= 0 && n2 <= 59) {
            if ((n -= 6) < 0) {
                n += 24;
            }
            int n3 = n * 1000 + (int)((double)n2 / 60.0 * 1000.0);
            return n3;
        }
        ys_2.d(aL0.a(aL0.a(new StringBuilder(), aUA.q), string).toString());
        return -1;
    }

    private boolean a(int n, int n2, int n3) {
        aP2.b();
        return n2 <= n3 ? n >= n2 && n <= n3 : n >= n2 || n <= n3;
    }

    public boolean a(World world, int n) {
        aP2.b();
        if (this.a(n, this.k, this.f)) {
            return false;
        }
        if (this.m != null) {
            int n2;
            int n3;
            long l4 = aV8.g(world);
            long l5 = l4 - (long)this.f;
            if (l5 < 0L) {
                l5 += (long)(24000 * this.l);
            }
            if (!pe_1.a(this.m, n3 = (n2 = (int)(l5 / 24000L)) % this.l)) {
                return false;
            }
        }
        return true;
    }

    private float a(String string, float f) {
        aP2.b();
        if (string == null) {
            return f;
        }
        float f2 = tf_0.a(string, Float.MIN_VALUE);
        if (f2 == Float.MIN_VALUE) {
            ys_2.d(aL0.a(aL0.a(new StringBuilder(), aUA.s), string).toString());
            return f;
        }
        return f2;
    }

    public DG(Properties properties, String string) {
        kn_0 kn_02 = new kn_0(aUA.A);
        this.d = dk_1.b(properties, aUA.j, string);
        this.f = this.a(dk_1.a(properties, aUA.u));
        this.c = this.a(dk_1.a(properties, aUA.w));
        this.b = this.a(dk_1.a(properties, aUA.y));
        this.k = this.a(dk_1.a(properties, aUA.g));
        this.e = c0.a(dk_1.a(properties, aUA.l));
        this.h = this.a(dk_1.a(properties, aUA.k), true);
        this.i = this.a(dk_1.a(properties, aUA.o), 1.0f);
        this.a = this.a(dk_1.a(properties, aUA.B), g);
        this.m = aNT.f(kn_02, dk_1.a(properties, aUA.b));
        this.l = aNT.a(kn_02, dk_1.a(properties, aUA.c), 8);
    }

    public void a(int n, float f, float f2) {
        float f3 = f2 * this.a(n);
        aP2.b();
        f3 = ys_2.a(f3, 0.0f, 1.0f);
        if (f3 >= 1.0E-4f) {
            GlStateManagerInvoker.k(this.j);
            c0.a(this.e, f3);
            GlStateManagerInvoker.pushMatrix();
            if (this.h) {
                GlStateManagerInvoker.b(f * 360.0f * this.i, this.a[0], this.a[1], this.a[2]);
            }
            Tessellator tessellator = TessellatorInvoker.getInstance();
            GlStateManagerInvoker.b(90.0f, 1.0f, 0.0f, 0.0f);
            GlStateManagerInvoker.b(-90.0f, 0.0f, 0.0f, 1.0f);
            this.a(tessellator, 4);
            GlStateManagerInvoker.pushMatrix();
            GlStateManagerInvoker.b(90.0f, 1.0f, 0.0f, 0.0f);
            this.a(tessellator, 1);
            GlStateManagerInvoker.popMatrix();
            GlStateManagerInvoker.pushMatrix();
            GlStateManagerInvoker.b(-90.0f, 1.0f, 0.0f, 0.0f);
            this.a(tessellator, 0);
            GlStateManagerInvoker.popMatrix();
            GlStateManagerInvoker.b(90.0f, 0.0f, 0.0f, 1.0f);
            this.a(tessellator, 5);
            GlStateManagerInvoker.b(90.0f, 0.0f, 0.0f, 1.0f);
            this.a(tessellator, 2);
            GlStateManagerInvoker.b(90.0f, 0.0f, 0.0f, 1.0f);
            this.a(tessellator, 3);
            GlStateManagerInvoker.popMatrix();
        }
    }

    private void a(Tessellator tessellator, int n) {
        WorldRenderer worldRenderer = TessellatorInvoker.getWorldRenderer(tessellator);
        double d = (double)(n % 3) / 3.0;
        double d2 = (double)(n / 3) / 2.0;
        WorldRendererInvoker.begin(worldRenderer, 7, DefaultVertexFormats.a);
        WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, -100.0, -100.0, -100.0), d, d2));
        WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, -100.0, -100.0, 100.0), d, d2 + 0.5));
        WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, 100.0, -100.0, 100.0), d + 0.3333333333333333, d2 + 0.5));
        WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, 100.0, -100.0, -100.0), d + 0.3333333333333333, d2));
        TessellatorInvoker.draw(tessellator);
    }

    public boolean b(String string) {
        aP2.b();
        if (this.d == null) {
            ys_2.d(aL0.a(aL0.a(new StringBuilder(), aUA.v), string).toString());
            return false;
        }
        this.d = aH3.a(this.d, aH3.a(string));
        if (this.f >= 0 && this.c >= 0 && this.k >= 0) {
            int n;
            int n2;
            int n3;
            int n4;
            int n5 = this.b(this.c - this.f);
            if (this.b < 0) {
                this.b = this.b(this.k - n5);
                if (this.a(this.b, this.f, this.c)) {
                    this.b = this.c;
                }
            }
            if ((n4 = n5 + (n3 = this.b(this.b - this.c)) + (n2 = this.b(this.k - this.b)) + (n = this.b(this.f - this.k))) != 24000) {
                ys_2.d(aL0.c(aL0.a(new StringBuilder(), aUA.d), n4).toString());
                return false;
            }
            if (this.i < 0.0f) {
                ys_2.d(aL0.a(aL0.a(new StringBuilder(), aUA.e), this.i).toString());
                return false;
            }
            if (this.l <= 0) {
                ys_2.d(aL0.c(aL0.a(new StringBuilder(), aUA.C), this.l).toString());
                return false;
            }
            return true;
        }
        ys_2.d(aUA.n);
        return false;
    }
}

