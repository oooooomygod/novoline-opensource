/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.MathInvoker;
import net.World;
import net.mi_1;

/*
 * Renamed from net.mb
 */
public class mb_1
extends mi_1 {
    protected mb_1(World world, double d, double d2, double d3, double d4, double d5, double d6) {
        super(world, d, d2, d3, 0.0, 0.0, 0.0);
        this.motionX *= (double)0.3f;
        this.motionY = MathInvoker.a() * (double)0.2f + (double)0.1f;
        this.motionZ *= (double)0.3f;
        this.an = 1.0f;
        this.ao = 1.0f;
        this.av = 1.0f;
        this.c(19);
        this.c(0.01f, 0.01f);
        this.am = (int)(8.0 / (MathInvoker.a() * 0.8 + 0.2));
        this.ar = 0.0f;
        this.motionX = d4;
        this.motionY = d5;
        this.motionZ = d6;
    }

    @Override
    public void onUpdate() {
        this.prevPosX = this.posX;
        this.prevPosY = this.posY;
        this.prevPosZ = this.posZ;
        this.motionY -= (double)this.ar;
        this.moveEntity(this.motionX, this.motionY, this.motionZ);
        this.motionX *= (double)0.98f;
        this.motionY *= (double)0.98f;
        this.motionZ *= (double)0.98f;
        int n = 60 - this.am;
        float f = (float)n * 0.001f;
        this.c(f, f);
        this.c(19 + n % 4);
        if (this.am-- <= 0) {
            this.E();
        }
    }
}

