/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import net.MathHelper;
import net.ResourceLocation;
import net.a6D;
import net.aec_1;
import net.eg_0;
import net.ek_1;
import net.ri_1;

/*
 * Renamed from net.eF
 */
public class ef_1
extends eg_0<a6D> {
    private ri_1 d = new ri_1();
    private static ResourceLocation c = new ResourceLocation(ek_1.a);

    @Override
    public void a(a6D a6D2, double d, double d2, double d3, float f, int n) {
        float f2;
        GlStateManagerInvoker.pushMatrix();
        GlStateManagerInvoker.translate((float)d + 0.5f, (float)d2 + 0.75f, (float)d3 + 0.5f);
        float f3 = (float)a6D2.o + f;
        GlStateManagerInvoker.translate(0.0f, 0.1f + MathHelper.sin(f3 * 0.1f) * 0.01f, 0.0f);
        for (f2 = a6D2.r - a6D2.m; f2 >= (float)Math.PI; f2 -= (float)Math.PI * 2) {
        }
        while (f2 < (float)(-Math.PI)) {
            f2 += (float)Math.PI * 2;
        }
        float f4 = a6D2.m + f2 * f;
        GlStateManagerInvoker.b(-f4 * 180.0f / (float)Math.PI, 0.0f, 1.0f, 0.0f);
        GlStateManagerInvoker.b(80.0f, 0.0f, 0.0f, 1.0f);
        this.a(c);
        float f5 = a6D2.s + (a6D2.t - a6D2.s) * f + 0.25f;
        float f6 = a6D2.s + (a6D2.t - a6D2.s) * f + 0.75f;
        f5 = (f5 - (float)MathHelper.a((double)f5)) * 1.6f - 0.3f;
        f6 = (f6 - (float)MathHelper.a((double)f6)) * 1.6f - 0.3f;
        if (f5 < 0.0f) {
            f5 = 0.0f;
        }
        if (f6 < 0.0f) {
            f6 = 0.0f;
        }
        if (f5 > 1.0f) {
            f5 = 1.0f;
        }
        if (f6 > 1.0f) {
            f6 = 1.0f;
        }
        float f7 = a6D2.j + (a6D2.p - a6D2.j) * f;
        GlStateManagerInvoker.b();
        aec_1.a(this.d, null, f3, f5, f6, f7, 0.0f, 0.0625f);
        GlStateManagerInvoker.popMatrix();
    }
}

