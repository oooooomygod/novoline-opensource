/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.ModuleInvoker;
import cc.novoline.invoke.StringPropertyInvoker;
import cc.novoline.modules.visual.ChestESP;
import deobf.ModuleRegistry;
import deobf.OpenGlHelper;
import java.util.Calendar;

import org.lwjgl.opengl.GL11;

/*
 * Renamed from net.eB
 */
public class eb_1
extends eg_0<a6O> {
    private static ResourceLocation e;
    private static ResourceLocation f;
    private rg_2 i;
    private static ResourceLocation c;
    private rg_2 d = new rg_2();
    private static ResourceLocation g;
    private boolean k;
    private static ResourceLocation h;
    private static ResourceLocation j;

    @Override
    public void a(a6O a6O2, double d, double d2, double d3, float f, int n) {
        Object object;
        int n2;
        GlStateManagerInvoker.enableDepth();
        GlStateManagerInvoker.depthFunc(515);
        GlStateManagerInvoker.c(true);
        if (!aM0.c(a6O2)) {
            n2 = 0;
        } else {
            object = aM0.e(a6O2);
            n2 = aM0.b(a6O2);
            if (object instanceof fs_1) {
                vz_1.b((fs_1)object, a6O2.b(), aM0.d(a6O2), aV8.q(a6O2.b(), aM0.d(a6O2)));
                n2 = aM0.b(a6O2);
            }
            aM0.f(a6O2);
        }
        if (a6O2.u == null && a6O2.l == null) {
            float f2;
            if (a6O2.k == null && a6O2.p == null) {
                object = this.d;
                this.a(a[n]);
                GlStateManagerInvoker.matrixMode(5890);
                GlStateManagerInvoker.pushMatrix();
                GlStateManagerInvoker.c(4.0f, 4.0f, 1.0f);
                GlStateManagerInvoker.translate(0.0625f, 0.0625f, 0.0625f);
                GlStateManagerInvoker.matrixMode(5888);
            } else {
                object = this.i;
                this.a(a[n]);
                GlStateManagerInvoker.matrixMode(5890);
                GlStateManagerInvoker.pushMatrix();
                GlStateManagerInvoker.c(8.0f, 4.0f, 1.0f);
                GlStateManagerInvoker.translate(0.0625f, 0.0625f, 0.0625f);
                GlStateManagerInvoker.matrixMode(5888);
            }
            GlStateManagerInvoker.pushMatrix();
            GlStateManagerInvoker.c();
            GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
            GlStateManagerInvoker.translate((float)d, (float)d2 + 1.0f, (float)d3 + 1.0f);
            GlStateManagerInvoker.c(1.0f, -1.0f, -1.0f);
            GlStateManagerInvoker.translate(0.5f, 0.5f, 0.5f);
            int n3 = 0;
            if (n2 == 2) {
                n3 = 180;
            }
            if (n2 == 3) {
                n3 = 0;
            }
            if (n2 == 4) {
                n3 = 90;
            }
            if (n2 == 5) {
                n3 = -90;
            }
            if (n2 == 2 && a6O2.k != null) {
                GlStateManagerInvoker.translate(1.0f, 0.0f, 0.0f);
            }
            if (n2 == 5 && a6O2.p != null) {
                GlStateManagerInvoker.translate(0.0f, 0.0f, -1.0f);
            }
            GlStateManagerInvoker.b((float)n3, 0.0f, 1.0f, 0.0f);
            GlStateManagerInvoker.translate(-0.5f, -0.5f, -0.5f);
            float f3 = a6O2.o + (a6O2.t - a6O2.o) * f;
            if (a6O2.u != null && (f2 = a6O2.u.o + (a6O2.u.t - a6O2.u.o) * f) > f3) {
                f3 = f2;
            }
            if (a6O2.l != null && (f2 = a6O2.l.o + (a6O2.l.t - a6O2.l.o) * f) > f3) {
                f3 = f2;
            }
            f3 = 1.0f - f3;
            f3 = 1.0f - f3 * f3 * f3;
            ((rg_2)object).i.t = -(f3 * (float)Math.PI / 2.0f);
            ChestESP chestESP = (ChestESP)ModuleInvoker.isEnable(ModuleRegistry.CHESTESP);
            if (amc_2.l(chestESP) && aM0.c(a6O2)) {
                if (StringPropertyInvoker.a(amc_2.c(chestESP), aie_0.c) || StringPropertyInvoker.a(amc_2.c(chestESP), aie_0.f)) {
                    float[] fArray = amc_2.a(chestESP, aUL.c(amc_2.d(chestESP)));
                    int n4 = amc_2.a(chestESP, fArray[0] / 255.0f, fArray[1] / 255.0f, fArray[2] / 255.0f, 1.0f);
                    xa_0.a((rg_2)object);
                    amc_2.b(chestESP);
                    xa_0.a((rg_2)object);
                    amc_2.a(chestESP);
                    xa_0.a((rg_2)object);
                    xa_0.a((rg_2)object);
                    amc_2.e(chestESP);
                    amc_2.a(chestESP, n4);
                    xa_0.a((rg_2)object);
                    amc_2.h(chestESP);
                } else if (StringPropertyInvoker.a(amc_2.c(chestESP), aie_0.d)) {
                    int n5 = aol_1.b(aUL.c(amc_2.k(chestESP)));
                    GL11.glPushMatrix();
                    GL11.glDisable((int)3553);
                    GL11.glEnable((int)3042);
                    GL11.glDisable((int)2896);
                    GL11.glBlendFunc((int)770, (int)771);
                    GlStateManagerInvoker.disableDepth();
                    OpenGlHelper.a(apl_1.ab, 240.0f, 240.0f);
                    GL11.glColor4f((float)((float)(n5 >> 16 & 0xFF) / 255.0f), (float)((float)(n5 >> 8 & 0xFF) / 255.0f), (float)((float)(n5 & 0xFF) / 255.0f), (float)255.0f);
                    xa_0.a((rg_2)object);
                    GlStateManagerInvoker.enableDepth();
                    n5 = aol_1.b(aUL.c(amc_2.f(chestESP)));
                    GL11.glColor4f((float)((float)(n5 >> 16 & 0xFF) / 255.0f), (float)((float)(n5 >> 8 & 0xFF) / 255.0f), (float)((float)(n5 & 0xFF) / 255.0f), (float)255.0f);
                    xa_0.a((rg_2)object);
                    GL11.glEnable((int)2896);
                    GL11.glDisable((int)3042);
                    GL11.glEnable((int)3553);
                    GL11.glPopMatrix();
                } else {
                    xa_0.a((rg_2)object);
                }
            } else {
                xa_0.a((rg_2)object);
            }
            GlStateManagerInvoker.y();
            GlStateManagerInvoker.popMatrix();
            GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
            GlStateManagerInvoker.matrixMode(5890);
            GlStateManagerInvoker.popMatrix();
            GlStateManagerInvoker.matrixMode(5888);
        }
    }

    static {
        c = new ResourceLocation(aie_0.g);
        g = new ResourceLocation(aie_0.e);
        e = new ResourceLocation(aie_0.i);
        h = new ResourceLocation(aie_0.a);
        j = new ResourceLocation(aie_0.h);
        f = new ResourceLocation(aie_0.b);
    }

    public eb_1() {
        this.i = new rc_1();
        Calendar calendar = afv_2.a();
        if (afv_2.a(calendar, 2) + 1 == 12 && afv_2.a(calendar, 5) >= 24 && afv_2.a(calendar, 5) <= 26) {
            this.k = true;
        }
    }
}

