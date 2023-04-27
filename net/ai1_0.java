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
import net.minecraft.item.ItemStack;
import deobf.MCInvoker;
import deobf.Tessellator;
import net.minecraft.renderer.WorldRenderer;
import java.util.List;

/*
 * Renamed from net.ai1
 */
class ai1_0
extends aiy_1 {
    public int x;
    ro_0 y;

    @Override
    protected void a(int n, int n2, int n3, int n4, int n5, int n6) {
        MJ mJ = (MJ)ListInvoker.get(ro_0.b(), n);
        this.a(n2, n3, mJ.b, mJ.d);
        FontRendererInvoker.a(this.y.q, mJ.c, n2 + 18 + 5, n3 + 6, 0xFFFFFF);
    }

    public ai1_0(ro_0 ro_02) {
        this.y = ro_02;
        super(ro_02.t, ro_02.n, ro_02.f, 80, ro_02.f - 37, 24);
        this.x = -1;
    }

    @Override
    protected int f() {
        return ListInvoker.size(ro_0.b());
    }

    @Override
    protected void a() {
    }

    private void a(int n, int n2, Item item, int n3) {
        this.d(n + 1, n2 + 1);
        GlStateManagerInvoker.c();
        ne_0.f();
        DU.a(this.y.i, new ItemStack(item, 1, n3), n + 2, n2 + 2);
        ne_0.e();
        GlStateManagerInvoker.y();
    }

    private void d(int n, int n2) {
        this.d(n, n2, 0, 0);
    }

    @Override
    protected boolean c(int n) {
        return n == this.x;
    }

    @Override
    protected void a(int n, boolean bl, int n2, int n3) {
        this.x = n;
        aXK.a(this.y);
        hc_1.b(ro_0.b(this.y), ((MJ)ListInvoker.get((List)ro_0.b(), (int)ro_0.a((ro_0)this.y).x)).a);
    }

    private void d(int n, int n2, int n3, int n4) {
        GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
        TextureManagerInvoker.bindTexture(MCInvoker.E(this.n), Gui.e);
        Tessellator tessellator = TessellatorInvoker.getInstance();
        WorldRenderer worldRenderer = TessellatorInvoker.getWorldRenderer(tessellator);
        WorldRendererInvoker.begin(worldRenderer, 7, DefaultVertexFormats.a);
        WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, n, n2 + 18, ro_0.zLevel), (float)n3 * 0.0078125f, (float)(n4 + 18) * 0.0078125f));
        WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, n + 18, n2 + 18, ro_0.zLevel), (float)(n3 + 18) * 0.0078125f, (float)(n4 + 18) * 0.0078125f));
        WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, n + 18, n2, ro_0.zLevel), (float)(n3 + 18) * 0.0078125f, (float)n4 * 0.0078125f));
        WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, n, n2, ro_0.zLevel), (float)n3 * 0.0078125f, (float)n4 * 0.0078125f));
        TessellatorInvoker.draw(tessellator);
    }
}

