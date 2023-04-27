/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.MathInvoker;
import deobf.Entity;
import net.minecraft.renderer.WorldRenderer;

/*
 * Renamed from net.mH
 */
public class mh_1
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
        this.moveEntity(this.motionX, this.motionY, this.motionZ);
        this.ao = (float)((double)this.ao * 0.96);
        this.av = (float)((double)this.av * 0.9);
        this.motionX *= (double)0.7f;
        this.motionY *= (double)0.7f;
        this.motionZ *= (double)0.7f;
        this.motionY -= (double)0.02f;
        if (this.onGround) {
            this.motionX *= (double)0.7f;
            this.motionZ *= (double)0.7f;
        }
    }

    protected mh_1(World world, double d, double d2, double d3, double d4, double d5, double d6, float f) {
        super(world, d, d2, d3, 0.0, 0.0, 0.0);
        this.motionX *= (double)0.1f;
        this.motionY *= (double)0.1f;
        this.motionZ *= (double)0.1f;
        this.motionX += d4 * 0.4;
        this.motionY += d5 * 0.4;
        this.motionZ += d6 * 0.4;
        this.ao = this.av = (float)(MathInvoker.a() * (double)0.3f + (double)0.6f);
        this.an = this.av;
        this.au *= 0.75f;
        this.au *= f;
        this.az = this.au;
        this.am = (int)(6.0 / (MathInvoker.a() * 0.8 + 0.6));
        this.am = (int)((float)this.am * f);
        this.H = false;
        this.c(65);
        this.onUpdate();
    }

    protected mh_1(World world, double d, double d2, double d3, double d4, double d5, double d6) {
        this(world, d, d2, d3, d4, d5, d6, 1.0f);
    }

    @Override
    public void a(WorldRenderer worldRenderer, Entity entity, float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = ((float)this.ay + f) / (float)this.am * 32.0f;
        f7 = MathHelper.b(f7, 0.0f, 1.0f);
        this.au = this.az * f7;
        super.a(worldRenderer, entity, f, f2, f3, f4, f5, f6);
    }
}

