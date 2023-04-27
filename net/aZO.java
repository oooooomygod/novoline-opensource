/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package net;

import cc.novoline.invoke.EntityRendererInvoker;
import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.PlayerInvoker;
import cc.novoline.invoke.ProfilerInvoker;
import cc.novoline.invoke.TextureManagerInvoker;
import deobf.Entity;
import deobf.EntityRenderer;
import deobf.ItemRenderer;
import deobf.MCInvoker;
import deobf.OpenGlHelper;
import net.minecraft.renderer.texture.TextureMap;
import java.nio.IntBuffer;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class aZO {
    public static void a(a5w_0 a5w_02) {
        a0D.k();
        if (OpenGlHelper.f()) {
            GL11.glDisableClientState((int)32885);
            aY_.g(aVE.aO);
            aY_.g(aVE.at);
            aY_.g(aVE.af);
        }
        if (a3c_0.a(a5w_02)) {
            GlStateManagerInvoker.b();
        }
    }

    public static void e() {
        a0D.r();
        if (aVE.aq) {
            GlStateManagerInvoker.c(true);
            a3c_0.a(3);
        }
    }

    public static void l() {
    }

    public static void b() {
        a3c_0.a(17);
    }

    public static void a(EntityRenderer entityRenderer, float f, int n) {
        a0D.r();
        if (!aVE.ch && !a3c_0.z()) {
            a3c_0.E();
            GlStateManagerInvoker.enableBlend();
            a3c_0.d();
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            EntityRendererInvoker.a(entityRenderer, f, n, true, false, true);
            a3c_0.ad();
            a3c_0.a(true);
        }
    }

    public static void j() {
    }

    public static void c(EntityRenderer entityRenderer, float f, int n) {
        a0D.r();
        if (!aVE.ch) {
            a3c_0.R();
            EntityRendererInvoker.a(entityRenderer, f, n, false, true, false);
            a3c_0.W();
        }
    }

    public static void a(aV1 aV12, double d, double d2, double d3) {
        ahz_1.a(aV12, d, d2, d3);
    }

    public static void b(EntityRenderer entityRenderer, float f, int n) {
        boolean bl;
        a0D.r();
        if (!aVE.ch && !(bl = a3c_0.x())) {
            a3c_0.E();
            a3c_0.d();
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            EntityRendererInvoker.a(entityRenderer, f, n, true, false, false);
            a3c_0.ad();
            a3c_0.a(true);
        }
    }

    public static void i() {
        a0D.k();
        if (aVE.aq) {
            a3c_0.a(3);
        }
    }

    public static void f() {
        a0D.r();
        if (aVE.aq) {
            if (a3c_0.r()) {
                a3c_0.a(19);
            }
            a3c_0.a(16);
        }
        a3c_0.a(0);
    }

    public static void a(RenderGlobal renderGlobal, Entity entity, double d, ao7_0 ao7_02, int n, boolean bl) {
        jv_0.a(renderGlobal, entity, d, ao7_02, n, bl);
    }

    public static void a(EntityRenderer entityRenderer, int n, float f, long l4) {
        a0D.k();
        if (aVE.bx > 0 && --aVE.bi <= 0) {
            Minecraft minecraft = MCInvoker.f();
            ProfilerInvoker.a(minecraft.mcProfiler, agq_1.l);
            RenderGlobal renderGlobal = minecraft.renderGlobal;
            aVE.ch = true;
            aVE.bi = aVE.dF;
            aVE.cg = awu_1.f(minecraft.gameSettings);
            awu_1.a(minecraft.gameSettings, 1);
            a3c_0.e(agq_1.t);
            GL11.glMatrixMode((int)5889);
            GL11.glPushMatrix();
            GL11.glMatrixMode((int)5888);
            GL11.glPushMatrix();
            ProfilerInvoker.a(minecraft.mcProfiler, agq_1.v);
            l__0.a(36160, aVE.d5);
            a3c_0.e(agq_1.f);
            a3c_0.a(30);
            ProfilerInvoker.a(minecraft.mcProfiler, agq_1.q);
            EntityRendererInvoker.a(entityRenderer, f, 2);
            a3c_0.a(f);
            aIH.a(minecraft.player, awu_1.f(minecraft.gameSettings) == 2);
            a3c_0.e(agq_1.p);
            aY_.a(aVE.c5);
            a3c_0.e(agq_1.m);
            GL11.glReadBuffer((int)0);
            a3c_0.e(agq_1.o);
            l__0.a(36160, 36096, 3553, HD.b(aVE.Y, 0), 0);
            if (aVE.dS != 0) {
                l__0.a(36160, 36064, 3553, HD.b(aVE.dB, 0), 0);
            }
            a3c_0.d(agq_1.D);
            GL11.glClearColor((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glClear((int)(aVE.dS != 0 ? 16640 : 256));
            a3c_0.e(agq_1.B);
            ProfilerInvoker.a(minecraft.mcProfiler, agq_1.E);
            qr_2 qr_22 = li_1.a();
            ProfilerInvoker.a(minecraft.mcProfiler, agq_1.e);
            aV1 aV12 = new aV1(qr_22);
            Entity entity = MCInvoker.v(minecraft);
            double d = entity.lastTickPosX + (entity.posX - entity.lastTickPosX) * (double)f;
            double d2 = entity.lastTickPosY + (entity.posY - entity.lastTickPosY) * (double)f;
            double d3 = entity.lastTickPosZ + (entity.posZ - entity.lastTickPosZ) * (double)f;
            ahz_1.a(aV12, d, d2, d3);
            GlStateManagerInvoker.shadeModel(7425);
            GlStateManagerInvoker.enableDepth();
            GlStateManagerInvoker.depthFunc(515);
            GlStateManagerInvoker.c(true);
            GlStateManagerInvoker.a(true, true, true, true);
            GlStateManagerInvoker.A();
            ProfilerInvoker.a(minecraft.mcProfiler, agq_1.G);
            TextureManagerInvoker.bindTexture(MCInvoker.E(minecraft), TextureMap.r);
            ProfilerInvoker.a(minecraft.mcProfiler, agq_1.x);
            int n2 = 0;
            n2 = entityRenderer.p;
            entityRenderer.p = n2 + 1;
            jv_0.a(renderGlobal, entity, f, aV12, n2, PlayerInvoker.B(minecraft.player));
            ProfilerInvoker.a(minecraft.mcProfiler, agq_1.C);
            ProfilerInvoker.a(minecraft.mcProfiler, agq_1.z);
            GlStateManagerInvoker.matrixMode(5888);
            GlStateManagerInvoker.pushMatrix();
            GlStateManagerInvoker.C();
            jv_0.a(renderGlobal, a5w_0.SOLID, (double)f, 2, entity);
            a3c_0.e(agq_1.s);
            GlStateManagerInvoker.enableAlpha();
            jv_0.a(renderGlobal, a5w_0.CUTOUT_MIPPED, (double)f, 2, entity);
            a3c_0.e(agq_1.n);
            u3_0.a(TextureManagerInvoker.b(MCInvoker.E(minecraft), TextureMap.r), false, false);
            jv_0.a(renderGlobal, a5w_0.CUTOUT, (double)f, 2, entity);
            a3c_0.e(agq_1.H);
            u3_0.b(TextureManagerInvoker.b(MCInvoker.E(minecraft), TextureMap.r));
            GlStateManagerInvoker.shadeModel(7424);
            GlStateManagerInvoker.alphaFunc(516, 0.1f);
            GlStateManagerInvoker.matrixMode(5888);
            GlStateManagerInvoker.popMatrix();
            GlStateManagerInvoker.pushMatrix();
            ProfilerInvoker.a(minecraft.mcProfiler, agq_1.k);
            if (ayy_0.d(ail_0.bF)) {
                aDb.c(ail_0.bF, new Object[]{P8.d(0)});
            }
            jv_0.a(renderGlobal, entity, aV12, f);
            a3c_0.e(agq_1.y);
            GlStateManagerInvoker.matrixMode(5888);
            GlStateManagerInvoker.popMatrix();
            GlStateManagerInvoker.c(true);
            GlStateManagerInvoker.disableBlend();
            GlStateManagerInvoker.b();
            GlStateManagerInvoker.b(770, 771, 1, 0);
            GlStateManagerInvoker.alphaFunc(516, 0.1f);
            if (aVE.bx >= 2) {
                GlStateManagerInvoker.d(33989);
                a3c_0.e(agq_1.c);
                GL11.glCopyTexSubImage2D((int)3553, (int)0, (int)0, (int)0, (int)0, (int)0, (int)aVE.ed, (int)aVE.bB);
                a3c_0.e(agq_1.g);
                GlStateManagerInvoker.d(33984);
            }
            GlStateManagerInvoker.disableBlend();
            GlStateManagerInvoker.c(true);
            TextureManagerInvoker.bindTexture(MCInvoker.E(minecraft), TextureMap.r);
            GlStateManagerInvoker.shadeModel(7425);
            a3c_0.e(agq_1.r);
            aY_.a(aVE.c5);
            a3c_0.e(agq_1.A);
            a3c_0.d(agq_1.a);
            if (a3c_0.V()) {
                ProfilerInvoker.a(minecraft.mcProfiler, agq_1.h);
                jv_0.a(renderGlobal, a5w_0.TRANSLUCENT, (double)f, 2, entity);
                a3c_0.e(agq_1.b);
            }
            if (ayy_0.d(ail_0.bF)) {
                ne_0.a();
                aDb.f(ail_0.bF, new Object[]{P8.d(1)});
                jv_0.a(renderGlobal, entity, aV12, f);
                aDb.f(ail_0.bF, new Object[]{P8.d(-1)});
                ne_0.e();
                a3c_0.e(agq_1.j);
            }
            GlStateManagerInvoker.shadeModel(7424);
            GlStateManagerInvoker.c(true);
            GlStateManagerInvoker.b();
            GlStateManagerInvoker.disableBlend();
            GL11.glFlush();
            a3c_0.e(agq_1.d);
            aVE.ch = false;
            awu_1.a(minecraft.gameSettings, aVE.cg);
            ProfilerInvoker.a(minecraft.mcProfiler, agq_1.u);
            if (aVE.b6) {
                if (aVE.bx >= 1) {
                    if (aVE.dY[0]) {
                        GlStateManagerInvoker.d(33988);
                        GlStateManagerInvoker.k(HD.b(aVE.Y, 0));
                        a4t_0.a(3553);
                        GL11.glTexParameteri((int)3553, (int)10241, (int)(aVE.a5[0] ? 9984 : 9987));
                    }
                    if (aVE.bx >= 2 && aVE.dY[1]) {
                        GlStateManagerInvoker.d(33989);
                        GlStateManagerInvoker.k(HD.b(aVE.Y, 1));
                        a4t_0.a(3553);
                        GL11.glTexParameteri((int)3553, (int)10241, (int)(aVE.a5[1] ? 9984 : 9987));
                    }
                    GlStateManagerInvoker.d(33984);
                }
                if (aVE.dS >= 1) {
                    if (aVE.b4[0]) {
                        GlStateManagerInvoker.d(33997);
                        GlStateManagerInvoker.k(HD.b(aVE.dB, 0));
                        a4t_0.a(3553);
                        GL11.glTexParameteri((int)3553, (int)10241, (int)(aVE.cB[0] ? 9984 : 9987));
                    }
                    if (aVE.dS >= 2 && aVE.b4[1]) {
                        GlStateManagerInvoker.d(33998);
                        GlStateManagerInvoker.k(HD.b(aVE.dB, 1));
                        a4t_0.a(3553);
                        GL11.glTexParameteri((int)3553, (int)10241, (int)(aVE.cB[1] ? 9984 : 9987));
                    }
                    GlStateManagerInvoker.d(33984);
                }
            }
            a3c_0.e(agq_1.i);
            l__0.a(36160, aVE.d1);
            GL11.glViewport((int)0, (int)0, (int)aVE.o, (int)aVE.R);
            aVE.eg = null;
            TextureManagerInvoker.bindTexture(MCInvoker.E(minecraft), TextureMap.r);
            a3c_0.a(7);
            GL11.glMatrixMode((int)5888);
            GL11.glPopMatrix();
            GL11.glMatrixMode((int)5889);
            GL11.glPopMatrix();
            GL11.glMatrixMode((int)5888);
            a3c_0.e(agq_1.I);
        }
    }

    public static void b(a5w_0 a5w_02) {
        a0D.k();
        if (a3c_0.a(a5w_02)) {
            GlStateManagerInvoker.A();
        }
        if (OpenGlHelper.f()) {
            GL11.glEnableClientState((int)32885);
            aY_.f(aVE.aO);
            aY_.f(aVE.at);
            aY_.f(aVE.af);
        }
    }

    public static void p() {
        a0D.r();
        if (aVE.aq) {
            a3c_0.a(7);
        }
    }

    public static void a(ItemRenderer itemRenderer, float f, boolean bl) {
        a0D.k();
        GlStateManagerInvoker.c(true);
        if (bl) {
            GlStateManagerInvoker.depthFunc(519);
            GL11.glPushMatrix();
            IntBuffer intBuffer = aVE.eg;
            a3c_0.a(aVE.a6);
            aVE.a4 = true;
            aq__0.a(itemRenderer, f);
            aVE.a4 = false;
            a3c_0.a(intBuffer);
            GL11.glPopMatrix();
        }
        GlStateManagerInvoker.depthFunc(515);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        aq__0.a(itemRenderer, f);
    }

    public static void g() {
        a0D.r();
        if (aVE.aq) {
            a3c_0.a(11);
            if (aVE.cL[11] == aVE.cL[7]) {
                a3c_0.a(aVE.di);
                GlStateManagerInvoker.c(false);
            }
        }
    }

    public static void k() {
        a0D.k();
        if (aVE.aq) {
            aVE.ao = true;
            a3c_0.a(7);
        }
    }

    public static void o() {
        a3c_0.a(14);
    }

    public static void a() {
        a0D.r();
        if (aVE.aq) {
            a3c_0.a(3);
        }
    }

    public static void d() {
        GL11.glVertexPointer((int)3, (int)5126, (int)56, (long)0L);
        GL11.glColorPointer((int)4, (int)5121, (int)56, (long)12L);
        GL11.glTexCoordPointer((int)2, (int)5126, (int)56, (long)16L);
        OpenGlHelper.g(apl_1.ab);
        GL11.glTexCoordPointer((int)2, (int)5122, (int)56, (long)24L);
        OpenGlHelper.g(apl_1.S);
        GL11.glNormalPointer((int)5120, (int)56, (long)28L);
        aY_.a(aVE.aO, 2, 5126, false, 56, 32L);
        aY_.a(aVE.at, 4, 5122, false, 56, 40L);
        aY_.a(aVE.af, 3, 5122, false, 56, 48L);
    }

    public static void n() {
    }

    public static void h() {
        GlStateManagerInvoker.disableBlend();
    }

    public static void m() {
        a0D.k();
        if (aVE.aq) {
            if (aVE.G >= 2) {
                GlStateManagerInvoker.d(33995);
                a3c_0.e(agq_1.F);
                GL11.glCopyTexSubImage2D((int)3553, (int)0, (int)0, (int)0, (int)0, (int)0, (int)aVE.o, (int)aVE.R);
                a3c_0.e(agq_1.w);
                GlStateManagerInvoker.d(33984);
            }
            a3c_0.a(12);
        }
    }

    public static void c() {
        a0D.r();
        if (aVE.aq) {
            a3c_0.a(7);
        }
    }
}

