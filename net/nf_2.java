/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import net.minecraft.util.DamageSource;
import deobf.Entity;
import deobf.EntityLivingBase;
import deobf.EntityPlayer;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.nf
 */
public class nf_2
extends np_1 {
    private int bK;
    aym_1 bH;
    private int bJ;
    private int bI;

    @Override
    protected void a(BlockPos blockPos, Block block) {
        this.a(aD9.c, 1.0f, 1.0f);
    }

    @Override
    protected int j(int n) {
        return n;
    }

    @Override
    protected String d() {
        return aD9.a;
    }

    public boolean d() {
        return (aom_0.g(this.l, 16) & 1) != 0;
    }

    @Override
    protected void g() {
        super.g();
        aom_0.a(this.l, 16, axt_2.a((byte)0));
    }

    @Override
    public void onLivingUpdate() {
        int n;
        int n2;
        int n3;
        IBlockState iBlockState;
        Block block;
        super.onLivingUpdate();
        if (this.bJ > 0) {
            --this.bJ;
        }
        if (this.bK > 0) {
            --this.bK;
        }
        if (this.motionX * this.motionX + this.motionZ * this.motionZ > 2.500000277905201E-7 && a5_0.a(this.Q, 5) == 0 && BlocksInvoker.getBlockState(block = BlockStateInvoker.getBlock(iBlockState = aV8.q(this.worldObj, new BlockPos(n3 = MathHelper.floor_double(this.posX), n2 = MathHelper.floor_double(this.posY - (double)0.2f), n = MathHelper.floor_double(this.posZ))))) != Material.air) {
            aV8.a(this.worldObj, B7.BLOCK_CRACK, this.posX + ((double)a5_0.e(this.Q) - 0.5) * (double)this.width, this.getEntityBoundingBox().a + 0.1, this.posZ + ((double)a5_0.e(this.Q) - 0.5) * (double)this.width, 4.0 * ((double)a5_0.e(this.Q) - 0.5), 0.5, ((double)a5_0.e(this.Q) - 0.5) * 4.0, new int[]{BlocksInvoker.a(iBlockState)});
        }
    }

    public int f() {
        return this.bK;
    }

    public aym_1 a() {
        return this.bH;
    }

    @Override
    protected void b(Entity entity) {
        if (entity instanceof ar0_0 && !(entity instanceof nd_2) && a5_0.a(this.E(), 20) == 0) {
            this.c((EntityLivingBase)entity);
        }
        super.b(entity);
    }

    @Override
    protected void H() {
        super.H();
        Ma.a(this.a(abb_0.b), 100.0);
        Ma.a(this.a(abb_0.e), 0.25);
    }

    @Override
    public void onDeath(DamageSource damageSource) {
        if (!this.d() && this.be != null && this.bH != null) {
            xx_2.a(this.bH, this.be.getName(), -5);
        }
        super.onDeath(damageSource);
    }

    @Override
    public boolean d(Entity entity) {
        this.bJ = 10;
        aV8.a(this.worldObj, (Entity)this, (byte)4);
        boolean bl = entity.a(aDJ.a(this), (float)(7 + a5_0.a(this.Q, 15)));
        entity.motionY += (double)0.4f;
        this.a(this, entity);
        this.a(aD9.g, 1.0f, 1.0f);
        return bl;
    }

    @Override
    public void b(NBTTagCompound nBTTagCompound) {
        super.b(nBTTagCompound);
        tn_0.a(nBTTagCompound, aD9.d, this.d());
    }

    public void k(boolean bl) {
        byte by = aom_0.g(this.l, 16);
        aom_0.b(this.l, 16, axt_2.a((byte)(by | 1)));
    }

    @Override
    protected void f() {
        if (--this.bI <= 0) {
            this.bI = 70 + a5_0.a(this.Q, 50);
            this.bH = EX.a(aV8.o(this.worldObj), new BlockPos(this), 32);
            if (this.bH == null) {
                this.c();
            } else {
                BlockPos blockPos = xx_2.c(this.bH);
                this.a(blockPos, (int)((float)xx_2.f(this.bH) * 0.6f));
            }
        }
        super.f();
    }

    @Override
    protected void b(boolean bl, int n) {
        int n2;
        int n3 = a5_0.a(this.Q, 3);
        for (n2 = 0; n2 < n3; ++n2) {
            this.a(px_0.a(Blocks.bY), 1, (float)aj4.a(dq_1.POPPY));
        }
        n2 = 3 + a5_0.a(this.Q, 3);
        for (int i = 0; i < n2; ++i) {
            this.a(Items.iron_ingot, 1);
        }
    }

    @Override
    public void g(NBTTagCompound nBTTagCompound) {
        super.g(nBTTagCompound);
        this.k(tn_0.c(nBTTagCompound, aD9.e));
    }

    public int e() {
        return this.bJ;
    }

    public void l(boolean bl) {
        this.bK = 400;
        aV8.a(this.worldObj, (Entity)this, (byte)11);
    }

    public nf_2(World world) {
        super(world);
        this.c(1.4f, 2.9f);
        afv_0.b((F_)this.Z(), true);
        aMS.a(this.bx, 1, new _r_0(this, 1.0, true));
        aMS.a(this.bx, 2, new _f_0(this, 0.9, 32.0f));
        aMS.a(this.bx, 3, new _E(this, 0.6, true));
        aMS.a(this.bx, 4, new _P(this, 1.0));
        aMS.a(this.bx, 5, new _R(this));
        aMS.a(this.bx, 6, new _J(this, 0.6));
        aMS.a(this.bx, 7, new aly_2(this, EntityPlayer.class, 6.0f));
        aMS.a(this.bx, 8, new _A(this));
        aMS.a(this.bv, 1, new _M(this));
        aMS.a(this.bv, 2, new _9((nu_1)this, false, new Class[0]));
        aMS.a(this.bv, 3, new _C<Entity>(this, nl_1.class, 10, false, true, ar0_0.a));
    }

    @Override
    protected String C() {
        return aD9.f;
    }

    @Override
    public void a(byte by) {
        if (by == 4) {
            this.bJ = 10;
            this.a(aD9.b, 1.0f, 1.0f);
        } else if (by == 11) {
            this.bK = 400;
        } else {
            super.a(by);
        }
    }
}

