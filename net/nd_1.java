/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.EntityLivingBase;
import deobf.EntityPlayer;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.item.ItemStack;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.nD
 */
public class nd_1
extends n5_0 {
    public float bQ;
    public float bP;
    public float bU = 1.0f;
    public float bT;
    public int bV;
    public float bS;
    public boolean bR;

    @Override
    protected String C() {
        return auc_0.g;
    }

    public nd_1(World world) {
        super(world);
        this.c(0.4f, 0.7f);
        this.bV = a5_0.a(this.Q, 6000) + 6000;
        aMS.a(this.bx, 0, new _X(this));
        aMS.a(this.bx, 1, new _e_0(this, 1.4));
        aMS.a(this.bx, 2, new _h_0(this, 1.0));
        aMS.a(this.bx, 3, new _b_0(this, 1.0, Items.wheat_seeds, false));
        aMS.a(this.bx, 4, new _D(this, 1.1));
        aMS.a(this.bx, 5, new _J(this, 1.0));
        aMS.a(this.bx, 6, new aly_2(this, EntityPlayer.class, 6.0f));
        aMS.a(this.bx, 7, new _A(this));
    }

    public void l(boolean bl) {
        this.bR = bl;
    }

    @Override
    public void ab() {
        super.ab();
        float f = MathHelper.sin(this.aD * (float)Math.PI / 180.0f);
        float f2 = MathHelper.cos(this.aD * (float)Math.PI / 180.0f);
        float f3 = 0.1f;
        float f4 = 0.0f;
        this.h.j(this.posX + (double)(f3 * f), this.posY + (double)(this.n * 0.5f) + this.h.H() + (double)f4, this.posZ - (double)(f3 * f2));
        if (this.h instanceof EntityLivingBase) {
            ((EntityLivingBase)this.h).aD = this.aD;
        }
    }

    @Override
    protected String ac() {
        return auc_0.e;
    }

    @Override
    public float w() {
        return this.n;
    }

    @Override
    protected int a(EntityPlayer entityPlayer) {
        return this.d() ? 10 : super.a(entityPlayer);
    }

    @Override
    public void onLivingUpdate() {
        super.onLivingUpdate();
        this.bQ = this.bS;
        this.bP = this.bT;
        this.bT = (float)((double)this.bT + (double)(this.onGround ? -1 : 4) * 0.3);
        this.bT = MathHelper.b(this.bT, 0.0f, 1.0f);
        if (!this.onGround && this.bU < 1.0f) {
            this.bU = 1.0f;
        }
        this.bU = (float)((double)this.bU * 0.9);
        if (!this.onGround && this.motionY < 0.0) {
            this.motionY *= 0.6;
        }
        this.bS += this.bU * 2.0f;
        if (!(this.worldObj.isRemote || this.j() || this.d() || --this.bV > 0)) {
            this.a(auc_0.d, 1.0f, (a5_0.e(this.Q) - a5_0.e(this.Q)) * 0.2f + 1.0f);
            this.a(Items.egg, 1);
            this.bV = a5_0.a(this.Q, 6000) + 6000;
        }
    }

    @Override
    protected boolean s() {
        return this.d() && this.h == null;
    }

    @Override
    protected String d() {
        return auc_0.i;
    }

    @Override
    public nd_1 a(n4_0 n4_02) {
        return new nd_1(this.worldObj);
    }

    @Override
    protected void b(boolean bl, int n) {
        int n2 = a5_0.a(this.Q, 3) + a5_0.a(this.Q, 1 + n);
        for (int i = 0; i < n2; ++i) {
            this.a(Items.feather, 1);
        }
        if (this.ag()) {
            this.a(Items.cooked_chicken, 1);
        } else {
            this.a(Items.chicken, 1);
        }
    }

    public boolean d() {
        return this.bR;
    }

    @Override
    protected void H() {
        super.H();
        Ma.a(this.a(abb_0.b), 4.0);
        Ma.a(this.a(abb_0.e), 0.25);
    }

    @Override
    public boolean b(ItemStack itemStack) {
        return act_2.k(itemStack) == Items.wheat_seeds;
    }

    @Override
    protected void a(BlockPos blockPos, Block block) {
        this.a(auc_0.a, 0.15f, 1.0f);
    }

    @Override
    protected Item j() {
        return Items.feather;
    }

    @Override
    public void b(NBTTagCompound nBTTagCompound) {
        super.b(nBTTagCompound);
        tn_0.a(nBTTagCompound, auc_0.b, this.bR);
        tn_0.b(nBTTagCompound, auc_0.j, this.bV);
    }

    @Override
    public void b(float f, float f2) {
    }

    @Override
    public void g(NBTTagCompound nBTTagCompound) {
        super.g(nBTTagCompound);
        this.bR = tn_0.c(nBTTagCompound, auc_0.f);
        if (tn_0.b(nBTTagCompound, auc_0.c)) {
            this.bV = tn_0.g(nBTTagCompound, auc_0.h);
        }
    }
}

