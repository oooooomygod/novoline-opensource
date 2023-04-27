/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.Entity;
import deobf.Vec3;
import net.aQP;

public class aMH {
    private aQP[] a;
    private int c;
    private int b;

    public Vec3 a(Entity entity) {
        return this.a(entity, this.b);
    }

    public int c() {
        return this.c;
    }

    public boolean a(aMH aMH2) {
        return false;
    }

    public aQP b() {
        return this.c > 0 ? this.a[this.c - 1] : null;
    }

    public Vec3 a(Entity entity, int n) {
        double d = (double)this.a[n].c + (double)((int)(entity.width + 1.0f)) * 0.5;
        double d2 = this.a[n].d;
        double d3 = (double)this.a[n].j + (double)((int)(entity.width + 1.0f)) * 0.5;
        return new Vec3(d, d2, d3);
    }

    public int e() {
        return this.b;
    }

    public boolean a() {
        return this.b >= this.c;
    }

    public aQP b(int n) {
        return this.a[n];
    }

    public void c(int n) {
        this.c = n;
    }

    public aMH(aQP[] aQPArray) {
        this.a = aQPArray;
        this.c = aQPArray.length;
    }

    public boolean a(Vec3 vec3) {
        aQP aQP2 = this.b();
        return aQP2.c == (int)vec3.xCoord && aQP2.j == (int)vec3.zCoord;
    }

    public void a(int n) {
        this.b = n;
    }

    public void d() {
        ++this.b;
    }
}

