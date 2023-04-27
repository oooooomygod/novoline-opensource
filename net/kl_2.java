/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import net.RenderManager;
import net.ResourceLocation;
import net.aus_1;
import net.avq_2;
import net.jo_0;
import net.nm_0;
import net.r8_0;
import net.tu_0;

/*
 * Renamed from net.kl
 */
public class kl_2
extends jo_0<nm_0> {
    private static ResourceLocation m = new ResourceLocation(aus_1.a);

    @Override
    protected ResourceLocation a(nm_0 nm_02) {
        return m;
    }

    @Override
    protected void a(nm_0 nm_02, float f) {
        float f2 = 0.9375f;
        GlStateManagerInvoker.c(f2, f2, f2);
    }

    @Override
    public void a(nm_0 nm_02, double d, double d2, double d3, float f, float f2) {
        ((r8_0)this.h).n = tu_0.a(nm_02) != null;
        super.b(nm_02, d, d2, d3, f, f2);
    }

    public kl_2(RenderManager renderManager) {
        super(renderManager, new r8_0(0.0f), 0.5f);
        this.b(new avq_2(this));
    }

    @Override
    public void a() {
        GlStateManagerInvoker.translate(0.0f, 0.1875f, 0.0f);
    }
}

