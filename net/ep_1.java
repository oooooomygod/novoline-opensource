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
import org.lwjgl.opengl.GL11;

/*
 * Renamed from net.eP
 */
public class ep_1
extends eg_0<a6R> {
    private static ResourceLocation c = new ResourceLocation(he_2.c);
    private rg_2 d = new rg_2();

    @Override
    public void a(a6R a6R2, double d, double d2, double d3, float f, int n) {
        int n2 = 0;
        if (aDH.a(a6R2)) {
            n2 = aDH.b(a6R2);
        }
        this.a(a[n]);
        GlStateManagerInvoker.matrixMode(5890);
        GlStateManagerInvoker.pushMatrix();
        GlStateManagerInvoker.c(4.0f, 4.0f, 1.0f);
        GlStateManagerInvoker.translate(0.0625f, 0.0625f, 0.0625f);
        GlStateManagerInvoker.matrixMode(5888);
        GlStateManagerInvoker.pushMatrix();
        GlStateManagerInvoker.c();
        GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
        GlStateManagerInvoker.translate((float)d, (float)d2 + 1.0f, (float)d3 + 1.0f);
        GlStateManagerInvoker.c(1.0f, -1.0f, -1.0f);
        GlStateManagerInvoker.translate(0.5f, 0.5f, 0.5f);
        boolean bl = false;
        GlStateManagerInvoker.b((float)bl, 0.0f, 1.0f, 0.0f);
        GlStateManagerInvoker.translate(-0.5f, -0.5f, -0.5f);
        float f2 = a6R2.k + (a6R2.j - a6R2.k) * f;
        f2 = 1.0f - f2;
        f2 = 1.0f - f2 * f2 * f2;
        this.d.i.t = -(f2 * (float)Math.PI / 2.0f);
        ChestESP chestESP = (ChestESP)ModuleInvoker.isEnable(ModuleRegistry.CHESTESP);
        if (amc_2.l(chestESP) && aDH.a(a6R2)) {
            if (StringPropertyInvoker.a(amc_2.c(chestESP), he_2.a)) {
                float[] fArray = amc_2.a(chestESP, aUL.c(amc_2.i(chestESP)));
                int n3 = amc_2.a(chestESP, fArray[0] / 255.0f, fArray[1] / 255.0f, fArray[2] / 255.0f, 1.0f);
                xa_0.a(this.d);
                amc_2.b(chestESP);
                xa_0.a(this.d);
                amc_2.g(chestESP);
                xa_0.a(this.d);
                amc_2.j(chestESP);
                amc_2.a(chestESP, n3);
                xa_0.a(this.d);
                amc_2.h(chestESP);
            } else if (StringPropertyInvoker.a(amc_2.c(chestESP), he_2.b)) {
                int n4 = aol_1.b(aUL.c(amc_2.k(chestESP)));
                GL11.glPushMatrix();
                GL11.glDisable((int)3553);
                GL11.glEnable((int)3042);
                GL11.glDisable((int)2896);
                GL11.glBlendFunc((int)770, (int)771);
                GlStateManagerInvoker.disableDepth();
                OpenGlHelper.a(apl_1.ab, 240.0f, 240.0f);
                GL11.glColor4f((float)((float)(n4 >> 16 & 0xFF) / 255.0f), (float)((float)(n4 >> 8 & 0xFF) / 255.0f), (float)((float)(n4 & 0xFF) / 255.0f), (float)255.0f);
                xa_0.a(this.d);
                GlStateManagerInvoker.enableDepth();
                n4 = aol_1.b(aUL.c(amc_2.f(chestESP)));
                GL11.glColor4f((float)((float)(n4 >> 16 & 0xFF) / 255.0f), (float)((float)(n4 >> 8 & 0xFF) / 255.0f), (float)((float)(n4 & 0xFF) / 255.0f), (float)255.0f);
                xa_0.a(this.d);
                GL11.glEnable((int)2896);
                GL11.glDisable((int)3042);
                GL11.glEnable((int)3553);
                GL11.glPopMatrix();
            } else {
                xa_0.a(this.d);
            }
        } else {
            xa_0.a(this.d);
        }
        GlStateManagerInvoker.y();
        GlStateManagerInvoker.popMatrix();
        GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
        GlStateManagerInvoker.matrixMode(5890);
        GlStateManagerInvoker.popMatrix();
        GlStateManagerInvoker.matrixMode(5888);
    }
}

