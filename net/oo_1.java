/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.ListInvoker;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import deobf.Entity;
import deobf.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MovingObjectPosition;
import deobf.Vec3;
import java.util.Iterator;
import java.util.List;

/*
 * Renamed from net.oO
 */
public class oo_1
extends Entity {
    private static List<cj_0> aq = a7r_0.a(new cj_0[]{ln_1.a(new cj_0(new ItemStack(Items.leather_boots), 10), 0.9f), new cj_0(new ItemStack(Items.leather), 10), new cj_0(new ItemStack(Items.bone), 10), new cj_0(new ItemStack(Items.potionitem), 10), new cj_0(new ItemStack(Items.string), 5), ln_1.a(new cj_0(new ItemStack(Items.fishing_rod), 2), 0.9f), new cj_0(new ItemStack(Items.bowl), 10), new cj_0(new ItemStack(Items.stick), 5), new cj_0(new ItemStack(Items.dye, 10, my_2.c(YZ.BLACK)), 1), new cj_0(new ItemStack(Blocks.be), 10), new cj_0(new ItemStack(Items.rotten_flesh), 10)});
    private int aF;
    private double ak;
    private double aj;
    private double aH;
    private double aA;
    private int aE = -1;
    private int an = -1;
    private static List<cj_0> aD = a7r_0.a(new cj_0[]{new cj_0(new ItemStack(Blocks.an), 1), new cj_0(new ItemStack(Items.name_tag), 1), new cj_0(new ItemStack(Items.saddle), 1), ln_1.a(ln_1.a(new cj_0(new ItemStack(Items.bow), 1), 0.25f)), ln_1.a(ln_1.a(new cj_0(new ItemStack(Items.fishing_rod), 1), 0.25f)), ln_1.a(new cj_0(new ItemStack(Items.book), 1))});
    public int av;
    private int ar;
    private Block ay;
    private int ap;
    public Entity az;
    private float aC;
    private double at;
    private int au = -1;
    private int al;
    private double aw;
    private static List<cj_0> as = a7r_0.a(new cj_0[]{new cj_0(new ItemStack(Items.fish, 1, aC0.e(Ky.COD)), 60), new cj_0(new ItemStack(Items.fish, 1, aC0.e(Ky.SALMON)), 25), new cj_0(new ItemStack(Items.fish, 1, aC0.e(Ky.CLOWNFISH)), 2), new cj_0(new ItemStack(Items.fish, 1, aC0.e(Ky.PUFFERFISH)), 13)});
    private int aB;
    private double aI;
    private double am;
    private boolean ao;
    public EntityPlayer ax;
    private int aG;

    @Override
    protected void g() {
    }

    @Override
    public void e(double d, double d2, double d3) {
        this.aw = this.motionX = d;
        this.am = this.motionY = d2;
        this.ak = this.motionZ = d3;
    }

    @Override
    public boolean b(double d) {
        double d2 = h__0.b(this.getEntityBoundingBox()) * 4.0;
        if (db_0.f(d2)) {
            d2 = 4.0;
        }
        return d < (d2 *= 64.0) * d2;
    }

    public oo_1(World world, double d, double d2, double d3, EntityPlayer entityPlayer) {
        this(world);
        this.j(d, d2, d3);
        this.G = true;
        this.ax = entityPlayer;
        entityPlayer.bk = this;
    }

    public oo_1(World world) {
        super(world);
        this.c(0.25f, 0.25f);
        this.G = true;
    }

    @Override
    public void onUpdate() {
        super.onUpdate();
        if (this.ar > 0) {
            double d = this.posX + (this.aI - this.posX) / (double)this.ar;
            double d2 = this.posY + (this.aA - this.posY) / (double)this.ar;
            double d3 = this.posZ + (this.aH - this.posZ) / (double)this.ar;
            double d4 = MathHelper.j(this.aj - (double)this.rotationYaw);
            this.rotationYaw = (float)((double)this.rotationYaw + d4 / (double)this.ar);
            this.rotationPitch = (float)((double)this.rotationPitch + (this.at - (double)this.rotationPitch) / (double)this.ar);
            --this.ar;
            this.j(d, d2, d3);
            this.d(this.rotationYaw, this.rotationPitch);
        } else {
            Object object;
            if (!this.worldObj.isRemote) {
                object = a6w_0.n(this.ax);
                if (this.ax.isDead || !this.ax.n() || act_2.k((ItemStack)object) != Items.fishing_rod || this.g(this.ax) > 1024.0) {
                    this.E();
                    this.ax.bk = null;
                    return;
                }
                if (this.az != null) {
                    if (!this.az.isDead) {
                        this.posX = this.az.posX;
                        double d = this.az.n;
                        this.posY = this.az.getEntityBoundingBox().a + d * 0.8;
                        this.posZ = this.az.posZ;
                        return;
                    }
                    this.az = null;
                }
            }
            if (this.av > 0) {
                --this.av;
            }
            if (this.ao) {
                if (BlockStateInvoker.getBlock(aV8.q(this.worldObj, new BlockPos(this.au, this.aE, this.an))) == this.ay) {
                    ++this.aF;
                    if (this.aF == 1200) {
                        this.E();
                    }
                    return;
                }
                this.ao = false;
                this.motionX *= (double)(a5_0.e(this.Q) * 0.2f);
                this.motionY *= (double)(a5_0.e(this.Q) * 0.2f);
                this.motionZ *= (double)(a5_0.e(this.Q) * 0.2f);
                this.aF = 0;
                this.ap = 0;
            } else {
                ++this.ap;
            }
            object = new Vec3(this.posX, this.posY, this.posZ);
            Vec3 vec3 = new Vec3(this.posX + this.motionX, this.posY + this.motionY, this.posZ + this.motionZ);
            MovingObjectPosition movingObjectPosition = aV8.a(this.worldObj, (Vec3)object, vec3);
            object = new Vec3(this.posX, this.posY, this.posZ);
            vec3 = new Vec3(this.posX + this.motionX, this.posY + this.motionY, this.posZ + this.motionZ);
            vec3 = new Vec3(movingObjectPosition.b.xCoord, movingObjectPosition.b.yCoord, movingObjectPosition.b.zCoord);
            Entity entity = null;
            List list = aV8.a(this.worldObj, (Entity)this, h__0.d(h__0.a(this.getEntityBoundingBox(), this.motionX, this.motionY, this.motionZ), 1.0, 1.0, 1.0));
            double d = 0.0;
            Iterator iterator = ListInvoker.iterator(list);
            while (dz_0.c(iterator)) {
                Entity entity2 = (Entity)dz_0.b(iterator);
                Entity entity3 = entity2;
                if (!entity3.N() || entity3 == this.ax && this.ap < 5) continue;
                float f = 0.3f;
                rm_2 rm_22 = h__0.d(entity3.getEntityBoundingBox(), f, f, f);
                MovingObjectPosition movingObjectPosition2 = h__0.a(rm_22, (Vec3)object, vec3);
                double d5 = aNE.e((Vec3)object, movingObjectPosition2.b);
                if (!(d5 < d)) {
                    double d6 = d - 0.0;
                    int cfr_ignored_1 = d6 == 0.0 ? 0 : (d6 > 0.0 ? 1 : -1);
                }
                entity = entity3;
                d = d5;
            }
            movingObjectPosition = new MovingObjectPosition(entity);
            if (movingObjectPosition.entityHit != null) {
                if (movingObjectPosition.entityHit.a(aDJ.a(this, (Entity)this.ax), 0.0f)) {
                    this.az = movingObjectPosition.entityHit;
                }
            } else {
                this.ao = true;
            }
            if (!this.ao) {
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
                float f2 = 0.92f;
                if (this.onGround || this.g) {
                    f2 = 0.5f;
                }
                int n = 5;
                double d7 = 0.0;
                int n2 = 0;
                while (true) {
                    rm_2 rm_23 = this.getEntityBoundingBox();
                    double d8 = rm_23.c - rm_23.a;
                    double d9 = rm_23.a + d8 * (double)n2 / (double)n;
                    double d10 = rm_23.a + d8 * (double)(n2 + 1) / (double)n;
                    rm_2 rm_24 = new rm_2(rm_23.e, d9, rm_23.f, rm_23.b, d10, rm_23.d);
                    if (aV8.a(this.worldObj, rm_24, Material.M)) {
                        d7 += 1.0 / (double)n;
                    }
                    ++n2;
                }
            }
        }
    }

    @Override
    public void E() {
        super.E();
        if (this.ax != null) {
            this.ax.bk = null;
        }
    }

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
        this.aF = 0;
    }

    @Override
    public void g(NBTTagCompound nBTTagCompound) {
        this.au = tn_0.o(nBTTagCompound, aW7.o);
        this.aE = tn_0.o(nBTTagCompound, aW7.g);
        this.an = tn_0.o(nBTTagCompound, aW7.c);
        this.ay = tn_0.a(nBTTagCompound, aW7.h, 8) ? BlocksInvoker.a(tn_0.m(nBTTagCompound, aW7.m)) : BlocksInvoker.a(tn_0.e(nBTTagCompound, aW7.f) & 0xFF);
        this.av = tn_0.e(nBTTagCompound, aW7.b) & 0xFF;
        this.ao = tn_0.e(nBTTagCompound, aW7.a) == 1;
    }

    private ItemStack c() {
        float f = a5_0.e(this.worldObj.o);
        int n = alf_0.h(this.ax);
        int n2 = alf_0.f(this.ax);
        float f2 = 0.1f - (float)n * 0.025f - (float)n2 * 0.01f;
        float f3 = 0.05f + (float)n * 0.01f - (float)n2 * 0.01f;
        f2 = MathHelper.b(f2, 0.0f, 1.0f);
        f3 = MathHelper.b(f3, 0.0f, 1.0f);
        if (f < f2) {
            a6w_0.a(this.ax, aop_1.W);
            return ln_1.a((cj_0)mp_1.a(this.Q, aq), this.Q);
        }
        if ((f -= f2) < f3) {
            a6w_0.a(this.ax, aop_1.B);
            return ln_1.a((cj_0)mp_1.a(this.Q, aD), this.Q);
        }
        float cfr_ignored_0 = f - f3;
        a6w_0.a(this.ax, aop_1.L);
        return ln_1.a((cj_0)mp_1.a(this.Q, as), this.Q);
    }

    @Override
    public void b(NBTTagCompound nBTTagCompound) {
        tn_0.a(nBTTagCompound, aW7.p, (short)this.au);
        tn_0.a(nBTTagCompound, aW7.n, (short)this.aE);
        tn_0.a(nBTTagCompound, aW7.e, (short)this.an);
        ResourceLocation cfr_ignored_0 = (ResourceLocation)a82.b(Block.m, this.ay);
        tn_0.a(nBTTagCompound, aW7.l, aW7.k);
        tn_0.a(nBTTagCompound, aW7.d, (byte)this.av);
        tn_0.a(nBTTagCompound, aW7.j, (byte)(this.ao ? 1 : 0));
    }

    public static List<cj_0> a() {
        return as;
    }

    @Override
    public void a(double d, double d2, double d3, float f, float f2, int n, boolean bl) {
        this.aI = d;
        this.aA = d2;
        this.aH = d3;
        this.aj = f;
        this.at = f2;
        this.ar = n;
        this.motionX = this.aw;
        this.motionY = this.am;
        this.motionZ = this.ak;
    }

    public int b() {
        if (this.worldObj.isRemote) {
            return 0;
        }
        int n = 0;
        if (this.az != null) {
            double d = this.ax.posX - this.posX;
            double d2 = this.ax.posY - this.posY;
            double d3 = this.ax.posZ - this.posZ;
            double d4 = MathHelper.e(d * d + d2 * d2 + d3 * d3);
            double d5 = 0.1;
            this.az.motionX += d * d5;
            this.az.motionY += d2 * d5 + (double)MathHelper.e(d4) * 0.08;
            this.az.motionZ += d3 * d5;
            n = 3;
        } else if (this.aG > 0) {
            og_0 og_02 = new og_0(this.worldObj, this.posX, this.posY, this.posZ, this.c());
            double d = this.ax.posX - this.posX;
            double d6 = this.ax.posY - this.posY;
            double d7 = this.ax.posZ - this.posZ;
            double d8 = MathHelper.e(d * d + d6 * d6 + d7 * d7);
            double d9 = 0.1;
            og_02.motionX = d * d9;
            og_02.motionY = d6 * d9 + (double)MathHelper.e(d8) * 0.08;
            og_02.motionZ = d7 * d9;
            aV8.b(this.worldObj, og_02);
            aV8.b(this.ax.worldObj, new oa_2(this.ax.worldObj, this.ax.posX, this.ax.posY + 0.5, this.ax.posZ + 0.5, a5_0.a(this.Q, 6) + 1));
            n = 1;
        }
        if (this.ao) {
            n = 2;
        }
        this.E();
        this.ax.bk = null;
        return n;
    }

    public oo_1(World world, EntityPlayer entityPlayer) {
        super(world);
        this.G = true;
        this.ax = entityPlayer;
        this.ax.bk = this;
        this.c(0.25f, 0.25f);
        this.c(entityPlayer.posX, entityPlayer.posY + (double)entityPlayer.w(), entityPlayer.posZ, entityPlayer.rotationYaw, entityPlayer.rotationPitch);
        this.posX -= (double)(MathHelper.cos(this.rotationYaw / 180.0f * (float)Math.PI) * 0.16f);
        this.posY -= (double)0.1f;
        this.posZ -= (double)(MathHelper.sin(this.rotationYaw / 180.0f * (float)Math.PI) * 0.16f);
        this.j(this.posX, this.posY, this.posZ);
        float f = 0.4f;
        this.motionX = -MathHelper.sin(this.rotationYaw / 180.0f * (float)Math.PI) * MathHelper.cos(this.rotationPitch / 180.0f * (float)Math.PI) * f;
        this.motionZ = MathHelper.cos(this.rotationYaw / 180.0f * (float)Math.PI) * MathHelper.cos(this.rotationPitch / 180.0f * (float)Math.PI) * f;
        this.motionY = -MathHelper.sin(this.rotationPitch / 180.0f * (float)Math.PI) * f;
        this.a(this.motionX, this.motionY, this.motionZ, 1.5f, 1.0f);
    }
}

