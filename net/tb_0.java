/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package net;

import cc.novoline.invoke.FontRendererInvoker;
import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.ScaledResolutionInvoker;
import cc.novoline.invoke.SystemInvoker;
import cc.novoline.invoke.TessellatorInvoker;
import cc.novoline.invoke.WorldRendererInvoker;
import deobf.DefaultVertexFormats;
import deobf.GameSettings;
import deobf.MCInvoker;
import net.minecraft.profiler.Profiler;
import deobf.Tessellator;
import net.minecraft.renderer.WorldRenderer;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

/*
 * Renamed from net.Tb
 */
public class tb_0 {
    private static long[] t;
    public static apo_0 C;
    private static GameSettings k;
    private static boolean[] c;
    private static long B;
    private static long[] s;
    private static long g;
    private static long A;
    private static Profiler f;
    public static apo_0 q;
    private static long[] o;
    private static Minecraft i;
    private static long[] d;
    private static long l;
    private static long j;
    public static apo_0 a;
    private static long e;
    public static apo_0 h;
    private static long[] b;
    private static long p;
    public static apo_0 r;
    private static long[] w;
    private static long[] y;
    private static long m;
    private static int v;
    public static apo_0 x;
    public static apo_0 n;
    private static int u;
    public static boolean D;
    private static long[] z;

    private static long a(int n, long l4, int n2, int n3, int n4, float f, WorldRenderer worldRenderer) {
        aP2.b();
        long l5 = l4 / 200000L;
        if (l5 < 3L) {
            return 0L;
        }
        WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.endVertex(worldRenderer, (float)n + 0.5f, f - (float)l5 + 0.5f, 0.0), n2, n3, n4, 255));
        WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.endVertex(worldRenderer, (float)n + 0.5f, f + 0.5f, 0.0), n2, n3, n4, 255));
        return l5;
    }

    public static boolean a() {
        aP2.b();
        long l4 = SystemInvoker.f();
        long l5 = tb_0.c();
        boolean bl = false;
        if (l5 < j) {
            double d = (double)g / 1000000.0;
            double d2 = (double)B / 1000.0;
            int n = (int)(d / d2);
            if (n > 0) {
                v = n;
            }
            p = l4;
            m = l5;
            B = 0L;
            g = 0L;
            bl = true;
        }
        B = l4 - p;
        g = l5 - m;
        e = l4;
        j = l5;
        return bl;
    }

    public static void a(ScaledResolution scaledResolution) {
        aP2.b();
        if (k != null && (tb_0.k.a3 || tb_0.k.S)) {
            float f;
            int n;
            long l4 = SystemInvoker.nanoTime();
            GlStateManagerInvoker.clear(256);
            GlStateManagerInvoker.matrixMode(5889);
            GlStateManagerInvoker.pushMatrix();
            GlStateManagerInvoker.enableColorMaterial();
            GlStateManagerInvoker.loadIdentity();
            GlStateManagerInvoker.ortho(0.0, tb_0.i.displayWidth, tb_0.i.displayHeight, 0.0, 1000.0, 3000.0);
            GlStateManagerInvoker.matrixMode(5888);
            GlStateManagerInvoker.pushMatrix();
            GlStateManagerInvoker.loadIdentity();
            GlStateManagerInvoker.translate(0.0f, 0.0f, -2000.0f);
            GL11.glLineWidth((float)1.0f);
            GlStateManagerInvoker.disableTexture2D();
            Tessellator tessellator = TessellatorInvoker.getInstance();
            WorldRenderer worldRenderer = TessellatorInvoker.getWorldRenderer(tessellator);
            WorldRendererInvoker.begin(worldRenderer, 1, DefaultVertexFormats.d);
            int n2 = 0;
            if (n2 < o.length) {
                n = (n2 - u & o.length - 1) * 100 / o.length;
                n += 155;
                f = tb_0.i.displayHeight;
                long l5 = 0L;
                if (c[n2]) {
                    tb_0.a(n2, o[n2], n, n / 2, 0, f, worldRenderer);
                }
                tb_0.a(n2, o[n2], n, n, n, f, worldRenderer);
                f -= (float)tb_0.a(n2, d[n2], n / 2, n / 2, n / 2, f, worldRenderer);
                f -= (float)tb_0.a(n2, b[n2], 0, n, 0, f, worldRenderer);
                f -= (float)tb_0.a(n2, y[n2], n, n, 0, f, worldRenderer);
                f -= (float)tb_0.a(n2, w[n2], n, 0, 0, f, worldRenderer);
                f -= (float)tb_0.a(n2, t[n2], n, 0, n, f, worldRenderer);
                f -= (float)tb_0.a(n2, z[n2], 0, 0, n, f, worldRenderer);
                float f2 = f - (float)tb_0.a(n2, s[n2], 0, n, n, f, worldRenderer);
                ++n2;
            }
            tb_0.a(0, o.length, 33333333L, 196, 196, 196, tb_0.i.displayHeight, worldRenderer);
            tb_0.a(0, o.length, 16666666L, 196, 196, 196, tb_0.i.displayHeight, worldRenderer);
            TessellatorInvoker.draw(tessellator);
            GlStateManagerInvoker.enableTexture2D();
            n2 = tb_0.i.displayHeight - 80;
            n = tb_0.i.displayHeight - 160;
            FontRendererInvoker.a(tb_0.i.fontRendererObj, aX9.e, 2.0f, n + 1, -8947849);
            FontRendererInvoker.a(tb_0.i.fontRendererObj, aX9.d, 1.0f, n, -3881788);
            FontRendererInvoker.a(tb_0.i.fontRendererObj, aX9.f, 2.0f, n2 + 1, -8947849);
            FontRendererInvoker.a(tb_0.i.fontRendererObj, aX9.b, 1.0f, n2, -3881788);
            GlStateManagerInvoker.matrixMode(5889);
            GlStateManagerInvoker.popMatrix();
            GlStateManagerInvoker.matrixMode(5888);
            GlStateManagerInvoker.popMatrix();
            GlStateManagerInvoker.enableTexture2D();
            f = 1.0f - (float)((double)(SystemInvoker.f() - p) / 1000.0);
            f = ys_2.a(f, 0.0f, 1.0f);
            int n3 = (int)(170.0f + f * 85.0f);
            int n4 = (int)(100.0f + f * 55.0f);
            int n5 = (int)(10.0f + f * 10.0f);
            int n6 = n3 << 16 | n4 << 8 | n5;
            int n7 = 512 / ScaledResolutionInvoker.getScaleFactor(scaledResolution) + 2;
            int n8 = tb_0.i.displayHeight / ScaledResolutionInvoker.getScaleFactor(scaledResolution) - 8;
            GW.a(tb_0.i.ingameGUI, n7 - 1, n8 - 1, n7 + 50, n8 + 10, -1605349296);
            FontRendererInvoker.a(tb_0.i.fontRendererObj, aL0.a(aL0.c(aL0.a(new StringBuilder(), aX9.c), v), aX9.a).toString(), n7, n8, n6);
            A = SystemInvoker.nanoTime() - l4;
        }
    }

    static {
        D = false;
        r = new apo_0();
        x = new apo_0();
        a = new apo_0();
        h = new apo_0();
        n = new apo_0();
        C = new apo_0();
        q = new apo_0();
        o = new long[512];
        s = new long[512];
        z = new long[512];
        t = new long[512];
        w = new long[512];
        y = new long[512];
        b = new long[512];
        d = new long[512];
        c = new boolean[512];
        u = 0;
        l = -1L;
        A = 0L;
        p = SystemInvoker.f();
        m = tb_0.c();
        e = p;
        j = m;
        B = 1L;
        g = 0L;
        v = 0;
    }

    public static void b() {
        aP2.b();
        if (i == null) {
            i = MCInvoker.f();
            k = tb_0.i.gameSettings;
            f = tb_0.i.mcProfiler;
        }
        if (tb_0.k.ar && (tb_0.k.a3 || tb_0.k.S)) {
            D = true;
            long l4 = SystemInvoker.nanoTime();
            if (l == -1L) {
                l = l4;
            }
            int n = u & o.length - 1;
            ++u;
            boolean bl = tb_0.a();
            tb_0.o[n] = l4 - l - A;
            tb_0.s[n] = tb_0.r.a;
            tb_0.z[n] = tb_0.x.a;
            tb_0.t[n] = tb_0.a.a;
            tb_0.w[n] = tb_0.h.a;
            tb_0.y[n] = tb_0.n.a;
            tb_0.b[n] = tb_0.C.a;
            tb_0.d[n] = tb_0.q.a;
            tb_0.c[n] = bl;
            apo_0.a(r);
            apo_0.a(x);
            apo_0.a(tb_0.n);
            apo_0.a(h);
            apo_0.a(a);
            apo_0.a(C);
            apo_0.a(q);
            l = SystemInvoker.nanoTime();
        }
        D = false;
        l = -1L;
    }

    private static long a(int n, int n2, long l4, int n3, int n4, int n5, float f, WorldRenderer worldRenderer) {
        aP2.b();
        long l5 = l4 / 200000L;
        if (l5 < 3L) {
            return 0L;
        }
        WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.endVertex(worldRenderer, (float)n + 0.5f, f - (float)l5 + 0.5f, 0.0), n3, n4, n5, 255));
        WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.endVertex(worldRenderer, (float)n2 + 0.5f, f - (float)l5 + 0.5f, 0.0), n3, n4, n5, 255));
        return l5;
    }

    private static long c() {
        Runtime runtime = als_2.a();
        return als_2.b(runtime) - als_2.a(runtime);
    }

    public static boolean d() {
        return D;
    }
}

