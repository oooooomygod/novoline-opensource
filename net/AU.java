/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.SystemInvoker;
import net.AW;
import net.af_0;

public class AU
extends AW {
    @Override
    public int[] b(int n, int n2, int n3, int n4) {
        int n5;
        int n6 = (n -= 2) >> 2;
        int n7 = (n2 -= 2) >> 2;
        int n8 = (n3 >> 2) + 2;
        int n9 = (n4 >> 2) + 2;
        int[] nArray = this.d.b(n6, n7, n8, n9);
        int n10 = n8 - 1 << 2;
        int n11 = n9 - 1 << 2;
        int[] nArray2 = af_0.c(n10 * n11);
        for (int i = 0; i < n9 - 1; ++i) {
            n5 = 0;
            int n12 = nArray[n5 + i * n8];
            int n13 = nArray[n5 + (i + 1) * n8];
            if (n5 >= n8 - 1) continue;
            this.a((long)(n5 + n6 << 2), (long)(i + n7 << 2));
            double d = ((double)this.a(1024) / 1024.0 - 0.5) * 3.6;
            double d2 = ((double)this.a(1024) / 1024.0 - 0.5) * 3.6;
            this.a((long)(n5 + n6 + 1 << 2), (long)(i + n7 << 2));
            double d3 = ((double)this.a(1024) / 1024.0 - 0.5) * 3.6 + 4.0;
            double d4 = ((double)this.a(1024) / 1024.0 - 0.5) * 3.6;
            this.a((long)(n5 + n6 << 2), (long)(i + n7 + 1 << 2));
            double d5 = ((double)this.a(1024) / 1024.0 - 0.5) * 3.6;
            double d6 = ((double)this.a(1024) / 1024.0 - 0.5) * 3.6 + 4.0;
            this.a((long)(n5 + n6 + 1 << 2), (long)(i + n7 + 1 << 2));
            double d7 = ((double)this.a(1024) / 1024.0 - 0.5) * 3.6 + 4.0;
            double d8 = ((double)this.a(1024) / 1024.0 - 0.5) * 3.6 + 4.0;
            int n14 = nArray[n5 + 1 + i * n8] & 0xFF;
            int n15 = nArray[n5 + 1 + (i + 1) * n8] & 0xFF;
            int n16 = 0;
            int n17 = ((i << 2) + n16) * n10 + (n5 << 2);
            int n18 = 0;
            while (true) {
                double d9 = ((double)n16 - d2) * ((double)n16 - d2) + ((double)n18 - d) * ((double)n18 - d);
                double d10 = ((double)n16 - d4) * ((double)n16 - d4) + ((double)n18 - d3) * ((double)n18 - d3);
                double d11 = ((double)n16 - d6) * ((double)n16 - d6) + ((double)n18 - d5) * ((double)n18 - d5);
                double d12 = ((double)n16 - d8) * ((double)n16 - d8) + ((double)n18 - d7) * ((double)n18 - d7);
                nArray2[n17++] = d9 < d10 && d9 < d11 && d9 < d12 ? n12 : (d10 < d9 && d10 < d11 && d10 < d12 ? n14 : (d11 < d9 && d11 < d10 && d11 < d12 ? n13 : n15));
                ++n18;
            }
        }
        int[] nArray3 = af_0.c(n3 * n4);
        for (n5 = 0; n5 < n4; ++n5) {
            SystemInvoker.a(nArray2, (n5 + (n2 & 3)) * n10 + (n & 3), nArray3, n5 * n3, n3);
        }
        return nArray3;
    }

    public AU(long l4, AW aW10) {
        super(l4);
        this.d = aW10;
    }
}

