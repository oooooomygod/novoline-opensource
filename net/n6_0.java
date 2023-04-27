/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.MathInvoker;
import deobf.Entity;
import net.minecraft.renderer.WorldRenderer;

/*
 * Renamed from net.n6
 */
public class n6_0
extends mi_1 {
    private float az;

    @Override
    public void onUpdate() {
        this.prevPosX = this.posX;
        this.prevPosY = this.posY;
        this.prevPosZ = this.posZ;
        if (this.ay++ >= this.am) {
            this.E();
        }
        float f = (float)this.ay / (float)this.am;
        if (a5_0.e(this.Q) > f) {
            aV8.a(this.worldObj, B7.SMOKE_NORMAL, this.posX, this.posY, this.posZ, this.motionX, this.motionY, this.motionZ, new int[0]);
        }
        this.motionY -= 0.03;
        this.moveEntity(this.motionX, this.motionY, this.motionZ);
        this.motionX *= (double)0.999f;
        this.motionY *= (double)0.999f;
        this.motionZ *= (double)0.999f;
        if (this.onGround) {
            this.motionX *= (double)0.7f;
            this.motionZ *= (double)0.7f;
        }
    }

    @Override
    public int d(float f) {
        float f2 = ((float)this.ay + f) / (float)this.am;
        f2 = MathHelper.b(f2, 0.0f, 1.0f);
        int n = super.d(f);
        int n2 = 240;
        int n3 = n >> 16 & 0xFF;
        return n2 | n3 << 16;
    }

    @Override
    public float b(float f) {
        return 1.0f;
    }

    protected n6_0(World world, double d, double d2, double d3) {
        super(world, d, d2, d3, 0.0, 0.0, 0.0);
        this.motionX *= (double)0.8f;
        this.motionY *= (double)0.8f;
        this.motionZ *= (double)0.8f;
        this.motionY = a5_0.e(this.Q) * 0.4f + 0.05f;
        this.av = 1.0f;
        this.ao = 1.0f;
        this.an = 1.0f;
        this.au *= a5_0.e(this.Q) * 2.0f + 0.2f;
        this.az = this.au;
        this.am = (int)(16.0 / (MathInvoker.a() * 0.8 + 0.2));
        this.H = false;
        this.c(49);
    }

    @Override
    public void a(WorldRenderer worldRenderer, Entity entity, float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = ((float)this.ay + f) / (float)this.am;
        this.au = this.az * (1.0f - f7 * f7);
        super.a(worldRenderer, entity, f, f2, f3, f4, f5, f6);
    }
}

