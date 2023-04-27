/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.MathInvoker;
import deobf.EntityLivingBase;
import net.MathHelper;

public class aX5 {
    private float c;
    private EntityLivingBase a;
    private int b;

    public aX5(EntityLivingBase entityLivingBase) {
        this.a = entityLivingBase;
    }

    public void a() {
        double d = this.a.posX - this.a.prevPosX;
        double d2 = this.a.posZ - this.a.prevPosZ;
        if (d * d + d2 * d2 > 2.500000277905201E-7) {
            this.a.aD = this.a.rotationYaw;
            this.c = this.a.aP = this.a(this.a.aD, this.a.aP, 75.0f);
            this.b = 0;
        } else {
            float f = 75.0f;
            if (MathInvoker.b(this.a.aP - this.c) > 15.0f) {
                this.b = 0;
                this.c = this.a.aP;
            } else {
                ++this.b;
                if (this.b > 10) {
                    f = MathInvoker.b(1.0f - (float)(this.b - 10) / 10.0f, 0.0f) * 75.0f;
                }
            }
            this.a.aD = this.a(this.a.aP, this.a.aD, f);
        }
    }

    private float a(float f, float f2, float f3) {
        float f4 = MathHelper.a(f - f2);
        if (f4 < -f3) {
            f4 = -f3;
        }
        if (f4 >= f3) {
            f4 = f3;
        }
        return f - f4;
    }
}

