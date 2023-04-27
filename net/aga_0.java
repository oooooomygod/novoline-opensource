/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.YJ;

/*
 * Renamed from net.aGa
 */
class aga_0 {
    public int e;
    public int d;
    public boolean b;
    public int a;
    public Class<? extends YJ> c;

    public aga_0(Class<? extends YJ> clazz, int n, int n2) {
        this(clazz, n, n2, false);
    }

    public boolean a() {
        return this.d == 0 || this.e < this.d;
    }

    public boolean a(int n) {
        return this.d == 0 || this.e < this.d;
    }

    public aga_0(Class<? extends YJ> clazz, int n, int n2, boolean bl) {
        this.c = clazz;
        this.a = n;
        this.d = n2;
        this.b = bl;
    }
}

