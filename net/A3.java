/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.AW;
import net.af_0;
import net.ann_0;
import net.hw_0;
import net.il_0;

public class A3
extends AW {
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
                if (this.a(nArray, nArray2, j, i, n3, n9, il_0.L.s, il_0.K.s) || this.b(nArray, nArray2, j, i, n3, n9, il_0.aE.s, il_0.av.s) || this.b(nArray, nArray2, j, i, n3, n9, il_0.ap.s, il_0.av.s) || this.b(nArray, nArray2, j, i, n3, n9, il_0.i.s, il_0.ag.s)) continue;
                if (n9 == il_0.V.s) {
                    n8 = nArray[j + 1 + (i + 1 - 1) * (n3 + 2)];
                    n7 = nArray[j + 1 + 1 + (i + 1) * (n3 + 2)];
                    n6 = nArray[j + 1 - 1 + (i + 1) * (n3 + 2)];
                    n5 = nArray[j + 1 + (i + 1 + 1) * (n3 + 2)];
                    if (n8 != il_0.n.s && n7 != il_0.n.s && n6 != il_0.n.s && n5 != il_0.n.s) {
                        nArray2[j + i * n3] = n9;
                        continue;
                    }
                    nArray2[j + i * n3] = il_0.Z.s;
                    continue;
                }
                if (n9 == il_0.aw.s) {
                    n8 = nArray[j + 1 + (i + 1 - 1) * (n3 + 2)];
                    n7 = nArray[j + 1 + 1 + (i + 1) * (n3 + 2)];
                    n6 = nArray[j + 1 - 1 + (i + 1) * (n3 + 2)];
                    n5 = nArray[j + 1 + (i + 1 + 1) * (n3 + 2)];
                    if (n8 != il_0.V.s && n7 != il_0.V.s && n6 != il_0.V.s && n5 != il_0.V.s && n8 != il_0.N.s && n7 != il_0.N.s && n6 != il_0.N.s && n5 != il_0.N.s && n8 != il_0.n.s && n7 != il_0.n.s && n6 != il_0.n.s && n5 != il_0.n.s) {
                        if (n8 != il_0.at.s && n5 != il_0.at.s && n7 != il_0.at.s && n6 != il_0.at.s) {
                            nArray2[j + i * n3] = n9;
                            continue;
                        }
                        nArray2[j + i * n3] = il_0.D.s;
                        continue;
                    }
                    nArray2[j + i * n3] = il_0.G.s;
                    continue;
                }
                nArray2[j + i * n3] = n9;
            }
        }
        return nArray2;
    }

    public A3(long l4, AW aW10) {
        super(l4);
        this.d = aW10;
    }

    private boolean a(int[] nArray, int[] nArray2, int n, int n2, int n3, int n4, int n5, int n6) {
        if (!A3.a(n4, n5)) {
            return false;
        }
        int n7 = nArray[n + 1 + (n2 + 1 - 1) * (n3 + 2)];
        int n8 = nArray[n + 1 + 1 + (n2 + 1) * (n3 + 2)];
        int n9 = nArray[n + 1 - 1 + (n2 + 1) * (n3 + 2)];
        int n10 = nArray[n + 1 + (n2 + 1 + 1) * (n3 + 2)];
        nArray2[n + n2 * n3] = this.b(n7, n5) && this.b(n8, n5) && this.b(n9, n5) && this.b(n10, n5) ? n4 : n6;
        return true;
    }

    private boolean b(int n, int n2) {
        ann_0 ann_02;
        if (A3.a(n, n2)) {
            return true;
        }
        il_0 il_02 = hw_0.a(n);
        il_0 il_03 = hw_0.a(n2);
        ann_0 ann_03 = hw_0.g(il_02);
        return ann_03 == (ann_02 = hw_0.g(il_03)) || ann_03 == ann_0.MEDIUM || ann_02 == ann_0.MEDIUM;
    }

    private boolean b(int[] nArray, int[] nArray2, int n, int n2, int n3, int n4, int n5, int n6) {
        if (n4 != n5) {
            return false;
        }
        int n7 = nArray[n + 1 + (n2 + 1 - 1) * (n3 + 2)];
        int n8 = nArray[n + 1 + 1 + (n2 + 1) * (n3 + 2)];
        int n9 = nArray[n + 1 - 1 + (n2 + 1) * (n3 + 2)];
        int n10 = nArray[n + 1 + (n2 + 1 + 1) * (n3 + 2)];
        nArray2[n + n2 * n3] = A3.a(n7, n5) && A3.a(n8, n5) && A3.a(n9, n5) && A3.a(n10, n5) ? n4 : n6;
        return true;
    }
}

