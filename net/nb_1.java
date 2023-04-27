/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.InventoryInvoker;
import cc.novoline.invoke.ListInvoker;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import net.minecraft.util.DamageSource;
import deobf.Entity;
import deobf.EntityLivingBase;
import deobf.EntityPlayer;
import net.minecraft.item.ItemStack;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.nB
 */
public class nb_1
extends no_1 {
    private _b_0 bQ;
    private _x_0<EntityPlayer> bR;

    @Override
    protected Item j() {
        return Items.leather;
    }

    public nb_1(World world) {
        super(world);
        this.c(0.6f, 0.7f);
        afv_0.b((F_)this.Z(), true);
        aMS.a(this.bx, 1, new _X(this));
        aMS.a(this.bx, 2, this.bP);
        this.bQ = new _b_0(this, 0.6, Items.fish, true);
        aMS.a(this.bx, 3, this.bQ);
        aMS.a(this.bx, 5, new _5(this, 1.0, 10.0f, 5.0f));
        aMS.a(this.bx, 6, new _F(this, 0.8));
        aMS.a(this.bx, 7, new _a_0(this, 0.3f));
        aMS.a(this.bx, 8, new _q_0(this));
        aMS.a(this.bx, 9, new _h_0(this, 0.8));
        aMS.a(this.bx, 10, new _J(this, 0.8));
        aMS.a(this.bx, 11, new aly_2(this, EntityPlayer.class, 10.0f));
        aMS.a(this.bv, 1, new _0<nd_1>(this, nd_1.class, false, null));
    }

    @Override
    public void b(float f, float f2) {
    }

    @Override
    protected void b(boolean bl, int n) {
    }

    @Override
    public boolean a(DamageSource damageSource, float f) {
        if (this.a(damageSource)) {
            return false;
        }
        this.bP.a(false);
        return super.a(damageSource, f);
    }

    @Override
    public boolean b(ItemStack itemStack) {
        return act_2.k(itemStack) == Items.fish;
    }

    @Override
    protected String C() {
        return OC.b;
    }

    @Override
    protected float f() {
        return 0.4f;
    }

    @Override
    public boolean a(n5_0 n5_02) {
        if (n5_02 == this) {
            return false;
        }
        if (!this.v()) {
            return false;
        }
        if (!(n5_02 instanceof nb_1)) {
            return false;
        }
        nb_1 nb_12 = (nb_1)n5_02;
        return nb_12.v() && this.u() && nb_12.u();
    }

    @Override
    public void n(boolean bl) {
        super.n(bl);
    }

    @Override
    public amk_0 a(ach_0 ach_02, amk_0 amk_02) {
        amk_02 = super.a(ach_02, amk_02);
        if (a5_0.a(this.worldObj.o, 7) == 0) {
            int n = 0;
            while (true) {
                nb_1 nb_12 = new nb_1(this.worldObj);
                nb_12.c(this.posX, this.posY, this.posZ, this.rotationYaw, 0.0f);
                nb_12.k(-24000);
                aV8.b(this.worldObj, nb_12);
                ++n;
            }
        }
        return amk_02;
    }

    @Override
    public void g(NBTTagCompound nBTTagCompound) {
        super.g(nBTTagCompound);
        this.l(tn_0.g(nBTTagCompound, OC.g));
    }

    @Override
    protected void g() {
        super.g();
        aom_0.a(this.l, 18, axt_2.a((byte)0));
    }

    @Override
    public void f() {
        if (MK.c(this.a())) {
            double d = MK.f(this.a());
            if (d == 0.6) {
                this.e(true);
                this.setSprinting(false);
            } else if (d == 1.33) {
                this.e(false);
                this.setSprinting(true);
            } else {
                this.e(false);
                this.setSprinting(false);
            }
        } else {
            this.e(false);
            this.setSprinting(false);
        }
    }

    @Override
    protected void H() {
        super.H();
        Ma.a(this.a(abb_0.b), 10.0);
        Ma.a(this.a(abb_0.e), 0.3f);
    }

    @Override
    protected void i() {
        if (this.bR == null) {
            this.bR = new _x_0<EntityPlayer>(this, EntityPlayer.class, 16.0f, 0.8, 1.33);
        }
        aMS.a(this.bx, this.bR);
        if (!this.v()) {
            aMS.a(this.bx, 4, this.bR);
        }
    }

    public void l(int n) {
        aom_0.b(this.l, 18, axt_2.a((byte)n));
    }

    @Override
    protected String d() {
        return OC.d;
    }

    @Override
    public boolean Y() {
        if (aV8.a(this.worldObj, this.getEntityBoundingBox(), this) && ListInvoker.isEmpty(aV8.b(this.worldObj, this, this.getEntityBoundingBox())) && !aV8.b(this.worldObj, this.getEntityBoundingBox())) {
            BlockPos blockPos = new BlockPos(this.posX, this.getEntityBoundingBox().a, this.posZ);
            if (amv_2.h(blockPos) < aV8.c(this.worldObj)) {
                return false;
            }
            Block block = BlockStateInvoker.getBlock(aV8.q(this.worldObj, amv_2.g(blockPos)));
            return block == Blocks.grass || BlocksInvoker.getBlockState(block) == Material.z;
        }
        return false;
    }

    @Override
    public String getName() {
        return this.e() ? this.y() : (this.v() ? ahq_0.b(OC.a) : super.getName());
    }

    @Override
    public boolean a(EntityPlayer entityPlayer) {
        ItemStack itemStack = InventoryInvoker.g(entityPlayer.inventory);
        if (this.v()) {
            if (this.a((EntityLivingBase)entityPlayer) && !this.worldObj.isRemote && !this.b(itemStack)) {
                this.bP.a(!this.d());
            }
        } else if (aDl.a(this.bQ) && act_2.k(itemStack) == Items.fish && entityPlayer.g(this) < 9.0) {
            if (!aSY.a(entityPlayer.abilities)) {
                --itemStack.a;
            }
            if (itemStack.a <= 0) {
                InventoryInvoker.a(entityPlayer.inventory, entityPlayer.inventory.a, null);
            }
            if (!this.worldObj.isRemote) {
                if (a5_0.a(this.Q, 3) == 0) {
                    this.n(true);
                    this.l(1 + a5_0.a(this.worldObj.o, 3));
                    this.b(entityPlayer.J().toString());
                    this.m(true);
                    this.bP.a(true);
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

    @Override
    protected boolean s() {
        return !this.v() && this.ticksExisted > 2400;
    }

    @Override
    public nb_1 a(n4_0 n4_02) {
        nb_1 nb_12 = new nb_1(this.worldObj);
        if (this.v()) {
            nb_12.b(this.a());
            nb_12.n(true);
            nb_12.l(this.a());
        }
        return nb_12;
    }

    @Override
    protected String ac() {
        return this.v() ? (this.u() ? OC.f : (a5_0.a(this.Q, 4) == 0 ? OC.c : OC.i)) : OC.h;
    }

    @Override
    public boolean B() {
        return a5_0.a(this.worldObj.o, 3) != 0;
    }

    @Override
    public void b(NBTTagCompound nBTTagCompound) {
        super.b(nBTTagCompound);
        tn_0.b(nBTTagCompound, OC.e, this.a());
    }

    @Override
    public boolean d(Entity entity) {
        return entity.a(aDJ.a(this), 3.0f);
    }

    public int a() {
        return aom_0.g(this.l, 18);
    }
}

