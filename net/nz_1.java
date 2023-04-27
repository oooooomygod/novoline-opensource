/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net;

import cc.novoline.invoke.ListInvoker;
import com.google.common.base.Predicate;
import deobf.EntityArrow;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import net.minecraft.util.DamageSource;
import deobf.Entity;
import deobf.EntityLivingBase;
import deobf.EntityPlayer;
import deobf.EnumDifficulty;
import java.util.Iterator;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.nz
 */
public class nz_1
extends ne_2
implements ay3_0,
a1l {
    private int bO;
    private float[] bM;
    private float[] bH = new float[2];
    private float[] bK;
    private int[] bN;
    private static Predicate<Entity> bL = nz_1::lambda$static$0;
    private float[] bJ;
    private int[] bI;

    @Override
    public int O() {
        return 4;
    }

    @Override
    public int d(float f) {
        return 0xF000F0;
    }

    @Override
    protected void R() {
        this.aF = 0;
    }

    @Override
    protected void b(boolean bl, int n) {
        og_0 og_02 = this.a(Items.nether_star, 1);
        aec_0.g(og_02);
        if (!this.worldObj.isRemote) {
            Iterator iterator = ListInvoker.iterator(aV8.a(this.worldObj, EntityPlayer.class, h__0.d(this.getEntityBoundingBox(), 50.0, 100.0, 50.0)));
            while (dz_0.c(iterator)) {
                EntityPlayer entityPlayer = (EntityPlayer)dz_0.b(iterator);
                a6w_0.a(entityPlayer, apf_0.i);
            }
        }
    }

    @Override
    protected String C() {
        return aic_1.b;
    }

    public void j(int n) {
        aom_0.b(this.l, 20, P8.d(n));
    }

    public float c(int n) {
        return this.bM[n];
    }

    private double l(int n) {
        return this.posX;
    }

    @Override
    public void a(EntityLivingBase entityLivingBase, float f) {
        this.a(0, entityLivingBase);
    }

    @Override
    protected void g() {
        super.g();
        aom_0.a(this.l, 17, P8.d(0));
        aom_0.a(this.l, 18, P8.d(0));
        aom_0.a(this.l, 19, P8.d(0));
        aom_0.a(this.l, 20, P8.d(0));
    }

    @Override
    public void b() {
    }

    @Override
    public void b(float f, float f2) {
    }

    @Override
    public aH2 ae() {
        return aH2.UNDEAD;
    }

    @Override
    public boolean a(DamageSource damageSource, float f) {
        if (this.a(damageSource)) {
            return false;
        }
        if (damageSource != DamageSource.f && !(aDJ.d(damageSource) instanceof nz_1)) {
            Entity entity;
            if (this.v() > 0 && damageSource != DamageSource.m) {
                return false;
            }
            if (this.u() && (entity = aDJ.l(damageSource)) instanceof EntityArrow) {
                return false;
            }
            entity = aDJ.d(damageSource);
            if (!(entity instanceof EntityPlayer) && entity instanceof EntityLivingBase && ((EntityLivingBase)entity).ae() == this.ae()) {
                return false;
            }
            if (this.bO <= 0) {
                this.bO = 20;
            }
            int n = 0;
            while (n < this.bI.length) {
                int n2 = n++;
                this.bI[n2] = this.bI[n2] + 3;
            }
            return super.a(damageSource, f);
        }
        return false;
    }

    public boolean u() {
        return this.a() <= this.b() / 2.0f;
    }

    private void a(int n, EntityLivingBase entityLivingBase) {
        this.a(n, entityLivingBase.posX, entityLivingBase.posY + (double)entityLivingBase.w() * 0.5, entityLivingBase.posZ, a5_0.e(this.Q) < 0.001f);
    }

    @Override
    public void b(NBTTagCompound nBTTagCompound) {
        super.b(nBTTagCompound);
        tn_0.b(nBTTagCompound, aic_1.d, this.v());
    }

    private static boolean lambda$static$0(Entity entity) {
        return entity instanceof EntityLivingBase && ((EntityLivingBase)entity).ae() != aH2.UNDEAD;
    }

    private double m(int n) {
        return this.posZ;
    }

    public nz_1(World world) {
        super(world);
        this.bM = new float[2];
        this.bJ = new float[2];
        this.bK = new float[2];
        this.bN = new int[2];
        this.bI = new int[2];
        this.i(this.b());
        this.c(0.9f, 3.5f);
        this.S = true;
        afv_0.e((F_)this.Z(), true);
        aMS.a(this.bx, 0, new _X(this));
        aMS.a(this.bx, 2, new _V(this, 1.0, 40, 20.0f));
        aMS.a(this.bx, 5, new _J(this, 1.0));
        aMS.a(this.bx, 6, new aly_2(this, EntityPlayer.class, 8.0f));
        aMS.a(this.bx, 7, new _A(this));
        aMS.a(this.bv, 1, new _9((nu_1)this, false, new Class[0]));
        aMS.a(this.bv, 2, new _m_0<Entity>(this, nl_1.class, 0, false, false, bL));
        this.bk = 50;
    }

    public static boolean a(Block block) {
        return block != Blocks.bedrock && block != Blocks.aS && block != Blocks.aK && block != Blocks.bz && block != Blocks.ao;
    }

    @Override
    public void g(NBTTagCompound nBTTagCompound) {
        super.g(nBTTagCompound);
        this.j(tn_0.g(nBTTagCompound, aic_1.g));
    }

    public int v() {
        return aom_0.h(this.l, 20);
    }

    private float b(float f, float f2, float f3) {
        float f4 = MathHelper.a(f2 - f);
        if (f4 > f3) {
            f4 = f3;
        }
        if (f4 < -f3) {
            f4 = -f3;
        }
        return f + f4;
    }

    private double k(int n) {
        return this.posY + 3.0;
    }

    @Override
    protected String d() {
        return aic_1.f;
    }

    @Override
    public void a(a2l_0 a2l_02) {
    }

    @Override
    protected String ac() {
        return aic_1.e;
    }

    public int b(int n) {
        return aom_0.h(this.l, 17 + n);
    }

    @Override
    protected void H() {
        super.H();
        Ma.a(this.a(abb_0.b), 300.0);
        Ma.a(this.a(abb_0.e), 0.6f);
        Ma.a(this.a(abb_0.c), 40.0);
    }

    private void a(int n, double d, double d2, double d3, boolean bl) {
        aV8.a(this.worldObj, null, 1014, new BlockPos(this), 0);
        double d4 = this.l(n);
        double d5 = this.k(n);
        double d6 = this.m(n);
        double d7 = d - d4;
        double d8 = d2 - d5;
        double d9 = d3 - d6;
        oe_1 oe_12 = new oe_1(this.worldObj, this, d7, d8, d9);
        akj_2.a(oe_12, true);
        oe_12.posY = d5;
        oe_12.posX = d4;
        oe_12.posZ = d6;
        aV8.b(this.worldObj, oe_12);
    }

    @Override
    public void onLivingUpdate() {
        this.motionY *= (double)0.6f;
        if (!this.worldObj.isRemote && this.b(0) > 0) {
            double d;
            double d2;
            double d3;
            Entity entity = aV8.b(this.worldObj, this.b(0));
            if (this.posY < entity.posY || !this.u() && this.posY < entity.posY + 5.0) {
                if (this.motionY < 0.0) {
                    this.motionY = 0.0;
                }
                this.motionY += (0.5 - this.motionY) * (double)0.6f;
            }
            if ((d3 = (d2 = entity.posX - this.posX) * d2 + (d = entity.posZ - this.posZ) * d) > 9.0) {
                double d4 = MathHelper.e(d3);
                this.motionX += (d2 / d4 * 0.5 - this.motionX) * (double)0.6f;
                this.motionZ += (d / d4 * 0.5 - this.motionZ) * (double)0.6f;
            }
        }
        if (this.motionX * this.motionX + this.motionZ * this.motionZ > (double)0.05f) {
            this.rotationYaw = (float)MathHelper.c(this.motionZ, this.motionX) * 57.295776f - 90.0f;
        }
        super.onLivingUpdate();
        int n = 0;
        while (true) {
            this.bK[n] = this.bM[n];
            this.bJ[n] = this.bH[n];
            ++n;
        }
    }

    @Override
    public void mountEntity(Entity entity) {
        this.r = null;
    }

    @Override
    protected void f() {
        if (this.v() > 0) {
            int n = this.v() - 1;
            aV8.a(this.worldObj, this, this.posX, this.posY + (double)this.w(), this.posZ, 7.0f, false, J9.c(aV8.k(this.worldObj), aic_1.a));
            aV8.a(this.worldObj, 1013, new BlockPos(this), 0);
            this.j(n);
            if (this.ticksExisted % 10 == 0) {
                this.d(10.0f);
            }
            return;
        }
        super.f();
        int n = 1;
        while (true) {
            if (this.ticksExisted >= this.bN[n - 1]) {
                Entity entity;
                int n2;
                this.bN[n - 1] = this.ticksExisted + 10 + a5_0.a(this.Q, 10);
                if (aV8.p(this.worldObj) == EnumDifficulty.NORMAL || aV8.p(this.worldObj) == EnumDifficulty.HARD) {
                    n2 = n - 1;
                    int n3 = this.bI[n - 1];
                    this.bI[n2] = this.bI[n - 1] + 1;
                    if (n3 > 15) {
                        float f = 10.0f;
                        float f2 = 5.0f;
                        double d = MathHelper.a(this.Q, this.posX - (double)f, this.posX + (double)f);
                        double d2 = MathHelper.a(this.Q, this.posY - (double)f2, this.posY + (double)f2);
                        double d3 = MathHelper.a(this.Q, this.posZ - (double)f, this.posZ + (double)f);
                        this.a(n + 1, d, d2, d3, true);
                        this.bI[n - 1] = 0;
                    }
                }
                if ((entity = aV8.b(this.worldObj, n2 = this.b(n))).n() && this.g(entity) <= 900.0 && this.a(entity)) {
                    if (entity instanceof EntityPlayer && aSY.b(((EntityPlayer)entity).abilities)) {
                        this.a(n, 0);
                    } else {
                        this.a(n + 1, (EntityLivingBase)entity);
                        this.bN[n - 1] = this.ticksExisted + 40 + a5_0.a(this.Q, 20);
                        this.bI[n - 1] = 0;
                    }
                } else {
                    this.a(n, 0);
                }
            }
            ++n;
        }
    }

    public float a(int n) {
        return this.bH[n];
    }

    public void C() {
        this.j(220);
        this.i(this.b() / 3.0f);
    }

    public void a(int n, int n2) {
        aom_0.b(this.l, 17 + n, P8.d(n2));
    }
}

