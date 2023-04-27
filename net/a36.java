/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.aO5;
import net.aP2;
import net.ch_2;

public class a36 {
    private int c = 0;
    private int f = 18;
    private int d = 0;
    private int i = 128;
    private int h = 18;
    private int b = 0;
    private byte[] g = null;
    private int e = 0;
    private byte[][][] a = null;

    public void a(byte by) {
        try {
            this.g[this.b] = by;
        }
        catch (Exception exception) {
            ch_2.a(exception);
        }
    }

    public a36(int n, int n2, int n3) {
        this.f = n;
        this.i = n2;
        this.h = n3;
        this.a = new byte[n][n2][n3];
        this.a();
    }

    private static ArrayIndexOutOfBoundsException a(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
        return arrayIndexOutOfBoundsException;
    }

    public void a() {
        aP2.b();
        int n = 0;
        if (n < this.f) {
            byte[][] byArray = this.a[n];
            int n2 = 0;
            if (n2 < this.i) {
                byte[] byArray2 = byArray[n2];
                int n3 = 0;
                if (n3 < this.h) {
                    byArray2[n3] = -1;
                    ++n3;
                }
                ++n2;
            }
            ++n;
        }
    }

    public byte a(int n, int n2, int n3) {
        try {
            this.g = this.a[n - this.e][n2 - this.d];
            this.b = n3 - this.c;
            return this.g[this.b];
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            aO5.a(arrayIndexOutOfBoundsException);
            return -1;
        }
    }

    public void b(int n, int n2, int n3) {
        this.e = n;
        this.d = n2;
        this.c = n3;
        this.a();
    }
}

