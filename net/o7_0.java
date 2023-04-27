/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.MathInvoker;
import deobf.Entity;
import net.minecraft.block.BlockPos;
import net.minecraft.item.ItemStack;

/*
 * Renamed from net.o7
 */
public class o7_0
extends Entity {
    private double am;
    private int an;
    private boolean aj;
    private double ak;
    private double al;

    public o7_0(World world, double d, double d2, double d3) {
        super(world);
        this.an = 0;
        this.c(0.25f, 0.25f);
        this.j(d, d2, d3);
    }

    @Override
    protected void g() {
    }

    @Override
    public void g(NBTTagCompound nBTTagCompound) {
    }

    @Override
    public void onUpdate() {
        this.lastTickPosX = this.posX;
        this.lastTickPosY = this.posY;
        this.lastTickPosZ = this.posZ;
        super.onUpdate();
        this.posX += this.motionX;
        this.posY += this.motionY;
        this.posZ += this.motionZ;
        float f = MathHelper.e(this.motionX * this.motionX + this.motionZ * this.motionZ);
        this.rotationYaw = (float)(MathHelper.c(this.motionX, this.motionZ) * 180.0 / Math.PI);
        this.rotationPitch = (float)(MathHelper.c(this.motionY, f) * 180.0 / Math.PI);
        while (this.rotationPitch - this.prevRotationPitch < -180.0f) {
            this.prevRotationPitch -= 360.0f;
        }
        while (this.rotationPitch - this.prevRotationPitch >= 180.0f) {
            this.prevRotationPitch += 360.0f;
        }
        while (this.rotationYaw - this.prevRotationYaw < -180.0f) {
            this.prevRotationYaw -= 360.0f;
        }
        while (this.rotationYaw - this.prevRotationYaw >= 180.0f) {
            this.prevRotationYaw += 360.0f;
        }
        this.rotationPitch = this.prevRotationPitch + (this.rotationPitch - this.prevRotationPitch) * 0.2f;
        this.rotationYaw = this.prevRotationYaw + (this.rotationYaw - this.prevRotationYaw) * 0.2f;
        if (!this.worldObj.isRemote) {
            double d = this.ak - this.posX;
            double d2 = this.al - this.posZ;
            float f2 = (float)MathInvoker.d(d * d + d2 * d2);
            float f3 = (float)MathHelper.c(d2, d);
            double d3 = (double)f + (double)(f2 - f) * 0.0025;
            if (f2 < 1.0f) {
                d3 *= 0.8;
                this.motionY *= 0.8;
            }
            this.motionX = (double)MathHelper.b(f3) * d3;
            this.motionZ = (double)MathHelper.h(f3) * d3;
            this.motionY = this.posY < this.am ? (this.motionY += (1.0 - this.motionY) * (double)0.015f) : (this.motionY += (-1.0 - this.motionY) * (double)0.015f);
        }
        float f4 = 0.25f;
        if (this.isInWater()) {
            int n = 0;
            while (true) {
                aV8.a(this.worldObj, B7.WATER_BUBBLE, this.posX - this.motionX * (double)f4, this.posY - this.motionY * (double)f4, this.posZ - this.motionZ * (double)f4, this.motionX, this.motionY, this.motionZ, new int[0]);
                ++n;
            }
        }
        aV8.a(this.worldObj, B7.PORTAL, this.posX - this.motionX * (double)f4 + a5_0.c(this.Q) * 0.6 - 0.3, this.posY - this.motionY * (double)f4 - 0.5, this.posZ - this.motionZ * (double)f4 + a5_0.c(this.Q) * 0.6 - 0.3, this.motionX, this.motionY, this.motionZ, new int[0]);
        if (!this.worldObj.isRemote) {
            this.j(this.posX, this.posY, this.posZ);
            ++this.an;
            if (this.an > 80 && !this.worldObj.isRemote) {
                this.E();
                if (this.aj) {
                    aV8.b(this.worldObj, new og_0(this.worldObj, this.posX, this.posY, this.posZ, new ItemStack(Items.ender_eye)));
                } else {
                    aV8.c(this.worldObj, 2003, new BlockPos(this), 0);
                }
            }
        }
    }

    public void a(BlockPos blockPos) {
        double d = amv_2.j(blockPos);
        int n = amv_2.h(blockPos);
        double d2 = d - this.posX;
        double d3 = amv_2.i(blockPos);
        double d4 = d3 - this.posZ;
        float f = MathHelper.e(d2 * d2 + d4 * d4);
        if (f > 12.0f) {
            this.ak = this.posX + d2 / (double)f * 12.0;
            this.al = this.posZ + d4 / (double)f * 12.0;
            this.am = this.posY + 8.0;
        } else {
            this.ak = d;
            this.am = n;
            this.al = d3;
        }
        this.an = 0;
        this.aj = a5_0.a(this.Q, 5) > 0;
    }

    @Override
    public int d(float f) {
        return 0xF000F0;
    }

    @Override
    public float b(float f) {
        return 1.0f;
    }

    @Override
    public void e(double d, double d2, double d3) {
        this.motionX = d;
        this.motionY = d2;
        this.motionZ = d3;
        if (this.prevRotationPitch == 0.0f && this.prevRotationYaw == 0.0f) {
            float f = MathHelper.e(d * d + d3 * d3);
            this.prevRotationYaw = this.rotationYaw = (float)(MathHelper.c(d, d3) * 180.0 / Math.PI);
            this.prevRotationPitch = this.rotationPitch = (float)(MathHelper.c(d2, f) * 180.0 / Math.PI);
        }
    }

    @Override
    public boolean aB() {
        return false;
    }

    public o7_0(World world) {
        super(world);
        this.c(0.25f, 0.25f);
    }

    @Override
    public void b(NBTTagCompound nBTTagCompound) {
    }

    @Override
    public boolean b(double d) {
        double d2 = h__0.b(this.getEntityBoundingBox()) * 4.0;
        if (db_0.f(d2)) {
            d2 = 4.0;
        }
        return d < (d2 *= 64.0) * d2;
    }
}

