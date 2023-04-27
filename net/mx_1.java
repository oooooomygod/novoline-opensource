/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.MathInvoker;
import net.World;
import net.a5_0;
import net.mi_1;

/*
 * Renamed from net.mX
 */
public class mx_1
extends mi_1 {
    protected mx_1(World world, double d, double d2, double d3, double d4, double d5, double d6) {
        super(world, d, d2, d3, d4, d5, d6);
        float f;
        this.an = f = a5_0.e(this.Q) * 0.1f + 0.2f;
        this.ao = f;
        this.av = f;
        this.c(0);
        this.c(0.02f, 0.02f);
        this.au *= a5_0.e(this.Q) * 0.6f + 0.5f;
        this.motionX *= (double)0.02f;
        this.motionY *= (double)0.02f;
        this.motionZ *= (double)0.02f;
        this.am = (int)(20.0 / (MathInvoker.a() * 0.8 + 0.2));
        this.H = true;
    }

    @Override
    public void onUpdate() {
        this.prevPosX = this.posX;
        this.prevPosY = this.posY;
        this.prevPosZ = this.posZ;
        this.moveEntity(this.motionX, this.motionY, this.motionZ);
        this.motionX *= 0.99;
        this.motionY *= 0.99;
        this.motionZ *= 0.99;
        if (this.am-- <= 0) {
            this.E();
        }
    }
}

