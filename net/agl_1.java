/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.SystemInvoker;
import deobf.Entity;
import java.util.Iterator;
import java.util.List;
import net.minecraft.block.BlockPos;
import net.ChunkCoordIntPair;

/*
 * Renamed from net.agL
 */
public class agl_1 {
    private double f = 0.2;
    private double h;
    private int b = 29999984;
    private List<aci_1> e = my_0.c();
    private int i = 5;
    private double g = 0.0;
    private double d = 5.0;
    private long c;
    private long a;
    private double l = 0.0;
    private int j = 15;
    private double k;

    protected List<aci_1> n() {
        return my_0.a(this.e);
    }

    public void a(double d) {
        this.k = d;
        this.h = d;
        this.c = this.a = SystemInvoker.f();
        Iterator iterator = ListInvoker.iterator(this.n());
        while (dz_0.c(iterator)) {
            aci_1 aci_12 = (aci_1)dz_0.b(iterator);
            a4u_0.c(aci_12, this, d);
        }
    }

    public double g() {
        double d = this.j() - this.f() / 2.0;
        if (d < (double)(-this.b)) {
            d = -this.b;
        }
        return d;
    }

    public boolean a(rm_2 rm_22) {
        return rm_22.b > this.g() && rm_22.e < this.e() && rm_22.d > this.q() && rm_22.f < this.b();
    }

    public double m() {
        return this.f;
    }

    public double l() {
        return this.d;
    }

    public double q() {
        double d = this.h() - this.f() / 2.0;
        if (d < (double)(-this.b)) {
            d = -this.b;
        }
        return d;
    }

    public double h() {
        return this.l;
    }

    public double a(double d, double d2) {
        double d3 = d2 - this.q();
        double d4 = this.b() - d2;
        double d5 = d - this.g();
        double d6 = this.e() - d;
        double d7 = MathInvoker.a(d5, d6);
        d7 = MathInvoker.a(d7, d3);
        return MathInvoker.a(d7, d4);
    }

    public double f() {
        if (this.k() != fy_2.STATIONARY) {
            double d = (float)(SystemInvoker.f() - this.c) / (float)(this.a - this.c);
            if (d < 1.0) {
                return this.k + (this.h - this.k) * d;
            }
            this.a(this.h);
        }
        return this.k;
    }

    public double j() {
        return this.g;
    }

    public int c() {
        return this.i;
    }

    public void c(double d) {
        this.d = d;
        Iterator iterator = ListInvoker.iterator(this.n());
        while (dz_0.c(iterator)) {
            aci_1 aci_12 = (aci_1)dz_0.b(iterator);
            a4u_0.a(aci_12, this, d);
        }
    }

    public fy_2 k() {
        return this.h < this.k ? fy_2.SHRINKING : (this.h > this.k ? fy_2.GROWING : fy_2.STATIONARY);
    }

    public double i() {
        return this.a == this.c ? 0.0 : MathInvoker.a(this.k - this.h) / (double)(this.a - this.c);
    }

    public double e() {
        double d = this.j() + this.f() / 2.0;
        if (d > (double)this.b) {
            d = this.b;
        }
        return d;
    }

    public double a(Entity entity) {
        return this.a(entity.posX, entity.posZ);
    }

    public void c(int n) {
        this.i = n;
        Iterator iterator = ListInvoker.iterator(this.n());
        while (dz_0.c(iterator)) {
            aci_1 aci_12 = (aci_1)dz_0.b(iterator);
            a4u_0.a(aci_12, this, n);
        }
    }

    public double b() {
        double d = this.h() + this.f() / 2.0;
        if (d > (double)this.b) {
            d = this.b;
        }
        return d;
    }

    public void b(double d, double d2) {
        this.g = d;
        this.l = d2;
        Iterator iterator = ListInvoker.iterator(this.n());
        while (dz_0.c(iterator)) {
            aci_1 aci_12 = (aci_1)dz_0.b(iterator);
            a4u_0.a(aci_12, this, d, d2);
        }
    }

    public boolean a(ChunkCoordIntPair chunkCoordIntPair) {
        return (double)aV0.c(chunkCoordIntPair) > this.g() && (double)aV0.a(chunkCoordIntPair) < this.e() && (double)aV0.d(chunkCoordIntPair) > this.q() && (double)aV0.b(chunkCoordIntPair) < this.b();
    }

    public void b(int n) {
        this.j = n;
        Iterator iterator = ListInvoker.iterator(this.n());
        while (dz_0.c(iterator)) {
            aci_1 aci_12 = (aci_1)dz_0.b(iterator);
            a4u_0.b(aci_12, this, n);
        }
    }

    public int o() {
        return this.b;
    }

    public long a() {
        return this.k() != fy_2.STATIONARY ? this.a - SystemInvoker.f() : 0L;
    }

    public double d() {
        return this.h;
    }

    public void a(double d, double d2, long l4) {
        this.k = d;
        this.h = d2;
        this.c = SystemInvoker.f();
        this.a = this.c + l4;
        Iterator iterator = ListInvoker.iterator(this.n());
        while (dz_0.c(iterator)) {
            aci_1 aci_12 = (aci_1)dz_0.b(iterator);
            a4u_0.a(aci_12, this, d, d2, l4);
        }
    }

    public void b(double d) {
        this.f = d;
        Iterator iterator = ListInvoker.iterator(this.n());
        while (dz_0.c(iterator)) {
            aci_1 aci_12 = (aci_1)dz_0.b(iterator);
            a4u_0.b(aci_12, this, d);
        }
    }

    public int p() {
        return this.j;
    }

    public boolean a(BlockPos blockPos) {
        return (double)(amv_2.j(blockPos) + 1) > this.g() && (double)amv_2.j(blockPos) < this.e() && (double)(amv_2.i(blockPos) + 1) > this.q() && (double)amv_2.i(blockPos) < this.b();
    }

    public agl_1() {
        this.h = this.k = 6.0E7;
    }

    public void a(int n) {
        this.b = n;
    }

    public void a(aci_1 aci_12) {
        ListInvoker.add(this.e, aci_12);
    }
}

