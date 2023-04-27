/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.SystemInvoker;
import deobf.EnumFacing;

public class a9Z
implements az6_0 {
    protected EnumFacing a;
    private KM f = null;
    protected int d;
    protected int[] e;
    private int[] c = null;
    private static String b = "CL_00002512";

    public a9Z(int[] nArray, int n, EnumFacing enumFacing) {
        this.e = nArray;
        this.d = n;
        this.a = enumFacing;
        this.e();
    }

    private static int[] a(int[] nArray, KM kM) {
        int[] nArray2 = (int[])nArray.clone();
        int cfr_ignored_0 = kM.s / qg_2.b(kM);
        int cfr_ignored_1 = kM.a / qg_2.i(kM);
        int n = nArray2.length / 4;
        int n2 = 0;
        while (true) {
            int n3 = n2 * n;
            float f = axx_1.a(nArray2[n3 + 4]);
            float f2 = axx_1.a(nArray2[n3 + 4 + 1]);
            float f3 = qg_2.a(kM, f);
            float f4 = qg_2.d(kM, f2);
            nArray2[n3 + 4] = axx_1.e(f3);
            nArray2[n3 + 4 + 1] = axx_1.e(f4);
            ++n2;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -1;
        char[] cArray = "{\u0001@Q$dg\nx.S".toCharArray();
        int n2 = 0;
        int n3 = 117;
        char[] cArray2 = cArray;
        int n4 = cArray.length;
        while (true) {
            n4 = n4;
            cArray2 = cArray2;
            int n5 = ++n2;
            int cfr_ignored_0 = n2 % 7;
            cArray2[n5] = (char)(cArray2[n5] ^ (n3 ^ 0x4D));
            n3 = n3;
        }
    }

    @Override
    public void a(ayo_1 ayo_12) {
        aDb.c(ail_0.c6, new Object[]{ayo_12, this});
    }

    public String toString() {
        return aL0.a(aL0.a(aL0.a(aL0.a(aL0.c(aL0.a(aL0.c(aL0.a(new StringBuilder(), ts_2.c), this.e.length / 7), ts_2.a), this.d), ts_2.b), this.a), ts_2.d), this.f).toString();
    }

    public int[] d() {
        this.e();
        return this.e;
    }

    public int[] c() {
        if (this.c == null) {
            this.c = a9Z.a(this.d(), this.b());
        }
        return this.c;
    }

    private static int[] b(int[] nArray) {
        int n = nArray.length / 4;
        int n2 = n * 2;
        int[] nArray2 = new int[n2 * 4];
        int n3 = 0;
        while (true) {
            SystemInvoker.a(nArray, n3 * n, nArray2, n3 * n2, n);
            ++n3;
        }
    }

    private void e() {
        if (ys_2.aC()) {
            if (this.e.length == 28) {
                this.e = a9Z.b(this.e);
            }
        } else if (this.e.length == 56) {
            this.e = a9Z.c(this.e);
        }
    }

    public int g() {
        return this.d;
    }

    public a9Z(int[] nArray, int n, EnumFacing enumFacing, KM kM) {
        this.e = nArray;
        this.d = n;
        this.a = enumFacing;
        this.f = kM;
        this.e();
    }

    public boolean f() {
        return this.d != -1;
    }

    private static KM a(int[] nArray) {
        float f = 1.0f;
        float f2 = 1.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        int n = nArray.length / 4;
        int n2 = 0;
        while (true) {
            int n3 = n2 * n;
            float f5 = axx_1.a(nArray[n3 + 4]);
            float f6 = axx_1.a(nArray[n3 + 4 + 1]);
            f = MathInvoker.a(f, f5);
            f2 = MathInvoker.a(f2, f6);
            f3 = MathInvoker.b(f3, f5);
            f4 = MathInvoker.b(f4, f6);
            ++n2;
        }
    }

    private static int[] c(int[] nArray) {
        int n = nArray.length / 4;
        int n2 = n / 2;
        int[] nArray2 = new int[n2 * 4];
        int n3 = 0;
        while (true) {
            SystemInvoker.a(nArray, n3 * n, nArray2, n3 * n2, n2);
            ++n3;
        }
    }

    public EnumFacing a() {
        return this.a;
    }

    public KM b() {
        if (this.f == null) {
            this.f = a9Z.a(this.d());
        }
        return this.f;
    }
}

