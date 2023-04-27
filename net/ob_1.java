/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.ObjectMouseOverInvoker;
import cc.novoline.invoke.StringInvoker;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import deobf.Entity;
import deobf.EntityLivingBase;
import deobf.EntityPlayer;
import deobf.IProjectile;
import net.minecraft.util.MovingObjectPosition;
import deobf.Vec3;
import java.util.Iterator;
import java.util.List;

/*
 * Renamed from net.oB
 */
public abstract class ob_1
extends Entity
implements IProjectile {
    private String as;
    private Block al;
    private int aq;
    private int ak = -1;
    private int an = -1;
    private int ar = -1;
    protected boolean aj;
    public int ap;
    private int am;
    private EntityLivingBase ao;

    @Override
    public void b(NBTTagCompound nBTTagCompound) {
        tn_0.a(nBTTagCompound, HJ.h, (short)this.ar);
        tn_0.a(nBTTagCompound, HJ.i, (short)this.ak);
        tn_0.a(nBTTagCompound, HJ.l, (short)this.an);
        ResourceLocation cfr_ignored_0 = (ResourceLocation)a82.b(Block.m, this.al);
        tn_0.a(nBTTagCompound, HJ.n, HJ.o);
        tn_0.a(nBTTagCompound, HJ.a, (byte)this.ap);
        tn_0.a(nBTTagCompound, HJ.p, (byte)(this.aj ? 1 : 0));
        if ((this.as == null || StringInvoker.g(this.as)) && this.ao instanceof EntityPlayer) {
            this.as = this.ao.getName();
        }
        tn_0.a(nBTTagCompound, HJ.k, this.as == null ? HJ.e : this.as);
    }

    @Override
    public void g(NBTTagCompound nBTTagCompound) {
        this.ar = tn_0.o(nBTTagCompound, HJ.f);
        this.ak = tn_0.o(nBTTagCompound, HJ.r);
        this.an = tn_0.o(nBTTagCompound, HJ.g);
        this.al = tn_0.a(nBTTagCompound, HJ.c, 8) ? BlocksInvoker.a(tn_0.m(nBTTagCompound, HJ.d)) : BlocksInvoker.a(tn_0.e(nBTTagCompound, HJ.j) & 0xFF);
        this.ap = tn_0.e(nBTTagCompound, HJ.b) & 0xFF;
        this.aj = tn_0.e(nBTTagCompound, HJ.q) == 1;
        this.ao = null;
        this.as = tn_0.m(nBTTagCompound, HJ.m);
        if (this.as != null && StringInvoker.g(this.as)) {
            this.as = null;
        }
        this.ao = this.d();
    }

    protected float a() {
        return 0.0f;
    }

    public ob_1(World world) {
        super(world);
        this.c(0.25f, 0.25f);
    }

    public ob_1(World world, double d, double d2, double d3) {
        super(world);
        this.am = 0;
        this.c(0.25f, 0.25f);
        this.j(d, d2, d3);
    }

    @Override
    protected void g() {
    }

    protected float c() {
        return 1.5f;
    }

    protected abstract void a(MovingObjectPosition var1);

    @Override
    public void onUpdate() {
        this.lastTickPosX = this.posX;
        this.lastTickPosY = this.posY;
        this.lastTickPosZ = this.posZ;
        super.onUpdate();
        if (this.ap > 0) {
            --this.ap;
        }
        if (this.aj) {
            if (BlockStateInvoker.getBlock(aV8.q(this.worldObj, new BlockPos(this.ar, this.ak, this.an))) == this.al) {
                ++this.am;
                if (this.am == 1200) {
                    this.E();
                }
                return;
            }
            this.aj = false;
            this.motionX *= (double)(a5_0.e(this.Q) * 0.2f);
            this.motionY *= (double)(a5_0.e(this.Q) * 0.2f);
            this.motionZ *= (double)(a5_0.e(this.Q) * 0.2f);
            this.am = 0;
            this.aq = 0;
        } else {
            ++this.aq;
        }
        Vec3 vec3 = new Vec3(this.posX, this.posY, this.posZ);
        Vec3 vec32 = new Vec3(this.posX + this.motionX, this.posY + this.motionY, this.posZ + this.motionZ);
        MovingObjectPosition movingObjectPosition = aV8.a(this.worldObj, vec3, vec32);
        vec3 = new Vec3(this.posX, this.posY, this.posZ);
        vec32 = new Vec3(this.posX + this.motionX, this.posY + this.motionY, this.posZ + this.motionZ);
        vec32 = new Vec3(movingObjectPosition.b.xCoord, movingObjectPosition.b.yCoord, movingObjectPosition.b.zCoord);
        if (!this.worldObj.isRemote) {
            Entity entity = null;
            List list = aV8.a(this.worldObj, (Entity)this, h__0.d(h__0.a(this.getEntityBoundingBox(), this.motionX, this.motionY, this.motionZ), 1.0, 1.0, 1.0));
            double d = 0.0;
            EntityLivingBase entityLivingBase = this.d();
            Iterator iterator = ListInvoker.iterator(list);
            while (dz_0.c(iterator)) {
                Entity entity2 = (Entity)dz_0.b(iterator);
                Entity entity3 = entity2;
                if (!entity3.N() || entity3 == entityLivingBase && this.aq < 5) continue;
                float f = 0.3f;
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
        }
        if (movingObjectPosition.typeOfHit == net.I.BLOCK && BlockStateInvoker.getBlock(aV8.q(this.worldObj, ObjectMouseOverInvoker.getBlockPos(movingObjectPosition))) == Blocks.h) {
            this.d(ObjectMouseOverInvoker.getBlockPos(movingObjectPosition));
        } else {
            this.a(movingObjectPosition);
        }
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
        float f2 = 0.99f;
        float f3 = this.b();
        if (this.isInWater()) {
            int n = 0;
            while (true) {
                float f4 = 0.25f;
                aV8.a(this.worldObj, B7.WATER_BUBBLE, this.posX - this.motionX * (double)f4, this.posY - this.motionY * (double)f4, this.posZ - this.motionZ * (double)f4, this.motionX, this.motionY, this.motionZ, new int[0]);
                ++n;
            }
        }
        this.motionX *= (double)f2;
        this.motionY *= (double)f2;
        this.motionZ *= (double)f2;
        this.motionY -= (double)f3;
        this.j(this.posX, this.posY, this.posZ);
    }

    public EntityLivingBase d() {
        if (this.ao == null && this.as != null && !StringInvoker.g(this.as)) {
            this.ao = aV8.b(this.worldObj, this.as);
            if (this.ao == null && this.worldObj instanceof WorldServer) {
                try {
                    Entity entity = a3V.a((WorldServer)this.worldObj, awc_1.a(this.as));
                    if (entity instanceof EntityLivingBase) {
                        this.ao = (EntityLivingBase)entity;
                    }
                }
                catch (Throwable throwable) {
                    this.ao = null;
                }
            }
        }
        return this.ao;
    }

    protected float b() {
        return 0.03f;
    }

    @Override
    public void a(double d, double d2, double d3, float f, float f2) {
        float f3 = MathHelper.e(d * d + d2 * d2 + d3 * d3);
        d /= (double)f3;
        d2 /= (double)f3;
        d3 /= (double)f3;
        d += a5_0.f(this.Q) * (double)0.0075f * (double)f2;
        d2 += a5_0.f(this.Q) * (double)0.0075f * (double)f2;
        d3 += a5_0.f(this.Q) * (double)0.0075f * (double)f2;
        this.motionX = d *= (double)f;
        this.motionY = d2 *= (double)f;
        this.motionZ = d3 *= (double)f;
        float f4 = MathHelper.e(d * d + d3 * d3);
        this.prevRotationYaw = this.rotationYaw = (float)(MathHelper.c(d, d3) * 180.0 / Math.PI);
        this.prevRotationPitch = this.rotationPitch = (float)(MathHelper.c(d2, f4) * 180.0 / Math.PI);
        this.am = 0;
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

    private static Throwable b(Throwable throwable) {
        return throwable;
    }

    @Override
    public boolean b(double d) {
        double d2 = h__0.b(this.getEntityBoundingBox()) * 4.0;
        if (db_0.f(d2)) {
            d2 = 4.0;
        }
        return d < (d2 *= 64.0) * d2;
    }

    public ob_1(World world, EntityLivingBase entityLivingBase) {
        super(world);
        this.ao = entityLivingBase;
        this.c(0.25f, 0.25f);
        this.c(entityLivingBase.posX, entityLivingBase.posY + (double)entityLivingBase.w(), entityLivingBase.posZ, entityLivingBase.rotationYaw, entityLivingBase.rotationPitch);
        this.posX -= (double)(MathHelper.cos(this.rotationYaw / 180.0f * (float)Math.PI) * 0.16f);
        this.posY -= (double)0.1f;
        this.posZ -= (double)(MathHelper.sin(this.rotationYaw / 180.0f * (float)Math.PI) * 0.16f);
        this.j(this.posX, this.posY, this.posZ);
        float f = 0.4f;
        this.motionX = -MathHelper.sin(this.rotationYaw / 180.0f * (float)Math.PI) * MathHelper.cos(this.rotationPitch / 180.0f * (float)Math.PI) * f;
        this.motionZ = MathHelper.cos(this.rotationYaw / 180.0f * (float)Math.PI) * MathHelper.cos(this.rotationPitch / 180.0f * (float)Math.PI) * f;
        this.motionY = -MathHelper.sin((this.rotationPitch + this.a()) / 180.0f * (float)Math.PI) * f;
        this.a(this.motionX, this.motionY, this.motionZ, this.c(), 1.0f);
    }
}

