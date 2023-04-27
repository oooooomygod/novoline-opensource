/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.util.DamageSource;
import deobf.EntityLivingBase;
import deobf.EntityPlayer;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.nt
 */
public class nt_2
extends ne_2 {
    private int bH;
    private float bI = 0.5f;

    public void k(boolean bl) {
        byte by = aom_0.g(this.l, 16);
        by = (byte)(by | 1);
        aom_0.b(this.l, 16, axt_2.a(by));
    }

    public nt_2(World world) {
        super(world);
        this.S = true;
        this.bk = 10;
        aMS.a(this.bx, 4, new alw_1(this));
        aMS.a(this.bx, 5, new _P(this, 1.0));
        aMS.a(this.bx, 7, new _J(this, 1.0));
        aMS.a(this.bx, 8, new aly_2(this, EntityPlayer.class, 8.0f));
        aMS.a(this.bx, 8, new _A(this));
        aMS.a(this.bv, 1, new _9((nu_1)this, true, new Class[0]));
        aMS.a(this.bv, 2, new _m_0<EntityPlayer>((nu_1)this, EntityPlayer.class, true));
    }

    @Override
    protected String d() {
        return xj_0.c;
    }

    public boolean u() {
        return (aom_0.g(this.l, 16) & 1) != 0;
    }

    @Override
    public float b(float f) {
        return 1.0f;
    }

    @Override
    public int d(float f) {
        return 0xF000F0;
    }

    @Override
    protected void H() {
        super.H();
        Ma.a(this.a(abb_0.f), 6.0);
        Ma.a(this.a(abb_0.e), 0.23f);
        Ma.a(this.a(abb_0.c), 48.0);
    }

    @Override
    public void onLivingUpdate() {
        if (!this.onGround && this.motionY < 0.0) {
            this.motionY *= 0.6;
        }
        if (this.worldObj.isRemote) {
            if (a5_0.a(this.Q, 24) == 0 && !this.Q()) {
                aV8.a(this.worldObj, this.posX + 0.5, this.posY + 0.5, this.posZ + 0.5, xj_0.b, 1.0f + a5_0.e(this.Q), a5_0.e(this.Q) * 0.7f + 0.3f, false);
            }
            int n = 0;
            while (true) {
                aV8.a(this.worldObj, B7.SMOKE_LARGE, this.posX + (a5_0.c(this.Q) - 0.5) * (double)this.width, this.posY + a5_0.c(this.Q) * (double)this.n, this.posZ + (a5_0.c(this.Q) - 0.5) * (double)this.width, 0.0, 0.0, 0.0, new int[0]);
                ++n;
            }
        }
        super.onLivingUpdate();
    }

    @Override
    protected void g() {
        super.g();
        aom_0.a(this.l, 16, axt_2.a((byte)0));
    }

    @Override
    protected boolean d() {
        return true;
    }

    @Override
    protected String ac() {
        return xj_0.a;
    }

    @Override
    protected void f() {
        EntityLivingBase entityLivingBase;
        if (this.am()) {
            this.a(DamageSource.f, 1.0f);
        }
        --this.bH;
        if (this.bH <= 0) {
            this.bH = 100;
            this.bI = 0.5f + (float)a5_0.f(this.Q) * 3.0f;
        }
        if (entityLivingBase.posY + (double)(entityLivingBase = this.ak()).w() > this.posY + (double)this.w() + (double)this.bI) {
            this.motionY += ((double)0.3f - this.motionY) * (double)0.3f;
            this.p = true;
        }
        super.f();
    }

    @Override
    protected String C() {
        return xj_0.d;
    }

    @Override
    public boolean ag() {
        return this.u();
    }

    @Override
    protected Item j() {
        return Items.blaze_rod;
    }

    @Override
    protected void b(boolean bl, int n) {
        int n2 = a5_0.a(this.Q, 2 + n);
        for (int i = 0; i < n2; ++i) {
            this.a(Items.blaze_rod, 1);
        }
    }

    @Override
    public void b(float f, float f2) {
    }
}

