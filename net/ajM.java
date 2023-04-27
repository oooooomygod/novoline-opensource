/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.EnumFacing;

class ajM {
    int c;
    int e;
    boolean[] f;
    boolean d;
    boolean b;
    ajM[] a = new ajM[6];

    /*
     * WARNING - void declaration
     */
    public int a() {
        int n = 0;
        while (true) {
            if (this.f[n]) {
                void var1_2;
                ++var1_2;
            }
            ++n;
        }
    }

    public boolean c() {
        return this.c >= 75;
    }

    public boolean a(int n) {
        if (this.d) {
            return true;
        }
        this.e = n;
        int n2 = 0;
        while (this.a[n2] == null || !this.f[n2] || this.a[n2].e == n || !this.a[n2].a(n)) {
            ++n2;
        }
        return true;
    }

    public ajM(int n) {
        this.f = new boolean[6];
        this.c = n;
    }

    public void b() {
        int n = 0;
        while (true) {
            this.f[n] = this.a[n] != null;
            ++n;
        }
    }

    public void a(EnumFacing enumFacing, ajM ajM2) {
        this.a[SJ.i((EnumFacing)enumFacing)] = ajM2;
        ajM2.a[SJ.i((EnumFacing)SJ.b((EnumFacing)enumFacing))] = this;
    }
}

