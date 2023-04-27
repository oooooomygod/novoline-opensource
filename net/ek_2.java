/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.TessellatorInvoker;
import cc.novoline.invoke.TextureManagerInvoker;
import cc.novoline.invoke.WorldRendererInvoker;
import deobf.DefaultVertexFormats;
import net.minecraft.renderer.texture.DynamicTexture;
import deobf.Tessellator;
import net.minecraft.renderer.WorldRenderer;
import java.util.Iterator;

/*
 * Renamed from net.ek
 */
class ek_2 {
    private wp_1 e;
    private DynamicTexture c;
    private int[] d;
    private ResourceLocation a;
    aGQ b;

    static void a(ek_2 ek_22, boolean bl) {
        ek_22.a(bl);
    }

    private void a() {
        int n = 0;
        while (true) {
            int n2;
            this.d[n] = (n2 = this.e.d[n] & 0xFF) / 4 == 0 ? (n + n / 128 & 1) * 8 + 16 << 24 : aAW.a(MapColor.u[n2 / 4], n2 & 3);
            ++n;
        }
    }

    ek_2(aGQ aGQ2, wp_1 wp_12, akh_1 akh_12) {
        this(aGQ2, wp_12);
    }

    private ek_2(aGQ aGQ2, wp_1 wp_12) {
        this.b = aGQ2;
        this.e = wp_12;
        this.c = new DynamicTexture(128, 128);
        this.d = arp_1.b(this.c);
        this.a = TextureManagerInvoker.getDynamicTextureLocation(aGQ.a(aGQ2), aL0.a(aL0.a(new StringBuilder(), asu_2.a), wp_12.b).toString(), this.c);
        a7r_0.a(this.d, 0);
    }

    private void a(boolean bl) {
        int n = 0;
        int n2 = 0;
        Tessellator tessellator = TessellatorInvoker.getInstance();
        WorldRenderer worldRenderer = TessellatorInvoker.getWorldRenderer(tessellator);
        float f = 0.0f;
        TextureManagerInvoker.bindTexture(aGQ.a(this.b), this.a);
        GlStateManagerInvoker.enableBlend();
        GlStateManagerInvoker.b(1, 771, 0, 1);
        GlStateManagerInvoker.C();
        WorldRendererInvoker.begin(worldRenderer, 7, DefaultVertexFormats.a);
        WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, (float)n + f, (float)(n2 + 128) - f, -0.01f), 0.0, 1.0));
        WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, (float)(n + 128) - f, (float)(n2 + 128) - f, -0.01f), 1.0, 1.0));
        WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, (float)(n + 128) - f, (float)n2 + f, -0.01f), 1.0, 0.0));
        WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, (float)n + f, (float)n2 + f, -0.01f), 0.0, 0.0));
        TessellatorInvoker.draw(tessellator);
        GlStateManagerInvoker.enableAlpha();
        GlStateManagerInvoker.disableBlend();
        TextureManagerInvoker.bindTexture(aGQ.a(this.b), aGQ.a());
        int n3 = 0;
        Iterator iterator = ms_0.a(this.e.e.values());
        while (dz_0.c(iterator)) {
            tc_2 tc_22 = (tc_2)dz_0.b(iterator);
            if (akw_1.a(tc_22) != 1) continue;
            GlStateManagerInvoker.pushMatrix();
            GlStateManagerInvoker.translate((float)n + (float)akw_1.d(tc_22) / 2.0f + 64.0f, (float)n2 + (float)akw_1.c(tc_22) / 2.0f + 64.0f, -0.02f);
            GlStateManagerInvoker.b((float)(akw_1.b(tc_22) * 360) / 16.0f, 0.0f, 0.0f, 1.0f);
            GlStateManagerInvoker.c(4.0f, 4.0f, 3.0f);
            GlStateManagerInvoker.translate(-0.125f, 0.125f, 0.0f);
            byte by = akw_1.a(tc_22);
            float f2 = (float)(by % 4) / 4.0f;
            float f3 = (float)(by / 4) / 4.0f;
            float f4 = (float)(by % 4 + 1) / 4.0f;
            float f5 = (float)(by / 4 + 1) / 4.0f;
            WorldRendererInvoker.begin(worldRenderer, 7, DefaultVertexFormats.a);
            WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, -1.0, 1.0, (float)n3 * -0.001f), f2, f3));
            WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, 1.0, 1.0, (float)n3 * -0.001f), f4, f3));
            WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, 1.0, -1.0, (float)n3 * -0.001f), f4, f5));
            WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, -1.0, -1.0, (float)n3 * -0.001f), f2, f5));
            TessellatorInvoker.draw(tessellator);
            GlStateManagerInvoker.popMatrix();
            ++n3;
        }
        GlStateManagerInvoker.pushMatrix();
        GlStateManagerInvoker.translate(0.0f, 0.0f, -0.04f);
        GlStateManagerInvoker.c(1.0f, 1.0f, 1.0f);
        GlStateManagerInvoker.popMatrix();
    }

    static ResourceLocation a(ek_2 ek_22) {
        return ek_22.a;
    }

    static void b(ek_2 ek_22) {
        ek_22.a();
    }
}

