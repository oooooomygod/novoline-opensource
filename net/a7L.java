/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.Iterator;
import java.util.NoSuchElementException;
import net.minecraft.block.BlockPos;

public class a7L
implements Iterator<BlockPos> {
    private double i;
    private double a;
    private double g;
    private double m;
    private int b;
    private boolean d;
    private int l;
    private int k;
    private double h;
    private double c;
    private double f;
    private zw_1 e = new zw_1(0, 0, 0);
    private double j;

    @Override
    public void remove() {
        throw new RuntimeException(tm_1.a);
    }

    public BlockPos a() {
        a0D.k();
        if (!this.d) {
            throw new NoSuchElementException();
        }
        aut_1.a(this.e, (double)this.b, this.m, this.h);
        this.b();
        this.d = this.b < this.k && this.m < this.g && this.h < this.j;
        return this.e;
    }

    private static NoSuchElementException a(NoSuchElementException noSuchElementException) {
        return noSuchElementException;
    }

    @Override
    public boolean hasNext() {
        return this.d;
    }

    private void b() {
        a0D.k();
        this.h += 1.0;
        if (this.h >= this.j) {
            this.h = this.i;
            this.m += 1.0;
            if (this.m >= this.g) {
                this.m = this.a;
                this.a += this.c;
                this.g += this.c;
                this.m = this.a;
                this.i += this.f;
                this.j += this.f;
                this.h = this.i;
                ++this.b;
            }
        }
    }

    public a7L(BlockPos blockPos, BlockPos blockPos2, double d, double d2) {
        this.c = d;
        a0D.r();
        this.f = d2;
        this.l = amv_2.j(blockPos);
        this.k = amv_2.j(blockPos2);
        this.a = amv_2.h(blockPos);
        this.g = (double)amv_2.h(blockPos2) - 0.5;
        this.i = amv_2.i(blockPos);
        this.j = (double)amv_2.i(blockPos2) - 0.5;
        this.b = this.l;
        this.m = this.a;
        this.h = this.i;
        this.d = this.b < this.k && this.m < this.g && this.h < this.j;
    }
}

