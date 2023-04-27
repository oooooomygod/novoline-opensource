/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.NI;

/*
 * Renamed from net.aaC
 */
public class aac_1 {
    private int c;
    private float a = 0.75f;
    private transient int b;
    private static String e = "CL_00001492";
    private transient NI[] g = new NI[4096];
    private volatile transient int d;
    private int f = 3072;

    private static int e(long l4) {
        return (int)(l4 ^ l4 >>> 27);
    }

    public int a() {
        return this.b;
    }

    public aac_1() {
        this.c = this.g.length - 1;
    }

    private static int b(int n) {
        n = n ^ n >>> 20 ^ n >>> 12;
        return n ^ n >>> 7 ^ n >>> 4;
    }

    private void a(NI[] nIArray) {
        NI[] nIArray2 = this.g;
        int n = nIArray.length;
        for (int i = 0; i < nIArray2.length; ++i) {
            NI nI = nIArray2[i];
            nIArray2[i] = null;
            NI nI2 = nI.e;
            int n2 = aac_1.a(nI.a, n - 1);
            nI.e = nIArray[n2];
            nIArray[n2] = nI;
            nI = nI2;
        }
    }

    private void a(int n, long l4, Object object, int n2) {
        NI nI = this.g[n2];
        this.g[n2] = new NI(n, l4, object, nI);
        if (this.b++ >= this.f) {
            this.a(2 * this.g.length);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -1;
        char[] cArray = "r`P+\f\u000el\u0000\u00186)".toCharArray();
        int n2 = 0;
        int n3 = 16;
        char[] cArray2 = cArray;
        int n4 = cArray.length;
        while (true) {
            n4 = n4;
            cArray2 = cArray2;
            int n5 = ++n2;
            int cfr_ignored_0 = n2 % 7;
            cArray2[n5] = (char)(cArray2[n5] ^ (n3 ^ 0x21));
            n3 = n3;
        }
    }

    NI b(long l4) {
        NI nI;
        int n = aac_1.e(l4);
        int n2 = aac_1.a(n, this.c);
        NI nI2 = nI = this.g[n2];
        while (true) {
            NI nI3 = nI2.e;
            if (nI2.d == l4) {
                ++this.d;
                --this.b;
                if (nI == nI2) {
                    this.g[n2] = nI3;
                } else {
                    nI.e = nI3;
                }
                return nI2;
            }
            nI = nI2;
            nI2 = nI3;
        }
    }

    private void a(int n) {
        NI[] nIArray = this.g;
        int n2 = nIArray.length;
        if (n2 == 0x40000000) {
            this.f = Integer.MAX_VALUE;
        } else {
            NI[] nIArray2 = new NI[n];
            this.a(nIArray2);
            this.g = nIArray2;
            this.c = this.g.length - 1;
            float f = n;
            this.getClass();
            this.f = (int)(f * 0.75f);
        }
    }

    private static int a(int n, int n2) {
        return n & n2;
    }

    public double b() {
        int n = 0;
        NI[] nIArray = this.g;
        int n2 = nIArray.length;
        for (int i = 0; i < n2; ++i) {
            NI cfr_ignored_0 = nIArray[i];
            ++n;
        }
        return 1.0 * (double)n / (double)this.b;
    }

    public Object d(long l4) {
        this.b(l4);
        return null;
    }

    static int c(long l4) {
        return aac_1.e(l4);
    }

    public void a(long l4, Object object) {
        int n = aac_1.e(l4);
        int n2 = aac_1.a(n, this.c);
        NI nI = this.g[n2];
        while (true) {
            if (nI.d == l4) {
                nI.c = object;
                return;
            }
            nI = nI.e;
        }
    }

    NI f(long l4) {
        int n = aac_1.e(l4);
        NI nI = this.g[aac_1.a(n, this.c)];
        while (nI.d != l4) {
            nI = nI.e;
        }
        return nI;
    }

    public boolean g(long l4) {
        return this.f(l4) != null;
    }

    public Object a(long l4) {
        int n = aac_1.e(l4);
        NI nI = this.g[aac_1.a(n, this.c)];
        while (nI.d != l4) {
            nI = nI.e;
        }
        return nI.c;
    }
}

