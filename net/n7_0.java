/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.MathInvoker;
import deobf.Entity;
import net.minecraft.renderer.WorldRenderer;

/*
 * Renamed from net.n7
 */
public class n7_0
extends mi_1 {
    float az;

    @Override
    public void onUpdate() {
        this.prevPosX = this.posX;
        this.prevPosY = this.posY;
        this.prevPosZ = this.posZ;
        if (this.ay++ >= this.am) {
            this.E();
        }
        this.c(7 - this.ay * 8 / this.am);
        this.motionY -= 0.03;
        this.moveEntity(this.motionX, this.motionY, this.motionZ);
        this.motionX *= (double)0.99f;
        this.motionY *= (double)0.99f;
        this.motionZ *= (double)0.99f;
        if (this.onGround) {
            this.motionX *= (double)0.7f;
            this.motionZ *= (double)0.7f;
        }
    }

    @Override
    public void a(WorldRenderer worldRenderer, Entity entity, float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = ((float)this.ay + f) / (float)this.am * 32.0f;
        f7 = MathHelper.b(f7, 0.0f, 1.0f);
        this.au = this.az * f7;
        super.a(worldRenderer, entity, f, f2, f3, f4, f5, f6);
    }

    protected n7_0(World world, double d, double d2, double d3, double d4, double d5, double d6, float f) {
        super(world, d, d2, d3, d4, d5, d6);
        this.motionX *= (double)0.1f;
        this.motionY *= (double)0.1f;
        this.motionZ *= (double)0.1f;
        this.motionX += d4;
        this.motionY += d5;
        this.motionZ += d6;
        this.ao = this.av = 1.0f - (float)(MathInvoker.a() * (double)0.3f);
        this.an = this.av;
        this.au *= 0.75f;
        this.au *= f;
        this.az = this.au;
        this.am = (int)(8.0 / (MathInvoker.a() * 0.8 + 0.2));
        this.am = (int)((float)this.am * f);
        this.H = false;
    }

    protected n7_0(World world, double d, double d2, double d3, double d4, double d5, double d6) {
        this(world, d, d2, d3, d4, d5, d6, 1.0f);
    }
}

