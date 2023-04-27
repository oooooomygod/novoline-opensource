/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.AW;
import net.af_0;

/*
 * Renamed from net.Ao
 */
public class ao_0
extends AW {
    @Override
    public int[] b(int n, int n2, int n3, int n4) {
        int[] nArray = this.d.b(n, n2, n3, n4);
        int[] nArray2 = af_0.c(n3 * n4);
        for (int i = 0; i < n4; ++i) {
            for (int j = 0; j < n3; ++j) {
                this.a((long)(j + n), (long)(i + n2));
                nArray2[j + i * n3] = nArray[j + i * n3] > 0 ? this.a(299999) + 2 : 0;
            }
        }
        return nArray2;
    }

    public ao_0(long l4, AW aW10) {
        super(l4);
        this.d = aW10;
    }
}

