/*
 * Decompiled with CFR 0.152.
 */
package net;

/*
 * Renamed from net.tc
 */
public class tc_2 {
    private byte c;
    private byte a;
    private byte d;
    private byte b;

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof tc_2)) {
            return false;
        }
        tc_2 tc_22 = (tc_2)object;
        return this.a == tc_22.a && this.b == tc_22.b && this.c == tc_22.c && this.d == tc_22.d;
    }

    public byte c() {
        return this.d;
    }

    public tc_2(byte by, byte by2, byte by3, byte by4) {
        this.a = by;
        this.c = by2;
        this.d = by3;
        this.b = by4;
    }

    public int hashCode() {
        int n = this.a;
        n = 31 * n + this.c;
        n = 31 * n + this.d;
        n = 31 * n + this.b;
        return n;
    }

    public byte b() {
        return this.a;
    }

    public byte d() {
        return this.c;
    }

    public tc_2(tc_2 tc_22) {
        this.a = tc_22.a;
        this.c = tc_22.c;
        this.d = tc_22.d;
        this.b = tc_22.b;
    }

    public byte a() {
        return this.b;
    }
}

