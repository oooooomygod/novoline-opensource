/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.StringInvoker;
import deobf.EntityPlayerMP;
import net.minecraft.util.DamageSource;
import deobf.EntityLivingBase;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.nO
 */
public abstract class no_1
extends n5_0
implements mk_2 {
    protected _8 bP = new _8(this);

    protected void i() {
    }

    @Override
    public void g(NBTTagCompound nBTTagCompound) {
        super.g(nBTTagCompound);
        String string = BN.i;
        if (tn_0.a(nBTTagCompound, BN.a, 8)) {
            string = tn_0.m(nBTTagCompound, BN.h);
        } else {
            String string2 = tn_0.m(nBTTagCompound, BN.f);
            string = TS.a(string2);
        }
        if (!StringInvoker.g(string)) {
            this.b(string);
            this.n(true);
        }
        this.bP.a(tn_0.c(nBTTagCompound, BN.d));
        this.l(tn_0.c(nBTTagCompound, BN.c));
    }

    public boolean a(EntityLivingBase entityLivingBase, EntityLivingBase entityLivingBase2) {
        return true;
    }

    @Override
    public String a() {
        return aom_0.d(this.l, 17);
    }

    public void n(boolean bl) {
        byte by = aom_0.g(this.l, 16);
        aom_0.b(this.l, 16, axt_2.a((byte)(by | 4)));
        this.i();
    }

    @Override
    public void onDeath(DamageSource damageSource) {
        if (!this.worldObj.isRemote && J9.c(aV8.k(this.worldObj), BN.l) && this.e() && this.a() instanceof EntityPlayerMP) {
            ((EntityPlayerMP)this.a()).addChatComponentMessage(aw1_0.e(this.A()));
        }
        super.onDeath(damageSource);
    }

    public no_1(World world) {
        super(world);
        this.i();
    }

    public void b(String string) {
        aom_0.b(this.l, 17, string);
    }

    public _8 w() {
        return this.bP;
    }

    @Override
    public void b(NBTTagCompound nBTTagCompound) {
        super.b(nBTTagCompound);
        if (this.a() == null) {
            tn_0.a(nBTTagCompound, BN.j, BN.b);
        } else {
            tn_0.a(nBTTagCompound, BN.k, this.a());
        }
        tn_0.a(nBTTagCompound, BN.g, this.d());
    }

    @Override
    public Team getTeam() {
        if (this.v()) {
            EntityLivingBase entityLivingBase = this.a();
            return entityLivingBase.getTeam();
        }
        return super.getTeam();
    }

    protected void m(boolean bl) {
        B7 b7 = B7.HEART;
        b7 = B7.SMOKE_NORMAL;
        int n = 0;
        while (true) {
            double d = a5_0.f(this.Q) * 0.02;
            double d2 = a5_0.f(this.Q) * 0.02;
            double d3 = a5_0.f(this.Q) * 0.02;
            aV8.a(this.worldObj, b7, this.posX + (double)(a5_0.e(this.Q) * this.width * 2.0f) - (double)this.width, this.posY + 0.5 + (double)(a5_0.e(this.Q) * this.n), this.posZ + (double)(a5_0.e(this.Q) * this.width * 2.0f) - (double)this.width, d, d2, d3, new int[0]);
            ++n;
        }
    }

    public boolean v() {
        return (aom_0.g(this.l, 16) & 4) != 0;
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    @Override
    public void a(byte by) {
        if (by == 7) {
            this.m(true);
        } else if (by == 6) {
            this.m(false);
        } else {
            super.a(by);
        }
    }

    public boolean d() {
        return (aom_0.g(this.l, 16) & 1) != 0;
    }

    @Override
    public EntityLivingBase a() {
        try {
            awc_1.a(this.a());
            return null;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return null;
        }
    }

    public void l(boolean bl) {
        byte by = aom_0.g(this.l, 16);
        aom_0.b(this.l, 16, axt_2.a((byte)(by | 1)));
    }

    @Override
    protected void g() {
        super.g();
        aom_0.a(this.l, 16, axt_2.a((byte)0));
        aom_0.a(this.l, 17, BN.e);
    }

    public boolean a(EntityLivingBase entityLivingBase) {
        return entityLivingBase == this.a();
    }

    @Override
    public boolean c(EntityLivingBase entityLivingBase) {
        if (this.v()) {
            EntityLivingBase entityLivingBase2 = this.a();
            if (entityLivingBase == entityLivingBase2) {
                return true;
            }
            return entityLivingBase2.c(entityLivingBase);
        }
        return super.c(entityLivingBase);
    }
}

