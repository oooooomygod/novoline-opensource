/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.aF7;
import net.aL0;

/*
 * Renamed from net.aQs
 */
public class aqs_0 {
    private byte[] a;

    private boolean a(int n) {
        return (n & 1) == 0;
    }

    private int c(int n) {
        return n >> 1;
    }

    public void a(int n, int n2) {
        int n3 = this.c(n);
        this.a[n3] = this.a(n) ? (byte)(this.a[n3] & 0xF0 | n2 & 0xF) : (byte)(this.a[n3] & 0xF | (n2 & 0xF) << 4);
    }

    public byte[] a() {
        return this.a;
    }

    private int b(int n, int n2, int n3) {
        return n2 << 8 | n3 << 4 | n;
    }

    public aqs_0(byte[] byArray) {
        this.a = byArray;
        if (byArray.length != 2048) {
            throw new IllegalArgumentException(aL0.c(aL0.a(new StringBuilder(), aF7.a), byArray.length).toString());
        }
    }

    public aqs_0() {
        this.a = new byte[2048];
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    public int b(int n) {
        int n2 = this.c(n);
        return this.a(n) ? this.a[n2] & 0xF : this.a[n2] >> 4 & 0xF;
    }

    public void a(int n, int n2, int n3, int n4) {
        this.a(this.b(n, n2, n3), n4);
    }

    public int a(int n, int n2, int n3) {
        return this.b(this.b(n, n2, n3));
    }
}

