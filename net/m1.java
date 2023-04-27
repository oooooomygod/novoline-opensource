/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.MathInvoker;
import deobf.Entity;
import net.minecraft.renderer.WorldRenderer;

public class m1
extends mi_1 {
    private float az;

    @Override
    public int d(float f) {
        float f2 = ((float)this.ay + f) / (float)this.am;
        f2 = MathHelper.b(f2, 0.0f, 1.0f);
        int n = super.d(f);
        int n2 = n & 0xFF;
        int n3 = n >> 16 & 0xFF;
        if ((n2 += (int)(f2 * 15.0f * 16.0f)) > 240) {
            n2 = 240;
        }
        return n2 | n3 << 16;
    }

    @Override
    public float b(float f) {
        float f2 = ((float)this.ay + f) / (float)this.am;
        f2 = MathHelper.b(f2, 0.0f, 1.0f);
        float f3 = super.b(f);
        return f3 * f2 + (1.0f - f2);
    }

    protected m1(World world, double d, double d2, double d3, double d4, double d5, double d6) {
        super(world, d, d2, d3, d4, d5, d6);
        this.motionX = this.motionX * (double)0.01f + d4;
        this.motionY = this.motionY * (double)0.01f + d5;
        this.motionZ = this.motionZ * (double)0.01f + d6;
        this.posX += (double)((a5_0.e(this.Q) - a5_0.e(this.Q)) * 0.05f);
        this.posY += (double)((a5_0.e(this.Q) - a5_0.e(this.Q)) * 0.05f);
        this.posZ += (double)((a5_0.e(this.Q) - a5_0.e(this.Q)) * 0.05f);
        this.az = this.au;
        this.av = 1.0f;
        this.ao = 1.0f;
        this.an = 1.0f;
        this.am = (int)(8.0 / (MathInvoker.a() * 0.8 + 0.2)) + 4;
        this.H = true;
        this.c(48);
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
        this.motionX *= (double)0.96f;
        this.motionY *= (double)0.96f;
        this.motionZ *= (double)0.96f;
        if (this.onGround) {
            this.motionX *= (double)0.7f;
            this.motionZ *= (double)0.7f;
        }
    }

    @Override
    public void a(WorldRenderer worldRenderer, Entity entity, float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = ((float)this.ay + f) / (float)this.am;
        this.au = this.az * (1.0f - f7 * f7 * 0.5f);
        super.a(worldRenderer, entity, f, f2, f3, f4, f5, f6);
    }
}

