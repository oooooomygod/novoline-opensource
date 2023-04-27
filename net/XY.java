/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a0D;
import net.adk_2;

public abstract class XY {
    private int a = -1;
    private int c = -1;
    private String b;

    public int b() {
        return this.a;
    }

    public void a(int n) {
        a0D.r();
        if (this.c != n) {
            this.c = n;
            this.a = adk_2.b(n, this.b);
            this.d();
        }
    }

    public int e() {
        return this.c;
    }

    public boolean c() {
        a0D.k();
        return this.a >= 0;
    }

    public XY(String string) {
        this.b = string;
    }

    public String a() {
        return this.b;
    }

    protected abstract void d();
}

