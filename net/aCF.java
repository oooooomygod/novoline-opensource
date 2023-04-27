/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.FontRendererInvoker;
import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.IStreamInvoker;
import cc.novoline.invoke.TessellatorInvoker;
import cc.novoline.invoke.TextureManagerInvoker;
import cc.novoline.invoke.WorldRendererInvoker;
import deobf.DefaultVertexFormats;
import deobf.MCInvoker;
import deobf.Tessellator;
import net.minecraft.renderer.WorldRenderer;
import net.minecraft.client.Minecraft;

public class aCF {
    private Minecraft b;
    private static ResourceLocation c = new ResourceLocation(r1_0.b);
    private float d = 1.0f;
    private int a = 1;

    public void b() {
        if (IStreamInvoker.d(MCInvoker.a(this.b))) {
            this.d += 0.025f * (float)this.a;
            if (this.d < 0.0f) {
                this.a *= -1;
                this.d = 0.0f;
            } else if (this.d > 1.0f) {
                this.a *= -1;
                this.d = 1.0f;
            }
        } else {
            this.d = 1.0f;
            this.a = 1;
        }
    }

    public aCF(Minecraft minecraft) {
        this.b = minecraft;
    }

    public void a(int n, int n2) {
        if (IStreamInvoker.d(MCInvoker.a(this.b))) {
            GlStateManagerInvoker.enableBlend();
            int n3 = IStreamInvoker.a(MCInvoker.a(this.b));
            String string = aL0.c(aL0.a(new StringBuilder(), r1_0.a), n3).toString();
            int n4 = FontRendererInvoker.a(this.b.fontRendererObj, string);
            int n5 = n - n4 - 1;
            int n6 = n2 + 20 - 1;
            int n7 = n2 + 20 + FontRendererInvoker.d(this.b.fontRendererObj) - 1;
            GlStateManagerInvoker.disableTexture2D();
            Tessellator tessellator = TessellatorInvoker.getInstance();
            WorldRenderer worldRenderer = TessellatorInvoker.getWorldRenderer(tessellator);
            GlStateManagerInvoker.color(0.0f, 0.0f, 0.0f, (0.65f + 0.35000002f * this.d) / 2.0f);
            WorldRendererInvoker.begin(worldRenderer, 7, DefaultVertexFormats.k);
            WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, n5, n7, 0.0));
            WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, n, n7, 0.0));
            WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, n, n6, 0.0));
            WorldRendererInvoker.pos(WorldRendererInvoker.endVertex(worldRenderer, n5, n6, 0.0));
            TessellatorInvoker.draw(tessellator);
            GlStateManagerInvoker.enableTexture2D();
            FontRendererInvoker.a(this.b.fontRendererObj, string, n - n4, n2 + 20, 0xFFFFFF);
            this.a(n, n2, this.c(), 0);
            this.a(n, n2, this.a(), 17);
        }
    }

    private void a(int n, int n2, int n3, int n4) {
        GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 0.65f + 0.35000002f * this.d);
        TextureManagerInvoker.bindTexture(MCInvoker.E(this.b), c);
        float f = 150.0f;
        float f2 = 0.0f;
        float f3 = (float)n3 * 0.015625f;
        float f4 = 1.0f;
        float f5 = (float)(n3 + 16) * 0.015625f;
        Tessellator tessellator = TessellatorInvoker.getInstance();
        WorldRenderer worldRenderer = TessellatorInvoker.getWorldRenderer(tessellator);
        WorldRendererInvoker.begin(worldRenderer, 7, DefaultVertexFormats.a);
        WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, n - 16 - n4, n2 + 16, f), f2, f5));
        WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, n - n4, n2 + 16, f), f4, f5));
        WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, n - n4, n2, f), f4, f3));
        WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, n - 16 - n4, n2, f), f2, f3));
        TessellatorInvoker.draw(tessellator);
        GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
    }

    private int c() {
        return IStreamInvoker.e(MCInvoker.a(this.b)) ? 16 : 0;
    }

    private int a() {
        return IStreamInvoker.w(MCInvoker.a(this.b)) ? 48 : 32;
    }
}

