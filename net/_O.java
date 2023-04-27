/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.block.BlockPos;


public abstract class _O
extends _v_0 {
    private int i;
    private nu_1 g;
    protected int f;
    private boolean b;
    protected BlockPos h = BlockPos.m;
    private int c;
    private int d;
    private double e;

    @Override
    public boolean f() {
        return this.c >= -this.i && this.c <= 1200 && this.a(this.g.worldObj, this.h);
    }

    public _O(nu_1 nu_12, double d, int n) {
        this.g = nu_12;
        this.e = d;
        this.d = n;
        this.a(5);
    }

    @Override
    public boolean g() {
        if (this.f > 0) {
            --this.f;
            return false;
        }
        this.f = 200 + a5_0.a(aMY.o(this.g), 200);
        return this.a();
    }

    private boolean a() {
        int n = this.d;
        BlockPos blockPos = new BlockPos(this.g);
        int n2 = 0;
        while (true) {
            int n3;
            if ((n3 = 0) < n) {
                int n4 = 0;
                int n5 = 0;
                while (true) {
                    BlockPos blockPos2;
                    if (aMY.b(this.g, blockPos2 = amv_2.a(blockPos, n4, n2 - 1, n5)) && this.a(this.g.worldObj, blockPos2)) {
                        this.h = blockPos2;
                        return true;
                    }
                    n5 = -n5;
                }
            }
            n2 = -n2;
        }
    }

    protected boolean b() {
        return this.b;
    }

    @Override
    public void d() {
        if (aMY.d(this.g, amv_2.e(this.h)) > 1.0) {
            this.b = false;
            ++this.c;
            if (this.c % 40 == 0) {
                tz_1.a(aMY.a(this.g), (double)amv_2.j(this.h) + 0.5, amv_2.h(this.h) + 1, (double)amv_2.i(this.h) + 0.5, this.e);
            }
        } else {
            this.b = true;
            --this.c;
        }
    }

    @Override
    public void b() {
        tz_1.a(aMY.a(this.g), (double)amv_2.j(this.h) + 0.5, amv_2.h(this.h) + 1, (double)amv_2.i(this.h) + 0.5, this.e);
        this.c = 0;
        this.i = a5_0.a(aMY.o(this.g), a5_0.a(aMY.o(this.g), 1200) + 1200) + 1200;
    }

    @Override
    public void a() {
    }

    protected abstract boolean a(World var1, BlockPos var2);
}

