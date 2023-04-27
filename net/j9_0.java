/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.MathInvoker;
import net.D;
import net.RenderManager;
import net.ResourceLocation;
import net.a7y_0;
import net.jo_0;
import net.nf_2;
import net.rd_1;

/*
 * Renamed from net.j9
 */
public class j9_0
extends jo_0<nf_2> {
    private static ResourceLocation m = new ResourceLocation(D.a);

    @Override
    protected void a(nf_2 nf_22, float f, float f2, float f3) {
        super.a(nf_22, f, f2, f3);
        if ((double)nf_22.aq >= 0.01) {
            float f4 = 13.0f;
            float f5 = nf_22.aU - nf_22.aq * (1.0f - f3) + 6.0f;
            float f6 = (MathInvoker.b(f5 % f4 - f4 * 0.5f) - f4 * 0.25f) / (f4 * 0.25f);
            GlStateManagerInvoker.b(6.5f * f6, 0.0f, 0.0f, 1.0f);
        }
    }

    public j9_0(RenderManager renderManager) {
        super(renderManager, new rd_1(), 0.5f);
        this.b(new a7y_0(this));
    }

    @Override
    protected ResourceLocation a(nf_2 nf_22) {
        return m;
    }
}

