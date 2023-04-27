/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import net.RenderManager;
import net.ResourceLocation;
import net.agf_0;
import net.ams_1;
import net.ay9_0;
import net.hd_0;
import net.jo_0;
import net.nz_1;
import net.rx_0;

/*
 * Renamed from net.ky
 */
public class ky_1
extends jo_0<nz_1> {
    private static ResourceLocation n;
    private static ResourceLocation m;

    @Override
    protected void a(nz_1 nz_12, float f) {
        float f2 = 2.0f;
        int n = hd_0.e(nz_12);
        GlStateManagerInvoker.c(f2 -= ((float)n - f) / 220.0f * 0.5f, f2, f2);
    }

    static {
        m = new ResourceLocation(agf_0.b);
        n = new ResourceLocation(agf_0.a);
    }

    @Override
    public void a(nz_1 nz_12, double d, double d2, double d3, float f, float f2) {
        ay9_0.a(nz_12, true);
        super.b(nz_12, d, d2, d3, f, f2);
    }

    @Override
    protected ResourceLocation a(nz_1 nz_12) {
        int n = hd_0.e(nz_12);
        return n > 80 || n / 5 % 2 != 1 ? m : ky_1.n;
    }

    public ky_1(RenderManager renderManager) {
        super(renderManager, new rx_0(0.0f), 1.0f);
        this.b(new ams_1(this));
    }
}

