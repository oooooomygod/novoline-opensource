/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.MapInvoker;
import java.util.IdentityHashMap;
import java.util.Map;
import deobf.EnumFacing;

/*
 * Renamed from net.ck
 */
public class ck_2 {
    private Map[] a;
    public int c;
    public boolean b;

    public ck_2(String string) {
        aP2.b();
        this.c = 1;
        this.b = false;
        this.a = new Map[8];
        if (string.equals(hx_1.c)) {
            this.c = 4;
        }
        if (string.equals(hx_1.e)) {
            this.c = 2;
        }
        if (string.equals(hx_1.b)) {
            this.b = true;
        }
        if (string.equals(hx_1.a)) {
            this.c = 4;
            this.b = true;
        }
        if (string.equals(hx_1.f)) {
            this.c = 2;
            this.b = true;
        }
        ys_2.d(aL0.a(aL0.a(new StringBuilder(), hx_1.d), string).toString());
    }

    private boolean a(a9Z a9Z2) {
        aP2.b();
        KM kM = aX3.a(a9Z2);
        float f = qg_2.a(kM);
        float f2 = qg_2.m(kM);
        float f3 = f2 - f;
        float f4 = f3 / 256.0f;
        float f5 = qg_2.f(kM);
        float f6 = qg_2.k(kM);
        float f7 = f6 - f5;
        float f8 = f7 / 256.0f;
        int[] nArray = aX3.d(a9Z2);
        int n = nArray.length / 4;
        int n2 = 0;
        int n3 = n2 * n;
        float f9 = axx_1.a(nArray[n3 + 4]);
        float f10 = axx_1.a(nArray[n3 + 4 + 1]);
        if (!this.a(f9, f, f4) && !this.a(f9, f2, f4)) {
            return false;
        }
        if (!this.a(f10, f5, f8) && !this.a(f10, f6, f8)) {
            return false;
        }
        ++n2;
        return true;
    }

    private a9Z a(a9Z a9Z2, int n, boolean bl) {
        int[] nArray = aX3.d(a9Z2);
        int n2 = aX3.e(a9Z2);
        aP2.b();
        EnumFacing enumFacing = aX3.f(a9Z2);
        KM kM = aX3.a(a9Z2);
        if (!this.a(a9Z2)) {
            return a9Z2;
        }
        nArray = this.a(nArray, n, bl);
        a9Z a9Z3 = new a9Z(nArray, n2, enumFacing, kM);
        return a9Z3;
    }

    public boolean a() {
        aP2.b();
        return this.c != 2 && this.c != 4 ? this.b : true;
    }

    private int[] a(int[] nArray, int n, boolean bl) {
        aP2.b();
        int[] nArray2 = (int[])nArray.clone();
        int n2 = 4 - n;
        if (bl) {
            n2 += 3;
        }
        int n3 = nArray2.length / 4;
        int n4 = 0;
        int n5 = n4 * n3;
        int n6 = (n2 %= 4) * n3;
        nArray2[n6 + 4] = nArray[n5 + 4];
        nArray2[n6 + 4 + 1] = nArray[n5 + 4 + 1];
        if (bl) {
            --n2;
            n2 = 3;
        }
        if (++n2 > 3) {
            n2 = 0;
        }
        ++n4;
        return nArray2;
    }

    private boolean a(float f, float f2, float f3) {
        aP2.b();
        float f4 = MathHelper.d(f - f2);
        return f4 < f3;
    }

    public synchronized a9Z b(a9Z a9Z2, int n, boolean bl) {
        aP2.b();
        int n2 = n;
        if (bl) {
            n2 = n | 4;
        }
        if (n2 > 0 && n2 < this.a.length) {
            a9Z a9Z3;
            IdentityHashMap identityHashMap = this.a[n2];
            if (identityHashMap == null) {
                this.a[n2] = identityHashMap = new IdentityHashMap(1);
            }
            if ((a9Z3 = (a9Z)MapInvoker.c(identityHashMap, a9Z2)) == null) {
                a9Z3 = this.a(a9Z2, n, bl);
                MapInvoker.c(identityHashMap, a9Z2, a9Z3);
            }
            return a9Z3;
        }
        return a9Z2;
    }
}

