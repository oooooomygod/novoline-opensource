/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.InventoryInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MathInvoker;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import net.minecraft.util.DamageSource;
import deobf.Entity;
import deobf.EntityLivingBase;
import deobf.EntityPlayer;
import deobf.EnumDifficulty;
import deobf.IAttribute;
import deobf.IBlockAccess;
import net.minecraft.item.ItemStack;
import java.util.Calendar;
import java.util.List;
import java.util.UUID;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.n0
 */
public class n0_0
extends ne_2 {
    private static AttributeModifier bI;
    private static UUID bH;
    private boolean bM = false;
    private float bN = -1.0f;
    protected static IAttribute bK;
    private _n_0 bJ = new _n_0(this);
    private int bO;
    private float bL;

    public boolean u() {
        return this.bM;
    }

    public boolean Z() {
        return aom_0.g(this.t(), 14) == 1;
    }

    @Override
    public void g(NBTTagCompound nBTTagCompound) {
        super.g(nBTTagCompound);
        if (tn_0.c(nBTTagCompound, kz_0.r)) {
            this.n(true);
        }
        if (tn_0.c(nBTTagCompound, kz_0.a)) {
            this.m(true);
        }
        if (tn_0.a(nBTTagCompound, kz_0.i, 99) && tn_0.g(nBTTagCompound, kz_0.k) > -1) {
            this.j(tn_0.g(nBTTagCompound, kz_0.h));
        }
        this.k(tn_0.c(nBTTagCompound, kz_0.e));
    }

    @Override
    public aH2 ae() {
        return aH2.UNDEAD;
    }

    @Override
    public void onLivingUpdate() {
        if (aV8.t(this.worldObj) && !this.worldObj.isRemote && !this.j()) {
            float f = this.b(1.0f);
            BlockPos blockPos = new BlockPos(this.posX, MathInvoker.f(this.posY), this.posZ);
            if (f > 0.5f && a5_0.e(this.Q) * 30.0f < (f - 0.4f) * 2.0f && aV8.w(this.worldObj, blockPos)) {
                ItemStack itemStack = this.d(4);
                if (act_2.y(itemStack)) {
                    act_2.a(itemStack, act_2.s(itemStack) + a5_0.a(this.Q, 2));
                    if (act_2.s(itemStack) >= act_2.u(itemStack)) {
                        this.b(itemStack);
                        this.c(4, null);
                    }
                }
                this.a(8);
            }
        }
        if (this.isRiding() && this.ak() != null && this.r instanceof nd_1) {
            tz_1.a(((nl_1)this.r).Z(), tz_1.c(this.Z()), 1.5);
        }
        super.onLivingUpdate();
    }

    protected void C() {
        nz_0 nz_02 = new nz_0(this.worldObj);
        nz_02.d(this);
        nz_02.a(aV8.b(this.worldObj, new BlockPos(nz_02)), null);
        ayh_1.j(nz_02);
        if (this.j()) {
            ayh_1.a(nz_02, -24000);
        }
        aV8.c(this.worldObj, this);
        nz_02.j(this.aj());
        if (this.e()) {
            nz_02.a(this.y());
            nz_02.g(this.aA());
        }
        aV8.b(this.worldObj, nz_02);
        nz_02.a(new a2l_0(ari_0.f(Potion.confusion), 200, 0));
        aV8.a(this.worldObj, null, 1017, new BlockPos((int)this.posX, (int)this.posY, (int)this.posZ), 0);
    }

    @Override
    public boolean a(DamageSource damageSource, float f) {
        if (super.a(damageSource, f)) {
            EntityLivingBase entityLivingBase = this.ak();
            if (aDJ.d(damageSource) instanceof EntityLivingBase) {
                entityLivingBase = (EntityLivingBase)aDJ.d(damageSource);
            }
            if (aV8.p(this.worldObj) == EnumDifficulty.HARD && (double)a5_0.e(this.Q) < Ma.d(this.a(bK))) {
                int n = MathHelper.floor_double(this.posX);
                int n2 = MathHelper.floor_double(this.posY);
                int n3 = MathHelper.floor_double(this.posZ);
                n0_0 n0_02 = new n0_0(this.worldObj);
                int n4 = 0;
                while (true) {
                    int n5;
                    int n6;
                    int n7;
                    if (aV8.a((IBlockAccess)this.worldObj, new BlockPos(n7 = n + MathHelper.a(this.Q, 7, 40) * MathHelper.a(this.Q, -1, 1), (n6 = n2 + MathHelper.a(this.Q, 7, 40) * MathHelper.a(this.Q, -1, 1)) - 1, n5 = n3 + MathHelper.a(this.Q, 7, 40) * MathHelper.a(this.Q, -1, 1))) && aV8.l(this.worldObj, new BlockPos(n7, n6, n5)) < 10) {
                        n0_02.j(n7, n6, n5);
                        if (!aV8.a(this.worldObj, (double)n7, (double)n6, (double)n5, 7.0) && aV8.a(this.worldObj, n0_02.getEntityBoundingBox(), n0_02) && ListInvoker.isEmpty(aV8.b(this.worldObj, n0_02, n0_02.getEntityBoundingBox())) && !aV8.b(this.worldObj, n0_02.getEntityBoundingBox())) {
                            aV8.b(this.worldObj, n0_02);
                            n0_02.c(entityLivingBase);
                            n0_02.a(aV8.b(this.worldObj, new BlockPos(n0_02)), null);
                            Ma.a(this.a(bK), new AttributeModifier(kz_0.m, -0.05f, 0));
                            Ma.a(n0_02.a(bK), new AttributeModifier(kz_0.o, -0.05f, 0));
                            break;
                        }
                    }
                    ++n4;
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public boolean d(Entity entity) {
        boolean bl = super.d(entity);
        int n = aYj.a(aV8.p(this.worldObj));
        if (this.ah() == null && this.ag() && a5_0.e(this.Q) < (float)n * 0.3f) {
            entity.a(2 * n);
        }
        return bl;
    }

    protected void j(int n) {
        this.bO = n;
        aom_0.b(this.t(), 14, axt_2.a((byte)1));
        this.i(ari_0.f(Potion.weakness));
        this.a(new a2l_0(ari_0.f(Potion.damageBoost), n, MathInvoker.b(aYj.a(aV8.p(this.worldObj)) - 1, 0)));
        aV8.a(this.worldObj, (Entity)this, (byte)16);
    }

    @Override
    protected void a(BlockPos blockPos, Block block) {
        this.a(kz_0.u, 0.15f, 1.0f);
    }

    @Override
    public double H() {
        return this.j() ? 0.0 : -0.35;
    }

    @Override
    public boolean a(EntityPlayer entityPlayer) {
        ItemStack itemStack = a6w_0.n(entityPlayer);
        if (act_2.k(itemStack) == Items.golden_apple && act_2.c(itemStack) == 0 && this.v() && this.isPotionActive(Potion.weakness)) {
            if (!aSY.a(entityPlayer.abilities)) {
                --itemStack.a;
            }
            if (itemStack.a <= 0) {
                InventoryInvoker.a(entityPlayer.inventory, entityPlayer.inventory.a, null);
            }
            if (!this.worldObj.isRemote) {
                this.j(a5_0.a(this.Q, 2401) + 3600);
            }
            return true;
        }
        return false;
    }

    @Override
    protected void t() {
        switch (a5_0.a(this.Q, 3)) {
            case 0: {
                this.a(Items.iron_ingot, 1);
                break;
            }
            case 1: {
                this.a(Items.carrot, 1);
                break;
            }
            case 2: {
                this.a(Items.potato, 1);
            }
        }
    }

    @Override
    public float w() {
        float f = 1.74f;
        if (this.j()) {
            f = (float)((double)f - 0.81);
        }
        return f;
    }

    @Override
    protected String C() {
        return kz_0.q;
    }

    @Override
    protected String ac() {
        return kz_0.d;
    }

    @Override
    protected void g() {
        super.g();
        aom_0.a(this.t(), 12, axt_2.a((byte)0));
        aom_0.a(this.t(), 13, axt_2.a((byte)0));
        aom_0.a(this.t(), 14, axt_2.a((byte)0));
    }

    public n0_0(World world) {
        super(world);
        afv_0.a((F_)this.Z(), true);
        aMS.a(this.bx, 0, new _X(this));
        aMS.a(this.bx, 2, new _r_0(this, EntityPlayer.class, 1.0, false));
        aMS.a(this.bx, 5, new _P(this, 1.0));
        aMS.a(this.bx, 7, new _J(this, 1.0));
        aMS.a(this.bx, 8, new aly_2(this, EntityPlayer.class, 8.0f));
        aMS.a(this.bx, 8, new _A(this));
        this.P();
        this.c(0.6f, 1.95f);
    }

    @Override
    protected void b(ach_0 ach_02) {
        super.b(ach_02);
        float f = a5_0.e(this.Q);
        float f2 = aV8.p(this.worldObj) == EnumDifficulty.HARD ? 0.05f : 0.01f;
        if (f < f2) {
            a5_0.a(this.Q, 3);
            this.c(0, new ItemStack(Items.iron_sword));
        }
    }

    public void l(boolean bl) {
        this.l(0.5f);
    }

    @Override
    public void b(NBTTagCompound nBTTagCompound) {
        super.b(nBTTagCompound);
        if (this.j()) {
            tn_0.a(nBTTagCompound, kz_0.g, true);
        }
        if (this.v()) {
            tn_0.a(nBTTagCompound, kz_0.x, true);
        }
        tn_0.b(nBTTagCompound, kz_0.b, this.Z() ? this.bO : -1);
        tn_0.a(nBTTagCompound, kz_0.c, this.u());
    }

    @Override
    public void onUpdate() {
        if (!this.worldObj.isRemote && this.Z()) {
            int n = this.a();
            this.bO -= n;
            if (this.bO <= 0) {
                this.C();
            }
        }
        super.onUpdate();
    }

    static {
        bK = aHx.a(new S_(null, kz_0.w, 0.0, 0.0, 1.0), kz_0.t);
        bH = awc_1.a(kz_0.s);
        bI = new AttributeModifier(bH, kz_0.v, 0.5, 1);
    }

    @Override
    protected boolean a(ItemStack itemStack) {
        return (act_2.k(itemStack) != Items.egg || !this.j() || !this.isRiding()) && super.a(itemStack);
    }

    protected int a() {
        int n = 1;
        if (a5_0.e(this.Q) < 0.01f) {
            int n2 = 0;
            z6_0 z6_02 = new z6_0();
            for (int i = (int)this.posX - 4; i < (int)this.posX + 4; ++i) {
                for (int j = (int)this.posY - 4; j < (int)this.posY + 4; ++j) {
                    for (int k = (int)this.posZ - 4; k < (int)this.posZ + 4; ++k) {
                        Block block = BlockStateInvoker.getBlock(aV8.q(this.worldObj, ain_1.a(z6_02, i, j, k)));
                        if (block != Blocks.by && block != Blocks.aw) continue;
                        if (a5_0.e(this.Q) < 0.3f) {
                            ++n;
                        }
                        ++n2;
                    }
                }
            }
        }
        return n;
    }

    @Override
    public int O() {
        int n = super.O() + 2;
        if (n > 20) {
            n = 20;
        }
        return n;
    }

    @Override
    public amk_0 a(ach_0 ach_02, amk_0 amk_02) {
        Object object;
        amk_02 = super.a(ach_02, amk_02);
        float f = v8_0.b(ach_02);
        this.i(a5_0.e(this.Q) < 0.55f * f);
        amk_02 = new S(a5_0.e(this.worldObj.o) < 0.05f, a5_0.e(this.worldObj.o) < 0.05f, null);
        if (amk_02 instanceof S) {
            object = (S)amk_02;
            if (((S)object).a) {
                this.m(true);
            }
            if (((S)object).b) {
                this.n(true);
                if ((double)a5_0.e(this.worldObj.o) < 0.05) {
                    List list = aV8.a(this.worldObj, nd_1.class, h__0.d(this.getEntityBoundingBox(), 5.0, 3.0, 5.0), od_2.c);
                    if (!ListInvoker.isEmpty(list)) {
                        nd_1 nd_12 = (nd_1)ListInvoker.get(list, 0);
                        aBT.a(nd_12, true);
                        this.mountEntity(nd_12);
                    }
                } else if ((double)a5_0.e(this.worldObj.o) < 0.05) {
                    nd_1 nd_13 = new nd_1(this.worldObj);
                    nd_13.c(this.posX, this.posY, this.posZ, this.rotationYaw, 0.0f);
                    nd_13.a(ach_02, null);
                    aBT.a(nd_13, true);
                    aV8.b(this.worldObj, nd_13);
                    this.mountEntity(nd_13);
                }
            }
        }
        this.k(a5_0.e(this.Q) < f * 0.1f);
        this.b(ach_02);
        this.a(ach_02);
        if (this.d(4) == null && afv_2.a((Calendar)(object = aV8.r(this.worldObj)), 2) + 1 == 10 && afv_2.a((Calendar)object, 5) == 31 && a5_0.e(this.Q) < 0.25f) {
            this.c(4, new ItemStack(a5_0.e(this.Q) < 0.1f ? Blocks.a1 : Blocks.ap));
            this.bz[4] = 0.0f;
        }
        Ma.a(this.a(abb_0.d), new AttributeModifier(kz_0.n, a5_0.c(this.Q) * (double)0.05f, 0));
        double d = a5_0.c(this.Q) * 1.5 * (double)f;
        if (d > 1.0) {
            Ma.a(this.a(abb_0.c), new AttributeModifier(kz_0.p, d, 2));
        }
        if (a5_0.e(this.Q) < f * 0.05f) {
            Ma.a(this.a(bK), new AttributeModifier(kz_0.y, a5_0.c(this.Q) * 0.25 + 0.5, 0));
            Ma.a(this.a(abb_0.b), new AttributeModifier(kz_0.l, a5_0.c(this.Q) * 3.0 + 1.0, 2));
            this.k(true);
        }
        return amk_02;
    }

    @Override
    protected Item j() {
        return Items.rotten_flesh;
    }

    protected void P() {
        aMS.a(this.bx, 4, new _r_0(this, nz_0.class, 1.0, true));
        aMS.a(this.bx, 4, new _r_0(this, nf_2.class, 1.0, true));
        aMS.a(this.bx, 6, new _E(this, 1.0, false));
        aMS.a(this.bv, 1, new _9((nu_1)this, true, n__0.class));
        aMS.a(this.bv, 2, new _m_0<EntityPlayer>((nu_1)this, EntityPlayer.class, true));
        aMS.a(this.bv, 2, new _m_0<nz_0>((nu_1)this, nz_0.class, false));
        aMS.a(this.bv, 2, new _m_0<nf_2>((nu_1)this, nf_2.class, true));
    }

    protected void l(float f) {
        super.c(this.bN * f, this.bL * f);
    }

    @Override
    protected void c(float f, float f2) {
        boolean bl = this.bN > 0.0f && this.bL > 0.0f;
        this.bN = f;
        this.bL = f2;
        this.l(1.0f);
    }

    @Override
    public void a(EntityLivingBase entityLivingBase) {
        super.a(entityLivingBase);
        if ((aV8.p(this.worldObj) == EnumDifficulty.NORMAL || aV8.p(this.worldObj) == EnumDifficulty.HARD) && entityLivingBase instanceof nz_0) {
            if (aV8.p(this.worldObj) != EnumDifficulty.HARD && a5_0.a(this.Q)) {
                return;
            }
            nl_1 nl_12 = (nl_1)entityLivingBase;
            n0_0 n0_02 = new n0_0(this.worldObj);
            n0_02.d(entityLivingBase);
            aV8.c(this.worldObj, entityLivingBase);
            n0_02.a(aV8.b(this.worldObj, new BlockPos(n0_02)), null);
            n0_02.m(true);
            if (entityLivingBase.j()) {
                n0_02.n(true);
            }
            n0_02.j(nl_12.aj());
            if (nl_12.e()) {
                n0_02.a(nl_12.y());
                n0_02.g(nl_12.aA());
            }
            aV8.b(this.worldObj, n0_02);
            aV8.a(this.worldObj, null, 1016, new BlockPos((int)this.posX, (int)this.posY, (int)this.posZ), 0);
        }
    }

    public void n(boolean bl) {
        aom_0.b(this.t(), 12, axt_2.a((byte)1));
        if (this.worldObj != null && !this.worldObj.isRemote) {
            ahw_2 ahw_22 = this.a(abb_0.e);
            Ma.b(ahw_22, bI);
            Ma.a(ahw_22, bI);
        }
        this.l(bl);
    }

    public void k(boolean bl) {
        if (this.bM != bl) {
            this.bM = bl;
            aMS.a(this.bx, 1, this.bJ);
        }
    }

    @Override
    public void onDeath(DamageSource damageSource) {
        super.onDeath(damageSource);
        if (aDJ.d(damageSource) instanceof nd_2 && !(this instanceof n__0) && om_2.g((nd_2)aDJ.d(damageSource)) && om_2.a((nd_2)aDJ.d(damageSource))) {
            om_2.f((nd_2)aDJ.d(damageSource));
            this.a(new ItemStack(Items.skull, 1, 2), 0.0f);
        }
    }

    @Override
    public void a(byte by) {
        if (by == 16) {
            if (!this.Q()) {
                aV8.a(this.worldObj, this.posX + 0.5, this.posY + 0.5, this.posZ + 0.5, kz_0.j, 1.0f + a5_0.e(this.Q), a5_0.e(this.Q) * 0.7f + 0.3f, false);
            }
        } else {
            super.a(by);
        }
    }

    @Override
    public boolean j() {
        return aom_0.g(this.t(), 12) == 1;
    }

    @Override
    protected String d() {
        return kz_0.f;
    }

    @Override
    protected void H() {
        super.H();
        Ma.a(this.a(abb_0.c), 35.0);
        Ma.a(this.a(abb_0.e), 0.23f);
        Ma.a(this.a(abb_0.f), 3.0);
        Ma.a(ht_0.b(this.N(), bK), a5_0.c(this.Q) * (double)0.1f);
    }

    @Override
    protected int a(EntityPlayer entityPlayer) {
        if (this.j()) {
            this.bk = (int)((float)this.bk * 2.5f);
        }
        return super.a(entityPlayer);
    }

    public void m(boolean bl) {
        aom_0.b(this.t(), 13, axt_2.a((byte)1));
    }

    @Override
    protected boolean s() {
        return !this.Z();
    }

    public boolean v() {
        return aom_0.g(this.t(), 13) == 1;
    }
}

