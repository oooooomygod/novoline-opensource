/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.block.BlockPos;

/*
 * Renamed from net._d
 */
public class _d_0
extends _v_0 {
    private aY6 c;
    private nu_1 b;

    public _d_0(nu_1 nu_12) {
        this.b = nu_12;
        if (!(aMY.a(nu_12) instanceof F_)) {
            throw new IllegalArgumentException(ao1_0.a);
        }
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    @Override
    public void a() {
        afv_0.a((F_)aMY.a(this.b), true);
        afv_0.c((F_)aMY.a(this.b), true);
        this.c = null;
    }

    @Override
    public boolean f() {
        return !aV8.t(this.b.worldObj) && !hH.d(this.c) && hH.a(this.c, new BlockPos(this.b));
    }

    @Override
    public boolean g() {
        if (aV8.t(this.b.worldObj)) {
            return false;
        }
        BlockPos blockPos = new BlockPos(this.b);
        EX.a(aV8.o(this.b.worldObj), blockPos, 16);
        return false;
    }

    @Override
    public void d() {
        hH.h(this.c);
    }

    @Override
    public void b() {
        afv_0.a((F_)aMY.a(this.b), false);
        afv_0.c((F_)aMY.a(this.b), false);
    }
}

