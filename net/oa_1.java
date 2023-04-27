/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.ListInvoker;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.util.DamageSource;
import deobf.Entity;
import deobf.EntityLivingBase;
import net.minecraft.util.MovingObjectPosition;
import deobf.NBTTagList;
import deobf.Vec3;
import java.util.Iterator;
import java.util.List;

/*
 * Renamed from net.oA
 */
public abstract class oa_1
extends Entity {
    public EntityLivingBase ak;
    private int aq;
    private int ap = -1;
    private int an = -1;
    private int am = -1;
    private int ar;
    public double ao;
    public double al;
    public double aj;
    private boolean at;
    private Block as;

    @Override
    public boolean N() {
        return true;
    }

    @Override
    public void onUpdate() {
        if (this.worldObj.isRemote || (this.ak == null || !this.ak.isDead) && aV8.isBlockLoaded(this.worldObj, new BlockPos(this))) {
            float f;
            super.onUpdate();
            this.a(1);
            if (this.at) {
                if (BlockStateInvoker.getBlock(aV8.q(this.worldObj, new BlockPos(this.ap, this.an, this.am))) == this.as) {
                    ++this.aq;
                    if (this.aq == 600) {
                        this.E();
                    }
                    return;
                }
                this.at = false;
                this.motionX *= (double)(a5_0.e(this.Q) * 0.2f);
                this.motionY *= (double)(a5_0.e(this.Q) * 0.2f);
                this.motionZ *= (double)(a5_0.e(this.Q) * 0.2f);
                this.aq = 0;
                this.ar = 0;
            } else {
                ++this.ar;
            }
            Vec3 vec3 = new Vec3(this.posX, this.posY, this.posZ);
            Vec3 vec32 = new Vec3(this.posX + this.motionX, this.posY + this.motionY, this.posZ + this.motionZ);
            MovingObjectPosition movingObjectPosition = aV8.a(this.worldObj, vec3, vec32);
            vec3 = new Vec3(this.posX, this.posY, this.posZ);
            vec32 = new Vec3(this.posX + this.motionX, this.posY + this.motionY, this.posZ + this.motionZ);
            vec32 = new Vec3(movingObjectPosition.b.xCoord, movingObjectPosition.b.yCoord, movingObjectPosition.b.zCoord);
            Entity entity = null;
            List list = aV8.a(this.worldObj, (Entity)this, h__0.d(h__0.a(this.getEntityBoundingBox(), this.motionX, this.motionY, this.motionZ), 1.0, 1.0, 1.0));
            double d = 0.0;
            Iterator iterator = ListInvoker.iterator(list);
            while (dz_0.c(iterator)) {
                Entity entity2 = (Entity)dz_0.b(iterator);
                Entity entity3 = entity2;
                if (!entity3.N() || entity3.i(this.ak) && this.ar < 25) continue;
                f = 0.3f;
                rm_2 rm_22 = h__0.d(entity3.getEntityBoundingBox(), f, f, f);
                MovingObjectPosition movingObjectPosition2 = h__0.a(rm_22, vec3, vec32);
                double d2 = aNE.e(vec3, movingObjectPosition2.b);
                if (!(d2 < d)) {
                    double d3 = d - 0.0;
                    int cfr_ignored_1 = d3 == 0.0 ? 0 : (d3 > 0.0 ? 1 : -1);
                }
                entity = entity3;
                d = d2;
            }
            movingObjectPosition = new MovingObjectPosition(entity);
            this.a(movingObjectPosition);
            this.posX += this.motionX;
            this.posY += this.motionY;
            this.posZ += this.motionZ;
            float f2 = MathHelper.e(this.motionX * this.motionX + this.motionZ * this.motionZ);
            this.rotationYaw = (float)(MathHelper.c(this.motionZ, this.motionX) * 180.0 / Math.PI) + 90.0f;
            this.rotationPitch = (float)(MathHelper.c(f2, this.motionY) * 180.0 / Math.PI) - 90.0f;
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
            float f3 = this.a();
            if (this.isInWater()) {
                int n = 0;
                while (true) {
                    f = 0.25f;
                    aV8.a(this.worldObj, B7.WATER_BUBBLE, this.posX - this.motionX * (double)f, this.posY - this.motionY * (double)f, this.posZ - this.motionZ * (double)f, this.motionX, this.motionY, this.motionZ, new int[0]);
                    ++n;
                }
            }
            this.motionX += this.al;
            this.motionY += this.ao;
            this.motionZ += this.aj;
            this.motionX *= (double)f3;
            this.motionY *= (double)f3;
            this.motionZ *= (double)f3;
            aV8.a(this.worldObj, B7.SMOKE_NORMAL, this.posX, this.posY + 0.5, this.posZ, 0.0, 0.0, 0.0, new int[0]);
            this.j(this.posX, this.posY, this.posZ);
        } else {
            this.E();
        }
    }

    @Override
    public boolean a(DamageSource damageSource, float f) {
        if (this.a(damageSource)) {
            return false;
        }
        this.k();
        if (aDJ.d(damageSource) != null) {
            Vec3 vec3 = aDJ.d(damageSource).an();
            this.motionX = vec3.xCoord;
            this.motionY = vec3.yCoord;
            this.motionZ = vec3.zCoord;
            this.al = this.motionX * 0.1;
            this.ao = this.motionY * 0.1;
            this.aj = this.motionZ * 0.1;
            if (aDJ.d(damageSource) instanceof EntityLivingBase) {
                this.ak = (EntityLivingBase)aDJ.d(damageSource);
            }
            return true;
        }
        return false;
    }

    @Override
    protected void g() {
    }

    @Override
    public float A() {
        return 1.0f;
    }

    public oa_1(World world, double d, double d2, double d3, double d4, double d5, double d6) {
        super(world);
        this.c(1.0f, 1.0f);
        this.c(d, d2, d3, this.rotationYaw, this.rotationPitch);
        this.j(d, d2, d3);
        double d7 = MathHelper.e(d4 * d4 + d5 * d5 + d6 * d6);
        this.al = d4 / d7 * 0.1;
        this.ao = d5 / d7 * 0.1;
        this.aj = d6 / d7 * 0.1;
    }

    @Override
    public boolean b(double d) {
        double d2 = h__0.b(this.getEntityBoundingBox()) * 4.0;
        if (db_0.f(d2)) {
            d2 = 4.0;
        }
        return d < (d2 *= 64.0) * d2;
    }

    @Override
    public void b(NBTTagCompound nBTTagCompound) {
        tn_0.a(nBTTagCompound, aBG.b, (short)this.ap);
        tn_0.a(nBTTagCompound, aBG.p, (short)this.an);
        tn_0.a(nBTTagCompound, aBG.e, (short)this.am);
        ResourceLocation cfr_ignored_0 = (ResourceLocation)a82.b(Block.m, this.as);
        tn_0.a(nBTTagCompound, aBG.m, aBG.o);
        tn_0.a(nBTTagCompound, aBG.l, (byte)(this.at ? 1 : 0));
        tn_0.a(nBTTagCompound, aBG.d, this.a(new double[]{this.motionX, this.motionY, this.motionZ}));
    }

    protected abstract void a(MovingObjectPosition var1);

    public oa_1(World world, EntityLivingBase entityLivingBase, double d, double d2, double d3) {
        super(world);
        this.ak = entityLivingBase;
        this.c(1.0f, 1.0f);
        this.c(entityLivingBase.posX, entityLivingBase.posY, entityLivingBase.posZ, entityLivingBase.rotationYaw, entityLivingBase.rotationPitch);
        this.j(this.posX, this.posY, this.posZ);
        this.motionZ = 0.0;
        this.motionY = 0.0;
        this.motionX = 0.0;
        double d4 = MathHelper.e((d += a5_0.f(this.Q) * 0.4) * d + (d2 += a5_0.f(this.Q) * 0.4) * d2 + (d3 += a5_0.f(this.Q) * 0.4) * d3);
        this.al = d / d4 * 0.1;
        this.ao = d2 / d4 * 0.1;
        this.aj = d3 / d4 * 0.1;
    }

    @Override
    public int d(float f) {
        return 0xF000F0;
    }

    public oa_1(World world) {
        super(world);
        this.c(1.0f, 1.0f);
    }

    @Override
    public void g(NBTTagCompound nBTTagCompound) {
        this.ap = tn_0.o(nBTTagCompound, aBG.g);
        this.an = tn_0.o(nBTTagCompound, aBG.f);
        this.am = tn_0.o(nBTTagCompound, aBG.j);
        this.as = tn_0.a(nBTTagCompound, aBG.k, 8) ? BlocksInvoker.a(tn_0.m(nBTTagCompound, aBG.a)) : BlocksInvoker.a(tn_0.e(nBTTagCompound, aBG.h) & 0xFF);
        boolean bl = this.at = tn_0.e(nBTTagCompound, aBG.n) == 1;
        if (tn_0.a(nBTTagCompound, aBG.i, 9)) {
            NBTTagList nBTTagList = tn_0.c(nBTTagCompound, aBG.c, 6);
            this.motionX = kv_0.d(nBTTagList, 0);
            this.motionY = kv_0.d(nBTTagList, 1);
            this.motionZ = kv_0.d(nBTTagList, 2);
        } else {
            this.E();
        }
    }

    protected float a() {
        return 0.95f;
    }

    @Override
    public float b(float f) {
        return 1.0f;
    }
}

