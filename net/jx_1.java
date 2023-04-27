/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import net.RenderManager;
import net.ResourceLocation;
import net.a98;
import net.aYI;
import net.jo_0;
import net.mr_1;
import net.n8_0;
import net.q1_0;

/*
 * Renamed from net.jX
 */
public class jx_1
extends jo_0<n8_0> {
    private static ResourceLocation m = new ResourceLocation(a98.a);
    private float n;

    public jx_1(RenderManager renderManager, q1_0 q1_02, float f, float f2) {
        super(renderManager, q1_02, f * f2);
        this.n = f2;
        this.b(new mr_1(this));
        this.b(new aYI(this, this));
    }

    @Override
    protected void a(n8_0 n8_02, float f) {
        GlStateManagerInvoker.c(this.n, this.n, this.n);
    }

    @Override
    protected ResourceLocation a(n8_0 n8_02) {
        return m;
    }

    @Override
    public void a() {
        GlStateManagerInvoker.translate(0.0f, 0.1875f, 0.0f);
    }
}

