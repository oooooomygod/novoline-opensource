/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.SystemInvoker;
import net.AW;
import net.af_0;

public class A4
extends AW {
    public A4(long l4, AW aW10) {
        super(l4);
        this.d = aW10;
    }

    public static AW a(long l4, AW aW10, int n) {
        AW aW11 = aW10;
        for (int i = 0; i < n; ++i) {
            aW11 = new A4(l4 + (long)i, aW11);
        }
        return aW11;
    }

    @Override
    public int[] b(int n, int n2, int n3, int n4) {
        int n5;
        int n6 = n >> 1;
        int n7 = n2 >> 1;
        int n8 = (n3 >> 1) + 2;
        int n9 = (n4 >> 1) + 2;
        int[] nArray = this.d.b(n6, n7, n8, n9);
        int n10 = n8 - 1 << 1;
        int n11 = n9 - 1 << 1;
        int[] nArray2 = af_0.c(n10 * n11);
        for (int i = 0; i < n9 - 1; ++i) {
            int n12;
            n5 = (i << 1) * n10;
            int n13 = nArray[n12 + i * n8];
            int n14 = nArray[n12 + (i + 1) * n8];
            for (n12 = 0; n12 < n8 - 1; ++n12) {
                this.a((long)(n12 + n6 << 1), (long)(i + n7 << 1));
                int n15 = nArray[n12 + 1 + i * n8];
                int n16 = nArray[n12 + 1 + (i + 1) * n8];
                nArray2[n5] = n13;
                nArray2[n5++ + n10] = this.a(n13, n14);
                nArray2[n5] = this.a(n13, n15);
                nArray2[n5++ + n10] = this.a(n13, n15, n14, n16);
                n13 = n15;
                n14 = n16;
            }
        }
        int[] nArray3 = af_0.c(n3 * n4);
        for (n5 = 0; n5 < n4; ++n5) {
            SystemInvoker.a(nArray2, (n5 + (n2 & 1)) * n10 + (n & 1), nArray3, n5 * n3, n3);
        }
        return nArray3;
    }
}

