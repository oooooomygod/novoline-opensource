/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.AW;
import net.af_0;

/*
 * Renamed from net.Ar
 */
public class ar_0
extends AW {
    public ar_0(long l4, AW aW10) {
        super(l4);
        this.d = aW10;
    }

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
                int cfr_ignored_0 = nArray[j + 1 + (i + 1) * n7];
                this.a((long)(j + n), (long)(i + n2));
                nArray2[j + i * n3] = 0;
            }
        }
        return nArray2;
    }
}

