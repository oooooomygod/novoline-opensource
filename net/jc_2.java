/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.SystemInvoker;
import cc.novoline.invoke.TextureManagerInvoker;
import deobf.ItemPhysic;
import net.minecraft.item.ItemStack;
import deobf.MCInvoker;
import net.minecraft.renderer.entity.RenderItem;
import net.minecraft.renderer.texture.TextureMap;
import java.util.Random;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

/*
 * Renamed from net.jc
 */
public class jc_2
extends j7_0<og_0> {
    public static Random f = new Random();
    public static long h;
    private Random g = new Random();
    private RenderItem e;
    public static double i;

    private int a(ItemStack itemStack) {
        int n = 1;
        if (itemStack.a > 48) {
            n = 5;
        } else if (itemStack.a > 32) {
            n = 4;
        } else if (itemStack.a > 16) {
            n = 3;
        } else if (itemStack.a > 1) {
            n = 2;
        }
        return n;
    }

    private int a(og_0 og_02, double d, double d2, double d3, float f, JE jE) {
        ItemStack itemStack = aec_0.k(og_02);
        act_2.k(itemStack);
        return 0;
    }

    @Override
    public void b(og_0 og_02, double d, double d2, double d3, float f, float f2) {
        ItemStack itemStack = aec_0.k(og_02);
        a5_0.a(this.g, 187L);
        if (this.b(og_02)) {
            u3_0.a(TextureManagerInvoker.b(this.a.e, this.a(og_02)), false, false);
        }
        GlStateManagerInvoker.c();
        GlStateManagerInvoker.alphaFunc(516, 0.1f);
        GlStateManagerInvoker.enableBlend();
        GlStateManagerInvoker.b(770, 771, 1, 0);
        GlStateManagerInvoker.pushMatrix();
        JE jE = aPL.a(DU.a(this.e), itemStack);
        int n = this.a(og_02, d, d2, d3, f2, jE);
        for (int i = 0; i < n; ++i) {
            float f3;
            float f4;
            float f5;
            if (aND.e(jE)) {
                GlStateManagerInvoker.pushMatrix();
                f5 = (a5_0.e(this.g) * 2.0f - 1.0f) * 0.15f;
                f4 = (a5_0.e(this.g) * 2.0f - 1.0f) * 0.15f;
                f3 = (a5_0.e(this.g) * 2.0f - 1.0f) * 0.15f;
                GlStateManagerInvoker.translate(f5, f4, f3);
                GlStateManagerInvoker.c(0.5f, 0.5f, 0.5f);
                afm_2.c(aND.a(jE), go_0.GROUND);
                DU.a(this.e, itemStack, jE);
                GlStateManagerInvoker.popMatrix();
                continue;
            }
            GlStateManagerInvoker.pushMatrix();
            afm_2.c(aND.a(jE), go_0.GROUND);
            DU.a(this.e, itemStack, jE);
            GlStateManagerInvoker.popMatrix();
            f5 = aND.a((JE)jE).k.c.x;
            f4 = aND.a((JE)jE).k.c.y;
            f3 = aND.a((JE)jE).k.c.z;
            GlStateManagerInvoker.translate(0.0f * f5, 0.0f * f4, 0.046875f * f3);
        }
        GlStateManagerInvoker.popMatrix();
        GlStateManagerInvoker.y();
        GlStateManagerInvoker.disableBlend();
        this.b(og_02);
        u3_0.b(TextureManagerInvoker.b(this.a.e, this.a(og_02)));
        super.b(og_02, d, d2, d3, f, f2);
    }

    public jc_2(RenderManager renderManager, RenderItem renderItem) {
        super(renderManager);
        this.e = renderItem;
        this.c = 0.15f;
        this.b = 0.75f;
    }

    public void c(og_0 og_02, double d, double d2, double d3, float f, float f2) {
        if (aLF.e()) {
            return;
        }
        if (ItemPhysic.H) {
            this.a(og_02, d, d2, d3, f, f2);
        } else {
            this.b(og_02, d, d2, d3, f, f2);
        }
    }

    @Override
    protected ResourceLocation a(og_0 og_02) {
        return TextureMap.r;
    }

    private void a(og_0 og_02, double d, double d2, double d3, float f, float f2) {
        ItemStack itemStack;
        Minecraft minecraft = MCInvoker.f();
        i = (double)(SystemInvoker.nanoTime() - h) / 5.0E13;
        if (!minecraft.ay) {
            i = 0.0;
        }
        int n = act_2.k(itemStack = aec_0.k(og_02)) != null ? px_0.a(act_2.k(itemStack)) + act_2.c(itemStack) : 187;
        a5_0.a(jc_2.f, (long)n);
        MCInvoker.E(MCInvoker.f()).b(this.a(og_02));
        u3_0.a(TextureManagerInvoker.b(MCInvoker.E(MCInvoker.f()), this.a(og_02)), false, false);
        GlStateManagerInvoker.c();
        GlStateManagerInvoker.alphaFunc(516, 0.1f);
        GlStateManagerInvoker.enableBlend();
        ne_0.a();
        GlStateManagerInvoker.b(770, 771, 1, 0);
        GlStateManagerInvoker.pushMatrix();
        JE jE = aPL.a(DU.a(MCInvoker.A(minecraft)), itemStack);
        aND.e(jE);
        aND.e(jE);
        int n2 = this.a(itemStack);
        GlStateManagerInvoker.translate((float)d, (float)d2, (float)d3);
        if (aND.e(jE)) {
            GlStateManagerInvoker.c(0.5f, 0.5f, 0.5f);
        }
        GL11.glRotatef((float)90.0f, (float)1.0f, (float)0.0f, (float)0.0f);
        GL11.glRotatef((float)og_02.rotationYaw, (float)0.0f, (float)0.0f, (float)1.0f);
        GlStateManagerInvoker.a(0.0, 0.0, -0.08);
        if (minecraft.as().u != null) {
            if (!og_02.onGround) {
                double d4 = i * 2.0;
                og_02.rotationPitch = (float)((double)og_02.rotationPitch + d4);
            }
            GlStateManagerInvoker.b(og_02.rotationPitch, 1.0f, 0.0f, 0.0f);
        }
        GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
        for (int i = 0; i < n2; ++i) {
            GlStateManagerInvoker.pushMatrix();
            float f3 = (a5_0.e(jc_2.f) * 2.0f - 1.0f) * 0.15f;
            float f4 = (a5_0.e(jc_2.f) * 2.0f - 1.0f) * 0.15f;
            float f5 = (a5_0.e(jc_2.f) * 2.0f - 1.0f) * 0.15f;
            GlStateManagerInvoker.translate(f3, f4, f5);
            DU.a(MCInvoker.A(minecraft), itemStack, jE);
            GlStateManagerInvoker.popMatrix();
        }
        GlStateManagerInvoker.popMatrix();
        GlStateManagerInvoker.y();
        GlStateManagerInvoker.disableBlend();
        MCInvoker.E(MCInvoker.f()).b(this.a(og_02));
        u3_0.b(TextureManagerInvoker.b(MCInvoker.E(MCInvoker.f()), this.a(og_02)));
    }
}

