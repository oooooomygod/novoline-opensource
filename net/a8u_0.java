/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.TessellatorInvoker;
import cc.novoline.invoke.WorldRendererInvoker;
import deobf.DefaultVertexFormats;
import deobf.MCInvoker;
import deobf.Tessellator;
import net.minecraft.renderer.WorldRenderer;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.a8u
 */
public class a8u_0
extends aiy_1 {
    private NT x;

    public a8u_0(NT nT, int n, int n2, int n3, int n4, int n5) {
        super(MCInvoker.f(), n, n2, n3, n4, n5);
        this.x = nT;
    }

    @Override
    protected void a(int n, int n2, int n3, int n4, int n5, int n6) {
        ls_2.a(this.x, n, n2, n3, n4, n5, n6);
    }

    @Override
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
            int n5 = this.i + this.r / 2 - this.d() / 2 + 2;
            int n6 = this.l + 4 - (int)this.p;
            if (this.e) {
                this.a(n5, n6, tessellator);
            }
            this.a(n5, n6, n, n2);
            GlStateManagerInvoker.disableDepth();
            this.c(0, this.l, 255, 255);
            this.c(this.t, this.k, 255, 255);
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

    @Override
    protected void a(int n, boolean bl, int n2, int n3) {
        ls_2.a(this.x, n, bl, n2, n3);
    }

    public int b() {
        return this.w;
    }

    @Override
    protected int f() {
        return ls_2.d(this.x);
    }

    @Override
    protected int h() {
        return ls_2.a(this.x);
    }

    @Override
    protected void a() {
        ls_2.c(this.x);
    }

    @Override
    public void g() {
        super.g();
    }

    public int a() {
        return this.r;
    }

    @Override
    protected boolean c(int n) {
        return ls_2.a(this.x, n);
    }

    public int g() {
        return this.o;
    }

    @Override
    protected int e() {
        return ls_2.b(this.x);
    }
}

