/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package deobf;

import cc.novoline.invoke.BlockInvoker;
import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.EntityRendererInvoker;
import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.InventoryInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.ModuleInvoker;
import cc.novoline.invoke.PlayerInvoker;
import cc.novoline.invoke.StringPropertyInvoker;
import cc.novoline.invoke.TessellatorInvoker;
import cc.novoline.invoke.TextureManagerInvoker;
import cc.novoline.invoke.WorldRendererInvoker;
import cc.novoline.modules.visual.Animations;
import net.minecraft.client.Minecraft;
import net.Ba;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.Chams;
import net.DU;
import net.FT;
import net.G5;
import net.IBlockState;
import net.Item;
import net.ItemMap;
import net.Items;
import net.KM;
import net.KillAura;
import net.MD;
import net.Material;
import net.MathHelper;
import net.RenderManager;
import net.ResourceLocation;
import net.X;
import net.a3c_0;
import net.a5w_0;
import net.aDb;
import net.aUL;
import net.aUi;
import net.aVE;
import net.act_2;
import net.ail_0;
import net.aol_1;
import net.apl_1;
import net.apx_2;
import net.atH;
import net.auk_2;
import net.axx_1;
import net.ayy_0;
import net.db_0;
import net.dj_1;
import net.go_0;
import net.h9;
import net.j7_0;
import net.kj_2;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.renderer.WorldRenderer;
import net.minecraft.renderer.entity.RenderItem;
import net.minecraft.renderer.texture.TextureMap;
import net.ne_0;
import net.pt_1;
import net.qg_2;
import net.ti_1;
import net.wp_1;
import net.xh_1;
import net.ys_2;
import net.z3_0;
import org.lwjgl.opengl.GL11;

public class ItemRenderer {
    private int d = -1;
    private float h;
    public ItemStack i;
    private Minecraft g;
    private float k;
    private static String e = "CL_00000953";
    private int b = 0;
    private static ResourceLocation f;
    private RenderItem a;
    private static ResourceLocation j;
    private RenderManager c;

    private void a(EntityPlayerSP entityPlayerSP, float f) {
        float f2 = entityPlayerSP.prevRenderArmPitch + (entityPlayerSP.renderArmPitch - entityPlayerSP.prevRenderArmPitch) * f;
        float f3 = entityPlayerSP.prevRenderArmYaw + (entityPlayerSP.renderArmYaw - entityPlayerSP.prevRenderArmYaw) * f;
        GlStateManagerInvoker.b((entityPlayerSP.rotationPitch - f2) * 0.1f, 1.0f, 0.0f, 0.0f);
        GlStateManagerInvoker.b((entityPlayerSP.rotationYaw - f3) * 0.1f, 0.0f, 1.0f, 0.0f);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -1;
        char[] cArray = "l\u001ez(\u001a\u001d@\u001fk\u0010+".toCharArray();
        int n2 = 0;
        int n3 = 10;
        char[] cArray2 = cArray;
        int n4 = cArray.length;
        while (true) {
            n4 = n4;
            cArray2 = cArray2;
            int n5 = ++n2;
            int cfr_ignored_0 = n2 % 7;
            cArray2[n5] = (char)(cArray2[n5] ^ (n3 ^ 0x25));
            n3 = n3;
        }
    }

    private void f(float f) {
        if (!ys_2.aC() || a3c_0.S()) {
            TextureManagerInvoker.bindTexture(MCInvoker.E(this.g), j);
            Tessellator tessellator = TessellatorInvoker.getInstance();
            WorldRenderer worldRenderer = TessellatorInvoker.getWorldRenderer(tessellator);
            float f2 = PlayerInvoker.b(this.g.player, f);
            GlStateManagerInvoker.color(f2, f2, f2, 0.5f);
            GlStateManagerInvoker.enableBlend();
            GlStateManagerInvoker.b(770, 771, 1, 0);
            GlStateManagerInvoker.pushMatrix();
            float f3 = -this.g.player.rotationYaw / 64.0f;
            float f4 = this.g.player.rotationPitch / 64.0f;
            WorldRendererInvoker.begin(worldRenderer, 7, DefaultVertexFormats.a);
            WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, -1.0, -1.0, -0.5), 4.0f + f3, 4.0f + f4));
            WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, 1.0, -1.0, -0.5), 0.0f + f3, 4.0f + f4));
            WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, 1.0, 1.0, -0.5), 0.0f + f3, 0.0f + f4));
            WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, -1.0, 1.0, -0.5), 4.0f + f3, 0.0f + f4));
            TessellatorInvoker.draw(tessellator);
            GlStateManagerInvoker.popMatrix();
            GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
            GlStateManagerInvoker.disableBlend();
        }
    }

    private void a(AbstractClientPlayer abstractClientPlayer) {
        TextureManagerInvoker.bindTexture(MCInvoker.E(this.g), aUi.a(abstractClientPlayer));
        j7_0 j7_02 = FT.a(this.c, this.g.player);
        kj_2 kj_22 = (kj_2)j7_02;
        if (!aUi.p(abstractClientPlayer)) {
            GlStateManagerInvoker.A();
            this.a(kj_22);
            this.b(kj_22);
            GlStateManagerInvoker.b();
        }
    }

    private void a(float f, AbstractClientPlayer abstractClientPlayer) {
        GlStateManagerInvoker.b(-18.0f, 0.0f, 0.0f, 1.0f);
        GlStateManagerInvoker.b(-12.0f, 0.0f, 1.0f, 0.0f);
        GlStateManagerInvoker.b(-8.0f, 1.0f, 0.0f, 0.0f);
        GlStateManagerInvoker.translate(-0.9f, 0.2f, 0.0f);
        float f2 = (float)act_2.A(this.i) - ((float)aUi.i(abstractClientPlayer) - f + 1.0f);
        float f3 = f2 / 20.0f;
        f3 = (f3 * f3 + f3 * 2.0f) / 3.0f;
        if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        if (f3 > 0.1f) {
            float f4 = MathHelper.sin((f2 - 0.1f) * 1.3f);
            float f5 = f3 - 0.1f;
            float f6 = f4 * f5;
            GlStateManagerInvoker.translate(f6 * 0.0f, f6 * 0.01f, f6 * 0.0f);
        }
        GlStateManagerInvoker.translate(f3 * 0.0f, f3 * 0.0f, f3 * 0.1f);
        GlStateManagerInvoker.c(1.0f, 1.0f, 1.0f + f3 * 0.2f);
    }

    public ItemRenderer(Minecraft minecraft) {
        this.g = minecraft;
        this.c = MCInvoker.j(minecraft);
        this.a = MCInvoker.A(minecraft);
    }

    private void b(AbstractClientPlayer abstractClientPlayer, float f, float f2) {
        float f3 = -0.3f * MathHelper.sin(MathHelper.g(f2) * (float)Math.PI);
        float f4 = 0.4f * MathHelper.sin(MathHelper.g(f2) * (float)Math.PI * 2.0f);
        float f5 = -0.4f * MathHelper.sin(f2 * (float)Math.PI);
        GlStateManagerInvoker.translate(f3, f4, f5);
        GlStateManagerInvoker.translate(0.64000005f, -0.6f, -0.71999997f);
        GlStateManagerInvoker.translate(0.0f, f * -0.6f, 0.0f);
        GlStateManagerInvoker.b(45.0f, 0.0f, 1.0f, 0.0f);
        float f6 = MathHelper.sin(f2 * f2 * (float)Math.PI);
        float f7 = MathHelper.sin(MathHelper.g(f2) * (float)Math.PI);
        GlStateManagerInvoker.b(f7 * 70.0f, 0.0f, 1.0f, 0.0f);
        GlStateManagerInvoker.b(f6 * -20.0f, 0.0f, 0.0f, 1.0f);
        TextureManagerInvoker.bindTexture(MCInvoker.E(this.g), aUi.a(abstractClientPlayer));
        GlStateManagerInvoker.translate(-1.0f, 3.6f, 3.5f);
        GlStateManagerInvoker.b(120.0f, 0.0f, 0.0f, 1.0f);
        GlStateManagerInvoker.b(200.0f, 1.0f, 0.0f, 0.0f);
        GlStateManagerInvoker.b(-135.0f, 0.0f, 1.0f, 0.0f);
        GlStateManagerInvoker.c(1.0f, 1.0f, 1.0f);
        GlStateManagerInvoker.translate(5.6f, 0.0f, 0.0f);
        j7_0 j7_02 = FT.a(this.c, this.g.player);
        GlStateManagerInvoker.A();
        kj_2 kj_22 = (kj_2)j7_02;
        dj_1.b(kj_22, this.g.player);
        GlStateManagerInvoker.b();
    }

    private float d(float f) {
        float f2 = 1.0f - f / 45.0f + 0.1f;
        f2 = MathHelper.b(f2, 0.0f, 1.0f);
        f2 = -MathHelper.cos(f2 * (float)Math.PI) * 0.5f + 0.5f;
        return f2;
    }

    private void a(float f, KM kM) {
        TextureManagerInvoker.bindTexture(MCInvoker.E(this.g), TextureMap.r);
        Tessellator tessellator = TessellatorInvoker.getInstance();
        WorldRenderer worldRenderer = TessellatorInvoker.getWorldRenderer(tessellator);
        GlStateManagerInvoker.color(0.1f, 0.1f, 0.1f, 0.5f);
        GlStateManagerInvoker.pushMatrix();
        float f2 = qg_2.a(kM);
        float f3 = qg_2.m(kM);
        float f4 = qg_2.f(kM);
        float f5 = qg_2.k(kM);
        WorldRendererInvoker.begin(worldRenderer, 7, DefaultVertexFormats.a);
        WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, -1.0, -1.0, -0.5), f3, f5));
        WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, 1.0, -1.0, -0.5), f2, f5));
        WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, 1.0, 1.0, -0.5), f2, f4));
        WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, -1.0, 1.0, -0.5), f3, f4));
        TessellatorInvoker.draw(tessellator);
        GlStateManagerInvoker.popMatrix();
        GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
    }

    private void g(float f) {
        float f2 = -0.4f * MathHelper.sin(MathHelper.g(f) * (float)Math.PI);
        float f3 = 0.2f * MathHelper.sin(MathHelper.g(f) * (float)Math.PI * 2.0f);
        float f4 = -0.2f * MathHelper.sin(f * (float)Math.PI);
        GlStateManagerInvoker.translate(f2, f3, f4);
    }

    private void a(AbstractClientPlayer abstractClientPlayer, float f, float f2) {
        Chams chams = (Chams)ModuleInvoker.isEnable(ModuleRegistry.CHAMS);
        if (X.d(chams) && (StringPropertyInvoker.isMode(X.a(chams), G5.o) || X.h(chams)) && auk_2.a((Boolean)Ba.b(X.e(chams)))) {
            int n = aol_1.b(aUL.c(X.c(chams)));
            GL11.glPushAttrib((int)-1);
            GlStateManagerInvoker.enableBlend();
            GL11.glBlendFunc((int)770, (int)771);
            GlStateManagerInvoker.disableTexture2D();
            GlStateManagerInvoker.a(!auk_2.a((Boolean)Ba.b(X.f(chams))));
            GL11.glColor4f((float)((float)(n >> 16 & 0xFF) / 255.0f), (float)((float)(n >> 8 & 0xFF) / 255.0f), (float)((float)(n & 0xFF) / 255.0f), (float)MathInvoker.b(0.11764706f, X.k(chams) / 255.0f));
            OpenGlHelper.a(apl_1.ab, 240.0f, 240.0f);
            GlStateManagerInvoker.disableDepth();
            this.b(abstractClientPlayer, f, f2);
            GlStateManagerInvoker.b(!auk_2.a((Boolean)Ba.b(X.f(chams))));
            GlStateManagerInvoker.enableTexture2D();
            GlStateManagerInvoker.disableBlend();
            GlStateManagerInvoker.enableDepth();
            GL11.glPopAttrib();
        } else {
            this.b(abstractClientPlayer, f, f2);
        }
    }

    public void b() {
        this.h = 0.0f;
    }

    public void a() {
        this.k = this.h;
        EntityPlayerSP entityPlayerSP = this.g.player;
        ItemStack itemStack = InventoryInvoker.g(entityPlayerSP.inventory);
        if (this.i != null) {
            if (!act_2.b(this.i, itemStack) && ayy_0.d(ail_0.aA)) {
                boolean bl = aDb.e(act_2.k(this.i), ail_0.aA, new Object[]{this.i, itemStack, auk_2.b(this.d != entityPlayerSP.inventory.a)});
                this.i = itemStack;
                this.d = entityPlayerSP.inventory.a;
                return;
            }
        } else if (this.i == null) {
            // empty if block
        }
        float f = 0.4f;
        float f2 = 0.0f;
        float f3 = MathHelper.b(f2 - this.h, -f, f);
        this.h += f3;
        if (this.h < 0.1f) {
            if (ys_2.aC()) {
                a3c_0.a(itemStack);
            }
            this.i = itemStack;
            this.d = entityPlayerSP.inventory.a;
        }
    }

    private void a(kj_2 kj_22) {
        GlStateManagerInvoker.pushMatrix();
        GlStateManagerInvoker.b(54.0f, 0.0f, 1.0f, 0.0f);
        GlStateManagerInvoker.b(64.0f, 1.0f, 0.0f, 0.0f);
        GlStateManagerInvoker.b(-62.0f, 0.0f, 0.0f, 1.0f);
        GlStateManagerInvoker.translate(0.25f, -0.85f, 0.75f);
        dj_1.b(kj_22, this.g.player);
        GlStateManagerInvoker.popMatrix();
    }

    private void a(float f, float f2) {
        GlStateManagerInvoker.pushMatrix();
        GlStateManagerInvoker.b(f, 1.0f, 0.0f, 0.0f);
        GlStateManagerInvoker.b(f2, 0.0f, 1.0f, 0.0f);
        ne_0.a();
        GlStateManagerInvoker.popMatrix();
    }

    private void b(kj_2 kj_22) {
        GlStateManagerInvoker.pushMatrix();
        GlStateManagerInvoker.b(92.0f, 0.0f, 1.0f, 0.0f);
        GlStateManagerInvoker.b(45.0f, 1.0f, 0.0f, 0.0f);
        GlStateManagerInvoker.b(41.0f, 0.0f, 0.0f, 1.0f);
        GlStateManagerInvoker.translate(-0.3f, -1.1f, 0.45f);
        dj_1.a(kj_22, this.g.player);
        GlStateManagerInvoker.popMatrix();
    }

    private void b(float f, float f2) {
        GlStateManagerInvoker.translate(0.56f, -0.52f, -0.71999997f);
        GlStateManagerInvoker.translate(0.0f, f * -0.6f, 0.0f);
        GlStateManagerInvoker.b(45.0f, 0.0f, 1.0f, 0.0f);
        float f3 = MathHelper.sin(f2 * f2 * (float)Math.PI);
        float f4 = MathHelper.sin(MathHelper.g(f2) * (float)Math.PI);
        GlStateManagerInvoker.b(f3 * -20.0f, 0.0f, 1.0f, 0.0f);
        GlStateManagerInvoker.b(f4 * -20.0f, 0.0f, 0.0f, 1.0f);
        GlStateManagerInvoker.b(f4 * -80.0f, 1.0f, 0.0f, 0.0f);
        GlStateManagerInvoker.c(0.4f, 0.4f, 0.4f);
    }

    private boolean a(Block block) {
        return BlocksInvoker.m(block) == a5w_0.TRANSLUCENT;
    }

    private void a(AbstractClientPlayer abstractClientPlayer, float f, float f2, float f3) {
        float f4 = -0.4f * MathHelper.sin(MathHelper.g(f3) * (float)Math.PI);
        float f5 = 0.2f * MathHelper.sin(MathHelper.g(f3) * (float)Math.PI * 2.0f);
        float f6 = -0.2f * MathHelper.sin(f3 * (float)Math.PI);
        GlStateManagerInvoker.translate(f4, f5, f6);
        float f7 = this.d(f);
        GlStateManagerInvoker.translate(0.0f, 0.04f, -0.72f);
        GlStateManagerInvoker.translate(0.0f, f2 * -1.2f, 0.0f);
        GlStateManagerInvoker.translate(0.0f, f7 * -0.5f, 0.0f);
        GlStateManagerInvoker.b(90.0f, 0.0f, 1.0f, 0.0f);
        GlStateManagerInvoker.b(f7 * -85.0f, 0.0f, 0.0f, 1.0f);
        GlStateManagerInvoker.b(0.0f, 1.0f, 0.0f, 0.0f);
        this.a(abstractClientPlayer);
        float f8 = MathHelper.sin(f3 * f3 * (float)Math.PI);
        float f9 = MathHelper.sin(MathHelper.g(f3) * (float)Math.PI);
        GlStateManagerInvoker.b(f8 * -20.0f, 0.0f, 1.0f, 0.0f);
        GlStateManagerInvoker.b(f9 * -20.0f, 0.0f, 0.0f, 1.0f);
        GlStateManagerInvoker.b(f9 * -80.0f, 1.0f, 0.0f, 0.0f);
        GlStateManagerInvoker.c(0.38f, 0.38f, 0.38f);
        GlStateManagerInvoker.b(90.0f, 0.0f, 1.0f, 0.0f);
        GlStateManagerInvoker.b(180.0f, 0.0f, 0.0f, 1.0f);
        GlStateManagerInvoker.b(0.0f, 1.0f, 0.0f, 0.0f);
        GlStateManagerInvoker.translate(-1.0f, -1.0f, 0.0f);
        GlStateManagerInvoker.c(0.015625f, 0.015625f, 0.015625f);
        TextureManagerInvoker.bindTexture(MCInvoker.E(this.g), ItemRenderer.f);
        Tessellator tessellator = TessellatorInvoker.getInstance();
        WorldRenderer worldRenderer = TessellatorInvoker.getWorldRenderer(tessellator);
        GL11.glNormal3f((float)0.0f, (float)0.0f, (float)-1.0f);
        WorldRendererInvoker.begin(worldRenderer, 7, DefaultVertexFormats.a);
        WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, -7.0, 135.0, 0.0), 0.0, 1.0));
        WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, 135.0, 135.0, 0.0), 1.0, 1.0));
        WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, 135.0, -7.0, 0.0), 1.0, 0.0));
        WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, -7.0, -7.0, 0.0), 0.0, 0.0));
        TessellatorInvoker.draw(tessellator);
        wp_1 wp_12 = pt_1.a(Items.filled_map, this.i, this.g.world);
        apx_2.a(EntityRendererInvoker.a(this.g.entityRenderer), wp_12, false);
    }

    private void a(AbstractClientPlayer abstractClientPlayer, float f) {
        float f2 = (float)aUi.i(abstractClientPlayer) - f + 1.0f;
        float f3 = f2 / (float)act_2.A(this.i);
        float f4 = MathHelper.d(MathHelper.cos(f2 / 4.0f * (float)Math.PI) * 0.1f);
        if (f3 >= 0.8f) {
            f4 = 0.0f;
        }
        GlStateManagerInvoker.translate(0.0f, f4, 0.0f);
        float f5 = 1.0f - (float)MathInvoker.b((double)f3, 27.0);
        GlStateManagerInvoker.translate(f5 * 0.6f, f5 * -0.5f, f5 * 0.0f);
        GlStateManagerInvoker.b(f5 * 90.0f, 0.0f, 1.0f, 0.0f);
        GlStateManagerInvoker.b(f5 * 10.0f, 1.0f, 0.0f, 0.0f);
        GlStateManagerInvoker.b(f5 * 30.0f, 0.0f, 0.0f, 1.0f);
    }

    public void a(EntityLivingBase entityLivingBase, ItemStack itemStack, go_0 go_02) {
        Item item = act_2.k(itemStack);
        Block block = BlocksInvoker.a(item);
        GlStateManagerInvoker.pushMatrix();
        if (DU.a(this.a, itemStack)) {
            GlStateManagerInvoker.c(2.0f, 2.0f, 2.0f);
            if (!(!this.a(block) || ys_2.aC() && aVE.a4)) {
                GlStateManagerInvoker.c(false);
            }
        } else {
            Animations animations = (Animations)ModuleInvoker.isEnable(ModuleRegistry.ANIMATIONS);
            if (z3_0.g(animations)) {
                double d = 1.0 - db_0.b((Double)MD.b(z3_0.a(animations)));
                GlStateManagerInvoker.b(d, d, d);
            }
        }
        DU.a(this.a, itemStack, entityLivingBase, go_02);
        if (this.a(block)) {
            GlStateManagerInvoker.c(true);
        }
        GlStateManagerInvoker.popMatrix();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void a(Animations animations, float f, float f2, float f3) {
        if (z3_0.e(animations)) {
            GL11.glRotated((double)this.b, (double)0.0, (double)0.0, (double)1.0);
        }
        String string = (String)StringPropertyInvoker.b(z3_0.f(animations));
        int n = -1;
        switch (string.hashCode()) {
            case 77476110: {
                if (!string.equals(G5.l)) return;
                return;
            }
            case -1808503203: {
                if (!string.equals(G5.h)) return;
                return;
            }
            case 48570: {
                if (!string.equals(G5.j)) return;
                return;
            }
            case -1807907582: {
                if (!string.equals(G5.k)) return;
                return;
            }
            case 80294106: {
                if (!string.equals(G5.d)) return;
                return;
            }
            case 80294102: {
                if (!string.equals(G5.e)) return;
                return;
            }
            case 80307556: {
                if (!string.equals(G5.n)) return;
                return;
            }
            case -1805854619: {
                if (!string.equals(G5.c)) return;
                return;
            }
            case 80301790: {
                if (!string.equals(G5.f)) return;
                return;
            }
            case -1814666802: {
                if (!string.equals(G5.a)) return;
                return;
            }
            case 79882757: {
                if (!string.equals(G5.g)) return;
                return;
            }
            case 79973777: {
                if (!string.equals(G5.u)) return;
                return;
            }
            case -672251180: {
                if (!string.equals(G5.q)) return;
                return;
            }
            case -1354722902: {
                if (!string.equals(G5.p)) return;
                return;
            }
            case -352259601: {
                if (!string.equals(G5.b)) return;
                return;
            }
            case -1943403498: {
                if (!string.equals(G5.t)) return;
                return;
            }
        }
    }

    private void b(float f) {
        Tessellator tessellator = TessellatorInvoker.getInstance();
        WorldRenderer worldRenderer = TessellatorInvoker.getWorldRenderer(tessellator);
        GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 0.9f);
        GlStateManagerInvoker.depthFunc(519);
        GlStateManagerInvoker.c(false);
        GlStateManagerInvoker.enableBlend();
        GlStateManagerInvoker.b(770, 771, 1, 0);
        float f2 = 1.0f;
        int n = 0;
        while (true) {
            GlStateManagerInvoker.pushMatrix();
            KM kM = h9.b(MCInvoker.f(this.g), G5.i);
            TextureManagerInvoker.bindTexture(MCInvoker.E(this.g), TextureMap.r);
            float f3 = qg_2.a(kM);
            float f4 = qg_2.m(kM);
            float f5 = qg_2.f(kM);
            float f6 = qg_2.k(kM);
            float f7 = (0.0f - f2) / 2.0f;
            float f8 = f7 + f2;
            float f9 = 0.0f - f2 / 2.0f;
            float f10 = f9 + f2;
            float f11 = -0.5f;
            GlStateManagerInvoker.translate((float)(-(n * 2 - 1)) * 0.24f, -0.3f, 0.0f);
            GlStateManagerInvoker.b((float)(n * 2 - 1) * 10.0f, 0.0f, 1.0f, 0.0f);
            WorldRendererInvoker.begin(worldRenderer, 7, DefaultVertexFormats.a);
            WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, f7, f9, f11), f4, f6));
            WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, f8, f9, f11), f3, f6));
            WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, f8, f10, f11), f3, f5));
            WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, f7, f10, f11), f4, f5));
            TessellatorInvoker.draw(tessellator);
            GlStateManagerInvoker.popMatrix();
            ++n;
        }
    }

    public void c() {
        this.h = 0.0f;
    }

    private void b(AbstractClientPlayer abstractClientPlayer) {
        int n = BlockInvoker.a(this.g.world, new BlockPos(abstractClientPlayer.posX, abstractClientPlayer.posY + (double)aUi.h(abstractClientPlayer), abstractClientPlayer.posZ), 0);
        if (ys_2.I()) {
            n = xh_1.a(MCInvoker.v(this.g), n);
        }
        float f = n & 0xFFFF;
        float f2 = n >> 16;
        OpenGlHelper.a(apl_1.ab, f, f2);
    }

    public void e(float f) {
        GlStateManagerInvoker.C();
        if (PlayerInvoker.am(this.g.player)) {
            BlockInvoker.getMaterial(this.g.world, new BlockPos(this.g.player));
            new BlockPos(this.g.player);
            EntityPlayerSP entityPlayerSP = this.g.player;
            int n = 0;
            while (true) {
                double d = entityPlayerSP.posX + (double)(((float)(n % 2) - 0.5f) * entityPlayerSP.width * 0.8f);
                double d2 = entityPlayerSP.posY + (double)(((float)((n >> 1) % 2) - 0.5f) * 0.1f);
                double d3 = entityPlayerSP.posZ + (double)(((float)((n >> 2) % 2) - 0.5f) * entityPlayerSP.width * 0.8f);
                BlockPos blockPos = new BlockPos(d, d2 + (double)PlayerInvoker.X(entityPlayerSP), d3);
                IBlockState iBlockState = BlockInvoker.getMaterial(this.g.world, blockPos);
                if (BlocksInvoker.d(BlockStateInvoker.getBlock(iBlockState))) {
                    // empty if block
                }
                ++n;
            }
        }
        if (!PlayerInvoker.B(this.g.player)) {
            if (PlayerInvoker.a(this.g.player, Material.M) && !aDb.b(ail_0.aq, new Object[]{this.g.player, axx_1.a(f)})) {
                this.f(f);
            }
            if (PlayerInvoker.t(this.g.player) && !aDb.b(ail_0.bU, new Object[]{this.g.player, axx_1.a(f)})) {
                this.b(f);
            }
        }
        GlStateManagerInvoker.enableAlpha();
    }

    private void a(float f) {
        GlStateManagerInvoker.translate(-0.5f, f, 0.0f);
        GlStateManagerInvoker.b(30.0f, 0.0f, 1.0f, 0.0f);
        GlStateManagerInvoker.b(-80.0f, 1.0f, 0.0f, 0.0f);
        GlStateManagerInvoker.b(60.0f, 0.0f, 1.0f, 0.0f);
    }

    public void c(float f) {
        Animations animations = (Animations)ModuleInvoker.isEnable(ModuleRegistry.ANIMATIONS);
        float f2 = z3_0.g(animations) ? 0.8f + z3_0.b(animations) / 100.0f : 1.0f;
        float f3 = f2 - (this.k + (this.h - this.k) * f);
        EntityPlayerSP entityPlayerSP = this.g.player;
        float f4 = PlayerInvoker.d(entityPlayerSP, f);
        float f5 = entityPlayerSP.prevRotationPitch + (entityPlayerSP.rotationPitch - entityPlayerSP.prevRotationPitch) * f;
        float f6 = entityPlayerSP.prevRotationYaw + (entityPlayerSP.rotationYaw - entityPlayerSP.prevRotationYaw) * f;
        float f7 = MathHelper.sin(MathHelper.g(f4) * (float)Math.PI);
        this.a(f5, f6);
        this.b(entityPlayerSP);
        this.a(entityPlayerSP, f);
        GlStateManagerInvoker.c();
        GlStateManagerInvoker.pushMatrix();
        ++this.b;
        if (this.i != null) {
            if (act_2.k(this.i) instanceof ItemMap) {
                this.a(entityPlayerSP, f5, f3, f4);
            } else if (PlayerInvoker.R(entityPlayerSP) > 0) {
                ti_1 ti_12 = act_2.m(this.i);
                switch (ti_12) {
                    case NONE: {
                        this.b(f3, 0.0f);
                        break;
                    }
                    case EAT: 
                    case DRINK: {
                        this.a((AbstractClientPlayer)entityPlayerSP, f);
                        this.b(f3, 0.0f);
                        break;
                    }
                    case BLOCK: {
                        if (z3_0.g(animations)) {
                            this.a(animations, f3, f4, f7);
                            break;
                        }
                        this.b(f3, 0.0f);
                        this.a(0.2f);
                        break;
                    }
                    case BOW: {
                        this.b(f3, 0.0f);
                        this.a(f, entityPlayerSP);
                    }
                }
            } else {
                KillAura killAura = (KillAura)ModuleInvoker.isEnable(ModuleRegistry.KILLAURA);
                if (atH.b(killAura)) {
                    if (z3_0.g(animations)) {
                        this.a(animations, f3, f4, f7);
                    } else {
                        this.b(f3, 0.0f);
                        this.a(0.2f);
                    }
                } else {
                    if (!z3_0.g(animations) || !StringPropertyInvoker.isMode(z3_0.c(animations), G5.r)) {
                        this.g(f4);
                    }
                    this.b(f3 - 0.05f, f4);
                }
            }
            this.a((EntityLivingBase)entityPlayerSP, this.i, go_0.FIRST_PERSON);
        } else if (!PlayerInvoker.ai(entityPlayerSP)) {
            this.a(entityPlayerSP, f3, f4);
        }
        GlStateManagerInvoker.popMatrix();
        GlStateManagerInvoker.y();
        ne_0.e();
    }
}

