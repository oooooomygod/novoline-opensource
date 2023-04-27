/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import net.KB;
import net.MathHelper;
import net.ResourceLocation;
import net.hd_0;
import net.ky_1;
import net.la_0;
import net.nz_1;
import net.rx_0;
import net.sa_2;
import net.zu_1;

/*
 * Renamed from net.ams
 */
public class ams_1
implements KB<nz_1> {
    private static ResourceLocation c = new ResourceLocation(la_0.a);
    private ky_1 b;
    private rx_0 a = new rx_0(0.5f);

    public ams_1(ky_1 ky_12) {
        this.b = ky_12;
    }

    @Override
    public void a(nz_1 nz_12, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        if (hd_0.a(nz_12)) {
            GlStateManagerInvoker.c(!hd_0.c(nz_12));
            zu_1.a(this.b, c);
            GlStateManagerInvoker.matrixMode(5890);
            GlStateManagerInvoker.loadIdentity();
            float f8 = (float)nz_12.ticksExisted + f3;
            float f9 = MathHelper.cos(f8 * 0.02f) * 3.0f;
            float f10 = f8 * 0.01f;
            GlStateManagerInvoker.translate(f9, f10, 0.0f);
            GlStateManagerInvoker.matrixMode(5888);
            GlStateManagerInvoker.enableBlend();
            float f11 = 0.5f;
            GlStateManagerInvoker.color(f11, f11, f11, 1.0f);
            GlStateManagerInvoker.disableLighting();
            GlStateManagerInvoker.b(1, 1);
            sa_2.a(this.a, nz_12, f, f2, f3);
            sa_2.a(this.a, zu_1.a(this.b));
            sa_2.a(this.a, nz_12, f, f2, f4, f5, f6, f7);
            GlStateManagerInvoker.matrixMode(5890);
            GlStateManagerInvoker.loadIdentity();
            GlStateManagerInvoker.matrixMode(5888);
            GlStateManagerInvoker.D();
            GlStateManagerInvoker.disableBlend();
        }
    }

    @Override
    public boolean a() {
        return false;
    }
}

