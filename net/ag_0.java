/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.AW;
import net.af_0;
import net.il_0;

/*
 * Renamed from net.Ag
 */
public class ag_0
extends AW {
    @Override
    public int[] b(int n, int n2, int n3, int n4) {
        int[] nArray = this.d.b(n - 1, n2 - 1, n3 + 2, n4 + 2);
        int[] nArray2 = af_0.c(n3 * n4);
        for (int i = 0; i < n4; ++i) {
            for (int j = 0; j < n3; ++j) {
                this.a((long)(j + n), (long)(i + n2));
                int n5 = nArray[j + 1 + (i + 1) * (n3 + 2)];
                if (this.a(57) == 0) {
                    if (n5 == il_0.G.s) {
                        nArray2[j + i * n3] = il_0.G.s + 128;
                        continue;
                    }
                    nArray2[j + i * n3] = n5;
                    continue;
                }
                nArray2[j + i * n3] = n5;
            }
        }
        return nArray2;
    }

    public ag_0(long l4, AW aW10) {
        super(l4);
        this.d = aW10;
    }
}

