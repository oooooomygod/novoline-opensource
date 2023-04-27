/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.AW;
import net.af_0;
import net.il_0;

public class AV
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
                int cfr_ignored_0 = nArray[j + i * n7];
                int cfr_ignored_1 = nArray[j + 2 + i * n7];
                int cfr_ignored_2 = nArray[j + (i + 2) * n7];
                int cfr_ignored_3 = nArray[j + 2 + (i + 2) * n7];
                int n9 = nArray[j + 1 + (i + 1) * n7];
                this.a((long)(j + n), (long)(i + n2));
                nArray2[j + i * n3] = this.a(100) == 0 ? il_0.y.s : n9;
            }
        }
        return nArray2;
    }

    public AV(long l4, AW aW10) {
        super(l4);
        this.d = aW10;
    }
}

