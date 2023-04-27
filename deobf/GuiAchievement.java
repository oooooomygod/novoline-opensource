/*
 * Decompiled with CFR 0.152.
 */
package deobf;

import cc.novoline.invoke.FontRendererInvoker;
import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.ScaledResolutionInvoker;
import cc.novoline.invoke.TextureManagerInvoker;
import net.minecraft.client.Minecraft;
import net.DU;
import net.Gui;
import net.I18n;
import net.K6;
import net.ResourceLocation;
import net.ScaledResolution;
import net.aBO;
import net.dr_0;
import net.minecraft.renderer.entity.RenderItem;
import net.minecraft.stats.Achievement;
import net.ne_0;

public class GuiAchievement
extends Gui {
    private boolean f;
    private RenderItem j;
    private int g;
    private String n;
    private int m;
    private Minecraft h;
    private static ResourceLocation i = new ResourceLocation(dr_0.b);
    private Achievement l;
    private long o;
    private String k;

    public void b() {
        if (this.l != null && this.o != 0L && MCInvoker.f().player != null) {
            double d = (double)(MCInvoker.a() - this.o) / 3000.0;
            if (!this.f) {
                if (d < 0.0 || d > 1.0) {
                    this.o = 0L;
                    return;
                }
            } else if (d > 0.5) {
                d = 0.5;
            }
            this.a();
            GlStateManagerInvoker.disableDepth();
            GlStateManagerInvoker.c(false);
            double d2 = d * 2.0;
            if (d2 > 1.0) {
                d2 = 2.0 - d2;
            }
            d2 *= 4.0;
            if ((d2 = 1.0 - d2) < 0.0) {
                d2 = 0.0;
            }
            d2 *= d2;
            d2 *= d2;
            int n = this.m - 160;
            int n2 = 0 - (int)(d2 * 36.0);
            GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
            GlStateManagerInvoker.enableTexture2D();
            TextureManagerInvoker.bindTexture(MCInvoker.E(this.h), i);
            GlStateManagerInvoker.disableLighting();
            this.c(n, n2, 96, 202, 160, 32);
            if (this.f) {
                FontRendererInvoker.a(this.h.fontRendererObj, this.k, n + 30, n2 + 7, 120, -1);
            } else {
                FontRendererInvoker.a(this.h.fontRendererObj, this.n, n + 30, n2 + 7, -256);
                FontRendererInvoker.a(this.h.fontRendererObj, this.k, n + 30, n2 + 18, -1);
            }
            ne_0.f();
            GlStateManagerInvoker.disableLighting();
            GlStateManagerInvoker.c();
            GlStateManagerInvoker.enableColorMaterial();
            GlStateManagerInvoker.D();
            DU.b(this.j, this.l.theItemStack, n + 8, n2 + 8);
            GlStateManagerInvoker.disableLighting();
            GlStateManagerInvoker.c(true);
            GlStateManagerInvoker.enableDepth();
        }
    }

    public void a(Achievement achievement) {
        this.n = aBO.d(K6.c(achievement));
        this.k = K6.e(achievement);
        this.o = MCInvoker.a() + 2500L;
        this.l = achievement;
        this.f = true;
    }

    private void a() {
        GlStateManagerInvoker.viewport(0, 0, this.h.displayWidth, this.h.displayHeight);
        GlStateManagerInvoker.matrixMode(5889);
        GlStateManagerInvoker.loadIdentity();
        GlStateManagerInvoker.matrixMode(5888);
        GlStateManagerInvoker.loadIdentity();
        this.m = this.h.displayWidth;
        this.g = this.h.displayHeight;
        ScaledResolution scaledResolution = new ScaledResolution(this.h);
        this.m = ScaledResolutionInvoker.getScaledWidth(scaledResolution);
        this.g = ScaledResolutionInvoker.i(scaledResolution);
        GlStateManagerInvoker.clear(256);
        GlStateManagerInvoker.matrixMode(5889);
        GlStateManagerInvoker.loadIdentity();
        GlStateManagerInvoker.ortho(0.0, this.m, this.g, 0.0, 1000.0, 3000.0);
        GlStateManagerInvoker.matrixMode(5888);
        GlStateManagerInvoker.loadIdentity();
        GlStateManagerInvoker.translate(0.0f, 0.0f, -2000.0f);
    }

    public GuiAchievement(Minecraft minecraft) {
        this.h = minecraft;
        this.j = MCInvoker.A(minecraft);
    }

    public void c() {
        this.l = null;
        this.o = 0L;
    }

    public void b(Achievement achievement) {
        this.n = I18n.format(dr_0.a, new Object[0]);
        this.k = aBO.d(K6.c(achievement));
        this.o = MCInvoker.a();
        this.l = achievement;
        this.f = false;
    }
}

