/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import net.minecraft.client.entity.AbstractClientPlayer;

/*
 * Renamed from net.Sw
 */
public class sw_0
implements KB<AbstractClientPlayer> {
    private kj_2 a;

    @Override
    public boolean a() {
        return true;
    }

    public sw_0(kj_2 kj_22) {
        this.a = kj_22;
    }

    @Override
    public void a(AbstractClientPlayer abstractClientPlayer, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        if (aUi.q(abstractClientPlayer).equals(aZI.a) && aUi.l(abstractClientPlayer) && !aUi.p(abstractClientPlayer)) {
            dj_1.a(this.a, aUi.a(abstractClientPlayer));
            int n = 0;
            while (true) {
                float f8 = abstractClientPlayer.prevRotationYaw + (abstractClientPlayer.rotationYaw - abstractClientPlayer.prevRotationYaw) * f3 - (abstractClientPlayer.ay + (abstractClientPlayer.aD - abstractClientPlayer.ay) * f3);
                float f9 = abstractClientPlayer.prevRotationPitch + (abstractClientPlayer.rotationPitch - abstractClientPlayer.prevRotationPitch) * f3;
                GlStateManagerInvoker.pushMatrix();
                GlStateManagerInvoker.b(f8, 0.0f, 1.0f, 0.0f);
                GlStateManagerInvoker.b(f9, 1.0f, 0.0f, 0.0f);
                GlStateManagerInvoker.translate(0.375f * (float)(n * 2 - 1), 0.0f, 0.0f);
                GlStateManagerInvoker.translate(0.0f, -0.375f, 0.0f);
                GlStateManagerInvoker.b(-f9, 1.0f, 0.0f, 0.0f);
                GlStateManagerInvoker.b(-f8, 0.0f, 1.0f, 0.0f);
                float f10 = 1.3333334f;
                GlStateManagerInvoker.c(f10, f10, f10);
                aoe_0.b(dj_1.a(this.a), 0.0625f);
                GlStateManagerInvoker.popMatrix();
                ++n;
            }
        }
    }
}

