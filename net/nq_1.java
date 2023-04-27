/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.MathInvoker;
import deobf.Entity;
import net.minecraft.renderer.WorldRenderer;
import java.util.Random;

/*
 * Renamed from net.nQ
 */
public class nq_1
extends mi_1 {
    private int az = 128;
    private static Random aA = new Random();

    @Override
    public void a(WorldRenderer worldRenderer, Entity entity, float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = ((float)this.ay + f) / (float)this.am * 32.0f;
        f7 = MathHelper.b(f7, 0.0f, 1.0f);
        super.a(worldRenderer, entity, f, f2, f3, f4, f5, f6);
    }

    public void h(int n) {
        this.az = n;
    }

    protected nq_1(World world, double d, double d2, double d3, double d4, double d5, double d6) {
        super(world, d, d2, d3, 0.5 - a5_0.c(aA), d5, 0.5 - a5_0.c(aA));
        this.motionY *= (double)0.2f;
        if (d4 == 0.0 && d6 == 0.0) {
            this.motionX *= (double)0.1f;
            this.motionZ *= (double)0.1f;
        }
        this.au *= 0.75f;
        this.am = (int)(8.0 / (MathInvoker.a() * 0.8 + 0.2));
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
        this.c(this.az + 7 - this.ay * 8 / this.am);
        this.motionY += 0.004;
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
}

