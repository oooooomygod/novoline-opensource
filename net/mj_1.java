/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.Entity;
import net.minecraft.renderer.WorldRenderer;

/*
 * Renamed from net.mJ
 */
public class mj_1
extends mi_1 {
    float az;

    @Override
    public void a(WorldRenderer worldRenderer, Entity entity, float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = ((float)this.ay + f) / (float)this.am * 32.0f;
        f7 = MathHelper.b(f7, 0.0f, 1.0f);
        this.au = this.az * f7;
        super.a(worldRenderer, entity, f, f2, f3, f4, f5, f6);
    }

    protected mj_1(World world, double d, double d2, double d3, double d4, double d5, double d6) {
        this(world, d, d2, d3, d4, d5, d6, 2.0f);
    }

    @Override
    public void onUpdate() {
        this.prevPosX = this.posX;
        this.prevPosY = this.posY;
        this.prevPosZ = this.posZ;
        if (this.ay++ >= this.am) {
            this.E();
        }
        this.moveEntity(this.motionX, this.motionY, this.motionZ);
        if (this.posY == this.prevPosY) {
            this.motionX *= 1.1;
            this.motionZ *= 1.1;
        }
        this.motionX *= (double)0.86f;
        this.motionY *= (double)0.86f;
        this.motionZ *= (double)0.86f;
        if (this.onGround) {
            this.motionX *= (double)0.7f;
            this.motionZ *= (double)0.7f;
        }
    }

    protected mj_1(World world, double d, double d2, double d3, double d4, double d5, double d6, float f) {
        super(world, d, d2, d3, 0.0, 0.0, 0.0);
        this.motionX *= (double)0.01f;
        this.motionY *= (double)0.01f;
        this.motionZ *= (double)0.01f;
        this.motionY += 0.1;
        this.au *= 0.75f;
        this.au *= f;
        this.az = this.au;
        this.am = 16;
        this.H = false;
        this.c(80);
    }
}

