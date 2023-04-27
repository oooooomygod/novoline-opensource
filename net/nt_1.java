/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.util.DamageSource;
import deobf.EntityPlayer;

/*
 * Renamed from net.nT
 */
public abstract class nt_1
extends nl_1
implements UH {
    @Override
    public boolean af() {
        return false;
    }

    @Override
    protected boolean s() {
        return true;
    }

    @Override
    public boolean B() {
        return true;
    }

    @Override
    public boolean m() {
        return true;
    }

    @Override
    public int Q() {
        return 120;
    }

    @Override
    protected int a(EntityPlayer entityPlayer) {
        return 1 + a5_0.a(this.worldObj.o, 3);
    }

    public nt_1(World world) {
        super(world);
    }

    @Override
    public void ak() {
        int n = this.av();
        super.ak();
        if (this.n() && !this.isInWater()) {
            this.d(--n);
            if (this.av() == -20) {
                this.d(0);
                this.a(DamageSource.f, 2.0f);
            }
        } else {
            this.d(300);
        }
    }

    @Override
    public boolean Y() {
        return aV8.a(this.worldObj, this.getEntityBoundingBox(), this);
    }
}

