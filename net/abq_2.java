/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MathInvoker;
import deobf.EntityLivingBase;
import java.util.Random;
import deobf.EntityArrow;

/*
 * Renamed from net.abq
 */
public class abq_2
implements KB<EntityLivingBase> {
    private jg_1 a;

    @Override
    public boolean a() {
        return false;
    }

    @Override
    public void a(EntityLivingBase entityLivingBase, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        int n = atn_0.w(entityLivingBase);
        EntityArrow entityArrow = new EntityArrow(entityLivingBase.worldObj, entityLivingBase.posX, entityLivingBase.posY, entityLivingBase.posZ);
        Random random = new Random(atn_0.h(entityLivingBase));
        ne_0.e();
        for (int i = 0; i < n; ++i) {
            GlStateManagerInvoker.pushMatrix();
            a5Y a5Y2 = aV7.a(fl_0.a(this.a), random);
            kf_0 kf_02 = (kf_0)ListInvoker.get(a5Y2.a, a5_0.a(random, ListInvoker.size(a5Y2.a)));
            up_0.a(a5Y2, 0.0625f);
            float f8 = a5_0.e(random);
            float f9 = a5_0.e(random);
            float f10 = a5_0.e(random);
            float f11 = (kf_02.c + (kf_02.i - kf_02.c) * f8) / 16.0f;
            float f12 = (kf_02.b + (kf_02.a - kf_02.b) * f9) / 16.0f;
            float f13 = (kf_02.g + (kf_02.e - kf_02.g) * f10) / 16.0f;
            GlStateManagerInvoker.translate(f11, f12, f13);
            f8 = f8 * 2.0f - 1.0f;
            f9 = f9 * 2.0f - 1.0f;
            f10 = f10 * 2.0f - 1.0f;
            float f14 = MathHelper.g((f8 *= -1.0f) * f8 + (f10 *= -1.0f) * f10);
            entityArrow.prevRotationYaw = entityArrow.rotationYaw = (float)(MathInvoker.c(f8, f10) * 180.0 / Math.PI);
            entityArrow.prevRotationPitch = entityArrow.rotationPitch = (float)(MathInvoker.c(f9 *= -1.0f, f14) * 180.0 / Math.PI);
            double d = 0.0;
            double d2 = 0.0;
            double d3 = 0.0;
            FT.a(fl_0.b(this.a), entityArrow, d, d2, d3, 0.0f, f3);
            GlStateManagerInvoker.popMatrix();
        }
        ne_0.a();
    }

    public abq_2(jg_1 jg_12) {
        this.a = jg_12;
    }
}

