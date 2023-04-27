/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.NBTBase;
import net.NBTTagCompound;
import net.azq_1;
import net.tn_0;

/*
 * Renamed from net.tx
 */
public class tx_2 {
    private boolean b;
    private float d = 0.05f;
    private float g = 0.1f;
    private boolean f;
    private boolean a;
    private boolean c = true;
    private boolean e;

    public void e(boolean bl) {
        this.c = bl;
    }

    public boolean d() {
        return this.e;
    }

    public void a(float f) {
        this.g = f;
    }

    public boolean f() {
        return this.a;
    }

    public void b(float f) {
        this.d = f;
    }

    public void b(NBTTagCompound nBTTagCompound) {
        if (tn_0.a(nBTTagCompound, azq_1.o, 10)) {
            NBTTagCompound nBTTagCompound2 = tn_0.d(nBTTagCompound, azq_1.a);
            this.e = tn_0.c(nBTTagCompound2, azq_1.f);
            this.b = tn_0.c(nBTTagCompound2, azq_1.n);
            this.a = tn_0.c(nBTTagCompound2, azq_1.b);
            this.f = tn_0.c(nBTTagCompound2, azq_1.e);
            if (tn_0.a(nBTTagCompound2, azq_1.s, 99)) {
                this.d = tn_0.k(nBTTagCompound2, azq_1.r);
                this.g = tn_0.k(nBTTagCompound2, azq_1.q);
            }
            if (tn_0.a(nBTTagCompound2, azq_1.d, 1)) {
                this.c = tn_0.c(nBTTagCompound2, azq_1.h);
            }
        }
    }

    public float c() {
        return this.d;
    }

    public float g() {
        return this.g;
    }

    public void c(boolean bl) {
        this.b = bl;
    }

    public void b(boolean bl) {
        this.a = bl;
    }

    public boolean e() {
        return this.f;
    }

    public boolean a() {
        return this.b;
    }

    public void a(boolean bl) {
        this.e = bl;
    }

    public void a(NBTTagCompound nBTTagCompound) {
        NBTTagCompound nBTTagCompound2 = new NBTTagCompound();
        tn_0.a(nBTTagCompound2, azq_1.p, this.e);
        tn_0.a(nBTTagCompound2, azq_1.g, this.b);
        tn_0.a(nBTTagCompound2, azq_1.k, this.a);
        tn_0.a(nBTTagCompound2, azq_1.j, this.f);
        tn_0.a(nBTTagCompound2, azq_1.m, this.c);
        tn_0.a(nBTTagCompound2, azq_1.c, this.d);
        tn_0.a(nBTTagCompound2, azq_1.i, this.g);
        tn_0.a(nBTTagCompound, azq_1.l, (NBTBase)nBTTagCompound2);
    }

    public void d(boolean bl) {
        this.f = bl;
    }

    public boolean b() {
        return this.c;
    }
}

