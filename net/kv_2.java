/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package net;

import cc.novoline.invoke.EntityRendererInvoker;
import cc.novoline.invoke.FontRendererInvoker;
import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.ModelManagerInvoker;
import cc.novoline.invoke.TessellatorInvoker;
import cc.novoline.invoke.WorldRendererInvoker;
import deobf.BlockRendererDispatcher;
import deobf.DefaultVertexFormats;
import deobf.Entity;
import deobf.FontRenderer;
import net.minecraft.block.BlockPos;
import net.minecraft.item.ItemStack;
import deobf.MCInvoker;
import net.minecraft.renderer.entity.RenderItem;
import deobf.Tessellator;
import net.minecraft.renderer.texture.TextureMap;
import net.minecraft.renderer.WorldRenderer;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

/*
 * Renamed from net.kv
 */
public class kv_2
extends j7_0 {
    private RenderItem i;
    private static String e = "CL_00001002";
    private static ResourceLocation h;
    private Minecraft g = MCInvoker.f();
    private aRJ j;
    private aRJ f = new aRJ(aA3.a, aA3.c);

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -1;
        char[] cArray = "r|_F@Pt\u0000\u00000D".toCharArray();
        int n2 = 0;
        int n3 = 27;
        char[] cArray2 = cArray;
        int n4 = cArray.length;
        while (true) {
            n4 = n4;
            cArray2 = cArray2;
            int n5 = ++n2;
            int cfr_ignored_0 = n2 % 7;
            cArray2[n5] = (char)(cArray2[n5] ^ (n3 ^ 0x2A));
            n3 = n3;
        }
    }

    public void b(Entity entity, double d, double d2, double d3, float f, float f2) {
        this.a((no_2)entity, d, d2, d3, f, f2);
    }

    private void b(no_2 no_22) {
        ItemStack itemStack = yd_1.e(no_22);
        og_0 og_02 = new og_0(no_22.worldObj, 0.0, 0.0, 0.0, itemStack);
        Item item = act_2.k(aec_0.k(og_02));
        aec_0.k((og_0)og_02).a = 1;
        og_02.ap = 0.0f;
        GlStateManagerInvoker.pushMatrix();
        GlStateManagerInvoker.disableLighting();
        int n = yd_1.b(no_22);
        if (item instanceof ItemMap) {
            n = n % 4 * 2;
        }
        GlStateManagerInvoker.b((float)n * 360.0f / 8.0f, 0.0f, 0.0f, 1.0f);
        if (!aDb.a(ail_0.co, new Object[]{no_22, this})) {
            if (item instanceof ItemMap) {
                this.a.e.b(h);
                GlStateManagerInvoker.b(180.0f, 0.0f, 0.0f, 1.0f);
                float f = 0.0078125f;
                GlStateManagerInvoker.c(f, f, f);
                GlStateManagerInvoker.translate(-64.0f, -64.0f, 0.0f);
                wp_1 wp_12 = pt_1.a(Items.filled_map, aec_0.k(og_02), no_22.worldObj);
                GlStateManagerInvoker.translate(0.0f, 0.0f, -1.0f);
                apx_2.a(EntityRendererInvoker.a(this.g.entityRenderer), wp_12, true);
            } else {
                KM kM = null;
                if (item == Items.compass) {
                    kM = h9.b(MCInvoker.f(this.g), KH.E);
                    if (ys_2.aC()) {
                        ahf_1.a(MCInvoker.E(this.g), TextureMap.r);
                    } else {
                        MCInvoker.E(this.g).b(TextureMap.r);
                    }
                    if (kM instanceof KH) {
                        KH kH = (KH)kM;
                        double d = kH.H;
                        double d2 = kH.G;
                        kH.H = 0.0;
                        kH.G = 0.0;
                        q9_0.a(kH, no_22.worldObj, no_22.posX, no_22.posZ, MathHelper.a((float)(180 + SJ.j(no_22.aj) * 90)), false, true);
                        kH.H = d;
                        kH.G = d2;
                    } else {
                        kM = null;
                    }
                }
                GlStateManagerInvoker.c(0.5f, 0.5f, 0.5f);
                if (!DU.a(this.i, aec_0.k(og_02)) || item instanceof L0) {
                    GlStateManagerInvoker.b(180.0f, 0.0f, 1.0f, 0.0f);
                }
                GlStateManagerInvoker.G();
                ne_0.a();
                DU.a(this.i, aec_0.k(og_02), go_0.FIXED);
                ne_0.e();
                GlStateManagerInvoker.v();
                if (qg_2.d(kM) > 0) {
                    qg_2.n(kM);
                }
            }
        }
        GlStateManagerInvoker.D();
        GlStateManagerInvoker.popMatrix();
    }

    public void a(no_2 no_22, double d, double d2, double d3, float f, float f2) {
        GlStateManagerInvoker.pushMatrix();
        BlockPos blockPos = yd_1.c(no_22);
        double d4 = (double)amv_2.j(blockPos) - no_22.posX + d;
        double d5 = (double)amv_2.h(blockPos) - no_22.posY + d2;
        double d6 = (double)amv_2.i(blockPos) - no_22.posZ + d3;
        GlStateManagerInvoker.a(d4 + 0.5, d5 + 0.5, d6 + 0.5);
        GlStateManagerInvoker.b(180.0f - no_22.rotationYaw, 0.0f, 1.0f, 0.0f);
        this.a.e.b(TextureMap.r);
        BlockRendererDispatcher blockRendererDispatcher = MCInvoker.Y(this.g);
        ModelManager modelManager = ap__0.b(xd_0.a(blockRendererDispatcher));
        JE jE = yd_1.e(no_22) != null && act_2.k(yd_1.e(no_22)) == Items.filled_map ? ModelManagerInvoker.a(modelManager, this.j) : ModelManagerInvoker.a(modelManager, this.f);
        GlStateManagerInvoker.pushMatrix();
        GlStateManagerInvoker.translate(-0.5f, -0.5f, -0.5f);
        mq_1.a(xd_0.b(blockRendererDispatcher), jE, 1.0f, 1.0f, 1.0f, 1.0f);
        GlStateManagerInvoker.popMatrix();
        GlStateManagerInvoker.translate(0.0f, 0.0f, 0.4375f);
        this.b(no_22);
        GlStateManagerInvoker.popMatrix();
        this.a(no_22, d + (double)((float)SJ.k(no_22.aj) * 0.3f), d2 - 0.25, d3 + (double)((float)SJ.a(no_22.aj) * 0.3f));
    }

    protected void a(no_2 no_22, double d, double d2, double d3) {
        if (MCInvoker.c() && yd_1.e(no_22) != null && act_2.g(yd_1.e(no_22)) && this.a.p == no_22) {
            float f;
            float f2 = 1.6f;
            float f3 = 0.016666668f * f2;
            double d4 = yd_1.a(no_22, this.a.r);
            float f4 = f = yd_1.d(no_22) ? 32.0f : 64.0f;
            if (d4 < (double)(f * f)) {
                String string = act_2.w(yd_1.e(no_22));
                if (yd_1.d(no_22)) {
                    FontRenderer fontRenderer = this.b();
                    GlStateManagerInvoker.pushMatrix();
                    GlStateManagerInvoker.translate((float)d + 0.0f, (float)d2 + no_22.n + 0.5f, (float)d3);
                    GL11.glNormal3f((float)0.0f, (float)1.0f, (float)0.0f);
                    GlStateManagerInvoker.b(-this.a.l, 0.0f, 1.0f, 0.0f);
                    GlStateManagerInvoker.b(this.a.b, 1.0f, 0.0f, 0.0f);
                    GlStateManagerInvoker.c(-f3, -f3, f3);
                    GlStateManagerInvoker.disableLighting();
                    GlStateManagerInvoker.translate(0.0f, 0.25f / f3, 0.0f);
                    GlStateManagerInvoker.c(false);
                    GlStateManagerInvoker.enableBlend();
                    GlStateManagerInvoker.b(770, 771);
                    Tessellator tessellator = TessellatorInvoker.getInstance();
                    WorldRenderer worldRenderer = TessellatorInvoker.getWorldRenderer(tessellator);
                    int n = FontRendererInvoker.a(fontRenderer, string) / 2;
                    GlStateManagerInvoker.disableTexture2D();
                    WorldRendererInvoker.begin(worldRenderer, 7, DefaultVertexFormats.d);
                    WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.endVertex(worldRenderer, -n - 1, -1.0, 0.0), 0.0f, 0.0f, 0.0f, 0.25f));
                    WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.endVertex(worldRenderer, -n - 1, 8.0, 0.0), 0.0f, 0.0f, 0.0f, 0.25f));
                    WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.endVertex(worldRenderer, n + 1, 8.0, 0.0), 0.0f, 0.0f, 0.0f, 0.25f));
                    WorldRendererInvoker.pos(WorldRendererInvoker.a(WorldRendererInvoker.endVertex(worldRenderer, n + 1, -1.0, 0.0), 0.0f, 0.0f, 0.0f, 0.25f));
                    TessellatorInvoker.draw(tessellator);
                    GlStateManagerInvoker.enableTexture2D();
                    GlStateManagerInvoker.c(true);
                    FontRendererInvoker.a(fontRenderer, string, -FontRendererInvoker.a(fontRenderer, string) / 2, 0.0f, 0x20FFFFFF);
                    GlStateManagerInvoker.D();
                    GlStateManagerInvoker.disableBlend();
                    GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
                    GlStateManagerInvoker.popMatrix();
                } else {
                    this.a(no_22, string, d, d2, d3, 64);
                }
            }
        }
    }

    public kv_2(RenderManager renderManager, RenderItem renderItem) {
        super(renderManager);
        this.j = new aRJ(aA3.e, aA3.d);
        this.i = renderItem;
    }

    protected ResourceLocation a(no_2 no_22) {
        return null;
    }

    protected ResourceLocation a(Entity entity) {
        return this.a((no_2)entity);
    }

    protected void a(Entity entity, double d, double d2, double d3) {
        this.a((no_2)entity, d, d2, d3);
    }
}

