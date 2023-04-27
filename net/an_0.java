/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.AW;
import net.af_0;
import net.il_0;

/*
 * Renamed from net.An
 */
public class an_0
extends AW {
    @Override
    public int[] b(int n, int n2, int n3, int n4) {
        int n5 = n - 1;
        int n6 = n2 - 1;
        int n7 = n3 + 2;
        int n8 = n4 + 2;
        int[] nArray = this.d.b(n5, n6, n7, n8);
        int[] nArray2 = af_0.c(n3 * n4);
        for (int i = 0; i < n4; ++i) {
            for (int j = 0; j < n3; ++j) {
                int n9 = this.b(nArray[j + (i + 1) * n7]);
                int n10 = this.b(nArray[j + 2 + (i + 1) * n7]);
                int n11 = this.b(nArray[j + 1 + i * n7]);
                int n12 = this.b(nArray[j + 1 + (i + 2) * n7]);
                int n13 = this.b(nArray[j + 1 + (i + 1) * n7]);
                nArray2[j + i * n3] = n13 == n9 && n13 == n11 && n13 == n10 && n13 == n12 ? -1 : il_0.am.s;
            }
        }
        return nArray2;
    }

    private int b(int n) {
        return n >= 2 ? 2 + (n & 1) : n;
    }

    public an_0(long l4, AW aW10) {
        super(l4);
        this.d = aW10;
    }
}

