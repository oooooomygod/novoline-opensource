/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.MathHelper;
import net.aWU;
import net.kn_1;
import net.mg_2;

/*
 * Renamed from net.zl
 */
public class zl_2
implements Comparable<zl_2> {
    private int a;
    private int b;
    private int c;
    public static zl_2 d = new zl_2(0, 0, 0);

    public double b(double d, double d2, double d3) {
        double d4 = (double)this.a() - d;
        double d5 = (double)this.c() - d2;
        double d6 = (double)this.b() - d3;
        return d4 * d4 + d5 * d5 + d6 * d6;
    }

    public int c() {
        return this.c;
    }

    public double a(double d, double d2, double d3) {
        double d4 = (double)this.a() + 0.5 - d;
        double d5 = (double)this.c() + 0.5 - d2;
        double d6 = (double)this.b() + 0.5 - d3;
        return d4 * d4 + d5 * d5 + d6 * d6;
    }

    public zl_2 a(zl_2 zl_22) {
        return new zl_2(this.c() * zl_22.b() - this.b() * zl_22.c(), this.b() * zl_22.a() - this.a() * zl_22.b(), this.a() * zl_22.c() - this.c() * zl_22.a());
    }

    public int b(zl_2 zl_22) {
        return this.c() == zl_22.c() ? (this.b() == zl_22.b() ? this.a() - zl_22.a() : this.b() - zl_22.b()) : this.c() - zl_22.c();
    }

    public String toString() {
        return mg_2.a(mg_2.a(mg_2.a(aWU.a(this), kn_1.a, this.a()), kn_1.c, this.c()), kn_1.b, this.b()).toString();
    }

    public zl_2(double d, double d2, double d3) {
        this(MathHelper.floor_double(d), MathHelper.floor_double(d2), MathHelper.floor_double(d3));
    }

    public int hashCode() {
        return (this.c() + this.b() * 31) * 31 + this.a();
    }

    public int b() {
        return this.b;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof zl_2)) {
            return false;
        }
        zl_2 zl_22 = (zl_2)object;
        return this.a() == zl_22.a() && this.c() == zl_22.c() && this.b() == zl_22.b();
    }

    public double c(zl_2 zl_22) {
        return this.b(zl_22.a(), zl_22.c(), zl_22.b());
    }

    public zl_2(int n, int n2, int n3) {
        this.a = n;
        this.c = n2;
        this.b = n3;
    }

    public int a() {
        return this.a;
    }
}

