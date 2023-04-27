/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.aP2;

/*
 * Renamed from net.uN
 */
public class un_1 {
    private int[] b = null;
    private int a = 0;
    private int c = 0;

    public void a(int n, int n2) {
        aP2.b();
        this.b[n] = n2;
        if (this.a < n) {
            this.a = n;
        }
    }

    public int b() {
        return this.a;
    }

    public void c() {
        this.c = 0;
        this.a = 0;
    }

    public un_1(int n) {
        this.b = new int[n];
    }

    public void c(int n) {
        aP2.b();
        this.b[this.c] = n;
        ++this.c;
        if (this.a < this.c) {
            this.a = this.c;
        }
    }

    public void b(int n) {
        this.c = n;
    }

    public int[] a() {
        return this.b;
    }

    public int a(int n) {
        return this.b[n];
    }

    public int d() {
        return this.c;
    }

    public void a(int[] nArray) {
        int n = nArray.length;
        aP2.b();
        int n2 = 0;
        if (n2 < n) {
            this.b[this.c] = nArray[n2];
            ++this.c;
            ++n2;
        }
        if (this.a < this.c) {
            this.a = this.c;
        }
    }
}

