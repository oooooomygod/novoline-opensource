/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.zd_0;

public class aDW {
    public int d;
    public int a;
    public int c;
    public Class<? extends zd_0> b;

    public boolean a(int n) {
        return this.d == 0 || this.a < this.d;
    }

    public boolean a() {
        return this.d == 0 || this.a < this.d;
    }

    public aDW(Class<? extends zd_0> clazz, int n, int n2) {
        this.b = clazz;
        this.c = n;
        this.d = n2;
    }
}

