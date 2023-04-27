/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.util.DamageSource;
import deobf.Entity;

/*
 * Renamed from net.oV
 */
public class ov_1
extends Entity {
    public aln_1 aj;
    public String ak;

    @Override
    protected void g(NBTTagCompound nBTTagCompound) {
    }

    @Override
    protected void g() {
    }

    @Override
    public boolean N() {
        return true;
    }

    @Override
    public boolean i(Entity entity) {
        return this == entity || this.aj == entity;
    }

    public ov_1(aln_1 aln_12, String string, float f, float f2) {
        super(ag_2.a(aln_12));
        this.c(f, f2);
        this.aj = aln_12;
        this.ak = string;
    }

    @Override
    public boolean a(DamageSource damageSource, float f) {
        return !this.a(damageSource) && ag_2.a(this.aj, this, damageSource, f);
    }

    @Override
    protected void b(NBTTagCompound nBTTagCompound) {
    }
}

