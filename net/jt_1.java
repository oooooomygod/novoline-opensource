/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import net.RenderManager;
import net.ResourceLocation;
import net.jo_0;
import net.nJ;
import net.q1_0;
import net.vp_2;

/*
 * Renamed from net.jT
 */
public class jt_1
extends jo_0<nJ> {
    private static ResourceLocation m = new ResourceLocation(vp_2.a);

    @Override
    protected ResourceLocation a(nJ nJ2) {
        return m;
    }

    public jt_1(RenderManager renderManager, q1_0 q1_02, float f) {
        super(renderManager, q1_02, f);
    }

    @Override
    protected float a(nJ nJ2, float f) {
        return nJ2.bI + (nJ2.bD - nJ2.bI) * f;
    }

    @Override
    protected void a(nJ nJ2, float f, float f2, float f3) {
        float f4 = nJ2.bL + (nJ2.bF - nJ2.bL) * f3;
        float f5 = nJ2.bG + (nJ2.bK - nJ2.bG) * f3;
        GlStateManagerInvoker.translate(0.0f, 0.5f, 0.0f);
        GlStateManagerInvoker.b(180.0f - f2, 0.0f, 1.0f, 0.0f);
        GlStateManagerInvoker.b(f4, 1.0f, 0.0f, 0.0f);
        GlStateManagerInvoker.b(f5, 0.0f, 1.0f, 0.0f);
        GlStateManagerInvoker.translate(0.0f, -1.2f, 0.0f);
    }
}

