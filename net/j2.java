/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import net.RenderManager;
import net.ResourceLocation;
import net.aM2;
import net.aM6;
import net.j7_0;
import net.nn_1;
import net.ra_2;

public class j2
extends j7_0<nn_1> {
    private ra_2 f = new ra_2();
    private static ResourceLocation e = new ResourceLocation(aM2.a);

    public void a(nn_1 nn_12, double d, double d2, double d3, float f, float f2) {
        GlStateManagerInvoker.pushMatrix();
        GlStateManagerInvoker.A();
        GlStateManagerInvoker.translate((float)d, (float)d2, (float)d3);
        float f3 = 0.0625f;
        GlStateManagerInvoker.c();
        GlStateManagerInvoker.c(-1.0f, -1.0f, 1.0f);
        GlStateManagerInvoker.enableAlpha();
        this.b(nn_12);
        aM6.a(this.f, nn_12, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f3);
        GlStateManagerInvoker.popMatrix();
        super.b(nn_12, d, d2, d3, f, f2);
    }

    public j2(RenderManager renderManager) {
        super(renderManager);
    }

    @Override
    protected ResourceLocation a(nn_1 nn_12) {
        return e;
    }
}

