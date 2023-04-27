/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.util.vector.Matrix4f
 */
package net;

import cc.novoline.invoke.FramebufferInvoker;
import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.TessellatorInvoker;
import cc.novoline.invoke.WorldRendererInvoker;
import deobf.DefaultVertexFormats;
import deobf.Framebuffer;
import deobf.MCInvoker;
import deobf.Tessellator;
import net.minecraft.renderer.WorldRenderer;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import net.minecraft.client.Minecraft;
import org.lwjgl.util.vector.Matrix4f;

public class aF8 {
    private List<String> c;
    private Matrix4f a;
    private List<Integer> g;
    private atp_0 b;
    private List<Object> d = my_0.c();
    private List<Integer> h;
    public Framebuffer f;
    public Framebuffer e;

    public aF8(aI_ aI_2, String string, Framebuffer framebuffer, Framebuffer framebuffer2) throws IOException {
        this.c = my_0.c();
        this.h = my_0.c();
        this.g = my_0.c();
        this.b = new atp_0(aI_2, string);
        this.e = framebuffer;
        this.f = framebuffer2;
    }

    public atp_0 c() {
        return this.b;
    }

    private void a() {
        GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
        GlStateManagerInvoker.disableBlend();
        GlStateManagerInvoker.disableDepth();
        GlStateManagerInvoker.C();
        GlStateManagerInvoker.disableFog();
        GlStateManagerInvoker.disableLighting();
        GlStateManagerInvoker.m();
        GlStateManagerInvoker.enableTexture2D();
        GlStateManagerInvoker.k(0);
    }

    public void a(String string, Object object, int n, int n2) {
        ListInvoker.add(this.c, ListInvoker.size(this.c), string);
        ListInvoker.add(this.d, ListInvoker.size(this.d), object);
        ListInvoker.add(this.h, ListInvoker.size(this.h), P8.d(n));
        ListInvoker.add(this.g, ListInvoker.size(this.g), P8.d(n2));
    }

    public void a(Matrix4f matrix4f) {
        this.a = matrix4f;
    }

    public void b() {
        this.b.d();
    }

    public void a(float f) {
        this.a();
        FramebufferInvoker.unbindFramebuffer(this.e);
        float f2 = this.f.i;
        float f3 = this.f.c;
        GlStateManagerInvoker.viewport(0, 0, (int)f2, (int)f3);
        aak_2.a(this.b, aas_2.e, this.e);
        for (int i = 0; i < ListInvoker.size(this.d); ++i) {
            aak_2.a(this.b, (String)ListInvoker.get(this.c, i), ListInvoker.get(this.d, i));
            ul_2.a(aak_2.b(this.b, aL0.c(aL0.a(new StringBuilder(), aas_2.d), i).toString()), P8.b((Integer)ListInvoker.get(this.h, i)), P8.b((Integer)ListInvoker.get(this.g, i)));
        }
        ul_2.a(aak_2.b(this.b, aas_2.g), this.a);
        ul_2.a(aak_2.b(this.b, aas_2.c), this.e.i, this.e.c);
        ul_2.a(aak_2.b(this.b, aas_2.f), f2, f3);
        ul_2.a(aak_2.b(this.b, aas_2.b), f);
        Minecraft minecraft = MCInvoker.f();
        ul_2.a(aak_2.b(this.b, aas_2.a), minecraft.displayWidth, minecraft.displayHeight);
        aak_2.e(this.b);
        FramebufferInvoker.a(this.f);
        FramebufferInvoker.bindFramebuffer(this.f, false);
        GlStateManagerInvoker.c(false);
        GlStateManagerInvoker.a(true, true, true, true);
        Tessellator tessellator = TessellatorInvoker.getInstance();
        WorldRenderer worldRenderer = TessellatorInvoker.getWorldRenderer(tessellator);
        WorldRendererInvoker.begin(worldRenderer, 7, DefaultVertexFormats.d);
        WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.endVertex(worldRenderer, 0.0, f3, 500.0), 255, 255, 255, 255));
        WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.endVertex(worldRenderer, f2, f3, 500.0), 255, 255, 255, 255));
        WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.endVertex(worldRenderer, f2, 0.0, 500.0), 255, 255, 255, 255));
        WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.endVertex(worldRenderer, 0.0, 0.0, 500.0), 255, 255, 255, 255));
        TessellatorInvoker.draw(tessellator);
        GlStateManagerInvoker.c(true);
        GlStateManagerInvoker.a(true, true, true, true);
        aak_2.d(this.b);
        FramebufferInvoker.unbindFramebuffer(this.f);
        FramebufferInvoker.b(this.e);
        Iterator iterator = ListInvoker.iterator(this.d);
        while (dz_0.c(iterator)) {
            Object object = dz_0.b(iterator);
            if (!(object instanceof Framebuffer)) continue;
            FramebufferInvoker.b((Framebuffer)object);
        }
    }
}

