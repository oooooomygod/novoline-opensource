/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package net.minecraft.client.gui;

import cc.novoline.events.events.Render2DEvent;
import cc.novoline.invoke.BlockInvoker;
import cc.novoline.invoke.EntityRendererInvoker;
import cc.novoline.invoke.EventManagerInvoker;
import cc.novoline.invoke.FontRendererInvoker;
import cc.novoline.invoke.GameSettingsInvoker;
import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.InventoryInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.ModuleInvoker;
import cc.novoline.invoke.NovolineInvoker;
import cc.novoline.invoke.ObjectMouseOverInvoker;
import cc.novoline.invoke.PlayerControllerInvoker;
import cc.novoline.invoke.PlayerInvoker;
import cc.novoline.invoke.ProfilerInvoker;
import cc.novoline.invoke.ScaledResolutionInvoker;
import cc.novoline.invoke.TessellatorInvoker;
import cc.novoline.invoke.TextureManagerInvoker;
import cc.novoline.invoke.WorldRendererInvoker;
import cc.novoline.utils.fonts.api.FontRenderer;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import deobf.DefaultVertexFormats;
import deobf.EntityPlayer;
import cc.novoline.modules.visual.HUD;
import deobf.IChatComponent;
import net.minecraft.item.ItemStack;
import deobf.MCInvoker;
import deobf.ModuleRegistry;
import net.minecraft.renderer.entity.RenderItem;
import deobf.Tessellator;
import net.minecraft.renderer.texture.TextureMap;
import net.minecraft.renderer.WorldRenderer;
import java.util.Random;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class GuiIngame
extends Gui {
    private QY h;
    private Minecraft j;
    private int z;
    private double M;
    private static ResourceLocation y;
    public float t = 1.0f;
    private ao3_0 s;
    private double v;
    private acl_0 B;
    private int m;
    private boolean L;
    private int l;
    private int K;
    private String w;
    private int r = 0;
    private long F = 0L;
    private long C = 0L;
    private QK E;
    private static ResourceLocation J;
    private aCF D;
    private double g;
    private int q;
    private int i;
    public qs_0 A;
    private int f = 0;
    private String k;
    private static ResourceLocation p;
    private String o;
    private static String G;
    private RenderItem x;
    private sg_0 H;
    private ItemStack I;
    private Random u = new Random();
    private int N;
    private int n;

    public void c() {
        a9E.b(this.E);
    }

    protected boolean j() {
        if (this.j.gameSettings.ar && !PlayerInvoker.J(this.j.player) && !this.j.gameSettings.az) {
            return false;
        }
        if (PlayerControllerInvoker.a(this.j.playerController)) {
            if (this.j.E != null) {
                return true;
            }
            if (this.j.objectMouseOver != null && this.j.objectMouseOver.typeOfHit == net.I.BLOCK) {
                BlockPos blockPos = ObjectMouseOverInvoker.getBlockPos(this.j.objectMouseOver);
                return BlockInvoker.e(this.j.world, blockPos) instanceof rs_1;
            }
            return false;
        }
        return true;
    }

    private void lambda$renderGameOverlay$1(FutureTask futureTask) {
        if (X9.d(futureTask)) {
            X9.b(futureTask);
            ListInvoker.remove(aci_0.a(NovolineInvoker.i(MCInvoker.z(this.j))), futureTask);
            EventManagerInvoker.b(futureTask);
        } else {
            X9.a(futureTask);
        }
    }

    private void a(int n, int n2, int n3, float f, EntityPlayer entityPlayer) {
        ItemStack itemStack = entityPlayer.inventory.b[n];
        float f2 = (float)itemStack.g - f;
        if (f2 > 0.0f) {
            GlStateManagerInvoker.pushMatrix();
            float f3 = 1.0f + f2 / 5.0f;
            GlStateManagerInvoker.translate(n2 + 8, n3 + 12, 0.0f);
            GlStateManagerInvoker.c(1.0f / f3, (f3 + 1.0f) / 2.0f, 1.0f);
            GlStateManagerInvoker.translate(-(n2 + 8), -(n3 + 12), 0.0f);
        }
        DU.b(this.x, itemStack, n2, n3);
        if (f2 > 0.0f) {
            GlStateManagerInvoker.popMatrix();
        }
        GlStateManagerInvoker.m();
        DU.a(this.x, this.j.fontRendererObj, itemStack, n2, n3);
    }

    public void c(ScaledResolution scaledResolution) {
        aVY.a(this.D, ScaledResolutionInvoker.getScaledWidth(scaledResolution) - 10, 10);
    }

    private FontRenderer i() {
        return aE3.a;
    }

    public void a(String string) {
        this.a(I18n.format(aim_0.j, new Object[]{string}), true);
    }

    public void a(ao3_0 ao3_02) {
        this.s = ao3_02;
    }

    private void a(ScaledResolution scaledResolution) {
        GlStateManagerInvoker.disableDepth();
        GlStateManagerInvoker.c(false);
        GlStateManagerInvoker.b(770, 771, 1, 0);
        GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
        GlStateManagerInvoker.C();
        TextureManagerInvoker.bindTexture(MCInvoker.E(this.j), p);
        Tessellator tessellator = TessellatorInvoker.getInstance();
        WorldRenderer worldRenderer = TessellatorInvoker.getWorldRenderer(tessellator);
        WorldRendererInvoker.begin(worldRenderer, 7, DefaultVertexFormats.a);
        WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, 0.0, ScaledResolutionInvoker.i(scaledResolution), -90.0), 0.0, 1.0));
        WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, ScaledResolutionInvoker.getScaledWidth(scaledResolution), ScaledResolutionInvoker.i(scaledResolution), -90.0), 1.0, 1.0));
        WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, ScaledResolutionInvoker.getScaledWidth(scaledResolution), 0.0, -90.0), 1.0, 0.0));
        WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, 0.0, 0.0, -90.0), 0.0, 0.0));
        TessellatorInvoker.draw(tessellator);
        GlStateManagerInvoker.c(true);
        GlStateManagerInvoker.enableDepth();
        GlStateManagerInvoker.enableAlpha();
        GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
    }

    public QK m() {
        return this.E;
    }

    public void g() {
        if (this.i > 0) {
            --this.i;
        }
        if (this.z > 0) {
            --this.z;
            if (this.z <= 0) {
                this.k = aim_0.d;
                this.w = aim_0.h;
            }
        }
        ++this.N;
        aVY.a(this.D);
        if (this.j.player != null) {
            ItemStack itemStack = InventoryInvoker.g(this.j.player.inventory);
            this.K = 0;
            this.I = itemStack;
        }
    }

    private void b(ScaledResolution scaledResolution) {
        if (MCInvoker.v(this.j) instanceof EntityPlayer) {
            EntityPlayer entityPlayer = (EntityPlayer)MCInvoker.v(this.j);
            int n = MathHelper.c(a6w_0.z(entityPlayer));
            boolean bl = this.F > (long)this.N && (this.F - (long)this.N) / 3L % 2L == 1L;
            if (n < this.f && entityPlayer.hurtResistantTime > 0) {
                this.C = MCInvoker.a();
                this.F = this.N + 20;
            } else if (n > this.f && entityPlayer.hurtResistantTime > 0) {
                this.C = MCInvoker.a();
                this.F = this.N + 10;
            }
            if (MCInvoker.a() - this.C > 1000L) {
                this.f = n;
                this.r = n;
                this.C = MCInvoker.a();
            }
            HUD hUD = (HUD)ModuleInvoker.isEnable(ModuleRegistry.HUD);
            this.f = n;
            a5_0.a(this.u, (long)this.N * 312871L);
            aX4 aX42 = a6w_0.u(entityPlayer);
            net.K.b(aX42);
            net.K.d(aX42);
            ahw_2 ahw_22 = a6w_0.a(entityPlayer, abb_0.b);
            int n2 = ScaledResolutionInvoker.getScaledWidth(scaledResolution) / 2 - 91;
            int cfr_ignored_0 = ScaledResolutionInvoker.getScaledWidth(scaledResolution) / 2 + 91;
            int n3 = ScaledResolutionInvoker.i(scaledResolution) - (cw_2.d(hUD) && cw_2.h(hUD).equals(aim_0.q) ? 46 : 39);
            float f = (float)Ma.d(ahw_22);
            float f2 = a6w_0.k(entityPlayer);
            int n4 = MathHelper.c((f + f2) / 2.0f / 10.0f);
            int n5 = MathInvoker.max(10 - (n4 - 2), 3);
            int n6 = n3 - (n4 - 1) * n5 - 10;
            int n7 = a6w_0.I(entityPlayer);
            if (a6w_0.a(entityPlayer, Potion.regeneration)) {
                int cfr_ignored_1 = this.N % MathHelper.c(f + 5.0f);
            }
            ProfilerInvoker.startSection(this.j.mcProfiler, aim_0.s);
            int n8 = 0;
            while (true) {
                int n9 = n2 + n8 * 8;
                if (n8 * 2 + 1 < n7) {
                    this.d(n9, n6, 34, 9, 9, 9);
                }
                if (n8 * 2 + 1 == n7) {
                    this.d(n9, n6, 25, 9, 9, 9);
                }
                if (n8 * 2 + 1 > n7) {
                    this.d(n9, n6, 16, 9, 9, 9);
                }
                ++n8;
            }
        }
    }

    public acl_0 d() {
        return this.B;
    }

    private void a(float f, ScaledResolution scaledResolution) {
        if (f < 1.0f) {
            f *= f;
            f *= f;
            f = f * 0.8f + 0.2f;
        }
        GlStateManagerInvoker.C();
        GlStateManagerInvoker.disableDepth();
        GlStateManagerInvoker.c(false);
        GlStateManagerInvoker.b(770, 771, 1, 0);
        GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, f);
        TextureManagerInvoker.bindTexture(MCInvoker.E(this.j), TextureMap.r);
        KM kM = ap__0.a(xd_0.a(MCInvoker.Y(this.j)), abu_0.a(Blocks.h));
        float f2 = qg_2.a(kM);
        float f3 = qg_2.f(kM);
        float f4 = qg_2.m(kM);
        float f5 = qg_2.k(kM);
        Tessellator tessellator = TessellatorInvoker.getInstance();
        WorldRenderer worldRenderer = TessellatorInvoker.getWorldRenderer(tessellator);
        WorldRendererInvoker.begin(worldRenderer, 7, DefaultVertexFormats.a);
        WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, 0.0, ScaledResolutionInvoker.i(scaledResolution), -90.0), f2, f5));
        WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, ScaledResolutionInvoker.getScaledWidth(scaledResolution), ScaledResolutionInvoker.i(scaledResolution), -90.0), f4, f5));
        WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, ScaledResolutionInvoker.getScaledWidth(scaledResolution), 0.0, -90.0), f4, f3));
        WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, 0.0, 0.0, -90.0), f2, f3));
        TessellatorInvoker.draw(tessellator);
        GlStateManagerInvoker.c(true);
        GlStateManagerInvoker.enableDepth();
        GlStateManagerInvoker.enableAlpha();
        GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
    }

    public deobf.FontRenderer e() {
        return this.j.fontRendererObj;
    }

    public void a(float f) {
        acl_0 acl_02;
        int n;
        float f2;
        float f3;
        ScaledResolution scaledResolution = new ScaledResolution(this.j);
        int n2 = ScaledResolutionInvoker.getScaledWidth(scaledResolution);
        int n3 = ScaledResolutionInvoker.i(scaledResolution);
        EntityRendererInvoker.b(this.j.entityRenderer);
        GlStateManagerInvoker.enableBlend();
        if (ys_2.aK()) {
            this.b(PlayerInvoker.b(this.j.player, f), scaledResolution);
        } else {
            GlStateManagerInvoker.enableDepth();
            GlStateManagerInvoker.b(770, 771, 1, 0);
        }
        ItemStack itemStack = InventoryInvoker.a(this.j.player.inventory, 3);
        if (awu_1.f(this.j.gameSettings) == 0 && act_2.k(itemStack) == px_0.a(Blocks.ap)) {
            this.a(scaledResolution);
        }
        if (!PlayerInvoker.b(this.j.player, Potion.confusion) && (f3 = this.j.player.prevTimeInPortal + (this.j.player.timeInPortal - this.j.player.prevTimeInPortal) * f) > 0.0f) {
            this.a(f3, scaledResolution);
        }
        if (PlayerControllerInvoker.a(this.j.playerController)) {
            this.H.a(scaledResolution, f);
        } else {
            HUD hUD = (HUD)ModuleInvoker.isEnable(ModuleRegistry.HUD);
            if (!cw_2.e(hUD) || !cw_2.d(hUD)) {
                this.a(scaledResolution, f);
            }
        }
        GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
        TextureManagerInvoker.bindTexture(MCInvoker.E(this.j), d);
        GlStateManagerInvoker.enableBlend();
        if (this.j() && awu_1.f(this.j.gameSettings) < 1 && !wc_1.g(ModuleInvoker.isEnable(ModuleRegistry.CROSSHAIR))) {
            GlStateManagerInvoker.b(775, 769, 1, 0);
            GlStateManagerInvoker.enableAlpha();
            this.c(n2 / 2 - 7, n3 / 2 - 7, 0, 0, 16, 16);
        }
        GlStateManagerInvoker.b(770, 771, 1, 0);
        ProfilerInvoker.startSection(this.j.mcProfiler, aim_0.v);
        this.b();
        ProfilerInvoker.endSection(this.j.mcProfiler);
        if (PlayerControllerInvoker.f(this.j.playerController)) {
            this.b(scaledResolution);
        }
        GlStateManagerInvoker.disableBlend();
        if (PlayerInvoker.S(this.j.player) > 0) {
            ProfilerInvoker.startSection(this.j.mcProfiler, aim_0.p);
            GlStateManagerInvoker.disableDepth();
            GlStateManagerInvoker.C();
            int n4 = PlayerInvoker.S(this.j.player);
            f2 = (float)n4 / 100.0f;
            if (f2 > 1.0f) {
                f2 = 1.0f - (float)(n4 - 100) / 10.0f;
            }
            n = (int)(220.0f * f2) << 24 | 0x101020;
            this.a(0, 0, n2, n3, n);
            GlStateManagerInvoker.enableAlpha();
            GlStateManagerInvoker.enableDepth();
            ProfilerInvoker.endSection(this.j.mcProfiler);
        }
        GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
        int n5 = n2 / 2 - 91;
        if (PlayerInvoker.x(this.j.player)) {
            this.a(scaledResolution, n5);
        } else if (PlayerControllerInvoker.j(this.j.playerController)) {
            this.b(scaledResolution, n5);
        }
        if (this.j.gameSettings.w && !PlayerControllerInvoker.a(this.j.playerController)) {
            this.e(scaledResolution);
        } else if (PlayerInvoker.B(this.j.player)) {
            ahp_1.a(this.H, scaledResolution);
        }
        if (MCInvoker.V(this.j)) {
            this.d(scaledResolution);
        }
        if (this.j.gameSettings.ar) {
            ya_0.a(this.h, scaledResolution);
        }
        if (this.i > 0) {
            ProfilerInvoker.startSection(this.j.mcProfiler, aim_0.e);
            f2 = (float)this.i - f;
            n = (int)(f2 * 255.0f / 20.0f);
            if (n > 255) {
                n = 255;
            }
            if (n > 8) {
                GlStateManagerInvoker.pushMatrix();
                GlStateManagerInvoker.translate(n2 / 2, n3 - 68, 0.0f);
                GlStateManagerInvoker.enableBlend();
                GlStateManagerInvoker.b(770, 771, 1, 0);
                int n6 = 0xFFFFFF;
                if (this.L) {
                    n6 = MathHelper.a(f2 / 50.0f, 0.7f, 0.6f) & 0xFFFFFF;
                }
                FontRendererInvoker.a(this.e(), this.o, -FontRendererInvoker.a(this.e(), this.o) / 2, -4.0f, n6 + (n << 24 & 0xFF000000));
                GlStateManagerInvoker.disableBlend();
                GlStateManagerInvoker.popMatrix();
            }
            ProfilerInvoker.endSection(this.j.mcProfiler);
        }
        if (this.z > 0) {
            ProfilerInvoker.startSection(this.j.mcProfiler, aim_0.o);
            f2 = (float)this.z - f;
            n = 255;
            if (this.z > this.m + this.q) {
                float f4 = (float)(this.n + this.q + this.m) - f2;
                n = (int)(f4 * 255.0f / (float)this.n);
            }
            if (this.z <= this.m) {
                n = (int)(f2 * 255.0f / (float)this.m);
            }
            this.l = n = MathHelper.a(n, 0, 255);
            if (n > 8) {
                GlStateManagerInvoker.pushMatrix();
                GlStateManagerInvoker.translate(n2 / 2, n3 / 2, 0.0f);
                GlStateManagerInvoker.enableBlend();
                GlStateManagerInvoker.b(770, 771, 1, 0);
                GlStateManagerInvoker.pushMatrix();
                GlStateManagerInvoker.c(4.0f, 4.0f, 4.0f);
                int n7 = n << 24 & 0xFF000000;
                FontRendererInvoker.a(this.e(), this.k, (float)(-FontRendererInvoker.a(this.e(), this.k) / 2), -10.0f, 0xFFFFFF | n7, true);
                GlStateManagerInvoker.popMatrix();
                GlStateManagerInvoker.pushMatrix();
                GlStateManagerInvoker.c(2.0f, 2.0f, 2.0f);
                FontRendererInvoker.a(this.e(), this.w, (float)(-FontRendererInvoker.a(this.e(), this.w) / 2), 5.0f, 0xFFFFFF | n7, true);
                GlStateManagerInvoker.popMatrix();
                GlStateManagerInvoker.disableBlend();
                GlStateManagerInvoker.popMatrix();
            }
            ProfilerInvoker.endSection(this.j.mcProfiler);
        }
        za_2 za_22 = BlockInvoker.o(this.j.world);
        acl_0 acl_03 = null;
        a35 a352 = VM.c(za_22, PlayerInvoker.u(this.j.player));
        if (fo_0.a(fo_0.a()) == 47) {
            int n8 = tc_0.a(sd_1.i(a352));
            acl_03 = VM.a(za_22, 3 + n8);
        }
        this.B = acl_02 = acl_03;
        GlStateManagerInvoker.enableBlend();
        GlStateManagerInvoker.b(770, 771, 1, 0);
        GlStateManagerInvoker.C();
        GlStateManagerInvoker.pushMatrix();
        ProfilerInvoker.startSection(this.j.mcProfiler, aim_0.t);
        kp_1.a(this.A, this.N);
        ProfilerInvoker.endSection(this.j.mcProfiler);
        GlStateManagerInvoker.popMatrix();
        acl_02 = VM.a(za_22, 0);
        if (!GameSettingsInvoker.e(this.j.gameSettings.a9) || MCInvoker.B(this.j) && ms_0.d(aDM.b(this.j.player.connection)) <= 1) {
            a9E.a(this.E, true);
        } else {
            a9E.a(this.E, true);
            a9E.a(this.E, n2, za_22, acl_02);
        }
        GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
        GlStateManagerInvoker.disableLighting();
        GlStateManagerInvoker.enableAlpha();
        if (NovolineInvoker.b(NovolineInvoker.getInstance())) {
            return;
        }
        GL11.glPushMatrix();
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        if (this.g != (double)this.j.displayWidth || this.v != (double)this.j.displayHeight || this.M != (double)this.j.gameSettings.z) {
            S5.b(this.s);
        }
        GlStateManagerInvoker.pushMatrix();
        GlStateManagerInvoker.G();
        S5.a(this.s);
        GlStateManagerInvoker.v();
        GlStateManagerInvoker.popMatrix();
        if (this.j.world != null) {
            EventManagerInvoker.call(new Render2DEvent(scaledResolution, f));
        }
        aMF.a(aMF.b(ListInvoker.stream(aci_0.a(NovolineInvoker.i(MCInvoker.z(this.j)))), GuiIngame::lambda$renderGameOverlay$0), this::lambda$renderGameOverlay$1);
        this.g = this.j.displayWidth;
        this.v = this.j.displayHeight;
        this.M = this.j.gameSettings.z;
        GlStateManagerInvoker.enableBlend();
        GL11.glPopMatrix();
    }

    public void e(ScaledResolution scaledResolution) {
        ProfilerInvoker.startSection(this.j.mcProfiler, aim_0.m);
        if (this.K > 0 && this.I != null) {
            int n;
            String string = act_2.w(this.I);
            if (act_2.g(this.I)) {
                string = aL0.a(aL0.a(new StringBuilder(), (Object)anw_0.ITALIC), string).toString();
            }
            int n2 = (ScaledResolutionInvoker.getScaledWidth(scaledResolution) - FontRendererInvoker.a(this.e(), string)) / 2;
            int n3 = ScaledResolutionInvoker.i(scaledResolution) - 59;
            if (!PlayerControllerInvoker.f(this.j.playerController)) {
                n3 += 14;
            }
            if ((n = (int)((float)this.K * 256.0f / 10.0f)) > 255) {
                n = 255;
            }
            GlStateManagerInvoker.pushMatrix();
            GlStateManagerInvoker.enableBlend();
            GlStateManagerInvoker.b(770, 771, 1, 0);
            FontRendererInvoker.drawStringWithShadow(this.e(), string, n2, (float)n3 - 12.0f, 0xFFFFFF + (n << 24));
            GlStateManagerInvoker.disableBlend();
            GlStateManagerInvoker.popMatrix();
        }
        ProfilerInvoker.endSection(this.j.mcProfiler);
    }

    private void b(float f, ScaledResolution scaledResolution) {
        if (!ys_2.aK()) {
            GlStateManagerInvoker.enableDepth();
        } else {
            f = 1.0f - f;
            f = MathHelper.b(f, 0.0f, 1.0f);
            agl_1 agl_12 = BlockInvoker.i(this.j.world);
            float f2 = (float)ak9_0.a(agl_12, this.j.player);
            double d = MathInvoker.a(ak9_0.h(agl_12) * (double)ak9_0.f(agl_12) * 1000.0, MathInvoker.a(ak9_0.i(agl_12) - ak9_0.e(agl_12)));
            double d2 = MathInvoker.d(ak9_0.k(agl_12), d);
            f2 = (double)f2 < d2 ? 1.0f - (float)((double)f2 / d2) : 0.0f;
            this.t = (float)((double)this.t + (double)(f - this.t) * 0.01);
            GlStateManagerInvoker.disableDepth();
            GlStateManagerInvoker.c(false);
            GlStateManagerInvoker.b(0, 769, 1, 0);
            float f3 = f2 - 0.0f;
            int cfr_ignored_1 = f3 == 0.0f ? 0 : (f3 > 0.0f ? 1 : -1);
            GlStateManagerInvoker.color(this.t, this.t, this.t, 1.0f);
            TextureManagerInvoker.bindTexture(MCInvoker.E(this.j), J);
            Tessellator tessellator = TessellatorInvoker.getInstance();
            WorldRenderer worldRenderer = TessellatorInvoker.getWorldRenderer(tessellator);
            WorldRendererInvoker.begin(worldRenderer, 7, DefaultVertexFormats.a);
            WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, 0.0, ScaledResolutionInvoker.i(scaledResolution), -90.0), 0.0, 1.0));
            WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, ScaledResolutionInvoker.getScaledWidth(scaledResolution), ScaledResolutionInvoker.i(scaledResolution), -90.0), 1.0, 1.0));
            WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, ScaledResolutionInvoker.getScaledWidth(scaledResolution), 0.0, -90.0), 1.0, 0.0));
            WorldRendererInvoker.pos(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, 0.0, 0.0, -90.0), 0.0, 0.0));
            TessellatorInvoker.draw(tessellator);
            GlStateManagerInvoker.c(true);
            GlStateManagerInvoker.enableDepth();
            GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
        }
        GlStateManagerInvoker.b(770, 771, 1, 0);
    }

    public void d(int n, int n2, int n3, int n4, int n5, int n6) {
        this.c(n, n2, n3, n4, n5, n6);
    }

    public int l() {
        return this.N;
    }

    private deobf.FontRenderer f() {
        return MCInvoker.f().fontRendererObj;
    }

    private void a(ScaledResolution scaledResolution, float f) {
        if (MCInvoker.v(this.j) instanceof EntityPlayer) {
            GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
            TextureManagerInvoker.bindTexture(MCInvoker.E(this.j), y);
            EntityPlayer entityPlayer = (EntityPlayer)MCInvoker.v(this.j);
            int n = ScaledResolutionInvoker.getScaledWidth(scaledResolution) / 2;
            float f2 = zLevel;
            zLevel = -90.0f;
            this.c(n - 91, ScaledResolutionInvoker.i(scaledResolution) - 22, 0, 0, 182, 22);
            this.c(n - 91 - 1 + entityPlayer.inventory.a * 20, ScaledResolutionInvoker.i(scaledResolution) - 22 - 1, 0, 22, 24, 22);
            zLevel = f2;
            GlStateManagerInvoker.c();
            GlStateManagerInvoker.enableBlend();
            GlStateManagerInvoker.b(770, 771, 1, 0);
            ne_0.f();
            int n2 = 0;
            while (true) {
                int n3 = ScaledResolutionInvoker.getScaledWidth(scaledResolution) / 2 - 90 + n2 * 20 + 2;
                int n4 = ScaledResolutionInvoker.i(scaledResolution) - 16 - 3;
                this.a(n2, n3, n4, f, entityPlayer);
                ++n2;
            }
        }
    }

    public void a(ScaledResolution scaledResolution, int n) {
        ProfilerInvoker.startSection(this.j.mcProfiler, aim_0.y);
        TextureManagerInvoker.bindTexture(MCInvoker.E(this.j), Gui.d);
        float f = PlayerInvoker.ab(this.j.player);
        int n2 = 182;
        int n3 = (int)(f * (float)(n2 + 1));
        int n4 = ScaledResolutionInvoker.i(scaledResolution) - 32 + 3;
        this.c(n, n4, 0, 84, n2, 5);
        this.c(n, n4, 0, 89, n3, 5);
        ProfilerInvoker.endSection(this.j.mcProfiler);
    }

    public qs_0 a() {
        return this.A;
    }

    public int n() {
        return this.l;
    }

    private static boolean lambda$renderGameOverlay$0(FutureTask futureTask) {
        return X9.c(futureTask) == ag3_0.RENDER;
    }

    public void a(IChatComponent iChatComponent, boolean bl) {
        this.a(aBO.d(iChatComponent), bl);
    }

    public GuiIngame(Minecraft minecraft) {
        this.o = aim_0.F;
        this.k = aim_0.r;
        this.w = aim_0.x;
        this.j = minecraft;
        this.x = MCInvoker.A(minecraft);
        this.h = new QY(minecraft);
        this.H = new sg_0(minecraft);
        this.A = new qs_0(minecraft);
        this.D = new aCF(minecraft);
        this.E = new QK(minecraft, this);
        this.k();
    }

    public void a(String string, String string2, int n, int n2, int n3) {
        this.k = aim_0.u;
        this.w = aim_0.D;
        this.z = 0;
    }

    public sg_0 h() {
        return this.H;
    }

    public void d(ScaledResolution scaledResolution) {
        ProfilerInvoker.startSection(this.j.mcProfiler, aim_0.l);
        String string = BlockInvoker.l(this.j.world) >= 120500L ? I18n.format(aim_0.b, new Object[0]) : I18n.format(aim_0.C, new Object[]{aod_2.a((int)(120500L - BlockInvoker.l(this.j.world)))});
        int n = FontRendererInvoker.a(this.e(), string);
        FontRendererInvoker.drawStringWithShadow(this.e(), string, ScaledResolutionInvoker.getScaledWidth(scaledResolution) - n - 10, 5.0f, 0xFFFFFF);
        ProfilerInvoker.endSection(this.j.mcProfiler);
    }

    public void k() {
        this.n = 10;
        this.q = 70;
        this.m = 20;
    }

    private void b() {
        if (ty_1.a != null && ty_1.c > 0) {
            --ty_1.c;
            deobf.FontRenderer cfr_ignored_0 = this.j.fontRendererObj;
            ScaledResolution scaledResolution = new ScaledResolution(this.j);
            int n = ScaledResolutionInvoker.getScaledWidth(scaledResolution);
            int n2 = 182;
            int n3 = n / 2 - n2 / 2;
            int n4 = (int)(ty_1.d * (float)(n2 + 1));
            int n5 = 12;
            this.c(n3, n5, 0, 74, n2, 5);
            this.c(n3, n5, 0, 74, n2, 5);
            this.c(n3, n5, 0, 79, n4, 5);
            String string = ty_1.a;
            int n6 = 0xFFFFFF;
            if (ys_2.aF()) {
                n6 = ajT.c(n6);
            }
            FontRendererInvoker.drawStringWithShadow(this.e(), string, n / 2 - FontRendererInvoker.a(this.e(), string) / 2, n5 - 10, n6);
            GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
            TextureManagerInvoker.bindTexture(MCInvoker.E(this.j), d);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -1;
        char[] cArray = "7/\nh3\u001d'DUci".toCharArray();
        int n2 = 0;
        int n3 = 17;
        char[] cArray2 = cArray;
        int n4 = cArray.length;
        while (true) {
            n4 = n4;
            cArray2 = cArray2;
            int n5 = ++n2;
            int cfr_ignored_0 = n2 % 7;
            cArray2[n5] = (char)(cArray2[n5] ^ (n3 ^ 0x65));
            n3 = n3;
        }
    }

    public void b(ScaledResolution scaledResolution, int n) {
        ProfilerInvoker.startSection(this.j.mcProfiler, aim_0.c);
        TextureManagerInvoker.bindTexture(MCInvoker.E(this.j), Gui.d);
        PlayerInvoker.ah(this.j.player);
        int n2 = 182;
        int n3 = (int)(this.j.player.bS * (float)(n2 + 1));
        HUD hUD = (HUD)ModuleInvoker.isEnable(ModuleRegistry.HUD);
        int n4 = ScaledResolutionInvoker.i(scaledResolution) - (cw_2.d(hUD) && cw_2.h(hUD).equals(aim_0.B) ? 36 : 29);
        this.d(n, n4, 0, 64, n2, 5);
        this.d(n, n4, 0, 69, n3, 5);
        ProfilerInvoker.endSection(this.j.mcProfiler);
        if (this.j.player.bL > 0) {
            ProfilerInvoker.startSection(this.j.mcProfiler, aim_0.f);
            n2 = 8453920;
            if (ys_2.aF()) {
                n2 = ajT.b(n2);
            }
            String string = aL0.c(aL0.a(new StringBuilder(), aim_0.a), this.j.player.bL).toString();
            int n5 = (ScaledResolutionInvoker.getScaledWidth(scaledResolution) - FontRendererInvoker.a(this.e(), string)) / 2;
            HUD hUD2 = (HUD)ModuleInvoker.isEnable(ModuleRegistry.HUD);
            int n6 = ScaledResolutionInvoker.i(scaledResolution) - (cw_2.d(hUD2) && cw_2.h(hUD2).equals(aim_0.n) ? 46 : 38);
            FontRendererInvoker.a(this.e(), string, n5 + 1, n6, 0);
            FontRendererInvoker.a(this.e(), string, n5 - 1, n6, 0);
            FontRendererInvoker.a(this.e(), string, n5, n6 + 1, 0);
            FontRendererInvoker.a(this.e(), string, n5, n6 - 1, 0);
            FontRendererInvoker.a(this.e(), string, n5, n6, n2);
            ProfilerInvoker.endSection(this.j.mcProfiler);
        }
    }

    public void a(String string, boolean bl) {
        this.o = string;
        this.i = 60;
        this.L = bl;
    }
}

