/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MathInvoker;
import deobf.EntityPlayerMP;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import net.minecraft.util.DamageSource;
import deobf.Entity;
import deobf.EntityLivingBase;
import deobf.EntityPlayer;
import net.minecraft.item.ItemStack;
import deobf.Vec3;
import net.minecraft.network.packts.S2BPacketChangeGameState;
import java.util.Iterator;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.nX
 */
public class nx_1
extends ne_2 {
    private int bI;
    private float bH;
    private float bN;
    private boolean bO;
    private float bK;
    private _J bJ;
    private EntityLivingBase bL;
    private float bP;
    private float bM;

    public void C() {
        this.k(true);
        this.bK = 1.0f;
        this.bM = 1.0f;
    }

    @Override
    public boolean Y() {
        return aV8.a(this.worldObj, this.getEntityBoundingBox(), this) && ListInvoker.isEmpty(aV8.b(this.worldObj, this, this.getEntityBoundingBox()));
    }

    @Override
    protected boolean p() {
        return false;
    }

    @Override
    protected void t() {
        ItemStack itemStack = ln_1.a((cj_0)mp_1.a(this.Q, Cc.a()), this.Q);
        this.a(itemStack, 1.0f);
    }

    @Override
    protected String d() {
        return !this.isInWater() ? aOO.e : (this.E() ? aOO.a : aOO.d);
    }

    @Override
    protected void H() {
        super.H();
        Ma.a(this.a(abb_0.f), 6.0);
        Ma.a(this.a(abb_0.e), 0.5);
        Ma.a(this.a(abb_0.c), 16.0);
        Ma.a(this.a(abb_0.b), 30.0);
    }

    public void k(boolean bl) {
        this.b(4, bl);
        this.c(1.9975f, 1.9975f);
        Ma.a(this.a(abb_0.e), 0.3f);
        Ma.a(this.a(abb_0.f), 8.0);
        Ma.a(this.a(abb_0.b), 80.0);
        this.y();
        an4_0.b(this.bJ, 400);
    }

    @Override
    public boolean B() {
        return (a5_0.a(this.Q, 20) == 0 || !aV8.d(this.worldObj, new BlockPos(this))) && super.B();
    }

    static _J a(nx_1 nx_12) {
        return nx_12.bJ;
    }

    @Override
    public int Q() {
        return 160;
    }

    private boolean lambda$updateAITasks$0(EntityPlayerMP entityPlayerMP) {
        return this.g(entityPlayerMP) < 2500.0 && Uf.e(entityPlayerMP.bX);
    }

    public float d(float f) {
        return this.bH + (this.bP - this.bH) * f;
    }

    @Override
    public void b(NBTTagCompound nBTTagCompound) {
        super.b(nBTTagCompound);
        tn_0.a(nBTTagCompound, aOO.g, this.E());
    }

    @Override
    public void f(float f, float f2) {
        if (this.ad()) {
            if (this.isInWater()) {
                this.a(f, f2, 0.1f);
                this.moveEntity(this.motionX, this.motionY, this.motionZ);
                this.motionX *= (double)0.9f;
                this.motionY *= (double)0.9f;
                this.motionZ *= (double)0.9f;
                if (!this.G() && this.ak() == null) {
                    this.motionY -= 0.005;
                }
            } else {
                super.f(f, f2);
            }
        } else {
            super.f(f, f2);
        }
    }

    @Override
    protected void f() {
        super.f();
        if (this.E()) {
            if ((this.ticksExisted + this.r()) % 1200 == 0) {
                Potion potion = Potion.digSlowdown;
                Iterator iterator = ListInvoker.iterator(aV8.a(this.worldObj, EntityPlayerMP.class, this::lambda$updateAITasks$0));
                while (dz_0.c(iterator)) {
                    EntityPlayerMP entityPlayerMP = (EntityPlayerMP)dz_0.b(iterator);
                    if (entityPlayerMP.isPotionActive(potion) && a3M.g(entityPlayerMP.getActivePotionEffect(potion)) >= 2 && a3M.c(entityPlayerMP.getActivePotionEffect(potion)) >= 1200) continue;
                    qv_0.a(entityPlayerMP.playerNetServerHandler, new S2BPacketChangeGameState(10, 0.0f));
                    entityPlayerMP.a(new a2l_0(ari_0.f(potion), 6000, 2));
                }
            }
            if (!this.a()) {
                this.a(new BlockPos(this), 16);
            }
        }
    }

    @Override
    public boolean a(DamageSource damageSource, float f) {
        if (!this.G() && !aDJ.b(damageSource) && aDJ.l(damageSource) instanceof EntityLivingBase) {
            EntityLivingBase entityLivingBase = (EntityLivingBase)aDJ.l(damageSource);
            if (!aDJ.h(damageSource)) {
                entityLivingBase.a(aDJ.a((Entity)this), 2.0f);
                entityLivingBase.a(aOO.f, 0.5f, 1.0f);
            }
        }
        an4_0.a(this.bJ);
        return super.a(damageSource, f);
    }

    @Override
    public void onLivingUpdate() {
        if (this.worldObj.isRemote) {
            this.bH = this.bP;
            if (!this.isInWater()) {
                this.bN = 2.0f;
                if (this.motionY > 0.0 && this.bO && !this.Q()) {
                    aV8.a(this.worldObj, this.posX, this.posY, this.posZ, aOO.k, 1.0f, 1.0f, false);
                }
                this.bO = this.motionY < 0.0 && aV8.c(this.worldObj, amv_2.g(new BlockPos(this)), false);
            } else {
                this.bN = this.G() ? (this.bN < 0.5f ? 4.0f : (this.bN += (0.5f - this.bN) * 0.1f)) : (this.bN += (0.125f - this.bN) * 0.2f);
            }
            this.bP += this.bN;
            this.bM = this.bK;
            this.bK = !this.isInWater() ? a5_0.e(this.Q) : (this.G() ? (this.bK += (0.0f - this.bK) * 0.25f) : (this.bK += (1.0f - this.bK) * 0.06f));
            if (this.G() && this.isInWater()) {
                Vec3 vec3 = this.a(0.0f);
                int n = 0;
                while (true) {
                    aV8.a(this.worldObj, B7.WATER_BUBBLE, this.posX + (a5_0.c(this.Q) - 0.5) * (double)this.width - vec3.xCoord * 1.5, this.posY + a5_0.c(this.Q) * (double)this.n - vec3.yCoord * 1.5, this.posZ + (a5_0.c(this.Q) - 0.5) * (double)this.width - vec3.zCoord * 1.5, 0.0, 0.0, 0.0, new int[0]);
                    ++n;
                }
            }
            if (this.u()) {
                if (this.bI < this.D()) {
                    ++this.bI;
                }
                EntityLivingBase entityLivingBase = this.F();
                abs_1.a(this.C(), entityLivingBase, 90.0f, 90.0f);
                abs_1.d(this.C());
                double d = this.c(0.0f);
                double d2 = entityLivingBase.posX - this.posX;
                double d3 = entityLivingBase.posY + (double)(entityLivingBase.n * 0.5f) - (this.posY + (double)this.w());
                double d4 = entityLivingBase.posZ - this.posZ;
                double d5 = MathInvoker.d(d2 * d2 + d3 * d3 + d4 * d4);
                d2 /= d5;
                d3 /= d5;
                d4 /= d5;
                double d6 = a5_0.c(this.Q);
                while (d6 < d5) {
                    aV8.a(this.worldObj, B7.WATER_BUBBLE, this.posX + d2 * (d6 += 1.8 - d + a5_0.c(this.Q) * (1.7 - d)), this.posY + d3 * d6 + (double)this.w(), this.posZ + d4 * d6, 0.0, 0.0, 0.0, new int[0]);
                }
            }
        }
        if (this.W) {
            this.d(300);
        } else if (this.onGround) {
            this.motionY += 0.5;
            this.motionX += (double)((a5_0.e(this.Q) * 2.0f - 1.0f) * 0.4f);
            this.motionZ += (double)((a5_0.e(this.Q) * 2.0f - 1.0f) * 0.4f);
            this.rotationYaw = a5_0.e(this.Q) * 360.0f;
            this.onGround = false;
            this.p = true;
        }
        if (this.u()) {
            this.rotationYaw = this.aP;
        }
        super.onLivingUpdate();
    }

    private void b(int n, boolean bl) {
        int n2 = aom_0.h(this.l, 16);
        aom_0.b(this.l, 16, P8.d(n2 | n));
    }

    public float c(float f) {
        return ((float)this.bI + f) / (float)this.D();
    }

    public float a(float f) {
        return this.bM + (this.bK - this.bM) * f;
    }

    @Override
    public void g(int n) {
        super.g(n);
        if (n == 16) {
            if (this.E() && this.width < 1.0f) {
                this.c(1.9975f, 1.9975f);
            }
        } else if (n == 17) {
            this.bI = 0;
            this.bL = null;
        }
    }

    @Override
    protected F0 a(World world) {
        return new fw_0(this, world);
    }

    @Override
    public int ag() {
        return 180;
    }

    @Override
    protected String ac() {
        return !this.isInWater() ? aOO.m : (this.E() ? aOO.l : aOO.j);
    }

    @Override
    protected boolean d() {
        return true;
    }

    @Override
    public void g(NBTTagCompound nBTTagCompound) {
        super.g(nBTTagCompound);
        this.k(tn_0.c(nBTTagCompound, aOO.b));
    }

    @Override
    protected String C() {
        return !this.isInWater() ? aOO.i : (this.E() ? aOO.h : aOO.c);
    }

    static void a(nx_1 nx_12, int n) {
        nx_12.j(n);
    }

    private boolean a(int n) {
        return (aom_0.h(this.l, 16) & n) != 0;
    }

    private void j(int n) {
        aom_0.b(this.l, 17, P8.d(n));
    }

    @Override
    protected void b(boolean bl, int n) {
        int n2 = a5_0.a(this.Q, 3) + a5_0.a(this.Q, n + 1);
        this.a(new ItemStack(Items.prismarine_shard, n2, 0), 1.0f);
        if (a5_0.a(this.Q, 3 + n) > 1) {
            this.a(new ItemStack(Items.fish, 1, aC0.e(Ky.COD)), 1.0f);
        } else if (a5_0.a(this.Q, 3 + n) > 1) {
            this.a(new ItemStack(Items.prismarine_crystals, 1, 0), 1.0f);
        }
        if (this.E()) {
            this.a(new ItemStack(Blocks.aM, 1, 1), 1.0f);
        }
    }

    public boolean E() {
        return this.a(4);
    }

    public boolean u() {
        return aom_0.h(this.l, 17) != 0;
    }

    static void a(nx_1 nx_12, boolean bl) {
        nx_12.l(bl);
    }

    @Override
    protected void g() {
        super.g();
        aom_0.a(this.l, 16, P8.d(0));
        aom_0.a(this.l, 17, P8.d(0));
    }

    private void l(boolean bl) {
        this.b(2, bl);
    }

    public boolean G() {
        return this.a(2);
    }

    @Override
    public float b(BlockPos blockPos) {
        return BlocksInvoker.getBlockState(BlockStateInvoker.getBlock(aV8.q(this.worldObj, blockPos))) == Material.M ? 10.0f + aV8.i(this.worldObj, blockPos) - 0.5f : super.b(blockPos);
    }

    public int D() {
        return this.E() ? 60 : 80;
    }

    public nx_1(World world) {
        super(world);
        this.bk = 10;
        this.c(0.85f, 0.85f);
        aMS.a(this.bx, 4, new alx_1(this));
        _P _P2 = new _P(this, 1.0);
        aMS.a(this.bx, 5, _P2);
        this.bJ = new _J(this, 1.0, 80);
        aMS.a(this.bx, 7, this.bJ);
        aMS.a(this.bx, 8, new aly_2(this, EntityPlayer.class, 8.0f));
        aMS.a(this.bx, 8, new aly_2(this, nx_1.class, 12.0f, 0.01f));
        aMS.a(this.bx, 9, new _A(this));
        an4_0.a(this.bJ, 3);
        PA.a(_P2, 3);
        aMS.a(this.bv, 1, new _m_0<EntityLivingBase>(this, EntityLivingBase.class, 10, true, false, new akw_0(this)));
        this.br = new pj_0(this);
        this.bH = this.bP = a5_0.e(this.Q);
    }

    public EntityLivingBase F() {
        if (!this.u()) {
            return null;
        }
        if (this.worldObj.isRemote) {
            if (this.bL != null) {
                return this.bL;
            }
            Entity entity = aV8.b(this.worldObj, aom_0.h(this.l, 17));
            if (entity instanceof EntityLivingBase) {
                this.bL = (EntityLivingBase)entity;
                return this.bL;
            }
            return null;
        }
        return this.ak();
    }

    @Override
    public float w() {
        return this.n * 0.5f;
    }
}

