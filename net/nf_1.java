/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.InventoryInvoker;
import cc.novoline.invoke.StringInvoker;
import deobf.EntityArrow;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.util.DamageSource;
import deobf.Entity;
import deobf.EntityLivingBase;
import deobf.EntityPlayer;
import net.minecraft.item.ItemStack;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.nF
 */
public class nf_1
extends no_1 {
    private boolean bU;
    private float bR;
    private float bQ;
    private float bV;
    private float bT;
    private boolean bS;

    @Override
    protected String d() {
        return SE.h;
    }

    @Override
    public void onUpdate() {
        super.onUpdate();
        this.bT = this.bR;
        this.bR = this.x() ? (this.bR += (1.0f - this.bR) * 0.4f) : (this.bR += (0.0f - this.bR) * 0.4f);
        if (this.am()) {
            this.bU = true;
            this.bS = false;
            this.bQ = 0.0f;
            this.bV = 0.0f;
        } else if ((this.bU || this.bS) && this.bS) {
            if (this.bQ == 0.0f) {
                this.a(SE.a, this.f(), (a5_0.e(this.Q) - a5_0.e(this.Q)) * 0.2f + 1.0f);
            }
            this.bV = this.bQ;
            this.bQ += 0.05f;
            if (this.bV >= 2.0f) {
                this.bU = false;
                this.bS = false;
                this.bV = 0.0f;
                this.bQ = 0.0f;
            }
            if (this.bQ > 0.4f) {
                float f = (float)this.getEntityBoundingBox().a;
                int n = (int)(MathHelper.sin((this.bQ - 0.4f) * (float)Math.PI) * 7.0f);
                for (int i = 0; i < n; ++i) {
                    float f2 = (a5_0.e(this.Q) * 2.0f - 1.0f) * this.width * 0.5f;
                    float f3 = (a5_0.e(this.Q) * 2.0f - 1.0f) * this.width * 0.5f;
                    aV8.a(this.worldObj, B7.WATER_SPLASH, this.posX + (double)f2, f + 0.8f, this.posZ + (double)f3, this.motionX, this.motionY, this.motionZ, new int[0]);
                }
            }
        }
    }

    @Override
    public boolean b(ItemStack itemStack) {
        return act_2.k(itemStack) instanceof LA && qe_1.a((LA)act_2.k(itemStack));
    }

    @Override
    public boolean d(Entity entity) {
        boolean bl = entity.a(aDJ.a(this), (float)((int)Ma.d(this.a(abb_0.f))));
        this.a((EntityLivingBase)this, entity);
        return bl;
    }

    public boolean x() {
        return aom_0.g(this.l, 19) == 1;
    }

    @Override
    public float w() {
        return this.n * 0.8f;
    }

    @Override
    public boolean a(EntityLivingBase entityLivingBase, EntityLivingBase entityLivingBase2) {
        if (!(entityLivingBase instanceof nd_2) && !(entityLivingBase instanceof nw_1)) {
            nf_1 nf_12;
            if (entityLivingBase instanceof nf_1 && (nf_12 = (nf_1)entityLivingBase).v() && nf_12.a() == entityLivingBase2) {
                return false;
            }
            return !(entityLivingBase instanceof EntityPlayer && entityLivingBase2 instanceof EntityPlayer && !a6w_0.a((EntityPlayer)entityLivingBase2, (EntityPlayer)entityLivingBase) || entityLivingBase instanceof na_1 && avq_0.p((na_1)entityLivingBase));
        }
        return false;
    }

    @Override
    public void a(byte by) {
        if (by == 8) {
            this.bS = true;
            this.bQ = 0.0f;
            this.bV = 0.0f;
        } else {
            super.a(by);
        }
    }

    @Override
    public boolean a(EntityPlayer entityPlayer) {
        ItemStack itemStack = InventoryInvoker.g(entityPlayer.inventory);
        if (this.v()) {
            YZ yZ;
            if (act_2.k(itemStack) instanceof LA) {
                LA lA = (LA)act_2.k(itemStack);
                if (qe_1.a(lA) && aom_0.a(this.l, 18) < 20.0f) {
                    if (!aSY.a(entityPlayer.abilities)) {
                        --itemStack.a;
                    }
                    this.d((float)qe_1.b(lA, itemStack));
                    if (itemStack.a <= 0) {
                        InventoryInvoker.a(entityPlayer.inventory, entityPlayer.inventory.a, null);
                    }
                    return true;
                }
            } else if (act_2.k(itemStack) == Items.dye && (yZ = my_2.b(act_2.c(itemStack))) != this.z()) {
                this.a(yZ);
                if (!aSY.a(entityPlayer.abilities) && --itemStack.a <= 0) {
                    InventoryInvoker.a(entityPlayer.inventory, entityPlayer.inventory.a, null);
                }
                return true;
            }
            if (this.a((EntityLivingBase)entityPlayer) && !this.worldObj.isRemote && !this.b(itemStack)) {
                this.bP.a(!this.d());
                this.isJumping = false;
                tz_1.a(this.bl);
                this.c((EntityLivingBase)null);
            }
        } else if (act_2.k(itemStack) == Items.bone && !this.A()) {
            if (!aSY.a(entityPlayer.abilities)) {
                --itemStack.a;
            }
            if (itemStack.a <= 0) {
                InventoryInvoker.a(entityPlayer.inventory, entityPlayer.inventory.a, null);
            }
            if (!this.worldObj.isRemote) {
                if (a5_0.a(this.Q, 3) == 0) {
                    this.n(true);
                    tz_1.a(this.bl);
                    this.c((EntityLivingBase)null);
                    this.bP.a(true);
                    this.i(20.0f);
                    this.b(entityPlayer.J().toString());
                    this.m(true);
                    aV8.a(this.worldObj, (Entity)this, (byte)7);
                } else {
                    this.m(false);
                    aV8.a(this.worldObj, (Entity)this, (byte)6);
                }
            }
            return true;
        }
        return super.a(entityPlayer);
    }

    public float b(float f, float f2) {
        float f3 = (this.bV + (this.bQ - this.bV) * f + f2) / 1.8f;
        if (f3 < 0.0f) {
            f3 = 0.0f;
        } else if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        return MathHelper.sin(f3 * (float)Math.PI) * MathHelper.sin(f3 * (float)Math.PI * 11.0f) * 0.15f * (float)Math.PI;
    }

    @Override
    protected boolean s() {
        return !this.v() && this.ticksExisted > 2400;
    }

    public boolean w() {
        return this.bU;
    }

    @Override
    protected void f() {
        aom_0.b(this.l, 18, axx_1.a(this.a()));
    }

    public nf_1(World world) {
        super(world);
        this.c(0.6f, 0.8f);
        afv_0.b((F_)this.Z(), true);
        aMS.a(this.bx, 1, new _X(this));
        aMS.a(this.bx, 2, this.bP);
        aMS.a(this.bx, 3, new _a_0(this, 0.4f));
        aMS.a(this.bx, 4, new _r_0(this, 1.0, true));
        aMS.a(this.bx, 5, new _5(this, 1.0, 10.0f, 2.0f));
        aMS.a(this.bx, 6, new _h_0(this, 1.0));
        aMS.a(this.bx, 7, new _J(this, 1.0));
        aMS.a(this.bx, 8, new _Q(this, 8.0f));
        aMS.a(this.bx, 9, new aly_2(this, EntityPlayer.class, 8.0f));
        aMS.a(this.bx, 9, new _A(this));
        aMS.a(this.bv, 1, new _Y(this));
        aMS.a(this.bv, 2, new _K(this));
        aMS.a(this.bv, 3, new _9((nu_1)this, true, new Class[0]));
        aMS.a(this.bv, 4, new _0<Entity>(this, n5_0.class, false, new w_0(this)));
        aMS.a(this.bv, 5, new _m_0<nM>((nu_1)this, nM.class, false));
        this.n(false);
    }

    @Override
    public boolean a(DamageSource damageSource, float f) {
        if (this.a(damageSource)) {
            return false;
        }
        Entity entity = aDJ.d(damageSource);
        this.bP.a(false);
        if (!(entity instanceof EntityPlayer) && !(entity instanceof EntityArrow)) {
            f = (f + 1.0f) / 2.0f;
        }
        return super.a(damageSource, f);
    }

    public void o(boolean bl) {
        byte by = aom_0.g(this.l, 16);
        aom_0.b(this.l, 16, axt_2.a((byte)(by | 2)));
    }

    @Override
    public void onLivingUpdate() {
        super.onLivingUpdate();
        if (!this.worldObj.isRemote && this.bU && !this.bS && !this.t() && this.onGround) {
            this.bS = true;
            this.bQ = 0.0f;
            this.bV = 0.0f;
            aV8.a(this.worldObj, (Entity)this, (byte)8);
        }
        if (!this.worldObj.isRemote && this.ak() == null && this.A()) {
            this.o(false);
        }
    }

    @Override
    public void n(boolean bl) {
        super.n(bl);
        Ma.a(this.a(abb_0.b), 20.0);
        Ma.a(this.a(abb_0.f), 4.0);
    }

    @Override
    protected void g() {
        super.g();
        aom_0.a(this.l, 18, axx_1.a(this.a()));
        aom_0.a(this.l, 19, axt_2.a((byte)0));
        aom_0.a(this.l, 20, axt_2.a((byte)my_2.a(YZ.RED)));
    }

    @Override
    public void c(EntityLivingBase entityLivingBase) {
        super.c(entityLivingBase);
        this.o(false);
    }

    @Override
    protected String C() {
        return SE.c;
    }

    @Override
    public void b(NBTTagCompound nBTTagCompound) {
        super.b(nBTTagCompound);
        tn_0.a(nBTTagCompound, SE.j, this.A());
        tn_0.a(nBTTagCompound, SE.g, (byte)my_2.c(this.z()));
    }

    @Override
    protected float f() {
        return 0.4f;
    }

    @Override
    protected String ac() {
        return this.A() ? SE.b : (a5_0.a(this.Q, 3) == 0 ? (this.v() && aom_0.a(this.l, 18) < 10.0f ? SE.i : SE.m) : SE.k);
    }

    @Override
    public boolean ab() {
        return !this.A() && super.ab();
    }

    @Override
    protected void H() {
        super.H();
        Ma.a(this.a(abb_0.e), 0.3f);
        if (this.v()) {
            Ma.a(this.a(abb_0.b), 20.0);
        } else {
            Ma.a(this.a(abb_0.b), 8.0);
        }
        ht_0.b(this.N(), abb_0.f);
        Ma.a(this.a(abb_0.f), 2.0);
    }

    @Override
    protected Item j() {
        return px_0.a(-1);
    }

    public float c(float f) {
        return (this.bT + (this.bR - this.bT) * f) * 0.15f * (float)Math.PI;
    }

    public YZ z() {
        return my_2.b(aom_0.g(this.l, 20) & 0xF);
    }

    @Override
    public nf_1 a(n4_0 n4_02) {
        nf_1 nf_12 = new nf_1(this.worldObj);
        String string = this.a();
        if (!StringInvoker.g(StringInvoker.h(string))) {
            nf_12.b(string);
            nf_12.n(true);
        }
        return nf_12;
    }

    public float a(float f) {
        return 0.75f + (this.bV + (this.bQ - this.bV) * f) / 2.0f * 0.25f;
    }

    public void p(boolean bl) {
        aom_0.b(this.l, 19, axt_2.a((byte)1));
    }

    @Override
    public boolean a(n5_0 n5_02) {
        if (n5_02 == this) {
            return false;
        }
        if (!this.v()) {
            return false;
        }
        if (!(n5_02 instanceof nf_1)) {
            return false;
        }
        nf_1 nf_12 = (nf_1)n5_02;
        return nf_12.v() && !nf_12.d() && this.u() && nf_12.u();
    }

    @Override
    protected void a(BlockPos blockPos, Block block) {
        this.a(SE.f, 0.15f, 1.0f);
    }

    @Override
    public int ag() {
        return this.d() ? 20 : super.ag();
    }

    public void a(YZ yZ) {
        aom_0.b(this.l, 20, axt_2.a((byte)(my_2.c(yZ) & 0xF)));
    }

    public boolean A() {
        return (aom_0.g(this.l, 16) & 2) != 0;
    }

    @Override
    public int al() {
        return 8;
    }

    public float y() {
        return this.A() ? 1.5393804f : (this.v() ? (0.55f - (20.0f - aom_0.a(this.l, 18)) * 0.02f) * (float)Math.PI : 0.62831855f);
    }

    @Override
    public void g(NBTTagCompound nBTTagCompound) {
        super.g(nBTTagCompound);
        this.o(tn_0.c(nBTTagCompound, SE.l));
        if (tn_0.a(nBTTagCompound, SE.e, 99)) {
            this.a(my_2.b(tn_0.e(nBTTagCompound, SE.d)));
        }
    }
}

