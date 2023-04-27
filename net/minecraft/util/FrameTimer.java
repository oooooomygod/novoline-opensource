/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.util;

public class FrameTimer {
    private long[] c = new long[240];
    private int a;
    private int d;
    private int b;

    public int a(int n) {
        return n % 240;
    }

    public void a(long l4) {
        this.c[this.d] = l4;
        ++this.d;
        if (this.d == 240) {
            this.d = 0;
        }
        if (this.b < 240) {
            this.a = 0;
            ++this.b;
        } else {
            this.a = this.a(this.d + 1);
        }
    }

    public int a() {
        return this.d;
    }

    public long[] b() {
        return this.c;
    }

    public int c() {
        return this.a;
    }

    public int a(long l4, int n) {
        double d = (double)l4 / 1.6666666E7;
        return (int)(d * (double)n);
    }
}

