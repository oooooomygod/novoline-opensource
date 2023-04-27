/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.AW;
import net.af_0;

public class AI
extends AW {
    @Override
    public int[] b(int n, int n2, int n3, int n4) {
        int[] nArray = af_0.c(n3 * n4);
        for (int i = 0; i < n4; ++i) {
            for (int j = 0; j < n3; ++j) {
                this.a((long)(n + j), (long)(n2 + i));
                nArray[j + i * n3] = this.a(10) == 0 ? 1 : 0;
            }
        }
        if (n > -n3 && n2 > -n4) {
            nArray[-n + -n2 * n3] = 1;
        }
        return nArray;
    }

    public AI(long l4) {
        super(l4);
    }
}

