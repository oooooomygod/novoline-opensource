/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import net.RenderManager;
import net.ResourceLocation;
import net.ae8_0;
import net.apg_1;
import net.apt_2;
import net.jo_0;
import net.ny_1;
import net.q1_0;

/*
 * Renamed from net.jY
 */
public class jy_1
extends jo_0<ny_1> {
    private static ResourceLocation m = new ResourceLocation(ae8_0.a);

    @Override
    protected void a(ny_1 ny_12, float f) {
        float f2 = apt_2.h(ny_12);
        float f3 = (ny_12.bE + (ny_12.bC - ny_12.bE) * f) / (f2 * 0.5f + 1.0f);
        float f4 = 1.0f / (f3 + 1.0f);
        GlStateManagerInvoker.c(f4 * f2, 1.0f / f4 * f2, f4 * f2);
    }

    @Override
    protected ResourceLocation a(ny_1 ny_12) {
        return m;
    }

    public jy_1(RenderManager renderManager, q1_0 q1_02, float f) {
        super(renderManager, q1_02, f);
        this.b(new apg_1(this));
    }

    @Override
    public void a(ny_1 ny_12, double d, double d2, double d3, float f, float f2) {
        this.c = 0.25f * (float)apt_2.h(ny_12);
        super.b(ny_12, d, d2, d3, f, f2);
    }
}

