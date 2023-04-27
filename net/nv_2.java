/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.MathInvoker;
import deobf.Entity;
import net.minecraft.renderer.WorldRenderer;

/*
 * Renamed from net.nv
 */
public class nv_2
extends mi_1 {
    private double aC;
    private float aA;
    private double az;
    private double aB;

    @Override
    public void onUpdate() {
        this.prevPosX = this.posX;
        this.prevPosY = this.posY;
        this.prevPosZ = this.posZ;
        float f = (float)this.ay / (float)this.am;
        f = -f + f * f * 2.0f;
        f = 1.0f - f;
        this.posX = this.aB + this.motionX * (double)f;
        this.posY = this.aC + this.motionY * (double)f + (double)(1.0f - f);
        this.posZ = this.az + this.motionZ * (double)f;
        if (this.ay++ >= this.am) {
            this.E();
        }
    }

    protected nv_2(World world, double d, double d2, double d3, double d4, double d5, double d6) {
        super(world, d, d2, d3, d4, d5, d6);
        this.motionX = d4;
        this.motionY = d5;
        this.motionZ = d6;
        this.aB = this.posX = d;
        this.aC = this.posY = d2;
        this.az = this.posZ = d3;
        float f = a5_0.e(this.Q) * 0.6f + 0.4f;
        this.aA = this.au = a5_0.e(this.Q) * 0.2f + 0.5f;
        this.ao = this.av = 1.0f * f;
        this.an = this.av;
        this.ao *= 0.3f;
        this.an *= 0.9f;
        this.am = (int)(MathInvoker.a() * 10.0) + 40;
        this.H = true;
        this.c((int)(MathInvoker.a() * 8.0));
    }

    @Override
    public void a(WorldRenderer worldRenderer, Entity entity, float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = ((float)this.ay + f) / (float)this.am;
        f7 = 1.0f - f7;
        f7 *= f7;
        f7 = 1.0f - f7;
        this.au = this.aA * f7;
        super.a(worldRenderer, entity, f, f2, f3, f4, f5, f6);
    }

    @Override
    public int d(float f) {
        int n = super.d(f);
        float f2 = (float)this.ay / (float)this.am;
        f2 *= f2;
        f2 *= f2;
        int n2 = n & 0xFF;
        int n3 = n >> 16 & 0xFF;
        if ((n3 += (int)(f2 * 15.0f * 16.0f)) > 240) {
            n3 = 240;
        }
        return n2 | n3 << 16;
    }

    @Override
    public float b(float f) {
        float f2 = super.b(f);
        float f3 = (float)this.ay / (float)this.am;
        f3 = f3 * f3 * f3 * f3;
        return f2 * (1.0f - f3) + f3;
    }
}

