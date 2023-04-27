/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.Chunk;
import deobf.Entity;
import deobf.EntityLivingBase;
import deobf.EntityPlayer;
import deobf.EnumDifficulty;
import net.minecraft.block.BlockPos;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.nY
 */
public class ny_1
extends nl_1
implements ar0_0 {
    private boolean bB;
    public float bE;
    public float bD;
    public float bC;

    @Override
    protected void l() {
        this.motionY = 0.42f;
        this.p = true;
    }

    protected void o() {
        this.bD *= 0.6f;
    }

    @Override
    protected String C() {
        return aL0.a(aL0.a(new StringBuilder(), asm_0.d), this.e() > 1 ? asm_0.e : asm_0.g).toString();
    }

    @Override
    protected Item j() {
        return this.e() == 1 ? Items.slime_ball : null;
    }

    protected boolean a() {
        return this.e() > 0;
    }

    @Override
    protected String d() {
        return aL0.a(aL0.a(new StringBuilder(), asm_0.k), this.e() > 1 ? asm_0.l : asm_0.c).toString();
    }

    @Override
    public void b(NBTTagCompound nBTTagCompound) {
        super.b(nBTTagCompound);
        tn_0.b(nBTTagCompound, asm_0.m, this.e() - 1);
        tn_0.a(nBTTagCompound, asm_0.f, this.bB);
    }

    protected void d(EntityLivingBase entityLivingBase) {
        int n = this.e();
        if (this.a((Entity)entityLivingBase) && this.g(entityLivingBase) < 0.6 * (double)n * 0.6 * (double)n && entityLivingBase.a(aDJ.a(this), (float)this.i())) {
            this.a(asm_0.a, 1.0f, (a5_0.e(this.Q) - a5_0.e(this.Q)) * 0.2f + 1.0f);
            this.a(this, entityLivingBase);
        }
    }

    protected ny_1 j() {
        return new ny_1(this.worldObj);
    }

    protected boolean k() {
        return this.e() > 2;
    }

    protected B7 h() {
        return B7.SLIME;
    }

    @Override
    public float w() {
        return 0.625f * this.n;
    }

    @Override
    protected void g() {
        super.g();
        aom_0.a(this.l, 16, axt_2.a((byte)1));
    }

    public int e() {
        return aom_0.g(this.l, 16);
    }

    protected void j(int n) {
        aom_0.b(this.l, 16, axt_2.a((byte)n));
        this.c(0.51000005f * (float)n, 0.51000005f * (float)n);
        this.j(this.posX, this.posY, this.posZ);
        Ma.a(this.a(abb_0.b), n * n);
        Ma.a(this.a(abb_0.e), 0.2f + 0.1f * (float)n);
        this.i(this.b());
        this.bk = n;
    }

    @Override
    public amk_0 a(ach_0 ach_02, amk_0 amk_02) {
        int n = a5_0.a(this.Q, 3);
        if (n < 2 && a5_0.e(this.Q) < 0.5f * v8_0.b(ach_02)) {
            ++n;
        }
        int n2 = 1 << n;
        this.j(n2);
        return super.a(ach_02, amk_02);
    }

    protected int g() {
        return a5_0.a(this.Q, 20) + 10;
    }

    @Override
    public void onUpdate() {
        if (!this.worldObj.isRemote && aV8.p(this.worldObj) == EnumDifficulty.PEACEFUL && this.e() > 0) {
            this.isDead = true;
        }
        this.bC += (this.bD - this.bC) * 0.5f;
        this.bE = this.bC;
        super.onUpdate();
        if (this.onGround && !this.bB) {
            int n = this.e();
            for (int i = 0; i < n * 8; ++i) {
                float f = a5_0.e(this.Q) * (float)Math.PI * 2.0f;
                float f2 = a5_0.e(this.Q) * 0.5f + 0.5f;
                float f3 = MathHelper.sin(f) * (float)n * 0.5f * f2;
                float f4 = MathHelper.cos(f) * (float)n * 0.5f * f2;
                World world = this.worldObj;
                B7 b7 = this.h();
                double d = this.posX + (double)f3;
                double d2 = this.posZ + (double)f4;
                aV8.a(world, b7, d, this.getEntityBoundingBox().a, d2, 0.0, 0.0, 0.0, new int[0]);
            }
            if (this.k()) {
                this.a(this.f(), this.f(), ((a5_0.e(this.Q) - a5_0.e(this.Q)) * 0.2f + 1.0f) / 0.8f);
            }
            this.bD = -0.5f;
        } else if (!this.onGround && this.bB) {
            this.bD = 1.0f;
        }
        this.bB = this.onGround;
        this.o();
    }

    @Override
    public void g(int n) {
        if (n == 16) {
            int n2 = this.e();
            this.c(0.51000005f * (float)n2, 0.51000005f * (float)n2);
            this.rotationYaw = this.aP;
            this.aD = this.aP;
            if (this.isInWater() && a5_0.a(this.Q, 20) == 0) {
                this.F();
            }
        }
        super.g(n);
    }

    @Override
    public void d(EntityPlayer entityPlayer) {
        if (this.d()) {
            this.d((EntityLivingBase)entityPlayer);
        }
    }

    protected int i() {
        return this.e();
    }

    @Override
    public int ag() {
        return 0;
    }

    protected String f() {
        return aL0.a(aL0.a(new StringBuilder(), asm_0.j), this.e() > 1 ? asm_0.i : asm_0.n).toString();
    }

    @Override
    public void g(NBTTagCompound nBTTagCompound) {
        super.g(nBTTagCompound);
        int n = tn_0.g(nBTTagCompound, asm_0.b);
        n = 0;
        this.j(n + 1);
        this.bB = tn_0.c(nBTTagCompound, asm_0.h);
    }

    @Override
    protected float f() {
        return 0.4f * (float)this.e();
    }

    @Override
    public boolean B() {
        BlockPos blockPos = new BlockPos(MathHelper.floor_double(this.posX), 0, MathHelper.floor_double(this.posZ));
        Chunk chunk = aV8.x(this.worldObj, blockPos);
        if (uv_2.r(aV8.s(this.worldObj)) == WorldType.e && a5_0.a(this.Q, 4) != 1) {
            return false;
        }
        if (aV8.p(this.worldObj) != EnumDifficulty.PEACEFUL) {
            il_0 il_02 = aV8.o(this.worldObj, blockPos);
            if (il_02 == il_0.aw && this.posY > 50.0 && this.posY < 70.0 && a5_0.e(this.Q) < 0.5f && a5_0.e(this.Q) < aV8.j(this.worldObj) && aV8.l(this.worldObj, new BlockPos(this)) <= a5_0.a(this.Q, 8)) {
                return super.B();
            }
            if (a5_0.a(this.Q, 10) == 0 && a5_0.a(aqp_2.b(chunk, 987234911L), 10) == 0 && this.posY < 40.0) {
                return super.B();
            }
        }
        return false;
    }

    @Override
    public void E() {
        int n = this.e();
        if (!this.worldObj.isRemote && n > 1 && this.a() <= 0.0f) {
            int n2 = 2 + a5_0.a(this.Q, 3);
            for (int i = 0; i < n2; ++i) {
                float f = ((float)(i % 2) - 0.5f) * (float)n / 4.0f;
                float f2 = ((float)(i / 2) - 0.5f) * (float)n / 4.0f;
                ny_1 ny_12 = this.j();
                if (this.e()) {
                    ny_12.a(this.y());
                }
                if (this.i()) {
                    ny_12.y();
                }
                ny_12.j(n / 2);
                ny_12.c(this.posX + (double)f, this.posY + 0.5, this.posZ + (double)f2, a5_0.e(this.Q) * 360.0f, 0.0f);
                aV8.b(this.worldObj, ny_12);
            }
        }
        super.E();
    }

    public ny_1(World world) {
        super(world);
        this.br = new pp_0(this);
        aMS.a(this.bx, 1, new alg_1(this));
        aMS.a(this.bx, 2, new alq_1(this));
        aMS.a(this.bx, 3, new ali_1(this));
        aMS.a(this.bx, 5, new alc_1(this));
        aMS.a(this.bv, 1, new _L(this));
        aMS.a(this.bv, 3, new _2(this, nf_2.class));
    }

    protected boolean d() {
        return this.e() > 1;
    }

    @Override
    public void e(Entity entity) {
        super.e(entity);
        if (entity instanceof nf_2 && this.d()) {
            this.d((EntityLivingBase)entity);
        }
    }
}

