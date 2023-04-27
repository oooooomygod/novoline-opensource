/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.MouseInvoker;
import cc.novoline.invoke.TessellatorInvoker;
import cc.novoline.invoke.TextureManagerInvoker;
import cc.novoline.invoke.WorldRendererInvoker;
import deobf.DefaultVertexFormats;
import deobf.MCInvoker;
import deobf.Tessellator;
import net.minecraft.renderer.WorldRenderer;
import net.minecraft.client.Minecraft;

/*
 * Renamed from net.aiY
 */
public abstract class aiy_1 {
    protected long g;
    protected float p;
    protected boolean h = true;
    protected int l;
    protected int i;
    protected int r;
    private int q;
    protected int o;
    protected boolean f = true;
    protected boolean d = true;
    private boolean b = true;
    protected Minecraft n;
    protected int u;
    protected int v = -1;
    protected int m;
    protected int a;
    private int c;
    protected boolean e;
    protected float s;
    protected int j = -2;
    protected int w;
    protected int k;
    protected int t;

    public void a(int n) {
        this.i = n;
        this.a = n + this.r;
    }

    public int d(int n, int n2) {
        int n3 = this.i + this.r / 2 - this.d() / 2;
        int n4 = this.i + this.r / 2 + this.d() / 2;
        int n5 = n2 - this.l - this.u + (int)this.p - 4;
        int n6 = n5 / this.m;
        return n < this.h() && n >= n3 && n <= n4 && n6 < this.f() ? n6 : -1;
    }

    protected void a(int n, int n2, Tessellator tessellator) {
    }

    public int c() {
        return MathInvoker.max(0, this.e() - (this.t - this.l - 4));
    }

    public aiy_1(Minecraft minecraft, int n, int n2, int n3, int n4, int n5) {
        this.n = minecraft;
        this.r = n;
        this.k = n2;
        this.l = n3;
        this.t = n4;
        this.m = n5;
        this.i = 0;
        this.a = n;
    }

    public int d() {
        return 220;
    }

    protected void b(int n, int n2) {
    }

    protected void c(int n, int n2, int n3, int n4) {
        Tessellator tessellator = TessellatorInvoker.getInstance();
        WorldRenderer worldRenderer = TessellatorInvoker.getWorldRenderer(tessellator);
        TextureManagerInvoker.bindTexture(MCInvoker.E(this.n), Gui.a);
        GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
        WorldRendererInvoker.begin(worldRenderer, 7, DefaultVertexFormats.POSITION_TEX_COLOR);
        WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, this.i, n2, 0.0), 0.0, (float)n2 / 32.0f), 64, 64, 64, n4));
        WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, this.i + this.r, n2, 0.0), (float)this.r / 32.0f, (float)n2 / 32.0f), 64, 64, 64, n4));
        WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, this.i + this.r, n, 0.0), (float)this.r / 32.0f, (float)n / 32.0f), 64, 64, 64, n3));
        WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, this.i, n, 0.0), 0.0, (float)n / 32.0f), 64, 64, 64, n3));
        TessellatorInvoker.draw(tessellator);
    }

    public void a(QG qG) {
        if (qG.g) {
            if (qG.m == this.q) {
                this.p -= (float)(this.m * 2 / 3);
                this.j = -2;
                this.b();
            } else if (qG.m == this.c) {
                this.p += (float)(this.m * 2 / 3);
                this.j = -2;
                this.b();
            }
        }
    }

    public int j() {
        return this.m;
    }

    public boolean d(int n) {
        return n >= this.l && n <= this.t && this.o >= this.i && this.o <= this.a;
    }

    public void c(int n, int n2) {
        this.q = n;
        this.c = n2;
    }

    protected abstract void a(int var1, boolean var2, int var3, int var4);

    public void b(int n) {
        this.p += (float)n;
        this.b();
        this.j = -2;
    }

    protected void b() {
        this.p = MathHelper.b(this.p, 0.0f, this.c());
    }

    public void b(int n, int n2, float f) {
        if (this.d) {
            this.o = n;
            this.w = n2;
            int n3 = this.h();
            int n4 = n3 + 6;
            this.b();
            GlStateManagerInvoker.disableLighting();
            GlStateManagerInvoker.disableFog();
            Tessellator tessellator = TessellatorInvoker.getInstance();
            WorldRenderer worldRenderer = TessellatorInvoker.getWorldRenderer(tessellator);
            int n5 = this.i + this.r / 2 - this.d() / 2 + 2;
            int n6 = this.l + 4 - (int)this.p;
            if (this.e) {
                this.a(n5, n6, tessellator);
            }
            this.a(n5, n6, n, n2);
            GlStateManagerInvoker.disableDepth();
            GlStateManagerInvoker.enableBlend();
            GlStateManagerInvoker.b(770, 771, 0, 1);
            GlStateManagerInvoker.C();
            GlStateManagerInvoker.shadeModel(7425);
            GlStateManagerInvoker.disableTexture2D();
            int n7 = this.c();
            int n8 = (this.t - this.l) * (this.t - this.l) / this.e();
            n8 = MathHelper.a(n8, 32, this.t - this.l - 8);
            int n9 = (int)this.p * (this.t - this.l - n8) / n7 + this.l;
            if (n9 < this.l) {
                n9 = this.l;
            }
            WorldRendererInvoker.begin(worldRenderer, 7, DefaultVertexFormats.POSITION_TEX_COLOR);
            WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, n3, this.t, 0.0), 0.0, 1.0), 0, 0, 0, 255));
            WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, n4, this.t, 0.0), 1.0, 1.0), 0, 0, 0, 255));
            WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, n4, this.l, 0.0), 1.0, 0.0), 0, 0, 0, 255));
            WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, n3, this.l, 0.0), 0.0, 0.0), 0, 0, 0, 255));
            TessellatorInvoker.draw(tessellator);
            WorldRendererInvoker.begin(worldRenderer, 7, DefaultVertexFormats.POSITION_TEX_COLOR);
            WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, n3, n9 + n8, 0.0), 0.0, 1.0), 128, 128, 128, 255));
            WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, n4, n9 + n8, 0.0), 1.0, 1.0), 128, 128, 128, 255));
            WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, n4, n9, 0.0), 1.0, 0.0), 128, 128, 128, 255));
            WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, n3, n9, 0.0), 0.0, 0.0), 128, 128, 128, 255));
            TessellatorInvoker.draw(tessellator);
            WorldRendererInvoker.begin(worldRenderer, 7, DefaultVertexFormats.POSITION_TEX_COLOR);
            WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, n3, n9 + n8 - 1, 0.0), 0.0, 1.0), 192, 192, 192, 255));
            WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, n4 - 1, n9 + n8 - 1, 0.0), 1.0, 1.0), 192, 192, 192, 255));
            WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, n4 - 1, n9, 0.0), 1.0, 0.0), 192, 192, 192, 255));
            WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, n3, n9, 0.0), 0.0, 0.0), 192, 192, 192, 255));
            TessellatorInvoker.draw(tessellator);
            this.b(n, n2);
            GlStateManagerInvoker.enableTexture2D();
            GlStateManagerInvoker.shadeModel(7424);
            GlStateManagerInvoker.enableAlpha();
            GlStateManagerInvoker.disableBlend();
        }
    }

    protected abstract void a();

    protected void a(int n, int n2, int n3, int n4) {
        int n5 = this.f();
        Tessellator tessellator = TessellatorInvoker.getInstance();
        WorldRenderer worldRenderer = TessellatorInvoker.getWorldRenderer(tessellator);
        for (int i = 0; i < n5; ++i) {
            int n6 = n2 + i * this.m + this.u;
            int n7 = this.m - 4;
            if (n6 > this.t || n6 + n7 < this.l) {
                this.a(i, n, n6);
            }
            if (this.h && this.c(i)) {
                int n8 = this.i + this.r / 2 - this.d() / 2;
                int n9 = this.i + this.r / 2 + this.d() / 2;
                GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
                GlStateManagerInvoker.disableTexture2D();
                WorldRendererInvoker.begin(worldRenderer, 7, DefaultVertexFormats.POSITION_TEX_COLOR);
                WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, n8, n6 + n7 + 2, 0.0), 0.0, 1.0), 128, 128, 128, 255));
                WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, n9, n6 + n7 + 2, 0.0), 1.0, 1.0), 128, 128, 128, 255));
                WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, n9, n6 - 2, 0.0), 1.0, 0.0), 128, 128, 128, 255));
                WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, n8, n6 - 2, 0.0), 0.0, 0.0), 128, 128, 128, 255));
                WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, n8 + 1, n6 + n7 + 1, 0.0), 0.0, 1.0), 0, 0, 0, 255));
                WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, n9 - 1, n6 + n7 + 1, 0.0), 1.0, 1.0), 0, 0, 0, 255));
                WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, n9 - 1, n6 - 1, 0.0), 1.0, 0.0), 0, 0, 0, 255));
                WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, n8 + 1, n6 - 1, 0.0), 0.0, 0.0), 0, 0, 0, 255));
                TessellatorInvoker.draw(tessellator);
                GlStateManagerInvoker.enableTexture2D();
            }
            this.a(i, n, n6, n7, n3, n4);
        }
    }

    public void a(int n, int n2, float f) {
        if (this.d) {
            this.o = n;
            this.w = n2;
            this.a();
            int n3 = this.h();
            int n4 = n3 + 6;
            this.b();
            GlStateManagerInvoker.disableLighting();
            GlStateManagerInvoker.disableFog();
            Tessellator tessellator = TessellatorInvoker.getInstance();
            WorldRenderer worldRenderer = TessellatorInvoker.getWorldRenderer(tessellator);
            TextureManagerInvoker.bindTexture(MCInvoker.E(this.n), Gui.a);
            GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
            float f2 = 32.0f;
            WorldRendererInvoker.begin(worldRenderer, 7, DefaultVertexFormats.POSITION_TEX_COLOR);
            WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, this.i, this.t, 0.0), (float)this.i / f2, (float)(this.t + (int)this.p) / f2), 32, 32, 32, 255));
            WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, this.a, this.t, 0.0), (float)this.a / f2, (float)(this.t + (int)this.p) / f2), 32, 32, 32, 255));
            WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, this.a, this.l, 0.0), (float)this.a / f2, (float)(this.l + (int)this.p) / f2), 32, 32, 32, 255));
            WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, this.i, this.l, 0.0), (float)this.i / f2, (float)(this.l + (int)this.p) / f2), 32, 32, 32, 255));
            TessellatorInvoker.draw(tessellator);
            int n5 = this.i + this.r / 2 - this.d() / 2 + 2;
            int n6 = this.l + 4 - (int)this.p;
            if (this.e) {
                this.a(n5, n6, tessellator);
            }
            this.a(n5, n6, n, n2);
            GlStateManagerInvoker.disableDepth();
            int n7 = 4;
            this.c(0, this.l, 255, 255);
            this.c(this.t, this.k, 255, 255);
            GlStateManagerInvoker.enableBlend();
            GlStateManagerInvoker.b(770, 771, 0, 1);
            GlStateManagerInvoker.C();
            GlStateManagerInvoker.shadeModel(7425);
            GlStateManagerInvoker.disableTexture2D();
            WorldRendererInvoker.begin(worldRenderer, 7, DefaultVertexFormats.POSITION_TEX_COLOR);
            WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, this.i, this.l + n7, 0.0), 0.0, 1.0), 0, 0, 0, 0));
            WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, this.a, this.l + n7, 0.0), 1.0, 1.0), 0, 0, 0, 0));
            WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, this.a, this.l, 0.0), 1.0, 0.0), 0, 0, 0, 255));
            WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, this.i, this.l, 0.0), 0.0, 0.0), 0, 0, 0, 255));
            TessellatorInvoker.draw(tessellator);
            WorldRendererInvoker.begin(worldRenderer, 7, DefaultVertexFormats.POSITION_TEX_COLOR);
            WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, this.i, this.t, 0.0), 0.0, 1.0), 0, 0, 0, 255));
            WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, this.a, this.t, 0.0), 1.0, 1.0), 0, 0, 0, 255));
            WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, this.a, this.t - n7, 0.0), 1.0, 0.0), 0, 0, 0, 0));
            WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, this.i, this.t - n7, 0.0), 0.0, 0.0), 0, 0, 0, 0));
            TessellatorInvoker.draw(tessellator);
            int n8 = this.c();
            int n9 = (this.t - this.l) * (this.t - this.l) / this.e();
            n9 = MathHelper.a(n9, 32, this.t - this.l - 8);
            int n10 = (int)this.p * (this.t - this.l - n9) / n8 + this.l;
            if (n10 < this.l) {
                n10 = this.l;
            }
            WorldRendererInvoker.begin(worldRenderer, 7, DefaultVertexFormats.POSITION_TEX_COLOR);
            WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, n3, this.t, 0.0), 0.0, 1.0), 0, 0, 0, 255));
            WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, n4, this.t, 0.0), 1.0, 1.0), 0, 0, 0, 255));
            WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, n4, this.l, 0.0), 1.0, 0.0), 0, 0, 0, 255));
            WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, n3, this.l, 0.0), 0.0, 0.0), 0, 0, 0, 255));
            TessellatorInvoker.draw(tessellator);
            WorldRendererInvoker.begin(worldRenderer, 7, DefaultVertexFormats.POSITION_TEX_COLOR);
            WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, n3, n10 + n9, 0.0), 0.0, 1.0), 128, 128, 128, 255));
            WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, n4, n10 + n9, 0.0), 1.0, 1.0), 128, 128, 128, 255));
            WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, n4, n10, 0.0), 1.0, 0.0), 128, 128, 128, 255));
            WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, n3, n10, 0.0), 0.0, 0.0), 128, 128, 128, 255));
            TessellatorInvoker.draw(tessellator);
            WorldRendererInvoker.begin(worldRenderer, 7, DefaultVertexFormats.POSITION_TEX_COLOR);
            WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, n3, n10 + n9 - 1, 0.0), 0.0, 1.0), 192, 192, 192, 255));
            WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, n4 - 1, n10 + n9 - 1, 0.0), 1.0, 1.0), 192, 192, 192, 255));
            WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, n4 - 1, n10, 0.0), 1.0, 0.0), 192, 192, 192, 255));
            WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, n3, n10, 0.0), 0.0, 0.0), 192, 192, 192, 255));
            TessellatorInvoker.draw(tessellator);
            this.b(n, n2);
            GlStateManagerInvoker.enableTexture2D();
            GlStateManagerInvoker.shadeModel(7424);
            GlStateManagerInvoker.enableAlpha();
            GlStateManagerInvoker.disableBlend();
        }
    }

    public void b(boolean bl) {
        this.b = bl;
    }

    public void a(boolean bl) {
        this.h = bl;
    }

    protected abstract int f();

    public void g() {
        if (this.d(this.w)) {
            int n;
            int n2;
            int n3;
            int n4;
            if (MouseInvoker.c() == 0 && MouseInvoker.i() && this.w >= this.l && this.w <= this.t) {
                n4 = (this.r - this.d()) / 2;
                n3 = (this.r + this.d()) / 2;
                n2 = this.w - this.l - this.u + (int)this.p - 4;
                n = n2 / this.m;
                if (n < this.f() && this.o >= n4 && this.o <= n3) {
                    this.a(n, false, this.o, this.w);
                    this.v = n;
                } else if (this.o >= n4 && this.o <= n3) {
                    this.a(this.o - n4, this.w - this.l + (int)this.p - 4);
                }
            }
            if (MouseInvoker.c(0) && this.i()) {
                if (this.j == -1) {
                    n4 = 1;
                    if (this.w >= this.l && this.w <= this.t) {
                        int n5;
                        n3 = (this.r - this.d()) / 2;
                        n2 = (this.r + this.d()) / 2;
                        n = this.w - this.l - this.u + (int)this.p - 4;
                        int n6 = n / this.m;
                        if (n6 < this.f() && this.o >= n3 && this.o <= n2) {
                            n5 = n6 == this.v && MCInvoker.a() - this.g < 250L ? 1 : 0;
                            this.a(n6, n5 != 0, this.o, this.w);
                            this.v = n6;
                            this.g = MCInvoker.a();
                        } else if (this.o >= n3 && this.o <= n2) {
                            this.a(this.o - n3, this.w - this.l + (int)this.p - 4);
                            n4 = 0;
                        }
                        n5 = this.h();
                        int n7 = n5 + 6;
                        if (this.o >= n5 && this.o <= n7) {
                            this.s = -1.0f;
                            int n8 = this.c();
                            if (n8 < 1) {
                                n8 = 1;
                            }
                            int n9 = (int)((float)((this.t - this.l) * (this.t - this.l)) / (float)this.e());
                            n9 = MathHelper.a(n9, 32, this.t - this.l - 8);
                            this.s /= (float)(this.t - this.l - n9) / (float)n8;
                        } else {
                            this.s = 1.0f;
                        }
                        this.j = this.w;
                    } else {
                        this.j = -2;
                    }
                } else if (this.j >= 0) {
                    this.p -= (float)(this.w - this.j) * this.s;
                    this.j = this.w;
                }
            } else {
                this.j = -1;
            }
            n4 = MouseInvoker.h();
            n4 = -1;
            this.p += (float)(n4 * this.m / 2);
        }
    }

    public int k() {
        return (int)this.p;
    }

    protected void a(int n, int n2) {
    }

    public boolean i() {
        return this.b;
    }

    protected int e() {
        return this.f() * this.m + this.u;
    }

    protected int h() {
        return this.r / 2 + 124;
    }

    protected abstract boolean c(int var1);

    protected void a(boolean bl, int n) {
        this.e = bl;
        this.u = n;
        this.u = 0;
    }

    public void b(int n, int n2, int n3, int n4) {
        this.r = n;
        this.k = n2;
        this.l = n3;
        this.t = n4;
        this.i = 0;
        this.a = n;
    }

    protected abstract void a(int var1, int var2, int var3, int var4, int var5, int var6);

    protected void a(int n, int n2, int n3) {
    }
}

