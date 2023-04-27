/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.aO5;
import net.aP2;
import net.ch_2;

/*
 * Renamed from net.kw
 */
public class kw_1 {
    private int b = 0;
    private int g = 18;
    private int[] h = null;
    private int[][][] a = null;
    private int e = 18;
    private int f = 0;
    private int c = 0;
    private int d = 0;
    private int i = 128;

    public void b(int n, int n2, int n3) {
        this.c = n;
        this.f = n2;
        this.b = n3;
        this.a();
    }

    public int a(int n, int n2, int n3) {
        try {
            this.h = this.a[n - this.c][n2 - this.f];
            this.d = n3 - this.b;
            return this.h[this.d];
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            aO5.a(arrayIndexOutOfBoundsException);
            return -1;
        }
    }

    private static ArrayIndexOutOfBoundsException a(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
        return arrayIndexOutOfBoundsException;
    }

    public kw_1(int n, int n2, int n3) {
        this.g = n;
        this.i = n2;
        this.e = n3;
        this.a = new int[n][n2][n3];
        this.a();
    }

    public void a() {
        aP2.b();
        int n = 0;
        if (n < this.g) {
            int[][] nArray = this.a[n];
            int n2 = 0;
            if (n2 < this.i) {
                int[] nArray2 = nArray[n2];
                int n3 = 0;
                if (n3 < this.e) {
                    nArray2[n3] = -1;
                    ++n3;
                }
                ++n2;
            }
            ++n;
        }
    }

    public void a(int n) {
        try {
            this.h[this.d] = n;
        }
        catch (Exception exception) {
            ch_2.a(exception);
        }
    }
}

