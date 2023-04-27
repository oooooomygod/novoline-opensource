/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import net.QV;
import net.RenderManager;
import net.ResourceLocation;
import net.aik_0;
import net.ayr_0;
import net.jo_0;
import net.nf_1;
import net.q1_0;

/*
 * Renamed from net.k6
 */
public class k6_0
extends jo_0<nf_1> {
    private static ResourceLocation o;
    private static ResourceLocation n;
    private static ResourceLocation m;

    static {
        n = new ResourceLocation(ayr_0.b);
        m = new ResourceLocation(ayr_0.a);
        o = new ResourceLocation(ayr_0.c);
    }

    @Override
    protected ResourceLocation a(nf_1 nf_12) {
        return QV.d(nf_12) ? m : (QV.c(nf_12) ? o : n);
    }

    @Override
    protected float a(nf_1 nf_12, float f) {
        return QV.h(nf_12);
    }

    @Override
    public void a(nf_1 nf_12, double d, double d2, double d3, float f, float f2) {
        if (QV.f(nf_12)) {
            float f3 = QV.b(nf_12, f2) * QV.c(nf_12, f2);
            GlStateManagerInvoker.b(f3, f3, f3);
        }
        super.b(nf_12, d, d2, d3, f, f2);
    }

    public k6_0(RenderManager renderManager, q1_0 q1_02, float f) {
        super(renderManager, q1_02, f);
        this.b(new aik_0(this));
    }
}

