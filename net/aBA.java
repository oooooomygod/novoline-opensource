/*
 * Decompiled with CFR 0.152.
 */
package net;

public class aBA {
    public byte[] b;
    private int c;
    private int a;

    public aBA(byte[] byArray, int n) {
        this.b = byArray;
        this.c = n;
        this.a = n + 4;
    }

    public int a(int n, int n2, int n3) {
        int n4 = n << this.a | n3 << this.c | n2;
        int n5 = n4 >> 1;
        int cfr_ignored_0 = n4 & 1;
        return this.b[n5] & 0xF;
    }
}

