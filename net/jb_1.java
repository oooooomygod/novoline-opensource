/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import net.MathHelper;
import net.RenderManager;
import net.ResourceLocation;
import net.aia_0;
import net.al_2;
import net.jo_0;
import net.n1_0;
import net.rl_2;

/*
 * Renamed from net.jB
 */
public class jb_1
extends jo_0<n1_0> {
    private static ResourceLocation m = new ResourceLocation(al_2.a);

    public jb_1(RenderManager renderManager) {
        super(renderManager, new rl_2(), 0.25f);
    }

    @Override
    protected ResourceLocation a(n1_0 n1_02) {
        return m;
    }

    @Override
    protected void a(n1_0 n1_02, float f, float f2, float f3) {
        if (!aia_0.a(n1_02)) {
            GlStateManagerInvoker.translate(0.0f, MathHelper.cos(f * 0.3f) * 0.1f, 0.0f);
        } else {
            GlStateManagerInvoker.translate(0.0f, -0.1f, 0.0f);
        }
        super.a(n1_02, f, f2, f3);
    }

    @Override
    protected void a(n1_0 n1_02, float f) {
        GlStateManagerInvoker.c(0.35f, 0.35f, 0.35f);
    }
}

