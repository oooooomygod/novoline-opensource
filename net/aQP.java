/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.MathHelper;
import net.aL0;
import net.afk_1;

public class aQP {
    public int j;
    private int h;
    public boolean a;
    aQP b;
    int f = -1;
    float g;
    public int d;
    float i;
    public int c;
    float e;

    public aQP(int n, int n2, int n3) {
        this.c = n;
        this.d = n2;
        this.j = n3;
        this.h = aQP.a(n, n2, n3);
    }

    public String toString() {
        return aL0.c(aL0.a(aL0.c(aL0.a(aL0.c(new StringBuilder(), this.c), afk_1.b), this.d), afk_1.a), this.j).toString();
    }

    public boolean a() {
        return this.f >= 0;
    }

    public static int a(int n, int n2, int n3) {
        return n2 & 0xFF | (n & Short.MAX_VALUE) << 8 | (n3 & Short.MAX_VALUE) << 24 | Integer.MIN_VALUE | 0x8000;
    }

    public boolean equals(Object object) {
        if (!(object instanceof aQP)) {
            return false;
        }
        aQP aQP2 = (aQP)object;
        return this.h == aQP2.h && this.c == aQP2.c && this.d == aQP2.d && this.j == aQP2.j;
    }

    public float a(aQP aQP2) {
        float f = aQP2.c - this.c;
        float f2 = aQP2.d - this.d;
        float f3 = aQP2.j - this.j;
        return f * f + f2 * f2 + f3 * f3;
    }

    public int hashCode() {
        return this.h;
    }

    public float b(aQP aQP2) {
        float f = aQP2.c - this.c;
        float f2 = aQP2.d - this.d;
        float f3 = aQP2.j - this.j;
        return MathHelper.g(f * f + f2 * f2 + f3 * f3);
    }
}

