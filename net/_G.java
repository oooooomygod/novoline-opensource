/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.Vec3;
import net.minecraft.block.BlockPos;

public class _G
extends _v_0 {
    private int e = -1;
    private int d = -1;
    private aY6 c;
    private nu_1 b;

    @Override
    public boolean f() {
        return !tz_1.b(aMY.a(this.b));
    }

    @Override
    public void b() {
        this.d = -1;
        BlockPos blockPos = hH.i(this.c);
        int n = amv_2.j(blockPos);
        int n2 = amv_2.h(blockPos);
        int n3 = amv_2.i(blockPos);
        if (aMY.a(this.b, blockPos) > 256.0) {
            Vec3 vec3 = avu_1.a(this.b, 14, 3, new Vec3((double)n + 0.5, n2, (double)n3 + 0.5));
            tz_1.a(aMY.a(this.b), vec3.xCoord, vec3.yCoord, vec3.zCoord, 1.0);
        } else {
            tz_1.a(aMY.a(this.b), (double)n + 0.5, n2, (double)n3 + 0.5, 1.0);
        }
    }

    @Override
    public void a() {
        this.d = amv_2.j(hH.i(this.c));
        this.e = amv_2.i(hH.i(this.c));
        this.c = null;
    }

    public _G(nu_1 nu_12) {
        this.b = nu_12;
        this.a(1);
    }

    @Override
    public boolean g() {
        BlockPos blockPos = new BlockPos(this.b);
        if ((!aV8.t(this.b.worldObj) || aV8.n(this.b.worldObj) && !hw_0.c(aV8.o(this.b.worldObj, blockPos))) && !qq_2.e(this.b.worldObj.d)) {
            if (a5_0.a(aMY.o(this.b), 50) != 0) {
                return false;
            }
            if (this.d != -1 && aMY.a(this.b, this.d, this.b.posY, this.e) < 4.0) {
                return false;
            }
            EX.a(aV8.o(this.b.worldObj), blockPos, 14);
            return false;
        }
        return false;
    }
}

