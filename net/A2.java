/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.AW;
import net.IV;
import net.af_0;
import net.hw_0;
import net.il_0;
import net.ir_0;

public class A2
extends AW {
    private boolean c(int n) {
        return hw_0.a(n) instanceof ir_0;
    }

    public A2(long l4, AW aW10) {
        super(l4);
        this.d = aW10;
    }

    private void a(int[] nArray, int[] nArray2, int n, int n2, int n3, int n4, int n5) {
        if (A2.b(n4)) {
            nArray2[n + n2 * n3] = n4;
        } else {
            int n6 = nArray[n + 1 + (n2 + 1 - 1) * (n3 + 2)];
            int n7 = nArray[n + 1 + 1 + (n2 + 1) * (n3 + 2)];
            int n8 = nArray[n + 1 - 1 + (n2 + 1) * (n3 + 2)];
            int n9 = nArray[n + 1 + (n2 + 1 + 1) * (n3 + 2)];
            nArray2[n + n2 * n3] = !A2.b(n6) && !A2.b(n7) && !A2.b(n8) && !A2.b(n9) ? n4 : n5;
        }
    }

    private boolean a(int n) {
        return hw_0.a(n) != null && hw_0.b(hw_0.a(n)) == IV.class || n == il_0.D.s || n == il_0.at.s || n == il_0.al.s || n == il_0.H.s || n == il_0.ag.s || A2.b(n);
    }

    @Override
    public int[] b(int n, int n2, int n3, int n4) {
        int[] nArray = this.d.b(n - 1, n2 - 1, n3 + 2, n4 + 2);
        int[] nArray2 = af_0.c(n3 * n4);
        for (int i = 0; i < n4; ++i) {
            for (int j = 0; j < n3; ++j) {
                int n5;
                int n6;
                int n7;
                int n8;
                this.a((long)(j + n), (long)(i + n2));
                int n9 = nArray[j + 1 + (i + 1) * (n3 + 2)];
                il_0 il_02 = hw_0.a(n9);
                if (n9 == il_0.y.s) {
                    n8 = nArray[j + 1 + (i + 1 - 1) * (n3 + 2)];
                    n7 = nArray[j + 1 + 1 + (i + 1) * (n3 + 2)];
                    n6 = nArray[j + 1 - 1 + (i + 1) * (n3 + 2)];
                    n5 = nArray[j + 1 + (i + 1 + 1) * (n3 + 2)];
                    if (n8 != il_0.u.s && n7 != il_0.u.s && n6 != il_0.u.s && n5 != il_0.u.s) {
                        nArray2[j + i * n3] = n9;
                        continue;
                    }
                    nArray2[j + i * n3] = il_0.O.s;
                    continue;
                }
                if (hw_0.b(il_02) == IV.class) {
                    n8 = nArray[j + 1 + (i + 1 - 1) * (n3 + 2)];
                    n7 = nArray[j + 1 + 1 + (i + 1) * (n3 + 2)];
                    n6 = nArray[j + 1 - 1 + (i + 1) * (n3 + 2)];
                    n5 = nArray[j + 1 + (i + 1 + 1) * (n3 + 2)];
                    if (this.a(n8) && this.a(n7) && this.a(n6) && this.a(n5)) {
                        if (!(A2.b(n8) || A2.b(n7) || A2.b(n6) || A2.b(n5))) {
                            nArray2[j + i * n3] = n9;
                            continue;
                        }
                        nArray2[j + i * n3] = il_0.aD.s;
                        continue;
                    }
                    nArray2[j + i * n3] = il_0.D.s;
                    continue;
                }
                if (n9 != il_0.L.s && n9 != il_0.Z.s && n9 != il_0.K.s) {
                    if (hw_0.e(il_02)) {
                        this.a(nArray, nArray2, j, i, n3, n9, il_0.k.s);
                        continue;
                    }
                    if (n9 != il_0.av.s && n9 != il_0.aE.s) {
                        if (n9 != il_0.u.s && n9 != il_0.r.s && n9 != il_0.am.s && n9 != il_0.aw.s) {
                            n8 = nArray[j + 1 + (i + 1 - 1) * (n3 + 2)];
                            n7 = nArray[j + 1 + 1 + (i + 1) * (n3 + 2)];
                            n6 = nArray[j + 1 - 1 + (i + 1) * (n3 + 2)];
                            n5 = nArray[j + 1 + (i + 1 + 1) * (n3 + 2)];
                            if (!(A2.b(n8) || A2.b(n7) || A2.b(n6) || A2.b(n5))) {
                                nArray2[j + i * n3] = n9;
                                continue;
                            }
                            nArray2[j + i * n3] = il_0.aD.s;
                            continue;
                        }
                        nArray2[j + i * n3] = n9;
                        continue;
                    }
                    n8 = nArray[j + 1 + (i + 1 - 1) * (n3 + 2)];
                    n7 = nArray[j + 1 + 1 + (i + 1) * (n3 + 2)];
                    n6 = nArray[j + 1 - 1 + (i + 1) * (n3 + 2)];
                    n5 = nArray[j + 1 + (i + 1 + 1) * (n3 + 2)];
                    if (!(A2.b(n8) || A2.b(n7) || A2.b(n6) || A2.b(n5))) {
                        if (this.c(n8) && this.c(n7) && this.c(n6) && this.c(n5)) {
                            nArray2[j + i * n3] = n9;
                            continue;
                        }
                        nArray2[j + i * n3] = il_0.V.s;
                        continue;
                    }
                    nArray2[j + i * n3] = n9;
                    continue;
                }
                this.a(nArray, nArray2, j, i, n3, n9, il_0.af.s);
            }
        }
        return nArray2;
    }
}

