/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.EntityLivingBase;
import net.MathHelper;
import net._v_0;
import net.atn_0;
import net.lw_1;
import net.nw_1;

/*
 * Renamed from net.alu
 */
class alu_1
extends _v_0 {
    private nw_1 b;

    public alu_1(nw_1 nw_12) {
        this.b = nw_12;
        this.a(2);
    }

    @Override
    public void d() {
        if (lw_1.b(this.b) == null) {
            this.b.aD = this.b.rotationYaw = -((float)MathHelper.c(this.b.motionX, this.b.motionZ)) * 180.0f / (float)Math.PI;
        } else {
            EntityLivingBase entityLivingBase = lw_1.b(this.b);
            double d = 64.0;
            if (atn_0.b(entityLivingBase, this.b) < d * d) {
                double d2 = entityLivingBase.posX - this.b.posX;
                double d3 = entityLivingBase.posZ - this.b.posZ;
                this.b.aD = this.b.rotationYaw = -((float)MathHelper.c(d2, d3)) * 180.0f / (float)Math.PI;
            }
        }
    }

    @Override
    public boolean g() {
        return true;
    }
}

