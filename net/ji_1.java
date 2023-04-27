/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import deobf.EntityBoat;
import net.MathHelper;
import net.RenderManager;
import net.ResourceLocation;
import net.aV7;
import net.apk_1;
import net.j7_0;
import net.q1_0;
import net.qb_0;
import net.rq_1;

/*
 * Renamed from net.jI
 */
public class ji_1
extends j7_0<EntityBoat> {
    private static ResourceLocation f = new ResourceLocation(apk_1.a);
    protected q1_0 e = new rq_1();

    @Override
    protected ResourceLocation a(EntityBoat entityBoat) {
        return f;
    }

    public void a(EntityBoat entityBoat, double d, double d2, double d3, float f, float f2) {
        GlStateManagerInvoker.pushMatrix();
        GlStateManagerInvoker.translate((float)d, (float)d2 + 0.25f, (float)d3);
        GlStateManagerInvoker.b(180.0f - f, 0.0f, 1.0f, 0.0f);
        float f3 = (float)qb_0.c(entityBoat) - f2;
        float f4 = qb_0.b(entityBoat) - f2;
        if (f4 < 0.0f) {
            f4 = 0.0f;
        }
        if (f3 > 0.0f) {
            GlStateManagerInvoker.b(MathHelper.sin(f3) * f3 * f4 / 10.0f * (float)qb_0.a(entityBoat), 1.0f, 0.0f, 0.0f);
        }
        float f5 = 0.75f;
        GlStateManagerInvoker.c(f5, f5, f5);
        GlStateManagerInvoker.c(1.0f / f5, 1.0f / f5, 1.0f / f5);
        this.b(entityBoat);
        GlStateManagerInvoker.c(-1.0f, -1.0f, 1.0f);
        aV7.a(this.e, entityBoat, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, 0.0625f);
        GlStateManagerInvoker.popMatrix();
        super.b(entityBoat, d, d2, d3, f, f2);
    }

    public ji_1(RenderManager renderManager) {
        super(renderManager);
        this.c = 0.5f;
    }
}

