/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.MathInvoker;
import deobf.Entity;
import net.minecraft.renderer.WorldRenderer;

/*
 * Renamed from net.nu
 */
public class nu_2
extends mi_1 {
    float az;

    protected nu_2(World world, double d, double d2, double d3, float f, float f2, float f3, float f4) {
        super(world, d, d2, d3, 0.0, 0.0, 0.0);
        this.motionX *= (double)0.1f;
        this.motionY *= (double)0.1f;
        this.motionZ *= (double)0.1f;
        if (f2 == 0.0f) {
            f2 = 1.0f;
        }
        float f5 = (float)MathInvoker.a() * 0.4f + 0.6f;
        this.an = ((float)(MathInvoker.a() * (double)0.2f) + 0.8f) * f2 * f5;
        this.ao = ((float)(MathInvoker.a() * (double)0.2f) + 0.8f) * f3 * f5;
        this.av = ((float)(MathInvoker.a() * (double)0.2f) + 0.8f) * f4 * f5;
        this.au *= 0.75f;
        this.au *= f;
        this.az = this.au;
        this.am = (int)(8.0 / (MathInvoker.a() * 0.8 + 0.2));
        this.am = (int)((float)this.am * f);
        this.H = false;
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
        this.moveEntity(this.motionX, this.motionY, this.motionZ);
        if (this.posY == this.prevPosY) {
            this.motionX *= 1.1;
            this.motionZ *= 1.1;
        }
        this.motionX *= (double)0.96f;
        this.motionY *= (double)0.96f;
        this.motionZ *= (double)0.96f;
        if (this.onGround) {
            this.motionX *= (double)0.7f;
            this.motionZ *= (double)0.7f;
        }
    }

    protected nu_2(World world, double d, double d2, double d3, float f, float f2, float f3) {
        this(world, d, d2, d3, 1.0f, f, f2, f3);
    }

    @Override
    public void a(WorldRenderer worldRenderer, Entity entity, float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = ((float)this.ay + f) / (float)this.am * 32.0f;
        f7 = MathHelper.b(f7, 0.0f, 1.0f);
        this.au = this.az * f7;
        super.a(worldRenderer, entity, f, f2, f3, f4, f5, f6);
    }
}

