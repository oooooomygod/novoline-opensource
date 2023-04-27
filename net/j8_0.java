/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import net.O;
import net.RenderManager;
import net.ResourceLocation;
import net.jo_0;
import net.lw_1;
import net.nw_1;
import net.ru_0;

/*
 * Renamed from net.j8
 */
public class j8_0
extends jo_0<nw_1> {
    private static ResourceLocation n;
    private static ResourceLocation m;

    static {
        m = new ResourceLocation(O.b);
        n = new ResourceLocation(O.a);
    }

    @Override
    protected ResourceLocation a(nw_1 nw_12) {
        return lw_1.d(nw_12) ? n : m;
    }

    @Override
    protected void a(nw_1 nw_12, float f) {
        float f2 = 1.0f;
        float f3 = (8.0f + f2) / 2.0f;
        float f4 = (8.0f + 1.0f / f2) / 2.0f;
        GlStateManagerInvoker.c(f4, f3, f4);
        GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
    }

    public j8_0(RenderManager renderManager) {
        super(renderManager, new ru_0(), 0.5f);
    }
}

