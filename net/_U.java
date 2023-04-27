/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.Vec3;
import java.util.Random;
import net.minecraft.block.BlockPos;

public class _U
extends _v_0 {
    private double d;
    private double b;
    private nu_1 c;
    private double e;
    private double f;
    private World g;

    @Override
    public void b() {
        tz_1.a(aMY.a(this.c), this.e, this.d, this.f, this.b);
    }

    public _U(nu_1 nu_12, double d) {
        this.c = nu_12;
        this.b = d;
        this.g = nu_12.worldObj;
        this.a(1);
    }

    @Override
    public boolean f() {
        return !tz_1.b(aMY.a(this.c));
    }

    private Vec3 a() {
        Random random = aMY.o(this.c);
        BlockPos blockPos = new BlockPos(this.c.posX, aMY.c((nu_1)this.c).a, this.c.posZ);
        int n = 0;
        BlockPos blockPos2;
        while (aV8.w(this.g, blockPos2 = amv_2.a(blockPos, a5_0.a(random, 20) - 10, a5_0.a(random, 6) - 3, a5_0.a(random, 20) - 10)) || !(aMY.c(this.c, blockPos2) < 0.0f)) {
            ++n;
        }
        return new Vec3(amv_2.j(blockPos2), amv_2.h(blockPos2), amv_2.i(blockPos2));
    }

    @Override
    public boolean g() {
        if (!aV8.t(this.g)) {
            return false;
        }
        if (!aMY.q(this.c)) {
            return false;
        }
        if (!aV8.w(this.g, new BlockPos(this.c.posX, aMY.c((nu_1)this.c).a, this.c.posZ))) {
            return false;
        }
        this.a();
        return false;
    }
}

