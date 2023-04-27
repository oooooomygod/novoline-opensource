/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import net.MathHelper;
import net.RenderManager;
import net.ResourceLocation;
import net.aV7;
import net.j7_0;
import net.ox_2;
import net.q1_0;
import net.r2_0;
import net.vk_2;

/*
 * Renamed from net.kW
 */
public class kw_0
extends j7_0<ox_2> {
    private static ResourceLocation e = new ResourceLocation(vk_2.a);
    private q1_0 f = new r2_0(0.0f, true);

    public void a(ox_2 ox_22, double d, double d2, double d3, float f, float f2) {
        float f3 = (float)ox_22.ak + f2;
        GlStateManagerInvoker.pushMatrix();
        GlStateManagerInvoker.translate((float)d, (float)d2, (float)d3);
        this.a(e);
        float f4 = MathHelper.sin(f3 * 0.2f) / 2.0f + 0.5f;
        f4 = f4 * f4 + f4;
        aV7.a(this.f, ox_22, 0.0f, f3 * 3.0f, f4 * 0.2f, 0.0f, 0.0f, 0.0625f);
        GlStateManagerInvoker.popMatrix();
        super.b(ox_22, d, d2, d3, f, f2);
    }

    public kw_0(RenderManager renderManager) {
        super(renderManager);
        this.c = 0.5f;
    }

    @Override
    protected ResourceLocation a(ox_2 ox_22) {
        return e;
    }
}

