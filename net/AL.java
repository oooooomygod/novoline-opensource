/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.AW;
import net.af_0;

public class AL
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
                int n9 = nArray[j + (i + 1) * n7];
                int n10 = nArray[j + 2 + (i + 1) * n7];
                int n11 = nArray[j + 1 + i * n7];
                int n12 = nArray[j + 1 + (i + 2) * n7];
                int n13 = nArray[j + 1 + (i + 1) * n7];
                if (n9 == n10 && n11 == n12) {
                    this.a((long)(j + n), (long)(i + n2));
                    n13 = this.a(2) == 0 ? n9 : n11;
                } else {
                    if (n9 == n10) {
                        n13 = n9;
                    }
                    if (n11 == n12) {
                        n13 = n11;
                    }
                }
                nArray2[j + i * n3] = n13;
            }
        }
        return nArray2;
    }

    public AL(long l4, AW aW10) {
        super(l4);
        this.d = aW10;
    }
}

