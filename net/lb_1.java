/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.a0D;
import net.aP2;

/*
 * Renamed from net.lB
 */
public class lb_1 {
    private aP2[] a;
    private int b;

    public int[] b() {
        a0D.r();
        int[] nArray = new int[this.a.length];
        int n = 0;
        if (n < nArray.length) {
            nArray[n] = this.a[n].a();
            ++n;
        }
        return nArray;
    }

    public boolean a(int n, int n2) {
        a0D.k();
        aP2[] aP2Array = this.a;
        int n3 = aP2Array.length;
        int n4 = 0;
        if (n4 < n3) {
            aP2 aP22 = aP2Array[n4];
            if (aP22.a(n, n2)) {
                return true;
            }
            ++n4;
        }
        return false;
    }

    public lb_1(int n, aP2[] aP2Array) {
        this.b = n;
        this.a = aP2Array;
    }

    public int a() {
        return this.b;
    }
}

