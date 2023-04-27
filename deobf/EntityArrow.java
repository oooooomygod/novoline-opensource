/*
 * Decompiled with CFR 0.152.
 */
package deobf;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.InventoryInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.ObjectMouseOverInvoker;
import net.*;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.util.DamageSource;
import deobf.Entity;
import deobf.EntityLivingBase;
import deobf.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MovingObjectPosition;
import deobf.Vec3;
import net.minecraft.network.packts.S2BPacketChangeGameState;
import java.util.Iterator;
import java.util.List;

public class EntityArrow
extends Entity
implements IProjectile {
    private int ar = -1;
    private double an = 2.0;
    public Entity ak;
    private int as = -1;
    private int ap;
    private int aj;
    public int au;
    private int al = -1;
    private int at;
    private Block am;
    private boolean av;
    private int ao;
    public int aq;

    public EntityArrow(World world, EntityLivingBase entityLivingBase, EntityLivingBase entityLivingBase2, float f, float f2) {
        super(world);
        this.I = 10.0;
        this.ak = entityLivingBase;
        if (entityLivingBase instanceof EntityPlayer) {
            this.au = 1;
        }
        this.posY = entityLivingBase.posY + (double)entityLivingBase.w() - (double)0.1f;
        double d = entityLivingBase2.posX - entityLivingBase.posX;
        double d2 = entityLivingBase2.getEntityBoundingBox().a + (double)(entityLivingBase2.n / 3.0f) - this.posY;
        double d3 = entityLivingBase2.posZ - entityLivingBase.posZ;
        double d4 = MathHelper.e(d * d + d3 * d3);
        if (d4 >= 1.0E-7) {
            float f3 = (float)(MathHelper.c(d3, d) * 180.0 / Math.PI) - 90.0f;
            float f4 = (float)(-(MathHelper.c(d2, d4) * 180.0 / Math.PI));
            double d5 = d / d4;
            double d6 = d3 / d4;
            this.c(entityLivingBase.posX + d5, this.posY, entityLivingBase.posZ + d6, f3, f4);
            float f5 = (float)(d4 * (double)0.2f);
            this.a(d, d2 + (double)f5, d3, f, f2);
        }
    }

    @Override
    public void a(double d, double d2, double d3, float f, float f2) {
        float f3 = MathHelper.e(d * d + d2 * d2 + d3 * d3);
        d /= (double)f3;
        d2 /= (double)f3;
        d3 /= (double)f3;
        d += a5_0.f(this.Q) * (double)(a5_0.a(this.Q) ? -1 : 1) * (double)0.0075f * (double)f2;
        d2 += a5_0.f(this.Q) * (double)(a5_0.a(this.Q) ? -1 : 1) * (double)0.0075f * (double)f2;
        d3 += a5_0.f(this.Q) * (double)(a5_0.a(this.Q) ? -1 : 1) * (double)0.0075f * (double)f2;
        this.motionX = d *= (double)f;
        this.motionY = d2 *= (double)f;
        this.motionZ = d3 *= (double)f;
        float f4 = MathHelper.e(d * d + d3 * d3);
        this.prevRotationYaw = this.rotationYaw = (float)(MathHelper.c(d, d3) * 180.0 / Math.PI);
        this.prevRotationPitch = this.rotationPitch = (float)(MathHelper.c(d2, f4) * 180.0 / Math.PI);
        this.aj = 0;
    }

    public EntityArrow(World world, EntityLivingBase entityLivingBase, float f) {
        super(world);
        this.I = 10.0;
        this.ak = entityLivingBase;
        if (entityLivingBase instanceof EntityPlayer) {
            this.au = 1;
        }
        this.c(0.5f, 0.5f);
        this.c(entityLivingBase.posX, entityLivingBase.posY + (double)entityLivingBase.w(), entityLivingBase.posZ, entityLivingBase.rotationYaw, entityLivingBase.rotationPitch);
        double d = MathInvoker.o(this.rotationYaw);
        double d2 = MathInvoker.o(this.rotationPitch);
        this.posX -= (double)(MathHelper.b(d) * 0.16f);
        this.posY -= (double)0.1f;
        this.posZ -= (double)(MathHelper.h(d) * 0.16f);
        this.j(this.posX, this.posY, this.posZ);
        this.motionX = -MathHelper.h(d) * MathHelper.b(d2);
        this.motionZ = MathHelper.b(d) * MathHelper.b(d2);
        this.motionY = -MathHelper.h(d2);
        this.a(this.motionX, this.motionY, this.motionZ, f * 1.5f, 1.0f);
    }

    @Override
    protected boolean p() {
        return false;
    }

    @Override
    protected void g() {
        aom_0.a(this.l, 16, axt_2.a((byte)0));
    }

    public double a() {
        return this.an;
    }

    public EntityArrow(World world) {
        super(world);
        this.I = 10.0;
        this.c(0.5f, 0.5f);
    }

    @Override
    public void a(double d, double d2, double d3, float f, float f2, int n, boolean bl) {
        this.j(d, d2, d3);
        this.d(f, f2);
    }

    public EntityArrow(World world, double d, double d2, double d3) {
        super(world);
        this.I = 10.0;
        this.c(0.5f, 0.5f);
        this.j(d, d2, d3);
    }

    @Override
    public void d(EntityPlayer entityPlayer) {
        if (!this.worldObj.isRemote && this.av && this.aq <= 0) {
            boolean bl = this.au == 1 || this.au == 2 && aSY.a(entityPlayer.abilities);
            if (this.au != 1 || !InventoryInvoker.b(entityPlayer.inventory, new ItemStack(Items.arrow, 1))) {
                // empty if block
            }
            this.a(fh_0.a, 0.2f, ((a5_0.e(this.Q) - a5_0.e(this.Q)) * 0.7f + 1.0f) * 2.0f);
            a6w_0.a(entityPlayer, this, 1);
            this.E();
        }
    }

    @Override
    public void g(NBTTagCompound nBTTagCompound) {
        this.al = tn_0.o(nBTTagCompound, fh_0.w);
        this.ar = tn_0.o(nBTTagCompound, fh_0.v);
        this.as = tn_0.o(nBTTagCompound, fh_0.j);
        this.aj = tn_0.o(nBTTagCompound, fh_0.p);
        this.am = tn_0.a(nBTTagCompound, fh_0.d, 8) ? BlocksInvoker.a(tn_0.m(nBTTagCompound, fh_0.s)) : BlocksInvoker.a(tn_0.e(nBTTagCompound, fh_0.u) & 0xFF);
        this.ap = tn_0.e(nBTTagCompound, fh_0.B) & 0xFF;
        this.aq = tn_0.e(nBTTagCompound, fh_0.e) & 0xFF;
        boolean bl = this.av = tn_0.e(nBTTagCompound, fh_0.z) == 1;
        if (tn_0.a(nBTTagCompound, fh_0.c, 99)) {
            this.an = tn_0.n(nBTTagCompound, fh_0.b);
        }
        if (tn_0.a(nBTTagCompound, fh_0.r, 99)) {
            this.au = tn_0.e(nBTTagCompound, fh_0.f);
        } else if (tn_0.a(nBTTagCompound, fh_0.i, 99)) {
            this.au = tn_0.c(nBTTagCompound, fh_0.C) ? 1 : 0;
        }
    }

    public void a(double d) {
        this.an = d;
    }

    @Override
    public void b(NBTTagCompound nBTTagCompound) {
        tn_0.a(nBTTagCompound, fh_0.D, (short)this.al);
        tn_0.a(nBTTagCompound, fh_0.m, (short)this.ar);
        tn_0.a(nBTTagCompound, fh_0.x, (short)this.as);
        tn_0.a(nBTTagCompound, fh_0.t, (short)this.aj);
        ResourceLocation cfr_ignored_0 = (ResourceLocation)a82.b(Block.m, this.am);
        tn_0.a(nBTTagCompound, fh_0.y, fh_0.k);
        tn_0.a(nBTTagCompound, fh_0.n, (byte)this.ap);
        tn_0.a(nBTTagCompound, fh_0.l, (byte)this.aq);
        tn_0.a(nBTTagCompound, fh_0.A, (byte)(this.av ? 1 : 0));
        tn_0.a(nBTTagCompound, fh_0.h, (byte)this.au);
        tn_0.a(nBTTagCompound, fh_0.q, this.an);
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
            this.prevRotationPitch = this.rotationPitch;
            this.prevRotationYaw = this.rotationYaw;
            this.c(this.posX, this.posY, this.posZ, this.rotationYaw, this.rotationPitch);
            this.aj = 0;
        }
    }

    @Override
    public float w() {
        return 0.0f;
    }

    @Override
    public boolean aB() {
        return false;
    }

    @Override
    public void onUpdate() {
        Object object;
        BlockPos blockPos;
        IBlockState iBlockState;
        Block block;
        super.onUpdate();
        if (this.prevRotationPitch == 0.0f && this.prevRotationYaw == 0.0f) {
            float f = MathHelper.e(this.motionX * this.motionX + this.motionZ * this.motionZ);
            this.prevRotationYaw = this.rotationYaw = (float)(MathHelper.c(this.motionX, this.motionZ) * 180.0 / Math.PI);
            this.prevRotationPitch = this.rotationPitch = (float)(MathHelper.c(this.motionY, f) * 180.0 / Math.PI);
        }
        if (BlocksInvoker.getBlockState(block = BlockStateInvoker.getBlock(iBlockState = aV8.q(this.worldObj, blockPos = new BlockPos(this.al, this.ar, this.as)))) != Material.air) {
            BlocksInvoker.a(block, (IBlockAccess)this.worldObj, blockPos);
            object = BlocksInvoker.a(block, this.worldObj, blockPos, iBlockState);
            if (h__0.a((rm_2)object, new Vec3(this.posX, this.posY, this.posZ))) {
                this.av = true;
            }
        }
        if (this.aq > 0) {
            --this.aq;
        }
        if (this.av) {
            int n = BlocksInvoker.c(block, iBlockState);
            if (block == this.am && n == this.ap) {
                ++this.aj;
                if (this.aj >= 1200) {
                    this.E();
                }
            } else {
                this.av = false;
                this.motionX *= (double)(a5_0.e(this.Q) * 0.2f);
                this.motionY *= (double)(a5_0.e(this.Q) * 0.2f);
                this.motionZ *= (double)(a5_0.e(this.Q) * 0.2f);
                this.aj = 0;
                this.ao = 0;
            }
        } else {
            Object object2;
            float f;
            Object object3;
            ++this.ao;
            object = new Vec3(this.posX, this.posY, this.posZ);
            Vec3 vec3 = new Vec3(this.posX + this.motionX, this.posY + this.motionY, this.posZ + this.motionZ);
            MovingObjectPosition movingObjectPosition = aV8.a(this.worldObj, (Vec3)object, vec3, false, true, false);
            object = new Vec3(this.posX, this.posY, this.posZ);
            vec3 = new Vec3(this.posX + this.motionX, this.posY + this.motionY, this.posZ + this.motionZ);
            vec3 = new Vec3(movingObjectPosition.b.xCoord, movingObjectPosition.b.yCoord, movingObjectPosition.b.zCoord);
            Object object4 = null;
            List list = aV8.a(this.worldObj, (Entity)this, h__0.d(h__0.a(this.getEntityBoundingBox(), this.motionX, this.motionY, this.motionZ), 1.0, 1.0, 1.0));
            double d = 0.0;
            Object object5 = ListInvoker.iterator(list);
            while (dz_0.c((Iterator)object5)) {
                object3 = (Entity)dz_0.b((Iterator)object5);
                if (!((Entity)object3).N() || object3 == this.ak && this.ao < 5) continue;
                f = 0.3f;
                object2 = h__0.d(((Entity)object3).getEntityBoundingBox(), f, f, f);
                MovingObjectPosition movingObjectPosition2 = h__0.a((rm_2)object2, (Vec3)object, vec3);
                double d2 = aNE.e((Vec3)object, movingObjectPosition2.b);
                if (!(d2 < d)) {
                    double d3 = d - 0.0;
                    int cfr_ignored_1 = d3 == 0.0 ? 0 : (d3 > 0.0 ? 1 : -1);
                }
                object4 = object3;
                d = d2;
            }
            movingObjectPosition = new MovingObjectPosition((Entity)object4);
            if (movingObjectPosition.entityHit instanceof EntityPlayer) {
                object5 = (EntityPlayer)movingObjectPosition.entityHit;
                if (aSY.b(((EntityPlayer)object5).abilities) || this.ak instanceof EntityPlayer && !a6w_0.a((EntityPlayer)this.ak, (EntityPlayer)object5)) {
                    movingObjectPosition = null;
                }
            }
            if (movingObjectPosition.entityHit != null) {
                float f2 = MathHelper.e(this.motionX * this.motionX + this.motionY * this.motionY + this.motionZ * this.motionZ);
                int n = MathHelper.i((double)f2 * this.an);
                if (this.b()) {
                    n += a5_0.a(this.Q, n / 2 + 2);
                }
                DamageSource damageSource = this.ak == null ? aDJ.a(this, (Entity)this) : aDJ.a(this, this.ak);
                if (this.ag() && !(movingObjectPosition.entityHit instanceof nn_0)) {
                    movingObjectPosition.entityHit.a(5);
                }
                if (movingObjectPosition.entityHit.a(damageSource, (float)n)) {
                    if (movingObjectPosition.entityHit instanceof EntityLivingBase) {
                        float f3;
                        object2 = (EntityLivingBase)movingObjectPosition.entityHit;
                        if (!this.worldObj.isRemote) {
                            atn_0.e((EntityLivingBase)object2, atn_0.w((EntityLivingBase)object2) + 1);
                        }
                        if (this.at > 0 && (f3 = MathHelper.e(this.motionX * this.motionX + this.motionZ * this.motionZ)) > 0.0f) {
                            movingObjectPosition.entityHit.b(this.motionX * (double)this.at * (double)0.6f / (double)f3, 0.1, this.motionZ * (double)this.at * (double)0.6f / (double)f3);
                        }
                        if (this.ak instanceof EntityLivingBase) {
                            alf_0.b((EntityLivingBase)object2, this.ak);
                            alf_0.a((EntityLivingBase)this.ak, (Entity)object2);
                        }
                        if (this.ak != null && movingObjectPosition.entityHit != this.ak && movingObjectPosition.entityHit instanceof EntityPlayer && this.ak instanceof EntityPlayerMP) {
                            qv_0.a(((EntityPlayerMP)this.ak).playerNetServerHandler, new S2BPacketChangeGameState(6, 0.0f));
                        }
                    }
                    this.a(fh_0.g, 1.0f, 1.2f / (a5_0.e(this.Q) * 0.2f + 0.9f));
                    if (!(movingObjectPosition.entityHit instanceof nn_0)) {
                        this.E();
                    }
                } else {
                    this.motionX *= (double)-0.1f;
                    this.motionY *= (double)-0.1f;
                    this.motionZ *= (double)-0.1f;
                    this.rotationYaw += 180.0f;
                    this.prevRotationYaw += 180.0f;
                    this.ao = 0;
                }
            } else {
                object5 = ObjectMouseOverInvoker.getBlockPos(movingObjectPosition);
                this.al = amv_2.j((BlockPos)object5);
                this.ar = amv_2.h((BlockPos)object5);
                this.as = amv_2.i((BlockPos)object5);
                object3 = aV8.q(this.worldObj, (BlockPos)object5);
                this.am = BlockStateInvoker.getBlock((IBlockState)object3);
                this.ap = BlocksInvoker.c(this.am, (IBlockState)object3);
                this.motionX = (float)(movingObjectPosition.b.xCoord - this.posX);
                this.motionY = (float)(movingObjectPosition.b.yCoord - this.posY);
                this.motionZ = (float)(movingObjectPosition.b.zCoord - this.posZ);
                f = MathHelper.e(this.motionX * this.motionX + this.motionY * this.motionY + this.motionZ * this.motionZ);
                this.posX -= this.motionX / (double)f * (double)0.05f;
                this.posY -= this.motionY / (double)f * (double)0.05f;
                this.posZ -= this.motionZ / (double)f * (double)0.05f;
                this.a(fh_0.o, 1.0f, 1.2f / (a5_0.e(this.Q) * 0.2f + 0.9f));
                this.av = true;
                this.aq = 7;
                this.h(false);
                if (BlocksInvoker.getBlockState(this.am) != Material.air) {
                    BlocksInvoker.a(this.am, this.worldObj, (BlockPos)object5, (IBlockState)object3, this);
                }
            }
            if (this.b()) {
                int n = 0;
                while (true) {
                    aV8.a(this.worldObj, B7.CRIT, this.posX + this.motionX * (double)n / 4.0, this.posY + this.motionY * (double)n / 4.0, this.posZ + this.motionZ * (double)n / 4.0, -this.motionX, -this.motionY + 0.2, -this.motionZ, new int[0]);
                    ++n;
                }
            }
            this.posX += this.motionX;
            this.posY += this.motionY;
            this.posZ += this.motionZ;
            float f4 = MathHelper.e(this.motionX * this.motionX + this.motionZ * this.motionZ);
            this.rotationYaw = (float)(MathHelper.c(this.motionX, this.motionZ) * 180.0 / Math.PI);
            this.rotationPitch = (float)(MathHelper.c(this.motionY, f4) * 180.0 / Math.PI);
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
            float f5 = 0.99f;
            float f6 = 0.05f;
            if (this.isInWater()) {
                int n = 0;
                while (true) {
                    float f7 = 0.25f;
                    aV8.a(this.worldObj, B7.WATER_BUBBLE, this.posX - this.motionX * (double)f7, this.posY - this.motionY * (double)f7, this.posZ - this.motionZ * (double)f7, this.motionX, this.motionY, this.motionZ, new int[0]);
                    ++n;
                }
            }
            if (this.am()) {
                this.ar();
            }
            this.motionX *= (double)f5;
            this.motionY *= (double)f5;
            this.motionZ *= (double)f5;
            this.motionY -= (double)f6;
            this.j(this.posX, this.posY, this.posZ);
            this.U();
        }
    }

    public void c(int n) {
        this.at = n;
    }

    public boolean b() {
        byte by = aom_0.g(this.l, 16);
        return (by & 1) != 0;
    }

    public void h(boolean bl) {
        byte by = aom_0.g(this.l, 16);
        aom_0.b(this.l, 16, axt_2.a((byte)(by | 1)));
    }
}

