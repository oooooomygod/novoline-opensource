/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.EnchantmentHelperInvoker;
import cc.novoline.invoke.MathInvoker;
import deobf.EntityArrow;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import net.minecraft.util.DamageSource;
import deobf.Entity;
import deobf.EntityLivingBase;
import deobf.EntityPlayer;
import net.minecraft.item.ItemStack;
import java.util.Calendar;


public class nM
extends ne_2
implements a1l {
    private _r_0 bH;
    private _V bI = new _V(this, 1.0, 20, 60, 15.0f);

    @Override
    protected String ac() {
        return kg_0.e;
    }

    @Override
    protected void b(boolean bl, int n) {
        int n2;
        int n3;
        if (this.a() == 1) {
            n3 = a5_0.a(this.Q, 3 + n) - 1;
            for (n2 = 0; n2 < n3; ++n2) {
                this.a(Items.coal, 1);
            }
        } else {
            n3 = a5_0.a(this.Q, 3 + n);
            for (n2 = 0; n2 < n3; ++n2) {
                this.a(Items.arrow, 1);
            }
        }
        n3 = a5_0.a(this.Q, 3 + n);
        for (n2 = 0; n2 < n3; ++n2) {
            this.a(Items.bone, 1);
        }
    }

    @Override
    protected String d() {
        return kg_0.h;
    }

    @Override
    public float w() {
        return this.a() == 1 ? super.w() : 1.74f;
    }

    public void d() {
        aMS.a(this.bx, this.bH);
        aMS.a(this.bx, this.bI);
        ItemStack itemStack = this.ah();
        if (act_2.k(itemStack) == Items.bow) {
            aMS.a(this.bx, 4, this.bI);
        } else {
            aMS.a(this.bx, 4, this.bH);
        }
    }

    public int a() {
        return aom_0.g(this.l, 13);
    }

    @Override
    protected Item j() {
        return Items.arrow;
    }

    public void j(int n) {
        aom_0.b(this.l, 13, axt_2.a((byte)n));
        boolean bl = this.S = n == 1;
        if (n == 1) {
            this.c(0.72f, 2.535f);
        } else {
            this.c(0.6f, 1.95f);
        }
    }

    @Override
    public void b(NBTTagCompound nBTTagCompound) {
        super.b(nBTTagCompound);
        tn_0.a(nBTTagCompound, kg_0.f, (byte)this.a());
    }

    @Override
    protected void g() {
        super.g();
        aom_0.a(this.l, 13, axt_2.a((byte)0));
    }

    @Override
    public void onDeath(DamageSource damageSource) {
        super.onDeath(damageSource);
        if (aDJ.l(damageSource) instanceof EntityArrow && aDJ.d(damageSource) instanceof EntityPlayer) {
            EntityPlayer entityPlayer = (EntityPlayer)aDJ.d(damageSource);
            double d = entityPlayer.posX - this.posX;
            double d2 = entityPlayer.posZ - this.posZ;
            if (d * d + d2 * d2 >= 2500.0) {
                a6w_0.a(entityPlayer, apf_0.t);
            }
        } else if (aDJ.d(damageSource) instanceof nd_2 && om_2.g((nd_2)aDJ.d(damageSource)) && om_2.a((nd_2)aDJ.d(damageSource))) {
            om_2.f((nd_2)aDJ.d(damageSource));
            this.a(new ItemStack(Items.skull, 1, this.a() == 1 ? 1 : 0), 0.0f);
        }
    }

    @Override
    public amk_0 a(ach_0 ach_02, amk_0 amk_02) {
        Calendar calendar;
        amk_02 = super.a(ach_02, amk_02);
        if (this.worldObj.d instanceof a9T && a5_0.a(this.E(), 5) > 0) {
            aMS.a(this.bx, 4, this.bH);
            this.j(1);
            this.c(0, new ItemStack(Items.stone_sword));
            Ma.a(this.a(abb_0.f), 4.0);
        } else {
            aMS.a(this.bx, 4, this.bI);
            this.b(ach_02);
            this.a(ach_02);
        }
        this.i(a5_0.e(this.Q) < 0.55f * v8_0.b(ach_02));
        if (this.d(4) == null && afv_2.a(calendar = aV8.r(this.worldObj), 2) + 1 == 10 && afv_2.a(calendar, 5) == 31 && a5_0.e(this.Q) < 0.25f) {
            this.c(4, new ItemStack(a5_0.e(this.Q) < 0.1f ? Blocks.a1 : Blocks.ap));
            this.bz[4] = 0.0f;
        }
        return amk_02;
    }

    @Override
    public void c(int n, ItemStack itemStack) {
        super.c(n, itemStack);
        if (!this.worldObj.isRemote) {
            this.d();
        }
    }

    @Override
    public void a(EntityLivingBase entityLivingBase, float f) {
        EntityArrow entityArrow = new EntityArrow(this.worldObj, this, entityLivingBase, 1.6f, 14 - aYj.a(aV8.p(this.worldObj)) * 4);
        int n = alf_0.a(yl_2.j.c, this.ah());
        int n2 = alf_0.a(yl_2.E.c, this.ah());
        EnchantmentHelperInvoker.a(entityArrow, (double)(f * 2.0f) + a5_0.f(this.Q) * 0.25 + (double)((float)aYj.a(aV8.p(this.worldObj)) * 0.11f));
        EnchantmentHelperInvoker.a(entityArrow, EnchantmentHelperInvoker.b(entityArrow) + (double)n * 0.5 + 0.5);
        EnchantmentHelperInvoker.a(entityArrow, n2);
        if (alf_0.a(yl_2.a.c, this.ah()) > 0 || this.a() == 1) {
            entityArrow.a(100);
        }
        this.a(kg_0.g, 1.0f, 1.0f / (a5_0.e(this.E()) * 0.4f + 0.8f));
        aV8.b(this.worldObj, entityArrow);
    }

    @Override
    public boolean d(Entity entity) {
        if (super.d(entity)) {
            if (this.a() == 1 && entity instanceof EntityLivingBase) {
                ((EntityLivingBase)entity).a(new a2l_0(ari_0.f(Potion.wither), 200));
            }
            return true;
        }
        return false;
    }

    @Override
    public void onLivingUpdate() {
        if (aV8.t(this.worldObj) && !this.worldObj.isRemote) {
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
        if (this.worldObj.isRemote && this.a() == 1) {
            this.c(0.72f, 2.535f);
        }
        super.onLivingUpdate();
    }

    @Override
    public aH2 ae() {
        return aH2.UNDEAD;
    }

    @Override
    public void g(NBTTagCompound nBTTagCompound) {
        super.g(nBTTagCompound);
        if (tn_0.a(nBTTagCompound, kg_0.d, 99)) {
            byte by = tn_0.e(nBTTagCompound, kg_0.b);
            this.j(by);
        }
        this.d();
    }

    @Override
    protected void b(ach_0 ach_02) {
        super.b(ach_02);
        this.c(0, new ItemStack(Items.bow));
    }

    @Override
    protected void H() {
        super.H();
        Ma.a(this.a(abb_0.e), 0.25);
    }

    @Override
    protected void a(BlockPos blockPos, Block block) {
        this.a(kg_0.c, 0.15f, 1.0f);
    }

    @Override
    public void K() {
        super.K();
        if (this.r instanceof nu_1) {
            nu_1 nu_12 = (nu_1)this.r;
            this.aD = nu_12.aD;
        }
    }

    @Override
    protected void t() {
        if (this.a() == 1) {
            this.a(new ItemStack(Items.skull, 1, 1), 0.0f);
        }
    }

    @Override
    public double H() {
        return this.j() ? 0.0 : -0.35;
    }

    @Override
    protected String C() {
        return kg_0.a;
    }

    public nM(World world) {
        super(world);
        this.bH = new _r_0(this, EntityPlayer.class, 1.2, false);
        aMS.a(this.bx, 1, new _X(this));
        aMS.a(this.bx, 2, new _N(this));
        aMS.a(this.bx, 3, new _U(this, 1.0));
        aMS.a(this.bx, 3, new _x_0<nf_1>(this, nf_1.class, 6.0f, 1.0, 1.2));
        aMS.a(this.bx, 4, new _J(this, 1.0));
        aMS.a(this.bx, 6, new aly_2(this, EntityPlayer.class, 8.0f));
        aMS.a(this.bx, 6, new _A(this));
        aMS.a(this.bv, 1, new _9((nu_1)this, false, new Class[0]));
        aMS.a(this.bv, 2, new _m_0<EntityPlayer>((nu_1)this, EntityPlayer.class, true));
        aMS.a(this.bv, 3, new _m_0<nf_2>((nu_1)this, nf_2.class, true));
        if (!world.isRemote) {
            this.d();
        }
    }
}

