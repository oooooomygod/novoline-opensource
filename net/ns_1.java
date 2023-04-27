/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import net.minecraft.util.DamageSource;
import deobf.Entity;
import deobf.EntityPlayer;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.nS
 */
public class ns_1
extends ne_2 {
    private al7 bH;

    @Override
    public boolean a(DamageSource damageSource, float f) {
        if (this.a(damageSource)) {
            return false;
        }
        if (damageSource instanceof aed_1 || damageSource == DamageSource.s) {
            this.bH.c();
        }
        return super.a(damageSource, f);
    }

    @Override
    protected void a(BlockPos blockPos, Block block) {
        this.a(VV.d, 0.15f, 1.0f);
    }

    @Override
    public void onUpdate() {
        this.aD = this.rotationYaw;
        super.onUpdate();
    }

    @Override
    protected String d() {
        return VV.b;
    }

    @Override
    protected Item j() {
        return null;
    }

    @Override
    public aH2 ae() {
        return aH2.ARTHROPOD;
    }

    @Override
    protected String ac() {
        return VV.a;
    }

    @Override
    protected void H() {
        super.H();
        Ma.a(this.a(abb_0.b), 8.0);
        Ma.a(this.a(abb_0.e), 0.25);
        Ma.a(this.a(abb_0.f), 1.0);
    }

    @Override
    protected String C() {
        return VV.c;
    }

    @Override
    public float b(BlockPos blockPos) {
        return BlockStateInvoker.getBlock(aV8.q(this.worldObj, amv_2.g(blockPos))) == Blocks.stone ? 10.0f : super.b(blockPos);
    }

    public ns_1(World world) {
        super(world);
        this.c(0.4f, 0.3f);
        aMS.a(this.bx, 1, new _X(this));
        this.bH = new al7(this);
        aMS.a(this.bx, 3, this.bH);
        aMS.a(this.bx, 4, new _r_0(this, EntityPlayer.class, 1.0, false));
        aMS.a(this.bx, 5, new all_2(this));
        aMS.a(this.bv, 1, new _9((nu_1)this, true, new Class[0]));
        aMS.a(this.bv, 2, new _m_0<EntityPlayer>((nu_1)this, EntityPlayer.class, true));
    }

    @Override
    public float w() {
        return 0.1f;
    }

    @Override
    public boolean B() {
        if (super.B()) {
            aV8.a(this.worldObj, (Entity)this, 5.0);
            return true;
        }
        return false;
    }

    @Override
    protected boolean d() {
        return true;
    }

    @Override
    public double H() {
        return 0.2;
    }

    @Override
    protected boolean p() {
        return false;
    }
}

