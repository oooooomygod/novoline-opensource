/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.Entity;
import net.minecraft.renderer.WorldRenderer;

/*
 * Renamed from net.mY
 */
public class my_1
extends mi_1 {
    private float aE;
    private float az;
    private boolean aA;
    private float aB;
    private boolean aC;
    private boolean aD;
    private EffectRenderer aF;

    public void h(boolean bl) {
        this.aC = bl;
    }

    public void h(int n) {
        float f = (float)((n & 0xFF0000) >> 16) / 255.0f;
        float f2 = (float)((n & 0xFF00) >> 8) / 255.0f;
        float f3 = (float)(n & 0xFF) / 255.0f;
        float f4 = 1.0f;
        this.b(f * f4, f2 * f4, f3 * f4);
    }

    @Override
    public void a(WorldRenderer worldRenderer, Entity entity, float f, float f2, float f3, float f4, float f5, float f6) {
        if (!this.aC || this.ay < this.am / 3 || (this.ay + this.am) / 3 % 2 == 0) {
            super.a(worldRenderer, entity, f, f2, f3, f4, f5, f6);
        }
    }

    @Override
    public void onUpdate() {
        this.prevPosX = this.posX;
        this.prevPosY = this.posY;
        this.prevPosZ = this.posZ;
        if (this.ay++ >= this.am) {
            this.E();
        }
        if (this.ay > this.am / 2) {
            this.c(1.0f - ((float)this.ay - (float)(this.am / 2)) / (float)this.am);
            if (this.aD) {
                this.an += (this.aB - this.an) * 0.2f;
                this.ao += (this.aE - this.ao) * 0.2f;
                this.av += (this.az - this.av) * 0.2f;
            }
        }
        this.c(167 - this.ay * 8 / this.am);
        this.motionY -= 0.004;
        this.moveEntity(this.motionX, this.motionY, this.motionZ);
        this.motionX *= (double)0.91f;
        this.motionY *= (double)0.91f;
        this.motionZ *= (double)0.91f;
        if (this.onGround) {
            this.motionX *= (double)0.7f;
            this.motionZ *= (double)0.7f;
        }
        if (this.aA && this.ay < this.am / 2 && (this.ay + this.am) % 2 == 0) {
            my_1 my_12 = new my_1(this.worldObj, this.posX, this.posY, this.posZ, 0.0, 0.0, 0.0, this.aF);
            my_12.c(0.99f);
            my_12.b(this.an, this.ao, this.av);
            my_12.ay = my_12.am / 2;
            if (this.aD) {
                my_12.aD = true;
                my_12.aB = this.aB;
                my_12.aE = this.aE;
                my_12.az = this.az;
            }
            my_12.aC = this.aC;
            ayx_2.a(this.aF, my_12);
        }
    }

    public my_1(World world, double d, double d2, double d3, double d4, double d5, double d6, EffectRenderer effectRenderer) {
        super(world, d, d2, d3);
        this.motionX = d4;
        this.motionY = d5;
        this.motionZ = d6;
        this.aF = effectRenderer;
        this.au *= 0.75f;
        this.am = 48 + a5_0.a(this.Q, 12);
        this.H = false;
    }

    @Override
    public int d(float f) {
        return 0xF000F0;
    }

    @Override
    public rm_2 as() {
        return null;
    }

    public void i(int n) {
        this.aB = (float)((n & 0xFF0000) >> 16) / 255.0f;
        this.aE = (float)((n & 0xFF00) >> 8) / 255.0f;
        this.az = (float)(n & 0xFF) / 255.0f;
        this.aD = true;
    }

    public void i(boolean bl) {
        this.aA = bl;
    }

    @Override
    public float b(float f) {
        return 1.0f;
    }

    @Override
    public boolean W() {
        return false;
    }
}

