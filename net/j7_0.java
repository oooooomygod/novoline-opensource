/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.FontRendererInvoker;
import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.ModuleInvoker;
import cc.novoline.invoke.StringPropertyInvoker;
import cc.novoline.invoke.TessellatorInvoker;
import cc.novoline.invoke.WorldRendererInvoker;
import deobf.DefaultVertexFormats;
import deobf.Entity;
import deobf.EntityPlayer;
import deobf.FontRenderer;
import deobf.MCInvoker;
import deobf.ModuleRegistry;
import deobf.Tessellator;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.renderer.texture.TextureMap;
import net.minecraft.renderer.WorldRenderer;
import java.util.Iterator;

import org.lwjgl.opengl.GL11;

/*
 * Renamed from net.j7
 */
public abstract class j7_0<T extends Entity> {
    protected RenderManager a;
    protected float c;
    protected float b = 1.0f;
    private static ResourceLocation d = new ResourceLocation(abf_0.c);

    private void c(Entity entity, double d, double d2, double d3, float f, float f2) {
        if (!ys_2.aC() || !aVE.cS) {
            GlStateManagerInvoker.enableBlend();
            GlStateManagerInvoker.b(770, 771);
            this.a.e.b(j7_0.d);
            World world = this.a();
            GlStateManagerInvoker.c(false);
            float f3 = this.c;
            if (entity instanceof nl_1) {
                nl_1 nl_12 = (nl_1)entity;
                f3 *= CG.u(nl_12);
                if (CG.q(nl_12)) {
                    f3 *= 0.5f;
                }
            }
            double d4 = entity.lastTickPosX + (entity.posX - entity.lastTickPosX) * (double)f2;
            double d5 = entity.lastTickPosY + (entity.posY - entity.lastTickPosY) * (double)f2;
            double d6 = entity.lastTickPosZ + (entity.posZ - entity.lastTickPosZ) * (double)f2;
            int n = MathHelper.floor_double(d4 - (double)f3);
            int n2 = MathHelper.floor_double(d4 + (double)f3);
            int n3 = MathHelper.floor_double(d5 - (double)f3);
            int n4 = MathHelper.floor_double(d5);
            int n5 = MathHelper.floor_double(d6 - (double)f3);
            int n6 = MathHelper.floor_double(d6 + (double)f3);
            double d7 = d - d4;
            double d8 = d2 - d5;
            double d9 = d3 - d6;
            Tessellator tessellator = TessellatorInvoker.getInstance();
            WorldRenderer worldRenderer = TessellatorInvoker.getWorldRenderer(tessellator);
            WorldRendererInvoker.begin(worldRenderer, 7, DefaultVertexFormats.POSITION_TEX_COLOR);
            Iterator iterator = OV.a(amv_2.a(new BlockPos(n, n3, n5), new BlockPos(n2, n4, n6)));
            while (dz_0.c(iterator)) {
                BlockPos blockPos = (BlockPos)dz_0.b(iterator);
                Block block = BlockStateInvoker.getBlock(aV8.q(world, amv_2.g(blockPos)));
                if (BlocksInvoker.y(block) == -1 || aV8.l(world, blockPos) <= 3) continue;
                this.a(block, d, d2, d3, blockPos, f, f3, d7, d8, d9);
            }
            TessellatorInvoker.draw(tessellator);
            GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
            GlStateManagerInvoker.disableBlend();
            GlStateManagerInvoker.c(true);
        }
    }

    private World a() {
        return this.a.o;
    }

    protected void a(T t, double d, double d2, double d3) {
        if (this.c(t)) {
            this.a(t, aBO.a(ayj_0.P(t)), d, d2, d3, 64);
        }
    }

    protected void a(T t, double d, double d2, double d3, String string, float f, double d4) {
        this.a(t, string, d, d2, d3, 64);
    }

    protected boolean c(T t) {
        return ayj_0.y(t) && ayj_0.j(t);
    }

    public void a(ResourceLocation resourceLocation) {
        this.a.e.b(resourceLocation);
    }

    protected j7_0(RenderManager renderManager) {
        this.a = renderManager;
    }

    public RenderManager c() {
        return this.a;
    }

    protected void a(T t, String string, double d, double d2, double d3, int n) {
        double d4 = ayj_0.a(t, this.a.r);
        if (d4 <= (double)(n * n)) {
            FontRenderer fontRenderer = this.b();
            float f = 1.6f;
            float f2 = 0.016666668f * f;
            GlStateManagerInvoker.pushMatrix();
            GlStateManagerInvoker.translate((float)d + 0.0f, (float)d2 + ((Entity)t).n + 0.5f, (float)d3);
            GL11.glNormal3f((float)0.0f, (float)1.0f, (float)0.0f);
            GlStateManagerInvoker.b(-this.a.l, 0.0f, 1.0f, 0.0f);
            GlStateManagerInvoker.b(this.a.b, 1.0f, 0.0f, 0.0f);
            GlStateManagerInvoker.c(-f2, -f2, f2);
            GlStateManagerInvoker.disableLighting();
            GlStateManagerInvoker.c(false);
            GlStateManagerInvoker.disableDepth();
            GlStateManagerInvoker.enableBlend();
            GlStateManagerInvoker.b(770, 771, 1, 0);
            Tessellator tessellator = TessellatorInvoker.getInstance();
            WorldRenderer worldRenderer = TessellatorInvoker.getWorldRenderer(tessellator);
            int n2 = 0;
            if (string.equals(abf_0.b)) {
                n2 = -10;
            }
            int n3 = FontRendererInvoker.a(fontRenderer, string) / 2;
            GlStateManagerInvoker.disableTexture2D();
            WorldRendererInvoker.begin(worldRenderer, 7, DefaultVertexFormats.d);
            WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.endVertex(worldRenderer, -n3 - 1, -1 + n2, 0.0), 0.0f, 0.0f, 0.0f, 0.25f));
            WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.endVertex(worldRenderer, -n3 - 1, 8 + n2, 0.0), 0.0f, 0.0f, 0.0f, 0.25f));
            WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.endVertex(worldRenderer, n3 + 1, 8 + n2, 0.0), 0.0f, 0.0f, 0.0f, 0.25f));
            WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.endVertex(worldRenderer, n3 + 1, -1 + n2, 0.0), 0.0f, 0.0f, 0.0f, 0.25f));
            TessellatorInvoker.draw(tessellator);
            GlStateManagerInvoker.enableTexture2D();
            FontRendererInvoker.a(fontRenderer, string, -FontRendererInvoker.a(fontRenderer, string) / 2, n2, 0x20FFFFFF);
            GlStateManagerInvoker.enableDepth();
            GlStateManagerInvoker.c(true);
            FontRendererInvoker.a(fontRenderer, string, -FontRendererInvoker.a(fontRenderer, string) / 2, n2, -1);
            GlStateManagerInvoker.D();
            GlStateManagerInvoker.disableBlend();
            GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
            GlStateManagerInvoker.popMatrix();
        }
    }

    protected boolean b(T t) {
        this.a(t);
        return false;
    }

    public boolean a(T t, ao7_0 ao7_02, double d, double d2, double d3) {
        rm_2 rm_22 = ayj_0.u(t);
        if (h__0.a(rm_22) || h__0.b(rm_22) == 0.0) {
            rm_22 = new rm_2(((Entity)t).posX - 2.0, ((Entity)t).posY - 2.0, ((Entity)t).posZ - 2.0, ((Entity)t).posX + 2.0, ((Entity)t).posY + 2.0, ((Entity)t).posZ + 2.0);
        }
        return ayj_0.e(t, d, d2, d3) && (((Entity)t).G || are_0.a(ao7_02, rm_22));
    }

    public static void a(rm_2 rm_22, double d, double d2, double d3) {
        GlStateManagerInvoker.disableTexture2D();
        Tessellator tessellator = TessellatorInvoker.getInstance();
        WorldRenderer worldRenderer = TessellatorInvoker.getWorldRenderer(tessellator);
        GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
        WorldRendererInvoker.b(worldRenderer, d, d2, d3);
        WorldRendererInvoker.begin(worldRenderer, 7, DefaultVertexFormats.l);
        WorldRendererInvoker.pos(WorldRendererInvoker.d(WorldRendererInvoker.endVertex(worldRenderer, rm_22.e, rm_22.c, rm_22.f), 0.0f, 0.0f, -1.0f));
        WorldRendererInvoker.pos(WorldRendererInvoker.d(WorldRendererInvoker.endVertex(worldRenderer, rm_22.b, rm_22.c, rm_22.f), 0.0f, 0.0f, -1.0f));
        WorldRendererInvoker.pos(WorldRendererInvoker.d(WorldRendererInvoker.endVertex(worldRenderer, rm_22.b, rm_22.a, rm_22.f), 0.0f, 0.0f, -1.0f));
        WorldRendererInvoker.pos(WorldRendererInvoker.d(WorldRendererInvoker.endVertex(worldRenderer, rm_22.e, rm_22.a, rm_22.f), 0.0f, 0.0f, -1.0f));
        WorldRendererInvoker.pos(WorldRendererInvoker.d(WorldRendererInvoker.endVertex(worldRenderer, rm_22.e, rm_22.a, rm_22.d), 0.0f, 0.0f, 1.0f));
        WorldRendererInvoker.pos(WorldRendererInvoker.d(WorldRendererInvoker.endVertex(worldRenderer, rm_22.b, rm_22.a, rm_22.d), 0.0f, 0.0f, 1.0f));
        WorldRendererInvoker.pos(WorldRendererInvoker.d(WorldRendererInvoker.endVertex(worldRenderer, rm_22.b, rm_22.c, rm_22.d), 0.0f, 0.0f, 1.0f));
        WorldRendererInvoker.pos(WorldRendererInvoker.d(WorldRendererInvoker.endVertex(worldRenderer, rm_22.e, rm_22.c, rm_22.d), 0.0f, 0.0f, 1.0f));
        WorldRendererInvoker.pos(WorldRendererInvoker.d(WorldRendererInvoker.endVertex(worldRenderer, rm_22.e, rm_22.a, rm_22.f), 0.0f, -1.0f, 0.0f));
        WorldRendererInvoker.pos(WorldRendererInvoker.d(WorldRendererInvoker.endVertex(worldRenderer, rm_22.b, rm_22.a, rm_22.f), 0.0f, -1.0f, 0.0f));
        WorldRendererInvoker.pos(WorldRendererInvoker.d(WorldRendererInvoker.endVertex(worldRenderer, rm_22.b, rm_22.a, rm_22.d), 0.0f, -1.0f, 0.0f));
        WorldRendererInvoker.pos(WorldRendererInvoker.d(WorldRendererInvoker.endVertex(worldRenderer, rm_22.e, rm_22.a, rm_22.d), 0.0f, -1.0f, 0.0f));
        WorldRendererInvoker.pos(WorldRendererInvoker.d(WorldRendererInvoker.endVertex(worldRenderer, rm_22.e, rm_22.c, rm_22.d), 0.0f, 1.0f, 0.0f));
        WorldRendererInvoker.pos(WorldRendererInvoker.d(WorldRendererInvoker.endVertex(worldRenderer, rm_22.b, rm_22.c, rm_22.d), 0.0f, 1.0f, 0.0f));
        WorldRendererInvoker.pos(WorldRendererInvoker.d(WorldRendererInvoker.endVertex(worldRenderer, rm_22.b, rm_22.c, rm_22.f), 0.0f, 1.0f, 0.0f));
        WorldRendererInvoker.pos(WorldRendererInvoker.d(WorldRendererInvoker.endVertex(worldRenderer, rm_22.e, rm_22.c, rm_22.f), 0.0f, 1.0f, 0.0f));
        WorldRendererInvoker.pos(WorldRendererInvoker.d(WorldRendererInvoker.endVertex(worldRenderer, rm_22.e, rm_22.a, rm_22.d), -1.0f, 0.0f, 0.0f));
        WorldRendererInvoker.pos(WorldRendererInvoker.d(WorldRendererInvoker.endVertex(worldRenderer, rm_22.e, rm_22.c, rm_22.d), -1.0f, 0.0f, 0.0f));
        WorldRendererInvoker.pos(WorldRendererInvoker.d(WorldRendererInvoker.endVertex(worldRenderer, rm_22.e, rm_22.c, rm_22.f), -1.0f, 0.0f, 0.0f));
        WorldRendererInvoker.pos(WorldRendererInvoker.d(WorldRendererInvoker.endVertex(worldRenderer, rm_22.e, rm_22.a, rm_22.f), -1.0f, 0.0f, 0.0f));
        WorldRendererInvoker.pos(WorldRendererInvoker.d(WorldRendererInvoker.endVertex(worldRenderer, rm_22.b, rm_22.a, rm_22.f), 1.0f, 0.0f, 0.0f));
        WorldRendererInvoker.pos(WorldRendererInvoker.d(WorldRendererInvoker.endVertex(worldRenderer, rm_22.b, rm_22.c, rm_22.f), 1.0f, 0.0f, 0.0f));
        WorldRendererInvoker.pos(WorldRendererInvoker.d(WorldRendererInvoker.endVertex(worldRenderer, rm_22.b, rm_22.c, rm_22.d), 1.0f, 0.0f, 0.0f));
        WorldRendererInvoker.pos(WorldRendererInvoker.d(WorldRendererInvoker.endVertex(worldRenderer, rm_22.b, rm_22.a, rm_22.d), 1.0f, 0.0f, 0.0f));
        TessellatorInvoker.draw(tessellator);
        WorldRendererInvoker.b(worldRenderer, 0.0, 0.0, 0.0);
        GlStateManagerInvoker.enableTexture2D();
    }

    public void a(Entity entity, double d, double d2, double d3, float f, float f2) {
        if (this.a.u != null) {
            if (this.a.u.p && this.c > 0.0f && !ayj_0.L(entity) && FT.d(this.a)) {
                double d4 = FT.a(this.a, entity.posX, entity.posY, entity.posZ);
                float f3 = (float)((1.0 - d4 / 256.0) * (double)this.b);
                Chams chams = (Chams)ModuleInvoker.isEnable(ModuleRegistry.CHAMS);
                Glow glow = (Glow)ModuleInvoker.isEnable(ModuleRegistry.GLOW);
                boolean bl = X.d(chams) && StringPropertyInvoker.isMode(X.a(chams), abf_0.e) && !ava_0.c(X.i(chams));
                boolean bl2 = qc_0.a(glow) && StringPropertyInvoker.isMode(qc_0.b(glow), abf_0.f) && !ava_0.c(qc_0.f(glow));
                if (!(!(f3 > 0.0f) || X.a(chams, entity) || qc_0.a(glow, entity) || aLF.e() && entity instanceof og_0)) {
                    this.c(entity, d, d2, d3, f3, f2);
                }
            }
            if (!(!ayj_0.A(entity) || entity instanceof EntityPlayer && a6w_0.l((EntityPlayer)entity))) {
                this.a(entity, d, d2, d3, f2);
            }
        }
    }

    protected abstract ResourceLocation a(T var1);

    private void a(Block block, double d, double d2, double d3, BlockPos blockPos, float f, float f2, double d4, double d5, double d6) {
        if (BlocksInvoker.p(block)) {
            Tessellator tessellator = TessellatorInvoker.getInstance();
            WorldRenderer worldRenderer = TessellatorInvoker.getWorldRenderer(tessellator);
            double d7 = ((double)f - (d2 - ((double)amv_2.h(blockPos) + d5)) / 2.0) * 0.5 * (double)aV8.i(this.a(), blockPos);
            if (d7 >= 0.0) {
                if (d7 > 1.0) {
                    d7 = 1.0;
                }
                double d8 = (double)amv_2.j(blockPos) + BlocksInvoker.B(block) + d4;
                double d9 = (double)amv_2.j(blockPos) + BlocksInvoker.a(block) + d4;
                double d10 = (double)amv_2.h(blockPos) + BlocksInvoker.j(block) + d5 + 0.015625;
                double d11 = (double)amv_2.i(blockPos) + BlocksInvoker.u(block) + d6;
                double d12 = (double)amv_2.i(blockPos) + BlocksInvoker.h(block) + d6;
                float f3 = (float)((d - d8) / 2.0 / (double)f2 + 0.5);
                float f4 = (float)((d - d9) / 2.0 / (double)f2 + 0.5);
                float f5 = (float)((d3 - d11) / 2.0 / (double)f2 + 0.5);
                float f6 = (float)((d3 - d12) / 2.0 / (double)f2 + 0.5);
                WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, d8, d10, d11), f3, f5), 1.0f, 1.0f, 1.0f, (float)d7));
                WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, d8, d10, d12), f3, f6), 1.0f, 1.0f, 1.0f, (float)d7));
                WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, d9, d10, d12), f4, f6), 1.0f, 1.0f, 1.0f, (float)d7));
                WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, d9, d10, d11), f4, f5), 1.0f, 1.0f, 1.0f, (float)d7));
            }
        }
    }

    public void b(T t, double d, double d2, double d3, float f, float f2) {
        if (!(t instanceof op_2)) {
            this.a(t, d, d2, d3);
        }
    }

    public FontRenderer b() {
        return FT.a(this.a);
    }

    private void a(Entity entity, double d, double d2, double d3, float f) {
        GlStateManagerInvoker.disableLighting();
        TextureMap textureMap = MCInvoker.f(MCInvoker.f());
        KM kM = h9.b(textureMap, abf_0.a);
        h9.b(textureMap, abf_0.d);
        GlStateManagerInvoker.pushMatrix();
        GlStateManagerInvoker.translate((float)d, (float)d2, (float)d3);
        float f2 = entity.width * 1.4f;
        GlStateManagerInvoker.c(f2, f2, f2);
        Tessellator tessellator = TessellatorInvoker.getInstance();
        WorldRenderer worldRenderer = TessellatorInvoker.getWorldRenderer(tessellator);
        float f3 = 0.5f;
        float f4 = 0.0f;
        float f5 = entity.n / f2;
        float f6 = (float)(entity.posY - ayj_0.u((Entity)entity).a);
        GlStateManagerInvoker.b(-this.a.l, 0.0f, 1.0f, 0.0f);
        GlStateManagerInvoker.translate(0.0f, 0.0f, -0.3f + (float)((int)f5) * 0.02f);
        GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
        float f7 = 0.0f;
        int n = 0;
        WorldRendererInvoker.begin(worldRenderer, 7, DefaultVertexFormats.a);
        while (f5 > 0.0f) {
            int cfr_ignored_0 = n % 2;
            KM kM2 = kM;
            this.a(TextureMap.r);
            float f8 = qg_2.a(kM2);
            float f9 = qg_2.f(kM2);
            float f10 = qg_2.m(kM2);
            float f11 = qg_2.k(kM2);
            int cfr_ignored_1 = n / 2 % 2;
            float f12 = f10;
            f10 = f8;
            f8 = f12;
            WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, f3 - f4, 0.0f - f6, f7), f10, f11));
            WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, -f3 - f4, 0.0f - f6, f7), f8, f11));
            WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, -f3 - f4, 1.4f - f6, f7), f8, f9));
            WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, f3 - f4, 1.4f - f6, f7), f10, f9));
            f5 -= 0.45f;
            f6 -= 0.45f;
            f3 *= 0.9f;
            f7 += 0.03f;
            ++n;
        }
        TessellatorInvoker.draw(tessellator);
        GlStateManagerInvoker.popMatrix();
        GlStateManagerInvoker.D();
    }
}

