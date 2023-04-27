/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.util.DamageSource;
import deobf.EntityPlayer;
import deobf.EnumDifficulty;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.nw
 */
public class nw_1
extends nc_1
implements ar0_0 {
    private int bB = 1;

    @Override
    protected void b(boolean bl, int n) {
        int n2;
        int n3 = a5_0.a(this.Q, 2) + a5_0.a(this.Q, 1 + n);
        for (n2 = 0; n2 < n3; ++n2) {
            this.a(Items.ghast_tear, 1);
        }
        n3 = a5_0.a(this.Q, 3) + a5_0.a(this.Q, 1 + n);
        for (n2 = 0; n2 < n3; ++n2) {
            this.a(Items.gunpowder, 1);
        }
    }

    @Override
    protected String C() {
        return agy_1.g;
    }

    @Override
    public boolean a(DamageSource damageSource, float f) {
        if (this.a(damageSource)) {
            return false;
        }
        if (agy_1.b.equals(aDJ.k(damageSource)) && aDJ.d(damageSource) instanceof EntityPlayer) {
            super.a(damageSource, 1000.0f);
            a6w_0.a((EntityPlayer)aDJ.d(damageSource), apf_0.w);
            return true;
        }
        return super.a(damageSource, f);
    }

    @Override
    public void b(NBTTagCompound nBTTagCompound) {
        super.b(nBTTagCompound);
        tn_0.b(nBTTagCompound, agy_1.d, this.bB);
    }

    @Override
    public int al() {
        return 1;
    }

    public void k(boolean bl) {
        aom_0.b(this.l, 16, axt_2.a((byte)1));
    }

    public int a() {
        return this.bB;
    }

    @Override
    public void onUpdate() {
        super.onUpdate();
        if (!this.worldObj.isRemote && aV8.p(this.worldObj) == EnumDifficulty.PEACEFUL) {
            this.E();
        }
    }

    @Override
    protected void H() {
        super.H();
        Ma.a(this.a(abb_0.b), 10.0);
        Ma.a(this.a(abb_0.c), 100.0);
    }

    @Override
    protected String ac() {
        return agy_1.a;
    }

    @Override
    protected Item j() {
        return Items.gunpowder;
    }

    public boolean d() {
        return aom_0.g(this.l, 16) != 0;
    }

    @Override
    public float w() {
        return 2.6f;
    }

    @Override
    protected float f() {
        return 10.0f;
    }

    @Override
    protected void g() {
        super.g();
        aom_0.a(this.l, 16, axt_2.a((byte)0));
    }

    @Override
    public boolean B() {
        return a5_0.a(this.Q, 20) == 0 && super.B() && aV8.p(this.worldObj) != EnumDifficulty.PEACEFUL;
    }

    @Override
    protected String d() {
        return agy_1.e;
    }

    public nw_1(World world) {
        super(world);
        this.c(4.0f, 4.0f);
        this.S = true;
        this.bk = 5;
        this.br = new P6(this);
        aMS.a(this.bx, 5, new al3(this));
        aMS.a(this.bx, 7, new alu_1(this));
        aMS.a(this.bx, 7, new alr_0(this));
        aMS.a(this.bv, 1, new _L(this));
    }

    @Override
    public void g(NBTTagCompound nBTTagCompound) {
        super.g(nBTTagCompound);
        if (tn_0.a(nBTTagCompound, agy_1.c, 99)) {
            this.bB = tn_0.g(nBTTagCompound, agy_1.f);
        }
    }
}

