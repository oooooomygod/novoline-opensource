/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.block.BlockPos;
import net.minecraft.util.DamageSource;
import deobf.Entity;
import deobf.EntityLivingBase;
import deobf.EnumDifficulty;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.ne
 */
public abstract class ne_2
extends nu_1
implements ar0_0 {
    @Override
    protected boolean g() {
        return true;
    }

    public ne_2(World world) {
        super(world);
        this.bk = 5;
    }

    @Override
    protected String e(int n) {
        return n > 4 ? pw_1.a : pw_1.c;
    }

    @Override
    public boolean B() {
        return aV8.p(this.worldObj) != EnumDifficulty.PEACEFUL && this.d() && super.B();
    }

    @Override
    protected String z() {
        return pw_1.b;
    }

    @Override
    public boolean a(DamageSource damageSource, float f) {
        if (this.a(damageSource)) {
            return false;
        }
        if (super.a(damageSource, f)) {
            Entity entity = aDJ.d(damageSource);
            return this.h != entity && this.r != entity ? true : true;
        }
        return false;
    }

    @Override
    public boolean d(Entity entity) {
        float f = (float)Ma.d(this.a(abb_0.f));
        int n = 0;
        if (entity instanceof EntityLivingBase) {
            f += alf_0.a(this.ah(), ((EntityLivingBase)entity).ae());
            n += alf_0.e(this);
        }
        boolean bl = entity.a(aDJ.a(this), f);
        entity.b(-MathHelper.sin(this.rotationYaw * (float)Math.PI / 180.0f) * (float)n * 0.5f, 0.1, MathHelper.cos(this.rotationYaw * (float)Math.PI / 180.0f) * (float)n * 0.5f);
        this.motionX *= 0.6;
        this.motionZ *= 0.6;
        int n2 = alf_0.a(this);
        entity.a(n2 * 4);
        this.a(this, entity);
        return bl;
    }

    @Override
    public void onUpdate() {
        super.onUpdate();
        if (!this.worldObj.isRemote && aV8.p(this.worldObj) == EnumDifficulty.PEACEFUL) {
            this.E();
        }
    }

    protected boolean d() {
        BlockPos blockPos = new BlockPos(this.posX, this.getEntityBoundingBox().a, this.posZ);
        if (aV8.b(this.worldObj, YG.SKY, blockPos) > a5_0.a(this.Q, 32)) {
            return false;
        }
        int n = aV8.l(this.worldObj, blockPos);
        if (aV8.l(this.worldObj)) {
            int n2 = aV8.f(this.worldObj);
            aV8.c(this.worldObj, 10);
            n = aV8.l(this.worldObj, blockPos);
            aV8.c(this.worldObj, n2);
        }
        return n <= a5_0.a(this.Q, 8);
    }

    @Override
    public float b(BlockPos blockPos) {
        return 0.5f - aV8.i(this.worldObj, blockPos);
    }

    @Override
    public void onLivingUpdate() {
        this.e();
        float f = this.b(1.0f);
        if (f > 0.5f) {
            this.aF += 2;
        }
        super.onLivingUpdate();
    }

    @Override
    protected String c() {
        return pw_1.d;
    }

    @Override
    protected void H() {
        super.H();
        ht_0.b(this.N(), abb_0.f);
    }

    @Override
    protected String C() {
        return pw_1.e;
    }

    @Override
    protected String d() {
        return pw_1.f;
    }
}

