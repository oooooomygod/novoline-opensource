/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import net.KB;
import net.ResourceLocation;
import net.aa5_0;
import net.ahn_0;
import net.he_0;
import net.jt_2;
import net.nd_2;
import net.om_2;
import net.ro_2;

/*
 * Renamed from net.et
 */
public class et_2
implements KB<nd_2> {
    private jt_2 a;
    private ro_2 b = new ro_2(2.0f);
    private static ResourceLocation c = new ResourceLocation(he_0.a);

    @Override
    public void a(nd_2 nd_22, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        if (om_2.g(nd_22)) {
            boolean bl = om_2.e(nd_22);
            GlStateManagerInvoker.c(true);
            ahn_0.a(this.a, c);
            GlStateManagerInvoker.matrixMode(5890);
            GlStateManagerInvoker.loadIdentity();
            float f8 = (float)nd_22.ticksExisted + f3;
            GlStateManagerInvoker.translate(f8 * 0.01f, f8 * 0.01f, 0.0f);
            GlStateManagerInvoker.matrixMode(5888);
            GlStateManagerInvoker.enableBlend();
            float f9 = 0.5f;
            GlStateManagerInvoker.color(f9, f9, f9, 1.0f);
            GlStateManagerInvoker.disableLighting();
            GlStateManagerInvoker.b(1, 1);
            aa5_0.a(this.b, ahn_0.a(this.a));
            aa5_0.a(this.b, nd_22, f, f2, f4, f5, f6, f7);
            GlStateManagerInvoker.matrixMode(5890);
            GlStateManagerInvoker.loadIdentity();
            GlStateManagerInvoker.matrixMode(5888);
            GlStateManagerInvoker.D();
            GlStateManagerInvoker.disableBlend();
            GlStateManagerInvoker.c(bl);
        }
    }

    public et_2(jt_2 jt_22) {
        this.a = jt_22;
    }

    @Override
    public boolean a() {
        return false;
    }
}

