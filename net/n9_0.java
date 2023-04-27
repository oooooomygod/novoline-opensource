/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.EntityPlayer;
import deobf.EnumDifficulty;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net.n9
 */
public class n9_0
extends ne_2 {
    @Override
    protected Item j() {
        return Items.string;
    }

    public n9_0(World world) {
        super(world);
        this.c(1.4f, 0.9f);
        aMS.a(this.bx, 1, new _X(this));
        aMS.a(this.bx, 3, new _a_0(this, 0.4f));
        aMS.a(this.bx, 4, new _u_0(this, EntityPlayer.class));
        aMS.a(this.bx, 4, new _u_0(this, nf_2.class));
        aMS.a(this.bx, 5, new _J(this, 0.8));
        aMS.a(this.bx, 6, new aly_2(this, EntityPlayer.class, 8.0f));
        aMS.a(this.bx, 6, new _A(this));
        aMS.a(this.bv, 1, new _9((nu_1)this, false, new Class[0]));
        aMS.a(this.bv, 2, new _s_0<EntityPlayer>(this, EntityPlayer.class));
        aMS.a(this.bv, 3, new _s_0<nf_2>(this, nf_2.class));
    }

    @Override
    protected F0 a(World world) {
        return new FC(this, world);
    }

    @Override
    protected String ac() {
        return afl_2.d;
    }

    public boolean u() {
        return (aom_0.g(this.l, 16) & 1) != 0;
    }

    @Override
    public boolean d(a2l_0 a2l_02) {
        return a3M.b(a2l_02) != ari_0.f(Potion.poison) && super.d(a2l_02);
    }

    @Override
    protected void b(boolean bl, int n) {
        super.b(bl, n);
        if (a5_0.a(this.Q, 3) == 0 || a5_0.a(this.Q, 1 + n) > 0) {
            this.a(Items.spider_eye, 1);
        }
    }

    @Override
    protected void a(BlockPos blockPos, Block block) {
        this.a(afl_2.b, 0.15f, 1.0f);
    }

    @Override
    protected String C() {
        return afl_2.c;
    }

    @Override
    public amk_0 a(ach_0 ach_02, amk_0 amk_02) {
        int n;
        amk_02 = super.a(ach_02, amk_02);
        if (a5_0.a(this.worldObj.o, 100) == 0) {
            nM nM2 = new nM(this.worldObj);
            nM2.c(this.posX, this.posY, this.posZ, this.rotationYaw, 0.0f);
            nM2.a(ach_02, (amk_0)null);
            aV8.b(this.worldObj, nM2);
            nM2.mountEntity(this);
        }
        amk_02 = new axh_2();
        if (aV8.p(this.worldObj) == EnumDifficulty.HARD && a5_0.e(this.worldObj.o) < 0.1f * v8_0.b(ach_02)) {
            YL.a((axh_2)amk_02, this.worldObj.o);
        }
        if (amk_02 instanceof axh_2 && Potion.potionTypes[n = ((axh_2)amk_02).a] != null) {
            this.a(new a2l_0(n, Integer.MAX_VALUE));
        }
        return amk_02;
    }

    @Override
    public double i() {
        return this.n * 0.5f;
    }

    @Override
    public float w() {
        return 0.65f;
    }

    @Override
    protected void g() {
        super.g();
        aom_0.a(this.l, 16, axt_2.a((byte)0));
    }

    @Override
    public void onUpdate() {
        super.onUpdate();
        if (!this.worldObj.isRemote) {
            this.k(this.g);
        }
    }

    @Override
    public boolean r() {
        return this.u();
    }

    @Override
    protected String d() {
        return afl_2.a;
    }

    @Override
    public aH2 ae() {
        return aH2.ARTHROPOD;
    }

    public void k(boolean bl) {
        byte by = aom_0.g(this.l, 16);
        by = (byte)(by | 1);
        aom_0.b(this.l, 16, axt_2.a(by));
    }

    @Override
    protected void H() {
        super.H();
        Ma.a(this.a(abb_0.b), 16.0);
        Ma.a(this.a(abb_0.e), 0.3f);
    }

    @Override
    public void b() {
    }
}

