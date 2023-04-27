/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.MathInvoker;
import net.World;
import net.a5_0;
import net.mi_1;

/*
 * Renamed from net.mw
 */
public class mw_1
extends mi_1 {
    protected mw_1(World world, double d, double d2, double d3, double d4, double d5, double d6) {
        super(world, d, d2, d3, d4, d5, d6);
        this.motionX = d4 + (MathInvoker.a() * 2.0 - 1.0) * (double)0.05f;
        this.motionY = d5 + (MathInvoker.a() * 2.0 - 1.0) * (double)0.05f;
        this.motionZ = d6 + (MathInvoker.a() * 2.0 - 1.0) * (double)0.05f;
        this.ao = this.av = a5_0.e(this.Q) * 0.3f + 0.7f;
        this.an = this.av;
        this.au = a5_0.e(this.Q) * a5_0.e(this.Q) * 6.0f + 1.0f;
        this.am = (int)(16.0 / ((double)a5_0.e(this.Q) * 0.8 + 0.2)) + 2;
    }

    @Override
    public void onUpdate() {
        this.prevPosX = this.posX;
        this.prevPosY = this.posY;
        this.prevPosZ = this.posZ;
        if (this.ay++ >= this.am) {
            this.E();
        }
        this.c(7 - this.ay * 8 / this.am);
        this.motionY += 0.004;
        this.moveEntity(this.motionX, this.motionY, this.motionZ);
        this.motionX *= (double)0.9f;
        this.motionY *= (double)0.9f;
        this.motionZ *= (double)0.9f;
        if (this.onGround) {
            this.motionX *= (double)0.7f;
            this.motionZ *= (double)0.7f;
        }
    }
}

