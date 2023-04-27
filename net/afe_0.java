/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import net.minecraft.client.entity.AbstractClientPlayer;

/*
 * Renamed from net.afE
 */
public class afe_0
implements KB<AbstractClientPlayer> {
    private kp_2 a;

    @Override
    public void a(AbstractClientPlayer abstractClientPlayer, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        aEF.b();
        if (aUi.e(abstractClientPlayer) && !aUi.p(abstractClientPlayer) && aUi.a(abstractClientPlayer, aea_1.CAPE) && aUi.o(abstractClientPlayer) != null) {
            GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
            OY.a(this.a, aUi.o(abstractClientPlayer));
            GlStateManagerInvoker.pushMatrix();
            GlStateManagerInvoker.translate(0.0f, 0.0f, 0.125f);
            double d = abstractClientPlayer.bq + (abstractClientPlayer.bF - abstractClientPlayer.bq) * (double)f3 - (abstractClientPlayer.prevPosX + (abstractClientPlayer.posX - abstractClientPlayer.prevPosX) * (double)f3);
            double d2 = abstractClientPlayer.bG + (abstractClientPlayer.bj - abstractClientPlayer.bG) * (double)f3 - (abstractClientPlayer.prevPosY + (abstractClientPlayer.posY - abstractClientPlayer.prevPosY) * (double)f3);
            double d3 = abstractClientPlayer.by + (abstractClientPlayer.bN - abstractClientPlayer.by) * (double)f3 - (abstractClientPlayer.prevPosZ + (abstractClientPlayer.posZ - abstractClientPlayer.prevPosZ) * (double)f3);
            float f8 = abstractClientPlayer.ay + (abstractClientPlayer.aD - abstractClientPlayer.ay) * f3;
            double d4 = MathHelper.sin(f8 * (float)Math.PI / 180.0f);
            double d5 = -MathHelper.cos(f8 * (float)Math.PI / 180.0f);
            float f9 = (float)d2 * 10.0f;
            f9 = MathHelper.b(f9, -6.0f, 32.0f);
            float f10 = (float)(d * d4 + d3 * d5) * 100.0f;
            float f11 = (float)(d * d5 - d3 * d4) * 100.0f;
            if (f10 < 0.0f) {
                f10 = 0.0f;
            }
            float f12 = abstractClientPlayer.bn + (abstractClientPlayer.bO - abstractClientPlayer.bn) * f3;
            f9 += MathHelper.sin((abstractClientPlayer.c + (abstractClientPlayer.u - abstractClientPlayer.c) * f3) * 6.0f) * 32.0f * f12;
            if (aUi.m(abstractClientPlayer)) {
                f9 += 25.0f;
            }
            GlStateManagerInvoker.b(6.0f + f10 / 2.0f + f9, 1.0f, 0.0f, 0.0f);
            GlStateManagerInvoker.b(f11 / 2.0f, 0.0f, 0.0f, 1.0f);
            GlStateManagerInvoker.b(-f11 / 2.0f, 0.0f, 1.0f, 0.0f);
            GlStateManagerInvoker.b(180.0f, 0.0f, 1.0f, 0.0f);
            aoe_0.a(OY.a(this.a), 0.0625f);
            GlStateManagerInvoker.popMatrix();
        }
    }

    public afe_0(kp_2 kp_22) {
        this.a = kp_22;
    }

    @Override
    public boolean a() {
        return false;
    }
}

