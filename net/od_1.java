/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.MathInvoker;
import deobf.Entity;
import deobf.EntityLivingBase;
import net.B7;
import net.MathHelper;
import net.NBTTagCompound;
import net.World;
import net.aV8;
import net.aew_1;
import net.tn_0;

/*
 * Renamed from net.oD
 */
public class od_1
extends Entity {
    private EntityLivingBase aj;
    public int ak;

    @Override
    public float w() {
        return 0.0f;
    }

    @Override
    public void onUpdate() {
        this.prevPosX = this.posX;
        this.prevPosY = this.posY;
        this.prevPosZ = this.posZ;
        this.motionY -= (double)0.04f;
        this.moveEntity(this.motionX, this.motionY, this.motionZ);
        this.motionX *= (double)0.98f;
        this.motionY *= (double)0.98f;
        this.motionZ *= (double)0.98f;
        if (this.onGround) {
            this.motionX *= (double)0.7f;
            this.motionZ *= (double)0.7f;
            this.motionY *= -0.5;
        }
        if (this.ak-- <= 0) {
            this.E();
            if (!this.worldObj.isRemote) {
                this.c();
            }
        } else {
            this.G();
            aV8.a(this.worldObj, B7.SMOKE_NORMAL, this.posX, this.posY + 0.5, this.posZ, 0.0, 0.0, 0.0, new int[0]);
        }
    }

    @Override
    protected boolean p() {
        return false;
    }

    @Override
    public boolean N() {
        return !this.isDead;
    }

    public od_1(World world) {
        super(world);
        this.P = true;
        this.c(0.98f, 0.98f);
    }

    @Override
    protected void g(NBTTagCompound nBTTagCompound) {
        this.ak = tn_0.e(nBTTagCompound, aew_1.b);
    }

    @Override
    protected void g() {
    }

    public od_1(World world, double d, double d2, double d3, EntityLivingBase entityLivingBase) {
        this(world);
        this.j(d, d2, d3);
        float f = (float)(MathInvoker.a() * Math.PI * 2.0);
        this.motionX = -MathHelper.h(f) * 0.02f;
        this.motionY = 0.2f;
        this.motionZ = -MathHelper.b(f) * 0.02f;
        this.ak = 80;
        this.prevPosX = d;
        this.prevPosY = d2;
        this.prevPosZ = d3;
        this.aj = entityLivingBase;
    }

    private void c() {
        float f = 4.0f;
        aV8.a(this.worldObj, this, this.posX, this.posY + (double)(this.n / 16.0f), this.posZ, f, true);
    }

    @Override
    protected void b(NBTTagCompound nBTTagCompound) {
        tn_0.a(nBTTagCompound, aew_1.a, (byte)this.ak);
    }

    @Override
    public EntityLivingBase a() {
        return this.aj;
    }
}

