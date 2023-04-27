/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.Vec3;
import net.minecraft.block.BlockPos;

public class _P
extends _v_0 {
    private nu_1 e;
    private double b;
    private double f;
    private double d;
    private double c;

    @Override
    public boolean g() {
        if (aMY.e(this.e)) {
            return false;
        }
        BlockPos blockPos = aMY.f(this.e);
        avu_1.a(this.e, 16, 7, new Vec3(amv_2.j(blockPos), amv_2.h(blockPos), amv_2.i(blockPos)));
        return false;
    }

    public _P(nu_1 nu_12, double d) {
        this.e = nu_12;
        this.f = d;
        this.a(1);
    }

    @Override
    public boolean f() {
        return !tz_1.b(aMY.a(this.e));
    }

    @Override
    public void b() {
        tz_1.a(aMY.a(this.e), this.b, this.d, this.c, this.f);
    }
}

