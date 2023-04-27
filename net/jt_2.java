/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import net.MathHelper;
import net.RenderManager;
import net.ResourceLocation;
import net.et_2;
import net.jo_0;
import net.nd_2;
import net.om_2;
import net.ro_2;
import net.ty_0;

/*
 * Renamed from net.jt
 */
public class jt_2
extends jo_0<nd_2> {
    private static ResourceLocation m = new ResourceLocation(ty_0.a);

    @Override
    protected ResourceLocation a(nd_2 nd_22) {
        return m;
    }

    @Override
    protected int a(nd_2 nd_22, float f, float f2) {
        float f3 = om_2.a(nd_22, f2);
        if ((int)(f3 * 10.0f) % 2 == 0) {
            return 0;
        }
        int n = (int)(f3 * 0.2f * 255.0f);
        n = MathHelper.a(n, 0, 255);
        return n << 24 | 0xFFFFFF;
    }

    public jt_2(RenderManager renderManager) {
        super(renderManager, new ro_2(), 0.5f);
        this.b(new et_2(this));
    }

    @Override
    protected void a(nd_2 nd_22, float f) {
        float f2 = om_2.a(nd_22, f);
        float f3 = 1.0f + MathHelper.sin(f2 * 100.0f) * f2 * 0.01f;
        f2 = MathHelper.b(f2, 0.0f, 1.0f);
        f2 *= f2;
        f2 *= f2;
        float f4 = (1.0f + f2 * 0.4f) * f3;
        float f5 = (1.0f + f2 * 0.1f) / f3;
        GlStateManagerInvoker.c(f4, f5, f4);
    }
}

