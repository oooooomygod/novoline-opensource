/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import net.minecraft.client.entity.AbstractClientPlayer;
import deobf.EntityLivingBase;

public class Tf
implements KB {
    private kj_2 a;

    @Override
    public boolean a() {
        return false;
    }

    public void a(EntityLivingBase entityLivingBase, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.a((AbstractClientPlayer)entityLivingBase, f, f2, f3, f4, f5, f6, f7);
    }

    public Tf(kj_2 kj_22) {
        this.a = kj_22;
    }

    public void a(AbstractClientPlayer abstractClientPlayer, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        if (aUi.e(abstractClientPlayer) && !aUi.p(abstractClientPlayer) && aUi.o(abstractClientPlayer) != null) {
            GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
            dj_1.a(this.a, aUi.o(abstractClientPlayer));
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
            if (f10 > 165.0f) {
                f10 = 165.0f;
            }
            float f12 = abstractClientPlayer.bn + (abstractClientPlayer.bO - abstractClientPlayer.bn) * f3;
            f9 += MathHelper.sin((abstractClientPlayer.c + (abstractClientPlayer.u - abstractClientPlayer.c) * f3) * 6.0f) * 32.0f * f12;
            if (aUi.m(abstractClientPlayer)) {
                f9 += 25.0f;
                GlStateManagerInvoker.translate(0.0f, 0.142f, -0.0178f);
            }
            GlStateManagerInvoker.b(6.0f + f10 / 2.0f + f9, 1.0f, 0.0f, 0.0f);
            GlStateManagerInvoker.b(f11 / 2.0f, 0.0f, 0.0f, 1.0f);
            GlStateManagerInvoker.b(-f11 / 2.0f, 0.0f, 1.0f, 0.0f);
            GlStateManagerInvoker.b(180.0f, 0.0f, 1.0f, 0.0f);
            aoe_0.a(dj_1.a(this.a), 0.0625f);
            GlStateManagerInvoker.popMatrix();
        }
    }
}

