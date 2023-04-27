/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.FontRendererInvoker;
import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.TessellatorInvoker;
import cc.novoline.invoke.TextureManagerInvoker;
import cc.novoline.invoke.WorldRendererInvoker;
import deobf.DefaultVertexFormats;
import deobf.MCInvoker;
import deobf.Tessellator;
import net.minecraft.renderer.WorldRenderer;
import java.util.List;

class a8V
extends aiy_1 {
    public int x;
    Rh y;

    @Override
    protected void a() {
    }

    private void a(int n, int n2, ResourceLocation resourceLocation) {
        int n3 = n + 5;
        this.y.b(n3 - 1, n3 + 32, n2 - 1, -2039584);
        this.y.b(n3 - 1, n3 + 32, n2 + 32, -6250336);
        this.y.a(n3 - 1, n2 - 1, n2 + 32, -2039584);
        this.y.a(n3 + 32, n2 - 1, n2 + 32, -6250336);
        GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
        TextureManagerInvoker.bindTexture(MCInvoker.E(this.n), resourceLocation);
        Tessellator tessellator = TessellatorInvoker.getInstance();
        WorldRenderer worldRenderer = TessellatorInvoker.getWorldRenderer(tessellator);
        WorldRendererInvoker.begin(worldRenderer, 7, DefaultVertexFormats.a);
        WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, n3, n2 + 32, 0.0), 0.0, 1.0));
        WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, n3 + 32, n2 + 32, 0.0), 1.0, 1.0));
        WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, n3 + 32, n2, 0.0), 1.0, 0.0));
        WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, n3, n2, 0.0), 0.0, 0.0));
        TessellatorInvoker.draw(tessellator);
    }

    @Override
    protected void a(int n, int n2, int n3, int n4, int n5, int n6) {
        aMJ aMJ2 = (aMJ)ListInvoker.get(Rh.a(), n);
        this.a(n2, n3, aMJ2.c);
        FontRendererInvoker.a(this.y.q, aMJ2.a, n2 + 32 + 10, n3 + 14, 0xFFFFFF);
    }

    @Override
    protected void a(int n, boolean bl, int n2, int n3) {
        this.x = n;
        ai9_0.a(this.y);
        hc_1.b(Rh.b(this.y), ((aMJ)ListInvoker.get((List)Rh.a(), (int)Rh.a((Rh)this.y).x)).b.toString());
    }

    @Override
    protected int f() {
        return ListInvoker.size(Rh.a());
    }

    public a8V(Rh rh) {
        this.y = rh;
        super(rh.t, rh.n, rh.f, 80, rh.f - 32, 38);
        this.x = -1;
    }

    @Override
    protected boolean c(int n) {
        return n == this.x;
    }
}

