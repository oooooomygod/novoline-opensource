/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.aes_0;
import net.aqo_0;
import net.il_0;

public class GN {
    aes_0 d;
    public float[] c;
    public long a;
    public int f;
    public int e;
    public il_0[] b;

    public GN(aes_0 aes_02, int n, int n2) {
        this.d = aes_02;
        this.c = new float[256];
        this.b = new il_0[256];
        this.e = n;
        this.f = n2;
        aqo_0.a(aes_0.a(aes_02), this.c, n << 4, n2 << 4, 16, 16);
        aqo_0.a(aes_0.a(aes_02), this.b, n << 4, n2 << 4, 16, 16, false);
    }

    public il_0 a(int n, int n2) {
        return this.b[n & 0xF | (n2 & 0xF) << 4];
    }
}

