/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.MathInvoker;
import net.World;
import net.a5_0;
import net.mi_1;

/*
 * Renamed from net.mC
 */
public class mc_1
extends mi_1 {
    private double aC;
    private double aA;
    private float aB;
    private double az;

    @Override
    public void onUpdate() {
        this.prevPosX = this.posX;
        this.prevPosY = this.posY;
        this.prevPosZ = this.posZ;
        float f = (float)this.ay / (float)this.am;
        f = 1.0f - f;
        float f2 = 1.0f - f;
        f2 *= f2;
        f2 *= f2;
        this.posX = this.az + this.motionX * (double)f;
        this.posY = this.aC + this.motionY * (double)f - (double)(f2 * 1.2f);
        this.posZ = this.aA + this.motionZ * (double)f;
        if (this.ay++ >= this.am) {
            this.E();
        }
    }

    @Override
    public float b(float f) {
        float f2 = super.b(f);
        float f3 = (float)this.ay / (float)this.am;
        f3 *= f3;
        f3 *= f3;
        return f2 * (1.0f - f3) + f3;
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

    protected mc_1(World world, double d, double d2, double d3, double d4, double d5, double d6) {
        super(world, d, d2, d3, d4, d5, d6);
        this.motionX = d4;
        this.motionY = d5;
        this.motionZ = d6;
        this.az = d;
        this.aC = d2;
        this.aA = d3;
        this.posX = this.prevPosX = d + d4;
        this.posY = this.prevPosY = d2 + d5;
        this.posZ = this.prevPosZ = d3 + d6;
        float f = a5_0.e(this.Q) * 0.6f + 0.4f;
        this.aB = this.au = a5_0.e(this.Q) * 0.5f + 0.2f;
        this.ao = this.av = 1.0f * f;
        this.an = this.av;
        this.ao *= 0.9f;
        this.an *= 0.9f;
        this.am = (int)(MathInvoker.a() * 10.0) + 30;
        this.H = true;
        this.c((int)(MathInvoker.a() * 26.0 + 1.0 + 224.0));
    }
}

