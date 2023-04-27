/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package deobf;

import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.TessellatorInvoker;
import cc.novoline.invoke.WorldRendererInvoker;
import net.minecraft.renderer.WorldRenderer;
import java.nio.ByteBuffer;
import net.aL0;
import net.aiv_2;
import net.apl_1;
import net.vj_0;
import org.lwjgl.opengl.GL11;

public class Framebuffer {
    public int g;
    public int f;
    public int d;
    public float[] h;
    public int a;
    public int e;
    public int j;
    public int c;
    public int i;
    public boolean b;

    public void a(int n) {
        if (OpenGlHelper.g()) {
            this.j = n;
            GlStateManagerInvoker.k(this.e);
            GL11.glTexParameterf((int)3553, (int)10241, (float)n);
            GL11.glTexParameterf((int)3553, (int)10240, (float)n);
            GL11.glTexParameterf((int)3553, (int)10242, (float)10496.0f);
            GL11.glTexParameterf((int)3553, (int)10243, (float)10496.0f);
            GlStateManagerInvoker.k(0);
        }
    }

    public void b() {
        int n = OpenGlHelper.k(apl_1.t);
        if (n != apl_1.Q) {
            if (n == apl_1.D) {
                throw new RuntimeException(vj_0.c);
            }
            if (n == apl_1.X) {
                throw new RuntimeException(vj_0.d);
            }
            if (n == apl_1.z) {
                throw new RuntimeException(vj_0.e);
            }
            if (n == apl_1.o) {
                throw new RuntimeException(vj_0.a);
            }
            throw new RuntimeException(aL0.c(aL0.a(new StringBuilder(), vj_0.b), n).toString());
        }
    }

    public void c(int n, int n2) {
        this.a(n, n2, true);
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }

    public void e() {
        this.a(true);
        GlStateManagerInvoker.c(this.h[0], this.h[1], this.h[2], this.h[3]);
        int n = 16384;
        if (this.b) {
            GlStateManagerInvoker.clearDepth(1.0);
            n |= 0x100;
        }
        GlStateManagerInvoker.clear(n);
        this.h();
    }

    public void g() {
        if (OpenGlHelper.g()) {
            GlStateManagerInvoker.k(0);
        }
    }

    public void h() {
        if (OpenGlHelper.g()) {
            OpenGlHelper.f(apl_1.t, 0);
        }
    }

    public void a(float f, float f2, float f3, float f4) {
        this.h[0] = f;
        this.h[1] = f2;
        this.h[2] = f3;
        this.h[3] = f4;
    }

    public void b(int n, int n2) {
        if (!OpenGlHelper.g()) {
            this.g = n;
            this.d = n2;
        } else {
            GlStateManagerInvoker.enableDepth();
            if (this.a >= 0) {
                this.c();
            }
            this.a(n, n2);
            this.b();
            OpenGlHelper.f(apl_1.t, 0);
        }
    }

    public void f() {
        if (OpenGlHelper.g()) {
            GlStateManagerInvoker.k(this.e);
        }
    }

    public void c() {
        if (OpenGlHelper.g()) {
            this.g();
            this.h();
            if (this.f > -1) {
                OpenGlHelper.j(this.f);
                this.f = -1;
            }
            if (this.e > -1) {
                aiv_2.a(this.e);
                this.e = -1;
            }
            if (this.a > -1) {
                OpenGlHelper.f(apl_1.t, 0);
                OpenGlHelper.f(this.a);
                this.a = -1;
            }
        }
    }

    public void a(int n, int n2) {
        this.g = n;
        this.d = n2;
        this.i = n;
        this.c = n2;
        if (!OpenGlHelper.g()) {
            this.e();
        } else {
            this.a = OpenGlHelper.b();
            this.e = aiv_2.a();
            if (this.b) {
                this.f = OpenGlHelper.e();
            }
            this.a(9728);
            GlStateManagerInvoker.k(this.e);
            GL11.glTexImage2D((int)3553, (int)0, (int)32856, (int)this.i, (int)this.c, (int)0, (int)6408, (int)5121, (ByteBuffer)null);
            OpenGlHelper.f(apl_1.t, this.a);
            OpenGlHelper.a(apl_1.t, apl_1.ae, 3553, this.e, 0);
            if (this.b) {
                OpenGlHelper.d(apl_1.y, this.f);
                OpenGlHelper.b(apl_1.y, 33190, this.i, this.c);
                OpenGlHelper.a(apl_1.t, apl_1.c, apl_1.y, this.f);
            }
            this.e();
            this.g();
        }
    }

    public void d() {
        GlStateManagerInvoker.c(this.h[0], this.h[1], this.h[2], this.h[3]);
        int n = 16384;
        if (this.b) {
            GlStateManagerInvoker.clearDepth(1.0);
            n |= 0x100;
        }
        GlStateManagerInvoker.clear(n);
    }

    public void a(int n, int n2, boolean bl) {
        if (OpenGlHelper.g()) {
            GlStateManagerInvoker.a(true, true, true, false);
            GlStateManagerInvoker.disableDepth();
            GlStateManagerInvoker.c(false);
            GlStateManagerInvoker.matrixMode(5889);
            GlStateManagerInvoker.loadIdentity();
            GlStateManagerInvoker.ortho(0.0, n, n2, 0.0, 1000.0, 3000.0);
            GlStateManagerInvoker.matrixMode(5888);
            GlStateManagerInvoker.loadIdentity();
            GlStateManagerInvoker.translate(0.0f, 0.0f, -2000.0f);
            GlStateManagerInvoker.viewport(0, 0, n, n2);
            GlStateManagerInvoker.enableTexture2D();
            GlStateManagerInvoker.disableLighting();
            GlStateManagerInvoker.C();
            GlStateManagerInvoker.disableBlend();
            GlStateManagerInvoker.enableColorMaterial();
            GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
            this.f();
            float f = n;
            float f2 = n2;
            float f3 = (float)this.g / (float)this.i;
            float f4 = (float)this.d / (float)this.c;
            Tessellator tessellator = TessellatorInvoker.getInstance();
            WorldRenderer worldRenderer = TessellatorInvoker.getWorldRenderer(tessellator);
            WorldRendererInvoker.begin(worldRenderer, 7, DefaultVertexFormats.POSITION_TEX_COLOR);
            WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, 0.0, f2, 0.0), 0.0, 0.0), 255, 255, 255, 255));
            WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, f, f2, 0.0), f3, 0.0), 255, 255, 255, 255));
            WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, f, 0.0, 0.0), f3, f4), 255, 255, 255, 255));
            WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, 0.0, 0.0, 0.0), 0.0, f4), 255, 255, 255, 255));
            TessellatorInvoker.draw(tessellator);
            this.g();
            GlStateManagerInvoker.c(true);
            GlStateManagerInvoker.a(true, true, true, true);
        }
    }

    public void a(boolean bl) {
        if (OpenGlHelper.g()) {
            OpenGlHelper.f(apl_1.t, this.a);
            GlStateManagerInvoker.viewport(0, 0, this.g, this.d);
        }
    }

    public Framebuffer(int n, int n2, boolean bl) {
        this.b = bl;
        this.a = -1;
        this.e = -1;
        this.f = -1;
        this.h = new float[4];
        this.h[0] = 1.0f;
        this.h[1] = 1.0f;
        this.h[2] = 1.0f;
        this.h[3] = 0.0f;
        this.b(n, n2);
    }

    public float[] a() {
        return this.h;
    }
}

