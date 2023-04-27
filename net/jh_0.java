/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import net.RenderManager;
import net.ResourceLocation;
import net.aAv;
import net.agr_0;
import net.jo_0;
import net.nk_1;
import net.rr_0;

/*
 * Renamed from net.jH
 */
public class jh_0
extends jo_0<nk_1> {
    private static ResourceLocation m = new ResourceLocation(aAv.a);

    public jh_0(RenderManager renderManager) {
        super(renderManager, new rr_0(), 0.25f);
    }

    @Override
    protected void a(nk_1 nk_12, float f) {
        int n = agr_0.a(nk_12);
        float f2 = (nk_12.bE + (nk_12.bC - nk_12.bE) * f) / ((float)n * 0.5f + 1.0f);
        float f3 = 1.0f / (f2 + 1.0f);
        float f4 = n;
        GlStateManagerInvoker.c(f3 * f4, 1.0f / f3 * f4, f3 * f4);
    }

    @Override
    protected ResourceLocation a(nk_1 nk_12) {
        return m;
    }
}

