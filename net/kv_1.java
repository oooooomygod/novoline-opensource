/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import net.RenderManager;
import net.ResourceLocation;
import net.aFN;
import net.ak8_0;
import net.akj_2;
import net.j7_0;
import net.oe_1;
import net.rq_2;

/*
 * Renamed from net.kV
 */
public class kv_1
extends j7_0<oe_1> {
    private rq_2 g = new rq_2();
    private static ResourceLocation f = new ResourceLocation(ak8_0.a);
    private static ResourceLocation e = new ResourceLocation(ak8_0.b);

    private float a(float f, float f2, float f3) {
        float f4;
        for (f4 = f2 - f; f4 < -180.0f; f4 += 360.0f) {
        }
        while (f4 >= 180.0f) {
            f4 -= 360.0f;
        }
        return f + f3 * f4;
    }

    @Override
    protected ResourceLocation a(oe_1 oe_12) {
        return akj_2.a(oe_12) ? f : e;
    }

    public void a(oe_1 oe_12, double d, double d2, double d3, float f, float f2) {
        GlStateManagerInvoker.pushMatrix();
        GlStateManagerInvoker.A();
        float f3 = this.a(oe_12.prevRotationYaw, oe_12.rotationYaw, f2);
        float f4 = oe_12.prevRotationPitch + (oe_12.rotationPitch - oe_12.prevRotationPitch) * f2;
        GlStateManagerInvoker.translate((float)d, (float)d2, (float)d3);
        float f5 = 0.0625f;
        GlStateManagerInvoker.c();
        GlStateManagerInvoker.c(-1.0f, -1.0f, 1.0f);
        GlStateManagerInvoker.enableAlpha();
        this.b(oe_12);
        aFN.a(this.g, oe_12, 0.0f, 0.0f, 0.0f, f3, f4, f5);
        GlStateManagerInvoker.popMatrix();
        super.b(oe_12, d, d2, d3, f, f2);
    }

    public kv_1(RenderManager renderManager) {
        super(renderManager);
    }
}

