/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.zi_1;

public class a4M {
    public int a;
    public float[] b;

    public float b(int n) {
        if (this.b == null) {
            throw new NullPointerException(zi_1.b);
        }
        int n2 = this.c(n);
        return n2 != 3 ? this.b[3] : this.b[1];
    }

    public float a(int n) {
        if (this.b == null) {
            throw new NullPointerException(zi_1.a);
        }
        int n2 = this.c(n);
        return n2 != 1 ? this.b[2] : this.b[0];
    }

    public int d(int n) {
        return (n + 4 - this.a / 90) % 4;
    }

    private static NullPointerException a(NullPointerException nullPointerException) {
        return nullPointerException;
    }

    private int c(int n) {
        return (n + this.a / 90) % 4;
    }

    public a4M(float[] fArray, int n) {
        this.b = fArray;
        this.a = n;
    }

    public void a(float[] fArray) {
        if (this.b == null) {
            this.b = fArray;
        }
    }
}

