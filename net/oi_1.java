/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.Entity;
import net.minecraft.item.ItemStack;
import deobf.NBTBase;

/*
 * Renamed from net.oI
 */
public class oi_1
extends Entity {
    private int ak;
    private int aj;

    @Override
    public void a(byte by) {
        if (by == 17 && this.worldObj.isRemote) {
            ItemStack itemStack = aom_0.c(this.l, 8);
            NBTTagCompound nBTTagCompound = null;
            if (act_2.b(itemStack)) {
                nBTTagCompound = tn_0.d(act_2.a(itemStack), WD.g);
            }
            aV8.a(this.worldObj, this.posX, this.posY, this.posZ, this.motionX, this.motionY, this.motionZ, nBTTagCompound);
        }
        super.a(by);
    }

    @Override
    public void b(NBTTagCompound nBTTagCompound) {
        tn_0.b(nBTTagCompound, WD.j, this.aj);
        tn_0.b(nBTTagCompound, WD.h, this.ak);
        ItemStack itemStack = aom_0.c(this.l, 8);
        NBTTagCompound nBTTagCompound2 = new NBTTagCompound();
        act_2.a(itemStack, nBTTagCompound2);
        tn_0.a(nBTTagCompound, WD.d, (NBTBase)nBTTagCompound2);
    }

    @Override
    public int d(float f) {
        return super.d(f);
    }

    public oi_1(World world) {
        super(world);
        this.c(0.25f, 0.25f);
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
    protected void g() {
        aom_0.a(this.l, 8, 5);
    }

    public oi_1(World world, double d, double d2, double d3, ItemStack itemStack) {
        super(world);
        this.aj = 0;
        this.c(0.25f, 0.25f);
        this.j(d, d2, d3);
        int n = 1;
        if (act_2.b(itemStack)) {
            aom_0.b(this.l, 8, itemStack);
            NBTTagCompound nBTTagCompound = act_2.a(itemStack);
            NBTTagCompound nBTTagCompound2 = tn_0.d(nBTTagCompound, WD.e);
            n += tn_0.e(nBTTagCompound2, WD.b);
        }
        this.motionX = a5_0.f(this.Q) * 0.001;
        this.motionZ = a5_0.f(this.Q) * 0.001;
        this.motionY = 0.05;
        this.ak = 10 * n + a5_0.a(this.Q, 6) + a5_0.a(this.Q, 7);
    }

    @Override
    public float b(float f) {
        return super.b(f);
    }

    @Override
    public boolean aB() {
        return false;
    }

    @Override
    public boolean b(double d) {
        return d < 4096.0;
    }

    @Override
    public void g(NBTTagCompound nBTTagCompound) {
        this.aj = tn_0.g(nBTTagCompound, WD.a);
        this.ak = tn_0.g(nBTTagCompound, WD.i);
        NBTTagCompound nBTTagCompound2 = tn_0.d(nBTTagCompound, WD.c);
        ItemStack itemStack = act_2.a(nBTTagCompound2);
        aom_0.b(this.l, 8, itemStack);
    }

    @Override
    public void onUpdate() {
        this.lastTickPosX = this.posX;
        this.lastTickPosY = this.posY;
        this.lastTickPosZ = this.posZ;
        super.onUpdate();
        this.motionX *= 1.15;
        this.motionZ *= 1.15;
        this.motionY += 0.04;
        this.moveEntity(this.motionX, this.motionY, this.motionZ);
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
        if (this.aj == 0 && !this.Q()) {
            aV8.a(this.worldObj, this, WD.f, 3.0f, 1.0f);
        }
        ++this.aj;
        if (this.worldObj.isRemote && this.aj % 2 < 2) {
            aV8.a(this.worldObj, B7.FIREWORKS_SPARK, this.posX, this.posY - 0.3, this.posZ, a5_0.f(this.Q) * 0.05, -this.motionY * 0.5, a5_0.f(this.Q) * 0.05, new int[0]);
        }
        if (!this.worldObj.isRemote && this.aj > this.ak) {
            aV8.a(this.worldObj, (Entity)this, (byte)17);
            this.E();
        }
    }
}

