/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.aqp_0;

public class IntHashMap<V> {
    private float d = 0.75f;
    private transient aqp_0<V>[] a = new aqp_0[16];
    private int c = 12;
    private transient int b;

    aqp_0<V> g(int n) {
        aqp_0<V> aqp_02;
        int n2 = IntHashMap.b(n);
        int n3 = IntHashMap.a(n2, this.a.length);
        aqp_0<V> aqp_03 = aqp_02 = this.a[n3];
        while (true) {
            aqp_0 aqp_04 = aqp_03.a;
            if (aqp_03.d == n) {
                --this.b;
                if (aqp_02 == aqp_03) {
                    this.a[n3] = aqp_04;
                } else {
                    aqp_02.a = aqp_04;
                }
                return aqp_03;
            }
            aqp_02 = aqp_03;
            aqp_03 = aqp_04;
        }
    }

    public void a() {
        aqp_0<V>[] aqp_0Array = this.a;
        for (int i = 0; i < aqp_0Array.length; ++i) {
            aqp_0Array[i] = null;
        }
        this.b = 0;
    }

    private void h(int n) {
        aqp_0<V>[] aqp_0Array = this.a;
        int n2 = aqp_0Array.length;
        if (n2 == 0x40000000) {
            this.c = Integer.MAX_VALUE;
        } else {
            aqp_0[] aqp_0Array2 = new aqp_0[n];
            this.a(aqp_0Array2);
            this.a = aqp_0Array2;
            this.c = (int)((float)n * this.d);
        }
    }

    private static int a(int n, int n2) {
        return n & n2 - 1;
    }

    private void a(int n, int n2, V v, int n3) {
        aqp_0<V> aqp_02 = this.a[n3];
        this.a[n3] = new aqp_0<V>(n, n2, v, aqp_02);
        if (this.b++ >= this.c) {
            this.h(2 * this.a.length);
        }
    }

    aqp_0<V> f(int n) {
        int n2 = IntHashMap.b(n);
        aqp_0<V> aqp_02 = this.a[IntHashMap.a(n2, this.a.length)];
        while (aqp_02.d != n) {
            aqp_02 = aqp_02.a;
        }
        return aqp_02;
    }

    public V e(int n) {
        int n2 = IntHashMap.b(n);
        aqp_0<V> aqp_02 = this.a[IntHashMap.a(n2, this.a.length)];
        while (aqp_02.d != n) {
            aqp_02 = aqp_02.a;
        }
        return aqp_02.b;
    }

    private static int b(int n) {
        n = n ^ n >>> 20 ^ n >>> 12;
        return n ^ n >>> 7 ^ n >>> 4;
    }

    public void a(int n, V v) {
        int n2 = IntHashMap.b(n);
        int n3 = IntHashMap.a(n2, this.a.length);
        aqp_0<V> aqp_02 = this.a[n3];
        while (true) {
            if (aqp_02.d == n) {
                aqp_02.b = v;
                return;
            }
            aqp_02 = aqp_02.a;
        }
    }

    public V a(int n) {
        this.g(n);
        return null;
    }

    public boolean d(int n) {
        return this.f(n) != null;
    }

    static int c(int n) {
        return IntHashMap.b(n);
    }

    private void a(aqp_0<V>[] aqp_0Array) {
        aqp_0<V>[] aqp_0Array2 = this.a;
        int n = aqp_0Array.length;
        for (int i = 0; i < aqp_0Array2.length; ++i) {
            aqp_0<V> aqp_02 = aqp_0Array2[i];
            aqp_0Array2[i] = null;
            aqp_0 aqp_03 = aqp_02.a;
            int n2 = IntHashMap.a(aqp_02.c, n);
            aqp_02.a = aqp_0Array[n2];
            aqp_0Array[n2] = aqp_02;
            aqp_02 = aqp_03;
        }
    }
}

