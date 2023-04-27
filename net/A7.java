/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.AW;
import net.af_0;
import net.awr_2;

public class A7
extends AW {
    private awr_2 e;

    private int[] a(int n, int n2, int n3, int n4) {
        int[] nArray = this.d.b(n, n2, n3, n4);
        int[] nArray2 = af_0.c(n3 * n4);
        for (int i = 0; i < n4; ++i) {
            for (int j = 0; j < n3; ++j) {
                this.a((long)(j + n), (long)(i + n2));
                int n5 = nArray[j + i * n3];
                if (this.a(13) == 0) {
                    n5 |= 1 + this.a(15) << 8 & 0xF00;
                }
                nArray2[j + i * n3] = n5;
            }
        }
        return nArray2;
    }

    private int[] c(int n, int n2, int n3, int n4) {
        int n5 = n - 1;
        int n6 = n2 - 1;
        int n7 = 1 + n3 + 1;
        int n8 = 1 + n4 + 1;
        int[] nArray = this.d.b(n5, n6, n7, n8);
        int[] nArray2 = af_0.c(n3 * n4);
        for (int i = 0; i < n4; ++i) {
            for (int j = 0; j < n3; ++j) {
                this.a((long)(j + n), (long)(i + n2));
                int n9 = nArray[j + 1 + (i + 1) * n7];
                if (n9 == 1) {
                    int n10 = nArray[j + 1 + (i + 1 - 1) * n7];
                    int n11 = nArray[j + 1 + 1 + (i + 1) * n7];
                    int n12 = nArray[j + 1 - 1 + (i + 1) * n7];
                    int n13 = nArray[j + 1 + (i + 1 + 1) * n7];
                    boolean bl = n10 == 3 || n11 == 3 || n12 == 3 || n13 == 3;
                    boolean bl2 = n10 == 4 || n11 == 4 || n12 == 4 || n13 == 4;
                    n9 = 2;
                }
                nArray2[j + i * n3] = n9;
            }
        }
        return nArray2;
    }

    @Override
    public int[] b(int n, int n2, int n3, int n4) {
        switch (this.e) {
            default: {
                return this.c(n, n2, n3, n4);
            }
            case HEAT_ICE: {
                return this.d(n, n2, n3, n4);
            }
            case SPECIAL: 
        }
        return this.a(n, n2, n3, n4);
    }

    public A7(long l4, AW aW10, awr_2 awr_22) {
        super(l4);
        this.d = aW10;
        this.e = awr_22;
    }

    private int[] d(int n, int n2, int n3, int n4) {
        int n5 = n - 1;
        int n6 = n2 - 1;
        int n7 = 1 + n3 + 1;
        int n8 = 1 + n4 + 1;
        int[] nArray = this.d.b(n5, n6, n7, n8);
        int[] nArray2 = af_0.c(n3 * n4);
        for (int i = 0; i < n4; ++i) {
            for (int j = 0; j < n3; ++j) {
                int n9 = nArray[j + 1 + (i + 1) * n7];
                if (n9 == 4) {
                    int n10 = nArray[j + 1 + (i + 1 - 1) * n7];
                    int n11 = nArray[j + 1 + 1 + (i + 1) * n7];
                    int n12 = nArray[j + 1 - 1 + (i + 1) * n7];
                    int n13 = nArray[j + 1 + (i + 1 + 1) * n7];
                    boolean bl = n10 == 2 || n11 == 2 || n12 == 2 || n13 == 2;
                    boolean bl2 = n10 == 1 || n11 == 1 || n12 == 1 || n13 == 1;
                    n9 = 3;
                }
                nArray2[j + i * n3] = n9;
            }
        }
        return nArray2;
    }
}

