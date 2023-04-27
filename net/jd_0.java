/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.TessellatorInvoker;
import cc.novoline.invoke.WorldRendererInvoker;
import deobf.DefaultVertexFormats;
import deobf.EnumFacing;
import deobf.OpenGlHelper;
import deobf.Tessellator;
import net.minecraft.block.BlockPos;
import net.minecraft.renderer.WorldRenderer;

/*
 * Renamed from net.jD
 */
public class jd_0
extends j7_0<nk_2> {
    private static ResourceLocation e = new ResourceLocation(bi_0.a);

    private void a(nk_2 nk_22, int n, int n2, int n3, int n4) {
        float f = (float)(-n) / 2.0f;
        float f2 = (float)(-n2) / 2.0f;
        float f3 = 0.5f;
        float f4 = 0.75f;
        float f5 = 0.8125f;
        float f6 = 0.0f;
        float f7 = 0.0625f;
        float f8 = 0.75f;
        float f9 = 0.8125f;
        float f10 = 0.001953125f;
        float f11 = 0.001953125f;
        float f12 = 0.7519531f;
        float f13 = 0.7519531f;
        float f14 = 0.0f;
        float f15 = 0.0625f;
        for (int i = 0; i < n / 16; ++i) {
            for (int j = 0; j < n2 / 16; ++j) {
                float f16 = f + (float)((i + 1) * 16);
                float f17 = f + (float)(i * 16);
                float f18 = f2 + (float)((j + 1) * 16);
                float f19 = f2 + (float)(j * 16);
                this.a(nk_22, (f16 + f17) / 2.0f, (f18 + f19) / 2.0f);
                float f20 = (float)(n3 + n - i * 16) / 256.0f;
                float f21 = (float)(n3 + n - (i + 1) * 16) / 256.0f;
                float f22 = (float)(n4 + n2 - j * 16) / 256.0f;
                float f23 = (float)(n4 + n2 - (j + 1) * 16) / 256.0f;
                Tessellator tessellator = TessellatorInvoker.getInstance();
                WorldRenderer worldRenderer = TessellatorInvoker.getWorldRenderer(tessellator);
                WorldRendererInvoker.begin(worldRenderer, 7, DefaultVertexFormats.i);
                WorldRendererInvoker.pos(WorldRendererInvoker.d(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, f16, f19, -f3), f21, f22), 0.0f, 0.0f, -1.0f));
                WorldRendererInvoker.pos(WorldRendererInvoker.d(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, f17, f19, -f3), f20, f22), 0.0f, 0.0f, -1.0f));
                WorldRendererInvoker.pos(WorldRendererInvoker.d(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, f17, f18, -f3), f20, f23), 0.0f, 0.0f, -1.0f));
                WorldRendererInvoker.pos(WorldRendererInvoker.d(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, f16, f18, -f3), f21, f23), 0.0f, 0.0f, -1.0f));
                WorldRendererInvoker.pos(WorldRendererInvoker.d(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, f16, f18, f3), f4, f6), 0.0f, 0.0f, 1.0f));
                WorldRendererInvoker.pos(WorldRendererInvoker.d(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, f17, f18, f3), f5, f6), 0.0f, 0.0f, 1.0f));
                WorldRendererInvoker.pos(WorldRendererInvoker.d(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, f17, f19, f3), f5, f7), 0.0f, 0.0f, 1.0f));
                WorldRendererInvoker.pos(WorldRendererInvoker.d(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, f16, f19, f3), f4, f7), 0.0f, 0.0f, 1.0f));
                WorldRendererInvoker.pos(WorldRendererInvoker.d(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, f16, f18, -f3), f8, f10), 0.0f, 1.0f, 0.0f));
                WorldRendererInvoker.pos(WorldRendererInvoker.d(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, f17, f18, -f3), f9, f10), 0.0f, 1.0f, 0.0f));
                WorldRendererInvoker.pos(WorldRendererInvoker.d(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, f17, f18, f3), f9, f11), 0.0f, 1.0f, 0.0f));
                WorldRendererInvoker.pos(WorldRendererInvoker.d(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, f16, f18, f3), f8, f11), 0.0f, 1.0f, 0.0f));
                WorldRendererInvoker.pos(WorldRendererInvoker.d(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, f16, f19, f3), f8, f10), 0.0f, -1.0f, 0.0f));
                WorldRendererInvoker.pos(WorldRendererInvoker.d(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, f17, f19, f3), f9, f10), 0.0f, -1.0f, 0.0f));
                WorldRendererInvoker.pos(WorldRendererInvoker.d(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, f17, f19, -f3), f9, f11), 0.0f, -1.0f, 0.0f));
                WorldRendererInvoker.pos(WorldRendererInvoker.d(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, f16, f19, -f3), f8, f11), 0.0f, -1.0f, 0.0f));
                WorldRendererInvoker.pos(WorldRendererInvoker.d(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, f16, f18, f3), f13, f14), -1.0f, 0.0f, 0.0f));
                WorldRendererInvoker.pos(WorldRendererInvoker.d(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, f16, f19, f3), f13, f15), -1.0f, 0.0f, 0.0f));
                WorldRendererInvoker.pos(WorldRendererInvoker.d(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, f16, f19, -f3), f12, f15), -1.0f, 0.0f, 0.0f));
                WorldRendererInvoker.pos(WorldRendererInvoker.d(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, f16, f18, -f3), f12, f14), -1.0f, 0.0f, 0.0f));
                WorldRendererInvoker.pos(WorldRendererInvoker.d(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, f17, f18, -f3), f13, f14), 1.0f, 0.0f, 0.0f));
                WorldRendererInvoker.pos(WorldRendererInvoker.d(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, f17, f19, -f3), f13, f15), 1.0f, 0.0f, 0.0f));
                WorldRendererInvoker.pos(WorldRendererInvoker.d(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, f17, f19, f3), f12, f15), 1.0f, 0.0f, 0.0f));
                WorldRendererInvoker.pos(WorldRendererInvoker.d(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, f17, f18, f3), f12, f14), 1.0f, 0.0f, 0.0f));
                TessellatorInvoker.draw(tessellator);
            }
        }
    }

    public jd_0(RenderManager renderManager) {
        super(renderManager);
    }

    private void a(nk_2 nk_22, float f, float f2) {
        int n = MathHelper.floor_double(nk_22.posX);
        int n2 = MathHelper.floor_double(nk_22.posY + (double)(f2 / 16.0f));
        int n3 = MathHelper.floor_double(nk_22.posZ);
        EnumFacing enumFacing = nk_22.aj;
        if (enumFacing == EnumFacing.NORTH) {
            n = MathHelper.floor_double(nk_22.posX + (double)(f / 16.0f));
        }
        if (enumFacing == EnumFacing.WEST) {
            n3 = MathHelper.floor_double(nk_22.posZ - (double)(f / 16.0f));
        }
        if (enumFacing == EnumFacing.SOUTH) {
            n = MathHelper.floor_double(nk_22.posX - (double)(f / 16.0f));
        }
        if (enumFacing == EnumFacing.EAST) {
            n3 = MathHelper.floor_double(nk_22.posZ + (double)(f / 16.0f));
        }
        int n4 = aV8.a(this.a.o, new BlockPos(n, n2, n3), 0);
        int n5 = n4 % 65536;
        int n6 = n4 / 65536;
        OpenGlHelper.a(apl_1.ab, n5, (float)n6);
        GlStateManagerInvoker.b(1.0f, 1.0f, 1.0f);
    }

    @Override
    protected ResourceLocation a(nk_2 nk_22) {
        return e;
    }

    public void a(nk_2 nk_22, double d, double d2, double d3, float f, float f2) {
        GlStateManagerInvoker.pushMatrix();
        GlStateManagerInvoker.a(d, d2, d3);
        GlStateManagerInvoker.b(180.0f - f, 0.0f, 1.0f, 0.0f);
        GlStateManagerInvoker.c();
        this.b(nk_22);
        y9 y92 = nk_22.am;
        float f3 = 0.0625f;
        GlStateManagerInvoker.c(f3, f3, f3);
        this.a(nk_22, y92.sizeX, y92.sizeY, y92.offsetX, y92.offsetY);
        GlStateManagerInvoker.y();
        GlStateManagerInvoker.popMatrix();
        super.b(nk_22, d, d2, d3, f, f2);
    }
}

